package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class Indicazioni_arruolamento_studi.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class Indicazioni_arruolamento_studi___saveMutationResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___save";

    public Indicazioni_arruolamento_studi___saveMutationResponse() {
    }

    /**
     * Create or update an object of class Indicazioni_arruolamento_studi.
Returns the newly created/updated object.
     */
    public CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___save() {
        Map<String, CliIndicazioni_arruolamento_studiDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
