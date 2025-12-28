package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliRisposta_possibileSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    conc___ASC("conc___ASC"),
    conc___DESC("conc___DESC"),
    domande_associate___ASC("domande_associate___ASC"),
    domande_associate___DESC("domande_associate___DESC"),
    domande_associate_ids___ASC("domande_associate_ids___ASC"),
    domande_associate_ids___DESC("domande_associate_ids___DESC"),
    ordine___ASC("ordine___ASC"),
    ordine___DESC("ordine___DESC"),
    punteggio___ASC("punteggio___ASC"),
    punteggio___DESC("punteggio___DESC"),
    risposte_associate___ASC("risposte_associate___ASC"),
    risposte_associate___DESC("risposte_associate___DESC"),
    risposte_associate_ids___ASC("risposte_associate_ids___ASC"),
    risposte_associate_ids___DESC("risposte_associate_ids___DESC"),
    testo___ASC("testo___ASC"),
    testo___DESC("testo___DESC");

    private final String graphqlName;

    private CliRisposta_possibileSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
