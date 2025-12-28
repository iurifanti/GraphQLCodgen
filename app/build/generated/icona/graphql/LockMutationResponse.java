package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class LockMutationResponse extends GraphQLResult<Map<String, CliLockStatusResultDTO>> {

    private static final String OPERATION_NAME = "lock";

    public LockMutationResponse() {
    }

    public CliLockStatusResultDTO lock() {
        Map<String, CliLockStatusResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
