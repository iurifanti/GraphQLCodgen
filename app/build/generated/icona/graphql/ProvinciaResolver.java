package icona.graphql;


/**
 * Resolver for Provincia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface ProvinciaResolver {

    /**
     * The associable objects for the role regione_.
     */
    CliRegionePageDTO regione____associables(CliProvinciaDTO provincia, CliRegionePageOptionsDTO options) throws Exception;

}
