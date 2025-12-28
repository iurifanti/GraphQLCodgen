package icona.graphql;


/**
 * Retrieve a collection of object of class Markers_HBV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Markers_HBV___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Markers_HBV.
     */
    CliMarkers_HBVPageDTO Markers_HBV___getPage(CliMarkers_HBVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
