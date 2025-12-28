package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a bulk update on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___validateUpdateBulkQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___validateUpdateBulk";

    public Sequenza_genomica___validateUpdateBulkQueryResponse() {
    }

    /**
     * Validation of a bulk update on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Sequenza_genomica___validateUpdateBulk() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
