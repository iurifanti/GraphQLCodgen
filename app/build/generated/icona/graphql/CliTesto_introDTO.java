package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Testo_intro, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTesto_introDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Integer ordine;
    private String testo;
    private String titolo;
    private CliSettings_PRODTO settings_PRO_;

    public CliTesto_introDTO() {
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
     * The attribute _id of Testo_intro. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Testo_intro. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute ordine of Testo_intro. It is of type Int.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Testo_intro. It is of type Int.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    /**
     * The attribute testo of Testo_intro. It is of type Text.
     */
    public String getTesto() {
        return testo;
    }
    /**
     * The attribute testo of Testo_intro. It is of type Text.
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /**
     * The attribute titolo of Testo_intro. It is of type String. Max length: 255.
     */
    public String getTitolo() {
        return titolo;
    }
    /**
     * The attribute titolo of Testo_intro. It is of type String. Max length: 255.
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
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
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        if (settings_PRO_ != null) {
            joiner.add("settings_PRO_: " + GraphQLRequestSerializer.getEntry(settings_PRO_));
        }
        return joiner.toString();
    }

    public static CliTesto_introDTO.Builder builder() {
        return new CliTesto_introDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Integer ordine;
        private String testo;
        private String titolo;
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
         * The attribute _id of Testo_intro. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute ordine of Testo_intro. It is of type Int.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        /**
         * The attribute testo of Testo_intro. It is of type Text.
         */
        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }

        /**
         * The attribute titolo of Testo_intro. It is of type String. Max length: 255.
         */
        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }

        /**
         * The associated object for the role settings_PRO_.
         */
        public Builder setSettings_PRO_(CliSettings_PRODTO settings_PRO_) {
            this.settings_PRO_ = settings_PRO_;
            return this;
        }


        public CliTesto_introDTO build() {
            CliTesto_introDTO result = new CliTesto_introDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setOrdine(this.ordine);
            result.setTesto(this.testo);
            result.setTitolo(this.titolo);
            result.setSettings_PRO_(this.settings_PRO_);
            return result;
        }

    }
}
