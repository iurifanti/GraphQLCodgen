package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliSVRSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altro_svr___ASC("altro_svr___ASC"),
    altro_svr___DESC("altro_svr___DESC"),
    clearance_spontanea___ASC("clearance_spontanea___ASC"),
    clearance_spontanea___DESC("clearance_spontanea___DESC"),
    data_valutazione___ASC("data_valutazione___ASC"),
    data_valutazione___DESC("data_valutazione___DESC"),
    svr___ASC("svr___ASC"),
    svr___DESC("svr___DESC"),
    terapia___ASC("terapia___ASC"),
    terapia___DESC("terapia___DESC");

    private final String graphqlName;

    private CliSVRSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
