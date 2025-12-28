package icona.graphql;


/**
 * Retrieve a collection of object of class Evento_epatico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Evento_epatico___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Evento_epatico.
     */
    CliEvento_epaticoPageDTO Evento_epatico___getPage(CliEvento_epaticoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
