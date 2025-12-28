package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliDomandaSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    condizioni_abilitazione_associate___ASC("condizioni_abilitazione_associate___ASC"),
    condizioni_abilitazione_associate___DESC("condizioni_abilitazione_associate___DESC"),
    ordine___ASC("ordine___ASC"),
    ordine___DESC("ordine___DESC"),
    parametri_personali___ASC("parametri_personali___ASC"),
    parametri_personali___DESC("parametri_personali___DESC"),
    peso___ASC("peso___ASC"),
    peso___DESC("peso___DESC"),
    testo___ASC("testo___ASC"),
    testo___DESC("testo___DESC");

    private final String graphqlName;

    private CliDomandaSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
