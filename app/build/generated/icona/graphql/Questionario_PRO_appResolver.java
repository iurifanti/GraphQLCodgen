package icona.graphql;


/**
 * Resolver for Questionario_PRO_app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Questionario_PRO_appResolver {

    /**
     * The associable objects for the role questionario_.
     */
    CliQuestionarioPageDTO questionario____associables(CliQuestionario_PRO_appDTO questionario_PRO_app, CliQuestionarioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role risposta_.
     */
    CliRispostaPageDTO risposta_(CliQuestionario_PRO_appDTO questionario_PRO_app, CliRispostaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role studio_questionario_.
     */
    CliStudio_questionarioPageDTO studio_questionario____associables(CliQuestionario_PRO_appDTO questionario_PRO_app, CliStudio_questionarioPageOptionsDTO options) throws Exception;

}
