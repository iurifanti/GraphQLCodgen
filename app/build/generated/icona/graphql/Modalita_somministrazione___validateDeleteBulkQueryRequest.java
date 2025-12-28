package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a bulk delete on a set of objects of class Modalita_somministrazione.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___validateDeleteBulkQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Modalita_somministrazione___validateDeleteBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Modalita_somministrazione___validateDeleteBulkQueryRequest() {
    }

    public Modalita_somministrazione___validateDeleteBulkQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setOptions(CliModalita_somministrazionePageOptionsDTO options) {
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

    public static Modalita_somministrazione___validateDeleteBulkQueryRequest.Builder builder() {
        return new Modalita_somministrazione___validateDeleteBulkQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliModalita_somministrazionePageOptionsDTO options;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setOptions(CliModalita_somministrazionePageOptionsDTO options) {
            this.options = options;
            return this;
        }


        public Modalita_somministrazione___validateDeleteBulkQueryRequest build() {
            Modalita_somministrazione___validateDeleteBulkQueryRequest obj = new Modalita_somministrazione___validateDeleteBulkQueryRequest($alias);
            obj.setOptions(options);
            return obj;
        }

    }
}
