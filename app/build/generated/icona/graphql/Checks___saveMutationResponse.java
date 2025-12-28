package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Checks.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Checks___saveMutationResponse extends GraphQLResult<Map<String, CliChecksDTO>> {

    private static final String OPERATION_NAME = "Checks___save";

    public Checks___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Checks.
Returns the newly created/updated object.
     */
    public CliChecksDTO Checks___save() {
        Map<String, CliChecksDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
