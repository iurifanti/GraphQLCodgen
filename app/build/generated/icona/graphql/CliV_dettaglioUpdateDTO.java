package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class V_dettaglio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliV_dettaglioUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String altro_evento_prima_dose;
    private String altro_evento_seconda_dose;
    private String altro_motivazione_seconda_dose;
    private Boolean assenza_lavoro_prima_dose;
    private Boolean assenza_lavoro_seconda_dose;
    private String data_prima_dose;
    private String data_primo_tampone;
    private String data_primo_tampone_post;
    private String data_seconda_dose;
    private String decorso_infezione_covid;
    private String decorso_infezione_covid_post;
    private Boolean farmaci_prima_dose_bool;
    private String farmaci_prima_dose_text;
    private Boolean farmaci_seconda_dose_bool;
    private String farmaci_seconda_dose_text;
    private Boolean imped_attivita_prima_dose;
    private Boolean imped_attivita_seconda_dose;
    private Boolean infezione_covid;
    private Boolean infezione_covid_post;
    private Boolean intubazione;
    private String ore_durata_sintomi_prima_dose;
    private String ore_durata_sintomi_seconda_dose;
    private String ore_primo_sintomo_prima_dose;
    private String ore_primo_sintomo_seconda_dose;
    private Boolean ospedale_prima_dose;
    private Boolean ospedale_seconda_dose;
    private Boolean ospedalizzazione;
    private Boolean seconda_dose;
    private Boolean terapia_corticoster;
    private Boolean terapia_immunosopp;
    private String terapia_immunosopp_desc;
    private CliDose_vaccino_covidRoleObjectsDTO dose_vaccino_covid_;
    private CliPatologiaRoleRefsDTO eventi_prima_dose;
    private CliPatologiaRoleRefsDTO eventi_seconda_dose;
    private CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_1;
    private CliSierologie_covidRoleObjectsDTO sierologie_covid_;
    private CliPatologiaRoleRefsDTO sintomo_covid_post;
    private CliPatologiaRoleRefsDTO sintomo_covid_pre;
    private CliFarmaco_altroRoleRefDTO vaccino_covid_prima;
    private CliFarmaco_altroRoleRefDTO vaccino_covid_seconda;

    public CliV_dettaglioUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAltro_evento_prima_dose() {
        return altro_evento_prima_dose;
    }
    public void setAltro_evento_prima_dose(String altro_evento_prima_dose) {
        this.altro_evento_prima_dose = altro_evento_prima_dose;
    }

    public String getAltro_evento_seconda_dose() {
        return altro_evento_seconda_dose;
    }
    public void setAltro_evento_seconda_dose(String altro_evento_seconda_dose) {
        this.altro_evento_seconda_dose = altro_evento_seconda_dose;
    }

    public String getAltro_motivazione_seconda_dose() {
        return altro_motivazione_seconda_dose;
    }
    public void setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
        this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
    }

    public Boolean getAssenza_lavoro_prima_dose() {
        return assenza_lavoro_prima_dose;
    }
    public void setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
        this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
    }

    public Boolean getAssenza_lavoro_seconda_dose() {
        return assenza_lavoro_seconda_dose;
    }
    public void setAssenza_lavoro_seconda_dose(Boolean assenza_lavoro_seconda_dose) {
        this.assenza_lavoro_seconda_dose = assenza_lavoro_seconda_dose;
    }

    public String getData_prima_dose() {
        return data_prima_dose;
    }
    public void setData_prima_dose(String data_prima_dose) {
        this.data_prima_dose = data_prima_dose;
    }

    public String getData_primo_tampone() {
        return data_primo_tampone;
    }
    public void setData_primo_tampone(String data_primo_tampone) {
        this.data_primo_tampone = data_primo_tampone;
    }

    public String getData_primo_tampone_post() {
        return data_primo_tampone_post;
    }
    public void setData_primo_tampone_post(String data_primo_tampone_post) {
        this.data_primo_tampone_post = data_primo_tampone_post;
    }

    public String getData_seconda_dose() {
        return data_seconda_dose;
    }
    public void setData_seconda_dose(String data_seconda_dose) {
        this.data_seconda_dose = data_seconda_dose;
    }

    public String getDecorso_infezione_covid() {
        return decorso_infezione_covid;
    }
    public void setDecorso_infezione_covid(String decorso_infezione_covid) {
        this.decorso_infezione_covid = decorso_infezione_covid;
    }

    public String getDecorso_infezione_covid_post() {
        return decorso_infezione_covid_post;
    }
    public void setDecorso_infezione_covid_post(String decorso_infezione_covid_post) {
        this.decorso_infezione_covid_post = decorso_infezione_covid_post;
    }

    public Boolean getFarmaci_prima_dose_bool() {
        return farmaci_prima_dose_bool;
    }
    public void setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
        this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
    }

    public String getFarmaci_prima_dose_text() {
        return farmaci_prima_dose_text;
    }
    public void setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
        this.farmaci_prima_dose_text = farmaci_prima_dose_text;
    }

    public Boolean getFarmaci_seconda_dose_bool() {
        return farmaci_seconda_dose_bool;
    }
    public void setFarmaci_seconda_dose_bool(Boolean farmaci_seconda_dose_bool) {
        this.farmaci_seconda_dose_bool = farmaci_seconda_dose_bool;
    }

    public String getFarmaci_seconda_dose_text() {
        return farmaci_seconda_dose_text;
    }
    public void setFarmaci_seconda_dose_text(String farmaci_seconda_dose_text) {
        this.farmaci_seconda_dose_text = farmaci_seconda_dose_text;
    }

    public Boolean getImped_attivita_prima_dose() {
        return imped_attivita_prima_dose;
    }
    public void setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
        this.imped_attivita_prima_dose = imped_attivita_prima_dose;
    }

    public Boolean getImped_attivita_seconda_dose() {
        return imped_attivita_seconda_dose;
    }
    public void setImped_attivita_seconda_dose(Boolean imped_attivita_seconda_dose) {
        this.imped_attivita_seconda_dose = imped_attivita_seconda_dose;
    }

    public Boolean getInfezione_covid() {
        return infezione_covid;
    }
    public void setInfezione_covid(Boolean infezione_covid) {
        this.infezione_covid = infezione_covid;
    }

    public Boolean getInfezione_covid_post() {
        return infezione_covid_post;
    }
    public void setInfezione_covid_post(Boolean infezione_covid_post) {
        this.infezione_covid_post = infezione_covid_post;
    }

    public Boolean getIntubazione() {
        return intubazione;
    }
    public void setIntubazione(Boolean intubazione) {
        this.intubazione = intubazione;
    }

    public String getOre_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose;
    }
    public void setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
        this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
    }

    public String getOre_durata_sintomi_seconda_dose() {
        return ore_durata_sintomi_seconda_dose;
    }
    public void setOre_durata_sintomi_seconda_dose(String ore_durata_sintomi_seconda_dose) {
        this.ore_durata_sintomi_seconda_dose = ore_durata_sintomi_seconda_dose;
    }

    public String getOre_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose;
    }
    public void setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
        this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
    }

    public String getOre_primo_sintomo_seconda_dose() {
        return ore_primo_sintomo_seconda_dose;
    }
    public void setOre_primo_sintomo_seconda_dose(String ore_primo_sintomo_seconda_dose) {
        this.ore_primo_sintomo_seconda_dose = ore_primo_sintomo_seconda_dose;
    }

    public Boolean getOspedale_prima_dose() {
        return ospedale_prima_dose;
    }
    public void setOspedale_prima_dose(Boolean ospedale_prima_dose) {
        this.ospedale_prima_dose = ospedale_prima_dose;
    }

    public Boolean getOspedale_seconda_dose() {
        return ospedale_seconda_dose;
    }
    public void setOspedale_seconda_dose(Boolean ospedale_seconda_dose) {
        this.ospedale_seconda_dose = ospedale_seconda_dose;
    }

    public Boolean getOspedalizzazione() {
        return ospedalizzazione;
    }
    public void setOspedalizzazione(Boolean ospedalizzazione) {
        this.ospedalizzazione = ospedalizzazione;
    }

    public Boolean getSeconda_dose() {
        return seconda_dose;
    }
    public void setSeconda_dose(Boolean seconda_dose) {
        this.seconda_dose = seconda_dose;
    }

    public Boolean getTerapia_corticoster() {
        return terapia_corticoster;
    }
    public void setTerapia_corticoster(Boolean terapia_corticoster) {
        this.terapia_corticoster = terapia_corticoster;
    }

    public Boolean getTerapia_immunosopp() {
        return terapia_immunosopp;
    }
    public void setTerapia_immunosopp(Boolean terapia_immunosopp) {
        this.terapia_immunosopp = terapia_immunosopp;
    }

    public String getTerapia_immunosopp_desc() {
        return terapia_immunosopp_desc;
    }
    public void setTerapia_immunosopp_desc(String terapia_immunosopp_desc) {
        this.terapia_immunosopp_desc = terapia_immunosopp_desc;
    }

    public CliDose_vaccino_covidRoleObjectsDTO getDose_vaccino_covid_() {
        return dose_vaccino_covid_;
    }
    public void setDose_vaccino_covid_(CliDose_vaccino_covidRoleObjectsDTO dose_vaccino_covid_) {
        this.dose_vaccino_covid_ = dose_vaccino_covid_;
    }

    public CliPatologiaRoleRefsDTO getEventi_prima_dose() {
        return eventi_prima_dose;
    }
    public void setEventi_prima_dose(CliPatologiaRoleRefsDTO eventi_prima_dose) {
        this.eventi_prima_dose = eventi_prima_dose;
    }

    public CliPatologiaRoleRefsDTO getEventi_seconda_dose() {
        return eventi_seconda_dose;
    }
    public void setEventi_seconda_dose(CliPatologiaRoleRefsDTO eventi_seconda_dose) {
        this.eventi_seconda_dose = eventi_seconda_dose;
    }

    public CliMotivazioni_seconda_doseRoleRefDTO getMotivazioni_seconda_dose_1() {
        return motivazioni_seconda_dose_1;
    }
    public void setMotivazioni_seconda_dose_1(CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_1) {
        this.motivazioni_seconda_dose_1 = motivazioni_seconda_dose_1;
    }

    public CliSierologie_covidRoleObjectsDTO getSierologie_covid_() {
        return sierologie_covid_;
    }
    public void setSierologie_covid_(CliSierologie_covidRoleObjectsDTO sierologie_covid_) {
        this.sierologie_covid_ = sierologie_covid_;
    }

    public CliPatologiaRoleRefsDTO getSintomo_covid_post() {
        return sintomo_covid_post;
    }
    public void setSintomo_covid_post(CliPatologiaRoleRefsDTO sintomo_covid_post) {
        this.sintomo_covid_post = sintomo_covid_post;
    }

    public CliPatologiaRoleRefsDTO getSintomo_covid_pre() {
        return sintomo_covid_pre;
    }
    public void setSintomo_covid_pre(CliPatologiaRoleRefsDTO sintomo_covid_pre) {
        this.sintomo_covid_pre = sintomo_covid_pre;
    }

    public CliFarmaco_altroRoleRefDTO getVaccino_covid_prima() {
        return vaccino_covid_prima;
    }
    public void setVaccino_covid_prima(CliFarmaco_altroRoleRefDTO vaccino_covid_prima) {
        this.vaccino_covid_prima = vaccino_covid_prima;
    }

    public CliFarmaco_altroRoleRefDTO getVaccino_covid_seconda() {
        return vaccino_covid_seconda;
    }
    public void setVaccino_covid_seconda(CliFarmaco_altroRoleRefDTO vaccino_covid_seconda) {
        this.vaccino_covid_seconda = vaccino_covid_seconda;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro_evento_prima_dose != null) {
            joiner.add("altro_evento_prima_dose: " + GraphQLRequestSerializer.getEntry(altro_evento_prima_dose));
        }
        if (altro_evento_seconda_dose != null) {
            joiner.add("altro_evento_seconda_dose: " + GraphQLRequestSerializer.getEntry(altro_evento_seconda_dose));
        }
        if (altro_motivazione_seconda_dose != null) {
            joiner.add("altro_motivazione_seconda_dose: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose));
        }
        if (assenza_lavoro_prima_dose != null) {
            joiner.add("assenza_lavoro_prima_dose: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose));
        }
        if (assenza_lavoro_seconda_dose != null) {
            joiner.add("assenza_lavoro_seconda_dose: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_seconda_dose));
        }
        if (data_prima_dose != null) {
            joiner.add("data_prima_dose: " + GraphQLRequestSerializer.getEntry(data_prima_dose));
        }
        if (data_primo_tampone != null) {
            joiner.add("data_primo_tampone: " + GraphQLRequestSerializer.getEntry(data_primo_tampone));
        }
        if (data_primo_tampone_post != null) {
            joiner.add("data_primo_tampone_post: " + GraphQLRequestSerializer.getEntry(data_primo_tampone_post));
        }
        if (data_seconda_dose != null) {
            joiner.add("data_seconda_dose: " + GraphQLRequestSerializer.getEntry(data_seconda_dose));
        }
        if (decorso_infezione_covid != null) {
            joiner.add("decorso_infezione_covid: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid));
        }
        if (decorso_infezione_covid_post != null) {
            joiner.add("decorso_infezione_covid_post: " + GraphQLRequestSerializer.getEntry(decorso_infezione_covid_post));
        }
        if (farmaci_prima_dose_bool != null) {
            joiner.add("farmaci_prima_dose_bool: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool));
        }
        if (farmaci_prima_dose_text != null) {
            joiner.add("farmaci_prima_dose_text: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text));
        }
        if (farmaci_seconda_dose_bool != null) {
            joiner.add("farmaci_seconda_dose_bool: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_bool));
        }
        if (farmaci_seconda_dose_text != null) {
            joiner.add("farmaci_seconda_dose_text: " + GraphQLRequestSerializer.getEntry(farmaci_seconda_dose_text));
        }
        if (imped_attivita_prima_dose != null) {
            joiner.add("imped_attivita_prima_dose: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose));
        }
        if (imped_attivita_seconda_dose != null) {
            joiner.add("imped_attivita_seconda_dose: " + GraphQLRequestSerializer.getEntry(imped_attivita_seconda_dose));
        }
        if (infezione_covid != null) {
            joiner.add("infezione_covid: " + GraphQLRequestSerializer.getEntry(infezione_covid));
        }
        if (infezione_covid_post != null) {
            joiner.add("infezione_covid_post: " + GraphQLRequestSerializer.getEntry(infezione_covid_post));
        }
        if (intubazione != null) {
            joiner.add("intubazione: " + GraphQLRequestSerializer.getEntry(intubazione));
        }
        if (ore_durata_sintomi_prima_dose != null) {
            joiner.add("ore_durata_sintomi_prima_dose: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose));
        }
        if (ore_durata_sintomi_seconda_dose != null) {
            joiner.add("ore_durata_sintomi_seconda_dose: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_seconda_dose));
        }
        if (ore_primo_sintomo_prima_dose != null) {
            joiner.add("ore_primo_sintomo_prima_dose: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose));
        }
        if (ore_primo_sintomo_seconda_dose != null) {
            joiner.add("ore_primo_sintomo_seconda_dose: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_seconda_dose));
        }
        if (ospedale_prima_dose != null) {
            joiner.add("ospedale_prima_dose: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose));
        }
        if (ospedale_seconda_dose != null) {
            joiner.add("ospedale_seconda_dose: " + GraphQLRequestSerializer.getEntry(ospedale_seconda_dose));
        }
        if (ospedalizzazione != null) {
            joiner.add("ospedalizzazione: " + GraphQLRequestSerializer.getEntry(ospedalizzazione));
        }
        if (seconda_dose != null) {
            joiner.add("seconda_dose: " + GraphQLRequestSerializer.getEntry(seconda_dose));
        }
        if (terapia_corticoster != null) {
            joiner.add("terapia_corticoster: " + GraphQLRequestSerializer.getEntry(terapia_corticoster));
        }
        if (terapia_immunosopp != null) {
            joiner.add("terapia_immunosopp: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp));
        }
        if (terapia_immunosopp_desc != null) {
            joiner.add("terapia_immunosopp_desc: " + GraphQLRequestSerializer.getEntry(terapia_immunosopp_desc));
        }
        if (dose_vaccino_covid_ != null) {
            joiner.add("dose_vaccino_covid_: " + GraphQLRequestSerializer.getEntry(dose_vaccino_covid_));
        }
        if (eventi_prima_dose != null) {
            joiner.add("eventi_prima_dose: " + GraphQLRequestSerializer.getEntry(eventi_prima_dose));
        }
        if (eventi_seconda_dose != null) {
            joiner.add("eventi_seconda_dose: " + GraphQLRequestSerializer.getEntry(eventi_seconda_dose));
        }
        if (motivazioni_seconda_dose_1 != null) {
            joiner.add("motivazioni_seconda_dose_1: " + GraphQLRequestSerializer.getEntry(motivazioni_seconda_dose_1));
        }
        if (sierologie_covid_ != null) {
            joiner.add("sierologie_covid_: " + GraphQLRequestSerializer.getEntry(sierologie_covid_));
        }
        if (sintomo_covid_post != null) {
            joiner.add("sintomo_covid_post: " + GraphQLRequestSerializer.getEntry(sintomo_covid_post));
        }
        if (sintomo_covid_pre != null) {
            joiner.add("sintomo_covid_pre: " + GraphQLRequestSerializer.getEntry(sintomo_covid_pre));
        }
        if (vaccino_covid_prima != null) {
            joiner.add("vaccino_covid_prima: " + GraphQLRequestSerializer.getEntry(vaccino_covid_prima));
        }
        if (vaccino_covid_seconda != null) {
            joiner.add("vaccino_covid_seconda: " + GraphQLRequestSerializer.getEntry(vaccino_covid_seconda));
        }
        return joiner.toString();
    }

    public static CliV_dettaglioUpdateDTO.Builder builder() {
        return new CliV_dettaglioUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String altro_evento_prima_dose;
        private String altro_evento_seconda_dose;
        private String altro_motivazione_seconda_dose;
        private Boolean assenza_lavoro_prima_dose;
        private Boolean assenza_lavoro_seconda_dose;
        private String data_prima_dose;
        private String data_primo_tampone;
        private String data_primo_tampone_post;
        private String data_seconda_dose;
        private String decorso_infezione_covid;
        private String decorso_infezione_covid_post;
        private Boolean farmaci_prima_dose_bool;
        private String farmaci_prima_dose_text;
        private Boolean farmaci_seconda_dose_bool;
        private String farmaci_seconda_dose_text;
        private Boolean imped_attivita_prima_dose;
        private Boolean imped_attivita_seconda_dose;
        private Boolean infezione_covid;
        private Boolean infezione_covid_post;
        private Boolean intubazione;
        private String ore_durata_sintomi_prima_dose;
        private String ore_durata_sintomi_seconda_dose;
        private String ore_primo_sintomo_prima_dose;
        private String ore_primo_sintomo_seconda_dose;
        private Boolean ospedale_prima_dose;
        private Boolean ospedale_seconda_dose;
        private Boolean ospedalizzazione;
        private Boolean seconda_dose;
        private Boolean terapia_corticoster;
        private Boolean terapia_immunosopp;
        private String terapia_immunosopp_desc;
        private CliDose_vaccino_covidRoleObjectsDTO dose_vaccino_covid_;
        private CliPatologiaRoleRefsDTO eventi_prima_dose;
        private CliPatologiaRoleRefsDTO eventi_seconda_dose;
        private CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_1;
        private CliSierologie_covidRoleObjectsDTO sierologie_covid_;
        private CliPatologiaRoleRefsDTO sintomo_covid_post;
        private CliPatologiaRoleRefsDTO sintomo_covid_pre;
        private CliFarmaco_altroRoleRefDTO vaccino_covid_prima;
        private CliFarmaco_altroRoleRefDTO vaccino_covid_seconda;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltro_evento_prima_dose(String altro_evento_prima_dose) {
            this.altro_evento_prima_dose = altro_evento_prima_dose;
            return this;
        }

        public Builder setAltro_evento_seconda_dose(String altro_evento_seconda_dose) {
            this.altro_evento_seconda_dose = altro_evento_seconda_dose;
            return this;
        }

        public Builder setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
            this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
            return this;
        }

        public Builder setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
            this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
            return this;
        }

        public Builder setAssenza_lavoro_seconda_dose(Boolean assenza_lavoro_seconda_dose) {
            this.assenza_lavoro_seconda_dose = assenza_lavoro_seconda_dose;
            return this;
        }

        public Builder setData_prima_dose(String data_prima_dose) {
            this.data_prima_dose = data_prima_dose;
            return this;
        }

        public Builder setData_primo_tampone(String data_primo_tampone) {
            this.data_primo_tampone = data_primo_tampone;
            return this;
        }

        public Builder setData_primo_tampone_post(String data_primo_tampone_post) {
            this.data_primo_tampone_post = data_primo_tampone_post;
            return this;
        }

        public Builder setData_seconda_dose(String data_seconda_dose) {
            this.data_seconda_dose = data_seconda_dose;
            return this;
        }

        public Builder setDecorso_infezione_covid(String decorso_infezione_covid) {
            this.decorso_infezione_covid = decorso_infezione_covid;
            return this;
        }

        public Builder setDecorso_infezione_covid_post(String decorso_infezione_covid_post) {
            this.decorso_infezione_covid_post = decorso_infezione_covid_post;
            return this;
        }

        public Builder setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
            this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
            return this;
        }

        public Builder setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
            this.farmaci_prima_dose_text = farmaci_prima_dose_text;
            return this;
        }

        public Builder setFarmaci_seconda_dose_bool(Boolean farmaci_seconda_dose_bool) {
            this.farmaci_seconda_dose_bool = farmaci_seconda_dose_bool;
            return this;
        }

        public Builder setFarmaci_seconda_dose_text(String farmaci_seconda_dose_text) {
            this.farmaci_seconda_dose_text = farmaci_seconda_dose_text;
            return this;
        }

        public Builder setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
            this.imped_attivita_prima_dose = imped_attivita_prima_dose;
            return this;
        }

        public Builder setImped_attivita_seconda_dose(Boolean imped_attivita_seconda_dose) {
            this.imped_attivita_seconda_dose = imped_attivita_seconda_dose;
            return this;
        }

        public Builder setInfezione_covid(Boolean infezione_covid) {
            this.infezione_covid = infezione_covid;
            return this;
        }

        public Builder setInfezione_covid_post(Boolean infezione_covid_post) {
            this.infezione_covid_post = infezione_covid_post;
            return this;
        }

        public Builder setIntubazione(Boolean intubazione) {
            this.intubazione = intubazione;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
            this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
            return this;
        }

        public Builder setOre_durata_sintomi_seconda_dose(String ore_durata_sintomi_seconda_dose) {
            this.ore_durata_sintomi_seconda_dose = ore_durata_sintomi_seconda_dose;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
            this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
            return this;
        }

        public Builder setOre_primo_sintomo_seconda_dose(String ore_primo_sintomo_seconda_dose) {
            this.ore_primo_sintomo_seconda_dose = ore_primo_sintomo_seconda_dose;
            return this;
        }

        public Builder setOspedale_prima_dose(Boolean ospedale_prima_dose) {
            this.ospedale_prima_dose = ospedale_prima_dose;
            return this;
        }

        public Builder setOspedale_seconda_dose(Boolean ospedale_seconda_dose) {
            this.ospedale_seconda_dose = ospedale_seconda_dose;
            return this;
        }

        public Builder setOspedalizzazione(Boolean ospedalizzazione) {
            this.ospedalizzazione = ospedalizzazione;
            return this;
        }

        public Builder setSeconda_dose(Boolean seconda_dose) {
            this.seconda_dose = seconda_dose;
            return this;
        }

        public Builder setTerapia_corticoster(Boolean terapia_corticoster) {
            this.terapia_corticoster = terapia_corticoster;
            return this;
        }

        public Builder setTerapia_immunosopp(Boolean terapia_immunosopp) {
            this.terapia_immunosopp = terapia_immunosopp;
            return this;
        }

        public Builder setTerapia_immunosopp_desc(String terapia_immunosopp_desc) {
            this.terapia_immunosopp_desc = terapia_immunosopp_desc;
            return this;
        }

        public Builder setDose_vaccino_covid_(CliDose_vaccino_covidRoleObjectsDTO dose_vaccino_covid_) {
            this.dose_vaccino_covid_ = dose_vaccino_covid_;
            return this;
        }

        public Builder setEventi_prima_dose(CliPatologiaRoleRefsDTO eventi_prima_dose) {
            this.eventi_prima_dose = eventi_prima_dose;
            return this;
        }

        public Builder setEventi_seconda_dose(CliPatologiaRoleRefsDTO eventi_seconda_dose) {
            this.eventi_seconda_dose = eventi_seconda_dose;
            return this;
        }

        public Builder setMotivazioni_seconda_dose_1(CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_1) {
            this.motivazioni_seconda_dose_1 = motivazioni_seconda_dose_1;
            return this;
        }

        public Builder setSierologie_covid_(CliSierologie_covidRoleObjectsDTO sierologie_covid_) {
            this.sierologie_covid_ = sierologie_covid_;
            return this;
        }

        public Builder setSintomo_covid_post(CliPatologiaRoleRefsDTO sintomo_covid_post) {
            this.sintomo_covid_post = sintomo_covid_post;
            return this;
        }

        public Builder setSintomo_covid_pre(CliPatologiaRoleRefsDTO sintomo_covid_pre) {
            this.sintomo_covid_pre = sintomo_covid_pre;
            return this;
        }

        public Builder setVaccino_covid_prima(CliFarmaco_altroRoleRefDTO vaccino_covid_prima) {
            this.vaccino_covid_prima = vaccino_covid_prima;
            return this;
        }

        public Builder setVaccino_covid_seconda(CliFarmaco_altroRoleRefDTO vaccino_covid_seconda) {
            this.vaccino_covid_seconda = vaccino_covid_seconda;
            return this;
        }


        public CliV_dettaglioUpdateDTO build() {
            CliV_dettaglioUpdateDTO result = new CliV_dettaglioUpdateDTO();
            result.set_id(this._id);
            result.setAltro_evento_prima_dose(this.altro_evento_prima_dose);
            result.setAltro_evento_seconda_dose(this.altro_evento_seconda_dose);
            result.setAltro_motivazione_seconda_dose(this.altro_motivazione_seconda_dose);
            result.setAssenza_lavoro_prima_dose(this.assenza_lavoro_prima_dose);
            result.setAssenza_lavoro_seconda_dose(this.assenza_lavoro_seconda_dose);
            result.setData_prima_dose(this.data_prima_dose);
            result.setData_primo_tampone(this.data_primo_tampone);
            result.setData_primo_tampone_post(this.data_primo_tampone_post);
            result.setData_seconda_dose(this.data_seconda_dose);
            result.setDecorso_infezione_covid(this.decorso_infezione_covid);
            result.setDecorso_infezione_covid_post(this.decorso_infezione_covid_post);
            result.setFarmaci_prima_dose_bool(this.farmaci_prima_dose_bool);
            result.setFarmaci_prima_dose_text(this.farmaci_prima_dose_text);
            result.setFarmaci_seconda_dose_bool(this.farmaci_seconda_dose_bool);
            result.setFarmaci_seconda_dose_text(this.farmaci_seconda_dose_text);
            result.setImped_attivita_prima_dose(this.imped_attivita_prima_dose);
            result.setImped_attivita_seconda_dose(this.imped_attivita_seconda_dose);
            result.setInfezione_covid(this.infezione_covid);
            result.setInfezione_covid_post(this.infezione_covid_post);
            result.setIntubazione(this.intubazione);
            result.setOre_durata_sintomi_prima_dose(this.ore_durata_sintomi_prima_dose);
            result.setOre_durata_sintomi_seconda_dose(this.ore_durata_sintomi_seconda_dose);
            result.setOre_primo_sintomo_prima_dose(this.ore_primo_sintomo_prima_dose);
            result.setOre_primo_sintomo_seconda_dose(this.ore_primo_sintomo_seconda_dose);
            result.setOspedale_prima_dose(this.ospedale_prima_dose);
            result.setOspedale_seconda_dose(this.ospedale_seconda_dose);
            result.setOspedalizzazione(this.ospedalizzazione);
            result.setSeconda_dose(this.seconda_dose);
            result.setTerapia_corticoster(this.terapia_corticoster);
            result.setTerapia_immunosopp(this.terapia_immunosopp);
            result.setTerapia_immunosopp_desc(this.terapia_immunosopp_desc);
            result.setDose_vaccino_covid_(this.dose_vaccino_covid_);
            result.setEventi_prima_dose(this.eventi_prima_dose);
            result.setEventi_seconda_dose(this.eventi_seconda_dose);
            result.setMotivazioni_seconda_dose_1(this.motivazioni_seconda_dose_1);
            result.setSierologie_covid_(this.sierologie_covid_);
            result.setSintomo_covid_post(this.sintomo_covid_post);
            result.setSintomo_covid_pre(this.sintomo_covid_pre);
            result.setVaccino_covid_prima(this.vaccino_covid_prima);
            result.setVaccino_covid_seconda(this.vaccino_covid_seconda);
            return result;
        }

    }
}
