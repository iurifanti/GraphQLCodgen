package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Sequenza_genomica.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Sequenza_genomica___getPageQueryResponse extends GraphQLResult<Map<String, CliSequenza_genomicaPageDTO>> {

    private static final String OPERATION_NAME = "Sequenza_genomica___getPage";

    public Sequenza_genomica___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Sequenza_genomica.
     */
    public CliSequenza_genomicaPageDTO Sequenza_genomica___getPage() {
        Map<String, CliSequenza_genomicaPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
