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
public class CliAnamnesiRoleObjectDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliAnamnesiCreateDTO create;
    private CliAnamnesiUpdateDTO update;
    private Boolean delete;

    public CliAnamnesiRoleObjectDTO() {
    }


    public CliAnamnesiCreateDTO getCreate() {
        return create;
    }
    public void setCreate(CliAnamnesiCreateDTO create) {
        this.create = create;
    }

    public CliAnamnesiUpdateDTO getUpdate() {
        return update;
    }
    public void setUpdate(CliAnamnesiUpdateDTO update) {
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

    public static CliAnamnesiRoleObjectDTO.Builder builder() {
        return new CliAnamnesiRoleObjectDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliAnamnesiCreateDTO create;
        private CliAnamnesiUpdateDTO update;
        private Boolean delete;

        public Builder() {
        }

        public Builder setCreate(CliAnamnesiCreateDTO create) {
            this.create = create;
            return this;
        }

        public Builder setUpdate(CliAnamnesiUpdateDTO update) {
            this.update = update;
            return this;
        }

        public Builder setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }


        public CliAnamnesiRoleObjectDTO build() {
            CliAnamnesiRoleObjectDTO result = new CliAnamnesiRoleObjectDTO();
            result.setCreate(this.create);
            result.setUpdate(this.update);
            result.setDelete(this.delete);
            return result;
        }

    }
}
