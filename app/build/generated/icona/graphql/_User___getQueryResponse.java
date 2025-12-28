package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class _User by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___getQueryResponse extends GraphQLResult<Map<String, Cli_UserDTO>> {

    private static final String OPERATION_NAME = "_User___get";

    public _User___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class _User by ID.
     */
    public Cli_UserDTO _User___get() {
        Map<String, Cli_UserDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
