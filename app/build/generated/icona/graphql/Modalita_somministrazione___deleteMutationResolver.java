package icona.graphql;


/**
 * Delete an object of class Modalita_somministrazione.
Returns true if the object has been deleted successfully.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___deleteMutationResolver {

    /**
     * Delete an object of class Modalita_somministrazione.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Modalita_somministrazione___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

}
