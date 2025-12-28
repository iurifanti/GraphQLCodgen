package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliDose_mpvSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    ciclo___ASC("ciclo___ASC"),
    ciclo___DESC("ciclo___DESC"),
    modalita_somministrazione___ASC("modalita_somministrazione___ASC"),
    modalita_somministrazione___DESC("modalita_somministrazione___DESC"),
    numero_dose___ASC("numero_dose___ASC"),
    numero_dose___DESC("numero_dose___DESC");

    private final String graphqlName;

    private CliDose_mpvSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
