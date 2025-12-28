package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Classificazione_ICD10, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliClassificazione_ICD10DTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String codice;
    private String descrizione;

    public CliClassificazione_ICD10DTO() {
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
     * The attribute _id of Classificazione_ICD10. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Classificazione_ICD10. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute codice of Classificazione_ICD10. It is of type String. Max length: 255.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Classificazione_ICD10. It is of type String. Max length: 255.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute descrizione of Classificazione_ICD10. It is of type String. Max length: 255.
     */
    public String getDescrizione() {
        return descrizione;
    }
    /**
     * The attribute descrizione of Classificazione_ICD10. It is of type String. Max length: 255.
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        return joiner.toString();
    }

    public static CliClassificazione_ICD10DTO.Builder builder() {
        return new CliClassificazione_ICD10DTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String codice;
        private String descrizione;

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
         * The attribute _id of Classificazione_ICD10. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute codice of Classificazione_ICD10. It is of type String. Max length: 255.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute descrizione of Classificazione_ICD10. It is of type String. Max length: 255.
         */
        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }


        public CliClassificazione_ICD10DTO build() {
            CliClassificazione_ICD10DTO result = new CliClassificazione_ICD10DTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCodice(this.codice);
            result.setDescrizione(this.descrizione);
            return result;
        }

    }
}
