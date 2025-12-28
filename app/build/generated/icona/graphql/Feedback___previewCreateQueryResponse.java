package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___previewCreateQueryResponse extends GraphQLResult<Map<String, CliFeedbackDTO>> {

    private static final String OPERATION_NAME = "Feedback___previewCreate";

    public Feedback___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
     */
    public CliFeedbackDTO Feedback___previewCreate() {
        Map<String, CliFeedbackDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
