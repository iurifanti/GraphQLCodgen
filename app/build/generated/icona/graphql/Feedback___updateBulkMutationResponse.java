package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Feedback.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___updateBulkMutationResponse extends GraphQLResult<Map<String, CliFeedbackBulkResultDTO>> {

    private static final String OPERATION_NAME = "Feedback___updateBulk";

    public Feedback___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Feedback.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliFeedbackBulkResultDTO Feedback___updateBulk() {
        Map<String, CliFeedbackBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
