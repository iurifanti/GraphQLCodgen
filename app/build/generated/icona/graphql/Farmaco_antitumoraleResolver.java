package icona.graphql;


/**
 * Resolver for Farmaco_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Farmaco_antitumoraleResolver {

    /**
     * The associable objects for the role tipo_trattamento_antitumorale_.
     */
    CliTipo_trattamento_antitumoralePageDTO tipo_trattamento_antitumorale____associables(CliFarmaco_antitumoraleDTO farmaco_antitumorale, CliTipo_trattamento_antitumoralePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role tipo_trattamento_antitumorale_.
     */
    CliTipo_trattamento_antitumoralePageDTO tipo_trattamento_antitumorale_(CliFarmaco_antitumoraleDTO farmaco_antitumorale, CliTipo_trattamento_antitumoralePageOptionsDTO options) throws Exception;

}
