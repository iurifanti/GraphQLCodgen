package icona.graphql;


/**
 * Resolver for Combinazioni_accettate_non_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Combinazioni_accettate_non_ARVResolver {

    /**
     * The associable objects for the role farmaco_altro_.
     */
    CliFarmaco_altroPageDTO farmaco_altro____associables(CliCombinazioni_accettate_non_ARVDTO combinazioni_accettate_non_ARV, CliFarmaco_altroPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role farmaco_altro_.
     */
    CliFarmaco_altroPageDTO farmaco_altro_(CliCombinazioni_accettate_non_ARVDTO combinazioni_accettate_non_ARV, CliFarmaco_altroPageOptionsDTO options) throws Exception;

}
