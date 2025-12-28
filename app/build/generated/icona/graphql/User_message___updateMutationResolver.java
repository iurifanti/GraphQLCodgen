package icona.graphql;


/**
 * Update an object of singleton class User_message.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface User_message___updateMutationResolver {

    /**
     * Update an object of singleton class User_message.
Returns the newly created object.
     */
    CliUser_messageDTO User_message___update(@javax.validation.constraints.NotNull CliUser_messageUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
