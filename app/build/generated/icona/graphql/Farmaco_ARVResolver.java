package icona.graphql;


/**
 * Resolver for Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Farmaco_ARVResolver {

    /**
     * The associable objects for the role componente.
     */
    CliComponentePageDTO componente___associables(CliFarmaco_ARVDTO farmaco_ARV, CliComponentePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role componente.
     */
    CliComponentePageDTO componente(CliFarmaco_ARVDTO farmaco_ARV, CliComponentePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role dosaggio_.
     */
    CliDosaggioPageDTO dosaggio_(CliFarmaco_ARVDTO farmaco_ARV, CliDosaggioPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role terapia_ARV.
     */
    CliTerapia_ARVPageDTO terapia_ARV___associables(CliFarmaco_ARVDTO farmaco_ARV, CliTerapia_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role terapia_ARV.
     */
    CliTerapia_ARVPageDTO terapia_ARV(CliFarmaco_ARVDTO farmaco_ARV, CliTerapia_ARVPageOptionsDTO options) throws Exception;

}
