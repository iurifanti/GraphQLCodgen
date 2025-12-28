package icona.graphql;


/**
 * Resolver for H_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface H_PazienteResolver {

    /**
     * The associable objects for the role identita_genere_.
     */
    CliIdentita_generePageDTO identita_genere____associables(CliH_PazienteDTO h_Paziente, CliIdentita_generePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role l_dettaglio_.
     */
    CliL_dettaglioPageDTO l_dettaglio_(CliH_PazienteDTO h_Paziente, CliL_dettaglioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_HDV_.
     */
    CliMarkers_HDVPageDTO markers_HDV_(CliH_PazienteDTO h_Paziente, CliMarkers_HDVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role trattamento_antitumorale_.
     */
    CliTrattamento_antitumoralePageDTO trattamento_antitumorale_(CliH_PazienteDTO h_Paziente, CliTrattamento_antitumoralePageOptionsDTO options) throws Exception;

}
