package icona.graphql;


/**
 * Retrieve a collection of object of class Feedback.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Feedback.
     */
    CliFeedbackPageDTO Feedback___getPage(CliFeedbackPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
