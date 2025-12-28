package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Markers_HIV by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HIV___getQueryResponse extends GraphQLResult<Map<String, CliMarkers_HIVDTO>> {

    private static final String OPERATION_NAME = "Markers_HIV___get";

    public Markers_HIV___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Markers_HIV by ID.
     */
    public CliMarkers_HIVDTO Markers_HIV___get() {
        Map<String, CliMarkers_HIVDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
