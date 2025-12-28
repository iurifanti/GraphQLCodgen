package icona.graphql;


/**
 * Create or update an object of class _User.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___saveMutationResolver {

    /**
     * Create or update an object of class _User.
Returns the newly created/updated object.
     */
    Cli_UserDTO _User___save(@javax.validation.constraints.NotNull Cli_UserDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
