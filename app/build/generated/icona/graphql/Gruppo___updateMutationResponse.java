package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class Gruppo.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gruppo___updateMutationResponse extends GraphQLResult<Map<String, CliGruppoDTO>> {

    private static final String OPERATION_NAME = "Gruppo___update";

    public Gruppo___updateMutationResponse() {
    }

    /**
     * Update an object of class Gruppo.
Returns the newly created object.
     */
    public CliGruppoDTO Gruppo___update() {
        Map<String, CliGruppoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
