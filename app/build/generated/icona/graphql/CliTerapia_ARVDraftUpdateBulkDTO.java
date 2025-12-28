package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Terapia_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTerapia_ARVDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altro_farmaco;
    private String altro_inizio_terapia;
    private String altro_variazione_terapia;
    private String booster;
    private String data_fine;
    private String data_inizio;
    private Boolean doppio_cieco;
    private String filtro_farmaco;
    private String generico;
    private String genotipo_guidata;
    private String nome_trial;
    private String once;
    private CliDosaggioRoleRefDTO dosaggio_;
    private CliFarmaco_ARVRoleRefDTO farmaco_ARV;
    private CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_princ;
    private CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_sec;
    private CliMotivazione_inizio_ARVRoleRefDTO motivazione_inizio_ARV;
    private CliWarningRoleRefsDTO warning_;

    public CliTerapia_ARVDraftUpdateBulkDTO() {
    }


    public String getAltro_farmaco() {
        return altro_farmaco;
    }
    public void setAltro_farmaco(String altro_farmaco) {
        this.altro_farmaco = altro_farmaco;
    }

    public String getAltro_inizio_terapia() {
        return altro_inizio_terapia;
    }
    public void setAltro_inizio_terapia(String altro_inizio_terapia) {
        this.altro_inizio_terapia = altro_inizio_terapia;
    }

    public String getAltro_variazione_terapia() {
        return altro_variazione_terapia;
    }
    public void setAltro_variazione_terapia(String altro_variazione_terapia) {
        this.altro_variazione_terapia = altro_variazione_terapia;
    }

    public String getBooster() {
        return booster;
    }
    public void setBooster(String booster) {
        this.booster = booster;
    }

    public String getData_fine() {
        return data_fine;
    }
    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getData_inizio() {
        return data_inizio;
    }
    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public Boolean getDoppio_cieco() {
        return doppio_cieco;
    }
    public void setDoppio_cieco(Boolean doppio_cieco) {
        this.doppio_cieco = doppio_cieco;
    }

    public String getFiltro_farmaco() {
        return filtro_farmaco;
    }
    public void setFiltro_farmaco(String filtro_farmaco) {
        this.filtro_farmaco = filtro_farmaco;
    }

    public String getGenerico() {
        return generico;
    }
    public void setGenerico(String generico) {
        this.generico = generico;
    }

    public String getGenotipo_guidata() {
        return genotipo_guidata;
    }
    public void setGenotipo_guidata(String genotipo_guidata) {
        this.genotipo_guidata = genotipo_guidata;
    }

    public String getNome_trial() {
        return nome_trial;
    }
    public void setNome_trial(String nome_trial) {
        this.nome_trial = nome_trial;
    }

    public String getOnce() {
        return once;
    }
    public void setOnce(String once) {
        this.once = once;
    }

    public CliDosaggioRoleRefDTO getDosaggio_() {
        return dosaggio_;
    }
    public void setDosaggio_(CliDosaggioRoleRefDTO dosaggio_) {
        this.dosaggio_ = dosaggio_;
    }

    public CliFarmaco_ARVRoleRefDTO getFarmaco_ARV() {
        return farmaco_ARV;
    }
    public void setFarmaco_ARV(CliFarmaco_ARVRoleRefDTO farmaco_ARV) {
        this.farmaco_ARV = farmaco_ARV;
    }

    public CliMotivazione_fine_ARVRoleRefDTO getMotivazione_fine_ARV_princ() {
        return motivazione_fine_ARV_princ;
    }
    public void setMotivazione_fine_ARV_princ(CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_princ) {
        this.motivazione_fine_ARV_princ = motivazione_fine_ARV_princ;
    }

    public CliMotivazione_fine_ARVRoleRefDTO getMotivazione_fine_ARV_sec() {
        return motivazione_fine_ARV_sec;
    }
    public void setMotivazione_fine_ARV_sec(CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_sec) {
        this.motivazione_fine_ARV_sec = motivazione_fine_ARV_sec;
    }

    public CliMotivazione_inizio_ARVRoleRefDTO getMotivazione_inizio_ARV() {
        return motivazione_inizio_ARV;
    }
    public void setMotivazione_inizio_ARV(CliMotivazione_inizio_ARVRoleRefDTO motivazione_inizio_ARV) {
        this.motivazione_inizio_ARV = motivazione_inizio_ARV;
    }

    public CliWarningRoleRefsDTO getWarning_() {
        return warning_;
    }
    public void setWarning_(CliWarningRoleRefsDTO warning_) {
        this.warning_ = warning_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro_farmaco != null) {
            joiner.add("altro_farmaco: " + GraphQLRequestSerializer.getEntry(altro_farmaco));
        }
        if (altro_inizio_terapia != null) {
            joiner.add("altro_inizio_terapia: " + GraphQLRequestSerializer.getEntry(altro_inizio_terapia));
        }
        if (altro_variazione_terapia != null) {
            joiner.add("altro_variazione_terapia: " + GraphQLRequestSerializer.getEntry(altro_variazione_terapia));
        }
        if (booster != null) {
            joiner.add("booster: " + GraphQLRequestSerializer.getEntry(booster));
        }
        if (data_fine != null) {
            joiner.add("data_fine: " + GraphQLRequestSerializer.getEntry(data_fine));
        }
        if (data_inizio != null) {
            joiner.add("data_inizio: " + GraphQLRequestSerializer.getEntry(data_inizio));
        }
        if (doppio_cieco != null) {
            joiner.add("doppio_cieco: " + GraphQLRequestSerializer.getEntry(doppio_cieco));
        }
        if (filtro_farmaco != null) {
            joiner.add("filtro_farmaco: " + GraphQLRequestSerializer.getEntry(filtro_farmaco));
        }
        if (generico != null) {
            joiner.add("generico: " + GraphQLRequestSerializer.getEntry(generico));
        }
        if (genotipo_guidata != null) {
            joiner.add("genotipo_guidata: " + GraphQLRequestSerializer.getEntry(genotipo_guidata));
        }
        if (nome_trial != null) {
            joiner.add("nome_trial: " + GraphQLRequestSerializer.getEntry(nome_trial));
        }
        if (once != null) {
            joiner.add("once: " + GraphQLRequestSerializer.getEntry(once));
        }
        if (dosaggio_ != null) {
            joiner.add("dosaggio_: " + GraphQLRequestSerializer.getEntry(dosaggio_));
        }
        if (farmaco_ARV != null) {
            joiner.add("farmaco_ARV: " + GraphQLRequestSerializer.getEntry(farmaco_ARV));
        }
        if (motivazione_fine_ARV_princ != null) {
            joiner.add("motivazione_fine_ARV_princ: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_princ));
        }
        if (motivazione_fine_ARV_sec != null) {
            joiner.add("motivazione_fine_ARV_sec: " + GraphQLRequestSerializer.getEntry(motivazione_fine_ARV_sec));
        }
        if (motivazione_inizio_ARV != null) {
            joiner.add("motivazione_inizio_ARV: " + GraphQLRequestSerializer.getEntry(motivazione_inizio_ARV));
        }
        if (warning_ != null) {
            joiner.add("warning_: " + GraphQLRequestSerializer.getEntry(warning_));
        }
        return joiner.toString();
    }

    public static CliTerapia_ARVDraftUpdateBulkDTO.Builder builder() {
        return new CliTerapia_ARVDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String altro_farmaco;
        private String altro_inizio_terapia;
        private String altro_variazione_terapia;
        private String booster;
        private String data_fine;
        private String data_inizio;
        private Boolean doppio_cieco;
        private String filtro_farmaco;
        private String generico;
        private String genotipo_guidata;
        private String nome_trial;
        private String once;
        private CliDosaggioRoleRefDTO dosaggio_;
        private CliFarmaco_ARVRoleRefDTO farmaco_ARV;
        private CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_princ;
        private CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_sec;
        private CliMotivazione_inizio_ARVRoleRefDTO motivazione_inizio_ARV;
        private CliWarningRoleRefsDTO warning_;

        public Builder() {
        }

        public Builder setAltro_farmaco(String altro_farmaco) {
            this.altro_farmaco = altro_farmaco;
            return this;
        }

        public Builder setAltro_inizio_terapia(String altro_inizio_terapia) {
            this.altro_inizio_terapia = altro_inizio_terapia;
            return this;
        }

        public Builder setAltro_variazione_terapia(String altro_variazione_terapia) {
            this.altro_variazione_terapia = altro_variazione_terapia;
            return this;
        }

        public Builder setBooster(String booster) {
            this.booster = booster;
            return this;
        }

        public Builder setData_fine(String data_fine) {
            this.data_fine = data_fine;
            return this;
        }

        public Builder setData_inizio(String data_inizio) {
            this.data_inizio = data_inizio;
            return this;
        }

        public Builder setDoppio_cieco(Boolean doppio_cieco) {
            this.doppio_cieco = doppio_cieco;
            return this;
        }

        public Builder setFiltro_farmaco(String filtro_farmaco) {
            this.filtro_farmaco = filtro_farmaco;
            return this;
        }

        public Builder setGenerico(String generico) {
            this.generico = generico;
            return this;
        }

        public Builder setGenotipo_guidata(String genotipo_guidata) {
            this.genotipo_guidata = genotipo_guidata;
            return this;
        }

        public Builder setNome_trial(String nome_trial) {
            this.nome_trial = nome_trial;
            return this;
        }

        public Builder setOnce(String once) {
            this.once = once;
            return this;
        }

        public Builder setDosaggio_(CliDosaggioRoleRefDTO dosaggio_) {
            this.dosaggio_ = dosaggio_;
            return this;
        }

        public Builder setFarmaco_ARV(CliFarmaco_ARVRoleRefDTO farmaco_ARV) {
            this.farmaco_ARV = farmaco_ARV;
            return this;
        }

        public Builder setMotivazione_fine_ARV_princ(CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_princ) {
            this.motivazione_fine_ARV_princ = motivazione_fine_ARV_princ;
            return this;
        }

        public Builder setMotivazione_fine_ARV_sec(CliMotivazione_fine_ARVRoleRefDTO motivazione_fine_ARV_sec) {
            this.motivazione_fine_ARV_sec = motivazione_fine_ARV_sec;
            return this;
        }

        public Builder setMotivazione_inizio_ARV(CliMotivazione_inizio_ARVRoleRefDTO motivazione_inizio_ARV) {
            this.motivazione_inizio_ARV = motivazione_inizio_ARV;
            return this;
        }

        public Builder setWarning_(CliWarningRoleRefsDTO warning_) {
            this.warning_ = warning_;
            return this;
        }


        public CliTerapia_ARVDraftUpdateBulkDTO build() {
            CliTerapia_ARVDraftUpdateBulkDTO result = new CliTerapia_ARVDraftUpdateBulkDTO();
            result.setAltro_farmaco(this.altro_farmaco);
            result.setAltro_inizio_terapia(this.altro_inizio_terapia);
            result.setAltro_variazione_terapia(this.altro_variazione_terapia);
            result.setBooster(this.booster);
            result.setData_fine(this.data_fine);
            result.setData_inizio(this.data_inizio);
            result.setDoppio_cieco(this.doppio_cieco);
            result.setFiltro_farmaco(this.filtro_farmaco);
            result.setGenerico(this.generico);
            result.setGenotipo_guidata(this.genotipo_guidata);
            result.setNome_trial(this.nome_trial);
            result.setOnce(this.once);
            result.setDosaggio_(this.dosaggio_);
            result.setFarmaco_ARV(this.farmaco_ARV);
            result.setMotivazione_fine_ARV_princ(this.motivazione_fine_ARV_princ);
            result.setMotivazione_fine_ARV_sec(this.motivazione_fine_ARV_sec);
            result.setMotivazione_inizio_ARV(this.motivazione_inizio_ARV);
            result.setWarning_(this.warning_);
            return result;
        }

    }
}
