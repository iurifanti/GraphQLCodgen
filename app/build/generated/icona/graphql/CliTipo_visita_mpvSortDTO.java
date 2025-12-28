package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliTipo_visita_mpvSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    booster___ASC("booster___ASC"),
    booster___DESC("booster___DESC"),
    cod___ASC("cod___ASC"),
    cod___DESC("cod___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC");

    private final String graphqlName;

    private CliTipo_visita_mpvSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
