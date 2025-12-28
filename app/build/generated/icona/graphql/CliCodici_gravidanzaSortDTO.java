package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliCodici_gravidanzaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    campo___ASC("campo___ASC"),
    campo___DESC("campo___DESC"),
    codice_hicdep___ASC("codice_hicdep___ASC"),
    codice_hicdep___DESC("codice_hicdep___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC");

    private final String graphqlName;

    private CliCodici_gravidanzaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
