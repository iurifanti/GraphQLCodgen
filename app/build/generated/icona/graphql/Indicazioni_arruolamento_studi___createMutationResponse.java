package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create an object of class Indicazioni_arruolamento_studi.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___createMutationResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___create";

    public Indicazioni_arruolamento_studi___createMutationResponse() {
    }

    /**
     * Create an object of class Indicazioni_arruolamento_studi.
Returns the newly created object.
     */
    public CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___create() {
        Map<String, CliIndicazioni_arruolamento_studiDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
