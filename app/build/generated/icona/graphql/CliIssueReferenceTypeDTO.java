package icona.graphql;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliIssueReferenceTypeDTO {

    ENTITY("ENTITY"),
    ENTITY_ROLE("ENTITY_ROLE"),
    ENTITY_ATTRIBUTE("ENTITY_ATTRIBUTE");

    private final String graphqlName;

    private CliIssueReferenceTypeDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
