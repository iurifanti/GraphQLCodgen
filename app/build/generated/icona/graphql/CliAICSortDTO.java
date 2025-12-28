package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliAICSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    azienda___ASC("azienda___ASC"),
    azienda___DESC("azienda___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    confezione___ASC("confezione___ASC"),
    confezione___DESC("confezione___DESC"),
    data_fine_commercio___ASC("data_fine_commercio___ASC"),
    data_fine_commercio___DESC("data_fine_commercio___DESC"),
    data_fine_validita_aic___ASC("data_fine_validita_aic___ASC"),
    data_fine_validita_aic___DESC("data_fine_validita_aic___DESC"),
    data_inizio_commercio___ASC("data_inizio_commercio___ASC"),
    data_inizio_commercio___DESC("data_inizio_commercio___DESC"),
    data_inizio_validita_aic___ASC("data_inizio_validita_aic___ASC"),
    data_inizio_validita_aic___DESC("data_inizio_validita_aic___DESC"),
    marchio___ASC("marchio___ASC"),
    marchio___DESC("marchio___DESC"),
    principio_attivo___ASC("principio_attivo___ASC"),
    principio_attivo___DESC("principio_attivo___DESC"),
    qta_principio_attivo___ASC("qta_principio_attivo___ASC"),
    qta_principio_attivo___DESC("qta_principio_attivo___DESC");

    private final String graphqlName;

    private CliAICSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
