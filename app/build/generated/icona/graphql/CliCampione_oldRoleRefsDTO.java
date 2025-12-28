package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the associated objects of class campione_old
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCampione_oldRoleRefsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> add;
    private java.util.List<String> remove;
    private Boolean removeAll;

    public CliCampione_oldRoleRefsDTO() {
    }


    public java.util.List<String> getAdd() {
        return add;
    }
    public void setAdd(java.util.List<String> add) {
        this.add = add;
    }

    public java.util.List<String> getRemove() {
        return remove;
    }
    public void setRemove(java.util.List<String> remove) {
        this.remove = remove;
    }

    public Boolean getRemoveAll() {
        return removeAll;
    }
    public void setRemoveAll(Boolean removeAll) {
        this.removeAll = removeAll;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (add != null) {
            joiner.add("add: " + GraphQLRequestSerializer.getEntry(add));
        }
        if (remove != null) {
            joiner.add("remove: " + GraphQLRequestSerializer.getEntry(remove));
        }
        if (removeAll != null) {
            joiner.add("removeAll: " + GraphQLRequestSerializer.getEntry(removeAll));
        }
        return joiner.toString();
    }

    public static CliCampione_oldRoleRefsDTO.Builder builder() {
        return new CliCampione_oldRoleRefsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private java.util.List<String> add;
        private java.util.List<String> remove;
        private Boolean removeAll;

        public Builder() {
        }

        public Builder setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }

        public Builder setRemove(java.util.List<String> remove) {
            this.remove = remove;
            return this;
        }

        public Builder setRemoveAll(Boolean removeAll) {
            this.removeAll = removeAll;
            return this;
        }


        public CliCampione_oldRoleRefsDTO build() {
            CliCampione_oldRoleRefsDTO result = new CliCampione_oldRoleRefsDTO();
            result.setAdd(this.add);
            result.setRemove(this.remove);
            result.setRemoveAll(this.removeAll);
            return result;
        }

    }
}
