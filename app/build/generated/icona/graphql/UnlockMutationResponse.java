package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class UnlockMutationResponse extends GraphQLResult<Map<String, CliLockStatusResultDTO>> {

    private static final String OPERATION_NAME = "unlock";

    public UnlockMutationResponse() {
    }

    public CliLockStatusResultDTO unlock() {
        Map<String, CliLockStatusResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
