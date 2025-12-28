package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the part object of class V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliV_dettaglioDraftRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliV_dettaglioDraftDTO save;
    private Boolean delete;

    public CliV_dettaglioDraftRoleObjectDTO() {
    }


    public CliV_dettaglioDraftDTO getSave() {
        return save;
    }
    public void setSave(CliV_dettaglioDraftDTO save) {
        this.save = save;
    }

    public Boolean getDelete() {
        return delete;
    }
    public void setDelete(Boolean delete) {
        this.delete = delete;
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
        return joiner.toString();
    }

    public static CliV_dettaglioDraftRoleObjectDTO.Builder builder() {
        return new CliV_dettaglioDraftRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliV_dettaglioDraftDTO save;
        private Boolean delete;

        public Builder() {
        }

        public Builder setSave(CliV_dettaglioDraftDTO save) {
            this.save = save;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliV_dettaglioDraftRoleObjectDTO build() {
            CliV_dettaglioDraftRoleObjectDTO result = new CliV_dettaglioDraftRoleObjectDTO();
            result.setSave(this.save);
            result.setDelete(this.delete);
            return result;
        }

    }
}
