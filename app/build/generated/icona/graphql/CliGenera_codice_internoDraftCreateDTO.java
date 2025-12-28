package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of form class Genera_codice_interno.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliGenera_codice_internoDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String cognome;
    private String data_nascita;
    private String nome;

    public CliGenera_codice_internoDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getData_nascita() {
        return data_nascita;
    }
    public void setData_nascita(String data_nascita) {
        this.data_nascita = data_nascita;
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
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (cognome != null) {
            joiner.add("cognome: " + GraphQLRequestSerializer.getEntry(cognome));
        }
        if (data_nascita != null) {
            joiner.add("data_nascita: " + GraphQLRequestSerializer.getEntry(data_nascita));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliGenera_codice_internoDraftCreateDTO.Builder builder() {
        return new CliGenera_codice_internoDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String cognome;
        private String data_nascita;
        private String nome;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setCognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        public Builder setData_nascita(String data_nascita) {
            this.data_nascita = data_nascita;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliGenera_codice_internoDraftCreateDTO build() {
            CliGenera_codice_internoDraftCreateDTO result = new CliGenera_codice_internoDraftCreateDTO();
            result.set_clientId(this._clientId);
            result.setCognome(this.cognome);
            result.setData_nascita(this.data_nascita);
            result.setNome(this.nome);
            return result;
        }

    }
}
