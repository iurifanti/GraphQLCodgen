package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliTesto_introSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    ordine___ASC("ordine___ASC"),
    ordine___DESC("ordine___DESC"),
    testo___ASC("testo___ASC"),
    testo___DESC("testo___DESC"),
    titolo___ASC("titolo___ASC"),
    titolo___DESC("titolo___DESC");

    private final String graphqlName;

    private CliTesto_introSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
