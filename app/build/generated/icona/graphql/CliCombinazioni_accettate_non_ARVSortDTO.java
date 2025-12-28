package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliCombinazioni_accettate_non_ARVSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    farmaci___ASC("farmaci___ASC"),
    farmaci___DESC("farmaci___DESC");

    private final String graphqlName;

    private CliCombinazioni_accettate_non_ARVSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
