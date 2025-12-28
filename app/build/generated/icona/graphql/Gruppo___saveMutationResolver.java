package icona.graphql;


/**
 * Create or update an object of class Gruppo.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___saveMutationResolver {

    /**
     * Create or update an object of class Gruppo.
Returns the newly created/updated object.
     */
    CliGruppoDTO Gruppo___save(@javax.validation.constraints.NotNull CliGruppoDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
