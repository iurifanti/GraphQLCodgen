package icona.graphql;


/**
 * Bulk update a set of objects of class Comorbidita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Comorbidita_mpv___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class Comorbidita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliComorbidita_mpvBulkResultDTO Comorbidita_mpv___updateBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvUpdateBulkDTO data, @javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
