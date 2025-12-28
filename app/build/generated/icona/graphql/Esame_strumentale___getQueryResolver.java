package icona.graphql;


/**
 * Retrieve a single object of class Esame_strumentale by ID.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Esame_strumentale___getQueryResolver {

    /**
     * Retrieve a single object of class Esame_strumentale by ID.
     */
    CliEsame_strumentaleDTO Esame_strumentale___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
