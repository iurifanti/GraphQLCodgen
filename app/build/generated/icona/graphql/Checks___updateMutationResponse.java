package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class Checks.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___updateMutationResponse extends GraphQLResult<Map<String, CliChecksDTO>> {

    private static final String OPERATION_NAME = "Checks___update";

    public Checks___updateMutationResponse() {
    }

    /**
     * Update an object of class Checks.
Returns the newly created object.
     */
    public CliChecksDTO Checks___update() {
        Map<String, CliChecksDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
