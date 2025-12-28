package icona.graphql;


/**
 * Resolver for Gravidanza
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface GravidanzaResolver {

    /**
     * The associable objects for the role anomalia.
     */
    CliCodici_gravidanzaPageDTO anomalia___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role cariotipo1.
     */
    CliCodici_gravidanzaPageDTO cariotipo1___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role cariotipo2.
     */
    CliCodici_gravidanzaPageDTO cariotipo2___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role concepimento.
     */
    CliCodici_gravidanzaPageDTO concepimento___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role esito.
     */
    CliCodici_gravidanzaPageDTO esito___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role modalita.
     */
    CliCodici_gravidanzaPageDTO modalita___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_interruzione.
     */
    CliCodici_gravidanzaPageDTO motivazione_interruzione___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role problema_ostetrico.
     */
    CliCodici_gravidanzaPageDTO problema_ostetrico___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role procedura_invasiva.
     */
    CliCodici_gravidanzaPageDTO procedura_invasiva___associables(CliGravidanzaDTO gravidanza, CliCodici_gravidanzaPageOptionsDTO options) throws Exception;

}
