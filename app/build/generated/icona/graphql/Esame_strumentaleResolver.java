package icona.graphql;


/**
 * Resolver for Esame_strumentale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Esame_strumentaleResolver {

    /**
     * The associable objects for the role esito_biopsia.
     */
    CliPatologiaPageDTO esito_biopsia___associables(CliEsame_strumentaleDTO esame_strumentale, CliPatologiaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role esito_biopsia.
     */
    CliPatologiaPageDTO esito_biopsia(CliEsame_strumentaleDTO esame_strumentale, CliPatologiaPageOptionsDTO options) throws Exception;

}
