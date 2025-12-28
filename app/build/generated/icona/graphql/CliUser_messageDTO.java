package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of singleton class User_message, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliUser_messageDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String messaggio;
    private String scadenza_messaggio;

    public CliUser_messageDTO() {
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
     * The attribute _id of User_message. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of User_message. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute messaggio of User_message. It is of type String. Max length: 255.
     */
    public String getMessaggio() {
        return messaggio;
    }
    /**
     * The attribute messaggio of User_message. It is of type String. Max length: 255.
     */
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    /**
     * The attribute scadenza_messaggio of User_message. It is of type Datetime @datetimeFormat.
     */
    public String getScadenza_messaggio() {
        return scadenza_messaggio;
    }
    /**
     * The attribute scadenza_messaggio of User_message. It is of type Datetime @datetimeFormat.
     */
    public void setScadenza_messaggio(String scadenza_messaggio) {
        this.scadenza_messaggio = scadenza_messaggio;
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
        if (messaggio != null) {
            joiner.add("messaggio: " + GraphQLRequestSerializer.getEntry(messaggio));
        }
        if (scadenza_messaggio != null) {
            joiner.add("scadenza_messaggio: " + GraphQLRequestSerializer.getEntry(scadenza_messaggio));
        }
        return joiner.toString();
    }

    public static CliUser_messageDTO.Builder builder() {
        return new CliUser_messageDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String messaggio;
        private String scadenza_messaggio;

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
         * The attribute _id of User_message. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute messaggio of User_message. It is of type String. Max length: 255.
         */
        public Builder setMessaggio(String messaggio) {
            this.messaggio = messaggio;
            return this;
        }

        /**
         * The attribute scadenza_messaggio of User_message. It is of type Datetime @datetimeFormat.
         */
        public Builder setScadenza_messaggio(String scadenza_messaggio) {
            this.scadenza_messaggio = scadenza_messaggio;
            return this;
        }


        public CliUser_messageDTO build() {
            CliUser_messageDTO result = new CliUser_messageDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setMessaggio(this.messaggio);
            result.setScadenza_messaggio(this.scadenza_messaggio);
            return result;
        }

    }
}
