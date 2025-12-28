package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Codici_gravidanza, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliCodici_gravidanzaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String campo;
    private String codice_hicdep;
    private String nome;

    public CliCodici_gravidanzaDTO() {
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
     * The attribute _id of Codici_gravidanza. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Codici_gravidanza. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute campo of Codici_gravidanza. It is of type String. Max length: 255.
     */
    public String getCampo() {
        return campo;
    }
    /**
     * The attribute campo of Codici_gravidanza. It is of type String. Max length: 255.
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }

    /**
     * The attribute codice_hicdep of Codici_gravidanza. It is of type Real @realFormat.
     */
    public String getCodice_hicdep() {
        return codice_hicdep;
    }
    /**
     * The attribute codice_hicdep of Codici_gravidanza. It is of type Real @realFormat.
     */
    public void setCodice_hicdep(String codice_hicdep) {
        this.codice_hicdep = codice_hicdep;
    }

    /**
     * The attribute nome of Codici_gravidanza. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Codici_gravidanza. It is of type String. Max length: 255.
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

    public static CliCodici_gravidanzaDTO.Builder builder() {
        return new CliCodici_gravidanzaDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String campo;
        private String codice_hicdep;
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
         * The attribute _id of Codici_gravidanza. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute campo of Codici_gravidanza. It is of type String. Max length: 255.
         */
        public Builder setCampo(String campo) {
            this.campo = campo;
            return this;
        }

        /**
         * The attribute codice_hicdep of Codici_gravidanza. It is of type Real @realFormat.
         */
        public Builder setCodice_hicdep(String codice_hicdep) {
            this.codice_hicdep = codice_hicdep;
            return this;
        }

        /**
         * The attribute nome of Codici_gravidanza. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliCodici_gravidanzaDTO build() {
            CliCodici_gravidanzaDTO result = new CliCodici_gravidanzaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCampo(this.campo);
            result.setCodice_hicdep(this.codice_hicdep);
            result.setNome(this.nome);
            return result;
        }

    }
}
