package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Indicazioni_arruolamento_studi for an object of Indicazioni_arruolamento_studi not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___previewQueryResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___preview";

    public Indicazioni_arruolamento_studi___previewQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Indicazioni_arruolamento_studi for an object of Indicazioni_arruolamento_studi not yet instanced.
     */
    public CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___preview() {
        Map<String, CliIndicazioni_arruolamento_studiDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
