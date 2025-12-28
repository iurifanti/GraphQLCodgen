package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the part objects of class Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDropoutRoleObjectsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<CliDropoutCreateDTO> create;
    private java.util.List<CliDropoutUpdateDTO> update;
    private java.util.List<String> delete;
    private Boolean deleteAll;

    public CliDropoutRoleObjectsDTO() {
    }


    public java.util.List<CliDropoutCreateDTO> getCreate() {
        return create;
    }
    public void setCreate(java.util.List<CliDropoutCreateDTO> create) {
        this.create = create;
    }

    public java.util.List<CliDropoutUpdateDTO> getUpdate() {
        return update;
    }
    public void setUpdate(java.util.List<CliDropoutUpdateDTO> update) {
        this.update = update;
    }

    public java.util.List<String> getDelete() {
        return delete;
    }
    public void setDelete(java.util.List<String> delete) {
        this.delete = delete;
    }

    public Boolean getDeleteAll() {
        return deleteAll;
    }
    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (create != null) {
            joiner.add("create: " + GraphQLRequestSerializer.getEntry(create));
        }
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update));
        }
        if (delete != null) {
            joiner.add("delete: " + GraphQLRequestSerializer.getEntry(delete));
        }
        if (deleteAll != null) {
            joiner.add("deleteAll: " + GraphQLRequestSerializer.getEntry(deleteAll));
        }
        return joiner.toString();
    }

    public static CliDropoutRoleObjectsDTO.Builder builder() {
        return new CliDropoutRoleObjectsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliDropoutCreateDTO> create;
        private java.util.List<CliDropoutUpdateDTO> update;
        private java.util.List<String> delete;
        private Boolean deleteAll;

        public Builder() {
        }

        public Builder setCreate(java.util.List<CliDropoutCreateDTO> create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(java.util.List<CliDropoutUpdateDTO> update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(java.util.List<String> delete) {
            this.delete = delete;
            return this;
        }

        public Builder setDeleteAll(Boolean deleteAll) {
            this.deleteAll = deleteAll;
            return this;
        }


        public CliDropoutRoleObjectsDTO build() {
            CliDropoutRoleObjectsDTO result = new CliDropoutRoleObjectsDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            result.setDeleteAll(this.deleteAll);
            return result;
        }

    }
}
