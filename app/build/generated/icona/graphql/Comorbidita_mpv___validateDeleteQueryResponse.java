package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a delete on object of class Comorbidita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___validateDeleteQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___validateDelete";

    public Comorbidita_mpv___validateDeleteQueryResponse() {
    }

    /**
     * Validation of a delete on object of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Comorbidita_mpv___validateDelete() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
