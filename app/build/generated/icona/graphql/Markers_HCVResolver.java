package icona.graphql;


/**
 * Resolver for Markers_HCV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Markers_HCVResolver {

    /**
     * The associable objects for the role genotipo_HCV.
     */
    CliGenotipo_HCVPageDTO genotipo_HCV___associables(CliMarkers_HCVDTO markers_HCV, CliGenotipo_HCVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role metodica_genoma_HCV.
     */
    CliMetodica_genoma_HCV_HBVPageDTO metodica_genoma_HCV___associables(CliMarkers_HCVDTO markers_HCV, CliMetodica_genoma_HCV_HBVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role unita_di_misura_viremia.
     */
    CliUnita_di_misura_viremiaPageDTO unita_di_misura_viremia___associables(CliMarkers_HCVDTO markers_HCV, CliUnita_di_misura_viremiaPageOptionsDTO options) throws Exception;

}
