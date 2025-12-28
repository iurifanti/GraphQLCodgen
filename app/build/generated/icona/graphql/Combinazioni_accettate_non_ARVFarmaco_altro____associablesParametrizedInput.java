package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_altro____associables in type Combinazioni_accettate_non_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_altroPageOptionsDTO options;

    public Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput() {
    }


    public Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput options(CliFarmaco_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput deepCopy() {
        Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput parametrizedInput = new Combinazioni_accettate_non_ARVFarmaco_altro____associablesParametrizedInput();
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
