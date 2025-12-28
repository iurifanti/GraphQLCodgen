package icona.graphql;


/**
 * Retrieve a single object of class _User by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___getQueryResolver {

    /**
     * Retrieve a single object of class _User by ID.
     */
    Cli_UserDTO _User___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
