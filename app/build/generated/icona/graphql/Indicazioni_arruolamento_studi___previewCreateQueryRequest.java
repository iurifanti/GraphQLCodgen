package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Retrieve a preview object of class Indicazioni_arruolamento_studi for an object of Indicazioni_arruolamento_studi not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___previewCreateQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___previewCreate";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Indicazioni_arruolamento_studi___previewCreateQueryRequest() {
    }

    public Indicazioni_arruolamento_studi___previewCreateQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliIndicazioni_arruolamento_studiDraftCreateDTO data) {
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

    public static Indicazioni_arruolamento_studi___previewCreateQueryRequest.Builder builder() {
        return new Indicazioni_arruolamento_studi___previewCreateQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliIndicazioni_arruolamento_studiDraftCreateDTO data;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setData(CliIndicazioni_arruolamento_studiDraftCreateDTO data) {
            this.data = data;
            return this;
        }


        public Indicazioni_arruolamento_studi___previewCreateQueryRequest build() {
            Indicazioni_arruolamento_studi___previewCreateQueryRequest obj = new Indicazioni_arruolamento_studi___previewCreateQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
