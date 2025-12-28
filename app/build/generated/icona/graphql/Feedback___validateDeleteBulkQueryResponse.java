package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a bulk delete on a set of objects of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___validateDeleteBulkQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Feedback___validateDeleteBulk";

    public Feedback___validateDeleteBulkQueryResponse() {
    }

    /**
     * Validation of a bulk delete on a set of objects of class Feedback.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Feedback___validateDeleteBulk() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
