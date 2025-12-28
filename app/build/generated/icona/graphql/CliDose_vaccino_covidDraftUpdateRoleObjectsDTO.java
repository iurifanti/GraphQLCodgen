package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft part objects of class Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_vaccino_covidDraftUpdateRoleObjectsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<CliDose_vaccino_covidDraftCreateDTO> create;
    private java.util.List<CliDose_vaccino_covidDraftUpdateDTO> update;
    private java.util.List<String> delete;
    private Boolean deleteAll;

    public CliDose_vaccino_covidDraftUpdateRoleObjectsDTO() {
    }


    public java.util.List<CliDose_vaccino_covidDraftCreateDTO> getCreate() {
        return create;
    }
    public void setCreate(java.util.List<CliDose_vaccino_covidDraftCreateDTO> create) {
        this.create = create;
    }

    public java.util.List<CliDose_vaccino_covidDraftUpdateDTO> getUpdate() {
        return update;
    }
    public void setUpdate(java.util.List<CliDose_vaccino_covidDraftUpdateDTO> update) {
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

    public static CliDose_vaccino_covidDraftUpdateRoleObjectsDTO.Builder builder() {
        return new CliDose_vaccino_covidDraftUpdateRoleObjectsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliDose_vaccino_covidDraftCreateDTO> create;
        private java.util.List<CliDose_vaccino_covidDraftUpdateDTO> update;
        private java.util.List<String> delete;
        private Boolean deleteAll;

        public Builder() {
        }

        public Builder setCreate(java.util.List<CliDose_vaccino_covidDraftCreateDTO> create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(java.util.List<CliDose_vaccino_covidDraftUpdateDTO> update) {
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


        public CliDose_vaccino_covidDraftUpdateRoleObjectsDTO build() {
            CliDose_vaccino_covidDraftUpdateRoleObjectsDTO result = new CliDose_vaccino_covidDraftUpdateRoleObjectsDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            result.setDeleteAll(this.deleteAll);
            return result;
        }

    }
}
