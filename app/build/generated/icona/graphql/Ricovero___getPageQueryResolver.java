package icona.graphql;


/**
 * Retrieve a collection of object of class Ricovero.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface Ricovero___getPageQueryResolver {

    /**
     * Retrieve a collection of object of class Ricovero.
     */
    CliRicoveroPageDTO Ricovero___getPage(CliRicoveroPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

}
