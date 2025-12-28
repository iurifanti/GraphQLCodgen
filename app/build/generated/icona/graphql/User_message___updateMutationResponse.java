package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of singleton class User_message.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class User_message___updateMutationResponse extends GraphQLResult<Map<String, CliUser_messageDTO>> {

    private static final String OPERATION_NAME = "User_message___update";

    public User_message___updateMutationResponse() {
    }

    /**
     * Update an object of singleton class User_message.
Returns the newly created object.
     */
    public CliUser_messageDTO User_message___update() {
        Map<String, CliUser_messageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
