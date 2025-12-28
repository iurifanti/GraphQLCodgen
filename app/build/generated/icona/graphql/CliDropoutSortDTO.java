package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliDropoutSortDTO {

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
    altro_causa_decesso___ASC("altro_causa_decesso___ASC"),
    altro_causa_decesso___DESC("altro_causa_decesso___DESC"),
    altro_motivo_drop___ASC("altro_motivo_drop___ASC"),
    altro_motivo_drop___DESC("altro_motivo_drop___DESC"),
    altro_sede_decesso___ASC("altro_sede_decesso___ASC"),
    altro_sede_decesso___DESC("altro_sede_decesso___DESC"),
    autopsia___ASC("autopsia___ASC"),
    autopsia___DESC("autopsia___DESC"),
    causa_decesso_nome1___ASC("causa_decesso_nome1___ASC"),
    causa_decesso_nome1___DESC("causa_decesso_nome1___DESC"),
    causa_decesso_nome2___ASC("causa_decesso_nome2___ASC"),
    causa_decesso_nome2___DESC("causa_decesso_nome2___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    data_decesso___ASC("data_decesso___ASC"),
    data_decesso___DESC("data_decesso___DESC"),
    data_status_vita___ASC("data_status_vita___ASC"),
    data_status_vita___DESC("data_status_vita___DESC"),
    deceduto___ASC("deceduto___ASC"),
    deceduto___DESC("deceduto___DESC"),
    luogo_decesso___ASC("luogo_decesso___ASC"),
    luogo_decesso___DESC("luogo_decesso___DESC"),
    motivo_decesso___ASC("motivo_decesso___ASC"),
    motivo_decesso___DESC("motivo_decesso___DESC"),
    motivo_dropout___ASC("motivo_dropout___ASC"),
    motivo_dropout___DESC("motivo_dropout___DESC"),
    paziente___ASC("paziente___ASC"),
    paziente___DESC("paziente___DESC"),
    status_vita___ASC("status_vita___ASC"),
    status_vita___DESC("status_vita___DESC"),
    ultima_visita_ok___ASC("ultima_visita_ok___ASC"),
    ultima_visita_ok___DESC("ultima_visita_ok___DESC"),
    undropped___ASC("undropped___ASC"),
    undropped___DESC("undropped___DESC");

    private final String graphqlName;

    private CliDropoutSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
