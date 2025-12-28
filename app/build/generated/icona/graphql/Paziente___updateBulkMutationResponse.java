package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___updateBulkMutationResponse extends GraphQLResult<Map<String, CliPazienteBulkResultDTO>> {

    private static final String OPERATION_NAME = "Paziente___updateBulk";

    public Paziente___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliPazienteBulkResultDTO Paziente___updateBulk() {
        Map<String, CliPazienteBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
