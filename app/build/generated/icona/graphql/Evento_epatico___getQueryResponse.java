package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Evento_epatico by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Evento_epatico___getQueryResponse extends GraphQLResult<Map<String, CliEvento_epaticoDTO>> {

    private static final String OPERATION_NAME = "Evento_epatico___get";

    public Evento_epatico___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Evento_epatico by ID.
     */
    public CliEvento_epaticoDTO Evento_epatico___get() {
        Map<String, CliEvento_epaticoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
