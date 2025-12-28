package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum Cli_UserSortDTO {

    _createdby___ASC("_createdby___ASC"),
    _createdby___DESC("_createdby___DESC"),
    _createdon___ASC("_createdon___ASC"),
    _createdon___DESC("_createdon___DESC"),
    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    admin___ASC("admin___ASC"),
    admin___DESC("admin___DESC"),
    email___ASC("email___ASC"),
    email___DESC("email___DESC"),
    forceChangePassword___ASC("forceChangePassword___ASC"),
    forceChangePassword___DESC("forceChangePassword___DESC"),
    mpoxicona_vac___ASC("mpoxicona_vac___ASC"),
    mpoxicona_vac___DESC("mpoxicona_vac___DESC"),
    profile___ASC("profile___ASC"),
    profile___DESC("profile___DESC"),
    team___ASC("team___ASC"),
    team___DESC("team___DESC"),
    username___ASC("username___ASC"),
    username___DESC("username___DESC");

    private final String graphqlName;

    private Cli_UserSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
