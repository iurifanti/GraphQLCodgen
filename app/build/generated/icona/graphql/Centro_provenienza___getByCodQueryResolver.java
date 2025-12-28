package icona.graphql;


/**
 * Retrieve a single object of class Centro_provenienza by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Centro_provenienza___getByCodQueryResolver {

    /**
     * Retrieve a single object of class Centro_provenienza by uniques.
     */
    CliCentro_provenienzaDTO Centro_provenienza___getByCod(int cod, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
