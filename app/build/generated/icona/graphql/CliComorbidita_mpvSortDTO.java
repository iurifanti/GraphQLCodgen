package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliComorbidita_mpvSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    name___ASC("name___ASC"),
    name___DESC("name___DESC"),
    ordine___ASC("ordine___ASC"),
    ordine___DESC("ordine___DESC");

    private final String graphqlName;

    private CliComorbidita_mpvSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
