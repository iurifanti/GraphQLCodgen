package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Esame_strumentale by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Esame_strumentale___getQueryResponse extends GraphQLResult<Map<String, CliEsame_strumentaleDTO>> {

    private static final String OPERATION_NAME = "Esame_strumentale___get";

    public Esame_strumentale___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Esame_strumentale by ID.
     */
    public CliEsame_strumentaleDTO Esame_strumentale___get() {
        Map<String, CliEsame_strumentaleDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
