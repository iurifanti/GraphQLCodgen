package icona.graphql;


/**
 * Update an object of class Checks.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___updateMutationResolver {

    /**
     * Update an object of class Checks.
Returns the newly created object.
     */
    CliChecksDTO Checks___update(@javax.validation.constraints.NotNull CliChecksUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
