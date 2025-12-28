package icona.graphql;


/**
 * Resolver for Evento
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface EventoResolver {

    /**
     * The associable objects for the role classificazione_ICD10_.
     */
    CliClassificazione_ICD10PageDTO classificazione_ICD10____associables(CliEventoDTO evento, CliClassificazione_ICD10PageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role patologia.
     */
    CliPatologiaPageDTO patologia___associables(CliEventoDTO evento, CliPatologiaPageOptionsDTO options) throws Exception;

}
