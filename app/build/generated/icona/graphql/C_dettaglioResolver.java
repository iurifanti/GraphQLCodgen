package icona.graphql;


/**
 * Resolver for C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface C_dettaglioResolver {

    /**
     * The associated objects for the role evento_covid.
     */
    CliEventoPageDTO evento_covid(CliC_dettaglioDTO c_dettaglio, CliEventoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role livello_ventilazione_covid_.
     */
    CliLivello_ventilazione_covidPageDTO livello_ventilazione_covid____associables(CliC_dettaglioDTO c_dettaglio, CliLivello_ventilazione_covidPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role outcome_covid_.
     */
    CliOutcome_covidPageDTO outcome_covid____associables(CliC_dettaglioDTO c_dettaglio, CliOutcome_covidPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role terapia_covid_.
     */
    CliTerapia_covidPageDTO terapia_covid_(CliC_dettaglioDTO c_dettaglio, CliTerapia_covidPageOptionsDTO options) throws Exception;

}
