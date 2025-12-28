package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Genera_codice_interno___previewQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Genera_codice_interno___preview";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Genera_codice_interno___previewQueryRequest() {
    }

    public Genera_codice_interno___previewQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliGenera_codice_internoDraftDTO data) {
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

    public static Genera_codice_interno___previewQueryRequest.Builder builder() {
        return new Genera_codice_interno___previewQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliGenera_codice_internoDraftDTO data;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliGenera_codice_internoDraftDTO data) {
            this.data = data;
            return this;
        }


        public Genera_codice_interno___previewQueryRequest build() {
            Genera_codice_interno___previewQueryRequest obj = new Genera_codice_interno___previewQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
