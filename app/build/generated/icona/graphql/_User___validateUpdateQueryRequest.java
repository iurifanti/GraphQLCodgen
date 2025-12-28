package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of an update on object of class _User.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___validateUpdateQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "_User___validateUpdate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public _User___validateUpdateQueryRequest() {
    }

    public _User___validateUpdateQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(Cli_UserDraftUpdateDTO data) {
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

    public static _User___validateUpdateQueryRequest.Builder builder() {
        return new _User___validateUpdateQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private Cli_UserDraftUpdateDTO data;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(Cli_UserDraftUpdateDTO data) {
            this.data = data;
            return this;
        }


        public _User___validateUpdateQueryRequest build() {
            _User___validateUpdateQueryRequest obj = new _User___validateUpdateQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
