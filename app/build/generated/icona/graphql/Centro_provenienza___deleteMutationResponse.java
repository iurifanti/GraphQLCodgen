package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Delete an object of class Centro_provenienza.
Returns true if the object has been deleted successfully.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Centro_provenienza___deleteMutationResponse extends GraphQLResult<Map<String, CliDeleteResultDTO>> {

    private static final String OPERATION_NAME = "Centro_provenienza___delete";

    public Centro_provenienza___deleteMutationResponse() {
    }

    /**
     * Delete an object of class Centro_provenienza.
Returns true if the object has been deleted successfully.
     */
    public CliDeleteResultDTO Centro_provenienza___delete() {
        Map<String, CliDeleteResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
