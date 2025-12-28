package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Nazione, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliNazioneDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String codice;
    private Integer codice_hicdep;
    private String nome;

    public CliNazioneDTO() {
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
     * The attribute _id of Nazione. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Nazione. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice of Nazione. It is of type String. Max length: 255.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Nazione. It is of type String. Max length: 255.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute codice_hicdep of Nazione. It is of type Int.
     */
    public Integer getCodice_hicdep() {
        return codice_hicdep;
    }
    /**
     * The attribute codice_hicdep of Nazione. It is of type Int.
     */
    public void setCodice_hicdep(Integer codice_hicdep) {
        this.codice_hicdep = codice_hicdep;
    }

    /**
     * The attribute nome of Nazione. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Nazione. It is of type String. Max length: 255.
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

    public static CliNazioneDTO.Builder builder() {
        return new CliNazioneDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String codice;
        private Integer codice_hicdep;
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
         * The attribute _id of Nazione. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice of Nazione. It is of type String. Max length: 255.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute codice_hicdep of Nazione. It is of type Int.
         */
        public Builder setCodice_hicdep(Integer codice_hicdep) {
            this.codice_hicdep = codice_hicdep;
            return this;
        }

        /**
         * The attribute nome of Nazione. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliNazioneDTO build() {
            CliNazioneDTO result = new CliNazioneDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setCodice_hicdep(this.codice_hicdep);
            result.setNome(this.nome);
            return result;
        }

    }
}
