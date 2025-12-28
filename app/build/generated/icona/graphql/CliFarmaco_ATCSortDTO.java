package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliFarmaco_ATCSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    antitumorale___ASC("antitumorale___ASC"),
    antitumorale___DESC("antitumorale___DESC"),
    codice___ASC("codice___ASC"),
    codice___DESC("codice___DESC"),
    ddd___ASC("ddd___ASC"),
    ddd___DESC("ddd___DESC"),
    ddd_kind___ASC("ddd_kind___ASC"),
    ddd_kind___DESC("ddd_kind___DESC"),
    ddd_note___ASC("ddd_note___ASC"),
    ddd_note___DESC("ddd_note___DESC"),
    ddd_um___ASC("ddd_um___ASC"),
    ddd_um___DESC("ddd_um___DESC"),
    epatico___ASC("epatico___ASC"),
    epatico___DESC("epatico___DESC"),
    hiv___ASC("hiv___ASC"),
    hiv___DESC("hiv___DESC"),
    livello___ASC("livello___ASC"),
    livello___DESC("livello___DESC"),
    long_acting___ASC("long_acting___ASC"),
    long_acting___DESC("long_acting___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    non_arv___ASC("non_arv___ASC"),
    non_arv___DESC("non_arv___DESC"),
    prep___ASC("prep___ASC"),
    prep___DESC("prep___DESC"),
    titolo___ASC("titolo___ASC"),
    titolo___DESC("titolo___DESC");

    private final String graphqlName;

    private CliFarmaco_ATCSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
