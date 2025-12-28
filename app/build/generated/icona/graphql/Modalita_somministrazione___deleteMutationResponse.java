package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Delete an object of class Modalita_somministrazione.
Returns true if the object has been deleted successfully.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Modalita_somministrazione___deleteMutationResponse extends GraphQLResult<Map<String, CliDeleteResultDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___delete";

    public Modalita_somministrazione___deleteMutationResponse() {
    }

    /**
     * Delete an object of class Modalita_somministrazione.
Returns true if the object has been deleted successfully.
     */
    public CliDeleteResultDTO Modalita_somministrazione___delete() {
        Map<String, CliDeleteResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
