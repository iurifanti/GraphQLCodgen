package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliDose_vaccino_covidSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altro_evento___ASC("altro_evento___ASC"),
    altro_evento___DESC("altro_evento___DESC"),
    altro_motivazione_seconda_dose___ASC("altro_motivazione_seconda_dose___ASC"),
    altro_motivazione_seconda_dose___DESC("altro_motivazione_seconda_dose___DESC"),
    assenza_lavoro_prima_dose___ASC("assenza_lavoro_prima_dose___ASC"),
    assenza_lavoro_prima_dose___DESC("assenza_lavoro_prima_dose___DESC"),
    count_eventi___ASC("count_eventi___ASC"),
    count_eventi___DESC("count_eventi___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    dose_successiva___ASC("dose_successiva___ASC"),
    dose_successiva___DESC("dose_successiva___DESC"),
    eventi_avversi___ASC("eventi_avversi___ASC"),
    eventi_avversi___DESC("eventi_avversi___DESC"),
    farmaci_prima_dose_bool___ASC("farmaci_prima_dose_bool___ASC"),
    farmaci_prima_dose_bool___DESC("farmaci_prima_dose_bool___DESC"),
    farmaci_prima_dose_text___ASC("farmaci_prima_dose_text___ASC"),
    farmaci_prima_dose_text___DESC("farmaci_prima_dose_text___DESC"),
    imped_attivita_prima_dose___ASC("imped_attivita_prima_dose___ASC"),
    imped_attivita_prima_dose___DESC("imped_attivita_prima_dose___DESC"),
    motivazioni_dose_successiva___ASC("motivazioni_dose_successiva___ASC"),
    motivazioni_dose_successiva___DESC("motivazioni_dose_successiva___DESC"),
    ore_durata_sintomi_prima_dose___ASC("ore_durata_sintomi_prima_dose___ASC"),
    ore_durata_sintomi_prima_dose___DESC("ore_durata_sintomi_prima_dose___DESC"),
    ore_durata_sintomi_prima_dose_1___ASC("ore_durata_sintomi_prima_dose_1___ASC"),
    ore_durata_sintomi_prima_dose_1___DESC("ore_durata_sintomi_prima_dose_1___DESC"),
    ore_primo_sintomo_prima_dose___ASC("ore_primo_sintomo_prima_dose___ASC"),
    ore_primo_sintomo_prima_dose___DESC("ore_primo_sintomo_prima_dose___DESC"),
    ore_primo_sintomo_prima_dose_1___ASC("ore_primo_sintomo_prima_dose_1___ASC"),
    ore_primo_sintomo_prima_dose_1___DESC("ore_primo_sintomo_prima_dose_1___DESC"),
    ospedale_prima_dose___ASC("ospedale_prima_dose___ASC"),
    ospedale_prima_dose___DESC("ospedale_prima_dose___DESC"),
    vaccino___ASC("vaccino___ASC"),
    vaccino___DESC("vaccino___DESC");

    private final String graphqlName;

    private CliDose_vaccino_covidSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
