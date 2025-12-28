package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliFarmaco_ARVSortDTO {

    _createdby___ASC("_createdby___ASC"),
    _createdby___DESC("_createdby___DESC"),
    _createdon___ASC("_createdon___ASC"),
    _createdon___DESC("_createdon___DESC"),
    _id___ASC("_id___ASC"),
    _id___DESC("_id___DESC"),
    _lastmodifiedby___ASC("_lastmodifiedby___ASC"),
    _lastmodifiedby___DESC("_lastmodifiedby___DESC"),
    _lastmodifiedon___ASC("_lastmodifiedon___ASC"),
    _lastmodifiedon___DESC("_lastmodifiedon___DESC"),
    _ownedby___ASC("_ownedby___ASC"),
    _ownedby___DESC("_ownedby___DESC"),
    _ownedon___ASC("_ownedon___ASC"),
    _ownedon___DESC("_ownedon___DESC"),
    anno_generico___ASC("anno_generico___ASC"),
    anno_generico___DESC("anno_generico___DESC"),
    codice_DAD___ASC("codice_DAD___ASC"),
    codice_DAD___DESC("codice_DAD___DESC"),
    componenti___ASC("componenti___ASC"),
    componenti___DESC("componenti___DESC"),
    generico___ASC("generico___ASC"),
    generico___DESC("generico___DESC"),
    gruppo___ASC("gruppo___ASC"),
    gruppo___DESC("gruppo___DESC"),
    long_acting___ASC("long_acting___ASC"),
    long_acting___DESC("long_acting___DESC"),
    nome___ASC("nome___ASC"),
    nome___DESC("nome___DESC"),
    nome_gruppo___ASC("nome_gruppo___ASC"),
    nome_gruppo___DESC("nome_gruppo___DESC"),
    nome_tipo___ASC("nome_tipo___ASC"),
    nome_tipo___DESC("nome_tipo___DESC"),
    obsoleto___ASC("obsoleto___ASC"),
    obsoleto___DESC("obsoleto___DESC"),
    posologia___ASC("posologia___ASC"),
    posologia___DESC("posologia___DESC"),
    prep___ASC("prep___ASC"),
    prep___DESC("prep___DESC"),
    sottogruppo___ASC("sottogruppo___ASC"),
    sottogruppo___DESC("sottogruppo___DESC"),
    tipo___ASC("tipo___ASC"),
    tipo___DESC("tipo___DESC");

    private final String graphqlName;

    private CliFarmaco_ARVSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
