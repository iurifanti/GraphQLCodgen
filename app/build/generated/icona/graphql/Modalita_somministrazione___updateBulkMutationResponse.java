package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Modalita_somministrazione.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___updateBulkMutationResponse extends GraphQLResult<Map<String, CliModalita_somministrazioneBulkResultDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___updateBulk";

    public Modalita_somministrazione___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Modalita_somministrazione.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliModalita_somministrazioneBulkResultDTO Modalita_somministrazione___updateBulk() {
        Map<String, CliModalita_somministrazioneBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
