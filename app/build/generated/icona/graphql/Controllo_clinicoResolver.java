package icona.graphql;


/**
 * Resolver for Controllo_clinico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Controllo_clinicoResolver {

    /**
     * The associated objects for the role sierologie_covid_.
     */
    CliSierologie_covidPageDTO sierologie_covid_(CliControllo_clinicoDTO controllo_clinico, CliSierologie_covidPageOptionsDTO options) throws Exception;

}
