package icona.graphql;


/**
 * Resolver for Markers_HDV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Markers_HDVResolver {

    /**
     * The associable objects for the role metodica_genoma_HDV.
     */
    CliMetodica_genoma_HCV_HBVPageDTO metodica_genoma_HDV___associables(CliMarkers_HDVDTO markers_HDV, CliMetodica_genoma_HCV_HBVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role unita_di_misura_viremia_.
     */
    CliUnita_di_misura_viremiaPageDTO unita_di_misura_viremia____associables(CliMarkers_HDVDTO markers_HDV, CliUnita_di_misura_viremiaPageOptionsDTO options) throws Exception;

}
