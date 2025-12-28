package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_visita_mpv___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateUpdateBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options) throws Exception;

}
