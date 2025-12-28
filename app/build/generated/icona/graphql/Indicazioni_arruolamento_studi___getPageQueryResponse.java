package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Indicazioni_arruolamento_studi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Indicazioni_arruolamento_studi___getPageQueryResponse extends GraphQLResult<Map<String, CliIndicazioni_arruolamento_studiPageDTO>> {

    private static final String OPERATION_NAME = "Indicazioni_arruolamento_studi___getPage";

    public Indicazioni_arruolamento_studi___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Indicazioni_arruolamento_studi.
     */
    public CliIndicazioni_arruolamento_studiPageDTO Indicazioni_arruolamento_studi___getPage() {
        Map<String, CliIndicazioni_arruolamento_studiPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
