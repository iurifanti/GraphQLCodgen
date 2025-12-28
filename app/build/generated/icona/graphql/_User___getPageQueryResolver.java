package icona.graphql;


/**
 * Retrieve a collection of object of class _User.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class _User.
     */
    Cli_UserPageDTO _User___getPage(Cli_UserPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
