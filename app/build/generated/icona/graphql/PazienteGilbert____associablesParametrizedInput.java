package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field gilbert____associables in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteGilbert____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliGilbertPageOptionsDTO options;

    public PazienteGilbert____associablesParametrizedInput() {
    }


    public PazienteGilbert____associablesParametrizedInput options(CliGilbertPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteGilbert____associablesParametrizedInput deepCopy() {
        PazienteGilbert____associablesParametrizedInput parametrizedInput = new PazienteGilbert____associablesParametrizedInput();
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
