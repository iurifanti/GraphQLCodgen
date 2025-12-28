package icona.graphql;


/**
 * Validation of a bulk delete on a set of objects of class Modalita_somministrazione.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___validateDeleteBulkQueryResolver {

    /**
     * Validation of a bulk delete on a set of objects of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateDeleteBulk(@javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options) throws Exception;

}
