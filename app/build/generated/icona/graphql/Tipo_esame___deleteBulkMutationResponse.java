package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk delete a set of objects of class Tipo_esame.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Tipo_esame___deleteBulkMutationResponse extends GraphQLResult<Map<String, CliDeleteBulkResultDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___deleteBulk";

    public Tipo_esame___deleteBulkMutationResponse() {
    }

    /**
     * Bulk delete a set of objects of class Tipo_esame.
Returns the number of object successfully deleted.
     */
    public CliDeleteBulkResultDTO Tipo_esame___deleteBulk() {
        Map<String, CliDeleteBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
