package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliMarkers_HDVSortDTO {

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
    altra_metodica___ASC("altra_metodica___ASC"),
    altra_metodica___DESC("altra_metodica___DESC"),
    altra_unita_di_misura___ASC("altra_unita_di_misura___ASC"),
    altra_unita_di_misura___DESC("altra_unita_di_misura___DESC"),
    altro_genotipo___ASC("altro_genotipo___ASC"),
    altro_genotipo___DESC("altro_genotipo___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    esito___ASC("esito___ASC"),
    esito___DESC("esito___DESC"),
    genotipo_hdv___ASC("genotipo_hdv___ASC"),
    genotipo_hdv___DESC("genotipo_hdv___DESC"),
    lower_limit___ASC("lower_limit___ASC"),
    lower_limit___DESC("lower_limit___DESC"),
    sottotipo___ASC("sottotipo___ASC"),
    sottotipo___DESC("sottotipo___DESC"),
    tipologia_test___ASC("tipologia_test___ASC"),
    tipologia_test___DESC("tipologia_test___DESC"),
    valore___ASC("valore___ASC"),
    valore___DESC("valore___DESC");

    private final String graphqlName;

    private CliMarkers_HDVSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
