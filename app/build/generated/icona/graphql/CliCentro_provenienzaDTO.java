package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Centro_provenienza, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCentro_provenienzaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean altro;
    private Integer cod;
    private String nome;
    private Boolean visibile;

    public CliCentro_provenienzaDTO() {
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
     * The attribute _id of Centro_provenienza. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Centro_provenienza. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro of Centro_provenienza. It is of type Boolean.
     */
    public Boolean getAltro() {
        return altro;
    }
    /**
     * The attribute altro of Centro_provenienza. It is of type Boolean.
     */
    public void setAltro(Boolean altro) {
        this.altro = altro;
    }

    /**
     * The attribute cod of Centro_provenienza. It is of type Int. Cannot be null.
     */
    public Integer getCod() {
        return cod;
    }
    /**
     * The attribute cod of Centro_provenienza. It is of type Int. Cannot be null.
     */
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    /**
     * The attribute nome of Centro_provenienza. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Centro_provenienza. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute visibile of Centro_provenienza. It is of type Boolean.
     */
    public Boolean getVisibile() {
        return visibile;
    }
    /**
     * The attribute visibile of Centro_provenienza. It is of type Boolean.
     */
    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
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
        if (cod != null) {
            joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (visibile != null) {
            joiner.add("visibile: " + GraphQLRequestSerializer.getEntry(visibile));
        }
        return joiner.toString();
    }

    public static CliCentro_provenienzaDTO.Builder builder() {
        return new CliCentro_provenienzaDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean altro;
        private Integer cod;
        private String nome;
        private Boolean visibile;

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
         * The attribute _id of Centro_provenienza. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro of Centro_provenienza. It is of type Boolean.
         */
        public Builder setAltro(Boolean altro) {
            this.altro = altro;
            return this;
        }

        /**
         * The attribute cod of Centro_provenienza. It is of type Int. Cannot be null.
         */
        public Builder setCod(Integer cod) {
            this.cod = cod;
            return this;
        }

        /**
         * The attribute nome of Centro_provenienza. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute visibile of Centro_provenienza. It is of type Boolean.
         */
        public Builder setVisibile(Boolean visibile) {
            this.visibile = visibile;
            return this;
        }


        public CliCentro_provenienzaDTO build() {
            CliCentro_provenienzaDTO result = new CliCentro_provenienzaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltro(this.altro);
            result.setCod(this.cod);
            result.setNome(this.nome);
            result.setVisibile(this.visibile);
            return result;
        }

    }
}
