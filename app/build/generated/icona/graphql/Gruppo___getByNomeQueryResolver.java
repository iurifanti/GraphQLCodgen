package icona.graphql;


/**
 * Retrieve a single object of class Gruppo by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Gruppo___getByNomeQueryResolver {

    /**
     * Retrieve a single object of class Gruppo by uniques.
     */
    CliGruppoDTO Gruppo___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
