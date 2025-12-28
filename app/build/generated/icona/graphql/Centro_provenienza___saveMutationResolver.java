package icona.graphql;


/**
 * Create or update an object of class Centro_provenienza.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Centro_provenienza___saveMutationResolver {

    /**
     * Create or update an object of class Centro_provenienza.
Returns the newly created/updated object.
     */
    CliCentro_provenienzaDTO Centro_provenienza___save(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
