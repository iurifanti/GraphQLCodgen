package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Modalita_somministrazione.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Modalita_somministrazione___saveMutationResponse extends GraphQLResult<Map<String, CliModalita_somministrazioneDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___save";

    public Modalita_somministrazione___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Modalita_somministrazione.
Returns the newly created/updated object.
     */
    public CliModalita_somministrazioneDTO Modalita_somministrazione___save() {
        Map<String, CliModalita_somministrazioneDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
