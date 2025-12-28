package icona.graphql;


/**
 * Validation of an update on object of class _User.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___validateUpdateQueryResolver {

    /**
     * Validation of an update on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateUpdate(@javax.validation.constraints.NotNull Cli_UserDraftUpdateDTO data) throws Exception;

}
