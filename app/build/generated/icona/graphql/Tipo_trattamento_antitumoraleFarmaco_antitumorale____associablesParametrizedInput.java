package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_antitumorale____associables in type Tipo_trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_antitumoralePageOptionsDTO options;

    public Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput() {
    }


    public Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput options(CliFarmaco_antitumoralePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput deepCopy() {
        Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput parametrizedInput = new Tipo_trattamento_antitumoraleFarmaco_antitumorale____associablesParametrizedInput();
        parametrizedInput.options(this.options);
        return parametrizedInput;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (options != null) {
            joiner.add("options: " + GraphQLRequestSerializer.getEntry(options));
        }
        return joiner.toString();
    }

}
