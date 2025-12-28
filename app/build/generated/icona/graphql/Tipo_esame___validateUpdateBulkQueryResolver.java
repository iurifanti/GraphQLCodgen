package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Tipo_esame.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateUpdateBulk(@javax.validation.constraints.NotNull CliTipo_esameDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options) throws Exception;

}
