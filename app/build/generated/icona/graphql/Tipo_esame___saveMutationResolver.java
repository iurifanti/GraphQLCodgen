package icona.graphql;


/**
 * Create or update an object of class Tipo_esame.
Returns the newly created/updated object.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Tipo_esame___saveMutationResolver {

    /**
     * Create or update an object of class Tipo_esame.
Returns the newly created/updated object.
     */
    CliTipo_esameDTO Tipo_esame___save(@javax.validation.constraints.NotNull CliTipo_esameDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
