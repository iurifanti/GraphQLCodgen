package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field combinazioni_accettate_non_ARV____associables in type Farmaco_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCombinazioni_accettate_non_ARVPageOptionsDTO options;

    public Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput() {
    }


    public Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput options(CliCombinazioni_accettate_non_ARVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput deepCopy() {
        Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput parametrizedInput = new Farmaco_altroCombinazioni_accettate_non_ARV____associablesParametrizedInput();
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
