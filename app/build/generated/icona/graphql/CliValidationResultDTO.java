package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the validate services.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliValidationResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean isValid;
    @javax.validation.constraints.NotNull
    private java.util.List<CliIssueDTO> issues;

    public CliValidationResultDTO() {
    }


    public boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public java.util.List<CliIssueDTO> getIssues() {
        return issues;
    }
    public void setIssues(java.util.List<CliIssueDTO> issues) {
        this.issues = issues;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("isValid: " + GraphQLRequestSerializer.getEntry(isValid));
        if (issues != null) {
            joiner.add("issues: " + GraphQLRequestSerializer.getEntry(issues));
        }
        return joiner.toString();
    }

    public static CliValidationResultDTO.Builder builder() {
        return new CliValidationResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private boolean isValid;
        private java.util.List<CliIssueDTO> issues;

        public Builder() {
        }

        public Builder setIsValid(boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        public Builder setIssues(java.util.List<CliIssueDTO> issues) {
            this.issues = issues;
            return this;
        }


        public CliValidationResultDTO build() {
            CliValidationResultDTO result = new CliValidationResultDTO();
            result.setIsValid(this.isValid);
            result.setIssues(this.issues);
            return result;
        }

    }
}
