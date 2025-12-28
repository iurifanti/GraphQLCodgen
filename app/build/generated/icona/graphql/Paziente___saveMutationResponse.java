package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Paziente.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Paziente___saveMutationResponse extends GraphQLResult<Map<String, CliPazienteDTO>> {

    private static final String OPERATION_NAME = "Paziente___save";

    public Paziente___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Paziente.
Returns the newly created/updated object.
     */
    public CliPazienteDTO Paziente___save() {
        Map<String, CliPazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
