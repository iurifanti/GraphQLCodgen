package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a create on object of class Sequenza_genomica.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___validateCreateQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Sequenza_genomica___validateCreate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Sequenza_genomica___validateCreateQueryRequest() {
    }

    public Sequenza_genomica___validateCreateQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliSequenza_genomicaDraftCreateDTO data) {
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

    public static Sequenza_genomica___validateCreateQueryRequest.Builder builder() {
        return new Sequenza_genomica___validateCreateQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliSequenza_genomicaDraftCreateDTO data;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliSequenza_genomicaDraftCreateDTO data) {
            this.data = data;
            return this;
        }


        public Sequenza_genomica___validateCreateQueryRequest build() {
            Sequenza_genomica___validateCreateQueryRequest obj = new Sequenza_genomica___validateCreateQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
