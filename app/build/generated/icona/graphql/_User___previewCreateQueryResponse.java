package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class _User for an object of _User not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___previewCreateQueryResponse extends GraphQLResult<Map<String, Cli_UserDTO>> {

    private static final String OPERATION_NAME = "_User___previewCreate";

    public _User___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class _User for an object of _User not yet instanced.
     */
    public Cli_UserDTO _User___previewCreate() {
        Map<String, Cli_UserDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
