package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Questionario_PRO, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PRODTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String data_compilazione;
    private String mese;
    private CliPazienteDTO paziente_;

    public CliQuestionario_PRODTO() {
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
     * The attribute _id of Questionario_PRO. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Questionario_PRO. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute data_compilazione of Questionario_PRO. It is of type Date @dateFormat.
     */
    public String getData_compilazione() {
        return data_compilazione;
    }
    /**
     * The attribute data_compilazione of Questionario_PRO. It is of type Date @dateFormat.
     */
    public void setData_compilazione(String data_compilazione) {
        this.data_compilazione = data_compilazione;
    }

    /**
     * The attribute mese of Questionario_PRO. It is of type String. Domain: Baseline OR 6 mesi OR 12 mesi.}Max length: 255.
     */
    public String getMese() {
        return mese;
    }
    /**
     * The attribute mese of Questionario_PRO. It is of type String. Domain: Baseline OR 6 mesi OR 12 mesi.}Max length: 255.
     */
    public void setMese(String mese) {
        this.mese = mese;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
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
        if (data_compilazione != null) {
            joiner.add("data_compilazione: " + GraphQLRequestSerializer.getEntry(data_compilazione));
        }
        if (mese != null) {
            joiner.add("mese: " + GraphQLRequestSerializer.getEntry(mese));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliQuestionario_PRODTO.Builder builder() {
        return new CliQuestionario_PRODTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String data_compilazione;
        private String mese;
        private CliPazienteDTO paziente_;

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
         * The attribute _id of Questionario_PRO. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute data_compilazione of Questionario_PRO. It is of type Date @dateFormat.
         */
        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        /**
         * The attribute mese of Questionario_PRO. It is of type String. Domain: Baseline OR 6 mesi OR 12 mesi.}Max length: 255.
         */
        public Builder setMese(String mese) {
            this.mese = mese;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliQuestionario_PRODTO build() {
            CliQuestionario_PRODTO result = new CliQuestionario_PRODTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setData_compilazione(this.data_compilazione);
            result.setMese(this.mese);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
