package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Gruppo.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateUpdateBulk(@javax.validation.constraints.NotNull CliGruppoDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options) throws Exception;

}
