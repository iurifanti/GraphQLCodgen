package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Options to configure the list of Issue (only for issueLevel=WARNING) to be returned by a mutation service.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliForceWarningsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean actionVeto = false;
    private Boolean dataValidation = false;

    public CliForceWarningsDTO() {
    }


    public Boolean getActionVeto() {
        return actionVeto;
    }
    public void setActionVeto(Boolean actionVeto) {
        this.actionVeto = actionVeto;
    }

    public Boolean getDataValidation() {
        return dataValidation;
    }
    public void setDataValidation(Boolean dataValidation) {
        this.dataValidation = dataValidation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actionVeto != null) {
            joiner.add("actionVeto: " + GraphQLRequestSerializer.getEntry(actionVeto));
        }
        if (dataValidation != null) {
            joiner.add("dataValidation: " + GraphQLRequestSerializer.getEntry(dataValidation));
        }
        return joiner.toString();
    }

    public static CliForceWarningsDTO.Builder builder() {
        return new CliForceWarningsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private Boolean actionVeto = false;
        private Boolean dataValidation = false;

        public Builder() {
        }

        public Builder setActionVeto(Boolean actionVeto) {
            this.actionVeto = actionVeto;
            return this;
        }

        public Builder setDataValidation(Boolean dataValidation) {
            this.dataValidation = dataValidation;
            return this;
        }


        public CliForceWarningsDTO build() {
            CliForceWarningsDTO result = new CliForceWarningsDTO();
            result.setActionVeto(this.actionVeto);
            result.setDataValidation(this.dataValidation);
            return result;
        }

    }
}
