package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliCentroSortDTO {

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
    addetto___ASC("addetto___ASC"),
    addetto___DESC("addetto___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    email_pro___ASC("email_pro___ASC"),
    email_pro___DESC("email_pro___DESC"),
    gestione_scelta___ASC("gestione_scelta___ASC"),
    gestione_scelta___DESC("gestione_scelta___DESC"),
    in_elenco___ASC("in_elenco___ASC"),
    in_elenco___DESC("in_elenco___DESC"),
    indirizzo___ASC("indirizzo___ASC"),
    indirizzo___DESC("indirizzo___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    primario___ASC("primario___ASC"),
    primario___DESC("primario___DESC"),
    telefono___ASC("telefono___ASC"),
    telefono___DESC("telefono___DESC"),
    trasferimento_a_centro___ASC("trasferimento_a_centro___ASC"),
    trasferimento_a_centro___DESC("trasferimento_a_centro___DESC"),
    trasferimento_da_centro___ASC("trasferimento_da_centro___ASC"),
    trasferimento_da_centro___DESC("trasferimento_da_centro___DESC"),
    vax___ASC("vax___ASC"),
    vax___DESC("vax___DESC");

    private final String graphqlName;

    private CliCentroSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
