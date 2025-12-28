package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class V_dettaglio, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliV_dettaglioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdon;
    private String _id;
    private String altro_evento_prima_dose;
    private String altro_evento_seconda_dose;
    private String altro_motivazione_seconda_dose;
    private Boolean assenza_lavoro_prima_dose;
    private Boolean assenza_lavoro_seconda_dose;
    private Integer count_eventi_prima_dose;
    private Integer count_eventi_seconda_dose;
    private String data_prima_dose;
    private String data_primo_tampone;
    private String data_primo_tampone_post;
    private String data_seconda_dose;
    private String decorso_infezione_covid;
    private String decorso_infezione_covid_post;
    private String dosi_vaccino_covid;
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
    private Boolean vax_ico;
    private CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_1;
    private CliFarmaco_altroDTO vaccino_covid_prima;
    private CliFarmaco_altroDTO vaccino_covid_seconda;
    private CliPazienteDTO paziente_;

    public CliV_dettaglioDTO() {
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
     * The attribute _createdon of V_dettaglio. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of V_dettaglio. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of V_dettaglio. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of V_dettaglio. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro_evento_prima_dose of V_dettaglio. It is of type Text.
     */
    public String getAltro_evento_prima_dose() {
        return altro_evento_prima_dose;
    }
    /**
     * The attribute altro_evento_prima_dose of V_dettaglio. It is of type Text.
     */
    public void setAltro_evento_prima_dose(String altro_evento_prima_dose) {
        this.altro_evento_prima_dose = altro_evento_prima_dose;
    }

    /**
     * The attribute altro_evento_seconda_dose of V_dettaglio. It is of type Text.
     */
    public String getAltro_evento_seconda_dose() {
        return altro_evento_seconda_dose;
    }
    /**
     * The attribute altro_evento_seconda_dose of V_dettaglio. It is of type Text.
     */
    public void setAltro_evento_seconda_dose(String altro_evento_seconda_dose) {
        this.altro_evento_seconda_dose = altro_evento_seconda_dose;
    }

    /**
     * The attribute altro_motivazione_seconda_dose of V_dettaglio. It is of type Text.
     */
    public String getAltro_motivazione_seconda_dose() {
        return altro_motivazione_seconda_dose;
    }
    /**
     * The attribute altro_motivazione_seconda_dose of V_dettaglio. It is of type Text.
     */
    public void setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
        this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
    }

    /**
     * The attribute assenza_lavoro_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getAssenza_lavoro_prima_dose() {
        return assenza_lavoro_prima_dose;
    }
    /**
     * The attribute assenza_lavoro_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public void setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
        this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
    }

    /**
     * The attribute assenza_lavoro_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getAssenza_lavoro_seconda_dose() {
        return assenza_lavoro_seconda_dose;
    }
    /**
     * The attribute assenza_lavoro_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public void setAssenza_lavoro_seconda_dose(Boolean assenza_lavoro_seconda_dose) {
        this.assenza_lavoro_seconda_dose = assenza_lavoro_seconda_dose;
    }

    /**
     * The attribute count_eventi_prima_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_prima_dose __id. Cannot be null.
     */
    public Integer getCount_eventi_prima_dose() {
        return count_eventi_prima_dose;
    }
    /**
     * The attribute count_eventi_prima_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_prima_dose __id. Cannot be null.
     */
    public void setCount_eventi_prima_dose(Integer count_eventi_prima_dose) {
        this.count_eventi_prima_dose = count_eventi_prima_dose;
    }

    /**
     * The attribute count_eventi_seconda_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_seconda_dose __id. Cannot be null.
     */
    public Integer getCount_eventi_seconda_dose() {
        return count_eventi_seconda_dose;
    }
    /**
     * The attribute count_eventi_seconda_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_seconda_dose __id. Cannot be null.
     */
    public void setCount_eventi_seconda_dose(Integer count_eventi_seconda_dose) {
        this.count_eventi_seconda_dose = count_eventi_seconda_dose;
    }

    /**
     * The attribute data_prima_dose of V_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_prima_dose() {
        return data_prima_dose;
    }
    /**
     * The attribute data_prima_dose of V_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_prima_dose(String data_prima_dose) {
        this.data_prima_dose = data_prima_dose;
    }

    /**
     * The attribute data_primo_tampone of V_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_primo_tampone() {
        return data_primo_tampone;
    }
    /**
     * The attribute data_primo_tampone of V_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_primo_tampone(String data_primo_tampone) {
        this.data_primo_tampone = data_primo_tampone;
    }

    /**
     * The attribute data_primo_tampone_post of V_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_primo_tampone_post() {
        return data_primo_tampone_post;
    }
    /**
     * The attribute data_primo_tampone_post of V_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_primo_tampone_post(String data_primo_tampone_post) {
        this.data_primo_tampone_post = data_primo_tampone_post;
    }

    /**
     * The attribute data_seconda_dose of V_dettaglio. It is of type Date @dateFormat.
     */
    public String getData_seconda_dose() {
        return data_seconda_dose;
    }
    /**
     * The attribute data_seconda_dose of V_dettaglio. It is of type Date @dateFormat.
     */
    public void setData_seconda_dose(String data_seconda_dose) {
        this.data_seconda_dose = data_seconda_dose;
    }

    /**
     * The attribute decorso_infezione_covid of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
     */
    public String getDecorso_infezione_covid() {
        return decorso_infezione_covid;
    }
    /**
     * The attribute decorso_infezione_covid of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
     */
    public void setDecorso_infezione_covid(String decorso_infezione_covid) {
        this.decorso_infezione_covid = decorso_infezione_covid;
    }

    /**
     * The attribute decorso_infezione_covid_post of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
     */
    public String getDecorso_infezione_covid_post() {
        return decorso_infezione_covid_post;
    }
    /**
     * The attribute decorso_infezione_covid_post of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
     */
    public void setDecorso_infezione_covid_post(String decorso_infezione_covid_post) {
        this.decorso_infezione_covid_post = decorso_infezione_covid_post;
    }

    /**
     * The attribute dosi_vaccino_covid of V_dettaglio. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)dose_vaccino_covid_ desc. Cannot be null.
     */
    public String getDosi_vaccino_covid() {
        return dosi_vaccino_covid;
    }
    /**
     * The attribute dosi_vaccino_covid of V_dettaglio. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)dose_vaccino_covid_ desc. Cannot be null.
     */
    public void setDosi_vaccino_covid(String dosi_vaccino_covid) {
        this.dosi_vaccino_covid = dosi_vaccino_covid;
    }

    /**
     * The attribute farmaci_prima_dose_bool of V_dettaglio. It is of type Boolean.
     */
    public Boolean getFarmaci_prima_dose_bool() {
        return farmaci_prima_dose_bool;
    }
    /**
     * The attribute farmaci_prima_dose_bool of V_dettaglio. It is of type Boolean.
     */
    public void setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
        this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
    }

    /**
     * The attribute farmaci_prima_dose_text of V_dettaglio. It is of type Text.
     */
    public String getFarmaci_prima_dose_text() {
        return farmaci_prima_dose_text;
    }
    /**
     * The attribute farmaci_prima_dose_text of V_dettaglio. It is of type Text.
     */
    public void setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
        this.farmaci_prima_dose_text = farmaci_prima_dose_text;
    }

    /**
     * The attribute farmaci_seconda_dose_bool of V_dettaglio. It is of type Boolean.
     */
    public Boolean getFarmaci_seconda_dose_bool() {
        return farmaci_seconda_dose_bool;
    }
    /**
     * The attribute farmaci_seconda_dose_bool of V_dettaglio. It is of type Boolean.
     */
    public void setFarmaci_seconda_dose_bool(Boolean farmaci_seconda_dose_bool) {
        this.farmaci_seconda_dose_bool = farmaci_seconda_dose_bool;
    }

    /**
     * The attribute farmaci_seconda_dose_text of V_dettaglio. It is of type Text.
     */
    public String getFarmaci_seconda_dose_text() {
        return farmaci_seconda_dose_text;
    }
    /**
     * The attribute farmaci_seconda_dose_text of V_dettaglio. It is of type Text.
     */
    public void setFarmaci_seconda_dose_text(String farmaci_seconda_dose_text) {
        this.farmaci_seconda_dose_text = farmaci_seconda_dose_text;
    }

    /**
     * The attribute imped_attivita_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getImped_attivita_prima_dose() {
        return imped_attivita_prima_dose;
    }
    /**
     * The attribute imped_attivita_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public void setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
        this.imped_attivita_prima_dose = imped_attivita_prima_dose;
    }

    /**
     * The attribute imped_attivita_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getImped_attivita_seconda_dose() {
        return imped_attivita_seconda_dose;
    }
    /**
     * The attribute imped_attivita_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public void setImped_attivita_seconda_dose(Boolean imped_attivita_seconda_dose) {
        this.imped_attivita_seconda_dose = imped_attivita_seconda_dose;
    }

    /**
     * The attribute infezione_covid of V_dettaglio. It is of type Boolean.
     */
    public Boolean getInfezione_covid() {
        return infezione_covid;
    }
    /**
     * The attribute infezione_covid of V_dettaglio. It is of type Boolean.
     */
    public void setInfezione_covid(Boolean infezione_covid) {
        this.infezione_covid = infezione_covid;
    }

    /**
     * The attribute infezione_covid_post of V_dettaglio. It is of type Boolean.
     */
    public Boolean getInfezione_covid_post() {
        return infezione_covid_post;
    }
    /**
     * The attribute infezione_covid_post of V_dettaglio. It is of type Boolean.
     */
    public void setInfezione_covid_post(Boolean infezione_covid_post) {
        this.infezione_covid_post = infezione_covid_post;
    }

    /**
     * The attribute intubazione of V_dettaglio. It is of type Boolean.
     */
    public Boolean getIntubazione() {
        return intubazione;
    }
    /**
     * The attribute intubazione of V_dettaglio. It is of type Boolean.
     */
    public void setIntubazione(Boolean intubazione) {
        this.intubazione = intubazione;
    }

    /**
     * The attribute ore_durata_sintomi_prima_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public String getOre_durata_sintomi_prima_dose() {
        return ore_durata_sintomi_prima_dose;
    }
    /**
     * The attribute ore_durata_sintomi_prima_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public void setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
        this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
    }

    /**
     * The attribute ore_durata_sintomi_seconda_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public String getOre_durata_sintomi_seconda_dose() {
        return ore_durata_sintomi_seconda_dose;
    }
    /**
     * The attribute ore_durata_sintomi_seconda_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public void setOre_durata_sintomi_seconda_dose(String ore_durata_sintomi_seconda_dose) {
        this.ore_durata_sintomi_seconda_dose = ore_durata_sintomi_seconda_dose;
    }

    /**
     * The attribute ore_primo_sintomo_prima_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public String getOre_primo_sintomo_prima_dose() {
        return ore_primo_sintomo_prima_dose;
    }
    /**
     * The attribute ore_primo_sintomo_prima_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public void setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
        this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
    }

    /**
     * The attribute ore_primo_sintomo_seconda_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public String getOre_primo_sintomo_seconda_dose() {
        return ore_primo_sintomo_seconda_dose;
    }
    /**
     * The attribute ore_primo_sintomo_seconda_dose of V_dettaglio. It is of type Real @realFormat.
     */
    public void setOre_primo_sintomo_seconda_dose(String ore_primo_sintomo_seconda_dose) {
        this.ore_primo_sintomo_seconda_dose = ore_primo_sintomo_seconda_dose;
    }

    /**
     * The attribute ospedale_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getOspedale_prima_dose() {
        return ospedale_prima_dose;
    }
    /**
     * The attribute ospedale_prima_dose of V_dettaglio. It is of type Boolean.
     */
    public void setOspedale_prima_dose(Boolean ospedale_prima_dose) {
        this.ospedale_prima_dose = ospedale_prima_dose;
    }

    /**
     * The attribute ospedale_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getOspedale_seconda_dose() {
        return ospedale_seconda_dose;
    }
    /**
     * The attribute ospedale_seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public void setOspedale_seconda_dose(Boolean ospedale_seconda_dose) {
        this.ospedale_seconda_dose = ospedale_seconda_dose;
    }

    /**
     * The attribute ospedalizzazione of V_dettaglio. It is of type Boolean.
     */
    public Boolean getOspedalizzazione() {
        return ospedalizzazione;
    }
    /**
     * The attribute ospedalizzazione of V_dettaglio. It is of type Boolean.
     */
    public void setOspedalizzazione(Boolean ospedalizzazione) {
        this.ospedalizzazione = ospedalizzazione;
    }

    /**
     * The attribute seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public Boolean getSeconda_dose() {
        return seconda_dose;
    }
    /**
     * The attribute seconda_dose of V_dettaglio. It is of type Boolean.
     */
    public void setSeconda_dose(Boolean seconda_dose) {
        this.seconda_dose = seconda_dose;
    }

    /**
     * The attribute terapia_corticoster of V_dettaglio. It is of type Boolean.
     */
    public Boolean getTerapia_corticoster() {
        return terapia_corticoster;
    }
    /**
     * The attribute terapia_corticoster of V_dettaglio. It is of type Boolean.
     */
    public void setTerapia_corticoster(Boolean terapia_corticoster) {
        this.terapia_corticoster = terapia_corticoster;
    }

    /**
     * The attribute terapia_immunosopp of V_dettaglio. It is of type Boolean.
     */
    public Boolean getTerapia_immunosopp() {
        return terapia_immunosopp;
    }
    /**
     * The attribute terapia_immunosopp of V_dettaglio. It is of type Boolean.
     */
    public void setTerapia_immunosopp(Boolean terapia_immunosopp) {
        this.terapia_immunosopp = terapia_immunosopp;
    }

    /**
     * The attribute terapia_immunosopp_desc of V_dettaglio. It is of type Text.
     */
    public String getTerapia_immunosopp_desc() {
        return terapia_immunosopp_desc;
    }
    /**
     * The attribute terapia_immunosopp_desc of V_dettaglio. It is of type Text.
     */
    public void setTerapia_immunosopp_desc(String terapia_immunosopp_desc) {
        this.terapia_immunosopp_desc = terapia_immunosopp_desc;
    }

    /**
     * The attribute vax_ico of V_dettaglio. It is of type Boolean. Path: paziente_.centro_appartenenza_attuale vax.
     */
    public Boolean getVax_ico() {
        return vax_ico;
    }
    /**
     * The attribute vax_ico of V_dettaglio. It is of type Boolean. Path: paziente_.centro_appartenenza_attuale vax.
     */
    public void setVax_ico(Boolean vax_ico) {
        this.vax_ico = vax_ico;
    }

    /**
     * The associated object for the role motivazioni_seconda_dose_1.
     */
    public CliMotivazioni_seconda_doseDTO getMotivazioni_seconda_dose_1() {
        return motivazioni_seconda_dose_1;
    }
    /**
     * The associated object for the role motivazioni_seconda_dose_1.
     */
    public void setMotivazioni_seconda_dose_1(CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_1) {
        this.motivazioni_seconda_dose_1 = motivazioni_seconda_dose_1;
    }

    /**
     * The associated object for the role vaccino_covid_prima.
     */
    public CliFarmaco_altroDTO getVaccino_covid_prima() {
        return vaccino_covid_prima;
    }
    /**
     * The associated object for the role vaccino_covid_prima.
     */
    public void setVaccino_covid_prima(CliFarmaco_altroDTO vaccino_covid_prima) {
        this.vaccino_covid_prima = vaccino_covid_prima;
    }

    /**
     * The associated object for the role vaccino_covid_seconda.
     */
    public CliFarmaco_altroDTO getVaccino_covid_seconda() {
        return vaccino_covid_seconda;
    }
    /**
     * The associated object for the role vaccino_covid_seconda.
     */
    public void setVaccino_covid_seconda(CliFarmaco_altroDTO vaccino_covid_seconda) {
        this.vaccino_covid_seconda = vaccino_covid_seconda;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
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
        if (count_eventi_prima_dose != null) {
            joiner.add("count_eventi_prima_dose: " + GraphQLRequestSerializer.getEntry(count_eventi_prima_dose));
        }
        if (count_eventi_seconda_dose != null) {
            joiner.add("count_eventi_seconda_dose: " + GraphQLRequestSerializer.getEntry(count_eventi_seconda_dose));
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
        if (dosi_vaccino_covid != null) {
            joiner.add("dosi_vaccino_covid: " + GraphQLRequestSerializer.getEntry(dosi_vaccino_covid));
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
        if (vax_ico != null) {
            joiner.add("vax_ico: " + GraphQLRequestSerializer.getEntry(vax_ico));
        }
        if (motivazioni_seconda_dose_1 != null) {
            joiner.add("motivazioni_seconda_dose_1: " + GraphQLRequestSerializer.getEntry(motivazioni_seconda_dose_1));
        }
        if (vaccino_covid_prima != null) {
            joiner.add("vaccino_covid_prima: " + GraphQLRequestSerializer.getEntry(vaccino_covid_prima));
        }
        if (vaccino_covid_seconda != null) {
            joiner.add("vaccino_covid_seconda: " + GraphQLRequestSerializer.getEntry(vaccino_covid_seconda));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliV_dettaglioDTO.Builder builder() {
        return new CliV_dettaglioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _createdon;
        private String _id;
        private String altro_evento_prima_dose;
        private String altro_evento_seconda_dose;
        private String altro_motivazione_seconda_dose;
        private Boolean assenza_lavoro_prima_dose;
        private Boolean assenza_lavoro_seconda_dose;
        private Integer count_eventi_prima_dose;
        private Integer count_eventi_seconda_dose;
        private String data_prima_dose;
        private String data_primo_tampone;
        private String data_primo_tampone_post;
        private String data_seconda_dose;
        private String decorso_infezione_covid;
        private String decorso_infezione_covid_post;
        private String dosi_vaccino_covid;
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
        private Boolean vax_ico;
        private CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_1;
        private CliFarmaco_altroDTO vaccino_covid_prima;
        private CliFarmaco_altroDTO vaccino_covid_seconda;
        private CliPazienteDTO paziente_;

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
         * The attribute _createdon of V_dettaglio. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of V_dettaglio. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro_evento_prima_dose of V_dettaglio. It is of type Text.
         */
        public Builder setAltro_evento_prima_dose(String altro_evento_prima_dose) {
            this.altro_evento_prima_dose = altro_evento_prima_dose;
            return this;
        }

        /**
         * The attribute altro_evento_seconda_dose of V_dettaglio. It is of type Text.
         */
        public Builder setAltro_evento_seconda_dose(String altro_evento_seconda_dose) {
            this.altro_evento_seconda_dose = altro_evento_seconda_dose;
            return this;
        }

        /**
         * The attribute altro_motivazione_seconda_dose of V_dettaglio. It is of type Text.
         */
        public Builder setAltro_motivazione_seconda_dose(String altro_motivazione_seconda_dose) {
            this.altro_motivazione_seconda_dose = altro_motivazione_seconda_dose;
            return this;
        }

        /**
         * The attribute assenza_lavoro_prima_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setAssenza_lavoro_prima_dose(Boolean assenza_lavoro_prima_dose) {
            this.assenza_lavoro_prima_dose = assenza_lavoro_prima_dose;
            return this;
        }

        /**
         * The attribute assenza_lavoro_seconda_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setAssenza_lavoro_seconda_dose(Boolean assenza_lavoro_seconda_dose) {
            this.assenza_lavoro_seconda_dose = assenza_lavoro_seconda_dose;
            return this;
        }

        /**
         * The attribute count_eventi_prima_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_prima_dose __id. Cannot be null.
         */
        public Builder setCount_eventi_prima_dose(Integer count_eventi_prima_dose) {
            this.count_eventi_prima_dose = count_eventi_prima_dose;
            return this;
        }

        /**
         * The attribute count_eventi_seconda_dose of V_dettaglio. It is of type Int. Path: COUNT_DISTINCT - Count distincteventi_seconda_dose __id. Cannot be null.
         */
        public Builder setCount_eventi_seconda_dose(Integer count_eventi_seconda_dose) {
            this.count_eventi_seconda_dose = count_eventi_seconda_dose;
            return this;
        }

        /**
         * The attribute data_prima_dose of V_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_prima_dose(String data_prima_dose) {
            this.data_prima_dose = data_prima_dose;
            return this;
        }

        /**
         * The attribute data_primo_tampone of V_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_primo_tampone(String data_primo_tampone) {
            this.data_primo_tampone = data_primo_tampone;
            return this;
        }

        /**
         * The attribute data_primo_tampone_post of V_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_primo_tampone_post(String data_primo_tampone_post) {
            this.data_primo_tampone_post = data_primo_tampone_post;
            return this;
        }

        /**
         * The attribute data_seconda_dose of V_dettaglio. It is of type Date @dateFormat.
         */
        public Builder setData_seconda_dose(String data_seconda_dose) {
            this.data_seconda_dose = data_seconda_dose;
            return this;
        }

        /**
         * The attribute decorso_infezione_covid of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
         */
        public Builder setDecorso_infezione_covid(String decorso_infezione_covid) {
            this.decorso_infezione_covid = decorso_infezione_covid;
            return this;
        }

        /**
         * The attribute decorso_infezione_covid_post of V_dettaglio. It is of type String. Domain: Asintomatica OR Paucisintomatica OR Severa.}Max length: 255.
         */
        public Builder setDecorso_infezione_covid_post(String decorso_infezione_covid_post) {
            this.decorso_infezione_covid_post = decorso_infezione_covid_post;
            return this;
        }

        /**
         * The attribute dosi_vaccino_covid of V_dettaglio. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)dose_vaccino_covid_ desc. Cannot be null.
         */
        public Builder setDosi_vaccino_covid(String dosi_vaccino_covid) {
            this.dosi_vaccino_covid = dosi_vaccino_covid;
            return this;
        }

        /**
         * The attribute farmaci_prima_dose_bool of V_dettaglio. It is of type Boolean.
         */
        public Builder setFarmaci_prima_dose_bool(Boolean farmaci_prima_dose_bool) {
            this.farmaci_prima_dose_bool = farmaci_prima_dose_bool;
            return this;
        }

        /**
         * The attribute farmaci_prima_dose_text of V_dettaglio. It is of type Text.
         */
        public Builder setFarmaci_prima_dose_text(String farmaci_prima_dose_text) {
            this.farmaci_prima_dose_text = farmaci_prima_dose_text;
            return this;
        }

        /**
         * The attribute farmaci_seconda_dose_bool of V_dettaglio. It is of type Boolean.
         */
        public Builder setFarmaci_seconda_dose_bool(Boolean farmaci_seconda_dose_bool) {
            this.farmaci_seconda_dose_bool = farmaci_seconda_dose_bool;
            return this;
        }

        /**
         * The attribute farmaci_seconda_dose_text of V_dettaglio. It is of type Text.
         */
        public Builder setFarmaci_seconda_dose_text(String farmaci_seconda_dose_text) {
            this.farmaci_seconda_dose_text = farmaci_seconda_dose_text;
            return this;
        }

        /**
         * The attribute imped_attivita_prima_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setImped_attivita_prima_dose(Boolean imped_attivita_prima_dose) {
            this.imped_attivita_prima_dose = imped_attivita_prima_dose;
            return this;
        }

        /**
         * The attribute imped_attivita_seconda_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setImped_attivita_seconda_dose(Boolean imped_attivita_seconda_dose) {
            this.imped_attivita_seconda_dose = imped_attivita_seconda_dose;
            return this;
        }

        /**
         * The attribute infezione_covid of V_dettaglio. It is of type Boolean.
         */
        public Builder setInfezione_covid(Boolean infezione_covid) {
            this.infezione_covid = infezione_covid;
            return this;
        }

        /**
         * The attribute infezione_covid_post of V_dettaglio. It is of type Boolean.
         */
        public Builder setInfezione_covid_post(Boolean infezione_covid_post) {
            this.infezione_covid_post = infezione_covid_post;
            return this;
        }

        /**
         * The attribute intubazione of V_dettaglio. It is of type Boolean.
         */
        public Builder setIntubazione(Boolean intubazione) {
            this.intubazione = intubazione;
            return this;
        }

        /**
         * The attribute ore_durata_sintomi_prima_dose of V_dettaglio. It is of type Real @realFormat.
         */
        public Builder setOre_durata_sintomi_prima_dose(String ore_durata_sintomi_prima_dose) {
            this.ore_durata_sintomi_prima_dose = ore_durata_sintomi_prima_dose;
            return this;
        }

        /**
         * The attribute ore_durata_sintomi_seconda_dose of V_dettaglio. It is of type Real @realFormat.
         */
        public Builder setOre_durata_sintomi_seconda_dose(String ore_durata_sintomi_seconda_dose) {
            this.ore_durata_sintomi_seconda_dose = ore_durata_sintomi_seconda_dose;
            return this;
        }

        /**
         * The attribute ore_primo_sintomo_prima_dose of V_dettaglio. It is of type Real @realFormat.
         */
        public Builder setOre_primo_sintomo_prima_dose(String ore_primo_sintomo_prima_dose) {
            this.ore_primo_sintomo_prima_dose = ore_primo_sintomo_prima_dose;
            return this;
        }

        /**
         * The attribute ore_primo_sintomo_seconda_dose of V_dettaglio. It is of type Real @realFormat.
         */
        public Builder setOre_primo_sintomo_seconda_dose(String ore_primo_sintomo_seconda_dose) {
            this.ore_primo_sintomo_seconda_dose = ore_primo_sintomo_seconda_dose;
            return this;
        }

        /**
         * The attribute ospedale_prima_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setOspedale_prima_dose(Boolean ospedale_prima_dose) {
            this.ospedale_prima_dose = ospedale_prima_dose;
            return this;
        }

        /**
         * The attribute ospedale_seconda_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setOspedale_seconda_dose(Boolean ospedale_seconda_dose) {
            this.ospedale_seconda_dose = ospedale_seconda_dose;
            return this;
        }

        /**
         * The attribute ospedalizzazione of V_dettaglio. It is of type Boolean.
         */
        public Builder setOspedalizzazione(Boolean ospedalizzazione) {
            this.ospedalizzazione = ospedalizzazione;
            return this;
        }

        /**
         * The attribute seconda_dose of V_dettaglio. It is of type Boolean.
         */
        public Builder setSeconda_dose(Boolean seconda_dose) {
            this.seconda_dose = seconda_dose;
            return this;
        }

        /**
         * The attribute terapia_corticoster of V_dettaglio. It is of type Boolean.
         */
        public Builder setTerapia_corticoster(Boolean terapia_corticoster) {
            this.terapia_corticoster = terapia_corticoster;
            return this;
        }

        /**
         * The attribute terapia_immunosopp of V_dettaglio. It is of type Boolean.
         */
        public Builder setTerapia_immunosopp(Boolean terapia_immunosopp) {
            this.terapia_immunosopp = terapia_immunosopp;
            return this;
        }

        /**
         * The attribute terapia_immunosopp_desc of V_dettaglio. It is of type Text.
         */
        public Builder setTerapia_immunosopp_desc(String terapia_immunosopp_desc) {
            this.terapia_immunosopp_desc = terapia_immunosopp_desc;
            return this;
        }

        /**
         * The attribute vax_ico of V_dettaglio. It is of type Boolean. Path: paziente_.centro_appartenenza_attuale vax.
         */
        public Builder setVax_ico(Boolean vax_ico) {
            this.vax_ico = vax_ico;
            return this;
        }

        /**
         * The associated object for the role motivazioni_seconda_dose_1.
         */
        public Builder setMotivazioni_seconda_dose_1(CliMotivazioni_seconda_doseDTO motivazioni_seconda_dose_1) {
            this.motivazioni_seconda_dose_1 = motivazioni_seconda_dose_1;
            return this;
        }

        /**
         * The associated object for the role vaccino_covid_prima.
         */
        public Builder setVaccino_covid_prima(CliFarmaco_altroDTO vaccino_covid_prima) {
            this.vaccino_covid_prima = vaccino_covid_prima;
            return this;
        }

        /**
         * The associated object for the role vaccino_covid_seconda.
         */
        public Builder setVaccino_covid_seconda(CliFarmaco_altroDTO vaccino_covid_seconda) {
            this.vaccino_covid_seconda = vaccino_covid_seconda;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliV_dettaglioDTO build() {
            CliV_dettaglioDTO result = new CliV_dettaglioDTO();
            result.set_clientId(this._clientId);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.setAltro_evento_prima_dose(this.altro_evento_prima_dose);
            result.setAltro_evento_seconda_dose(this.altro_evento_seconda_dose);
            result.setAltro_motivazione_seconda_dose(this.altro_motivazione_seconda_dose);
            result.setAssenza_lavoro_prima_dose(this.assenza_lavoro_prima_dose);
            result.setAssenza_lavoro_seconda_dose(this.assenza_lavoro_seconda_dose);
            result.setCount_eventi_prima_dose(this.count_eventi_prima_dose);
            result.setCount_eventi_seconda_dose(this.count_eventi_seconda_dose);
            result.setData_prima_dose(this.data_prima_dose);
            result.setData_primo_tampone(this.data_primo_tampone);
            result.setData_primo_tampone_post(this.data_primo_tampone_post);
            result.setData_seconda_dose(this.data_seconda_dose);
            result.setDecorso_infezione_covid(this.decorso_infezione_covid);
            result.setDecorso_infezione_covid_post(this.decorso_infezione_covid_post);
            result.setDosi_vaccino_covid(this.dosi_vaccino_covid);
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
            result.setVax_ico(this.vax_ico);
            result.setMotivazioni_seconda_dose_1(this.motivazioni_seconda_dose_1);
            result.setVaccino_covid_prima(this.vaccino_covid_prima);
            result.setVaccino_covid_seconda(this.vaccino_covid_seconda);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
