package icona.graphql;


/**
 * Bulk delete a set of objects of class Indicazioni_arruolamento_studi.
Returns the number of object successfully deleted.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___deleteBulkMutationResolver {

    /**
     * Bulk delete a set of objects of class Indicazioni_arruolamento_studi.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Indicazioni_arruolamento_studi___deleteBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

}
