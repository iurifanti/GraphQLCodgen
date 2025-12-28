package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a preview object of class ExcelImporter for an object of ExcelImporter not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class ExcelImporter___previewCreateQueryResponse extends GraphQLResult<Map<String, CliExcelImporterDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___previewCreate";

    public ExcelImporter___previewCreateQueryResponse() {
    }

    /**
     * Retrieve a preview object of class ExcelImporter for an object of ExcelImporter not yet instanced.
     */
    public CliExcelImporterDTO ExcelImporter___previewCreate() {
        Map<String, CliExcelImporterDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
