package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Centro_provenienza.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Centro_provenienza___updateBulkMutationResponse extends GraphQLResult<Map<String, CliCentro_provenienzaBulkResultDTO>> {

    private static final String OPERATION_NAME = "Centro_provenienza___updateBulk";

    public Centro_provenienza___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Centro_provenienza.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliCentro_provenienzaBulkResultDTO Centro_provenienza___updateBulk() {
        Map<String, CliCentro_provenienzaBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
