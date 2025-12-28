package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateUpdateBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options) throws Exception;

}
