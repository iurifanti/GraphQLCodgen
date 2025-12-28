package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class Centro_provenienza.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Centro_provenienza___updateMutationResponse extends GraphQLResult<Map<String, CliCentro_provenienzaDTO>> {

    private static final String OPERATION_NAME = "Centro_provenienza___update";

    public Centro_provenienza___updateMutationResponse() {
    }

    /**
     * Update an object of class Centro_provenienza.
Returns the newly created object.
     */
    public CliCentro_provenienzaDTO Centro_provenienza___update() {
        Map<String, CliCentro_provenienzaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
