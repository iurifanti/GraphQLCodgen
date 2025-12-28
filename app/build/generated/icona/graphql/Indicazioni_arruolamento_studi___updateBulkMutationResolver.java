package icona.graphql;


/**
 * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliIndicazioni_arruolamento_studiBulkResultDTO Indicazioni_arruolamento_studi___updateBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiUpdateBulkDTO data, @javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
