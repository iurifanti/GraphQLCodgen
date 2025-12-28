package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class P_Paziente.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class P_Paziente___updateMutationResponse extends GraphQLResult<Map<String, CliP_PazienteDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___update";

    public P_Paziente___updateMutationResponse() {
    }

    /**
     * Update an object of class P_Paziente.
Returns the newly created object.
     */
    public CliP_PazienteDTO P_Paziente___update() {
        Map<String, CliP_PazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
