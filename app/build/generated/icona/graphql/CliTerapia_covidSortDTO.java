package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliTerapia_covidSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altro_farmaco___ASC("altro_farmaco___ASC"),
    altro_farmaco___DESC("altro_farmaco___DESC"),
    data_fine___ASC("data_fine___ASC"),
    data_fine___DESC("data_fine___DESC"),
    data_inizio___ASC("data_inizio___ASC"),
    data_inizio___DESC("data_inizio___DESC"),
    farmaco_covid___ASC("farmaco_covid___ASC"),
    farmaco_covid___DESC("farmaco_covid___DESC");

    private final String graphqlName;

    private CliTerapia_covidSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
