package icona.graphql;


/**
 * Retrieve a collection of object of class Controllo_clinico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Controllo_clinico___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Controllo_clinico.
     */
    CliControllo_clinicoPageDTO Controllo_clinico___getPage(CliControllo_clinicoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
