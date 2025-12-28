package icona.graphql;


/**
 * Resolver for Terapia_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Terapia_ARVResolver {

    /**
     * The associable objects for the role dosaggio_.
     */
    CliDosaggioPageDTO dosaggio____associables(CliTerapia_ARVDTO terapia_ARV, CliDosaggioPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role farmaco_ARV.
     */
    CliFarmaco_ARVPageDTO farmaco_ARV___associables(CliTerapia_ARVDTO terapia_ARV, CliFarmaco_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_fine_ARV_princ.
     */
    CliMotivazione_fine_ARVPageDTO motivazione_fine_ARV_princ___associables(CliTerapia_ARVDTO terapia_ARV, CliMotivazione_fine_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_fine_ARV_sec.
     */
    CliMotivazione_fine_ARVPageDTO motivazione_fine_ARV_sec___associables(CliTerapia_ARVDTO terapia_ARV, CliMotivazione_fine_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_inizio_ARV.
     */
    CliMotivazione_inizio_ARVPageDTO motivazione_inizio_ARV___associables(CliTerapia_ARVDTO terapia_ARV, CliMotivazione_inizio_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role warning_.
     */
    CliWarningPageDTO warning____associables(CliTerapia_ARVDTO terapia_ARV, CliWarningPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role warning_.
     */
    CliWarningPageDTO warning_(CliTerapia_ARVDTO terapia_ARV, CliWarningPageOptionsDTO options) throws Exception;

}
