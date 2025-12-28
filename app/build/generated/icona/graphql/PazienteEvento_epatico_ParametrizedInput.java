package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field evento_epatico_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteEvento_epatico_ParametrizedInput implements GraphQLParametrizedInput {

    private CliEvento_epaticoPageOptionsDTO options;

    public PazienteEvento_epatico_ParametrizedInput() {
    }


    public PazienteEvento_epatico_ParametrizedInput options(CliEvento_epaticoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteEvento_epatico_ParametrizedInput deepCopy() {
        PazienteEvento_epatico_ParametrizedInput parametrizedInput = new PazienteEvento_epatico_ParametrizedInput();
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
