package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of an update on object of class P_Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class P_Paziente___validateUpdateQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___validateUpdate";

    public P_Paziente___validateUpdateQueryResponse() {
    }

    /**
     * Validation of an update on object of class P_Paziente.
Returns a ValidationResult.
     */
    public CliValidationResultDTO P_Paziente___validateUpdate() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
