package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Update an object of class ExcelImporter.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class ExcelImporter___updateMutationResponse extends GraphQLResult<Map<String, CliExcelImporterDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___update";

    public ExcelImporter___updateMutationResponse() {
    }

    /**
     * Update an object of class ExcelImporter.
Returns the newly created object.
     */
    public CliExcelImporterDTO ExcelImporter___update() {
        Map<String, CliExcelImporterDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
