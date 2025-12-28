package icona.graphql;


/**
 * Retrieve a collection of object of class Markers_HIV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Markers_HIV___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Markers_HIV.
     */
    CliMarkers_HIVPageDTO Markers_HIV___getPage(CliMarkers_HIVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
