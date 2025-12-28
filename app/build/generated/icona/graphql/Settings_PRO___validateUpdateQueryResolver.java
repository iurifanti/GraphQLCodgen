package icona.graphql;


/**
 * Validation of an update on object of singleton class Settings_PRO.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Settings_PRO___validateUpdateQueryResolver {

    /**
     * Validation of an update on object of singleton class Settings_PRO.
Returns a ValidationResult.
     */
    CliValidationResultDTO Settings_PRO___validateUpdate(@javax.validation.constraints.NotNull CliSettings_PRODraftUpdateDTO data) throws Exception;

}
