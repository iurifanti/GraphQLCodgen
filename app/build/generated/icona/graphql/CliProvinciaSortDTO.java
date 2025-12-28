package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliProvinciaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC");

    private final String graphqlName;

    private CliProvinciaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
