package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Gravidanza by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gravidanza___getQueryResponse extends GraphQLResult<Map<String, CliGravidanzaDTO>> {

    private static final String OPERATION_NAME = "Gravidanza___get";

    public Gravidanza___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Gravidanza by ID.
     */
    public CliGravidanzaDTO Gravidanza___get() {
        Map<String, CliGravidanzaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
