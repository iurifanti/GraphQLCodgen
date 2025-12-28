package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliExcelImporterSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    file___ASC("file___ASC"),
    file___DESC("file___DESC"),
    log___ASC("log___ASC"),
    log___DESC("log___DESC");

    private final String graphqlName;

    private CliExcelImporterSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
