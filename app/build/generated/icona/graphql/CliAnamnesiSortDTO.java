package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliAnamnesiSortDTO {

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
    altro_luogo___ASC("altro_luogo___ASC"),
    altro_luogo___DESC("altro_luogo___DESC"),
    altro_luogo_test_HIV___ASC("altro_luogo_test_HIV___ASC"),
    altro_luogo_test_HIV___DESC("altro_luogo_test_HIV___DESC"),
    anni_fumo_pregresso___ASC("anni_fumo_pregresso___ASC"),
    anni_fumo_pregresso___DESC("anni_fumo_pregresso___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    data_enrol___ASC("data_enrol___ASC"),
    data_enrol___DESC("data_enrol___DESC"),
    data_prima_prep___ASC("data_prima_prep___ASC"),
    data_prima_prep___DESC("data_prima_prep___DESC"),
    data_primo_riscontro_HIV___ASC("data_primo_riscontro_HIV___ASC"),
    data_primo_riscontro_HIV___DESC("data_primo_riscontro_HIV___DESC"),
    data_sieroconversione___ASC("data_sieroconversione___ASC"),
    data_sieroconversione___DESC("data_sieroconversione___DESC"),
    data_ultima_prep___ASC("data_ultima_prep___ASC"),
    data_ultima_prep___DESC("data_ultima_prep___DESC"),
    data_ultimo_test_negativo___ASC("data_ultimo_test_negativo___ASC"),
    data_ultimo_test_negativo___DESC("data_ultimo_test_negativo___DESC"),
    familiarita_cardiovascolare___ASC("familiarita_cardiovascolare___ASC"),
    familiarita_cardiovascolare___DESC("familiarita_cardiovascolare___DESC"),
    fumatore___ASC("fumatore___ASC"),
    fumatore___DESC("fumatore___DESC"),
    infezione_acuta___ASC("infezione_acuta___ASC"),
    infezione_acuta___DESC("infezione_acuta___DESC"),
    paziente___ASC("paziente___ASC"),
    paziente___DESC("paziente___DESC"),
    prep___ASC("prep___ASC"),
    prep___DESC("prep___DESC"),
    prep_quotidiana___ASC("prep_quotidiana___ASC"),
    prep_quotidiana___DESC("prep_quotidiana___DESC"),
    scolarita___ASC("scolarita___ASC"),
    scolarita___DESC("scolarita___DESC"),
    team___ASC("team___ASC"),
    team___DESC("team___DESC");

    private final String graphqlName;

    private CliAnamnesiSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
