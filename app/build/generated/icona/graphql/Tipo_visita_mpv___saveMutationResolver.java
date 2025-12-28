package icona.graphql;


/**
 * Create or update an object of class Tipo_visita_mpv.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_visita_mpv___saveMutationResolver {

    /**
     * Create or update an object of class Tipo_visita_mpv.
Returns the newly created/updated object.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___save(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
