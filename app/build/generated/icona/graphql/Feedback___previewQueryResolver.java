package icona.graphql;


/**
 * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Feedback___previewQueryResolver {

    /**
     * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
     */
    CliFeedbackDTO Feedback___preview(@javax.validation.constraints.NotNull CliFeedbackDraftDTO data) throws Exception;

}
