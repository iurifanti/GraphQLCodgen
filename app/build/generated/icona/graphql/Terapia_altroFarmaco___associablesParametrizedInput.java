package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco___associables in type Terapia_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_altroFarmaco___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_altroPageOptionsDTO options;

    public Terapia_altroFarmaco___associablesParametrizedInput() {
    }


    public Terapia_altroFarmaco___associablesParametrizedInput options(CliFarmaco_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_altroFarmaco___associablesParametrizedInput deepCopy() {
        Terapia_altroFarmaco___associablesParametrizedInput parametrizedInput = new Terapia_altroFarmaco___associablesParametrizedInput();
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
