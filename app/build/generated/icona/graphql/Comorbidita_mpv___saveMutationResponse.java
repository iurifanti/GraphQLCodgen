package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Comorbidita_mpv.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Comorbidita_mpv___saveMutationResponse extends GraphQLResult<Map<String, CliComorbidita_mpvDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___save";

    public Comorbidita_mpv___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Comorbidita_mpv.
Returns the newly created/updated object.
     */
    public CliComorbidita_mpvDTO Comorbidita_mpv___save() {
        Map<String, CliComorbidita_mpvDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
