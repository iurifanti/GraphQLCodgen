package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a bulk update on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___validateUpdateBulkQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___validateUpdateBulk";

    public Indicazioni_arruolamento_studi___validateUpdateBulkQueryResponse() {
    }

    /**
     * Validation of a bulk update on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Indicazioni_arruolamento_studi___validateUpdateBulk() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
