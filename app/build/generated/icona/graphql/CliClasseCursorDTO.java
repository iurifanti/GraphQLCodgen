package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Classe.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliClasseCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Integer codice;
    private String name;

    public CliClasseCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getCodice() {
        return codice;
    }
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static CliClasseCursorDTO.Builder builder() {
        return new CliClasseCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private Integer codice;
        private String name;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public CliClasseCursorDTO build() {
            CliClasseCursorDTO result = new CliClasseCursorDTO();
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setName(this.name);
            return result;
        }

    }
}
