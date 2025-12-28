package icona.graphql;


/**
 * Bulk delete a set of objects of class Checks.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Checks.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Checks___deleteBulk(@javax.validation.constraints.NotNull CliChecksPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
