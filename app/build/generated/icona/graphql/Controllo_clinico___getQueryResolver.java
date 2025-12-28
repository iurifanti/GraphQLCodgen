package icona.graphql;


/**
 * Retrieve a single object of class Controllo_clinico by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Controllo_clinico___getQueryResolver {

    /**
     * Retrieve a single object of class Controllo_clinico by ID.
     */
    CliControllo_clinicoDTO Controllo_clinico___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
