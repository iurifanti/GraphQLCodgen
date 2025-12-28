package icona.graphql;

/**
 * Specify if an ordering should be applied ascending or descending.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliFeedbackSortDTO {

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
    feedback___ASC("feedback___ASC"),
    feedback___DESC("feedback___DESC"),
    sezione___ASC("sezione___ASC"),
    sezione___DESC("sezione___DESC"),
    stato___ASC("stato___ASC"),
    stato___DESC("stato___DESC");

    private final String graphqlName;

    private CliFeedbackSortDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
