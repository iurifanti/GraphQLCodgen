package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Markers_HDV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HDVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altra_metodica;
    private String altra_unita_di_misura;
    private String altro_genotipo;
    private String data;
    private String esito;
    private String genotipo_hdv;
    private Integer lower_limit;
    private String sottotipo;
    private String tipologia_test;
    private Integer valore;
    private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HDV;
    private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia_;
    private CliH_PazienteDTO h_Paziente_;
    private CliPazienteDTO paziente_;

    public CliMarkers_HDVDTO() {
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
     * The attribute _createdby of Markers_HDV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Markers_HDV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Markers_HDV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Markers_HDV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Markers_HDV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Markers_HDV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Markers_HDV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Markers_HDV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altra_metodica of Markers_HDV. It is of type String. Max length: 255.
     */
    public String getAltra_metodica() {
        return altra_metodica;
    }
    /**
     * The attribute altra_metodica of Markers_HDV. It is of type String. Max length: 255.
     */
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    /**
     * The attribute altra_unita_di_misura of Markers_HDV. It is of type String. Max length: 255.
     */
    public String getAltra_unita_di_misura() {
        return altra_unita_di_misura;
    }
    /**
     * The attribute altra_unita_di_misura of Markers_HDV. It is of type String. Max length: 255.
     */
    public void setAltra_unita_di_misura(String altra_unita_di_misura) {
        this.altra_unita_di_misura = altra_unita_di_misura;
    }

    /**
     * The attribute altro_genotipo of Markers_HDV. It is of type String. Max length: 255.
     */
    public String getAltro_genotipo() {
        return altro_genotipo;
    }
    /**
     * The attribute altro_genotipo of Markers_HDV. It is of type String. Max length: 255.
     */
    public void setAltro_genotipo(String altro_genotipo) {
        this.altro_genotipo = altro_genotipo;
    }

    /**
     * The attribute data of Markers_HDV. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Markers_HDV. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute esito of Markers_HDV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public String getEsito() {
        return esito;
    }
    /**
     * The attribute esito of Markers_HDV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public void setEsito(String esito) {
        this.esito = esito;
    }

    /**
     * The attribute genotipo_hdv of Markers_HDV. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5 OR 6 OR 7 OR 8.}Max length: 255.
     */
    public String getGenotipo_hdv() {
        return genotipo_hdv;
    }
    /**
     * The attribute genotipo_hdv of Markers_HDV. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5 OR 6 OR 7 OR 8.}Max length: 255.
     */
    public void setGenotipo_hdv(String genotipo_hdv) {
        this.genotipo_hdv = genotipo_hdv;
    }

    /**
     * The attribute lower_limit of Markers_HDV. It is of type Int.
     */
    public Integer getLower_limit() {
        return lower_limit;
    }
    /**
     * The attribute lower_limit of Markers_HDV. It is of type Int.
     */
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    /**
     * The attribute sottotipo of Markers_HDV. It is of type String. Max length: 255.
     */
    public String getSottotipo() {
        return sottotipo;
    }
    /**
     * The attribute sottotipo of Markers_HDV. It is of type String. Max length: 255.
     */
    public void setSottotipo(String sottotipo) {
        this.sottotipo = sottotipo;
    }

    /**
     * The attribute tipologia_test of Markers_HDV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public String getTipologia_test() {
        return tipologia_test;
    }
    /**
     * The attribute tipologia_test of Markers_HDV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public void setTipologia_test(String tipologia_test) {
        this.tipologia_test = tipologia_test;
    }

    /**
     * The attribute valore of Markers_HDV. It is of type Int.
     */
    public Integer getValore() {
        return valore;
    }
    /**
     * The attribute valore of Markers_HDV. It is of type Int.
     */
    public void setValore(Integer valore) {
        this.valore = valore;
    }

    /**
     * The associated object for the role metodica_genoma_HDV.
     */
    public CliMetodica_genoma_HCV_HBVDTO getMetodica_genoma_HDV() {
        return metodica_genoma_HDV;
    }
    /**
     * The associated object for the role metodica_genoma_HDV.
     */
    public void setMetodica_genoma_HDV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HDV) {
        this.metodica_genoma_HDV = metodica_genoma_HDV;
    }

    /**
     * The associated object for the role unita_di_misura_viremia_.
     */
    public CliUnita_di_misura_viremiaDTO getUnita_di_misura_viremia_() {
        return unita_di_misura_viremia_;
    }
    /**
     * The associated object for the role unita_di_misura_viremia_.
     */
    public void setUnita_di_misura_viremia_(CliUnita_di_misura_viremiaDTO unita_di_misura_viremia_) {
        this.unita_di_misura_viremia_ = unita_di_misura_viremia_;
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
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
        }
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altra_unita_di_misura != null) {
            joiner.add("altra_unita_di_misura: " + GraphQLRequestSerializer.getEntry(altra_unita_di_misura));
        }
        if (altro_genotipo != null) {
            joiner.add("altro_genotipo: " + GraphQLRequestSerializer.getEntry(altro_genotipo));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipo_hdv != null) {
            joiner.add("genotipo_hdv: " + GraphQLRequestSerializer.getEntry(genotipo_hdv));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (sottotipo != null) {
            joiner.add("sottotipo: " + GraphQLRequestSerializer.getEntry(sottotipo));
        }
        if (tipologia_test != null) {
            joiner.add("tipologia_test: " + GraphQLRequestSerializer.getEntry(tipologia_test));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (metodica_genoma_HDV != null) {
            joiner.add("metodica_genoma_HDV: " + GraphQLRequestSerializer.getEntry(metodica_genoma_HDV));
        }
        if (unita_di_misura_viremia_ != null) {
            joiner.add("unita_di_misura_viremia_: " + GraphQLRequestSerializer.getEntry(unita_di_misura_viremia_));
        }
        if (h_Paziente_ != null) {
            joiner.add("h_Paziente_: " + GraphQLRequestSerializer.getEntry(h_Paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliMarkers_HDVDTO.Builder builder() {
        return new CliMarkers_HDVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String altra_metodica;
        private String altra_unita_di_misura;
        private String altro_genotipo;
        private String data;
        private String esito;
        private String genotipo_hdv;
        private Integer lower_limit;
        private String sottotipo;
        private String tipologia_test;
        private Integer valore;
        private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HDV;
        private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia_;
        private CliH_PazienteDTO h_Paziente_;
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
         * The attribute _createdby of Markers_HDV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Markers_HDV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Markers_HDV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Markers_HDV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Markers_HDV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altra_metodica of Markers_HDV. It is of type String. Max length: 255.
         */
        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        /**
         * The attribute altra_unita_di_misura of Markers_HDV. It is of type String. Max length: 255.
         */
        public Builder setAltra_unita_di_misura(String altra_unita_di_misura) {
            this.altra_unita_di_misura = altra_unita_di_misura;
            return this;
        }

        /**
         * The attribute altro_genotipo of Markers_HDV. It is of type String. Max length: 255.
         */
        public Builder setAltro_genotipo(String altro_genotipo) {
            this.altro_genotipo = altro_genotipo;
            return this;
        }

        /**
         * The attribute data of Markers_HDV. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute esito of Markers_HDV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
         */
        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The attribute genotipo_hdv of Markers_HDV. It is of type String. Domain: 1 OR 2 OR 3 OR 4 OR 5 OR 6 OR 7 OR 8.}Max length: 255.
         */
        public Builder setGenotipo_hdv(String genotipo_hdv) {
            this.genotipo_hdv = genotipo_hdv;
            return this;
        }

        /**
         * The attribute lower_limit of Markers_HDV. It is of type Int.
         */
        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        /**
         * The attribute sottotipo of Markers_HDV. It is of type String. Max length: 255.
         */
        public Builder setSottotipo(String sottotipo) {
            this.sottotipo = sottotipo;
            return this;
        }

        /**
         * The attribute tipologia_test of Markers_HDV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
         */
        public Builder setTipologia_test(String tipologia_test) {
            this.tipologia_test = tipologia_test;
            return this;
        }

        /**
         * The attribute valore of Markers_HDV. It is of type Int.
         */
        public Builder setValore(Integer valore) {
            this.valore = valore;
            return this;
        }

        /**
         * The associated object for the role metodica_genoma_HDV.
         */
        public Builder setMetodica_genoma_HDV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HDV) {
            this.metodica_genoma_HDV = metodica_genoma_HDV;
            return this;
        }

        /**
         * The associated object for the role unita_di_misura_viremia_.
         */
        public Builder setUnita_di_misura_viremia_(CliUnita_di_misura_viremiaDTO unita_di_misura_viremia_) {
            this.unita_di_misura_viremia_ = unita_di_misura_viremia_;
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
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliMarkers_HDVDTO build() {
            CliMarkers_HDVDTO result = new CliMarkers_HDVDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltra_unita_di_misura(this.altra_unita_di_misura);
            result.setAltro_genotipo(this.altro_genotipo);
            result.setData(this.data);
            result.setEsito(this.esito);
            result.setGenotipo_hdv(this.genotipo_hdv);
            result.setLower_limit(this.lower_limit);
            result.setSottotipo(this.sottotipo);
            result.setTipologia_test(this.tipologia_test);
            result.setValore(this.valore);
            result.setMetodica_genoma_HDV(this.metodica_genoma_HDV);
            result.setUnita_di_misura_viremia_(this.unita_di_misura_viremia_);
            result.setH_Paziente_(this.h_Paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
