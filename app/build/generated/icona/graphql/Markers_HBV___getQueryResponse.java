package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Markers_HBV by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HBV___getQueryResponse extends GraphQLResult<Map<String, CliMarkers_HBVDTO>> {

    private static final String OPERATION_NAME = "Markers_HBV___get";

    public Markers_HBV___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Markers_HBV by ID.
     */
    public CliMarkers_HBVDTO Markers_HBV___get() {
        Map<String, CliMarkers_HBVDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
