package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of singleton class Settings_PRO.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Settings_PRO___updateMutationResponse extends GraphQLResult<Map<String, CliSettings_PRODTO>> {

    private static final String OPERATION_NAME = "Settings_PRO___update";

    public Settings_PRO___updateMutationResponse() {
    }

    /**
     * Update an object of singleton class Settings_PRO.
Returns the newly created object.
     */
    public CliSettings_PRODTO Settings_PRO___update() {
        Map<String, CliSettings_PRODTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
