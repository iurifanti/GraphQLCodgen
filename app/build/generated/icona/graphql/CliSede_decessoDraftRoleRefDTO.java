package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft associated object of class Sede_decesso
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliSede_decessoDraftRoleRefDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String set;
    private Boolean remove;

    public CliSede_decessoDraftRoleRefDTO() {
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

    public static CliSede_decessoDraftRoleRefDTO.Builder builder() {
        return new CliSede_decessoDraftRoleRefDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
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


        public CliSede_decessoDraftRoleRefDTO build() {
            CliSede_decessoDraftRoleRefDTO result = new CliSede_decessoDraftRoleRefDTO();
            result.setSet(this.set);
            result.setRemove(this.remove);
            return result;
        }

    }
}
