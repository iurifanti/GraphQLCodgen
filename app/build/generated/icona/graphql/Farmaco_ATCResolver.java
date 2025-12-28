package icona.graphql;


/**
 * Resolver for Farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Farmaco_ATCResolver {

    /**
     * The associable objects for the role AIC_.
     */
    CliAICPageDTO AIC____associables(CliFarmaco_ATCDTO farmaco_ATC, CliAICPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role AIC_.
     */
    CliAICPageDTO AIC_(CliFarmaco_ATCDTO farmaco_ATC, CliAICPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role classificazione_farmaco_ATC_.
     */
    CliClassificazione_farmaco_ATCPageDTO classificazione_farmaco_ATC____associables(CliFarmaco_ATCDTO farmaco_ATC, CliClassificazione_farmaco_ATCPageOptionsDTO options) throws Exception;

}
