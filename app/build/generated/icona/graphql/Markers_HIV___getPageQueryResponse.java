package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Markers_HIV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Markers_HIV___getPageQueryResponse extends GraphQLResult<Map<String, CliMarkers_HIVPageDTO>> {

    private static final String OPERATION_NAME = "Markers_HIV___getPage";

    public Markers_HIV___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Markers_HIV.
     */
    public CliMarkers_HIVPageDTO Markers_HIV___getPage() {
        Map<String, CliMarkers_HIVPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
