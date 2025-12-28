package icona.graphql;


/**
 * Retrieve a single object of class Tipo_esame by uniques.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___getByNomeQueryResolver {

    /**
     * Retrieve a single object of class Tipo_esame by uniques.
     */
    CliTipo_esameDTO Tipo_esame___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
