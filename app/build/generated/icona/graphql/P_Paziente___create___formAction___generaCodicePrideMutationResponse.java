package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on a new object of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class P_Paziente___create___formAction___generaCodicePrideMutationResponse extends GraphQLResult<Map<String, CliP_PazienteFormActionHandlerResultDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___create___formAction___generaCodicePride";

    public P_Paziente___create___formAction___generaCodicePrideMutationResponse() {
    }

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on a new object of class P_Paziente.
     */
    public CliP_PazienteFormActionHandlerResultDTO P_Paziente___create___formAction___generaCodicePride() {
        Map<String, CliP_PazienteFormActionHandlerResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
