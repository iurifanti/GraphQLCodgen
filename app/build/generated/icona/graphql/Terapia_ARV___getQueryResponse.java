package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Terapia_ARV by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Terapia_ARV___getQueryResponse extends GraphQLResult<Map<String, CliTerapia_ARVDTO>> {

    private static final String OPERATION_NAME = "Terapia_ARV___get";

    public Terapia_ARV___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Terapia_ARV by ID.
     */
    public CliTerapia_ARVDTO Terapia_ARV___get() {
        Map<String, CliTerapia_ARVDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
