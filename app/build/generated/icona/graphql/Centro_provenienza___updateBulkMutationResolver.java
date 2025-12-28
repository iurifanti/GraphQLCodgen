package icona.graphql;


/**
 * Bulk update a set of objects of class Centro_provenienza.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Centro_provenienza___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Centro_provenienza.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliCentro_provenienzaBulkResultDTO Centro_provenienza___updateBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaUpdateBulkDTO data, @javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
