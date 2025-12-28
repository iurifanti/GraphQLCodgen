package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Retrieve a collection of object of class Terapia_altro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Terapia_altro___getPageQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Terapia_altro___getPage";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Terapia_altro___getPageQueryRequest() {
    }

    public Terapia_altro___getPageQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setOptions(CliTerapia_altroPageOptionsDTO options) {
        this.input.put("options", options);
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

    public static Terapia_altro___getPageQueryRequest.Builder builder() {
        return new Terapia_altro___getPageQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliTerapia_altroPageOptionsDTO options;
        private CliInsightTypeDTO insight;
        private Boolean disableCache = false;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setOptions(CliTerapia_altroPageOptionsDTO options) {
            this.options = options;
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


        public Terapia_altro___getPageQueryRequest build() {
            Terapia_altro___getPageQueryRequest obj = new Terapia_altro___getPageQueryRequest($alias);
            obj.setOptions(options);
            obj.setInsight(insight);
            obj.setDisableCache(disableCache);
            return obj;
        }

    }
}
