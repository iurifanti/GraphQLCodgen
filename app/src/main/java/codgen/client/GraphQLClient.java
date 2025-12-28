/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codgen.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class GraphQLClient {

    private static final String DEFAULT_PROJECTION = "{ __typename }";

    private final String endpoint;
    private final String authorizationHeader; // "Basic ...." oppure null
    private final ObjectMapper mapper = new ObjectMapper();

    public GraphQLClient(String endpoint, String username, String password) {
        this.endpoint = endpoint;
        this.authorizationHeader = (username != null && password != null)
                ? buildBasicAuth(username, password)
                : null;
        SslBypass.disableSslVerificationIfNeeded();
    }

    public GraphQLClient(String endpoint) {
        this(endpoint, null, null);
    }

    public <T> T execute(GraphQLOperationRequest request,
            GraphQLResponseProjection projection,
            Class<T> responseClass) throws IOException {

        String graphQL = buildGraphQLDocument(request, projection);

        Map<String, Object> payload = new HashMap<>();
        payload.put("query", graphQL);
        String payloadJson = mapper.writeValueAsString(payload);

        String responseJson = postJson(payloadJson);

        JsonNode root = mapper.readTree(responseJson);
        List<GraphQLErrorDTO> errors = parseErrors(root);
        if (!errors.isEmpty()) {
            throw new GraphQLRequestException(errors);
        }

        return mapper.readValue(responseJson, responseClass);
    }

    private String postJson(String jsonBody) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(endpoint).openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");
        if (authorizationHeader != null) {
            conn.setRequestProperty("Authorization", authorizationHeader);
        }
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(jsonBody.getBytes(StandardCharsets.UTF_8));
        }

        InputStream is = conn.getResponseCode() < 400 ? conn.getInputStream() : conn.getErrorStream();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }
    }

    private List<GraphQLErrorDTO> parseErrors(JsonNode root) throws IOException {
        JsonNode errorsNode = root.path("errors");
        if (!errorsNode.isArray() || errorsNode.size() == 0) {
            return Collections.emptyList();
        }

        List<GraphQLErrorDTO> out = new ArrayList<GraphQLErrorDTO>();
        for (JsonNode e : errorsNode) {
            out.add(mapper.treeToValue(e, GraphQLErrorDTO.class));
        }
        return out;
    }

    private static String buildBasicAuth(String user, String pass) {
        String raw = user + ":" + pass;
        String b64 = Base64.getEncoder().encodeToString(raw.getBytes(StandardCharsets.UTF_8));
        return "Basic " + b64;
    }

    /**
     * Crea un documento GraphQL utilizzando i serializer generati
     * (GraphQLRequestSerializer) per rispettare le regole di quoting di mappe,
     * enum e liste.
     */
    private String buildGraphQLDocument(GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        StringBuilder sb = new StringBuilder();

        String opType = Optional.ofNullable(request.getOperationType())
                .map(Enum::name)
                .map(String::toLowerCase)
                .orElse("query");
        sb.append(opType).append(" { ");

        String opName = request.getOperationName();
        String alias = Optional.ofNullable(request.getAlias())
                .map(String::trim)
                .filter(a -> !a.isEmpty())
                .filter(a -> !a.equals(opName))
                .orElse(null);

        if (alias != null) {
            sb.append(alias).append(": ");
        }

        sb.append(opName);

        Map<String, Object> input = request.getInput();
        if (input != null && !input.isEmpty()) {
            String serializedInput = serializeInputArguments(input);
            if (!serializedInput.isEmpty()) {
                sb.append("(").append(serializedInput).append(")");
            }
        }

        String proj = normalizeProjection(projection);
        sb.append(" ").append(proj).append(" }");

        return sb.toString();
    }

    private String serializeInputArguments(Map<String, Object> input) {
        return input.entrySet().stream()
                .map(entry -> {
                    Object prepared = prepareValue(entry.getValue());
                    return prepared == null
                            ? null
                            : entry.getKey() + ":" + GraphQLRequestSerializer.getEntry(prepared);
                })
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
    }

    private Object prepareValue(Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof String || value instanceof Number || value instanceof Boolean || value instanceof Enum<?>) {
            return value;
        }
        if (value instanceof Map<?, ?>) {
            return prepareMap((Map<?, ?>) value);
        }
        if (value instanceof Iterable<?>) {
            return prepareIterable((Iterable<?>) value);
        }
        if (value.getClass().isArray()) {
            return prepareArray(value);
        }

        return prepareBean(value);
    }

    private Object prepareArray(Object array) {
        int length = java.lang.reflect.Array.getLength(array);
        List<Object> converted = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            Object element = java.lang.reflect.Array.get(array, i);
            converted.add(prepareValue(element));
        }
        return converted;
    }

    private Iterable<Object> prepareIterable(Iterable<?> iterable) {
        List<Object> converted = new ArrayList<>();
        for (Object element : iterable) {
            converted.add(prepareValue(element));
        }
        return converted;
    }

    private Map<String, Object> prepareMap(Map<?, ?> map) {
        Map<String, Object> converted = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String key = String.valueOf(entry.getKey());
            Object prepared = prepareValue(entry.getValue());
            if (prepared != null) {
                converted.put(key, prepared);
            }
        }
        return converted;
    }

    private Map<String, Object> prepareBean(Object bean) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass(), Object.class);
            Map<String, Object> result = new LinkedHashMap<>();
            for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
                Method getter = descriptor.getReadMethod();
                if (getter == null) {
                    continue;
                }
                if (!getter.canAccess(bean)) {
                    getter.setAccessible(true);
                }
                Object propertyValue = getter.invoke(bean);
                Object prepared = prepareValue(propertyValue);
                if (prepared != null) {
                    result.put(descriptor.getName(), prepared);
                }
            }
            return result;
        } catch (Exception e) {
            throw new IllegalStateException("Unable to serialize bean: " + bean.getClass().getName(), e);
        }
    }

    private String normalizeProjection(GraphQLResponseProjection projection) {
        String proj = projection != null ? projection.toString() : DEFAULT_PROJECTION;
        if (proj == null || proj.trim().isEmpty()) {
            return DEFAULT_PROJECTION;
        }
        String trimmed = proj.trim();
        if (trimmed.startsWith("{")) {
            return trimmed;
        }
        return "{ " + trimmed + " }";
    }
}
