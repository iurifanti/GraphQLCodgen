package icona.graphql;


/**
 * Delete an object of class P_Paziente.
Returns true if the object has been deleted successfully.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___deleteMutationResolver {

    /**
     * Delete an object of class P_Paziente.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO P_Paziente___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

}
