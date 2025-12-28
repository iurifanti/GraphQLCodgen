package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliQuestionarioSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    descrizione___ASC("descrizione___ASC"),
    descrizione___DESC("descrizione___DESC"),
    domande___ASC("domande___ASC"),
    domande___DESC("domande___DESC"),
    intervallo_compil_mesi___ASC("intervallo_compil_mesi___ASC"),
    intervallo_compil_mesi___DESC("intervallo_compil_mesi___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    parametri_personali___ASC("parametri_personali___ASC"),
    parametri_personali___DESC("parametri_personali___DESC"),
    studi_appartenenza___ASC("studi_appartenenza___ASC"),
    studi_appartenenza___DESC("studi_appartenenza___DESC"),
    titolo___ASC("titolo___ASC"),
    titolo___DESC("titolo___DESC");

    private final String graphqlName;

    private CliQuestionarioSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
