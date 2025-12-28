package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliPatologiaSortDTO {

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
    cdc___ASC("cdc___ASC"),
    cdc___DESC("cdc___DESC"),
    codice_dad___ASC("codice_dad___ASC"),
    codice_dad___DESC("codice_dad___DESC"),
    codice_hicdep___ASC("codice_hicdep___ASC"),
    codice_hicdep___DESC("codice_hicdep___DESC"),
    comorbidita_covid___ASC("comorbidita_covid___ASC"),
    comorbidita_covid___DESC("comorbidita_covid___DESC"),
    comorbidita_vax___ASC("comorbidita_vax___ASC"),
    comorbidita_vax___DESC("comorbidita_vax___DESC"),
    descrizione___ASC("descrizione___ASC"),
    descrizione___DESC("descrizione___DESC"),
    documentazione___ASC("documentazione___ASC"),
    documentazione___DESC("documentazione___DESC"),
    evento_covid___ASC("evento_covid___ASC"),
    evento_covid___DESC("evento_covid___DESC"),
    evento_vaccino_covid___ASC("evento_vaccino_covid___ASC"),
    evento_vaccino_covid___DESC("evento_vaccino_covid___DESC"),
    gruppo___ASC("gruppo___ASC"),
    gruppo___DESC("gruppo___DESC"),
    label_epatiche___ASC("label_epatiche___ASC"),
    label_epatiche___DESC("label_epatiche___DESC"),
    mostra_specifica_tumori___ASC("mostra_specifica_tumori___ASC"),
    mostra_specifica_tumori___DESC("mostra_specifica_tumori___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    nome_gruppo___ASC("nome_gruppo___ASC"),
    nome_gruppo___DESC("nome_gruppo___DESC"),
    nome_tipo___ASC("nome_tipo___ASC"),
    nome_tipo___DESC("nome_tipo___DESC"),
    pride___ASC("pride___ASC"),
    pride___DESC("pride___DESC"),
    ricovero___ASC("ricovero___ASC"),
    ricovero___DESC("ricovero___DESC"),
    solo_F___ASC("solo_F___ASC"),
    solo_F___DESC("solo_F___DESC"),
    solo_M___ASC("solo_M___ASC"),
    solo_M___DESC("solo_M___DESC"),
    sottogruppo___ASC("sottogruppo___ASC"),
    sottogruppo___DESC("sottogruppo___DESC"),
    tipo___ASC("tipo___ASC"),
    tipo___DESC("tipo___DESC"),
    visibile___ASC("visibile___ASC"),
    visibile___DESC("visibile___DESC"),
    warning_respond___ASC("warning_respond___ASC"),
    warning_respond___DESC("warning_respond___DESC");

    private final String graphqlName;

    private CliPatologiaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
