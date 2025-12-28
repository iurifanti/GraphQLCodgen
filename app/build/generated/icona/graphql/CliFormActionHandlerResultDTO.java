package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFormActionHandlerResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private CliFormActionHandlerResultTypeDTO type;
    private CliFormActionHandlerMessageResultDTO message;

    public CliFormActionHandlerResultDTO() {
    }


    public CliFormActionHandlerResultTypeDTO getType() {
        return type;
    }
    public void setType(CliFormActionHandlerResultTypeDTO type) {
        this.type = type;
    }

    public CliFormActionHandlerMessageResultDTO getMessage() {
        return message;
    }
    public void setMessage(CliFormActionHandlerMessageResultDTO message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static CliFormActionHandlerResultDTO.Builder builder() {
        return new CliFormActionHandlerResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private CliFormActionHandlerResultTypeDTO type;
        private CliFormActionHandlerMessageResultDTO message;

        public Builder() {
        }

        public Builder setType(CliFormActionHandlerResultTypeDTO type) {
            this.type = type;
            return this;
        }

        public Builder setMessage(CliFormActionHandlerMessageResultDTO message) {
            this.message = message;
            return this;
        }


        public CliFormActionHandlerResultDTO build() {
            CliFormActionHandlerResultDTO result = new CliFormActionHandlerResultDTO();
            result.setType(this.type);
            result.setMessage(this.message);
            return result;
        }

    }
}
