package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field gravidanza_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteGravidanza_ParametrizedInput implements GraphQLParametrizedInput {

    private CliGravidanzaPageOptionsDTO options;

    public PazienteGravidanza_ParametrizedInput() {
    }


    public PazienteGravidanza_ParametrizedInput options(CliGravidanzaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteGravidanza_ParametrizedInput deepCopy() {
        PazienteGravidanza_ParametrizedInput parametrizedInput = new PazienteGravidanza_ParametrizedInput();
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
