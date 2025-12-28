package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class _User.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___getPageQueryResponse extends GraphQLResult<Map<String, Cli_UserPageDTO>> {

    private static final String OPERATION_NAME = "_User___getPage";

    public _User___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class _User.
     */
    public Cli_UserPageDTO _User___getPage() {
        Map<String, Cli_UserPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
