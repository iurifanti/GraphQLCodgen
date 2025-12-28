package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field componente in type Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVComponenteParametrizedInput implements GraphQLParametrizedInput {

    private CliComponentePageOptionsDTO options;

    public Farmaco_ARVComponenteParametrizedInput() {
    }


    public Farmaco_ARVComponenteParametrizedInput options(CliComponentePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ARVComponenteParametrizedInput deepCopy() {
        Farmaco_ARVComponenteParametrizedInput parametrizedInput = new Farmaco_ARVComponenteParametrizedInput();
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
