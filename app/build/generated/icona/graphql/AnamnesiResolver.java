package icona.graphql;


/**
 * Resolver for Anamnesi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface AnamnesiResolver {

    /**
     * The associable objects for the role luogo_test_HIV_.
     */
    CliLuogo_test_HIVPageDTO luogo_test_HIV____associables(CliAnamnesiDTO anamnesi, CliLuogo_test_HIVPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role motivazione_naive.
     */
    CliMotivazione_naivePageDTO motivazione_naive___associables(CliAnamnesiDTO anamnesi, CliMotivazione_naivePageOptionsDTO options) throws Exception;

}
