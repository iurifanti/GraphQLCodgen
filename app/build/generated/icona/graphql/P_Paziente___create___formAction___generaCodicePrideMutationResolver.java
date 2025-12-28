package icona.graphql;


/**
 * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on a new object of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___create___formAction___generaCodicePrideMutationResolver {

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on a new object of class P_Paziente.
     */
    CliP_PazienteFormActionHandlerResultDTO P_Paziente___create___formAction___generaCodicePride(CliP_PazienteDraftCreateDTO data, @javax.validation.constraints.NotNull CliGenera_codice_internoDraftCreateDTO formParam, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
