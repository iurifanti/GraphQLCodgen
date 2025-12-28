package icona.graphql;


/**
 * Update an object of singleton class Settings_PRO.
Returns the newly created object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Settings_PRO___updateMutationResolver {

    /**
     * Update an object of singleton class Settings_PRO.
Returns the newly created object.
     */
    CliSettings_PRODTO Settings_PRO___update(@javax.validation.constraints.NotNull CliSettings_PROUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
