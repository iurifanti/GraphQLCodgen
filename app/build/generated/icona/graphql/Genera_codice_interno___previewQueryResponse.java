package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Genera_codice_interno___previewQueryResponse extends GraphQLResult<Map<String, CliGenera_codice_internoDTO>> {

    private static final String OPERATION_NAME = "Genera_codice_interno___preview";

    public Genera_codice_interno___previewQueryResponse() {
    }

    /**
     * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
     */
    public CliGenera_codice_internoDTO Genera_codice_interno___preview() {
        Map<String, CliGenera_codice_internoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
