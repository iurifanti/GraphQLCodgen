package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliChecksSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    check_id___ASC("check_id___ASC"),
    check_id___DESC("check_id___DESC"),
    codice_centro_h___ASC("codice_centro_h___ASC"),
    codice_centro_h___DESC("codice_centro_h___DESC"),
    codice_centro_i___ASC("codice_centro_i___ASC"),
    codice_centro_i___DESC("codice_centro_i___DESC"),
    codice_hepa___ASC("codice_hepa___ASC"),
    codice_hepa___DESC("codice_hepa___DESC"),
    codice_ico___ASC("codice_ico___ASC"),
    codice_ico___DESC("codice_ico___DESC"),
    descrizione___ASC("descrizione___ASC"),
    descrizione___DESC("descrizione___DESC"),
    note___ASC("note___ASC"),
    note___DESC("note___DESC"),
    risolto___ASC("risolto___ASC"),
    risolto___DESC("risolto___DESC"),
    specifiche___ASC("specifiche___ASC"),
    specifiche___DESC("specifiche___DESC");

    private final String graphqlName;

    private CliChecksSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
