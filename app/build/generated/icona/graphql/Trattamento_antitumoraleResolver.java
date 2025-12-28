package icona.graphql;


/**
 * Resolver for Trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Trattamento_antitumoraleResolver {

    /**
     * The associable objects for the role farmaco_antitumorale_.
     */
    CliFarmaco_antitumoralePageDTO farmaco_antitumorale____associables(CliTrattamento_antitumoraleDTO trattamento_antitumorale, CliFarmaco_antitumoralePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role farmaco_antitumorale_.
     */
    CliFarmaco_antitumoralePageDTO farmaco_antitumorale_(CliTrattamento_antitumoraleDTO trattamento_antitumorale, CliFarmaco_antitumoralePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role tipo_trattamento_antitumorale_.
     */
    CliTipo_trattamento_antitumoralePageDTO tipo_trattamento_antitumorale____associables(CliTrattamento_antitumoraleDTO trattamento_antitumorale, CliTipo_trattamento_antitumoralePageOptionsDTO options) throws Exception;

}
