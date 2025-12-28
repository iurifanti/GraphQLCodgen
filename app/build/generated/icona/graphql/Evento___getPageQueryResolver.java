package icona.graphql;


/**
 * Retrieve a collection of object of class Evento.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Evento___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Evento.
     */
    CliEventoPageDTO Evento___getPage(CliEventoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
