package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Genera_codice_interno___previewCreateQueryResponse extends GraphQLResult<Map<String, CliGenera_codice_internoDTO>> {

    private static final String OPERATION_NAME = "Genera_codice_interno___previewCreate";

    public Genera_codice_interno___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
     */
    public CliGenera_codice_internoDTO Genera_codice_interno___previewCreate() {
        Map<String, CliGenera_codice_internoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
