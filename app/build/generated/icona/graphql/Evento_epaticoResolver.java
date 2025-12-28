package icona.graphql;


/**
 * Resolver for Evento_epatico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Evento_epaticoResolver {

    /**
     * The associable objects for the role biopsia_epatica.
     */
    CliPatologiaPageDTO biopsia_epatica___associables(CliEvento_epaticoDTO evento_epatico, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role biopsia_epatica.
     */
    CliPatologiaPageDTO biopsia_epatica(CliEvento_epaticoDTO evento_epatico, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role patologia_epatica.
     */
    CliPatologiaPageDTO patologia_epatica___associables(CliEvento_epaticoDTO evento_epatico, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role patologia_epatica.
     */
    CliPatologiaPageDTO patologia_epatica(CliEvento_epaticoDTO evento_epatico, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role patologia_epatica_dad1.
     */
    CliPatologiaPageDTO patologia_epatica_dad1___associables(CliEvento_epaticoDTO evento_epatico, CliPatologiaPageOptionsDTO options) throws Exception;

}
