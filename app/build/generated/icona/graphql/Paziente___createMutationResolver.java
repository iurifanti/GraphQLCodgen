package icona.graphql;


/**
 * Create an object of class Paziente.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___createMutationResolver {

    /**
     * Create an object of class Paziente.
Returns the newly created object.
     */
    CliPazienteDTO Paziente___create(@javax.validation.constraints.NotNull CliPazienteCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
