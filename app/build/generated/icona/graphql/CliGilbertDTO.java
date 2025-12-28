package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Gilbert, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliGilbertDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String risultato;

    public CliGilbertDTO() {
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
     * The attribute _id of Gilbert. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Gilbert. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute risultato of Gilbert. It is of type String. Max length: 255.
     */
    public String getRisultato() {
        return risultato;
    }
    /**
     * The attribute risultato of Gilbert. It is of type String. Max length: 255.
     */
    public void setRisultato(String risultato) {
        this.risultato = risultato;
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
        if (risultato != null) {
            joiner.add("risultato: " + GraphQLRequestSerializer.getEntry(risultato));
        }
        return joiner.toString();
    }

    public static CliGilbertDTO.Builder builder() {
        return new CliGilbertDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String risultato;

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
         * The attribute _id of Gilbert. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute risultato of Gilbert. It is of type String. Max length: 255.
         */
        public Builder setRisultato(String risultato) {
            this.risultato = risultato;
            return this;
        }


        public CliGilbertDTO build() {
            CliGilbertDTO result = new CliGilbertDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setRisultato(this.risultato);
            return result;
        }

    }
}
