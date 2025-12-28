package icona.graphql;


/**
 * Retrieve a collection of object of class Markers_HCV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Markers_HCV___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Markers_HCV.
     */
    CliMarkers_HCVPageDTO Markers_HCV___getPage(CliMarkers_HCVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
