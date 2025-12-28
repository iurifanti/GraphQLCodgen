package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Classe, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliClasseDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Integer codice;
    private String name;

    public CliClasseDTO() {
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
     * The attribute _id of Classe. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Classe. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice of Classe. It is of type Int.
     */
    public Integer getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Classe. It is of type Int.
     */
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    /**
     * The attribute name of Classe. It is of type String. Max length: 255.Cannot be null.
     */
    public String getName() {
        return name;
    }
    /**
     * The attribute name of Classe. It is of type String. Max length: 255.Cannot be null.
     */
    public void setName(String name) {
        this.name = name;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

    public static CliClasseDTO.Builder builder() {
        return new CliClasseDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Integer codice;
        private String name;

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
         * The attribute _id of Classe. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice of Classe. It is of type Int.
         */
        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute name of Classe. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public CliClasseDTO build() {
            CliClasseDTO result = new CliClasseDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setName(this.name);
            return result;
        }

    }
}
