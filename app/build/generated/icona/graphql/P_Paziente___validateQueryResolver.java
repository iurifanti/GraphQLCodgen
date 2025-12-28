package icona.graphql;


/**
 * Validation of a save on object of class P_Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___validateQueryResolver {

    /**
     * Validation of a save on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validate(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data) throws Exception;

}
