package icona.graphql;


/**
 * Create or update an object of class Checks.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___saveMutationResolver {

    /**
     * Create or update an object of class Checks.
Returns the newly created/updated object.
     */
    CliChecksDTO Checks___save(@javax.validation.constraints.NotNull CliChecksDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
