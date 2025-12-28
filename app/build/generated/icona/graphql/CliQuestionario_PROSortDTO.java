package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliQuestionario_PROSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    data_compilazione___ASC("data_compilazione___ASC"),
    data_compilazione___DESC("data_compilazione___DESC"),
    mese___ASC("mese___ASC"),
    mese___DESC("mese___DESC");

    private final String graphqlName;

    private CliQuestionario_PROSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
