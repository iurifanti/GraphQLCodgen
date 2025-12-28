package icona.graphql;


/**
 * Resolver for Terapia_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface Terapia_covidResolver {

    /**
     * The associable objects for the role farmaco_covid_.
     */
    CliFarmaco_covidPageDTO farmaco_covid____associables(CliTerapia_covidDTO terapia_covid, CliFarmaco_covidPageOptionsDTO options) throws Exception;

}
