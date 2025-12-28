package icona.graphql;


/**
 * Validation of a bulk delete on a set of objects of class P_Paziente.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___validateDeleteBulkQueryResolver {

    /**
     * Validation of a bulk delete on a set of objects of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateDeleteBulk(@javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options) throws Exception;

}
