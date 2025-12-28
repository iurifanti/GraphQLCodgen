package icona.graphql;


/**
 * Create or update an object of class Indicazioni_arruolamento_studi.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___saveMutationResolver {

    /**
     * Create or update an object of class Indicazioni_arruolamento_studi.
Returns the newly created/updated object.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___save(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
