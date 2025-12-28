package icona.graphql;


/**
 * Validation of a bulk update on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___validateUpdateBulkQueryResolver {

    /**
     * Validation of a bulk update on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateUpdateBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options) throws Exception;

}
