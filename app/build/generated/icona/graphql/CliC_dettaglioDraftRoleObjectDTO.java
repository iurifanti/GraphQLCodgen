package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the part object of class C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliC_dettaglioDraftRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliC_dettaglioDraftDTO save;
    private Boolean delete;

    public CliC_dettaglioDraftRoleObjectDTO() {
    }


    public CliC_dettaglioDraftDTO getSave() {
        return save;
    }
    public void setSave(CliC_dettaglioDraftDTO save) {
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

    public static CliC_dettaglioDraftRoleObjectDTO.Builder builder() {
        return new CliC_dettaglioDraftRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliC_dettaglioDraftDTO save;
        private Boolean delete;

        public Builder() {
        }

        public Builder setSave(CliC_dettaglioDraftDTO save) {
            this.save = save;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliC_dettaglioDraftRoleObjectDTO build() {
            CliC_dettaglioDraftRoleObjectDTO result = new CliC_dettaglioDraftRoleObjectDTO();
            result.setSave(this.save);
            result.setDelete(this.delete);
            return result;
        }

    }
}
