package icona.graphql;


/**
 * Create or update an object of class Paziente.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___saveMutationResolver {

    /**
     * Create or update an object of class Paziente.
Returns the newly created/updated object.
     */
    CliPazienteDTO Paziente___save(@javax.validation.constraints.NotNull CliPazienteDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
