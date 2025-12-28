package icona.graphql;


/**
 * Retrieve a single object of class Sequenza_genomica by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Sequenza_genomica___getQueryResolver {

    /**
     * Retrieve a single object of class Sequenza_genomica by ID.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
