package icona.graphql;


/**
 * Retrieve a single object of class Tipo_visita_mpv by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_visita_mpv___getByNomeQueryResolver {

    /**
     * Retrieve a single object of class Tipo_visita_mpv by uniques.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
