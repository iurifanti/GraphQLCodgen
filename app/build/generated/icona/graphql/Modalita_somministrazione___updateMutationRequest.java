package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Update an object of class Modalita_somministrazione.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___updateMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Modalita_somministrazione___update";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Modalita_somministrazione___updateMutationRequest() {
    }

    public Modalita_somministrazione___updateMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliModalita_somministrazioneUpdateDTO data) {
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

    public static Modalita_somministrazione___updateMutationRequest.Builder builder() {
        return new Modalita_somministrazione___updateMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliModalita_somministrazioneUpdateDTO data;
        private CliForceWarningsDTO forceWarnings;
        private CliInsightTypeDTO insight;
        private Boolean disableCache = false;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliModalita_somministrazioneUpdateDTO data) {
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


        public Modalita_somministrazione___updateMutationRequest build() {
            Modalita_somministrazione___updateMutationRequest obj = new Modalita_somministrazione___updateMutationRequest($alias);
            obj.setData(data);
            obj.setForceWarnings(forceWarnings);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
