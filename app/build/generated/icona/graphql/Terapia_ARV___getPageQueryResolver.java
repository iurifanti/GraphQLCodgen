package icona.graphql;


/**
 * Retrieve a collection of object of class Terapia_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Terapia_ARV___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Terapia_ARV.
     */
    CliTerapia_ARVPageDTO Terapia_ARV___getPage(CliTerapia_ARVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
