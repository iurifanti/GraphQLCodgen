package icona.graphql;


/**
 * Bulk update a set of objects of class Tipo_esame.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Tipo_esame.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliTipo_esameBulkResultDTO Tipo_esame___updateBulk(@javax.validation.constraints.NotNull CliTipo_esameUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
