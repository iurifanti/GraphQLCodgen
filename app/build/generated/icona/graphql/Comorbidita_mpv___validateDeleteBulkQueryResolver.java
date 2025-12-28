package icona.graphql;


/**
 * Validation of a bulk delete on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Comorbidita_mpv___validateDeleteBulkQueryResolver {

    /**
     * Validation of a bulk delete on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateDeleteBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options) throws Exception;

}
