package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Indicazioni_arruolamento_studi, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliIndicazioni_arruolamento_studiDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private CliFileInfoDTO documento;
    private String studio;

    public CliIndicazioni_arruolamento_studiDTO() {
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
     * The attribute _id of Indicazioni_arruolamento_studi. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Indicazioni_arruolamento_studi. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute documento of Indicazioni_arruolamento_studi. It is of type FileInfo.
     */
    public CliFileInfoDTO getDocumento() {
        return documento;
    }
    /**
     * The attribute documento of Indicazioni_arruolamento_studi. It is of type FileInfo.
     */
    public void setDocumento(CliFileInfoDTO documento) {
        this.documento = documento;
    }

    /**
     * The attribute studio of Indicazioni_arruolamento_studi. It is of type String. Max length: 255.
     */
    public String getStudio() {
        return studio;
    }
    /**
     * The attribute studio of Indicazioni_arruolamento_studi. It is of type String. Max length: 255.
     */
    public void setStudio(String studio) {
        this.studio = studio;
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
        if (documento != null) {
            joiner.add("documento: " + GraphQLRequestSerializer.getEntry(documento));
        }
        if (studio != null) {
            joiner.add("studio: " + GraphQLRequestSerializer.getEntry(studio));
        }
        return joiner.toString();
    }

    public static CliIndicazioni_arruolamento_studiDTO.Builder builder() {
        return new CliIndicazioni_arruolamento_studiDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private CliFileInfoDTO documento;
        private String studio;

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
         * The attribute _id of Indicazioni_arruolamento_studi. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute documento of Indicazioni_arruolamento_studi. It is of type FileInfo.
         */
        public Builder setDocumento(CliFileInfoDTO documento) {
            this.documento = documento;
            return this;
        }

        /**
         * The attribute studio of Indicazioni_arruolamento_studi. It is of type String. Max length: 255.
         */
        public Builder setStudio(String studio) {
            this.studio = studio;
            return this;
        }


        public CliIndicazioni_arruolamento_studiDTO build() {
            CliIndicazioni_arruolamento_studiDTO result = new CliIndicazioni_arruolamento_studiDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setDocumento(this.documento);
            result.setStudio(this.studio);
            return result;
        }

    }
}
