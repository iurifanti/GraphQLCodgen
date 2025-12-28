package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_altro_ in type Combinazioni_accettate_non_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_altroPageOptionsDTO options;

    public Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput() {
    }


    public Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput options(CliFarmaco_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput deepCopy() {
        Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput parametrizedInput = new Combinazioni_accettate_non_ARVFarmaco_altro_ParametrizedInput();
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
