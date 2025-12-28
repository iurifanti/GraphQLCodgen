package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliGilbertSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    risultato___ASC("risultato___ASC"),
    risultato___DESC("risultato___DESC");

    private final String graphqlName;

    private CliGilbertSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
