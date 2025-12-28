package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Gruppo for an object of Gruppo not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Gruppo___previewCreateQueryResponse extends GraphQLResult<Map<String, CliGruppoDTO>> {

    private static final String OPERATION_NAME = "Gruppo___previewCreate";

    public Gruppo___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Gruppo for an object of Gruppo not yet instanced.
     */
    public CliGruppoDTO Gruppo___previewCreate() {
        Map<String, CliGruppoDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
