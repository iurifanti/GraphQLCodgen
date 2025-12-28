package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Feedback for an updated instance of Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliFeedbackDTO>> {

    private static final String OPERATION_NAME = "Feedback___previewUpdate";

    public Feedback___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Feedback for an updated instance of Feedback.
     */
    public CliFeedbackDTO Feedback___previewUpdate() {
        Map<String, CliFeedbackDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
