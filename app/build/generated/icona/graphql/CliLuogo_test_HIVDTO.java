package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Luogo_test_HIV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliLuogo_test_HIVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean altro;
    private String nome;

    public CliLuogo_test_HIVDTO() {
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
     * The attribute _id of Luogo_test_HIV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Luogo_test_HIV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro of Luogo_test_HIV. It is of type Boolean.
     */
    public Boolean getAltro() {
        return altro;
    }
    /**
     * The attribute altro of Luogo_test_HIV. It is of type Boolean.
     */
    public void setAltro(Boolean altro) {
        this.altro = altro;
    }

    /**
     * The attribute nome of Luogo_test_HIV. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Luogo_test_HIV. It is of type String. Max length: 255.Cannot be null.
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
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliLuogo_test_HIVDTO.Builder builder() {
        return new CliLuogo_test_HIVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean altro;
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
         * The attribute _id of Luogo_test_HIV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro of Luogo_test_HIV. It is of type Boolean.
         */
        public Builder setAltro(Boolean altro) {
            this.altro = altro;
            return this;
        }

        /**
         * The attribute nome of Luogo_test_HIV. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliLuogo_test_HIVDTO build() {
            CliLuogo_test_HIVDTO result = new CliLuogo_test_HIVDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltro(this.altro);
            result.setNome(this.nome);
            return result;
        }

    }
}
