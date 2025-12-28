package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a create on object of class Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___validateCreateQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Paziente___validateCreate";

    public Paziente___validateCreateQueryResponse() {
    }

    /**
     * Validation of a create on object of class Paziente.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Paziente___validateCreate() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
