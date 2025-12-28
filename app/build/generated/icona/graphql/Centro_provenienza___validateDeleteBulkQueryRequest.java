package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a bulk delete on a set of objects of class Centro_provenienza.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Centro_provenienza___validateDeleteBulkQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Centro_provenienza___validateDeleteBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Centro_provenienza___validateDeleteBulkQueryRequest() {
    }

    public Centro_provenienza___validateDeleteBulkQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setOptions(CliCentro_provenienzaPageOptionsDTO options) {
        this.input.put("options", options);
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

    public static Centro_provenienza___validateDeleteBulkQueryRequest.Builder builder() {
        return new Centro_provenienza___validateDeleteBulkQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliCentro_provenienzaPageOptionsDTO options;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setOptions(CliCentro_provenienzaPageOptionsDTO options) {
            this.options = options;
            return this;
        }


        public Centro_provenienza___validateDeleteBulkQueryRequest build() {
            Centro_provenienza___validateDeleteBulkQueryRequest obj = new Centro_provenienza___validateDeleteBulkQueryRequest($alias);
            obj.setOptions(options);
            return obj;
        }

    }
}
