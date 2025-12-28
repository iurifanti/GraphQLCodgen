package icona.graphql;


/**
 * Retrieve a collection of object of class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Paziente.
     */
    CliPazientePageDTO Paziente___getPage(CliPazientePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
