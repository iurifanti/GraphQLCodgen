package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliFarmaco_antitumoraleSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    combinazioni___ASC("combinazioni___ASC"),
    combinazioni___DESC("combinazioni___DESC"),
    farmaco_ATC___ASC("farmaco_ATC___ASC"),
    farmaco_ATC___DESC("farmaco_ATC___DESC"),
    n_tipi_trattamento_associati___ASC("n_tipi_trattamento_associati___ASC"),
    n_tipi_trattamento_associati___DESC("n_tipi_trattamento_associati___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    tipi_trattamento_associati___ASC("tipi_trattamento_associati___ASC"),
    tipi_trattamento_associati___DESC("tipi_trattamento_associati___DESC");

    private final String graphqlName;

    private CliFarmaco_antitumoraleSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
