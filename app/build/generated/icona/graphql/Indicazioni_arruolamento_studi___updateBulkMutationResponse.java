package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___updateBulkMutationResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiBulkResultDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___updateBulk";

    public Indicazioni_arruolamento_studi___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliIndicazioni_arruolamento_studiBulkResultDTO Indicazioni_arruolamento_studi___updateBulk() {
        Map<String, CliIndicazioni_arruolamento_studiBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
