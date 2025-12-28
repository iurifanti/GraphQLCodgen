package icona.graphql;


/**
 * Create an object of class Feedback.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___createMutationResolver {

    /**
     * Create an object of class Feedback.
Returns the newly created object.
     */
    CliFeedbackDTO Feedback___create(@javax.validation.constraints.NotNull CliFeedbackCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
