package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class SVR, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliSVRDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String altro_svr;
    private Boolean clearance_spontanea;
    private String data_valutazione;
    private String svr;
    private String terapia;
    private CliPazienteDTO paziente_;

    public CliSVRDTO() {
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
     * The attribute _id of SVR. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of SVR. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro_svr of SVR. It is of type Text.
     */
    public String getAltro_svr() {
        return altro_svr;
    }
    /**
     * The attribute altro_svr of SVR. It is of type Text.
     */
    public void setAltro_svr(String altro_svr) {
        this.altro_svr = altro_svr;
    }

    /**
     * The attribute clearance_spontanea of SVR. It is of type Boolean.
     */
    public Boolean getClearance_spontanea() {
        return clearance_spontanea;
    }
    /**
     * The attribute clearance_spontanea of SVR. It is of type Boolean.
     */
    public void setClearance_spontanea(Boolean clearance_spontanea) {
        this.clearance_spontanea = clearance_spontanea;
    }

    /**
     * The attribute data_valutazione of SVR. It is of type Date @dateFormat.
     */
    public String getData_valutazione() {
        return data_valutazione;
    }
    /**
     * The attribute data_valutazione of SVR. It is of type Date @dateFormat.
     */
    public void setData_valutazione(String data_valutazione) {
        this.data_valutazione = data_valutazione;
    }

    /**
     * The attribute svr of SVR. It is of type String. Domain: Si OR No OR Non applicabile (specificare motivo).}Max length: 255.
     */
    public String getSvr() {
        return svr;
    }
    /**
     * The attribute svr of SVR. It is of type String. Domain: Si OR No OR Non applicabile (specificare motivo).}Max length: 255.
     */
    public void setSvr(String svr) {
        this.svr = svr;
    }

    /**
     * The attribute terapia of SVR. It is of type String. Max length: 255.
     */
    public String getTerapia() {
        return terapia;
    }
    /**
     * The attribute terapia of SVR. It is of type String. Max length: 255.
     */
    public void setTerapia(String terapia) {
        this.terapia = terapia;
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
        if (altro_svr != null) {
            joiner.add("altro_svr: " + GraphQLRequestSerializer.getEntry(altro_svr));
        }
        if (clearance_spontanea != null) {
            joiner.add("clearance_spontanea: " + GraphQLRequestSerializer.getEntry(clearance_spontanea));
        }
        if (data_valutazione != null) {
            joiner.add("data_valutazione: " + GraphQLRequestSerializer.getEntry(data_valutazione));
        }
        if (svr != null) {
            joiner.add("svr: " + GraphQLRequestSerializer.getEntry(svr));
        }
        if (terapia != null) {
            joiner.add("terapia: " + GraphQLRequestSerializer.getEntry(terapia));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliSVRDTO.Builder builder() {
        return new CliSVRDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String altro_svr;
        private Boolean clearance_spontanea;
        private String data_valutazione;
        private String svr;
        private String terapia;
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
         * The attribute _id of SVR. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro_svr of SVR. It is of type Text.
         */
        public Builder setAltro_svr(String altro_svr) {
            this.altro_svr = altro_svr;
            return this;
        }

        /**
         * The attribute clearance_spontanea of SVR. It is of type Boolean.
         */
        public Builder setClearance_spontanea(Boolean clearance_spontanea) {
            this.clearance_spontanea = clearance_spontanea;
            return this;
        }

        /**
         * The attribute data_valutazione of SVR. It is of type Date @dateFormat.
         */
        public Builder setData_valutazione(String data_valutazione) {
            this.data_valutazione = data_valutazione;
            return this;
        }

        /**
         * The attribute svr of SVR. It is of type String. Domain: Si OR No OR Non applicabile (specificare motivo).}Max length: 255.
         */
        public Builder setSvr(String svr) {
            this.svr = svr;
            return this;
        }

        /**
         * The attribute terapia of SVR. It is of type String. Max length: 255.
         */
        public Builder setTerapia(String terapia) {
            this.terapia = terapia;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliSVRDTO build() {
            CliSVRDTO result = new CliSVRDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltro_svr(this.altro_svr);
            result.setClearance_spontanea(this.clearance_spontanea);
            result.setData_valutazione(this.data_valutazione);
            result.setSvr(this.svr);
            result.setTerapia(this.terapia);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
