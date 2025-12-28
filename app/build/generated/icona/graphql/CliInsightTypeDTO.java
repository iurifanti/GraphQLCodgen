package icona.graphql;

/**
 * The InsightType enum type is used to enable insight of the process of data retrieval.
This is useful for example to get the execution time of the query resolved by the server.
Use only in debug to identify possible bottlenecks.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public enum CliInsightTypeDTO {

    /**
     * Enable a light insight, that doesn't add a big overhead on performances
but its information can be incomplete.
The returned information include the number of queries, their configuration,
and the times needed to perform them.
     */
    LIGHT("LIGHT"),
    /**
     * Enable a full insight, that returns all the information about the executed queries.
Can add a significant overhead due to the quantity of data retrieved.
Include all the information of LIGHT, alongside the SQL queries
actually executed and their EXPLAIN.
     */
    FULL("FULL");

    private final String graphqlName;

    private CliInsightTypeDTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
