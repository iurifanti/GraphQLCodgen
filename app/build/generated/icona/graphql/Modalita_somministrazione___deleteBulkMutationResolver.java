package icona.graphql;


/**
 * Bulk delete a set of objects of class Modalita_somministrazione.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Modalita_somministrazione.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Modalita_somministrazione___deleteBulk(@javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
