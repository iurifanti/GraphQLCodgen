package codgen.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class GraphQLClientTest {

    @Test
    void enumValuesRemainUnquotedInSerializedRequest() throws Exception {
        GraphQLClient client = new GraphQLClient("http://localhost/graphql");

        DummyOptions options = new DummyOptions(List.of(DummySort.ID_ASC));
        Map<String, Object> input = new HashMap<>();
        input.put("options", options);

        GraphQLOperationRequest request = new DummyOperationRequest(input);
        GraphQLResponseProjection projection = new GraphQLResponseProjection() {
            @Override
            public GraphQLResponseProjection deepCopy$() {
                return this;
            }

            @Override
            public String toString() {
                return "{ __typename }";
            }
        };

        Method method = GraphQLClient.class.getDeclaredMethod("buildGraphQLDocument",
                GraphQLOperationRequest.class,
                GraphQLResponseProjection.class);
        method.setAccessible(true);

        String document = (String) method.invoke(client, request, projection);

        assertEquals("query { dummyOperation(options:{orderBy:[ID_ASC]}) { __typename } }", document);
    }

    @Test
    void nullValuesAreRemovedFromSerializedRequest() throws Exception {
        GraphQLClient client = new GraphQLClient("http://localhost/graphql");

        Map<String, Object> input = new LinkedHashMap<>();
        input.put("id", null);
        input.put("name", "John");

        GraphQLOperationRequest request = new DummyOperationRequest(input);
        GraphQLResponseProjection projection = new GraphQLResponseProjection() {
            @Override
            public GraphQLResponseProjection deepCopy$() {
                return this;
            }

            @Override
            public String toString() {
                return "{ __typename }";
            }
        };

        Method method = GraphQLClient.class.getDeclaredMethod("buildGraphQLDocument",
                GraphQLOperationRequest.class,
                GraphQLResponseProjection.class);
        method.setAccessible(true);

        String document = (String) method.invoke(client, request, projection);

        assertEquals("query { dummyOperation(name:\"John\") { __typename } }", document);
    }

    private enum DummySort {
        ID_ASC
    }

    private static class DummyOptions {

        private final List<DummySort> orderBy;

        DummyOptions(List<DummySort> orderBy) {
            this.orderBy = orderBy;
        }

        public List<DummySort> getOrderBy() {
            return orderBy;
        }
    }

    private static class DummyOperationRequest implements GraphQLOperationRequest {

        private final Map<String, Object> input;

        DummyOperationRequest(Map<String, Object> input) {
            this.input = input;
        }

        @Override
        public GraphQLOperation getOperationType() {
            return GraphQLOperation.QUERY;
        }

        @Override
        public String getOperationName() {
            return "dummyOperation";
        }

        @Override
        public String getAlias() {
            return null;
        }

        @Override
        public Map<String, Object> getInput() {
            return input;
        }

        @Override
        public java.util.Set<String> getUseObjectMapperForInputSerialization() {
            return Collections.emptySet();
        }
    }
}
