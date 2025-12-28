package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Retrieve a preview object of class Comorbidita_mpv for an object of Comorbidita_mpv not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___previewQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "Comorbidita_mpv___preview";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public Comorbidita_mpv___previewQueryRequest() {
    }

    public Comorbidita_mpv___previewQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setData(CliComorbidita_mpvDraftDTO data) {
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

    public static Comorbidita_mpv___previewQueryRequest.Builder builder() {
        return new Comorbidita_mpv___previewQueryRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String $alias;
        private CliComorbidita_mpvDraftDTO data;

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


        public Comorbidita_mpv___previewQueryRequest build() {
            Comorbidita_mpv___previewQueryRequest obj = new Comorbidita_mpv___previewQueryRequest($alias);
            obj.setData(data);
            return obj;
        }

    }
}
