package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliEpisodio_MPOXSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altra_terapia___ASC("altra_terapia___ASC"),
    altra_terapia___DESC("altra_terapia___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    ricoverato___ASC("ricoverato___ASC"),
    ricoverato___DESC("ricoverato___DESC"),
    terapia___ASC("terapia___ASC"),
    terapia___DESC("terapia___DESC"),
    tipo_terapia___ASC("tipo_terapia___ASC"),
    tipo_terapia___DESC("tipo_terapia___DESC");

    private final String graphqlName;

    private CliEpisodio_MPOXSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
