package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_visita_mpv___validateUpdateBulkQueryResponse extends GraphQLResult<Map<String, CliValidationResultDTO>> {

    private static final String OPERATION_NAME = "Tipo_visita_mpv___validateUpdateBulk";

    public Tipo_visita_mpv___validateUpdateBulkQueryResponse() {
    }

    /**
     * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    public CliValidationResultDTO Tipo_visita_mpv___validateUpdateBulk() {
        Map<String, CliValidationResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
