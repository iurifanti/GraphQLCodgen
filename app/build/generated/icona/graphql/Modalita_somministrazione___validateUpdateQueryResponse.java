package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of an update on object of class Modalita_somministrazione.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___validateUpdateQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___validateUpdate";

    public Modalita_somministrazione___validateUpdateQueryResponse() {
    }

    /**
     * Validation of an update on object of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Modalita_somministrazione___validateUpdate() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
