package icona.graphql;


/**
 * Retrieve a single object of class Terapia_ARV by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Terapia_ARV___getQueryResolver {

    /**
     * Retrieve a single object of class Terapia_ARV by ID.
     */
    CliTerapia_ARVDTO Terapia_ARV___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
