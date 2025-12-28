package icona.graphql;


/**
 * Bulk delete a set of objects of class Centro_provenienza.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Centro_provenienza___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Centro_provenienza.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Centro_provenienza___deleteBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
