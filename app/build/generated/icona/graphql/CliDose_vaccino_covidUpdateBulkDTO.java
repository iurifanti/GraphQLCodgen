package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Dose_vaccino_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_vaccino_covidUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altro_evento;
    private String altro_motivazione_seconda_dose;
    private Boolean assenza_lavoro_prima_dose;
    private String data;
    private Boolean dose_successiva;
    private Boolean farmaci_prima_dose_bool;
    private String farmaci_prima_dose_text;
    private Boolean imped_attivita_prima_dose;
    private String ore_durata_sintomi_prima_dose;
    private String ore_durata_sintomi_prima_dose_1;
    private String ore_primo_sintomo_prima_dose;
    private String ore_primo_sintomo_prima_dose_1;
    private Boolean ospedale_prima_dose;
    private CliPatologiaRoleRefsDTO eventi_vaccino_covid;
    private CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_;
    private CliTempo_dose_vaccinoRoleRefDTO tempo_dose_vaccino_;
    private CliFarmaco_altroRoleRefDTO vaccino_covid;

    public CliDose_vaccino_covidUpdateBulkDTO() {
    }


    public String getAltro_evento() {
        return altro_evento;
    }
    public void setAltro_evento(String altro_evento) {
        this.altro_evento = altro_evento;
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

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Boolean getDose_successiva() {
        return dose_successiva;
    }
    public void setDose_successiva(Boolean dose_successiva) {
        this.dose_successiva = dose_successiva;
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

    public Boolean getImped_attivita_prima_dose() {
        return imped_attivita_prima_dose;
    }
    public void setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
        this.imped_attivita_prima_dose = imped_attivita_prima_dose;
    }

    public String getOre_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose;
    }
    public void setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
        this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
    }

    public String getOre_durata_sintomi_prima_dose_1() {
        return ore_durata_sintomi_prima_dose_1;
    }
    public void setOre_durata_sintomi_prima_dose_1(String ore_durata_sintomi_prima_dose_1) {
        this.ore_durata_sintomi_prima_dose_1 = ore_durata_sintomi_prima_dose_1;
    }

    public String getOre_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose;
    }
    public void setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
        this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
    }

    public String getOre_primo_sintomo_prima_dose_1() {
        return ore_primo_sintomo_prima_dose_1;
    }
    public void setOre_primo_sintomo_prima_dose_1(String ore_primo_sintomo_prima_dose_1) {
        this.ore_primo_sintomo_prima_dose_1 = ore_primo_sintomo_prima_dose_1;
    }

    public Boolean getOspedale_prima_dose() {
        return ospedale_prima_dose;
    }
    public void setOspedale_prima_dose(Boolean ospedale_prima_dose) {
        this.ospedale_prima_dose = ospedale_prima_dose;
    }

    public CliPatologiaRoleRefsDTO getEventi_vaccino_covid() {
        return eventi_vaccino_covid;
    }
    public void setEventi_vaccino_covid(CliPatologiaRoleRefsDTO eventi_vaccino_covid) {
        this.eventi_vaccino_covid = eventi_vaccino_covid;
    }

    public CliMotivazioni_seconda_doseRoleRefDTO getMotivazioni_seconda_dose_() {
        return motivazioni_seconda_dose_;
    }
    public void setMotivazioni_seconda_dose_(CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_) {
        this.motivazioni_seconda_dose_ = motivazioni_seconda_dose_;
    }

    public CliTempo_dose_vaccinoRoleRefDTO getTempo_dose_vaccino_() {
        return tempo_dose_vaccino_;
    }
    public void setTempo_dose_vaccino_(CliTempo_dose_vaccinoRoleRefDTO tempo_dose_vaccino_) {
        this.tempo_dose_vaccino_ = tempo_dose_vaccino_;
    }

    public CliFarmaco_altroRoleRefDTO getVaccino_covid() {
        return vaccino_covid;
    }
    public void setVaccino_covid(CliFarmaco_altroRoleRefDTO vaccino_covid) {
        this.vaccino_covid = vaccino_covid;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro_evento != null) {
            joiner.add("altro_evento: " + GraphQLRequestSerializer.getEntry(altro_evento));
        }
        if (altro_motivazione_seconda_dose != null) {
            joiner.add("altro_motivazione_seconda_dose: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose));
        }
        if (assenza_lavoro_prima_dose != null) {
            joiner.add("assenza_lavoro_prima_dose: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (dose_successiva != null) {
            joiner.add("dose_successiva: " + GraphQLRequestSerializer.getEntry(dose_successiva));
        }
        if (farmaci_prima_dose_bool != null) {
            joiner.add("farmaci_prima_dose_bool: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_bool));
        }
        if (farmaci_prima_dose_text != null) {
            joiner.add("farmaci_prima_dose_text: " + GraphQLRequestSerializer.getEntry(farmaci_prima_dose_text));
        }
        if (imped_attivita_prima_dose != null) {
            joiner.add("imped_attivita_prima_dose: " + GraphQLRequestSerializer.getEntry(imped_attivita_prima_dose));
        }
        if (ore_durata_sintomi_prima_dose != null) {
            joiner.add("ore_durata_sintomi_prima_dose: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose));
        }
        if (ore_durata_sintomi_prima_dose_1 != null) {
            joiner.add("ore_durata_sintomi_prima_dose_1: " + GraphQLRequestSerializer.getEntry(ore_durata_sintomi_prima_dose_1));
        }
        if (ore_primo_sintomo_prima_dose != null) {
            joiner.add("ore_primo_sintomo_prima_dose: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose));
        }
        if (ore_primo_sintomo_prima_dose_1 != null) {
            joiner.add("ore_primo_sintomo_prima_dose_1: " + GraphQLRequestSerializer.getEntry(ore_primo_sintomo_prima_dose_1));
        }
        if (ospedale_prima_dose != null) {
            joiner.add("ospedale_prima_dose: " + GraphQLRequestSerializer.getEntry(ospedale_prima_dose));
        }
        if (eventi_vaccino_covid != null) {
            joiner.add("eventi_vaccino_covid: " + GraphQLRequestSerializer.getEntry(eventi_vaccino_covid));
        }
        if (motivazioni_seconda_dose_ != null) {
            joiner.add("motivazioni_seconda_dose_: " + GraphQLRequestSerializer.getEntry(motivazioni_seconda_dose_));
        }
        if (tempo_dose_vaccino_ != null) {
            joiner.add("tempo_dose_vaccino_: " + GraphQLRequestSerializer.getEntry(tempo_dose_vaccino_));
        }
        if (vaccino_covid != null) {
            joiner.add("vaccino_covid: " + GraphQLRequestSerializer.getEntry(vaccino_covid));
        }
        return joiner.toString();
    }

    public static CliDose_vaccino_covidUpdateBulkDTO.Builder builder() {
        return new CliDose_vaccino_covidUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String altro_evento;
        private String altro_motivazione_seconda_dose;
        private Boolean assenza_lavoro_prima_dose;
        private String data;
        private Boolean dose_successiva;
        private Boolean farmaci_prima_dose_bool;
        private String farmaci_prima_dose_text;
        private Boolean imped_attivita_prima_dose;
        private String ore_durata_sintomi_prima_dose;
        private String ore_durata_sintomi_prima_dose_1;
        private String ore_primo_sintomo_prima_dose;
        private String ore_primo_sintomo_prima_dose_1;
        private Boolean ospedale_prima_dose;
        private CliPatologiaRoleRefsDTO eventi_vaccino_covid;
        private CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_;
        private CliTempo_dose_vaccinoRoleRefDTO tempo_dose_vaccino_;
        private CliFarmaco_altroRoleRefDTO vaccino_covid;

        public Builder() {
        }

        public Builder setAltro_evento(String altro_evento) {
            this.altro_evento = altro_evento;
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

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setDose_successiva(Boolean dose_successiva) {
            this.dose_successiva = dose_successiva;
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

        public Builder setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
            this.imped_attivita_prima_dose = imped_attivita_prima_dose;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
            this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
            return this;
        }

        public Builder setOre_durata_sintomi_prima_dose_1(String ore_durata_sintomi_prima_dose_1) {
            this.ore_durata_sintomi_prima_dose_1 = ore_durata_sintomi_prima_dose_1;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
            this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
            return this;
        }

        public Builder setOre_primo_sintomo_prima_dose_1(String ore_primo_sintomo_prima_dose_1) {
            this.ore_primo_sintomo_prima_dose_1 = ore_primo_sintomo_prima_dose_1;
            return this;
        }

        public Builder setOspedale_prima_dose(Boolean ospedale_prima_dose) {
            this.ospedale_prima_dose = ospedale_prima_dose;
            return this;
        }

        public Builder setEventi_vaccino_covid(CliPatologiaRoleRefsDTO eventi_vaccino_covid) {
            this.eventi_vaccino_covid = eventi_vaccino_covid;
            return this;
        }

        public Builder setMotivazioni_seconda_dose_(CliMotivazioni_seconda_doseRoleRefDTO motivazioni_seconda_dose_) {
            this.motivazioni_seconda_dose_ = motivazioni_seconda_dose_;
            return this;
        }

        public Builder setTempo_dose_vaccino_(CliTempo_dose_vaccinoRoleRefDTO tempo_dose_vaccino_) {
            this.tempo_dose_vaccino_ = tempo_dose_vaccino_;
            return this;
        }

        public Builder setVaccino_covid(CliFarmaco_altroRoleRefDTO vaccino_covid) {
            this.vaccino_covid = vaccino_covid;
            return this;
        }


        public CliDose_vaccino_covidUpdateBulkDTO build() {
            CliDose_vaccino_covidUpdateBulkDTO result = new CliDose_vaccino_covidUpdateBulkDTO();
            result.setAltro_evento(this.altro_evento);
            result.setAltro_motivazione_seconda_dose(this.altro_motivazione_seconda_dose);
            result.setAssenza_lavoro_prima_dose(this.assenza_lavoro_prima_dose);
            result.setData(this.data);
            result.setDose_successiva(this.dose_successiva);
            result.setFarmaci_prima_dose_bool(this.farmaci_prima_dose_bool);
            result.setFarmaci_prima_dose_text(this.farmaci_prima_dose_text);
            result.setImped_attivita_prima_dose(this.imped_attivita_prima_dose);
            result.setOre_durata_sintomi_prima_dose(this.ore_durata_sintomi_prima_dose);
            result.setOre_durata_sintomi_prima_dose_1(this.ore_durata_sintomi_prima_dose_1);
            result.setOre_primo_sintomo_prima_dose(this.ore_primo_sintomo_prima_dose);
            result.setOre_primo_sintomo_prima_dose_1(this.ore_primo_sintomo_prima_dose_1);
            result.setOspedale_prima_dose(this.ospedale_prima_dose);
            result.setEventi_vaccino_covid(this.eventi_vaccino_covid);
            result.setMotivazioni_seconda_dose_(this.motivazioni_seconda_dose_);
            result.setTempo_dose_vaccino_(this.tempo_dose_vaccino_);
            result.setVaccino_covid(this.vaccino_covid);
            return result;
        }

    }
}
