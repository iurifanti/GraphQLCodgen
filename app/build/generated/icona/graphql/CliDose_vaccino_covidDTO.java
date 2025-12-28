package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Dose_vaccino_covid, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_vaccino_covidDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_;
    private CliTempo_dose_vaccinoDTO tempo_dose_vaccino_;
    private CliFarmaco_altroDTO vaccino_covid;
    private CliV_dettaglioDTO v_dettaglio_;

    public CliDose_vaccino_covidDTO() {
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
     * The attribute _id of Dose_vaccino_covid. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Dose_vaccino_covid. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro_evento of Dose_vaccino_covid. It is of type Text.
     */
    public String getAltro_evento() {
        return altro_evento;
    }
    /**
     * The attribute altro_evento of Dose_vaccino_covid. It is of type Text.
     */
    public void setAltro_evento(String altro_evento) {
        this.altro_evento = altro_evento;
    }

    /**
     * The attribute altro_motivazione_seconda_dose of Dose_vaccino_covid. It is of type Text.
     */
    public String getAltro_motivazione_seconda_dose() {
        return altro_motivazione_seconda_dose;
    }
    /**
     * The attribute altro_motivazione_seconda_dose of Dose_vaccino_covid. It is of type Text.
     */
    public void setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
        this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
    }

    /**
     * The attribute assenza_lavoro_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public Boolean getAssenza_lavoro_prima_dose() {
        return assenza_lavoro_prima_dose;
    }
    /**
     * The attribute assenza_lavoro_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public void setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
        this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
    }

    /**
     * The attribute count_eventi of Dose_vaccino_covid. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_vaccino_covid __id. Cannot be null.
     */
    public Integer getCount_eventi() {
        return count_eventi;
    }
    /**
     * The attribute count_eventi of Dose_vaccino_covid. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_vaccino_covid __id. Cannot be null.
     */
    public void setCount_eventi(Integer count_eventi) {
        this.count_eventi = count_eventi;
    }

    /**
     * The attribute data of Dose_vaccino_covid. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Dose_vaccino_covid. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute dose_successiva of Dose_vaccino_covid. It is of type Boolean. Cannot be null.
     */
    public Boolean getDose_successiva() {
        return dose_successiva;
    }
    /**
     * The attribute dose_successiva of Dose_vaccino_covid. It is of type Boolean. Cannot be null.
     */
    public void setDose_successiva(Boolean dose_successiva) {
        this.dose_successiva = dose_successiva;
    }

    /**
     * The attribute eventi_avversi of Dose_vaccino_covid. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)eventi_vaccino_covid nome. Cannot be null.
     */
    public String getEventi_avversi() {
        return eventi_avversi;
    }
    /**
     * The attribute eventi_avversi of Dose_vaccino_covid. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)eventi_vaccino_covid nome. Cannot be null.
     */
    public void setEventi_avversi(String eventi_avversi) {
        this.eventi_avversi = eventi_avversi;
    }

    /**
     * The attribute farmaci_prima_dose_bool of Dose_vaccino_covid. It is of type Boolean.
     */
    public Boolean getFarmaci_prima_dose_bool() {
        return farmaci_prima_dose_bool;
    }
    /**
     * The attribute farmaci_prima_dose_bool of Dose_vaccino_covid. It is of type Boolean.
     */
    public void setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
        this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
    }

    /**
     * The attribute farmaci_prima_dose_text of Dose_vaccino_covid. It is of type Text.
     */
    public String getFarmaci_prima_dose_text() {
        return farmaci_prima_dose_text;
    }
    /**
     * The attribute farmaci_prima_dose_text of Dose_vaccino_covid. It is of type Text.
     */
    public void setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
        this.farmaci_prima_dose_text = farmaci_prima_dose_text;
    }

    /**
     * The attribute imped_attivita_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public Boolean getImped_attivita_prima_dose() {
        return imped_attivita_prima_dose;
    }
    /**
     * The attribute imped_attivita_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public void setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
        this.imped_attivita_prima_dose = imped_attivita_prima_dose;
    }

    /**
     * The attribute motivazioni_dose_successiva of Dose_vaccino_covid. It is of type String. Path: motivazioni_seconda_dose_ nome.
     */
    public String getMotivazioni_dose_successiva() {
        return motivazioni_dose_successiva;
    }
    /**
     * The attribute motivazioni_dose_successiva of Dose_vaccino_covid. It is of type String. Path: motivazioni_seconda_dose_ nome.
     */
    public void setMotivazioni_dose_successiva(String motivazioni_dose_successiva) {
        this.motivazioni_dose_successiva = motivazioni_dose_successiva;
    }

    /**
     * The attribute ore_durata_sintomi_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public String getOre_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose;
    }
    /**
     * The attribute ore_durata_sintomi_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public void setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
        this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
    }

    /**
     * The attribute ore_durata_sintomi_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public String getOre_durata_sintomi_prima_dose_1() {
        return ore_durata_sintomi_prima_dose_1;
    }
    /**
     * The attribute ore_durata_sintomi_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public void setOre_durata_sintomi_prima_dose_1(String ore_durata_sintomi_prima_dose_1) {
        this.ore_durata_sintomi_prima_dose_1 = ore_durata_sintomi_prima_dose_1;
    }

    /**
     * The attribute ore_primo_sintomo_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public String getOre_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose;
    }
    /**
     * The attribute ore_primo_sintomo_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public void setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
        this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
    }

    /**
     * The attribute ore_primo_sintomo_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public String getOre_primo_sintomo_prima_dose_1() {
        return ore_primo_sintomo_prima_dose_1;
    }
    /**
     * The attribute ore_primo_sintomo_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
     */
    public void setOre_primo_sintomo_prima_dose_1(String ore_primo_sintomo_prima_dose_1) {
        this.ore_primo_sintomo_prima_dose_1 = ore_primo_sintomo_prima_dose_1;
    }

    /**
     * The attribute ospedale_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public Boolean getOspedale_prima_dose() {
        return ospedale_prima_dose;
    }
    /**
     * The attribute ospedale_prima_dose of Dose_vaccino_covid. It is of type Boolean.
     */
    public void setOspedale_prima_dose(Boolean ospedale_prima_dose) {
        this.ospedale_prima_dose = ospedale_prima_dose;
    }

    /**
     * The attribute vaccino of Dose_vaccino_covid. It is of type String. Path: vaccino_covid nome. Cannot be null.
     */
    public String getVaccino() {
        return vaccino;
    }
    /**
     * The attribute vaccino of Dose_vaccino_covid. It is of type String. Path: vaccino_covid nome. Cannot be null.
     */
    public void setVaccino(String vaccino) {
        this.vaccino = vaccino;
    }

    /**
     * The associated object for the role motivazioni_seconda_dose_.
     */
    public CliMotivazioni_seconda_doseDTO getMotivazioni_seconda_dose_() {
        return motivazioni_seconda_dose_;
    }
    /**
     * The associated object for the role motivazioni_seconda_dose_.
     */
    public void setMotivazioni_seconda_dose_(CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_) {
        this.motivazioni_seconda_dose_ = motivazioni_seconda_dose_;
    }

    /**
     * The associated object for the role tempo_dose_vaccino_.
     */
    public CliTempo_dose_vaccinoDTO getTempo_dose_vaccino_() {
        return tempo_dose_vaccino_;
    }
    /**
     * The associated object for the role tempo_dose_vaccino_.
     */
    public void setTempo_dose_vaccino_(CliTempo_dose_vaccinoDTO tempo_dose_vaccino_) {
        this.tempo_dose_vaccino_ = tempo_dose_vaccino_;
    }

    /**
     * The associated object for the role vaccino_covid.
     */
    public CliFarmaco_altroDTO getVaccino_covid() {
        return vaccino_covid;
    }
    /**
     * The associated object for the role vaccino_covid.
     */
    public void setVaccino_covid(CliFarmaco_altroDTO vaccino_covid) {
        this.vaccino_covid = vaccino_covid;
    }

    /**
     * The associated object for the role v_dettaglio_.
     */
    public CliV_dettaglioDTO getV_dettaglio_() {
        return v_dettaglio_;
    }
    /**
     * The associated object for the role v_dettaglio_.
     */
    public void setV_dettaglio_(CliV_dettaglioDTO v_dettaglio_) {
        this.v_dettaglio_ = v_dettaglio_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (motivazioni_seconda_dose_ != null) {
            joiner.add("motivazioni_seconda_dose_: " + GraphQLRequestSerializer.getEntry(motivazioni_seconda_dose_));
        }
        if (tempo_dose_vaccino_ != null) {
            joiner.add("tempo_dose_vaccino_: " + GraphQLRequestSerializer.getEntry(tempo_dose_vaccino_));
        }
        if (vaccino_covid != null) {
            joiner.add("vaccino_covid: " + GraphQLRequestSerializer.getEntry(vaccino_covid));
        }
        if (v_dettaglio_ != null) {
            joiner.add("v_dettaglio_: " + GraphQLRequestSerializer.getEntry(v_dettaglio_));
        }
        return joiner.toString();
    }

    public static CliDose_vaccino_covidDTO.Builder builder() {
        return new CliDose_vaccino_covidDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_;
        private CliTempo_dose_vaccinoDTO tempo_dose_vaccino_;
        private CliFarmaco_altroDTO vaccino_covid;
        private CliV_dettaglioDTO v_dettaglio_;

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
         * The attribute _id of Dose_vaccino_covid. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro_evento of Dose_vaccino_covid. It is of type Text.
         */
        public Builder setAltro_evento(String altro_evento) {
            this.altro_evento = altro_evento;
            return this;
        }

        /**
         * The attribute altro_motivazione_seconda_dose of Dose_vaccino_covid. It is of type Text.
         */
        public Builder setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
            this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
            return this;
        }

        /**
         * The attribute assenza_lavoro_prima_dose of Dose_vaccino_covid. It is of type Boolean.
         */
        public Builder setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
            this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
            return this;
        }

        /**
         * The attribute count_eventi of Dose_vaccino_covid. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_vaccino_covid __id. Cannot be null.
         */
        public Builder setCount_eventi(Integer count_eventi) {
            this.count_eventi = count_eventi;
            return this;
        }

        /**
         * The attribute data of Dose_vaccino_covid. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute dose_successiva of Dose_vaccino_covid. It is of type Boolean. Cannot be null.
         */
        public Builder setDose_successiva(Boolean dose_successiva) {
            this.dose_successiva = dose_successiva;
            return this;
        }

        /**
         * The attribute eventi_avversi of Dose_vaccino_covid. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)eventi_vaccino_covid nome. Cannot be null.
         */
        public Builder setEventi_avversi(String eventi_avversi) {
            this.eventi_avversi = eventi_avversi;
            return this;
        }

        /**
         * The attribute farmaci_prima_dose_bool of Dose_vaccino_covid. It is of type Boolean.
         */
        public Builder setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
            this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
            return this;
        }

        /**
         * The attribute farmaci_prima_dose_text of Dose_vaccino_covid. It is of type Text.
         */
        public Builder setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
            this.farmaci_prima_dose_text = farmaci_prima_dose_text;
            return this;
        }

        /**
         * The attribute imped_attivita_prima_dose of Dose_vaccino_covid. It is of type Boolean.
         */
        public Builder setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
            this.imped_attivita_prima_dose = imped_attivita_prima_dose;
            return this;
        }

        /**
         * The attribute motivazioni_dose_successiva of Dose_vaccino_covid. It is of type String. Path: motivazioni_seconda_dose_ nome.
         */
        public Builder setMotivazioni_dose_successiva(String motivazioni_dose_successiva) {
            this.motivazioni_dose_successiva = motivazioni_dose_successiva;
            return this;
        }

        /**
         * The attribute ore_durata_sintomi_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
         */
        public Builder setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
            this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
            return this;
        }

        /**
         * The attribute ore_durata_sintomi_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
         */
        public Builder setOre_durata_sintomi_prima_dose_1(String ore_durata_sintomi_prima_dose_1) {
            this.ore_durata_sintomi_prima_dose_1 = ore_durata_sintomi_prima_dose_1;
            return this;
        }

        /**
         * The attribute ore_primo_sintomo_prima_dose of Dose_vaccino_covid. It is of type Real @realFormat.
         */
        public Builder setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
            this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
            return this;
        }

        /**
         * The attribute ore_primo_sintomo_prima_dose_1 of Dose_vaccino_covid. It is of type Real @realFormat.
         */
        public Builder setOre_primo_sintomo_prima_dose_1(String ore_primo_sintomo_prima_dose_1) {
            this.ore_primo_sintomo_prima_dose_1 = ore_primo_sintomo_prima_dose_1;
            return this;
        }

        /**
         * The attribute ospedale_prima_dose of Dose_vaccino_covid. It is of type Boolean.
         */
        public Builder setOspedale_prima_dose(Boolean ospedale_prima_dose) {
            this.ospedale_prima_dose = ospedale_prima_dose;
            return this;
        }

        /**
         * The attribute vaccino of Dose_vaccino_covid. It is of type String. Path: vaccino_covid nome. Cannot be null.
         */
        public Builder setVaccino(String vaccino) {
            this.vaccino = vaccino;
            return this;
        }

        /**
         * The associated object for the role motivazioni_seconda_dose_.
         */
        public Builder setMotivazioni_seconda_dose_(CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_) {
            this.motivazioni_seconda_dose_ = motivazioni_seconda_dose_;
            return this;
        }

        /**
         * The associated object for the role tempo_dose_vaccino_.
         */
        public Builder setTempo_dose_vaccino_(CliTempo_dose_vaccinoDTO tempo_dose_vaccino_) {
            this.tempo_dose_vaccino_ = tempo_dose_vaccino_;
            return this;
        }

        /**
         * The associated object for the role vaccino_covid.
         */
        public Builder setVaccino_covid(CliFarmaco_altroDTO vaccino_covid) {
            this.vaccino_covid = vaccino_covid;
            return this;
        }

        /**
         * The associated object for the role v_dettaglio_.
         */
        public Builder setV_dettaglio_(CliV_dettaglioDTO v_dettaglio_) {
            this.v_dettaglio_ = v_dettaglio_;
            return this;
        }


        public CliDose_vaccino_covidDTO build() {
            CliDose_vaccino_covidDTO result = new CliDose_vaccino_covidDTO();
            result.set_clientId(this._clientId);
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
            result.setMotivazioni_seconda_dose_(this.motivazioni_seconda_dose_);
            result.setTempo_dose_vaccino_(this.tempo_dose_vaccino_);
            result.setVaccino_covid(this.vaccino_covid);
            result.setV_dettaglio_(this.v_dettaglio_);
            return result;
        }

    }
}
