package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Checks, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliChecksDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String check_id;
    private String codice_centro_h;
    private String codice_centro_i;
    private String codice_hepa;
    private String codice_ico;
    private String descrizione;
    private String note;
    private Boolean risolto;
    private String specifiche;
    private CliH_PazienteDTO h_Paziente_;
    private CliO_PazienteDTO o_paziente_;
    private CliPazienteDTO paziente_;

    public CliChecksDTO() {
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
     * The attribute _id of Checks. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Checks. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute check_id of Checks. It is of type String. Max length: 255.
     */
    public String getCheck_id() {
        return check_id;
    }
    /**
     * The attribute check_id of Checks. It is of type String. Max length: 255.
     */
    public void setCheck_id(String check_id) {
        this.check_id = check_id;
    }

    /**
     * The attribute codice_centro_h of Checks. It is of type String. Path: h_Paziente_.centro codice_centro.
     */
    public String getCodice_centro_h() {
        return codice_centro_h;
    }
    /**
     * The attribute codice_centro_h of Checks. It is of type String. Path: h_Paziente_.centro codice_centro.
     */
    public void setCodice_centro_h(String codice_centro_h) {
        this.codice_centro_h = codice_centro_h;
    }

    /**
     * The attribute codice_centro_i of Checks. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro_i() {
        return codice_centro_i;
    }
    /**
     * The attribute codice_centro_i of Checks. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro_i(String codice_centro_i) {
        this.codice_centro_i = codice_centro_i;
    }

    /**
     * The attribute codice_hepa of Checks. It is of type String. Path: h_Paziente_ codice_interno. Cannot be null.
     */
    public String getCodice_hepa() {
        return codice_hepa;
    }
    /**
     * The attribute codice_hepa of Checks. It is of type String. Path: h_Paziente_ codice_interno. Cannot be null.
     */
    public void setCodice_hepa(String codice_hepa) {
        this.codice_hepa = codice_hepa;
    }

    /**
     * The attribute codice_ico of Checks. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public String getCodice_ico() {
        return codice_ico;
    }
    /**
     * The attribute codice_ico of Checks. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public void setCodice_ico(String codice_ico) {
        this.codice_ico = codice_ico;
    }

    /**
     * The attribute descrizione of Checks. It is of type String. Max length: 255.
     */
    public String getDescrizione() {
        return descrizione;
    }
    /**
     * The attribute descrizione of Checks. It is of type String. Max length: 255.
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * The attribute note of Checks. It is of type Text.
     */
    public String getNote() {
        return note;
    }
    /**
     * The attribute note of Checks. It is of type Text.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The attribute risolto of Checks. It is of type Boolean.
     */
    public Boolean getRisolto() {
        return risolto;
    }
    /**
     * The attribute risolto of Checks. It is of type Boolean.
     */
    public void setRisolto(Boolean risolto) {
        this.risolto = risolto;
    }

    /**
     * The attribute specifiche of Checks. It is of type Text.
     */
    public String getSpecifiche() {
        return specifiche;
    }
    /**
     * The attribute specifiche of Checks. It is of type Text.
     */
    public void setSpecifiche(String specifiche) {
        this.specifiche = specifiche;
    }

    /**
     * The associated object for the role h_Paziente_.
     */
    public CliH_PazienteDTO getH_Paziente_() {
        return h_Paziente_;
    }
    /**
     * The associated object for the role h_Paziente_.
     */
    public void setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
        this.h_Paziente_ = h_Paziente_;
    }

    /**
     * The associated object for the role o_paziente_.
     */
    public CliO_PazienteDTO getO_paziente_() {
        return o_paziente_;
    }
    /**
     * The associated object for the role o_paziente_.
     */
    public void setO_paziente_(CliO_PazienteDTO o_paziente_) {
        this.o_paziente_ = o_paziente_;
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
        if (check_id != null) {
            joiner.add("check_id: " + GraphQLRequestSerializer.getEntry(check_id));
        }
        if (codice_centro_h != null) {
            joiner.add("codice_centro_h: " + GraphQLRequestSerializer.getEntry(codice_centro_h));
        }
        if (codice_centro_i != null) {
            joiner.add("codice_centro_i: " + GraphQLRequestSerializer.getEntry(codice_centro_i));
        }
        if (codice_hepa != null) {
            joiner.add("codice_hepa: " + GraphQLRequestSerializer.getEntry(codice_hepa));
        }
        if (codice_ico != null) {
            joiner.add("codice_ico: " + GraphQLRequestSerializer.getEntry(codice_ico));
        }
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (risolto != null) {
            joiner.add("risolto: " + GraphQLRequestSerializer.getEntry(risolto));
        }
        if (specifiche != null) {
            joiner.add("specifiche: " + GraphQLRequestSerializer.getEntry(specifiche));
        }
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (o_paziente_ != null) {
            joiner.add("o_paziente_: " + GraphQLRequestSerializer.getEntry(o_paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliChecksDTO.Builder builder() {
        return new CliChecksDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String check_id;
        private String codice_centro_h;
        private String codice_centro_i;
        private String codice_hepa;
        private String codice_ico;
        private String descrizione;
        private String note;
        private Boolean risolto;
        private String specifiche;
        private CliH_PazienteDTO h_Paziente_;
        private CliO_PazienteDTO o_paziente_;
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
         * The attribute _id of Checks. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute check_id of Checks. It is of type String. Max length: 255.
         */
        public Builder setCheck_id(String check_id) {
            this.check_id = check_id;
            return this;
        }

        /**
         * The attribute codice_centro_h of Checks. It is of type String. Path: h_Paziente_.centro codice_centro.
         */
        public Builder setCodice_centro_h(String codice_centro_h) {
            this.codice_centro_h = codice_centro_h;
            return this;
        }

        /**
         * The attribute codice_centro_i of Checks. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro_i(String codice_centro_i) {
            this.codice_centro_i = codice_centro_i;
            return this;
        }

        /**
         * The attribute codice_hepa of Checks. It is of type String. Path: h_Paziente_ codice_interno. Cannot be null.
         */
        public Builder setCodice_hepa(String codice_hepa) {
            this.codice_hepa = codice_hepa;
            return this;
        }

        /**
         * The attribute codice_ico of Checks. It is of type String. Path: paziente_ codice_interno. Cannot be null.
         */
        public Builder setCodice_ico(String codice_ico) {
            this.codice_ico = codice_ico;
            return this;
        }

        /**
         * The attribute descrizione of Checks. It is of type String. Max length: 255.
         */
        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * The attribute note of Checks. It is of type Text.
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The attribute risolto of Checks. It is of type Boolean.
         */
        public Builder setRisolto(Boolean risolto) {
            this.risolto = risolto;
            return this;
        }

        /**
         * The attribute specifiche of Checks. It is of type Text.
         */
        public Builder setSpecifiche(String specifiche) {
            this.specifiche = specifiche;
            return this;
        }

        /**
         * The associated object for the role h_Paziente_.
         */
        public Builder setH_Paziente_(CliH_PazienteDTO h_Paziente_) {
            this.h_Paziente_ = h_Paziente_;
            return this;
        }

        /**
         * The associated object for the role o_paziente_.
         */
        public Builder setO_paziente_(CliO_PazienteDTO o_paziente_) {
            this.o_paziente_ = o_paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliChecksDTO build() {
            CliChecksDTO result = new CliChecksDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCheck_id(this.check_id);
            result.setCodice_centro_h(this.codice_centro_h);
            result.setCodice_centro_i(this.codice_centro_i);
            result.setCodice_hepa(this.codice_hepa);
            result.setCodice_ico(this.codice_ico);
            result.setDescrizione(this.descrizione);
            result.setNote(this.note);
            result.setRisolto(this.risolto);
            result.setSpecifiche(this.specifiche);
            result.setH_Paziente_(this.h_Paziente_);
            result.setO_paziente_(this.o_paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
