package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Bulk update a set of objects of class ExcelImporter.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class ExcelImporter___updateBulkMutationResponse extends GraphQLResult<Map<String, CliExcelImporterBulkResultDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___updateBulk";

    public ExcelImporter___updateBulkMutationResponse() {
    }

    /**
     * Bulk update a set of objects of class ExcelImporter.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    public CliExcelImporterBulkResultDTO ExcelImporter___updateBulk() {
        Map<String, CliExcelImporterBulkResultDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
