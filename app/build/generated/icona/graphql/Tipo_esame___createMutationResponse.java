package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create an object of class Tipo_esame.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Tipo_esame___createMutationResponse extends GraphQLResult<Map<String, CliTipo_esameDTO>> {

    private static final String OPERATION_NAME = "Tipo_esame___create";

    public Tipo_esame___createMutationResponse() {
    }

    /**
     * Create an object of class Tipo_esame.
Returns the newly created object.
     */
    public CliTipo_esameDTO Tipo_esame___create() {
        Map<String, CliTipo_esameDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
