package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a bulk update on a set of objects of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___validateUpdateBulkQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Feedback___validateUpdateBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Feedback___validateUpdateBulkQueryRequest() {
    }

    public Feedback___validateUpdateBulkQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliFeedbackDraftUpdateBulkDTO data) {
        this.input.put("data", data);
    }

    public void setOptions(CliFeedbackPageOptionsDTO options) {
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

    public static Feedback___validateUpdateBulkQueryRequest.Builder builder() {
        return new Feedback___validateUpdateBulkQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliFeedbackDraftUpdateBulkDTO data;
        private CliFeedbackPageOptionsDTO options;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliFeedbackDraftUpdateBulkDTO data) {
            this.data = data;
            return this;
        }

        public Builder setOptions(CliFeedbackPageOptionsDTO options) {
            this.options = options;
            return this;
        }


        public Feedback___validateUpdateBulkQueryRequest build() {
            Feedback___validateUpdateBulkQueryRequest obj = new Feedback___validateUpdateBulkQueryRequest($alias);
            obj.setData(data);
            obj.setOptions(options);
            return obj;
        }

    }
}
