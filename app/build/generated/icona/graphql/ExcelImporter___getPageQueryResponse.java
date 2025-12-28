package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;
import java.util.Map;

/**
 * Retrieve a collection of object of class ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class ExcelImporter___getPageQueryResponse extends GraphQLResult<Map<String, CliExcelImporterPageDTO>> {

    private static final String OPERATION_NAME = "ExcelImporter___getPage";

    public ExcelImporter___getPageQueryResponse() {
    }

    /**
     * Retrieve a collection of object of class ExcelImporter.
     */
    public CliExcelImporterPageDTO ExcelImporter___getPage() {
        Map<String, CliExcelImporterPageDTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
