package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Evento.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Evento___getPageQueryResponse extends GraphQLResult<Map<String, CliEventoPageDTO>> {

    private static final String OPERATION_NAME = "Evento___getPage";

    public Evento___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Evento.
     */
    public CliEventoPageDTO Evento___getPage() {
        Map<String, CliEventoPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
