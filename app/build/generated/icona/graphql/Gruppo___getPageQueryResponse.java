package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Gruppo.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gruppo___getPageQueryResponse extends GraphQLResult<Map<String, CliGruppoPageDTO>> {

    private static final String OPERATION_NAME = "Gruppo___getPage";

    public Gruppo___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Gruppo.
     */
    public CliGruppoPageDTO Gruppo___getPage() {
        Map<String, CliGruppoPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
