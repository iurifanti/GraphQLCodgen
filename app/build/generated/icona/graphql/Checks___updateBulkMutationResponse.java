package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Checks.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___updateBulkMutationResponse extends GraphQLResult<Map<String, CliChecksBulkResultDTO>> {

    private static final String OPERATION_NAME = "Checks___updateBulk";

    public Checks___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Checks.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliChecksBulkResultDTO Checks___updateBulk() {
        Map<String, CliChecksBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
