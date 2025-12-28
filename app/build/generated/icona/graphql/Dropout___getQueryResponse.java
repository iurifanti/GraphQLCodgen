package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Dropout by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Dropout___getQueryResponse extends GraphQLResult<Map<String, CliDropoutDTO>> {

    private static final String OPERATION_NAME = "Dropout___get";

    public Dropout___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Dropout by ID.
     */
    public CliDropoutDTO Dropout___get() {
        Map<String, CliDropoutDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
