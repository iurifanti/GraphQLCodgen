package icona.graphql;


/**
 * Bulk update a set of objects of class Sequenza_genomica.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Sequenza_genomica.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliSequenza_genomicaBulkResultDTO Sequenza_genomica___updateBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaUpdateBulkDTO data, @javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
