package icona.graphql;


/**
 * Retrieve a single object of class Paziente by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Paziente___getByCodice_internoQueryResolver {

    /**
     * Retrieve a single object of class Paziente by uniques.
     */
    CliPazienteDTO Paziente___getByCodice_interno(@javax.validation.constraints.NotNull String codice_interno, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
