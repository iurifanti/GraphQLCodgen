package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve the object of singleton class Settings_PRO
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Settings_PRO___getQueryResponse extends GraphQLResult<Map<String, CliSettings_PRODTO>> {

    private static final String OPERATION_NAME = "Settings_PRO___get";

    public Settings_PRO___getQueryResponse() {
    }

    /**
     * Retrieve the object of singleton class Settings_PRO
     */
    public CliSettings_PRODTO Settings_PRO___get() {
        Map<String, CliSettings_PRODTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
