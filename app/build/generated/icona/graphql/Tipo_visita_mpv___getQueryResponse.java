package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Tipo_visita_mpv by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_visita_mpv___getQueryResponse extends GraphQLResult<Map<String, CliTipo_visita_mpvDTO>> {

    private static final String OPERATION_NAME = "Tipo_visita_mpv___get";

    public Tipo_visita_mpv___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Tipo_visita_mpv by ID.
     */
    public CliTipo_visita_mpvDTO Tipo_visita_mpv___get() {
        Map<String, CliTipo_visita_mpvDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
