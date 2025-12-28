package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft associated object of class Metodica_HIVRNA
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMetodica_HIVRNADraftRoleRefDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String set;
    private Boolean remove;

    public CliMetodica_HIVRNADraftRoleRefDTO() {
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

    public static CliMetodica_HIVRNADraftRoleRefDTO.Builder builder() {
        return new CliMetodica_HIVRNADraftRoleRefDTO.Builder();
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


        public CliMetodica_HIVRNADraftRoleRefDTO build() {
            CliMetodica_HIVRNADraftRoleRefDTO result = new CliMetodica_HIVRNADraftRoleRefDTO();
            result.setSet(this.set);
            result.setRemove(this.remove);
            return result;
        }

    }
}
