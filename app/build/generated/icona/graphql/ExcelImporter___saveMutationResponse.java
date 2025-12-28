package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Create or update an object of class ExcelImporter.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class ExcelImporter___saveMutationResponse extends GraphQLResult<Map<String, CliExcelImporterDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___save";

    public ExcelImporter___saveMutationResponse() {
    }

    /**
     * Create or update an object of class ExcelImporter.
Returns the newly created/updated object.
     */
    public CliExcelImporterDTO ExcelImporter___save() {
        Map<String, CliExcelImporterDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
