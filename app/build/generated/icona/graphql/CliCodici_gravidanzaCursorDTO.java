package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Codici_gravidanza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCodici_gravidanzaCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String campo;
    private String codice_hicdep;
    private String nome;

    public CliCodici_gravidanzaCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCampo() {
        return campo;
    }
    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getCodice_hicdep() {
        return codice_hicdep;
    }
    public void setCodice_hicdep(String codice_hicdep) {
        this.codice_hicdep = codice_hicdep;
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
        if (campo != null) {
            joiner.add("campo: " + GraphQLRequestSerializer.getEntry(campo));
        }
        if (codice_hicdep != null) {
            joiner.add("codice_hicdep: " + GraphQLRequestSerializer.getEntry(codice_hicdep));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliCodici_gravidanzaCursorDTO.Builder builder() {
        return new CliCodici_gravidanzaCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String campo;
        private String codice_hicdep;
        private String nome;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCampo(String campo) {
            this.campo = campo;
            return this;
        }

        public Builder setCodice_hicdep(String codice_hicdep) {
            this.codice_hicdep = codice_hicdep;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliCodici_gravidanzaCursorDTO build() {
            CliCodici_gravidanzaCursorDTO result = new CliCodici_gravidanzaCursorDTO();
            result.set_id(this._id);
            result.setCampo(this.campo);
            result.setCodice_hicdep(this.codice_hicdep);
            result.setNome(this.nome);
            return result;
        }

    }
}
