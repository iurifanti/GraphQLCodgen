package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Bulk delete a set of objects of class Paziente.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Paziente___deleteBulkMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Paziente___deleteBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Paziente___deleteBulkMutationRequest() {
    }

    public Paziente___deleteBulkMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setOptions(CliPazientePageOptionsDTO options) {
        this.input.put("options", options);
    }

    public void setForceWarnings(CliForceWarningsDTO forceWarnings) {
        this.input.put("forceWarnings", forceWarnings);
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

    public static Paziente___deleteBulkMutationRequest.Builder builder() {
        return new Paziente___deleteBulkMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:45+0100"
    )
    public static class Builder {

        private String $alias;
        private CliPazientePageOptionsDTO options;
        private CliForceWarningsDTO forceWarnings;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setOptions(CliPazientePageOptionsDTO options) {
            this.options = options;
            return this;
        }

        public Builder setForceWarnings(CliForceWarningsDTO forceWarnings) {
            this.forceWarnings = forceWarnings;
            return this;
        }


        public Paziente___deleteBulkMutationRequest build() {
            Paziente___deleteBulkMutationRequest obj = new Paziente___deleteBulkMutationRequest($alias);
            obj.setOptions(options);
            obj.setForceWarnings(forceWarnings);
            return obj;
        }

    }
}
