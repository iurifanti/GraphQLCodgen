package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Paziente___previewQueryResponse extends GraphQLResult<Map<String, CliPazienteDTO>> {

    private static final String OPERATION_NAME = "Paziente___preview";

    public Paziente___previewQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
     */
    public CliPazienteDTO Paziente___preview() {
        Map<String, CliPazienteDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
