package icona.graphql;


/**
 * Bulk update a set of objects of class ExcelImporter.
Returns an array of updated objects and a number representing the total count of items affected.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface ExcelImporter___updateBulkMutationResolver {

    /**
     * Bulk update a set of objects of class ExcelImporter.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliExcelImporterBulkResultDTO ExcelImporter___updateBulk(@javax.validation.constraints.NotNull CliExcelImporterUpdateBulkDTO data, @javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
