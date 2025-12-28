package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Range_BMI, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliRange_BMIDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String colore;
    private String messaggio;
    private String min;
    private CliSettings_PRODTO settings_PRO_;

    public CliRange_BMIDTO() {
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
     * The attribute _id of Range_BMI. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Range_BMI. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute colore of Range_BMI. It is of type String. Domain: V OR G OR R.}Max length: 255.
     */
    public String getColore() {
        return colore;
    }
    /**
     * The attribute colore of Range_BMI. It is of type String. Domain: V OR G OR R.}Max length: 255.
     */
    public void setColore(String colore) {
        this.colore = colore;
    }

    /**
     * The attribute messaggio of Range_BMI. It is of type Text.
     */
    public String getMessaggio() {
        return messaggio;
    }
    /**
     * The attribute messaggio of Range_BMI. It is of type Text.
     */
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    /**
     * The attribute min of Range_BMI. It is of type Real @realFormat.
     */
    public String getMin() {
        return min;
    }
    /**
     * The attribute min of Range_BMI. It is of type Real @realFormat.
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * The associated object for the role settings_PRO_.
     */
    public CliSettings_PRODTO getSettings_PRO_() {
        return settings_PRO_;
    }
    /**
     * The associated object for the role settings_PRO_.
     */
    public void setSettings_PRO_(CliSettings_PRODTO settings_PRO_) {
        this.settings_PRO_ = settings_PRO_;
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
        if (colore != null) {
            joiner.add("colore: " + GraphQLRequestSerializer.getEntry(colore));
        }
        if (messaggio != null) {
            joiner.add("messaggio: " + GraphQLRequestSerializer.getEntry(messaggio));
        }
        if (min != null) {
            joiner.add("min: " + GraphQLRequestSerializer.getEntry(min));
        }
        if (settings_PRO_ != null) {
            joiner.add("settings_PRO_: " + GraphQLRequestSerializer.getEntry(settings_PRO_));
        }
        return joiner.toString();
    }

    public static CliRange_BMIDTO.Builder builder() {
        return new CliRange_BMIDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String colore;
        private String messaggio;
        private String min;
        private CliSettings_PRODTO settings_PRO_;

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
         * The attribute _id of Range_BMI. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute colore of Range_BMI. It is of type String. Domain: V OR G OR R.}Max length: 255.
         */
        public Builder setColore(String colore) {
            this.colore = colore;
            return this;
        }

        /**
         * The attribute messaggio of Range_BMI. It is of type Text.
         */
        public Builder setMessaggio(String messaggio) {
            this.messaggio = messaggio;
            return this;
        }

        /**
         * The attribute min of Range_BMI. It is of type Real @realFormat.
         */
        public Builder setMin(String min) {
            this.min = min;
            return this;
        }

        /**
         * The associated object for the role settings_PRO_.
         */
        public Builder setSettings_PRO_(CliSettings_PRODTO settings_PRO_) {
            this.settings_PRO_ = settings_PRO_;
            return this;
        }


        public CliRange_BMIDTO build() {
            CliRange_BMIDTO result = new CliRange_BMIDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setColore(this.colore);
            result.setMessaggio(this.messaggio);
            result.setMin(this.min);
            result.setSettings_PRO_(this.settings_PRO_);
            return result;
        }

    }
}
