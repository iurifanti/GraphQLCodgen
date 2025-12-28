package icona.graphql;


/**
 * Bulk delete a set of objects of class P_Paziente.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class P_Paziente.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO P_Paziente___deleteBulk(@javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
