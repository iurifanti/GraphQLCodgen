package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Centro_provenienza___getPageQueryResponse extends GraphQLResult<Map<String, CliCentro_provenienzaPageDTO>> {

    private static final String OPERATION_NAME = "Centro_provenienza___getPage";

    public Centro_provenienza___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Centro_provenienza.
     */
    public CliCentro_provenienzaPageDTO Centro_provenienza___getPage() {
        Map<String, CliCentro_provenienzaPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
