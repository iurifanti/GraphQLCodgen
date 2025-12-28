package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliGravidanzaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    allattamento_seno1___ASC("allattamento_seno1___ASC"),
    allattamento_seno1___DESC("allattamento_seno1___DESC"),
    allattamento_seno2___ASC("allattamento_seno2___ASC"),
    allattamento_seno2___DESC("allattamento_seno2___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    data_esito___ASC("data_esito___ASC"),
    data_esito___DESC("data_esito___DESC"),
    eta_gestazionale___ASC("eta_gestazionale___ASC"),
    eta_gestazionale___DESC("eta_gestazionale___DESC"),
    neonati___ASC("neonati___ASC"),
    neonati___DESC("neonati___DESC"),
    note___ASC("note___ASC"),
    note___DESC("note___DESC"),
    padre_hiv___ASC("padre_hiv___ASC"),
    padre_hiv___DESC("padre_hiv___DESC"),
    peso1___ASC("peso1___ASC"),
    peso1___DESC("peso1___DESC"),
    peso2___ASC("peso2___ASC"),
    peso2___DESC("peso2___DESC"),
    probelma_ostetrico_specificare___ASC("probelma_ostetrico_specificare___ASC"),
    probelma_ostetrico_specificare___DESC("probelma_ostetrico_specificare___DESC"),
    problema_ostetrico_nome___ASC("problema_ostetrico_nome___ASC"),
    problema_ostetrico_nome___DESC("problema_ostetrico_nome___DESC"),
    sesso1___ASC("sesso1___ASC"),
    sesso1___DESC("sesso1___DESC"),
    sesso2___ASC("sesso2___ASC"),
    sesso2___DESC("sesso2___DESC"),
    ultima_mestruazione___ASC("ultima_mestruazione___ASC"),
    ultima_mestruazione___DESC("ultima_mestruazione___DESC");

    private final String graphqlName;

    private CliGravidanzaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
