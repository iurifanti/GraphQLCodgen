package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Markers_HBV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HBV___getPageQueryResponse extends GraphQLResult<Map<String, CliMarkers_HBVPageDTO>> {

    private static final String OPERATION_NAME = "Markers_HBV___getPage";

    public Markers_HBV___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Markers_HBV.
     */
    public CliMarkers_HBVPageDTO Markers_HBV___getPage() {
        Map<String, CliMarkers_HBVPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
