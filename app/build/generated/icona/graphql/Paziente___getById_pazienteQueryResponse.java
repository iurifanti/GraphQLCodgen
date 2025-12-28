package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Paziente by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___getById_pazienteQueryResponse extends GraphQLResult<Map<String, CliPazienteDTO>> {

    private static final String OPERATION_NAME = "Paziente___getById_paziente";

    public Paziente___getById_pazienteQueryResponse() {
    }

    /**
     * Retrieve a single object of class Paziente by uniques.
     */
    public CliPazienteDTO Paziente___getById_paziente() {
        Map<String, CliPazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
