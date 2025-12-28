package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Checks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Checks___getPageQueryResponse extends GraphQLResult<Map<String, CliChecksPageDTO>> {

    private static final String OPERATION_NAME = "Checks___getPage";

    public Checks___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Checks.
     */
    public CliChecksPageDTO Checks___getPage() {
        Map<String, CliChecksPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
