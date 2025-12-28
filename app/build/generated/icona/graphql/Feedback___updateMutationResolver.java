package icona.graphql;


/**
 * Update an object of class Feedback.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___updateMutationResolver {

    /**
     * Update an object of class Feedback.
Returns the newly created object.
     */
    CliFeedbackDTO Feedback___update(@javax.validation.constraints.NotNull CliFeedbackUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
