package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliSierologie_covidSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    cc_id___ASC("cc_id___ASC"),
    cc_id___DESC("cc_id___DESC"),
    data_cc___ASC("data_cc___ASC"),
    data_cc___DESC("data_cc___DESC"),
    data_prelievo___ASC("data_prelievo___ASC"),
    data_prelievo___DESC("data_prelievo___DESC"),
    esito___ASC("esito___ASC"),
    esito___DESC("esito___DESC"),
    metodica___ASC("metodica___ASC"),
    metodica___DESC("metodica___DESC"),
    solo_esito___ASC("solo_esito___ASC"),
    solo_esito___DESC("solo_esito___DESC"),
    tempo___ASC("tempo___ASC"),
    tempo___DESC("tempo___DESC"),
    tipo_sierologia___ASC("tipo_sierologia___ASC"),
    tipo_sierologia___DESC("tipo_sierologia___DESC"),
    valore___ASC("valore___ASC"),
    valore___DESC("valore___DESC"),
    vax_ico___ASC("vax_ico___ASC"),
    vax_ico___DESC("vax_ico___DESC");

    private final String graphqlName;

    private CliSierologie_covidSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
