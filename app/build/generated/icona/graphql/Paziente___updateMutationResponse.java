package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class Paziente.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___updateMutationResponse extends GraphQLResult<Map<String, CliPazienteDTO>> {

    private static final String OPERATION_NAME = "Paziente___update";

    public Paziente___updateMutationResponse() {
    }

    /**
     * Update an object of class Paziente.
Returns the newly created object.
     */
    public CliPazienteDTO Paziente___update() {
        Map<String, CliPazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
