package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Comorbidita_mpv, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliComorbidita_mpvDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String name;
    private Integer ordine;

    public CliComorbidita_mpvDTO() {
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
     * The attribute _id of Comorbidita_mpv. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Comorbidita_mpv. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute name of Comorbidita_mpv. It is of type String. Max length: 255.Cannot be null.
     */
    public String getName() {
        return name;
    }
    /**
     * The attribute name of Comorbidita_mpv. It is of type String. Max length: 255.Cannot be null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The attribute ordine of Comorbidita_mpv. It is of type Int.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Comorbidita_mpv. It is of type Int.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        return joiner.toString();
    }

    public static CliComorbidita_mpvDTO.Builder builder() {
        return new CliComorbidita_mpvDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String name;
        private Integer ordine;

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
         * The attribute _id of Comorbidita_mpv. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute name of Comorbidita_mpv. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The attribute ordine of Comorbidita_mpv. It is of type Int.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }


        public CliComorbidita_mpvDTO build() {
            CliComorbidita_mpvDTO result = new CliComorbidita_mpvDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setName(this.name);
            result.setOrdine(this.ordine);
            return result;
        }

    }
}
