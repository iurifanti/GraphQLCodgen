package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Dose_vaccino_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDose_vaccino_covidCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String altro_evento;
    private String altro_motivazione_seconda_dose;
    private Boolean assenza_lavoro_prima_dose;
    private Integer count_eventi;
    private String data;
    private Boolean dose_successiva;
    private String eventi_avversi;
    private Boolean farmaci_prima_dose_bool;
    private String farmaci_prima_dose_text;
    private Boolean imped_attivita_prima_dose;
    private String motivazioni_dose_successiva;
    private String ore_durata_sintomi_prima_dose;
    private String ore_durata_sintomi_prima_dose_1;
    private String ore_primo_sintomo_prima_dose;
    private String ore_primo_sintomo_prima_dose_1;
    private Boolean ospedale_prima_dose;
    private String vaccino;

    public CliDose_vaccino_covidCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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

    public Integer getCount_eventi() {
        return count_eventi;
    }
    public void setCount_eventi(Integer count_eventi) {
        this.count_eventi = count_eventi;
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

    public String getEventi_avversi() {
        return eventi_avversi;
    }
    public void setEventi_avversi(String eventi_avversi) {
        this.eventi_avversi = eventi_avversi;
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

    public String getMotivazioni_dose_successiva() {
        return motivazioni_dose_successiva;
    }
    public void setMotivazioni_dose_successiva(String motivazioni_dose_successiva) {
        this.motivazioni_dose_successiva = motivazioni_dose_successiva;
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

    public String getVaccino() {
        return vaccino;
    }
    public void setVaccino(String vaccino) {
        this.vaccino = vaccino;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro_evento != null) {
            joiner.add("altro_evento: " + GraphQLRequestSerializer.getEntry(altro_evento));
        }
        if (altro_motivazione_seconda_dose != null) {
            joiner.add("altro_motivazione_seconda_dose: " + GraphQLRequestSerializer.getEntry(altro_motivazione_seconda_dose));
        }
        if (assenza_lavoro_prima_dose != null) {
            joiner.add("assenza_lavoro_prima_dose: " + GraphQLRequestSerializer.getEntry(assenza_lavoro_prima_dose));
        }
        if (count_eventi != null) {
            joiner.add("count_eventi: " + GraphQLRequestSerializer.getEntry(count_eventi));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (dose_successiva != null) {
            joiner.add("dose_successiva: " + GraphQLRequestSerializer.getEntry(dose_successiva));
        }
        if (eventi_avversi != null) {
            joiner.add("eventi_avversi: " + GraphQLRequestSerializer.getEntry(eventi_avversi));
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
        if (motivazioni_dose_successiva != null) {
            joiner.add("motivazioni_dose_successiva: " + GraphQLRequestSerializer.getEntry(motivazioni_dose_successiva));
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
        if (vaccino != null) {
            joiner.add("vaccino: " + GraphQLRequestSerializer.getEntry(vaccino));
        }
        return joiner.toString();
    }

    public static CliDose_vaccino_covidCursorDTO.Builder builder() {
        return new CliDose_vaccino_covidCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String altro_evento;
        private String altro_motivazione_seconda_dose;
        private Boolean assenza_lavoro_prima_dose;
        private Integer count_eventi;
        private String data;
        private Boolean dose_successiva;
        private String eventi_avversi;
        private Boolean farmaci_prima_dose_bool;
        private String farmaci_prima_dose_text;
        private Boolean imped_attivita_prima_dose;
        private String motivazioni_dose_successiva;
        private String ore_durata_sintomi_prima_dose;
        private String ore_durata_sintomi_prima_dose_1;
        private String ore_primo_sintomo_prima_dose;
        private String ore_primo_sintomo_prima_dose_1;
        private Boolean ospedale_prima_dose;
        private String vaccino;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
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

        public Builder setCount_eventi(Integer count_eventi) {
            this.count_eventi = count_eventi;
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

        public Builder setEventi_avversi(String eventi_avversi) {
            this.eventi_avversi = eventi_avversi;
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

        public Builder setMotivazioni_dose_successiva(String motivazioni_dose_successiva) {
            this.motivazioni_dose_successiva = motivazioni_dose_successiva;
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

        public Builder setVaccino(String vaccino) {
            this.vaccino = vaccino;
            return this;
        }


        public CliDose_vaccino_covidCursorDTO build() {
            CliDose_vaccino_covidCursorDTO result = new CliDose_vaccino_covidCursorDTO();
            result.set_id(this._id);
            result.setAltro_evento(this.altro_evento);
            result.setAltro_motivazione_seconda_dose(this.altro_motivazione_seconda_dose);
            result.setAssenza_lavoro_prima_dose(this.assenza_lavoro_prima_dose);
            result.setCount_eventi(this.count_eventi);
            result.setData(this.data);
            result.setDose_successiva(this.dose_successiva);
            result.setEventi_avversi(this.eventi_avversi);
            result.setFarmaci_prima_dose_bool(this.farmaci_prima_dose_bool);
            result.setFarmaci_prima_dose_text(this.farmaci_prima_dose_text);
            result.setImped_attivita_prima_dose(this.imped_attivita_prima_dose);
            result.setMotivazioni_dose_successiva(this.motivazioni_dose_successiva);
            result.setOre_durata_sintomi_prima_dose(this.ore_durata_sintomi_prima_dose);
            result.setOre_durata_sintomi_prima_dose_1(this.ore_durata_sintomi_prima_dose_1);
            result.setOre_primo_sintomo_prima_dose(this.ore_primo_sintomo_prima_dose);
            result.setOre_primo_sintomo_prima_dose_1(this.ore_primo_sintomo_prima_dose_1);
            result.setOspedale_prima_dose(this.ospedale_prima_dose);
            result.setVaccino(this.vaccino);
            return result;
        }

    }
}
