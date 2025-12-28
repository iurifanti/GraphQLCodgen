package icona.graphql;


/**
 * Resolver for Checks
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface ChecksResolver {

    /**
     * The associable objects for the role h_Paziente_.
     */
    CliH_PazientePageDTO h_Paziente____associables(CliChecksDTO checks, CliH_PazientePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role o_paziente_.
     */
    CliO_PazientePageDTO o_paziente____associables(CliChecksDTO checks, CliO_PazientePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role paziente_.
     */
    CliPazientePageDTO paziente____associables(CliChecksDTO checks, CliPazientePageOptionsDTO options) throws Exception;

}
