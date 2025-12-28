package icona.graphql;


/**
 * Resolver for V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface V_dettaglioResolver {

    /**
     * The associated objects for the role dose_vaccino_covid_.
     */
    CliDose_vaccino_covidPageDTO dose_vaccino_covid_(CliV_dettaglioDTO v_dettaglio, CliDose_vaccino_covidPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role eventi_prima_dose.
     */
    CliPatologiaPageDTO eventi_prima_dose___associables(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role eventi_prima_dose.
     */
    CliPatologiaPageDTO eventi_prima_dose(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role eventi_seconda_dose.
     */
    CliPatologiaPageDTO eventi_seconda_dose___associables(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role eventi_seconda_dose.
     */
    CliPatologiaPageDTO eventi_seconda_dose(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazioni_seconda_dose_1.
     */
    CliMotivazioni_seconda_dosePageDTO motivazioni_seconda_dose_1___associables(CliV_dettaglioDTO v_dettaglio, CliMotivazioni_seconda_dosePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role sierologie_covid_.
     */
    CliSierologie_covidPageDTO sierologie_covid_(CliV_dettaglioDTO v_dettaglio, CliSierologie_covidPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role sintomo_covid_post.
     */
    CliPatologiaPageDTO sintomo_covid_post___associables(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role sintomo_covid_post.
     */
    CliPatologiaPageDTO sintomo_covid_post(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role sintomo_covid_pre.
     */
    CliPatologiaPageDTO sintomo_covid_pre___associables(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role sintomo_covid_pre.
     */
    CliPatologiaPageDTO sintomo_covid_pre(CliV_dettaglioDTO v_dettaglio, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role vaccino_covid_prima.
     */
    CliFarmaco_altroPageDTO vaccino_covid_prima___associables(CliV_dettaglioDTO v_dettaglio, CliFarmaco_altroPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role vaccino_covid_seconda.
     */
    CliFarmaco_altroPageDTO vaccino_covid_seconda___associables(CliV_dettaglioDTO v_dettaglio, CliFarmaco_altroPageOptionsDTO options) throws Exception;

}
