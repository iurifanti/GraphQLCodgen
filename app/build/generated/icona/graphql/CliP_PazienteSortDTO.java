package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliP_PazienteSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    altezza___ASC("altezza___ASC"),
    altezza___DESC("altezza___DESC"),
    codice_centro___ASC("codice_centro___ASC"),
    codice_centro___DESC("codice_centro___DESC"),
    codice_interno___ASC("codice_interno___ASC"),
    codice_interno___DESC("codice_interno___DESC"),
    importato___ASC("importato___ASC"),
    importato___DESC("importato___DESC"),
    password_pro___ASC("password_pro___ASC"),
    password_pro___DESC("password_pro___DESC"),
    sessione_pro___ASC("sessione_pro___ASC"),
    sessione_pro___DESC("sessione_pro___DESC"),
    studi_pro_abilitati___ASC("studi_pro_abilitati___ASC"),
    studi_pro_abilitati___DESC("studi_pro_abilitati___DESC"),
    token_notifiche_pro___ASC("token_notifiche_pro___ASC"),
    token_notifiche_pro___DESC("token_notifiche_pro___DESC"),
    username_pro___ASC("username_pro___ASC"),
    username_pro___DESC("username_pro___DESC");

    private final String graphqlName;

    private CliP_PazienteSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
