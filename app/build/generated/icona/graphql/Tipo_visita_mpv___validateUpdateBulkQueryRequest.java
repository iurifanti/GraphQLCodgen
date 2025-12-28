package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_visita_mpv___validateUpdateBulkQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Tipo_visita_mpv___validateUpdateBulk";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Tipo_visita_mpv___validateUpdateBulkQueryRequest() {
    }

    public Tipo_visita_mpv___validateUpdateBulkQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliTipo_visita_mpvDraftUpdateBulkDTO data) {
        this.input.put("data", data);
    }

    public void setOptions(CliTipo_visita_mpvPageOptionsDTO options) {
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

    public static Tipo_visita_mpv___validateUpdateBulkQueryRequest.Builder builder() {
        return new Tipo_visita_mpv___validateUpdateBulkQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliTipo_visita_mpvDraftUpdateBulkDTO data;
        private CliTipo_visita_mpvPageOptionsDTO options;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliTipo_visita_mpvDraftUpdateBulkDTO data) {
            this.data = data;
            return this;
        }

        public Builder setOptions(CliTipo_visita_mpvPageOptionsDTO options) {
            this.options = options;
            return this;
        }


        public Tipo_visita_mpv___validateUpdateBulkQueryRequest build() {
            Tipo_visita_mpv___validateUpdateBulkQueryRequest obj = new Tipo_visita_mpv___validateUpdateBulkQueryRequest($alias);
            obj.setData(data);
            obj.setOptions(options);
            return obj;
        }

    }
}
