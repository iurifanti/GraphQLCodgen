package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Gruppo by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gruppo___getQueryResponse extends GraphQLResult<Map<String, CliGruppoDTO>> {

    private static final String OPERATION_NAME = "Gruppo___get";

    public Gruppo___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Gruppo by ID.
     */
    public CliGruppoDTO Gruppo___get() {
        Map<String, CliGruppoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
