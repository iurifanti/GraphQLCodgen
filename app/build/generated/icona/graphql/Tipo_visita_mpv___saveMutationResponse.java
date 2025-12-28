package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Tipo_visita_mpv.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Tipo_visita_mpv___saveMutationResponse extends GraphQLResult<Map<String, CliTipo_visita_mpvDTO>> {

    private static final String OPERATION_NAME = "Tipo_visita_mpv___save";

    public Tipo_visita_mpv___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Tipo_visita_mpv.
Returns the newly created/updated object.
     */
    public CliTipo_visita_mpvDTO Tipo_visita_mpv___save() {
        Map<String, CliTipo_visita_mpvDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
