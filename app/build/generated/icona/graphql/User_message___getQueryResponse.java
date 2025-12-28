package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve the object of singleton class User_message
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class User_message___getQueryResponse extends GraphQLResult<Map<String, CliUser_messageDTO>> {

    private static final String OPERATION_NAME = "User_message___get";

    public User_message___getQueryResponse() {
    }

    /**
     * Retrieve the object of singleton class User_message
     */
    public CliUser_messageDTO User_message___get() {
        Map<String, CliUser_messageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
