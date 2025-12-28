package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliIndicazioni_arruolamento_studiSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    documento___ASC("documento___ASC"),
    documento___DESC("documento___DESC"),
    studio___ASC("studio___ASC"),
    studio___DESC("studio___DESC");

    private final String graphqlName;

    private CliIndicazioni_arruolamento_studiSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
