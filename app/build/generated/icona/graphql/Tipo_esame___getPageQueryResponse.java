package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class Tipo_esame.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_esame___getPageQueryResponse extends GraphQLResult<Map<String, CliTipo_esamePageDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___getPage";

    public Tipo_esame___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class Tipo_esame.
     */
    public CliTipo_esamePageDTO Tipo_esame___getPage() {
        Map<String, CliTipo_esamePageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
