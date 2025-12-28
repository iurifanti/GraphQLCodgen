package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class _User.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class _User___updateMutationResponse extends GraphQLResult<Map<String, Cli_UserDTO>> {

    private static final String OPERATION_NAME = "_User___update";

    public _User___updateMutationResponse() {
    }

    /**
     * Update an object of class _User.
Returns the newly created object.
     */
    public Cli_UserDTO _User___update() {
        Map<String, Cli_UserDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
