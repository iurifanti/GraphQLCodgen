package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Controllo_clinico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Controllo_clinico___getPageQueryResponse extends GraphQLResult<Map<String, CliControllo_clinicoPageDTO>> {

    private static final String OPERATION_NAME = "Controllo_clinico___getPage";

    public Controllo_clinico___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Controllo_clinico.
     */
    public CliControllo_clinicoPageDTO Controllo_clinico___getPage() {
        Map<String, CliControllo_clinicoPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
