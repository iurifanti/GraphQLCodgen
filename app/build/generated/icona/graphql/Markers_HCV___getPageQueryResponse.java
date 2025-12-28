package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Markers_HCV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HCV___getPageQueryResponse extends GraphQLResult<Map<String, CliMarkers_HCVPageDTO>> {

    private static final String OPERATION_NAME = "Markers_HCV___getPage";

    public Markers_HCV___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Markers_HCV.
     */
    public CliMarkers_HCVPageDTO Markers_HCV___getPage() {
        Map<String, CliMarkers_HCVPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
