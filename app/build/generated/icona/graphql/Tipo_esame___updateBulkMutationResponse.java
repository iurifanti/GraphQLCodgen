package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Tipo_esame.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_esame___updateBulkMutationResponse extends GraphQLResult<Map<String, CliTipo_esameBulkResultDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___updateBulk";

    public Tipo_esame___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Tipo_esame.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliTipo_esameBulkResultDTO Tipo_esame___updateBulk() {
        Map<String, CliTipo_esameBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
