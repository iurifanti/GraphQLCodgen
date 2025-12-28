package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Anamnesi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Anamnesi___getPageQueryResponse extends GraphQLResult<Map<String, CliAnamnesiPageDTO>> {

    private static final String OPERATION_NAME = "Anamnesi___getPage";

    public Anamnesi___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Anamnesi.
     */
    public CliAnamnesiPageDTO Anamnesi___getPage() {
        Map<String, CliAnamnesiPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
