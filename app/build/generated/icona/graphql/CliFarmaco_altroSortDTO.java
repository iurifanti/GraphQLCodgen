package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliFarmaco_altroSortDTO {

    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    anche_da_solo___ASC("anche_da_solo___ASC"),
    anche_da_solo___DESC("anche_da_solo___DESC"),
    codice_DAD___ASC("codice_DAD___ASC"),
    codice_DAD___DESC("codice_DAD___DESC"),
    combinazioni_accettate___ASC("combinazioni_accettate___ASC"),
    combinazioni_accettate___DESC("combinazioni_accettate___DESC"),
    gruppo___ASC("gruppo___ASC"),
    gruppo___DESC("gruppo___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    nome_gruppo___ASC("nome_gruppo___ASC"),
    nome_gruppo___DESC("nome_gruppo___DESC"),
    nome_tipo___ASC("nome_tipo___ASC"),
    nome_tipo___DESC("nome_tipo___DESC"),
    sottogruppo___ASC("sottogruppo___ASC"),
    sottogruppo___DESC("sottogruppo___DESC"),
    tag___ASC("tag___ASC"),
    tag___DESC("tag___DESC"),
    tipo___ASC("tipo___ASC"),
    tipo___DESC("tipo___DESC"),
    vaccino_covid___ASC("vaccino_covid___ASC"),
    vaccino_covid___DESC("vaccino_covid___DESC"),
    vaccino_non_covid___ASC("vaccino_non_covid___ASC"),
    vaccino_non_covid___DESC("vaccino_non_covid___DESC");

    private final String graphqlName;

    private CliFarmaco_altroSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
