package icona.graphql;


/**
 * Create or update an object of class P_Paziente.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___saveMutationResolver {

    /**
     * Create or update an object of class P_Paziente.
Returns the newly created/updated object.
     */
    CliP_PazienteDTO P_Paziente___save(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
