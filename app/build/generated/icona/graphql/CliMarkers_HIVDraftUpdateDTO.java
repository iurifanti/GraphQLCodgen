package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class Markers_HIV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMarkers_HIVDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String FPR;
    private String data;
    private Boolean geno2pheno;
    private Integer hivrna;
    private String hivrna_segno;
    private Integer lower_limit;
    private Integer nr_CD4;
    private Integer nr_CD8;
    private Integer nr_linfociti;
    private String perc_CD4;
    private String perc_CD8;
    private String tropismo;
    private CliMetodica_HIVRNARoleRefDTO metodica_HIVRNA;

    public CliMarkers_HIVDraftUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFPR() {
        return FPR;
    }
    public void setFPR(String FPR) {
        this.FPR = FPR;
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

    public CliMetodica_HIVRNARoleRefDTO getMetodica_HIVRNA() {
        return metodica_HIVRNA;
    }
    public void setMetodica_HIVRNA(CliMetodica_HIVRNARoleRefDTO metodica_HIVRNA) {
        this.metodica_HIVRNA = metodica_HIVRNA;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (FPR != null) {
            joiner.add("FPR: " + GraphQLRequestSerializer.getEntry(FPR));
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
        if (nr_CD4 != null) {
            joiner.add("nr_CD4: " + GraphQLRequestSerializer.getEntry(nr_CD4));
        }
        if (nr_CD8 != null) {
            joiner.add("nr_CD8: " + GraphQLRequestSerializer.getEntry(nr_CD8));
        }
        if (nr_linfociti != null) {
            joiner.add("nr_linfociti: " + GraphQLRequestSerializer.getEntry(nr_linfociti));
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
        return joiner.toString();
    }

    public static CliMarkers_HIVDraftUpdateDTO.Builder builder() {
        return new CliMarkers_HIVDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String FPR;
        private String data;
        private Boolean geno2pheno;
        private Integer hivrna;
        private String hivrna_segno;
        private Integer lower_limit;
        private Integer nr_CD4;
        private Integer nr_CD8;
        private Integer nr_linfociti;
        private String perc_CD4;
        private String perc_CD8;
        private String tropismo;
        private CliMetodica_HIVRNARoleRefDTO metodica_HIVRNA;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setFPR(String FPR) {
            this.FPR = FPR;
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

        public Builder setMetodica_HIVRNA(CliMetodica_HIVRNARoleRefDTO metodica_HIVRNA) {
            this.metodica_HIVRNA = metodica_HIVRNA;
            return this;
        }


        public CliMarkers_HIVDraftUpdateDTO build() {
            CliMarkers_HIVDraftUpdateDTO result = new CliMarkers_HIVDraftUpdateDTO();
            result.set_id(this._id);
            result.setFPR(this.FPR);
            result.setData(this.data);
            result.setGeno2pheno(this.geno2pheno);
            result.setHivrna(this.hivrna);
            result.setHivrna_segno(this.hivrna_segno);
            result.setLower_limit(this.lower_limit);
            result.setNr_CD4(this.nr_CD4);
            result.setNr_CD8(this.nr_CD8);
            result.setNr_linfociti(this.nr_linfociti);
            result.setPerc_CD4(this.perc_CD4);
            result.setPerc_CD8(this.perc_CD8);
            result.setTropismo(this.tropismo);
            result.setMetodica_HIVRNA(this.metodica_HIVRNA);
            return result;
        }

    }
}
