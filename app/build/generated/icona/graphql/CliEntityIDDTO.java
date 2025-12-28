package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEntityIDDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private CliEntityNameDTO entityName;
    @javax.validation.constraints.NotNull
    private String _id;

    public CliEntityIDDTO() {
    }


    public CliEntityNameDTO getEntityName() {
        return entityName;
    }
    public void setEntityName(CliEntityNameDTO entityName) {
        this.entityName = entityName;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityName != null) {
            joiner.add("entityName: " + GraphQLRequestSerializer.getEntry(entityName));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        return joiner.toString();
    }

    public static CliEntityIDDTO.Builder builder() {
        return new CliEntityIDDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private CliEntityNameDTO entityName;
        private String _id;

        public Builder() {
        }

        public Builder setEntityName(CliEntityNameDTO entityName) {
            this.entityName = entityName;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }


        public CliEntityIDDTO build() {
            CliEntityIDDTO result = new CliEntityIDDTO();
            result.setEntityName(this.entityName);
            result.set_id(this._id);
            return result;
        }

    }
}
