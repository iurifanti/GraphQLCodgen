package icona.graphql;


/**
 * Update an object of class Sequenza_genomica.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___updateMutationResolver {

    /**
     * Update an object of class Sequenza_genomica.
Returns the newly created object.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___update(@javax.validation.constraints.NotNull CliSequenza_genomicaUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
