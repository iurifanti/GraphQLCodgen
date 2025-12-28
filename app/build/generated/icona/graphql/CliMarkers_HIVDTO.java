package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Markers_HIV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HIVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String FPR;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String codice_centro;
    private String data;
    private Boolean geno2pheno;
    private Integer hivrna;
    private String hivrna_segno;
    private Integer lower_limit;
    private String metodica;
    private Integer nr_CD4;
    private Integer nr_CD8;
    private Integer nr_linfociti;
    private String paziente;
    private String perc_CD4;
    private String perc_CD8;
    private String tropismo;
    private CliMetodica_HIVRNADTO metodica_HIVRNA;
    private CliPazienteDTO Paziente_markers_HIV;

    public CliMarkers_HIVDTO() {
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
     * The attribute FPR of Markers_HIV. It is of type Real @realFormat.
     */
    public String getFPR() {
        return FPR;
    }
    /**
     * The attribute FPR of Markers_HIV. It is of type Real @realFormat.
     */
    public void setFPR(String FPR) {
        this.FPR = FPR;
    }

    /**
     * The attribute _createdby of Markers_HIV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Markers_HIV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Markers_HIV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Markers_HIV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Markers_HIV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Markers_HIV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Markers_HIV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Markers_HIV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute codice_centro of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Markers_HIV. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Markers_HIV. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute geno2pheno of Markers_HIV. It is of type Boolean.
     */
    public Boolean getGeno2pheno() {
        return geno2pheno;
    }
    /**
     * The attribute geno2pheno of Markers_HIV. It is of type Boolean.
     */
    public void setGeno2pheno(Boolean geno2pheno) {
        this.geno2pheno = geno2pheno;
    }

    /**
     * The attribute hivrna of Markers_HIV. It is of type Int.
     */
    public Integer getHivrna() {
        return hivrna;
    }
    /**
     * The attribute hivrna of Markers_HIV. It is of type Int.
     */
    public void setHivrna(Integer hivrna) {
        this.hivrna = hivrna;
    }

    /**
     * The attribute hivrna_segno of Markers_HIV. It is of type String. Domain: = OR < OR > OR NR.}Max length: 255.
     */
    public String getHivrna_segno() {
        return hivrna_segno;
    }
    /**
     * The attribute hivrna_segno of Markers_HIV. It is of type String. Domain: = OR < OR > OR NR.}Max length: 255.
     */
    public void setHivrna_segno(String hivrna_segno) {
        this.hivrna_segno = hivrna_segno;
    }

    /**
     * The attribute lower_limit of Markers_HIV. It is of type Int.
     */
    public Integer getLower_limit() {
        return lower_limit;
    }
    /**
     * The attribute lower_limit of Markers_HIV. It is of type Int.
     */
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    /**
     * The attribute metodica of Markers_HIV. It is of type String. Path: metodica_HIVRNA nome.
     */
    public String getMetodica() {
        return metodica;
    }
    /**
     * The attribute metodica of Markers_HIV. It is of type String. Path: metodica_HIVRNA nome.
     */
    public void setMetodica(String metodica) {
        this.metodica = metodica;
    }

    /**
     * The attribute nr_CD4 of Markers_HIV. It is of type Int.
     */
    public Integer getNr_CD4() {
        return nr_CD4;
    }
    /**
     * The attribute nr_CD4 of Markers_HIV. It is of type Int.
     */
    public void setNr_CD4(Integer nr_CD4) {
        this.nr_CD4 = nr_CD4;
    }

    /**
     * The attribute nr_CD8 of Markers_HIV. It is of type Int.
     */
    public Integer getNr_CD8() {
        return nr_CD8;
    }
    /**
     * The attribute nr_CD8 of Markers_HIV. It is of type Int.
     */
    public void setNr_CD8(Integer nr_CD8) {
        this.nr_CD8 = nr_CD8;
    }

    /**
     * The attribute nr_linfociti of Markers_HIV. It is of type Int.
     */
    public Integer getNr_linfociti() {
        return nr_linfociti;
    }
    /**
     * The attribute nr_linfociti of Markers_HIV. It is of type Int.
     */
    public void setNr_linfociti(Integer nr_linfociti) {
        this.nr_linfociti = nr_linfociti;
    }

    /**
     * The attribute paziente of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_interno. Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_interno. Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute perc_CD4 of Markers_HIV. It is of type Real @realFormat.
     */
    public String getPerc_CD4() {
        return perc_CD4;
    }
    /**
     * The attribute perc_CD4 of Markers_HIV. It is of type Real @realFormat.
     */
    public void setPerc_CD4(String perc_CD4) {
        this.perc_CD4 = perc_CD4;
    }

    /**
     * The attribute perc_CD8 of Markers_HIV. It is of type Real @realFormat.
     */
    public String getPerc_CD8() {
        return perc_CD8;
    }
    /**
     * The attribute perc_CD8 of Markers_HIV. It is of type Real @realFormat.
     */
    public void setPerc_CD8(String perc_CD8) {
        this.perc_CD8 = perc_CD8;
    }

    /**
     * The attribute tropismo of Markers_HIV. It is of type String. Domain: Non compilato OR X4 OR R5 OR R5/X4.}Max length: 255.
     */
    public String getTropismo() {
        return tropismo;
    }
    /**
     * The attribute tropismo of Markers_HIV. It is of type String. Domain: Non compilato OR X4 OR R5 OR R5/X4.}Max length: 255.
     */
    public void setTropismo(String tropismo) {
        this.tropismo = tropismo;
    }

    /**
     * The associated object for the role metodica_HIVRNA.
     */
    public CliMetodica_HIVRNADTO getMetodica_HIVRNA() {
        return metodica_HIVRNA;
    }
    /**
     * The associated object for the role metodica_HIVRNA.
     */
    public void setMetodica_HIVRNA(CliMetodica_HIVRNADTO metodica_HIVRNA) {
        this.metodica_HIVRNA = metodica_HIVRNA;
    }

    /**
     * The associated object for the role Paziente_markers_HIV.
     */
    public CliPazienteDTO getPaziente_markers_HIV() {
        return Paziente_markers_HIV;
    }
    /**
     * The associated object for the role Paziente_markers_HIV.
     */
    public void setPaziente_markers_HIV(CliPazienteDTO Paziente_markers_HIV) {
        this.Paziente_markers_HIV = Paziente_markers_HIV;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (FPR != null) {
            joiner.add("FPR: " + GraphQLRequestSerializer.getEntry(FPR));
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
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (geno2pheno != null) {
            joiner.add("geno2pheno: " + GraphQLRequestSerializer.getEntry(geno2pheno));
        }
        if (hivrna != null) {
            joiner.add("hivrna: " + GraphQLRequestSerializer.getEntry(hivrna));
        }
        if (hivrna_segno != null) {
            joiner.add("hivrna_segno: " + GraphQLRequestSerializer.getEntry(hivrna_segno));
        }
        if (lower_limit != null) {
            joiner.add("lower_limit: " + GraphQLRequestSerializer.getEntry(lower_limit));
        }
        if (metodica != null) {
            joiner.add("metodica: " + GraphQLRequestSerializer.getEntry(metodica));
        }
        if (nr_CD4 != null) {
            joiner.add("nr_CD4: " + GraphQLRequestSerializer.getEntry(nr_CD4));
        }
        if (nr_CD8 != null) {
            joiner.add("nr_CD8: " + GraphQLRequestSerializer.getEntry(nr_CD8));
        }
        if (nr_linfociti != null) {
            joiner.add("nr_linfociti: " + GraphQLRequestSerializer.getEntry(nr_linfociti));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        if (perc_CD4 != null) {
            joiner.add("perc_CD4: " + GraphQLRequestSerializer.getEntry(perc_CD4));
        }
        if (perc_CD8 != null) {
            joiner.add("perc_CD8: " + GraphQLRequestSerializer.getEntry(perc_CD8));
        }
        if (tropismo != null) {
            joiner.add("tropismo: " + GraphQLRequestSerializer.getEntry(tropismo));
        }
        if (metodica_HIVRNA != null) {
            joiner.add("metodica_HIVRNA: " + GraphQLRequestSerializer.getEntry(metodica_HIVRNA));
        }
        if (Paziente_markers_HIV != null) {
            joiner.add("Paziente_markers_HIV: " + GraphQLRequestSerializer.getEntry(Paziente_markers_HIV));
        }
        return joiner.toString();
    }

    public static CliMarkers_HIVDTO.Builder builder() {
        return new CliMarkers_HIVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String FPR;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String codice_centro;
        private String data;
        private Boolean geno2pheno;
        private Integer hivrna;
        private String hivrna_segno;
        private Integer lower_limit;
        private String metodica;
        private Integer nr_CD4;
        private Integer nr_CD8;
        private Integer nr_linfociti;
        private String paziente;
        private String perc_CD4;
        private String perc_CD8;
        private String tropismo;
        private CliMetodica_HIVRNADTO metodica_HIVRNA;
        private CliPazienteDTO Paziente_markers_HIV;

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
         * The attribute FPR of Markers_HIV. It is of type Real @realFormat.
         */
        public Builder setFPR(String FPR) {
            this.FPR = FPR;
            return this;
        }

        /**
         * The attribute _createdby of Markers_HIV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Markers_HIV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Markers_HIV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Markers_HIV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Markers_HIV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute codice_centro of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Markers_HIV. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute geno2pheno of Markers_HIV. It is of type Boolean.
         */
        public Builder setGeno2pheno(Boolean geno2pheno) {
            this.geno2pheno = geno2pheno;
            return this;
        }

        /**
         * The attribute hivrna of Markers_HIV. It is of type Int.
         */
        public Builder setHivrna(Integer hivrna) {
            this.hivrna = hivrna;
            return this;
        }

        /**
         * The attribute hivrna_segno of Markers_HIV. It is of type String. Domain: = OR < OR > OR NR.}Max length: 255.
         */
        public Builder setHivrna_segno(String hivrna_segno) {
            this.hivrna_segno = hivrna_segno;
            return this;
        }

        /**
         * The attribute lower_limit of Markers_HIV. It is of type Int.
         */
        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        /**
         * The attribute metodica of Markers_HIV. It is of type String. Path: metodica_HIVRNA nome.
         */
        public Builder setMetodica(String metodica) {
            this.metodica = metodica;
            return this;
        }

        /**
         * The attribute nr_CD4 of Markers_HIV. It is of type Int.
         */
        public Builder setNr_CD4(Integer nr_CD4) {
            this.nr_CD4 = nr_CD4;
            return this;
        }

        /**
         * The attribute nr_CD8 of Markers_HIV. It is of type Int.
         */
        public Builder setNr_CD8(Integer nr_CD8) {
            this.nr_CD8 = nr_CD8;
            return this;
        }

        /**
         * The attribute nr_linfociti of Markers_HIV. It is of type Int.
         */
        public Builder setNr_linfociti(Integer nr_linfociti) {
            this.nr_linfociti = nr_linfociti;
            return this;
        }

        /**
         * The attribute paziente of Markers_HIV. It is of type String. Path: Paziente_markers_HIV codice_interno. Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute perc_CD4 of Markers_HIV. It is of type Real @realFormat.
         */
        public Builder setPerc_CD4(String perc_CD4) {
            this.perc_CD4 = perc_CD4;
            return this;
        }

        /**
         * The attribute perc_CD8 of Markers_HIV. It is of type Real @realFormat.
         */
        public Builder setPerc_CD8(String perc_CD8) {
            this.perc_CD8 = perc_CD8;
            return this;
        }

        /**
         * The attribute tropismo of Markers_HIV. It is of type String. Domain: Non compilato OR X4 OR R5 OR R5/X4.}Max length: 255.
         */
        public Builder setTropismo(String tropismo) {
            this.tropismo = tropismo;
            return this;
        }

        /**
         * The associated object for the role metodica_HIVRNA.
         */
        public Builder setMetodica_HIVRNA(CliMetodica_HIVRNADTO metodica_HIVRNA) {
            this.metodica_HIVRNA = metodica_HIVRNA;
            return this;
        }

        /**
         * The associated object for the role Paziente_markers_HIV.
         */
        public Builder setPaziente_markers_HIV(CliPazienteDTO Paziente_markers_HIV) {
            this.Paziente_markers_HIV = Paziente_markers_HIV;
            return this;
        }


        public CliMarkers_HIVDTO build() {
            CliMarkers_HIVDTO result = new CliMarkers_HIVDTO();
            result.set_clientId(this._clientId);
            result.setFPR(this.FPR);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setGeno2pheno(this.geno2pheno);
            result.setHivrna(this.hivrna);
            result.setHivrna_segno(this.hivrna_segno);
            result.setLower_limit(this.lower_limit);
            result.setMetodica(this.metodica);
            result.setNr_CD4(this.nr_CD4);
            result.setNr_CD8(this.nr_CD8);
            result.setNr_linfociti(this.nr_linfociti);
            result.setPaziente(this.paziente);
            result.setPerc_CD4(this.perc_CD4);
            result.setPerc_CD8(this.perc_CD8);
            result.setTropismo(this.tropismo);
            result.setMetodica_HIVRNA(this.metodica_HIVRNA);
            result.setPaziente_markers_HIV(this.Paziente_markers_HIV);
            return result;
        }

    }
}
