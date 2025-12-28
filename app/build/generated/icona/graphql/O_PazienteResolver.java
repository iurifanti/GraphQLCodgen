package icona.graphql;


/**
 * Resolver for O_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface O_PazienteResolver {

    /**
     * The associated objects for the role trattamento_antitumorale_.
     */
    CliTrattamento_antitumoralePageDTO trattamento_antitumorale_(CliO_PazienteDTO o_Paziente, CliTrattamento_antitumoralePageOptionsDTO options) throws Exception;

}
