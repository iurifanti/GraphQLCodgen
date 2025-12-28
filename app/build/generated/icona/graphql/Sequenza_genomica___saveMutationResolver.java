package icona.graphql;


/**
 * Create or update an object of class Sequenza_genomica.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___saveMutationResolver {

    /**
     * Create or update an object of class Sequenza_genomica.
Returns the newly created/updated object.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___save(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
