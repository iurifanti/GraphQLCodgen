package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class P_Paziente.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class P_Paziente___saveMutationResponse extends GraphQLResult<Map<String, CliP_PazienteDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___save";

    public P_Paziente___saveMutationResponse() {
    }

    /**
     * Create or update an object of class P_Paziente.
Returns the newly created/updated object.
     */
    public CliP_PazienteDTO P_Paziente___save() {
        Map<String, CliP_PazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
