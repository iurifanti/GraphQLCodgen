package icona.graphql;


/**
 * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___previewCreateQueryResolver {

    /**
     * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
     */
    CliFeedbackDTO Feedback___previewCreate(@javax.validation.constraints.NotNull CliFeedbackDraftCreateDTO data) throws Exception;

}
