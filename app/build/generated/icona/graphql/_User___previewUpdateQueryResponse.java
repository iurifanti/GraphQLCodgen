package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class _User for an updated instance of _User.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___previewUpdateQueryResponse extends GraphQLResult<Map<String, Cli_UserDTO>> {

    private static final String OPERATION_NAME = "_User___previewUpdate";

    public _User___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class _User for an updated instance of _User.
     */
    public Cli_UserDTO _User___previewUpdate() {
        Map<String, Cli_UserDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
