package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliMetodica_genoma_HCV_HBVSortDTO {

    _createdby___ASC("_createdby___ASC"),
    _createdby___DESC("_createdby___DESC"),
    _createdon___ASC("_createdon___ASC"),
    _createdon___DESC("_createdon___DESC"),
    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    _lastmodifiedby___ASC("_lastmodifiedby___ASC"),
    _lastmodifiedby___DESC("_lastmodifiedby___DESC"),
    _lastmodifiedon___ASC("_lastmodifiedon___ASC"),
    _lastmodifiedon___DESC("_lastmodifiedon___DESC"),
    _ownedby___ASC("_ownedby___ASC"),
    _ownedby___DESC("_ownedby___DESC"),
    _ownedon___ASC("_ownedon___ASC"),
    _ownedon___DESC("_ownedon___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    codice_DAD___ASC("codice_DAD___ASC"),
    codice_DAD___DESC("codice_DAD___DESC"),
    codice_inchehp___ASC("codice_inchehp___ASC"),
    codice_inchehp___DESC("codice_inchehp___DESC"),
    hbv___ASC("hbv___ASC"),
    hbv___DESC("hbv___DESC"),
    hcv___ASC("hcv___ASC"),
    hcv___DESC("hcv___DESC"),
    hdv___ASC("hdv___ASC"),
    hdv___DESC("hdv___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC");

    private final String graphqlName;

    private CliMetodica_genoma_HCV_HBVSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
