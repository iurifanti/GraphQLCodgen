package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Relazione_decesso.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRelazione_decessoCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String codice_dad;
    private String nome;

    public CliRelazione_decessoCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCodice_dad() {
        return codice_dad;
    }
    public void setCodice_dad(String codice_dad) {
        this.codice_dad = codice_dad;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (codice_dad != null) {
            joiner.add("codice_dad: " + GraphQLRequestSerializer.getEntry(codice_dad));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliRelazione_decessoCursorDTO.Builder builder() {
        return new CliRelazione_decessoCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String codice_dad;
        private String nome;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCodice_dad(String codice_dad) {
            this.codice_dad = codice_dad;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliRelazione_decessoCursorDTO build() {
            CliRelazione_decessoCursorDTO result = new CliRelazione_decessoCursorDTO();
            result.set_id(this._id);
            result.setCodice_dad(this.codice_dad);
            result.setNome(this.nome);
            return result;
        }

    }
}
