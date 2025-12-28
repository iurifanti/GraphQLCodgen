package icona.graphql;


/**
 * Resolver for Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Dose_vaccino_covidResolver {

    /**
     * The associable objects for the role eventi_vaccino_covid.
     */
    CliPatologiaPageDTO eventi_vaccino_covid___associables(CliDose_vaccino_covidDTO dose_vaccino_covid, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role eventi_vaccino_covid.
     */
    CliPatologiaPageDTO eventi_vaccino_covid(CliDose_vaccino_covidDTO dose_vaccino_covid, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazioni_seconda_dose_.
     */
    CliMotivazioni_seconda_dosePageDTO motivazioni_seconda_dose____associables(CliDose_vaccino_covidDTO dose_vaccino_covid, CliMotivazioni_seconda_dosePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tempo_dose_vaccino_.
     */
    CliTempo_dose_vaccinoPageDTO tempo_dose_vaccino____associables(CliDose_vaccino_covidDTO dose_vaccino_covid, CliTempo_dose_vaccinoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role vaccino_covid.
     */
    CliFarmaco_altroPageDTO vaccino_covid___associables(CliDose_vaccino_covidDTO dose_vaccino_covid, CliFarmaco_altroPageOptionsDTO options) throws Exception;

}
