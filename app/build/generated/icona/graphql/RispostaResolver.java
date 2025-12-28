package icona.graphql;


/**
 * Resolver for Risposta
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface RispostaResolver {

    /**
     * The associable objects for the role domanda_.
     */
    CliDomandaPageDTO domanda____associables(CliRispostaDTO risposta, CliDomandaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role risposta_possibile_multipla.
     */
    CliRisposta_possibilePageDTO risposta_possibile_multipla___associables(CliRispostaDTO risposta, CliRisposta_possibilePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role risposta_possibile_multipla.
     */
    CliRisposta_possibilePageDTO risposta_possibile_multipla(CliRispostaDTO risposta, CliRisposta_possibilePageOptionsDTO options) throws Exception;

}
