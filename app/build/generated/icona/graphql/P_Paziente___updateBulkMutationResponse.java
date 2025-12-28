package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class P_Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class P_Paziente___updateBulkMutationResponse extends GraphQLResult<Map<String, CliP_PazienteBulkResultDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___updateBulk";

    public P_Paziente___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class P_Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliP_PazienteBulkResultDTO P_Paziente___updateBulk() {
        Map<String, CliP_PazienteBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
