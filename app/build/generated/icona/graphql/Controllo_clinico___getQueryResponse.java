package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Controllo_clinico by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Controllo_clinico___getQueryResponse extends GraphQLResult<Map<String, CliControllo_clinicoDTO>> {

    private static final String OPERATION_NAME = "Controllo_clinico___get";

    public Controllo_clinico___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Controllo_clinico by ID.
     */
    public CliControllo_clinicoDTO Controllo_clinico___get() {
        Map<String, CliControllo_clinicoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
