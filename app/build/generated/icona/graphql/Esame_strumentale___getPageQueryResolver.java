package icona.graphql;


/**
 * Retrieve a collection of object of class Esame_strumentale.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Esame_strumentale___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Esame_strumentale.
     */
    CliEsame_strumentalePageDTO Esame_strumentale___getPage(CliEsame_strumentalePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
