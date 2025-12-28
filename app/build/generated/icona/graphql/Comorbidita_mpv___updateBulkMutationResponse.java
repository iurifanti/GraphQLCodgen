package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class Comorbidita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___updateBulkMutationResponse extends GraphQLResult<Map<String, CliComorbidita_mpvBulkResultDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___updateBulk";

    public Comorbidita_mpv___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class Comorbidita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliComorbidita_mpvBulkResultDTO Comorbidita_mpv___updateBulk() {
        Map<String, CliComorbidita_mpvBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
