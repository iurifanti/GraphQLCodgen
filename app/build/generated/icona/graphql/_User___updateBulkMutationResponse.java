package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class _User.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class _User___updateBulkMutationResponse extends GraphQLResult<Map<String, Cli_UserBulkResultDTO>> {

    private static final String OPERATION_NAME = "_User___updateBulk";

    public _User___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class _User.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public Cli_UserBulkResultDTO _User___updateBulk() {
        Map<String, Cli_UserBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
