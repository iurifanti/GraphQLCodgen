package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Markers_HCV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HCVDTO implements java.io.Serializable {

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
    private String codice_centro;
    private String data;
    private String esito;
    private String genotipo;
    private Integer lower_limit;
    private String metodica_genoma;
    private String paziente;
    private String tipologia_test;
    private String unita_di_misura;
    private Integer valore;
    private CliGenotipo_HCVDTO genotipo_HCV;
    private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HCV;
    private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia;
    private CliPazienteDTO Paziente_markers_HCV;

    public CliMarkers_HCVDTO() {
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
     * The attribute _createdby of Markers_HCV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Markers_HCV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Markers_HCV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Markers_HCV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Markers_HCV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Markers_HCV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Markers_HCV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Markers_HCV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altra_metodica of Markers_HCV. It is of type String. Max length: 255.
     */
    public String getAltra_metodica() {
        return altra_metodica;
    }
    /**
     * The attribute altra_metodica of Markers_HCV. It is of type String. Max length: 255.
     */
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    /**
     * The attribute altra_unita_di_misura of Markers_HCV. It is of type String. Max length: 255.
     */
    public String getAltra_unita_di_misura() {
        return altra_unita_di_misura;
    }
    /**
     * The attribute altra_unita_di_misura of Markers_HCV. It is of type String. Max length: 255.
     */
    public void setAltra_unita_di_misura(String altra_unita_di_misura) {
        this.altra_unita_di_misura = altra_unita_di_misura;
    }

    /**
     * The attribute altro_genotipo of Markers_HCV. It is of type String. Max length: 255.
     */
    public String getAltro_genotipo() {
        return altro_genotipo;
    }
    /**
     * The attribute altro_genotipo of Markers_HCV. It is of type String. Max length: 255.
     */
    public void setAltro_genotipo(String altro_genotipo) {
        this.altro_genotipo = altro_genotipo;
    }

    /**
     * The attribute codice_centro of Markers_HCV. It is of type String. Path: Paziente_markers_HCV.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Markers_HCV. It is of type String. Path: Paziente_markers_HCV.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Markers_HCV. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Markers_HCV. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute esito of Markers_HCV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public String getEsito() {
        return esito;
    }
    /**
     * The attribute esito of Markers_HCV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
     */
    public void setEsito(String esito) {
        this.esito = esito;
    }

    /**
     * The attribute genotipo of Markers_HCV. It is of type String. Path: genotipo_HCV nome.
     */
    public String getGenotipo() {
        return genotipo;
    }
    /**
     * The attribute genotipo of Markers_HCV. It is of type String. Path: genotipo_HCV nome.
     */
    public void setGenotipo(String genotipo) {
        this.genotipo = genotipo;
    }

    /**
     * The attribute lower_limit of Markers_HCV. It is of type Int.
     */
    public Integer getLower_limit() {
        return lower_limit;
    }
    /**
     * The attribute lower_limit of Markers_HCV. It is of type Int.
     */
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    /**
     * The attribute metodica_genoma of Markers_HCV. It is of type String. Path: metodica_genoma_HCV nome.
     */
    public String getMetodica_genoma() {
        return metodica_genoma;
    }
    /**
     * The attribute metodica_genoma of Markers_HCV. It is of type String. Path: metodica_genoma_HCV nome.
     */
    public void setMetodica_genoma(String metodica_genoma) {
        this.metodica_genoma = metodica_genoma;
    }

    /**
     * The attribute paziente of Markers_HCV. It is of type String. Path: Paziente_markers_HCV codice_interno. Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Markers_HCV. It is of type String. Path: Paziente_markers_HCV codice_interno. Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute tipologia_test of Markers_HCV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public String getTipologia_test() {
        return tipologia_test;
    }
    /**
     * The attribute tipologia_test of Markers_HCV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
     */
    public void setTipologia_test(String tipologia_test) {
        this.tipologia_test = tipologia_test;
    }

    /**
     * The attribute unita_di_misura of Markers_HCV. It is of type String. Path: unita_di_misura_viremia nome.
     */
    public String getUnita_di_misura() {
        return unita_di_misura;
    }
    /**
     * The attribute unita_di_misura of Markers_HCV. It is of type String. Path: unita_di_misura_viremia nome.
     */
    public void setUnita_di_misura(String unita_di_misura) {
        this.unita_di_misura = unita_di_misura;
    }

    /**
     * The attribute valore of Markers_HCV. It is of type Int.
     */
    public Integer getValore() {
        return valore;
    }
    /**
     * The attribute valore of Markers_HCV. It is of type Int.
     */
    public void setValore(Integer valore) {
        this.valore = valore;
    }

    /**
     * The associated object for the role genotipo_HCV.
     */
    public CliGenotipo_HCVDTO getGenotipo_HCV() {
        return genotipo_HCV;
    }
    /**
     * The associated object for the role genotipo_HCV.
     */
    public void setGenotipo_HCV(CliGenotipo_HCVDTO genotipo_HCV) {
        this.genotipo_HCV = genotipo_HCV;
    }

    /**
     * The associated object for the role metodica_genoma_HCV.
     */
    public CliMetodica_genoma_HCV_HBVDTO getMetodica_genoma_HCV() {
        return metodica_genoma_HCV;
    }
    /**
     * The associated object for the role metodica_genoma_HCV.
     */
    public void setMetodica_genoma_HCV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HCV) {
        this.metodica_genoma_HCV = metodica_genoma_HCV;
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
     * The associated object for the role Paziente_markers_HCV.
     */
    public CliPazienteDTO getPaziente_markers_HCV() {
        return Paziente_markers_HCV;
    }
    /**
     * The associated object for the role Paziente_markers_HCV.
     */
    public void setPaziente_markers_HCV(CliPazienteDTO Paziente_markers_HCV) {
        this.Paziente_markers_HCV = Paziente_markers_HCV;
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
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipo != null) {
            joiner.add("genotipo: " + GraphQLRequestSerializer.getEntry(genotipo));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (metodica_genoma != null) {
            joiner.add("metodica_genoma: " + GraphQLRequestSerializer.getEntry(metodica_genoma));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
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
        if (genotipo_HCV != null) {
            joiner.add("genotipo_HCV: " + GraphQLRequestSerializer.getEntry(genotipo_HCV));
        }
        if (metodica_genoma_HCV != null) {
            joiner.add("metodica_genoma_HCV: " + GraphQLRequestSerializer.getEntry(metodica_genoma_HCV));
        }
        if (unita_di_misura_viremia != null) {
            joiner.add("unita_di_misura_viremia: " + GraphQLRequestSerializer.getEntry(unita_di_misura_viremia));
        }
        if (Paziente_markers_HCV != null) {
            joiner.add("Paziente_markers_HCV: " + GraphQLRequestSerializer.getEntry(Paziente_markers_HCV));
        }
        return joiner.toString();
    }

    public static CliMarkers_HCVDTO.Builder builder() {
        return new CliMarkers_HCVDTO.Builder();
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
        private String codice_centro;
        private String data;
        private String esito;
        private String genotipo;
        private Integer lower_limit;
        private String metodica_genoma;
        private String paziente;
        private String tipologia_test;
        private String unita_di_misura;
        private Integer valore;
        private CliGenotipo_HCVDTO genotipo_HCV;
        private CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HCV;
        private CliUnita_di_misura_viremiaDTO unita_di_misura_viremia;
        private CliPazienteDTO Paziente_markers_HCV;

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
         * The attribute _createdby of Markers_HCV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Markers_HCV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Markers_HCV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Markers_HCV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Markers_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altra_metodica of Markers_HCV. It is of type String. Max length: 255.
         */
        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        /**
         * The attribute altra_unita_di_misura of Markers_HCV. It is of type String. Max length: 255.
         */
        public Builder setAltra_unita_di_misura(String altra_unita_di_misura) {
            this.altra_unita_di_misura = altra_unita_di_misura;
            return this;
        }

        /**
         * The attribute altro_genotipo of Markers_HCV. It is of type String. Max length: 255.
         */
        public Builder setAltro_genotipo(String altro_genotipo) {
            this.altro_genotipo = altro_genotipo;
            return this;
        }

        /**
         * The attribute codice_centro of Markers_HCV. It is of type String. Path: Paziente_markers_HCV.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Markers_HCV. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute esito of Markers_HCV. It is of type String. Domain: Borderline OR Positivo OR Negativo OR NR.}Max length: 255.
         */
        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The attribute genotipo of Markers_HCV. It is of type String. Path: genotipo_HCV nome.
         */
        public Builder setGenotipo(String genotipo) {
            this.genotipo = genotipo;
            return this;
        }

        /**
         * The attribute lower_limit of Markers_HCV. It is of type Int.
         */
        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        /**
         * The attribute metodica_genoma of Markers_HCV. It is of type String. Path: metodica_genoma_HCV nome.
         */
        public Builder setMetodica_genoma(String metodica_genoma) {
            this.metodica_genoma = metodica_genoma;
            return this;
        }

        /**
         * The attribute paziente of Markers_HCV. It is of type String. Path: Paziente_markers_HCV codice_interno. Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute tipologia_test of Markers_HCV. It is of type String. Domain: Qualitativo OR Quantitativo.}Max length: 255.
         */
        public Builder setTipologia_test(String tipologia_test) {
            this.tipologia_test = tipologia_test;
            return this;
        }

        /**
         * The attribute unita_di_misura of Markers_HCV. It is of type String. Path: unita_di_misura_viremia nome.
         */
        public Builder setUnita_di_misura(String unita_di_misura) {
            this.unita_di_misura = unita_di_misura;
            return this;
        }

        /**
         * The attribute valore of Markers_HCV. It is of type Int.
         */
        public Builder setValore(Integer valore) {
            this.valore = valore;
            return this;
        }

        /**
         * The associated object for the role genotipo_HCV.
         */
        public Builder setGenotipo_HCV(CliGenotipo_HCVDTO genotipo_HCV) {
            this.genotipo_HCV = genotipo_HCV;
            return this;
        }

        /**
         * The associated object for the role metodica_genoma_HCV.
         */
        public Builder setMetodica_genoma_HCV(CliMetodica_genoma_HCV_HBVDTO metodica_genoma_HCV) {
            this.metodica_genoma_HCV = metodica_genoma_HCV;
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
         * The associated object for the role Paziente_markers_HCV.
         */
        public Builder setPaziente_markers_HCV(CliPazienteDTO Paziente_markers_HCV) {
            this.Paziente_markers_HCV = Paziente_markers_HCV;
            return this;
        }


        public CliMarkers_HCVDTO build() {
            CliMarkers_HCVDTO result = new CliMarkers_HCVDTO();
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
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setEsito(this.esito);
            result.setGenotipo(this.genotipo);
            result.setLower_limit(this.lower_limit);
            result.setMetodica_genoma(this.metodica_genoma);
            result.setPaziente(this.paziente);
            result.setTipologia_test(this.tipologia_test);
            result.setUnita_di_misura(this.unita_di_misura);
            result.setValore(this.valore);
            result.setGenotipo_HCV(this.genotipo_HCV);
            result.setMetodica_genoma_HCV(this.metodica_genoma_HCV);
            result.setUnita_di_misura_viremia(this.unita_di_misura_viremia);
            result.setPaziente_markers_HCV(this.Paziente_markers_HCV);
            return result;
        }

    }
}
