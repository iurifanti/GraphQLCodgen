package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a create on object of class Tipo_esame.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_esame___validateCreateQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___validateCreate";

    public Tipo_esame___validateCreateQueryResponse() {
    }

    /**
     * Validation of a create on object of class Tipo_esame.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Tipo_esame___validateCreate() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
