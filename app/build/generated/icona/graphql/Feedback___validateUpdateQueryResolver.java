package icona.graphql;


/**
 * Validation of an update on object of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___validateUpdateQueryResolver {

    /**
     * Validation of an update on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateUpdate(@javax.validation.constraints.NotNull CliFeedbackDraftUpdateDTO data) throws Exception;

}
