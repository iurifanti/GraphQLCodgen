package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Evento_epatico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Evento_epatico___getPageQueryResponse extends GraphQLResult<Map<String, CliEvento_epaticoPageDTO>> {

    private static final String OPERATION_NAME = "Evento_epatico___getPage";

    public Evento_epatico___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Evento_epatico.
     */
    public CliEvento_epaticoPageDTO Evento_epatico___getPage() {
        Map<String, CliEvento_epaticoPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
