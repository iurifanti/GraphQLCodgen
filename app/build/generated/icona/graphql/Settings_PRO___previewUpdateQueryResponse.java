package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of singleton class Settings_PRO for an updated instance of Settings_PRO.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Settings_PRO___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliSettings_PRODTO>> {

    private static final String OPERATION_NAME = "Settings_PRO___previewUpdate";

    public Settings_PRO___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of singleton class Settings_PRO for an updated instance of Settings_PRO.
     */
    public CliSettings_PRODTO Settings_PRO___previewUpdate() {
        Map<String, CliSettings_PRODTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
