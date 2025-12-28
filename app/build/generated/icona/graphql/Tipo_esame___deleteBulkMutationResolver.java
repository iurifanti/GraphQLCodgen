package icona.graphql;


/**
 * Bulk delete a set of objects of class Tipo_esame.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Tipo_esame.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Tipo_esame___deleteBulk(@javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
