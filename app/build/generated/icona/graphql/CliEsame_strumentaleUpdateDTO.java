package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Esame_strumentale.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEsame_strumentaleUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String IQR;
    private String altro_esame;
    private String bmd_colonna;
    private String bmd_femore;
    private Integer cap_iqr;
    private Integer cap_mediano;
    private String classe_rischio_hpv;
    private String data;
    private String esame;
    private String esito;
    private String genotipi_hpv;
    private String metavir;
    private Boolean patologico;
    private String stifness;
    private String success_rate;
    private String t_score_colonna;
    private String t_score_femore;
    private String z_score_colonna;
    private String z_score_femore;
    private CliPatologiaRoleRefsDTO esito_biopsia;

    public CliEsame_strumentaleUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIQR() {
        return IQR;
    }
    public void setIQR(String IQR) {
        this.IQR = IQR;
    }

    public String getAltro_esame() {
        return altro_esame;
    }
    public void setAltro_esame(String altro_esame) {
        this.altro_esame = altro_esame;
    }

    public String getBmd_colonna() {
        return bmd_colonna;
    }
    public void setBmd_colonna(String bmd_colonna) {
        this.bmd_colonna = bmd_colonna;
    }

    public String getBmd_femore() {
        return bmd_femore;
    }
    public void setBmd_femore(String bmd_femore) {
        this.bmd_femore = bmd_femore;
    }

    public Integer getCap_iqr() {
        return cap_iqr;
    }
    public void setCap_iqr(Integer cap_iqr) {
        this.cap_iqr = cap_iqr;
    }

    public Integer getCap_mediano() {
        return cap_mediano;
    }
    public void setCap_mediano(Integer cap_mediano) {
        this.cap_mediano = cap_mediano;
    }

    public String getClasse_rischio_hpv() {
        return classe_rischio_hpv;
    }
    public void setClasse_rischio_hpv(String classe_rischio_hpv) {
        this.classe_rischio_hpv = classe_rischio_hpv;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getEsame() {
        return esame;
    }
    public void setEsame(String esame) {
        this.esame = esame;
    }

    public String getEsito() {
        return esito;
    }
    public void setEsito(String esito) {
        this.esito = esito;
    }

    public String getGenotipi_hpv() {
        return genotipi_hpv;
    }
    public void setGenotipi_hpv(String genotipi_hpv) {
        this.genotipi_hpv = genotipi_hpv;
    }

    public String getMetavir() {
        return metavir;
    }
    public void setMetavir(String metavir) {
        this.metavir = metavir;
    }

    public Boolean getPatologico() {
        return patologico;
    }
    public void setPatologico(Boolean patologico) {
        this.patologico = patologico;
    }

    public String getStifness() {
        return stifness;
    }
    public void setStifness(String stifness) {
        this.stifness = stifness;
    }

    public String getSuccess_rate() {
        return success_rate;
    }
    public void setSuccess_rate(String success_rate) {
        this.success_rate = success_rate;
    }

    public String getT_score_colonna() {
        return t_score_colonna;
    }
    public void setT_score_colonna(String t_score_colonna) {
        this.t_score_colonna = t_score_colonna;
    }

    public String getT_score_femore() {
        return t_score_femore;
    }
    public void setT_score_femore(String t_score_femore) {
        this.t_score_femore = t_score_femore;
    }

    public String getZ_score_colonna() {
        return z_score_colonna;
    }
    public void setZ_score_colonna(String z_score_colonna) {
        this.z_score_colonna = z_score_colonna;
    }

    public String getZ_score_femore() {
        return z_score_femore;
    }
    public void setZ_score_femore(String z_score_femore) {
        this.z_score_femore = z_score_femore;
    }

    public CliPatologiaRoleRefsDTO getEsito_biopsia() {
        return esito_biopsia;
    }
    public void setEsito_biopsia(CliPatologiaRoleRefsDTO esito_biopsia) {
        this.esito_biopsia = esito_biopsia;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (IQR != null) {
            joiner.add("IQR: " + GraphQLRequestSerializer.getEntry(IQR));
        }
        if (altro_esame != null) {
            joiner.add("altro_esame: " + GraphQLRequestSerializer.getEntry(altro_esame));
        }
        if (bmd_colonna != null) {
            joiner.add("bmd_colonna: " + GraphQLRequestSerializer.getEntry(bmd_colonna));
        }
        if (bmd_femore != null) {
            joiner.add("bmd_femore: " + GraphQLRequestSerializer.getEntry(bmd_femore));
        }
        if (cap_iqr != null) {
            joiner.add("cap_iqr: " + GraphQLRequestSerializer.getEntry(cap_iqr));
        }
        if (cap_mediano != null) {
            joiner.add("cap_mediano: " + GraphQLRequestSerializer.getEntry(cap_mediano));
        }
        if (classe_rischio_hpv != null) {
            joiner.add("classe_rischio_hpv: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esame != null) {
            joiner.add("esame: " + GraphQLRequestSerializer.getEntry(esame));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipi_hpv != null) {
            joiner.add("genotipi_hpv: " + GraphQLRequestSerializer.getEntry(genotipi_hpv));
        }
        if (metavir != null) {
            joiner.add("metavir: " + GraphQLRequestSerializer.getEntry(metavir));
        }
        if (patologico != null) {
            joiner.add("patologico: " + GraphQLRequestSerializer.getEntry(patologico));
        }
        if (stifness != null) {
            joiner.add("stifness: " + GraphQLRequestSerializer.getEntry(stifness));
        }
        if (success_rate != null) {
            joiner.add("success_rate: " + GraphQLRequestSerializer.getEntry(success_rate));
        }
        if (t_score_colonna != null) {
            joiner.add("t_score_colonna: " + GraphQLRequestSerializer.getEntry(t_score_colonna));
        }
        if (t_score_femore != null) {
            joiner.add("t_score_femore: " + GraphQLRequestSerializer.getEntry(t_score_femore));
        }
        if (z_score_colonna != null) {
            joiner.add("z_score_colonna: " + GraphQLRequestSerializer.getEntry(z_score_colonna));
        }
        if (z_score_femore != null) {
            joiner.add("z_score_femore: " + GraphQLRequestSerializer.getEntry(z_score_femore));
        }
        if (esito_biopsia != null) {
            joiner.add("esito_biopsia: " + GraphQLRequestSerializer.getEntry(esito_biopsia));
        }
        return joiner.toString();
    }

    public static CliEsame_strumentaleUpdateDTO.Builder builder() {
        return new CliEsame_strumentaleUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String IQR;
        private String altro_esame;
        private String bmd_colonna;
        private String bmd_femore;
        private Integer cap_iqr;
        private Integer cap_mediano;
        private String classe_rischio_hpv;
        private String data;
        private String esame;
        private String esito;
        private String genotipi_hpv;
        private String metavir;
        private Boolean patologico;
        private String stifness;
        private String success_rate;
        private String t_score_colonna;
        private String t_score_femore;
        private String z_score_colonna;
        private String z_score_femore;
        private CliPatologiaRoleRefsDTO esito_biopsia;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setIQR(String IQR) {
            this.IQR = IQR;
            return this;
        }

        public Builder setAltro_esame(String altro_esame) {
            this.altro_esame = altro_esame;
            return this;
        }

        public Builder setBmd_colonna(String bmd_colonna) {
            this.bmd_colonna = bmd_colonna;
            return this;
        }

        public Builder setBmd_femore(String bmd_femore) {
            this.bmd_femore = bmd_femore;
            return this;
        }

        public Builder setCap_iqr(Integer cap_iqr) {
            this.cap_iqr = cap_iqr;
            return this;
        }

        public Builder setCap_mediano(Integer cap_mediano) {
            this.cap_mediano = cap_mediano;
            return this;
        }

        public Builder setClasse_rischio_hpv(String classe_rischio_hpv) {
            this.classe_rischio_hpv = classe_rischio_hpv;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setEsame(String esame) {
            this.esame = esame;
            return this;
        }

        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        public Builder setGenotipi_hpv(String genotipi_hpv) {
            this.genotipi_hpv = genotipi_hpv;
            return this;
        }

        public Builder setMetavir(String metavir) {
            this.metavir = metavir;
            return this;
        }

        public Builder setPatologico(Boolean patologico) {
            this.patologico = patologico;
            return this;
        }

        public Builder setStifness(String stifness) {
            this.stifness = stifness;
            return this;
        }

        public Builder setSuccess_rate(String success_rate) {
            this.success_rate = success_rate;
            return this;
        }

        public Builder setT_score_colonna(String t_score_colonna) {
            this.t_score_colonna = t_score_colonna;
            return this;
        }

        public Builder setT_score_femore(String t_score_femore) {
            this.t_score_femore = t_score_femore;
            return this;
        }

        public Builder setZ_score_colonna(String z_score_colonna) {
            this.z_score_colonna = z_score_colonna;
            return this;
        }

        public Builder setZ_score_femore(String z_score_femore) {
            this.z_score_femore = z_score_femore;
            return this;
        }

        public Builder setEsito_biopsia(CliPatologiaRoleRefsDTO esito_biopsia) {
            this.esito_biopsia = esito_biopsia;
            return this;
        }


        public CliEsame_strumentaleUpdateDTO build() {
            CliEsame_strumentaleUpdateDTO result = new CliEsame_strumentaleUpdateDTO();
            result.set_id(this._id);
            result.setIQR(this.IQR);
            result.setAltro_esame(this.altro_esame);
            result.setBmd_colonna(this.bmd_colonna);
            result.setBmd_femore(this.bmd_femore);
            result.setCap_iqr(this.cap_iqr);
            result.setCap_mediano(this.cap_mediano);
            result.setClasse_rischio_hpv(this.classe_rischio_hpv);
            result.setData(this.data);
            result.setEsame(this.esame);
            result.setEsito(this.esito);
            result.setGenotipi_hpv(this.genotipi_hpv);
            result.setMetavir(this.metavir);
            result.setPatologico(this.patologico);
            result.setStifness(this.stifness);
            result.setSuccess_rate(this.success_rate);
            result.setT_score_colonna(this.t_score_colonna);
            result.setT_score_femore(this.t_score_femore);
            result.setZ_score_colonna(this.z_score_colonna);
            result.setZ_score_femore(this.z_score_femore);
            result.setEsito_biopsia(this.esito_biopsia);
            return result;
        }

    }
}
