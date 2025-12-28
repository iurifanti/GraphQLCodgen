package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Comorbidita_mpv for an object of Comorbidita_mpv not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___previewCreateQueryResponse extends GraphQLResult<Map<String, CliComorbidita_mpvDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___previewCreate";

    public Comorbidita_mpv___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Comorbidita_mpv for an object of Comorbidita_mpv not yet instanced.
     */
    public CliComorbidita_mpvDTO Comorbidita_mpv___previewCreate() {
        Map<String, CliComorbidita_mpvDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
