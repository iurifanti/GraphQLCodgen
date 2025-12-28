package icona.graphql;


/**
 * Bulk update a set of objects of class P_Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class P_Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliP_PazienteBulkResultDTO P_Paziente___updateBulk(@javax.validation.constraints.NotNull CliP_PazienteUpdateBulkDTO data, @javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
