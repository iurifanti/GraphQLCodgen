package icona.graphql;


/**
 * Create an object of class Gruppo.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___createMutationResolver {

    /**
     * Create an object of class Gruppo.
Returns the newly created object.
     */
    CliGruppoDTO Gruppo___create(@javax.validation.constraints.NotNull CliGruppoCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
