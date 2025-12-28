package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class _User.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateUpdateBulk(@javax.validation.constraints.NotNull Cli_UserDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options) throws Exception;

}
