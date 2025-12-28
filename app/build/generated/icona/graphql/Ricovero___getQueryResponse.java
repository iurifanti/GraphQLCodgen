package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Ricovero by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Ricovero___getQueryResponse extends GraphQLResult<Map<String, CliRicoveroDTO>> {

    private static final String OPERATION_NAME = "Ricovero___get";

    public Ricovero___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Ricovero by ID.
     */
    public CliRicoveroDTO Ricovero___get() {
        Map<String, CliRicoveroDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
