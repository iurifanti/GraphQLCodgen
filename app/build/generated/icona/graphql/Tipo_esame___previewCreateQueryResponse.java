package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_esame___previewCreateQueryResponse extends GraphQLResult<Map<String, CliTipo_esameDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___previewCreate";

    public Tipo_esame___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
     */
    public CliTipo_esameDTO Tipo_esame___previewCreate() {
        Map<String, CliTipo_esameDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
