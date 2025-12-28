package icona.graphql;


/**
 * Bulk delete a set of objects of class Comorbidita_mpv.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Comorbidita_mpv___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Comorbidita_mpv.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Comorbidita_mpv___deleteBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
