package icona.graphql;


/**
 * Resolver for Tipo_trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Tipo_trattamento_antitumoraleResolver {

    /**
     * The associable objects for the role farmaco_antitumorale_.
     */
    CliFarmaco_antitumoralePageDTO farmaco_antitumorale____associables(CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale, CliFarmaco_antitumoralePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role farmaco_antitumorale_.
     */
    CliFarmaco_antitumoralePageDTO farmaco_antitumorale_(CliTipo_trattamento_antitumoraleDTO tipo_trattamento_antitumorale, CliFarmaco_antitumoralePageOptionsDTO options) throws Exception;

}
