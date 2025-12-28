package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Gravidanza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gravidanza___getPageQueryResponse extends GraphQLResult<Map<String, CliGravidanzaPageDTO>> {

    private static final String OPERATION_NAME = "Gravidanza___getPage";

    public Gravidanza___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Gravidanza.
     */
    public CliGravidanzaPageDTO Gravidanza___getPage() {
        Map<String, CliGravidanzaPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
