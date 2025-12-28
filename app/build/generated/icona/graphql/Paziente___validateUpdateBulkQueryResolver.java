package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateUpdateBulk(@javax.validation.constraints.NotNull CliPazienteDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliPazientePageOptionsDTO options) throws Exception;

}
