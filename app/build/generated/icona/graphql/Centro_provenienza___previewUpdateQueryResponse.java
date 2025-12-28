package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Centro_provenienza for an updated instance of Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Centro_provenienza___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliCentro_provenienzaDTO>> {

    private static final String OPERATION_NAME = "Centro_provenienza___previewUpdate";

    public Centro_provenienza___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Centro_provenienza for an updated instance of Centro_provenienza.
     */
    public CliCentro_provenienzaDTO Centro_provenienza___previewUpdate() {
        Map<String, CliCentro_provenienzaDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
