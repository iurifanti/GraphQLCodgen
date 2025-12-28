package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Feedback.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateUpdateBulk(@javax.validation.constraints.NotNull CliFeedbackDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options) throws Exception;

}
