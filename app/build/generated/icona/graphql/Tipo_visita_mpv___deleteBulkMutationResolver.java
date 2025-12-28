package icona.graphql;


/**
 * Bulk delete a set of objects of class Tipo_visita_mpv.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_visita_mpv___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Tipo_visita_mpv.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Tipo_visita_mpv___deleteBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
