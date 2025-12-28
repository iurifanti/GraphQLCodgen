package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliCodice_studioSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    data_arruolamento___ASC("data_arruolamento___ASC"),
    data_arruolamento___DESC("data_arruolamento___DESC"),
    note___ASC("note___ASC"),
    note___DESC("note___DESC"),
    studio___ASC("studio___ASC"),
    studio___DESC("studio___DESC"),
    titolo___ASC("titolo___ASC"),
    titolo___DESC("titolo___DESC");

    private final String graphqlName;

    private CliCodice_studioSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
