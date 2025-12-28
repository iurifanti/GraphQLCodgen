package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Sequenza_genomica.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___updateBulkMutationResponse extends GraphQLResult<Map<String, CliSequenza_genomicaBulkResultDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___updateBulk";

    public Sequenza_genomica___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Sequenza_genomica.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliSequenza_genomicaBulkResultDTO Sequenza_genomica___updateBulk() {
        Map<String, CliSequenza_genomicaBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
