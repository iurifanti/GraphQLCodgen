package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class ExcelImporter for an updated instance of ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class ExcelImporter___previewUpdateQueryResponse extends GraphQLResult<Map<String, CliExcelImporterDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___previewUpdate";

    public ExcelImporter___previewUpdateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class ExcelImporter for an updated instance of ExcelImporter.
     */
    public CliExcelImporterDTO ExcelImporter___previewUpdate() {
        Map<String, CliExcelImporterDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
