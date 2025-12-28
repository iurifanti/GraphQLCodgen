package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Modalita_somministrazione for an object of Modalita_somministrazione not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___previewCreateQueryResponse extends GraphQLResult<Map<String, CliModalita_somministrazioneDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___previewCreate";

    public Modalita_somministrazione___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Modalita_somministrazione for an object of Modalita_somministrazione not yet instanced.
     */
    public CliModalita_somministrazioneDTO Modalita_somministrazione___previewCreate() {
        Map<String, CliModalita_somministrazioneDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
