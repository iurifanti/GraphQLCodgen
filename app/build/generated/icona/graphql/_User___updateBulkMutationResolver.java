package icona.graphql;


/**
 * Bulk update a set of objects of class _User.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class _User.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    Cli_UserBulkResultDTO _User___updateBulk(@javax.validation.constraints.NotNull Cli_UserUpdateBulkDTO data, @javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
