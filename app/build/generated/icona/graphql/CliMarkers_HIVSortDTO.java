package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliMarkers_HIVSortDTO {

    FPR___ASC("FPR___ASC"),
    FPR___DESC("FPR___DESC"),
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
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    geno2pheno___ASC("geno2pheno___ASC"),
    geno2pheno___DESC("geno2pheno___DESC"),
    hivrna___ASC("hivrna___ASC"),
    hivrna___DESC("hivrna___DESC"),
    hivrna_segno___ASC("hivrna_segno___ASC"),
    hivrna_segno___DESC("hivrna_segno___DESC"),
    lower_limit___ASC("lower_limit___ASC"),
    lower_limit___DESC("lower_limit___DESC"),
    metodica___ASC("metodica___ASC"),
    metodica___DESC("metodica___DESC"),
    nr_CD4___ASC("nr_CD4___ASC"),
    nr_CD4___DESC("nr_CD4___DESC"),
    nr_CD8___ASC("nr_CD8___ASC"),
    nr_CD8___DESC("nr_CD8___DESC"),
    nr_linfociti___ASC("nr_linfociti___ASC"),
    nr_linfociti___DESC("nr_linfociti___DESC"),
    paziente___ASC("paziente___ASC"),
    paziente___DESC("paziente___DESC"),
    perc_CD4___ASC("perc_CD4___ASC"),
    perc_CD4___DESC("perc_CD4___DESC"),
    perc_CD8___ASC("perc_CD8___ASC"),
    perc_CD8___DESC("perc_CD8___DESC"),
    tropismo___ASC("tropismo___ASC"),
    tropismo___DESC("tropismo___DESC");

    private final String graphqlName;

    private CliMarkers_HIVSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
