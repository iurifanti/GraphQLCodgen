package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for the draft part object of class V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliV_dettaglioDraftUpdateRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliV_dettaglioDraftCreateDTO create;
    private CliV_dettaglioDraftUpdateDTO update;
    private Boolean delete;

    public CliV_dettaglioDraftUpdateRoleObjectDTO() {
    }


    public CliV_dettaglioDraftCreateDTO getCreate() {
        return create;
    }
    public void setCreate(CliV_dettaglioDraftCreateDTO create) {
        this.create = create;
    }

    public CliV_dettaglioDraftUpdateDTO getUpdate() {
        return update;
    }
    public void setUpdate(CliV_dettaglioDraftUpdateDTO update) {
        this.update = update;
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
        if (create != null) {
            joiner.add("create: " + GraphQLRequestSerializer.getEntry(create));
        }
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update));
        }
        if (delete != null) {
            joiner.add("delete: " + GraphQLRequestSerializer.getEntry(delete));
        }
        return joiner.toString();
    }

    public static CliV_dettaglioDraftUpdateRoleObjectDTO.Builder builder() {
        return new CliV_dettaglioDraftUpdateRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliV_dettaglioDraftCreateDTO create;
        private CliV_dettaglioDraftUpdateDTO update;
        private Boolean delete;

        public Builder() {
        }

        public Builder setCreate(CliV_dettaglioDraftCreateDTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(CliV_dettaglioDraftUpdateDTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliV_dettaglioDraftUpdateRoleObjectDTO build() {
            CliV_dettaglioDraftUpdateRoleObjectDTO result = new CliV_dettaglioDraftUpdateRoleObjectDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            return result;
        }

    }
}
