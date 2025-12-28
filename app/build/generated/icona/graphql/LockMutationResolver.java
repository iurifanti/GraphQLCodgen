package icona.graphql;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface LockMutationResolver {

    CliLockStatusResultDTO lock(@javax.validation.constraints.NotNull java.util.List<CliEntityIDDTO> locks, Integer minutes) throws Exception;

}
