package icona.graphql;


/**
 * Resolver for Farmaco_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Farmaco_altroResolver {

    /**
     * The associable objects for the role combinazioni_accettate_non_ARV_.
     */
    CliCombinazioni_accettate_non_ARVPageDTO combinazioni_accettate_non_ARV____associables(CliFarmaco_altroDTO farmaco_altro, CliCombinazioni_accettate_non_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role combinazioni_accettate_non_ARV_.
     */
    CliCombinazioni_accettate_non_ARVPageDTO combinazioni_accettate_non_ARV_(CliFarmaco_altroDTO farmaco_altro, CliCombinazioni_accettate_non_ARVPageOptionsDTO options) throws Exception;

}
