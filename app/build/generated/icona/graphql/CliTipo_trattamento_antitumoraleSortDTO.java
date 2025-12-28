package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliTipo_trattamento_antitumoraleSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    cellulare___ASC("cellulare___ASC"),
    cellulare___DESC("cellulare___DESC"),
    chemioterapia___ASC("chemioterapia___ASC"),
    chemioterapia___DESC("chemioterapia___DESC"),
    chirurgico___ASC("chirurgico___ASC"),
    chirurgico___DESC("chirurgico___DESC"),
    farmaco_antitumorali_associati___ASC("farmaco_antitumorali_associati___ASC"),
    farmaco_antitumorali_associati___DESC("farmaco_antitumorali_associati___DESC"),
    immunoterapia___ASC("immunoterapia___ASC"),
    immunoterapia___DESC("immunoterapia___DESC"),
    n_farmaci_antitumorali_associati___ASC("n_farmaci_antitumorali_associati___ASC"),
    n_farmaci_antitumorali_associati___DESC("n_farmaci_antitumorali_associati___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    ormonale___ASC("ormonale___ASC"),
    ormonale___DESC("ormonale___DESC"),
    radioterapia___ASC("radioterapia___ASC"),
    radioterapia___DESC("radioterapia___DESC"),
    staminali___ASC("staminali___ASC"),
    staminali___DESC("staminali___DESC");

    private final String graphqlName;

    private CliTipo_trattamento_antitumoraleSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
