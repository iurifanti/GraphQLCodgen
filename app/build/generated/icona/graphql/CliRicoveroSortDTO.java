package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliRicoveroSortDTO {

    ICD9_1___ASC("ICD9_1___ASC"),
    ICD9_1___DESC("ICD9_1___DESC"),
    ICD9_10___ASC("ICD9_10___ASC"),
    ICD9_10___DESC("ICD9_10___DESC"),
    ICD9_2___ASC("ICD9_2___ASC"),
    ICD9_2___DESC("ICD9_2___DESC"),
    ICD9_3___ASC("ICD9_3___ASC"),
    ICD9_3___DESC("ICD9_3___DESC"),
    ICD9_4___ASC("ICD9_4___ASC"),
    ICD9_4___DESC("ICD9_4___DESC"),
    ICD9_5___ASC("ICD9_5___ASC"),
    ICD9_5___DESC("ICD9_5___DESC"),
    ICD9_6___ASC("ICD9_6___ASC"),
    ICD9_6___DESC("ICD9_6___DESC"),
    ICD9_7___ASC("ICD9_7___ASC"),
    ICD9_7___DESC("ICD9_7___DESC"),
    ICD9_8___ASC("ICD9_8___ASC"),
    ICD9_8___DESC("ICD9_8___DESC"),
    ICD9_9___ASC("ICD9_9___ASC"),
    ICD9_9___DESC("ICD9_9___DESC"),
    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    data_approssimata___ASC("data_approssimata___ASC"),
    data_approssimata___DESC("data_approssimata___DESC"),
    data_dimissione___ASC("data_dimissione___ASC"),
    data_dimissione___DESC("data_dimissione___DESC"),
    data_ricovero___ASC("data_ricovero___ASC"),
    data_ricovero___DESC("data_ricovero___DESC"),
    diagnosi___ASC("diagnosi___ASC"),
    diagnosi___DESC("diagnosi___DESC");

    private final String graphqlName;

    private CliRicoveroSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
