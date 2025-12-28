package icona.graphql;


/**
 * Retrieve a collection of object of class P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface P_Paziente___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class P_Paziente.
     */
    CliP_PazientePageDTO P_Paziente___getPage(CliP_PazientePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
