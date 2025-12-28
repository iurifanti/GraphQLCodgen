package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on an object of class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Paziente___formAction___importaQuestionariPROMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Paziente___formAction___importaQuestionariPRO";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Paziente___formAction___importaQuestionariPROMutationRequest() {
    }

    public Paziente___formAction___importaQuestionariPROMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliPazienteDraftDTO data) {
        this.input.put("data", data);
    }

    public void setJsonParam(String jsonParam) {
        this.input.put("jsonParam", jsonParam);
    }

    public void setForceWarnings(CliForceWarningsDTO forceWarnings) {
        this.input.put("forceWarnings", forceWarnings);
    }

    public void setInsight(CliInsightTypeDTO insight) {
        this.input.put("insight", insight);
    }

    public void setDisableCache(Boolean disableCache) {
        this.input.put("disableCache", disableCache);
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

    public static Paziente___formAction___importaQuestionariPROMutationRequest.Builder builder() {
        return new Paziente___formAction___importaQuestionariPROMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:45+0100"
    )
    public static class Builder {

        private String $alias;
        private CliPazienteDraftDTO data;
        private String jsonParam;
        private CliForceWarningsDTO forceWarnings;
        private CliInsightTypeDTO insight;
        private Boolean disableCache = false;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliPazienteDraftDTO data) {
            this.data = data;
            return this;
        }

        public Builder setJsonParam(String jsonParam) {
            this.jsonParam = jsonParam;
            return this;
        }

        public Builder setForceWarnings(CliForceWarningsDTO forceWarnings) {
            this.forceWarnings = forceWarnings;
            return this;
        }

        public Builder setInsight(CliInsightTypeDTO insight) {
            this.insight = insight;
            return this;
        }

        public Builder setDisableCache(Boolean disableCache) {
            this.disableCache = disableCache;
            return this;
        }


        public Paziente___formAction___importaQuestionariPROMutationRequest build() {
            Paziente___formAction___importaQuestionariPROMutationRequest obj = new Paziente___formAction___importaQuestionariPROMutationRequest($alias);
            obj.setData(data);
            obj.setJsonParam(jsonParam);
            obj.setForceWarnings(forceWarnings);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
