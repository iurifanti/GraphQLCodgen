package icona.graphql;


/**
 * Create or update an object of class Modalita_somministrazione.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Modalita_somministrazione___saveMutationResolver {

    /**
     * Create or update an object of class Modalita_somministrazione.
Returns the newly created/updated object.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___save(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
