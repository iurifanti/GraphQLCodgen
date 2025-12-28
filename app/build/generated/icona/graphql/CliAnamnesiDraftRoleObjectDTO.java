package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the part object of class Anamnesi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliAnamnesiDraftRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliAnamnesiDraftDTO save;
    private Boolean delete;

    public CliAnamnesiDraftRoleObjectDTO() {
    }


    public CliAnamnesiDraftDTO getSave() {
        return save;
    }
    public void setSave(CliAnamnesiDraftDTO save) {
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

    public static CliAnamnesiDraftRoleObjectDTO.Builder builder() {
        return new CliAnamnesiDraftRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliAnamnesiDraftDTO save;
        private Boolean delete;

        public Builder() {
        }

        public Builder setSave(CliAnamnesiDraftDTO save) {
            this.save = save;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliAnamnesiDraftRoleObjectDTO build() {
            CliAnamnesiDraftRoleObjectDTO result = new CliAnamnesiDraftRoleObjectDTO();
            result.setSave(this.save);
            result.setDelete(this.delete);
            return result;
        }

    }
}
