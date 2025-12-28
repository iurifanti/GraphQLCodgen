package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft part objects of class Markers_altri
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_altriDraftUpdateRoleObjectsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<CliMarkers_altriDraftCreateDTO> create;
    private java.util.List<CliMarkers_altriDraftUpdateDTO> update;
    private java.util.List<String> delete;
    private Boolean deleteAll;

    public CliMarkers_altriDraftUpdateRoleObjectsDTO() {
    }


    public java.util.List<CliMarkers_altriDraftCreateDTO> getCreate() {
        return create;
    }
    public void setCreate(java.util.List<CliMarkers_altriDraftCreateDTO> create) {
        this.create = create;
    }

    public java.util.List<CliMarkers_altriDraftUpdateDTO> getUpdate() {
        return update;
    }
    public void setUpdate(java.util.List<CliMarkers_altriDraftUpdateDTO> update) {
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

    public static CliMarkers_altriDraftUpdateRoleObjectsDTO.Builder builder() {
        return new CliMarkers_altriDraftUpdateRoleObjectsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliMarkers_altriDraftCreateDTO> create;
        private java.util.List<CliMarkers_altriDraftUpdateDTO> update;
        private java.util.List<String> delete;
        private Boolean deleteAll;

        public Builder() {
        }

        public Builder setCreate(java.util.List<CliMarkers_altriDraftCreateDTO> create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(java.util.List<CliMarkers_altriDraftUpdateDTO> update) {
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


        public CliMarkers_altriDraftUpdateRoleObjectsDTO build() {
            CliMarkers_altriDraftUpdateRoleObjectsDTO result = new CliMarkers_altriDraftUpdateRoleObjectsDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            result.setDeleteAll(this.deleteAll);
            return result;
        }

    }
}
