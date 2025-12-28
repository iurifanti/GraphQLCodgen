package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Anamnesi by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Anamnesi___getQueryResponse extends GraphQLResult<Map<String, CliAnamnesiDTO>> {

    private static final String OPERATION_NAME = "Anamnesi___get";

    public Anamnesi___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Anamnesi by ID.
     */
    public CliAnamnesiDTO Anamnesi___get() {
        Map<String, CliAnamnesiDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
