package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Modalita_somministrazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Modalita_somministrazione___getPageQueryResponse extends GraphQLResult<Map<String, CliModalita_somministrazionePageDTO>> {

    private static final String OPERATION_NAME = "Modalita_somministrazione___getPage";

    public Modalita_somministrazione___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Modalita_somministrazione.
     */
    public CliModalita_somministrazionePageDTO Modalita_somministrazione___getPage() {
        Map<String, CliModalita_somministrazionePageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
