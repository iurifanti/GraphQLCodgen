package icona.graphql;


/**
 * Resolver for P_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface P_PazienteResolver {

    /**
     * The associable objects for the role centro_.
     */
    CliCentroPageDTO centro____associables(CliP_PazienteDTO p_Paziente, CliCentroPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role questionario_PRO_app_.
     */
    CliQuestionario_PRO_appPageDTO questionario_PRO_app_(CliP_PazienteDTO p_Paziente, CliQuestionario_PRO_appPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role studio_questionario_.
     */
    CliStudio_questionarioPageDTO studio_questionario____associables(CliP_PazienteDTO p_Paziente, CliStudio_questionarioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role studio_questionario_.
     */
    CliStudio_questionarioPageDTO studio_questionario_(CliP_PazienteDTO p_Paziente, CliStudio_questionarioPageOptionsDTO options) throws Exception;

}
