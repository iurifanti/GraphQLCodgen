package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Comorbidita_mpv___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateUpdateBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options) throws Exception;

}
