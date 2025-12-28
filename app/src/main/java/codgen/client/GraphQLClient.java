/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codgen.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class GraphQLClient {

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

        // 1) Costruisci query GraphQL SENZA chiavi quotate e SENZA enum quotati
        String graphQL = buildGraphQLDocument(request, projection);
        System.out.println("graphQL: " + graphQL);

        // 2) Payload standard
        Map<String, Object> payload = new HashMap<>();
        payload.put("query", graphQL);
        String payloadJson = mapper.writeValueAsString(payload);

        // 3) HTTP POST
        String responseJson = postJson(payloadJson);

        // 4) parse errors[] tipizzati
        JsonNode root = mapper.readTree(responseJson);
        List<GraphQLErrorDTO> errors = parseErrors(root);
        if (!errors.isEmpty()) {
            throw new GraphQLRequestException(errors);
        }

        // 5) deserializza TUTTA la risposta (data/errors) nella classe generata
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

        OutputStream os = conn.getOutputStream();
        os.write(jsonBody.getBytes(StandardCharsets.UTF_8));
        os.close();

        InputStream is = conn.getResponseCode() < 400 ? conn.getInputStream() : conn.getErrorStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
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
     * Crea un documento GraphQL: query { [alias:] OperationName(arg1:...,
     * arg2:...) <projection> }
     *
     * - Le chiavi delle mappe non vengono mai quotate - Gli enum (es.
     * _id___ASC) non vengono mai quotati
     */
    private String buildGraphQLDocument(GraphQLOperationRequest request, GraphQLResponseProjection projection) {
        StringBuilder sb = new StringBuilder();

        // OPERATION TYPE (di solito "query" per Paziente___getPage)
        String opType = request.getOperationType() != null ? request.getOperationType().name().toLowerCase() : "query";
        sb.append(opType).append(" { ");

        // alias opzionale
        String alias = request.getAlias();
        String opName = request.getOperationName();

        if (alias != null && alias.trim().length() > 0 && !alias.equals(opName)) {
            sb.append(alias).append(": ");
        }

        sb.append(opName);

        // args (input)
        Map<String, Object> input = request.getInput();
        if (input != null && !input.isEmpty()) {
            sb.append("(");
            boolean first = true;
            for (Map.Entry<String, Object> e : input.entrySet()) {
                // qui puoi decidere se saltare i null; io li lascio come "name:null"
                if (!first) {
                    sb.append(", ");
                }
                first = false;
                sb.append(e.getKey()).append(":").append(serializeValue(e.getValue()));
            }
            sb.append(")");
        }

        // projection: assicura che sia tra { ... }
        String proj = projection != null ? projection.toString() : "";
        proj = ensureBracedSelection(proj);
        sb.append(" ").append(proj).append(" }");

        return sb.toString();
    }

    private static String ensureBracedSelection(String s) {
        if (s == null) {
            return "{ __typename }";
        }
        String t = s.trim();
        if (t.startsWith("{")) {
            return t;
        }
        // se il runtime toString() ti restituisce solo "items { ... }" senza outer braces
        return "{ " + t + " }";
    }

    /**
     * Serializzazione GraphQL "corretta": - String: "..." - Number/Boolean: 123
     * / true - Enum: NAME (senza virgolette) - Map: {k:v,...} (k SENZA
     * virgolette) - Collection: [v1,v2] (enum senza virgolette) - POJO/DTO:
     * convertito a Map via Jackson e poi serializzato
     */
    private String serializeValue(Object v) {
        if (v == null) {
            return "null";
        }

        if (v instanceof String) {
            if (((String) v).contains("___")) {
                return (String) v;
            } else {
                return quoteGraphQLString((String) v);
            }
        }
        if (v instanceof Number || v instanceof Boolean) {
            return String.valueOf(v);
        }
        if (v instanceof Enum) {
            return ((Enum<?>) v).name(); // ✅ enum NON quotato (es. _id___ASC)
        }
        if (v instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> m = (Map<String, Object>) v;
            return serializeMap(m);
        }
        if (v instanceof Collection) {
            @SuppressWarnings("unchecked")
            Collection<Object> c = (Collection<Object>) v;
            return serializeCollection(c);
        }

        // DTO generati: li convertiamo in Map con Jackson e poi serializziamo
        @SuppressWarnings("unchecked")
        Map<String, Object> asMap = mapper.convertValue(v, Map.class);
        return serializeMap(asMap);
    }

    private String serializeMap(Map<String, Object> m) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;
        for (Map.Entry<String, Object> e : m.entrySet()) {
            if (!first) {
                sb.append(",");
            }
            first = false;
            sb.append(e.getKey()).append(":").append(serializeValue(e.getValue()));
        }
        sb.append("}");
        return sb.toString();
    }

    private String serializeCollection(Collection<Object> c) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean first = true;
        for (Object o : c) {
            if (!first) {
                sb.append(",");
            }
            first = false;
            sb.append(serializeValue(o));
        }
        sb.append("]");
        return sb.toString();
    }

    private static String quoteGraphQLString(String s) {
        // Escape minimale per GraphQL string (stile JSON)
        String esc = s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r");
        return "\"" + esc + "\"";
    }
}
