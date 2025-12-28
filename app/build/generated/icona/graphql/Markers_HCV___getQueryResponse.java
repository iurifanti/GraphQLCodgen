package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Markers_HCV by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HCV___getQueryResponse extends GraphQLResult<Map<String, CliMarkers_HCVDTO>> {

    private static final String OPERATION_NAME = "Markers_HCV___get";

    public Markers_HCV___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Markers_HCV by ID.
     */
    public CliMarkers_HCVDTO Markers_HCV___get() {
        Map<String, CliMarkers_HCVDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
