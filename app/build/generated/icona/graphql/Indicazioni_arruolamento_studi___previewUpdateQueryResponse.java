package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Indicazioni_arruolamento_studi for an updated instance of Indicazioni_arruolamento_studi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___previewUpdate";

    public Indicazioni_arruolamento_studi___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Indicazioni_arruolamento_studi for an updated instance of Indicazioni_arruolamento_studi.
     */
    public CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___previewUpdate() {
        Map<String, CliIndicazioni_arruolamento_studiDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
