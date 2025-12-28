package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Checks for an updated instance of Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliChecksDTO>> {

    private static final String OPERATION_NAME = "Checks___previewUpdate";

    public Checks___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Checks for an updated instance of Checks.
     */
    public CliChecksDTO Checks___previewUpdate() {
        Map<String, CliChecksDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
