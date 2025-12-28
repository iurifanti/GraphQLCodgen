package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliL_dettaglioSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altezza___ASC("altezza___ASC"),
    altezza___DESC("altezza___DESC"),
    chimica___ASC("chimica___ASC"),
    chimica___DESC("chimica___DESC"),
    data___ASC("data___ASC"),
    data___DESC("data___DESC"),
    eventi_clinici___ASC("eventi_clinici___ASC"),
    eventi_clinici___DESC("eventi_clinici___DESC"),
    flag_altezza___ASC("flag_altezza___ASC"),
    flag_altezza___DESC("flag_altezza___DESC"),
    flag_chimica___ASC("flag_chimica___ASC"),
    flag_chimica___DESC("flag_chimica___DESC"),
    flag_eventi_clinici___ASC("flag_eventi_clinici___ASC"),
    flag_eventi_clinici___DESC("flag_eventi_clinici___DESC"),
    flag_peso___ASC("flag_peso___ASC"),
    flag_peso___DESC("flag_peso___DESC"),
    flag_plasma_raccolto___ASC("flag_plasma_raccolto___ASC"),
    flag_plasma_raccolto___DESC("flag_plasma_raccolto___DESC"),
    flag_presentato___ASC("flag_presentato___ASC"),
    flag_presentato___DESC("flag_presentato___DESC"),
    flag_questionari___ASC("flag_questionari___ASC"),
    flag_questionari___DESC("flag_questionari___DESC"),
    flag_sangue_intero_raccolto___ASC("flag_sangue_intero_raccolto___ASC"),
    flag_sangue_intero_raccolto___DESC("flag_sangue_intero_raccolto___DESC"),
    flag_viro_immun___ASC("flag_viro_immun___ASC"),
    flag_viro_immun___DESC("flag_viro_immun___DESC"),
    mese___ASC("mese___ASC"),
    mese___DESC("mese___DESC"),
    peso___ASC("peso___ASC"),
    peso___DESC("peso___DESC"),
    plasma_raccolto___ASC("plasma_raccolto___ASC"),
    plasma_raccolto___DESC("plasma_raccolto___DESC"),
    presentato___ASC("presentato___ASC"),
    presentato___DESC("presentato___DESC"),
    questionari___ASC("questionari___ASC"),
    questionari___DESC("questionari___DESC"),
    sangue_intero_raccolto___ASC("sangue_intero_raccolto___ASC"),
    sangue_intero_raccolto___DESC("sangue_intero_raccolto___DESC"),
    tempo_visita___ASC("tempo_visita___ASC"),
    tempo_visita___DESC("tempo_visita___DESC"),
    viro_immun___ASC("viro_immun___ASC"),
    viro_immun___DESC("viro_immun___DESC");

    private final String graphqlName;

    private CliL_dettaglioSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
