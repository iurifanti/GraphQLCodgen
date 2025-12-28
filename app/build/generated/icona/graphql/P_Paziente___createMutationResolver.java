package icona.graphql;


/**
 * Create an object of class P_Paziente.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___createMutationResolver {

    /**
     * Create an object of class P_Paziente.
Returns the newly created object.
     */
    CliP_PazienteDTO P_Paziente___create(@javax.validation.constraints.NotNull CliP_PazienteCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
