package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a single object of class Terapia_altro by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Terapia_altro___getQueryResponse extends GraphQLResult<Map<String, CliTerapia_altroDTO>> {

    private static final String OPERATION_NAME = "Terapia_altro___get";

    public Terapia_altro___getQueryResponse() {
    }

    /**
     * Retrieve a single object of class Terapia_altro by ID.
     */
    public CliTerapia_altroDTO Terapia_altro___get() {
        Map<String, CliTerapia_altroDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
