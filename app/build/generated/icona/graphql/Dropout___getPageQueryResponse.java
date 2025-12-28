package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Dropout.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Dropout___getPageQueryResponse extends GraphQLResult<Map<String, CliDropoutPageDTO>> {

    private static final String OPERATION_NAME = "Dropout___getPage";

    public Dropout___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Dropout.
     */
    public CliDropoutPageDTO Dropout___getPage() {
        Map<String, CliDropoutPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
