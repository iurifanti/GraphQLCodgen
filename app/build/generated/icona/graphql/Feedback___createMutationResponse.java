package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create an object of class Feedback.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Feedback___createMutationResponse extends GraphQLResult<Map<String, CliFeedbackDTO>> {

    private static final String OPERATION_NAME = "Feedback___create";

    public Feedback___createMutationResponse() {
    }

    /**
     * Create an object of class Feedback.
Returns the newly created object.
     */
    public CliFeedbackDTO Feedback___create() {
        Map<String, CliFeedbackDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
