package icona.graphql;


/**
 * Validation of a create on object of class P_Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___validateCreateQueryResolver {

    /**
     * Validation of a create on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateCreate(@javax.validation.constraints.NotNull CliP_PazienteDraftCreateDTO data) throws Exception;

}
