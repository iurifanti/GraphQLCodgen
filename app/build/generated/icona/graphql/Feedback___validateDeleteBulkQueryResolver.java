package icona.graphql;


/**
 * Validation of a bulk delete on a set of objects of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___validateDeleteBulkQueryResolver {

    /**
     * Validation of a bulk delete on a set of objects of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateDeleteBulk(@javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options) throws Exception;

}
