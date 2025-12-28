package icona.graphql;


/**
 * Retrieve a single object of class Indicazioni_arruolamento_studi by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Indicazioni_arruolamento_studi___getQueryResolver {

    /**
     * Retrieve a single object of class Indicazioni_arruolamento_studi by ID.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
