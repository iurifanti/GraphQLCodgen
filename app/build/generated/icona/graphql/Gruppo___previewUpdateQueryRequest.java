package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Retrieve a preview object of class Gruppo for an updated instance of Gruppo.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gruppo___previewUpdateQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Gruppo___previewUpdate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Gruppo___previewUpdateQueryRequest() {
    }

    public Gruppo___previewUpdateQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliGruppoDraftUpdateDTO data) {
        this.input.put("data", data);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static Gruppo___previewUpdateQueryRequest.Builder builder() {
        return new Gruppo___previewUpdateQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliGruppoDraftUpdateDTO data;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliGruppoDraftUpdateDTO data) {
            this.data = data;
            return this;
        }


        public Gruppo___previewUpdateQueryRequest build() {
            Gruppo___previewUpdateQueryRequest obj = new Gruppo___previewUpdateQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
