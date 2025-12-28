package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create an object of class Sequenza_genomica.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___createMutationResponse extends GraphQLResult<Map<String, CliSequenza_genomicaDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___create";

    public Sequenza_genomica___createMutationResponse() {
    }

    /**
     * Create an object of class Sequenza_genomica.
Returns the newly created object.
     */
    public CliSequenza_genomicaDTO Sequenza_genomica___create() {
        Map<String, CliSequenza_genomicaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
