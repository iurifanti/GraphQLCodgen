package icona.graphql;


/**
 * Update an object of class _User.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___updateMutationResolver {

    /**
     * Update an object of class _User.
Returns the newly created object.
     */
    Cli_UserDTO _User___update(@javax.validation.constraints.NotNull Cli_UserUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
