package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliMutazioneSortDTO {

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
    aa1___ASC("aa1___ASC"),
    aa1___DESC("aa1___DESC"),
    aa2___ASC("aa2___ASC"),
    aa2___DESC("aa2___DESC"),
    aa3___ASC("aa3___ASC"),
    aa3___DESC("aa3___DESC"),
    aa4___ASC("aa4___ASC"),
    aa4___DESC("aa4___DESC"),
    aa5___ASC("aa5___ASC"),
    aa5___DESC("aa5___DESC"),
    deletion___ASC("deletion___ASC"),
    deletion___DESC("deletion___DESC"),
    insert___ASC("insert___ASC"),
    insert___DESC("insert___DESC"),
    no_farmaco___ASC("no_farmaco___ASC"),
    no_farmaco___DESC("no_farmaco___DESC"),
    object_title___ASC("object_title___ASC"),
    object_title___DESC("object_title___DESC"),
    posizione___ASC("posizione___ASC"),
    posizione___DESC("posizione___DESC"),
    regione_genoma___ASC("regione_genoma___ASC"),
    regione_genoma___DESC("regione_genoma___DESC"),
    shift___ASC("shift___ASC"),
    shift___DESC("shift___DESC"),
    temp_id___ASC("temp_id___ASC"),
    temp_id___DESC("temp_id___DESC");

    private final String graphqlName;

    private CliMutazioneSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
