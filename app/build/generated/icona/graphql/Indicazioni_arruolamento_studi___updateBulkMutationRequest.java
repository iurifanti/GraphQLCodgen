package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___updateBulkMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___updateBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Indicazioni_arruolamento_studi___updateBulkMutationRequest() {
    }

    public Indicazioni_arruolamento_studi___updateBulkMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliIndicazioni_arruolamento_studiUpdateBulkDTO data) {
        this.input.put("data", data);
    }

    public void setOptions(CliIndicazioni_arruolamento_studiPageOptionsDTO options) {
        this.input.put("options", options);
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

    public static Indicazioni_arruolamento_studi___updateBulkMutationRequest.Builder builder() {
        return new Indicazioni_arruolamento_studi___updateBulkMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliIndicazioni_arruolamento_studiUpdateBulkDTO data;
        private CliIndicazioni_arruolamento_studiPageOptionsDTO options;
        private CliForceWarningsDTO forceWarnings;
        private CliInsightTypeDTO insight;
        private Boolean disableCache = false;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliIndicazioni_arruolamento_studiUpdateBulkDTO data) {
            this.data = data;
            return this;
        }

        public Builder setOptions(CliIndicazioni_arruolamento_studiPageOptionsDTO options) {
            this.options = options;
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


        public Indicazioni_arruolamento_studi___updateBulkMutationRequest build() {
            Indicazioni_arruolamento_studi___updateBulkMutationRequest obj = new Indicazioni_arruolamento_studi___updateBulkMutationRequest($alias);
            obj.setData(data);
            obj.setOptions(options);
            obj.setForceWarnings(forceWarnings);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
