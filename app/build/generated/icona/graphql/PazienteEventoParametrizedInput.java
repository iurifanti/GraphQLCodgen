package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field evento in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteEventoParametrizedInput implements GraphQLParametrizedInput {

    private CliEventoPageOptionsDTO options;

    public PazienteEventoParametrizedInput() {
    }


    public PazienteEventoParametrizedInput options(CliEventoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteEventoParametrizedInput deepCopy() {
        PazienteEventoParametrizedInput parametrizedInput = new PazienteEventoParametrizedInput();
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
