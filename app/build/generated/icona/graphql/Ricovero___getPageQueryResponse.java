package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Ricovero.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Ricovero___getPageQueryResponse extends GraphQLResult<Map<String, CliRicoveroPageDTO>> {

    private static final String OPERATION_NAME = "Ricovero___getPage";

    public Ricovero___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Ricovero.
     */
    public CliRicoveroPageDTO Ricovero___getPage() {
        Map<String, CliRicoveroPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
