package icona.graphql;


/**
 * Retrieve a single object of class Tipo_visita_mpv by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_visita_mpv___getQueryResolver {

    /**
     * Retrieve a single object of class Tipo_visita_mpv by ID.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
