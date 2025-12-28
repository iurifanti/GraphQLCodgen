package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field peso_domanda___associables in type Domanda
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DomandaPeso_domanda___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliDomandaPageOptionsDTO options;

    public DomandaPeso_domanda___associablesParametrizedInput() {
    }


    public DomandaPeso_domanda___associablesParametrizedInput options(CliDomandaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public DomandaPeso_domanda___associablesParametrizedInput deepCopy() {
        DomandaPeso_domanda___associablesParametrizedInput parametrizedInput = new DomandaPeso_domanda___associablesParametrizedInput();
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
