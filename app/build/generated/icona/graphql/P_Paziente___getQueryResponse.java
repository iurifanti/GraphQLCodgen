package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class P_Paziente by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class P_Paziente___getQueryResponse extends GraphQLResult<Map<String, CliP_PazienteDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___get";

    public P_Paziente___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class P_Paziente by ID.
     */
    public CliP_PazienteDTO P_Paziente___get() {
        Map<String, CliP_PazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
