package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliRange_BMISortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    colore___ASC("colore___ASC"),
    colore___DESC("colore___DESC"),
    messaggio___ASC("messaggio___ASC"),
    messaggio___DESC("messaggio___DESC"),
    min___ASC("min___ASC"),
    min___DESC("min___DESC");

    private final String graphqlName;

    private CliRange_BMISortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
