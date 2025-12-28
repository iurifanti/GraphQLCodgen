package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Combinazioni_accettate_non_ARV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliCombinazioni_accettate_non_ARVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String farmaci;

    public CliCombinazioni_accettate_non_ARVDTO() {
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
     * The attribute _id of Combinazioni_accettate_non_ARV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Combinazioni_accettate_non_ARV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute farmaci of Combinazioni_accettate_non_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)farmaco_altro_ nome. Cannot be null.
     */
    public String getFarmaci() {
        return farmaci;
    }
    /**
     * The attribute farmaci of Combinazioni_accettate_non_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)farmaco_altro_ nome. Cannot be null.
     */
    public void setFarmaci(String farmaci) {
        this.farmaci = farmaci;
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
        if (farmaci != null) {
            joiner.add("farmaci: " + GraphQLRequestSerializer.getEntry(farmaci));
        }
        return joiner.toString();
    }

    public static CliCombinazioni_accettate_non_ARVDTO.Builder builder() {
        return new CliCombinazioni_accettate_non_ARVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String farmaci;

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
         * The attribute _id of Combinazioni_accettate_non_ARV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute farmaci of Combinazioni_accettate_non_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)farmaco_altro_ nome. Cannot be null.
         */
        public Builder setFarmaci(String farmaci) {
            this.farmaci = farmaci;
            return this;
        }


        public CliCombinazioni_accettate_non_ARVDTO build() {
            CliCombinazioni_accettate_non_ARVDTO result = new CliCombinazioni_accettate_non_ARVDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setFarmaci(this.farmaci);
            return result;
        }

    }
}
