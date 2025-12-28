package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Validation of a delete on object of class Tipo_visita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_visita_mpv___validateDeleteQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Tipo_visita_mpv___validateDelete";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Tipo_visita_mpv___validateDeleteQueryRequest() {
    }

    public Tipo_visita_mpv___validateDeleteQueryRequest(String alias) {
        this.alias = alias;
    }

    public void set_id(String _id) {
        this.input.put("_id", _id);
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

    public static Tipo_visita_mpv___validateDeleteQueryRequest.Builder builder() {
        return new Tipo_visita_mpv___validateDeleteQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private String _id;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }


        public Tipo_visita_mpv___validateDeleteQueryRequest build() {
            Tipo_visita_mpv___validateDeleteQueryRequest obj = new Tipo_visita_mpv___validateDeleteQueryRequest($alias);
            obj.set_id(_id);
            return obj;
        }

    }
}
