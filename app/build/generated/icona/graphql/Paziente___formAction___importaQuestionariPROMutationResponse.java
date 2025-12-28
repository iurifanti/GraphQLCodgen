package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on an object of class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Paziente___formAction___importaQuestionariPROMutationResponse extends GraphQLResult<Map<String, CliPazienteFormActionHandlerResultDTO>> {

    private static final String OPERATION_NAME = "Paziente___formAction___importaQuestionariPRO";

    public Paziente___formAction___importaQuestionariPROMutationResponse() {
    }

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on an object of class Paziente.
     */
    public CliPazienteFormActionHandlerResultDTO Paziente___formAction___importaQuestionariPRO() {
        Map<String, CliPazienteFormActionHandlerResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
