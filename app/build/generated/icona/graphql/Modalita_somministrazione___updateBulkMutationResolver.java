package icona.graphql;


/**
 * Bulk update a set of objects of class Modalita_somministrazione.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Modalita_somministrazione.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliModalita_somministrazioneBulkResultDTO Modalita_somministrazione___updateBulk(@javax.validation.constraints.NotNull CliModalita_somministrazioneUpdateBulkDTO data, @javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
