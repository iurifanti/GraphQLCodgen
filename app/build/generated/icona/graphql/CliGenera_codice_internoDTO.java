package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of form class Genera_codice_interno, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliGenera_codice_internoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String cognome;
    private String data_nascita;
    private String nome;

    public CliGenera_codice_internoDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of Genera_codice_interno. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Genera_codice_interno. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute cognome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
     */
    public String getCognome() {
        return cognome;
    }
    /**
     * The attribute cognome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * The attribute data_nascita of Genera_codice_interno. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_nascita() {
        return data_nascita;
    }
    /**
     * The attribute data_nascita of Genera_codice_interno. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_nascita(String data_nascita) {
        this.data_nascita = data_nascita;
    }

    /**
     * The attribute nome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
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

    public static CliGenera_codice_internoDTO.Builder builder() {
        return new CliGenera_codice_internoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String cognome;
        private String data_nascita;
        private String nome;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of Genera_codice_interno. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute cognome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setCognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        /**
         * The attribute data_nascita of Genera_codice_interno. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_nascita(String data_nascita) {
            this.data_nascita = data_nascita;
            return this;
        }

        /**
         * The attribute nome of Genera_codice_interno. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliGenera_codice_internoDTO build() {
            CliGenera_codice_internoDTO result = new CliGenera_codice_internoDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCognome(this.cognome);
            result.setData_nascita(this.data_nascita);
            result.setNome(this.nome);
            return result;
        }

    }
}
