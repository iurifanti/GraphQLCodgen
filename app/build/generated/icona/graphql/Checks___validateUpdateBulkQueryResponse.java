package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a bulk update on a set of objects of class Checks.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___validateUpdateBulkQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Checks___validateUpdateBulk";

    public Checks___validateUpdateBulkQueryResponse() {
    }

    /**
     * Validation of a bulk update on a set of objects of class Checks.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Checks___validateUpdateBulk() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
