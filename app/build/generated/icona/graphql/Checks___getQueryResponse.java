package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Checks by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___getQueryResponse extends GraphQLResult<Map<String, CliChecksDTO>> {

    private static final String OPERATION_NAME = "Checks___get";

    public Checks___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Checks by ID.
     */
    public CliChecksDTO Checks___get() {
        Map<String, CliChecksDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
