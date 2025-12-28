package icona.graphql;


/**
 * Validation of a bulk delete on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___validateDeleteBulkQueryResolver {

    /**
     * Validation of a bulk delete on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateDeleteBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options) throws Exception;

}
