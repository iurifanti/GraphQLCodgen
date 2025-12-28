package icona.graphql;


/**
 * Retrieve a collection of object of class Gruppo.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Gruppo.
     */
    CliGruppoPageDTO Gruppo___getPage(CliGruppoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
