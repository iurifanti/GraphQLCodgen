package icona.graphql;


/**
 * Retrieve a collection of object of class Dropout.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Dropout___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Dropout.
     */
    CliDropoutPageDTO Dropout___getPage(CliDropoutPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
