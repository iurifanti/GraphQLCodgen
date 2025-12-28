package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Nazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliNazioneCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String codice;
    private Integer codice_hicdep;
    private String nome;

    public CliNazioneCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Integer getCodice_hicdep() {
        return codice_hicdep;
    }
    public void setCodice_hicdep(Integer codice_hicdep) {
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
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (codice_hicdep != null) {
            joiner.add("codice_hicdep: " + GraphQLRequestSerializer.getEntry(codice_hicdep));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliNazioneCursorDTO.Builder builder() {
        return new CliNazioneCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String codice;
        private Integer codice_hicdep;
        private String nome;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        public Builder setCodice_hicdep(Integer codice_hicdep) {
            this.codice_hicdep = codice_hicdep;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliNazioneCursorDTO build() {
            CliNazioneCursorDTO result = new CliNazioneCursorDTO();
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setCodice_hicdep(this.codice_hicdep);
            result.setNome(this.nome);
            return result;
        }

    }
}
