package icona.graphql;


/**
 * Resolver for Risposta_possibile
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Risposta_possibileResolver {

    /**
     * The associable objects for the role domanda_.
     */
    CliDomandaPageDTO domanda____associables(CliRisposta_possibileDTO risposta_possibile, CliDomandaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role domanda_.
     */
    CliDomandaPageDTO domanda_(CliRisposta_possibileDTO risposta_possibile, CliDomandaPageOptionsDTO options) throws Exception;

}
