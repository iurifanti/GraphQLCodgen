package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliCentro_provenienzaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altro___ASC("altro___ASC"),
    altro___DESC("altro___DESC"),
    cod___ASC("cod___ASC"),
    cod___DESC("cod___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    visibile___ASC("visibile___ASC"),
    visibile___DESC("visibile___DESC");

    private final String graphqlName;

    private CliCentro_provenienzaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
