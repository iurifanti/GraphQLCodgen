package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Create or update an object of class Comorbidita_mpv.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Comorbidita_mpv___saveMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Comorbidita_mpv___save";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Comorbidita_mpv___saveMutationRequest() {
    }

    public Comorbidita_mpv___saveMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliComorbidita_mpvDraftDTO data) {
        this.input.put("data", data);
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

    public static Comorbidita_mpv___saveMutationRequest.Builder builder() {
        return new Comorbidita_mpv___saveMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:45+0100"
    )
    public static class Builder {

        private String $alias;
        private CliComorbidita_mpvDraftDTO data;
        private CliForceWarningsDTO forceWarnings;
        private CliInsightTypeDTO insight;
        private Boolean disableCache = false;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliComorbidita_mpvDraftDTO data) {
            this.data = data;
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


        public Comorbidita_mpv___saveMutationRequest build() {
            Comorbidita_mpv___saveMutationRequest obj = new Comorbidita_mpv___saveMutationRequest($alias);
            obj.setData(data);
            obj.setForceWarnings(forceWarnings);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
