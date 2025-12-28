package icona.graphql;


/**
 * Retrieve a single object of class Modalita_somministrazione by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___getByNomeQueryResolver {

    /**
     * Retrieve a single object of class Modalita_somministrazione by uniques.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
