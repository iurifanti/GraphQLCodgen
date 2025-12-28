package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Evento by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Evento___getQueryResponse extends GraphQLResult<Map<String, CliEventoDTO>> {

    private static final String OPERATION_NAME = "Evento___get";

    public Evento___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Evento by ID.
     */
    public CliEventoDTO Evento___get() {
        Map<String, CliEventoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
