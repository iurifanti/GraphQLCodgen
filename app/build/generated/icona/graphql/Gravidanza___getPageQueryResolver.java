package icona.graphql;


/**
 * Retrieve a collection of object of class Gravidanza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gravidanza___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Gravidanza.
     */
    CliGravidanzaPageDTO Gravidanza___getPage(CliGravidanzaPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
