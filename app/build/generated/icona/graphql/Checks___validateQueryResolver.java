package icona.graphql;


/**
 * Validation of a save on object of class Checks.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Checks___validateQueryResolver {

    /**
     * Validation of a save on object of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validate(@javax.validation.constraints.NotNull CliChecksDraftDTO data) throws Exception;

}
