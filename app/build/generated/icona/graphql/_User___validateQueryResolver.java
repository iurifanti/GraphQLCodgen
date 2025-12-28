package icona.graphql;


/**
 * Validation of a save on object of class _User.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___validateQueryResolver {

    /**
     * Validation of a save on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validate(@javax.validation.constraints.NotNull Cli_UserDraftDTO data) throws Exception;

}
