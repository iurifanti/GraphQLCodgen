package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___getPageQueryResponse extends GraphQLResult<Map<String, CliPazientePageDTO>> {

    private static final String OPERATION_NAME = "Paziente___getPage";

    public Paziente___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Paziente.
     */
    public CliPazientePageDTO Paziente___getPage() {
        Map<String, CliPazientePageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
