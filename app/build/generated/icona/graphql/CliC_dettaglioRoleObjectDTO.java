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
public class CliC_dettaglioRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliC_dettaglioCreateDTO create;
    private CliC_dettaglioUpdateDTO update;
    private Boolean delete;

    public CliC_dettaglioRoleObjectDTO() {
    }


    public CliC_dettaglioCreateDTO getCreate() {
        return create;
    }
    public void setCreate(CliC_dettaglioCreateDTO create) {
        this.create = create;
    }

    public CliC_dettaglioUpdateDTO getUpdate() {
        return update;
    }
    public void setUpdate(CliC_dettaglioUpdateDTO update) {
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

    public static CliC_dettaglioRoleObjectDTO.Builder builder() {
        return new CliC_dettaglioRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliC_dettaglioCreateDTO create;
        private CliC_dettaglioUpdateDTO update;
        private Boolean delete;

        public Builder() {
        }

        public Builder setCreate(CliC_dettaglioCreateDTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(CliC_dettaglioUpdateDTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliC_dettaglioRoleObjectDTO build() {
            CliC_dettaglioRoleObjectDTO result = new CliC_dettaglioRoleObjectDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            return result;
        }

    }
}
