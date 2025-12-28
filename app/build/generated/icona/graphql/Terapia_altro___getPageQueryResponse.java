package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Terapia_altro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Terapia_altro___getPageQueryResponse extends GraphQLResult<Map<String, CliTerapia_altroPageDTO>> {

    private static final String OPERATION_NAME = "Terapia_altro___getPage";

    public Terapia_altro___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Terapia_altro.
     */
    public CliTerapia_altroPageDTO Terapia_altro___getPage() {
        Map<String, CliTerapia_altroPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
