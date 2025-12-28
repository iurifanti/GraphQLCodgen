package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the associated object of class Classificazione_farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliClassificazione_farmaco_ATCRoleRefDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String set;
    private Boolean remove;

    public CliClassificazione_farmaco_ATCRoleRefDTO() {
    }


    public String getSet() {
        return set;
    }
    public void setSet(String set) {
        this.set = set;
    }

    public Boolean getRemove() {
        return remove;
    }
    public void setRemove(Boolean remove) {
        this.remove = remove;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (set != null) {
            joiner.add("set: " + GraphQLRequestSerializer.getEntry(set));
        }
        if (remove != null) {
            joiner.add("remove: " + GraphQLRequestSerializer.getEntry(remove));
        }
        return joiner.toString();
    }

    public static CliClassificazione_farmaco_ATCRoleRefDTO.Builder builder() {
        return new CliClassificazione_farmaco_ATCRoleRefDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String set;
        private Boolean remove;

        public Builder() {
        }

        public Builder setSet(String set) {
            this.set = set;
            return this;
        }

        public Builder setRemove(Boolean remove) {
            this.remove = remove;
            return this;
        }


        public CliClassificazione_farmaco_ATCRoleRefDTO build() {
            CliClassificazione_farmaco_ATCRoleRefDTO result = new CliClassificazione_farmaco_ATCRoleRefDTO();
            result.setSet(this.set);
            result.setRemove(this.remove);
            return result;
        }

    }
}
