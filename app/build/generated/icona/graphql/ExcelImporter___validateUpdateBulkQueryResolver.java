package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class ExcelImporter.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface ExcelImporter___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateUpdateBulk(@javax.validation.constraints.NotNull CliExcelImporterDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options) throws Exception;

}
