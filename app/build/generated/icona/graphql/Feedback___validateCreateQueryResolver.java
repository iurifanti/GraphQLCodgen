package icona.graphql;


/**
 * Validation of a create on object of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___validateCreateQueryResolver {

    /**
     * Validation of a create on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateCreate(@javax.validation.constraints.NotNull CliFeedbackDraftCreateDTO data) throws Exception;

}
