package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the associated object of class Tipo_marker
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_markerRoleRefDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String set;
    private Boolean remove;

    public CliTipo_markerRoleRefDTO() {
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

    public static CliTipo_markerRoleRefDTO.Builder builder() {
        return new CliTipo_markerRoleRefDTO.Builder();
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


        public CliTipo_markerRoleRefDTO build() {
            CliTipo_markerRoleRefDTO result = new CliTipo_markerRoleRefDTO();
            result.setSet(this.set);
            result.setRemove(this.remove);
            return result;
        }

    }
}
