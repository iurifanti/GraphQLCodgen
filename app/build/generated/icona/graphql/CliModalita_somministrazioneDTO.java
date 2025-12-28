package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Modalita_somministrazione, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliModalita_somministrazioneDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Integer cod;
    private String nome;

    public CliModalita_somministrazioneDTO() {
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
     * The attribute _id of Modalita_somministrazione. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Modalita_somministrazione. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute cod of Modalita_somministrazione. It is of type Int. Cannot be null.
     */
    public Integer getCod() {
        return cod;
    }
    /**
     * The attribute cod of Modalita_somministrazione. It is of type Int. Cannot be null.
     */
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    /**
     * The attribute nome of Modalita_somministrazione. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Modalita_somministrazione. It is of type String. Max length: 255.Cannot be null.
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
        if (cod != null) {
            joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliModalita_somministrazioneDTO.Builder builder() {
        return new CliModalita_somministrazioneDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Integer cod;
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
         * The attribute _id of Modalita_somministrazione. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute cod of Modalita_somministrazione. It is of type Int. Cannot be null.
         */
        public Builder setCod(Integer cod) {
            this.cod = cod;
            return this;
        }

        /**
         * The attribute nome of Modalita_somministrazione. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliModalita_somministrazioneDTO build() {
            CliModalita_somministrazioneDTO result = new CliModalita_somministrazioneDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCod(this.cod);
            result.setNome(this.nome);
            return result;
        }

    }
}
