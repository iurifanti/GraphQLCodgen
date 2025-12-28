package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliRispostaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    alert_obbligatoria___ASC("alert_obbligatoria___ASC"),
    alert_obbligatoria___DESC("alert_obbligatoria___DESC"),
    codice_interno_i___ASC("codice_interno_i___ASC"),
    codice_interno_i___DESC("codice_interno_i___DESC"),
    decimale___ASC("decimale___ASC"),
    decimale___DESC("decimale___DESC"),
    domanda___ASC("domanda___ASC"),
    domanda___DESC("domanda___DESC"),
    domanda_id___ASC("domanda_id___ASC"),
    domanda_id___DESC("domanda_id___DESC"),
    domande_questionario_ids___ASC("domande_questionario_ids___ASC"),
    domande_questionario_ids___DESC("domande_questionario_ids___DESC"),
    id_risposta_peso___ASC("id_risposta_peso___ASC"),
    id_risposta_peso___DESC("id_risposta_peso___DESC"),
    intero___ASC("intero___ASC"),
    intero___DESC("intero___DESC"),
    obbligatoria___ASC("obbligatoria___ASC"),
    obbligatoria___DESC("obbligatoria___DESC"),
    opzioni_multipla___ASC("opzioni_multipla___ASC"),
    opzioni_multipla___DESC("opzioni_multipla___DESC"),
    opzioni_singola___ASC("opzioni_singola___ASC"),
    opzioni_singola___DESC("opzioni_singola___DESC"),
    ordine___ASC("ordine___ASC"),
    ordine___DESC("ordine___DESC"),
    ordine_risposta___ASC("ordine_risposta___ASC"),
    ordine_risposta___DESC("ordine_risposta___DESC"),
    peso_punteggio___ASC("peso_punteggio___ASC"),
    peso_punteggio___DESC("peso_punteggio___DESC"),
    punteggio_risposta___ASC("punteggio_risposta___ASC"),
    punteggio_risposta___DESC("punteggio_risposta___DESC"),
    punteggio_totale___ASC("punteggio_totale___ASC"),
    punteggio_totale___DESC("punteggio_totale___DESC"),
    questionario_id___ASC("questionario_id___ASC"),
    questionario_id___DESC("questionario_id___DESC"),
    questionario_pro_app_id___ASC("questionario_pro_app_id___ASC"),
    questionario_pro_app_id___DESC("questionario_pro_app_id___DESC"),
    risposta___ASC("risposta___ASC"),
    risposta___DESC("risposta___DESC"),
    risposta_dec___ASC("risposta_dec___ASC"),
    risposta_dec___DESC("risposta_dec___DESC"),
    risposta_int___ASC("risposta_int___ASC"),
    risposta_int___DESC("risposta_int___DESC"),
    risposta_multipla___ASC("risposta_multipla___ASC"),
    risposta_multipla___DESC("risposta_multipla___DESC"),
    risposta_str___ASC("risposta_str___ASC"),
    risposta_str___DESC("risposta_str___DESC"),
    scala_intera___ASC("scala_intera___ASC"),
    scala_intera___DESC("scala_intera___DESC"),
    solo_intro___ASC("solo_intro___ASC"),
    solo_intro___DESC("solo_intro___DESC"),
    stringa___ASC("stringa___ASC"),
    stringa___DESC("stringa___DESC"),
    studio_questionario_id___ASC("studio_questionario_id___ASC"),
    studio_questionario_id___DESC("studio_questionario_id___DESC");

    private final String graphqlName;

    private CliRispostaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
