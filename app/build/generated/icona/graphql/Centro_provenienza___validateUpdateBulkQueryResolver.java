package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Centro_provenienza.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Centro_provenienza___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateUpdateBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options) throws Exception;

}
