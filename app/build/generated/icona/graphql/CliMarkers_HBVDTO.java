package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Markers_HBV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliMarkers_HBVDTO implements java.io.Serializable {

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
    private String codice_centro;
    private String data;
    private String esito;
    private String genotipo_hbv;
    private Integer lower_limit;
    private String metodica_genoma;
    private String paziente_i;
    private String tipologia_test;
    private String unita_di_misura;
    private Integer valore;
    private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HBV;
    private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia;
    private CliPazienteDTO Paziente_markers_HBV;

    public CliMarkers_HBVDTO() {
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
     * The attribute _createdby of Markers_HBV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Markers_HBV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Markers_HBV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Markers_HBV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Markers_HBV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Markers_HBV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Markers_HBV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Markers_HBV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altra_metodica of Markers_HBV. It is of type String. Max length: 255.
     */
    public String getAltra_metodica() {
        return altra_metodica;
    }
    /**
     * The attribute altra_metodica of Markers_HBV. It is of type String. Max length: 255.
     */
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    /**
     * The attribute altra_unita_di_misura of Markers_HBV. It is of type String. Max length: 255.
     */
    public String getAltra_unita_di_misura() {
        return altra_unita_di_misura;
    }
    /**
     * The attribute altra_unita_di_misura of Markers_HBV. It is of type String. Max length: 255.
     */
    public void setAltra_unita_di_misura(String altra_unita_di_misura) {
        this.altra_unita_di_misura = altra_unita_di_misura;
    }

    /**
     * The attribute codice_centro of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Markers_HBV. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Markers_HBV. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute esito of Markers_HBV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public String getEsito() {
        return esito;
    }
    /**
     * The attribute esito of Markers_HBV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public void setEsito(String esito) {
        this.esito = esito;
    }

    /**
     * The attribute genotipo_hbv of Markers_HBV. It is of type String. Domain: A OR B OR C OR D OR E OR F OR G OR H.}Max length: 255.
     */
    public String getGenotipo_hbv() {
        return genotipo_hbv;
    }
    /**
     * The attribute genotipo_hbv of Markers_HBV. It is of type String. Domain: A OR B OR C OR D OR E OR F OR G OR H.}Max length: 255.
     */
    public void setGenotipo_hbv(String genotipo_hbv) {
        this.genotipo_hbv = genotipo_hbv;
    }

    /**
     * The attribute lower_limit of Markers_HBV. It is of type Int.
     */
    public Integer getLower_limit() {
        return lower_limit;
    }
    /**
     * The attribute lower_limit of Markers_HBV. It is of type Int.
     */
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    /**
     * The attribute metodica_genoma of Markers_HBV. It is of type String. Path: metodica_genoma_HBV nome.
     */
    public String getMetodica_genoma() {
        return metodica_genoma;
    }
    /**
     * The attribute metodica_genoma of Markers_HBV. It is of type String. Path: metodica_genoma_HBV nome.
     */
    public void setMetodica_genoma(String metodica_genoma) {
        this.metodica_genoma = metodica_genoma;
    }

    /**
     * The attribute paziente_i of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_interno. Cannot be null.
     */
    public String getPaziente_i() {
        return paziente_i;
    }
    /**
     * The attribute paziente_i of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_interno. Cannot be null.
     */
    public void setPaziente_i(String paziente_i) {
        this.paziente_i = paziente_i;
    }

    /**
     * The attribute tipologia_test of Markers_HBV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public String getTipologia_test() {
        return tipologia_test;
    }
    /**
     * The attribute tipologia_test of Markers_HBV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public void setTipologia_test(String tipologia_test) {
        this.tipologia_test = tipologia_test;
    }

    /**
     * The attribute unita_di_misura of Markers_HBV. It is of type String. Path: unita_di_misura_viremia nome.
     */
    public String getUnita_di_misura() {
        return unita_di_misura;
    }
    /**
     * The attribute unita_di_misura of Markers_HBV. It is of type String. Path: unita_di_misura_viremia nome.
     */
    public void setUnita_di_misura(String unita_di_misura) {
        this.unita_di_misura = unita_di_misura;
    }

    /**
     * The attribute valore of Markers_HBV. It is of type Int.
     */
    public Integer getValore() {
        return valore;
    }
    /**
     * The attribute valore of Markers_HBV. It is of type Int.
     */
    public void setValore(Integer valore) {
        this.valore = valore;
    }

    /**
     * The associated object for the role metodica_genoma_HBV.
     */
    public CliMetodica_genoma_HCV_HBVDTO getMetodica_genoma_HBV() {
        return metodica_genoma_HBV;
    }
    /**
     * The associated object for the role metodica_genoma_HBV.
     */
    public void setMetodica_genoma_HBV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HBV) {
        this.metodica_genoma_HBV = metodica_genoma_HBV;
    }

    /**
     * The associated object for the role unita_di_misura_viremia.
     */
    public CliUnita_di_misura_viremiaDTO getUnita_di_misura_viremia() {
        return unita_di_misura_viremia;
    }
    /**
     * The associated object for the role unita_di_misura_viremia.
     */
    public void setUnita_di_misura_viremia(CliUnita_di_misura_viremiaDTO unita_di_misura_viremia) {
        this.unita_di_misura_viremia = unita_di_misura_viremia;
    }

    /**
     * The associated object for the role Paziente_markers_HBV.
     */
    public CliPazienteDTO getPaziente_markers_HBV() {
        return Paziente_markers_HBV;
    }
    /**
     * The associated object for the role Paziente_markers_HBV.
     */
    public void setPaziente_markers_HBV(CliPazienteDTO Paziente_markers_HBV) {
        this.Paziente_markers_HBV = Paziente_markers_HBV;
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
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipo_hbv != null) {
            joiner.add("genotipo_hbv: " + GraphQLRequestSerializer.getEntry(genotipo_hbv));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (metodica_genoma != null) {
            joiner.add("metodica_genoma: " + GraphQLRequestSerializer.getEntry(metodica_genoma));
        }
        if (paziente_i != null) {
            joiner.add("paziente_i: " + GraphQLRequestSerializer.getEntry(paziente_i));
        }
        if (tipologia_test != null) {
            joiner.add("tipologia_test: " + GraphQLRequestSerializer.getEntry(tipologia_test));
        }
        if (unita_di_misura != null) {
            joiner.add("unita_di_misura: " + GraphQLRequestSerializer.getEntry(unita_di_misura));
        }
        if (valore != null) {
            joiner.add("valore: " + GraphQLRequestSerializer.getEntry(valore));
        }
        if (metodica_genoma_HBV != null) {
            joiner.add("metodica_genoma_HBV: " + GraphQLRequestSerializer.getEntry(metodica_genoma_HBV));
        }
        if (unita_di_misura_viremia != null) {
            joiner.add("unita_di_misura_viremia: " + GraphQLRequestSerializer.getEntry(unita_di_misura_viremia));
        }
        if (Paziente_markers_HBV != null) {
            joiner.add("Paziente_markers_HBV: " + GraphQLRequestSerializer.getEntry(Paziente_markers_HBV));
        }
        return joiner.toString();
    }

    public static CliMarkers_HBVDTO.Builder builder() {
        return new CliMarkers_HBVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
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
        private String codice_centro;
        private String data;
        private String esito;
        private String genotipo_hbv;
        private Integer lower_limit;
        private String metodica_genoma;
        private String paziente_i;
        private String tipologia_test;
        private String unita_di_misura;
        private Integer valore;
        private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HBV;
        private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia;
        private CliPazienteDTO Paziente_markers_HBV;

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
         * The attribute _createdby of Markers_HBV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Markers_HBV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Markers_HBV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Markers_HBV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Markers_HBV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altra_metodica of Markers_HBV. It is of type String. Max length: 255.
         */
        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        /**
         * The attribute altra_unita_di_misura of Markers_HBV. It is of type String. Max length: 255.
         */
        public Builder setAltra_unita_di_misura(String altra_unita_di_misura) {
            this.altra_unita_di_misura = altra_unita_di_misura;
            return this;
        }

        /**
         * The attribute codice_centro of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Markers_HBV. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute esito of Markers_HBV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
         */
        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The attribute genotipo_hbv of Markers_HBV. It is of type String. Domain: A OR B OR C OR D OR E OR F OR G OR H.}Max length: 255.
         */
        public Builder setGenotipo_hbv(String genotipo_hbv) {
            this.genotipo_hbv = genotipo_hbv;
            return this;
        }

        /**
         * The attribute lower_limit of Markers_HBV. It is of type Int.
         */
        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        /**
         * The attribute metodica_genoma of Markers_HBV. It is of type String. Path: metodica_genoma_HBV nome.
         */
        public Builder setMetodica_genoma(String metodica_genoma) {
            this.metodica_genoma = metodica_genoma;
            return this;
        }

        /**
         * The attribute paziente_i of Markers_HBV. It is of type String. Path: Paziente_markers_HBV codice_interno. Cannot be null.
         */
        public Builder setPaziente_i(String paziente_i) {
            this.paziente_i = paziente_i;
            return this;
        }

        /**
         * The attribute tipologia_test of Markers_HBV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
         */
        public Builder setTipologia_test(String tipologia_test) {
            this.tipologia_test = tipologia_test;
            return this;
        }

        /**
         * The attribute unita_di_misura of Markers_HBV. It is of type String. Path: unita_di_misura_viremia nome.
         */
        public Builder setUnita_di_misura(String unita_di_misura) {
            this.unita_di_misura = unita_di_misura;
            return this;
        }

        /**
         * The attribute valore of Markers_HBV. It is of type Int.
         */
        public Builder setValore(Integer valore) {
            this.valore = valore;
            return this;
        }

        /**
         * The associated object for the role metodica_genoma_HBV.
         */
        public Builder setMetodica_genoma_HBV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HBV) {
            this.metodica_genoma_HBV = metodica_genoma_HBV;
            return this;
        }

        /**
         * The associated object for the role unita_di_misura_viremia.
         */
        public Builder setUnita_di_misura_viremia(CliUnita_di_misura_viremiaDTO unita_di_misura_viremia) {
            this.unita_di_misura_viremia = unita_di_misura_viremia;
            return this;
        }

        /**
         * The associated object for the role Paziente_markers_HBV.
         */
        public Builder setPaziente_markers_HBV(CliPazienteDTO Paziente_markers_HBV) {
            this.Paziente_markers_HBV = Paziente_markers_HBV;
            return this;
        }


        public CliMarkers_HBVDTO build() {
            CliMarkers_HBVDTO result = new CliMarkers_HBVDTO();
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
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setEsito(this.esito);
            result.setGenotipo_hbv(this.genotipo_hbv);
            result.setLower_limit(this.lower_limit);
            result.setMetodica_genoma(this.metodica_genoma);
            result.setPaziente_i(this.paziente_i);
            result.setTipologia_test(this.tipologia_test);
            result.setUnita_di_misura(this.unita_di_misura);
            result.setValore(this.valore);
            result.setMetodica_genoma_HBV(this.metodica_genoma_HBV);
            result.setUnita_di_misura_viremia(this.unita_di_misura_viremia);
            result.setPaziente_markers_HBV(this.Paziente_markers_HBV);
            return result;
        }

    }
}
