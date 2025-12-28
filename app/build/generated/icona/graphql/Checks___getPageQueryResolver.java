package icona.graphql;


/**
 * Retrieve a collection of object of class Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Checks.
     */
    CliChecksPageDTO Checks___getPage(CliChecksPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
