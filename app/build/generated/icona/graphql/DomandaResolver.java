package icona.graphql;


/**
 * Resolver for Domanda
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface DomandaResolver {

    /**
     * The associable objects for the role peso_domanda.
     */
    CliDomandaPageDTO peso_domanda___associables(CliDomandaDTO domanda, CliDomandaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role questionario_.
     */
    CliQuestionarioPageDTO questionario____associables(CliDomandaDTO domanda, CliQuestionarioPageOptionsDTO options) throws Exception;

}
