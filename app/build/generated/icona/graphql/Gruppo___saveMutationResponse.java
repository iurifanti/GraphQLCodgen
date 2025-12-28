package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Gruppo.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Gruppo___saveMutationResponse extends GraphQLResult<Map<String, CliGruppoDTO>> {

    private static final String OPERATION_NAME = "Gruppo___save";

    public Gruppo___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Gruppo.
Returns the newly created/updated object.
     */
    public CliGruppoDTO Gruppo___save() {
        Map<String, CliGruppoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
