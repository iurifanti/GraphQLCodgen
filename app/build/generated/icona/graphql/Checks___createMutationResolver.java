package icona.graphql;


/**
 * Create an object of class Checks.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___createMutationResolver {

    /**
     * Create an object of class Checks.
Returns the newly created object.
     */
    CliChecksDTO Checks___create(@javax.validation.constraints.NotNull CliChecksCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
