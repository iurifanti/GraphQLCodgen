package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliFormActionHandlerMessageResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private CliMessageTypeDTO type;
    private String title;
    @javax.validation.constraints.NotNull
    private String message;

    public CliFormActionHandlerMessageResultDTO() {
    }


    public CliMessageTypeDTO getType() {
        return type;
    }
    public void setType(CliMessageTypeDTO type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        return joiner.toString();
    }

    public static CliFormActionHandlerMessageResultDTO.Builder builder() {
        return new CliFormActionHandlerMessageResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private CliMessageTypeDTO type;
        private String title;
        private String message;

        public Builder() {
        }

        public Builder setType(CliMessageTypeDTO type) {
            this.type = type;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public CliFormActionHandlerMessageResultDTO build() {
            CliFormActionHandlerMessageResultDTO result = new CliFormActionHandlerMessageResultDTO();
            result.setType(this.type);
            result.setTitle(this.title);
            result.setMessage(this.message);
            return result;
        }

    }
}
