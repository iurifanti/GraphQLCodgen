package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft part objects of class L_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliL_dettaglioDraftRoleObjectsDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<CliL_dettaglioDraftDTO> save;
    private java.util.List<String> delete;
    private Boolean deleteAll;

    public CliL_dettaglioDraftRoleObjectsDTO() {
    }


    public java.util.List<CliL_dettaglioDraftDTO> getSave() {
        return save;
    }
    public void setSave(java.util.List<CliL_dettaglioDraftDTO> save) {
        this.save = save;
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
        if (save != null) {
            joiner.add("save: " + GraphQLRequestSerializer.getEntry(save));
        }
        if (delete != null) {
            joiner.add("delete: " + GraphQLRequestSerializer.getEntry(delete));
        }
        if (deleteAll != null) {
            joiner.add("deleteAll: " + GraphQLRequestSerializer.getEntry(deleteAll));
        }
        return joiner.toString();
    }

    public static CliL_dettaglioDraftRoleObjectsDTO.Builder builder() {
        return new CliL_dettaglioDraftRoleObjectsDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private java.util.List<CliL_dettaglioDraftDTO> save;
        private java.util.List<String> delete;
        private Boolean deleteAll;

        public Builder() {
        }

        public Builder setSave(java.util.List<CliL_dettaglioDraftDTO> save) {
            this.save = save;
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


        public CliL_dettaglioDraftRoleObjectsDTO build() {
            CliL_dettaglioDraftRoleObjectsDTO result = new CliL_dettaglioDraftRoleObjectsDTO();
            result.setSave(this.save);
            result.setDelete(this.delete);
            result.setDeleteAll(this.deleteAll);
            return result;
        }

    }
}
