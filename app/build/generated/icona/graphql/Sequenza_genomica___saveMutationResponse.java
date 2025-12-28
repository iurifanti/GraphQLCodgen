package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Sequenza_genomica.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Sequenza_genomica___saveMutationResponse extends GraphQLResult<Map<String, CliSequenza_genomicaDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___save";

    public Sequenza_genomica___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Sequenza_genomica.
Returns the newly created/updated object.
     */
    public CliSequenza_genomicaDTO Sequenza_genomica___save() {
        Map<String, CliSequenza_genomicaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
