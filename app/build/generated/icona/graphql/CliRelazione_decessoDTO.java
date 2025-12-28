package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Relazione_decesso, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliRelazione_decessoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String codice_dad;
    private String nome;

    public CliRelazione_decessoDTO() {
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
     * The attribute _id of Relazione_decesso. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Relazione_decesso. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice_dad of Relazione_decesso. It is of type String. Max length: 255.
     */
    public String getCodice_dad() {
        return codice_dad;
    }
    /**
     * The attribute codice_dad of Relazione_decesso. It is of type String. Max length: 255.
     */
    public void setCodice_dad(String codice_dad) {
        this.codice_dad = codice_dad;
    }

    /**
     * The attribute nome of Relazione_decesso. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Relazione_decesso. It is of type String. Max length: 255.
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
        if (codice_dad != null) {
            joiner.add("codice_dad: " + GraphQLRequestSerializer.getEntry(codice_dad));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliRelazione_decessoDTO.Builder builder() {
        return new CliRelazione_decessoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String codice_dad;
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
         * The attribute _id of Relazione_decesso. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice_dad of Relazione_decesso. It is of type String. Max length: 255.
         */
        public Builder setCodice_dad(String codice_dad) {
            this.codice_dad = codice_dad;
            return this;
        }

        /**
         * The attribute nome of Relazione_decesso. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliRelazione_decessoDTO build() {
            CliRelazione_decessoDTO result = new CliRelazione_decessoDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCodice_dad(this.codice_dad);
            result.setNome(this.nome);
            return result;
        }

    }
}
