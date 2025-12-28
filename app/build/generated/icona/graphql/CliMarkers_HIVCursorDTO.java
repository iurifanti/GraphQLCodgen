package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Markers_HIV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliMarkers_HIVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliMarkers_HIVCursorDTO() {
    }


    public String getFPR() {
        return FPR;
    }
    public void setFPR(String FPR) {
        this.FPR = FPR;
    }

    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Boolean getGeno2pheno() {
        return geno2pheno;
    }
    public void setGeno2pheno(Boolean geno2pheno) {
        this.geno2pheno = geno2pheno;
    }

    public Integer getHivrna() {
        return hivrna;
    }
    public void setHivrna(Integer hivrna) {
        this.hivrna = hivrna;
    }

    public String getHivrna_segno() {
        return hivrna_segno;
    }
    public void setHivrna_segno(String hivrna_segno) {
        this.hivrna_segno = hivrna_segno;
    }

    public Integer getLower_limit() {
        return lower_limit;
    }
    public void setLower_limit(Integer lower_limit) {
        this.lower_limit = lower_limit;
    }

    public String getMetodica() {
        return metodica;
    }
    public void setMetodica(String metodica) {
        this.metodica = metodica;
    }

    public Integer getNr_CD4() {
        return nr_CD4;
    }
    public void setNr_CD4(Integer nr_CD4) {
        this.nr_CD4 = nr_CD4;
    }

    public Integer getNr_CD8() {
        return nr_CD8;
    }
    public void setNr_CD8(Integer nr_CD8) {
        this.nr_CD8 = nr_CD8;
    }

    public Integer getNr_linfociti() {
        return nr_linfociti;
    }
    public void setNr_linfociti(Integer nr_linfociti) {
        this.nr_linfociti = nr_linfociti;
    }

    public String getPaziente() {
        return paziente;
    }
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    public String getPerc_CD4() {
        return perc_CD4;
    }
    public void setPerc_CD4(String perc_CD4) {
        this.perc_CD4 = perc_CD4;
    }

    public String getPerc_CD8() {
        return perc_CD8;
    }
    public void setPerc_CD8(String perc_CD8) {
        this.perc_CD8 = perc_CD8;
    }

    public String getTropismo() {
        return tropismo;
    }
    public void setTropismo(String tropismo) {
        this.tropismo = tropismo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliMarkers_HIVCursorDTO.Builder builder() {
        return new CliMarkers_HIVCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder setFPR(String FPR) {
            this.FPR = FPR;
            return this;
        }

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setGeno2pheno(Boolean geno2pheno) {
            this.geno2pheno = geno2pheno;
            return this;
        }

        public Builder setHivrna(Integer hivrna) {
            this.hivrna = hivrna;
            return this;
        }

        public Builder setHivrna_segno(String hivrna_segno) {
            this.hivrna_segno = hivrna_segno;
            return this;
        }

        public Builder setLower_limit(Integer lower_limit) {
            this.lower_limit = lower_limit;
            return this;
        }

        public Builder setMetodica(String metodica) {
            this.metodica = metodica;
            return this;
        }

        public Builder setNr_CD4(Integer nr_CD4) {
            this.nr_CD4 = nr_CD4;
            return this;
        }

        public Builder setNr_CD8(Integer nr_CD8) {
            this.nr_CD8 = nr_CD8;
            return this;
        }

        public Builder setNr_linfociti(Integer nr_linfociti) {
            this.nr_linfociti = nr_linfociti;
            return this;
        }

        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        public Builder setPerc_CD4(String perc_CD4) {
            this.perc_CD4 = perc_CD4;
            return this;
        }

        public Builder setPerc_CD8(String perc_CD8) {
            this.perc_CD8 = perc_CD8;
            return this;
        }

        public Builder setTropismo(String tropismo) {
            this.tropismo = tropismo;
            return this;
        }


        public CliMarkers_HIVCursorDTO build() {
            CliMarkers_HIVCursorDTO result = new CliMarkers_HIVCursorDTO();
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
            return result;
        }

    }
}
