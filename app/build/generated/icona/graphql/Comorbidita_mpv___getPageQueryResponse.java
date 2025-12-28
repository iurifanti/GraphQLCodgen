package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Comorbidita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Comorbidita_mpv___getPageQueryResponse extends GraphQLResult<Map<String, CliComorbidita_mpvPageDTO>> {

    private static final String OPERATION_NAME = "Comorbidita_mpv___getPage";

    public Comorbidita_mpv___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Comorbidita_mpv.
     */
    public CliComorbidita_mpvPageDTO Comorbidita_mpv___getPage() {
        Map<String, CliComorbidita_mpvPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
