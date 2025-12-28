package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field componente___associables in type Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVComponente___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliComponentePageOptionsDTO options;

    public Farmaco_ARVComponente___associablesParametrizedInput() {
    }


    public Farmaco_ARVComponente___associablesParametrizedInput options(CliComponentePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ARVComponente___associablesParametrizedInput deepCopy() {
        Farmaco_ARVComponente___associablesParametrizedInput parametrizedInput = new Farmaco_ARVComponente___associablesParametrizedInput();
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
