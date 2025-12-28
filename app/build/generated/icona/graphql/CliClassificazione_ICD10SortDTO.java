package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliClassificazione_ICD10SortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    descrizione___ASC("descrizione___ASC"),
    descrizione___DESC("descrizione___DESC");

    private final String graphqlName;

    private CliClassificazione_ICD10SortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
