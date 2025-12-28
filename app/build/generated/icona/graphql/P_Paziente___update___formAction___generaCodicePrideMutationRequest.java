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
Invoke the form action handler named generaCodicePride on an existing object of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class P_Paziente___update___formAction___generaCodicePrideMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "P_Paziente___update___formAction___generaCodicePride";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public P_Paziente___update___formAction___generaCodicePrideMutationRequest() {
    }

    public P_Paziente___update___formAction___generaCodicePrideMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliP_PazienteDraftUpdateDTO data) {
        this.input.put("data", data);
    }

    public void setFormParam(CliGenera_codice_internoDraftDTO formParam) {
        this.input.put("formParam", formParam);
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

    public static P_Paziente___update___formAction___generaCodicePrideMutationRequest.Builder builder() {
        return new P_Paziente___update___formAction___generaCodicePrideMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:45+0100"
    )
    public static class Builder {

        private String $alias;
        private CliP_PazienteDraftUpdateDTO data;
        private CliGenera_codice_internoDraftDTO formParam;
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

        public Builder setData(CliP_PazienteDraftUpdateDTO data) {
            this.data = data;
            return this;
        }

        public Builder setFormParam(CliGenera_codice_internoDraftDTO formParam) {
            this.formParam = formParam;
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


        public P_Paziente___update___formAction___generaCodicePrideMutationRequest build() {
            P_Paziente___update___formAction___generaCodicePrideMutationRequest obj = new P_Paziente___update___formAction___generaCodicePrideMutationRequest($alias);
            obj.setData(data);
            obj.setFormParam(formParam);
            obj.setJsonParam(jsonParam);
            obj.setForceWarnings(forceWarnings);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
