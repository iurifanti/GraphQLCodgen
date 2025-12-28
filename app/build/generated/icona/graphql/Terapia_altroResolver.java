package icona.graphql;


/**
 * Resolver for Terapia_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Terapia_altroResolver {

    /**
     * The associable objects for the role dosaggio_.
     */
    CliDosaggioPageDTO dosaggio____associables(CliTerapia_altroDTO terapia_altro, CliDosaggioPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role farmaco.
     */
    CliFarmaco_altroPageDTO farmaco___associables(CliTerapia_altroDTO terapia_altro, CliFarmaco_altroPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role farmaco_ATC_.
     */
    CliFarmaco_ATCPageDTO farmaco_ATC____associables(CliTerapia_altroDTO terapia_altro, CliFarmaco_ATCPageOptionsDTO options) throws Exception;

}
