package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class P_Paziente___getPageQueryResponse extends GraphQLResult<Map<String, CliP_PazientePageDTO>> {

    private static final String OPERATION_NAME = "P_Paziente___getPage";

    public P_Paziente___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class P_Paziente.
     */
    public CliP_PazientePageDTO P_Paziente___getPage() {
        Map<String, CliP_PazientePageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
