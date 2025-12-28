package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___getPageQueryResponse extends GraphQLResult<Map<String, CliFeedbackPageDTO>> {

    private static final String OPERATION_NAME = "Feedback___getPage";

    public Feedback___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Feedback.
     */
    public CliFeedbackPageDTO Feedback___getPage() {
        Map<String, CliFeedbackPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
