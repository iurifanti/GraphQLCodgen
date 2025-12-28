package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Tipo_visita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Tipo_visita_mpv___updateBulkMutationResponse extends GraphQLResult<Map<String, CliTipo_visita_mpvBulkResultDTO>> {

    private static final String OPERATION_NAME = "Tipo_visita_mpv___updateBulk";

    public Tipo_visita_mpv___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Tipo_visita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliTipo_visita_mpvBulkResultDTO Tipo_visita_mpv___updateBulk() {
        Map<String, CliTipo_visita_mpvBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
