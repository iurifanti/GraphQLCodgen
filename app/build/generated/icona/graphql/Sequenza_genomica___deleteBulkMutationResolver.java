package icona.graphql;


/**
 * Bulk delete a set of objects of class Sequenza_genomica.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Sequenza_genomica.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Sequenza_genomica___deleteBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
