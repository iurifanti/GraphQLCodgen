package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public class LockMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "lock";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();

    public LockMutationRequest() {
    }

    public LockMutationRequest(String alias) {
        this.alias = alias;
    }

    public void setLocks(java.util.List<CliEntityIDDTO> locks) {
        this.input.put("locks", locks);
    }

    public void setMinutes(Integer minutes) {
        this.input.put("minutes", minutes);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static LockMutationRequest.Builder builder() {
        return new LockMutationRequest.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:45+0100"
    )
    public static class Builder {

        private String $alias;
        private java.util.List<CliEntityIDDTO> locks;
        private Integer minutes = 10;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setLocks(java.util.List<CliEntityIDDTO> locks) {
            this.locks = locks;
            return this;
        }

        public Builder setMinutes(Integer minutes) {
            this.minutes = minutes;
            return this;
        }


        public LockMutationRequest build() {
            LockMutationRequest obj = new LockMutationRequest($alias);
            obj.setLocks(locks);
            obj.setMinutes(minutes);
            return obj;
        }

    }
}
