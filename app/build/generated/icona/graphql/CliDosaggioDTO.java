package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class dosaggio, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliDosaggioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Integer farmaco_altro_id;
    private Integer farmaco_arv_id;
    private String nome;
    private CliFarmaco_ARVDTO farmaco_ARV_;

    public CliDosaggioDTO() {
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
     * The attribute _id of dosaggio. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of dosaggio. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute farmaco_altro_id of dosaggio. It is of type Int. Path: farmaco_altro_ __id. Cannot be null.
     */
    public Integer getFarmaco_altro_id() {
        return farmaco_altro_id;
    }
    /**
     * The attribute farmaco_altro_id of dosaggio. It is of type Int. Path: farmaco_altro_ __id. Cannot be null.
     */
    public void setFarmaco_altro_id(Integer farmaco_altro_id) {
        this.farmaco_altro_id = farmaco_altro_id;
    }

    /**
     * The attribute farmaco_arv_id of dosaggio. It is of type Int. Path: farmaco_ARV_ __id. Cannot be null.
     */
    public Integer getFarmaco_arv_id() {
        return farmaco_arv_id;
    }
    /**
     * The attribute farmaco_arv_id of dosaggio. It is of type Int. Path: farmaco_ARV_ __id. Cannot be null.
     */
    public void setFarmaco_arv_id(Integer farmaco_arv_id) {
        this.farmaco_arv_id = farmaco_arv_id;
    }

    /**
     * The attribute nome of dosaggio. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of dosaggio. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The associated object for the role farmaco_ARV_.
     */
    public CliFarmaco_ARVDTO getFarmaco_ARV_() {
        return farmaco_ARV_;
    }
    /**
     * The associated object for the role farmaco_ARV_.
     */
    public void setFarmaco_ARV_(CliFarmaco_ARVDTO farmaco_ARV_) {
        this.farmaco_ARV_ = farmaco_ARV_;
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
        if (farmaco_altro_id != null) {
            joiner.add("farmaco_altro_id: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id));
        }
        if (farmaco_arv_id != null) {
            joiner.add("farmaco_arv_id: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (farmaco_ARV_ != null) {
            joiner.add("farmaco_ARV_: " + GraphQLRequestSerializer.getEntry(farmaco_ARV_));
        }
        return joiner.toString();
    }

    public static CliDosaggioDTO.Builder builder() {
        return new CliDosaggioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Integer farmaco_altro_id;
        private Integer farmaco_arv_id;
        private String nome;
        private CliFarmaco_ARVDTO farmaco_ARV_;

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
         * The attribute _id of dosaggio. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute farmaco_altro_id of dosaggio. It is of type Int. Path: farmaco_altro_ __id. Cannot be null.
         */
        public Builder setFarmaco_altro_id(Integer farmaco_altro_id) {
            this.farmaco_altro_id = farmaco_altro_id;
            return this;
        }

        /**
         * The attribute farmaco_arv_id of dosaggio. It is of type Int. Path: farmaco_ARV_ __id. Cannot be null.
         */
        public Builder setFarmaco_arv_id(Integer farmaco_arv_id) {
            this.farmaco_arv_id = farmaco_arv_id;
            return this;
        }

        /**
         * The attribute nome of dosaggio. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The associated object for the role farmaco_ARV_.
         */
        public Builder setFarmaco_ARV_(CliFarmaco_ARVDTO farmaco_ARV_) {
            this.farmaco_ARV_ = farmaco_ARV_;
            return this;
        }


        public CliDosaggioDTO build() {
            CliDosaggioDTO result = new CliDosaggioDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setFarmaco_altro_id(this.farmaco_altro_id);
            result.setFarmaco_arv_id(this.farmaco_arv_id);
            result.setNome(this.nome);
            result.setFarmaco_ARV_(this.farmaco_ARV_);
            return result;
        }

    }
}
