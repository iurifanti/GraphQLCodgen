package icona.graphql;


/**
 * Retrieve a preview object of class _User for an object of _User not yet instanced.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface _User___previewQueryResolver {

    /**
     * Retrieve a preview object of class _User for an object of _User not yet instanced.
     */
    Cli_UserDTO _User___preview(@javax.validation.constraints.NotNull Cli_UserDraftDTO data) throws Exception;

}
