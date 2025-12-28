package icona.graphql;


/**
 * Resolver for Regione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface RegioneResolver {

    /**
     * The associable objects for the role provincia_.
     */
    CliProvinciaPageDTO provincia____associables(CliRegioneDTO regione, CliProvinciaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role provincia_.
     */
    CliProvinciaPageDTO provincia_(CliRegioneDTO regione, CliProvinciaPageOptionsDTO options) throws Exception;

}
