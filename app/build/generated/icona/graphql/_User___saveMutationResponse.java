package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class _User.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class _User___saveMutationResponse extends GraphQLResult<Map<String, Cli_UserDTO>> {

    private static final String OPERATION_NAME = "_User___save";

    public _User___saveMutationResponse() {
    }

    /**
     * Create or update an object of class _User.
Returns the newly created/updated object.
     */
    public Cli_UserDTO _User___save() {
        Map<String, Cli_UserDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
