package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a delete on object of class _User.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class _User___validateDeleteQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "_User___validateDelete";

    public _User___validateDeleteQueryResponse() {
    }

    /**
     * Validation of a delete on object of class _User.
Returns a ValidationResult.
     */
    public CliValidationResultDTO _User___validateDelete() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
