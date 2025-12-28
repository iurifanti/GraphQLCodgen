package icona.graphql;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliMessageTypeDTO {

    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR");

    private final String graphqlName;

    private CliMessageTypeDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
