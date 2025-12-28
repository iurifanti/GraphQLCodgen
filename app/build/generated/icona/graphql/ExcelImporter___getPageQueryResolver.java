package icona.graphql;


/**
 * Retrieve a collection of object of class ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface ExcelImporter___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class ExcelImporter.
     */
    CliExcelImporterPageDTO ExcelImporter___getPage(CliExcelImporterPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
