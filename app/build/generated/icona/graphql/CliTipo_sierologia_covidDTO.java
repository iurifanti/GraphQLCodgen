package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Tipo_sierologia_covid, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_sierologia_covidDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String nome;
    private Boolean solo_esito;

    public CliTipo_sierologia_covidDTO() {
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
     * The attribute _id of Tipo_sierologia_covid. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Tipo_sierologia_covid. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute nome of Tipo_sierologia_covid. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Tipo_sierologia_covid. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute solo_esito of Tipo_sierologia_covid. It is of type Boolean.
     */
    public Boolean getSolo_esito() {
        return solo_esito;
    }
    /**
     * The attribute solo_esito of Tipo_sierologia_covid. It is of type Boolean.
     */
    public void setSolo_esito(Boolean solo_esito) {
        this.solo_esito = solo_esito;
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
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (solo_esito != null) {
            joiner.add("solo_esito: " + GraphQLRequestSerializer.getEntry(solo_esito));
        }
        return joiner.toString();
    }

    public static CliTipo_sierologia_covidDTO.Builder builder() {
        return new CliTipo_sierologia_covidDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String nome;
        private Boolean solo_esito;

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
         * The attribute _id of Tipo_sierologia_covid. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute nome of Tipo_sierologia_covid. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute solo_esito of Tipo_sierologia_covid. It is of type Boolean.
         */
        public Builder setSolo_esito(Boolean solo_esito) {
            this.solo_esito = solo_esito;
            return this;
        }


        public CliTipo_sierologia_covidDTO build() {
            CliTipo_sierologia_covidDTO result = new CliTipo_sierologia_covidDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setNome(this.nome);
            result.setSolo_esito(this.solo_esito);
            return result;
        }

    }
}
