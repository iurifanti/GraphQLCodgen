package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the form action invocation on class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliP_PazienteFormActionHandlerResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliP_PazienteDTO data;
    @javax.validation.constraints.NotNull
    private CliFormActionHandlerResultDTO result;

    public CliP_PazienteFormActionHandlerResultDTO() {
    }


    public CliP_PazienteDTO getData() {
        return data;
    }
    public void setData(CliP_PazienteDTO data) {
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

    public static CliP_PazienteFormActionHandlerResultDTO.Builder builder() {
        return new CliP_PazienteFormActionHandlerResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private CliP_PazienteDTO data;
        private CliFormActionHandlerResultDTO result;

        public Builder() {
        }

        public Builder setData(CliP_PazienteDTO data) {
            this.data = data;
            return this;
        }

        public Builder setResult(CliFormActionHandlerResultDTO result) {
            this.result = result;
            return this;
        }


        public CliP_PazienteFormActionHandlerResultDTO build() {
            CliP_PazienteFormActionHandlerResultDTO result = new CliP_PazienteFormActionHandlerResultDTO();
            result.setData(this.data);
            result.setResult(this.result);
            return result;
        }

    }
}
