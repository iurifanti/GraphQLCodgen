package icona.graphql;


/**
 * Resolver for Sierologie_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Sierologie_covidResolver {

    /**
     * The associable objects for the role metodica_sierologia_covid_n.
     */
    CliMetodica_sierologia_covidPageDTO metodica_sierologia_covid_n___associables(CliSierologie_covidDTO sierologie_covid, CliMetodica_sierologia_covidPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tempo_sierologia_covid_.
     */
    CliTempo_sierologia_covidPageDTO tempo_sierologia_covid____associables(CliSierologie_covidDTO sierologie_covid, CliTempo_sierologia_covidPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tipo_sierologia_covid_.
     */
    CliTipo_sierologia_covidPageDTO tipo_sierologia_covid____associables(CliSierologie_covidDTO sierologie_covid, CliTipo_sierologia_covidPageOptionsDTO options) throws Exception;

}
