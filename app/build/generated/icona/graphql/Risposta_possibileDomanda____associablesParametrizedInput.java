package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field domanda____associables in type Risposta_possibile
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Risposta_possibileDomanda____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliDomandaPageOptionsDTO options;

    public Risposta_possibileDomanda____associablesParametrizedInput() {
    }


    public Risposta_possibileDomanda____associablesParametrizedInput options(CliDomandaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Risposta_possibileDomanda____associablesParametrizedInput deepCopy() {
        Risposta_possibileDomanda____associablesParametrizedInput parametrizedInput = new Risposta_possibileDomanda____associablesParametrizedInput();
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
