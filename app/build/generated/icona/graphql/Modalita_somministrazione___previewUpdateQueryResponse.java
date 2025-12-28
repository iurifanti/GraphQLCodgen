package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Modalita_somministrazione for an updated instance of Modalita_somministrazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliModalita_somministrazioneDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___previewUpdate";

    public Modalita_somministrazione___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Modalita_somministrazione for an updated instance of Modalita_somministrazione.
     */
    public CliModalita_somministrazioneDTO Modalita_somministrazione___previewUpdate() {
        Map<String, CliModalita_somministrazioneDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
