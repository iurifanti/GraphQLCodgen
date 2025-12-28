package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the form action invocation on class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliPazienteFormActionHandlerResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliPazienteDTO data;
    @javax.validation.constraints.NotNull
    private CliFormActionHandlerResultDTO result;

    public CliPazienteFormActionHandlerResultDTO() {
    }


    public CliPazienteDTO getData() {
        return data;
    }
    public void setData(CliPazienteDTO data) {
        this.data = data;
    }

    public CliFormActionHandlerResultDTO getResult() {
        return result;
    }
    public void setResult(CliFormActionHandlerResultDTO result) {
        this.result = result;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (result != null) {
            joiner.add("result: " + GraphQLRequestSerializer.getEntry(result));
        }
        return joiner.toString();
    }

    public static CliPazienteFormActionHandlerResultDTO.Builder builder() {
        return new CliPazienteFormActionHandlerResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private CliPazienteDTO data;
        private CliFormActionHandlerResultDTO result;

        public Builder() {
        }

        public Builder setData(CliPazienteDTO data) {
            this.data = data;
            return this;
        }

        public Builder setResult(CliFormActionHandlerResultDTO result) {
            this.result = result;
            return this;
        }


        public CliPazienteFormActionHandlerResultDTO build() {
            CliPazienteFormActionHandlerResultDTO result = new CliPazienteFormActionHandlerResultDTO();
            result.setData(this.data);
            result.setResult(this.result);
            return result;
        }

    }
}
