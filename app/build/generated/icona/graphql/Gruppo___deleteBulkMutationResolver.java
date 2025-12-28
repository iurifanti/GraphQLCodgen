package icona.graphql;


/**
 * Bulk delete a set of objects of class Gruppo.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Gruppo.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Gruppo___deleteBulk(@javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
