package icona.graphql;


/**
 * Resolver for Markers_HBV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Markers_HBVResolver {

    /**
     * The associable objects for the role metodica_genoma_HBV.
     */
    CliMetodica_genoma_HCV_HBVPageDTO metodica_genoma_HBV___associables(CliMarkers_HBVDTO markers_HBV, CliMetodica_genoma_HCV_HBVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role unita_di_misura_viremia.
     */
    CliUnita_di_misura_viremiaPageDTO unita_di_misura_viremia___associables(CliMarkers_HBVDTO markers_HBV, CliUnita_di_misura_viremiaPageOptionsDTO options) throws Exception;

}
