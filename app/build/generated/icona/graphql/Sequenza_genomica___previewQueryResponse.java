package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Sequenza_genomica for an object of Sequenza_genomica not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___previewQueryResponse extends GraphQLResult<Map<String, CliSequenza_genomicaDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___preview";

    public Sequenza_genomica___previewQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Sequenza_genomica for an object of Sequenza_genomica not yet instanced.
     */
    public CliSequenza_genomicaDTO Sequenza_genomica___preview() {
        Map<String, CliSequenza_genomicaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
