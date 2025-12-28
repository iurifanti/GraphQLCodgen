package icona.graphql;


/**
 * Validation of an update on object of singleton class User_message.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface User_message___validateUpdateQueryResolver {

    /**
     * Validation of an update on object of singleton class User_message.
Returns a ValidationResult.
     */
    CliValidationResultDTO User_message___validateUpdate(@javax.validation.constraints.NotNull CliUser_messageDraftUpdateDTO data) throws Exception;

}
