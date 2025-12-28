package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Terapia_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Terapia_ARV___getPageQueryResponse extends GraphQLResult<Map<String, CliTerapia_ARVPageDTO>> {

    private static final String OPERATION_NAME = "Terapia_ARV___getPage";

    public Terapia_ARV___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Terapia_ARV.
     */
    public CliTerapia_ARVPageDTO Terapia_ARV___getPage() {
        Map<String, CliTerapia_ARVPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
