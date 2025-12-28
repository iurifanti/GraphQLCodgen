package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Comorbidita_mpv for an updated instance of Comorbidita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliComorbidita_mpvDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___previewUpdate";

    public Comorbidita_mpv___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Comorbidita_mpv for an updated instance of Comorbidita_mpv.
     */
    public CliComorbidita_mpvDTO Comorbidita_mpv___previewUpdate() {
        Map<String, CliComorbidita_mpvDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
