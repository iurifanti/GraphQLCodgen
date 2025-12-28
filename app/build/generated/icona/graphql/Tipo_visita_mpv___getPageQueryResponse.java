package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Tipo_visita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_visita_mpv___getPageQueryResponse extends GraphQLResult<Map<String, CliTipo_visita_mpvPageDTO>> {

    private static final String OPERATION_NAME = "Tipo_visita_mpv___getPage";

    public Tipo_visita_mpv___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Tipo_visita_mpv.
     */
    public CliTipo_visita_mpvPageDTO Tipo_visita_mpv___getPage() {
        Map<String, CliTipo_visita_mpvPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
