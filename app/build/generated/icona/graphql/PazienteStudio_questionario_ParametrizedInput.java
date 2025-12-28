package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field studio_questionario_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteStudio_questionario_ParametrizedInput implements GraphQLParametrizedInput {

    private CliStudio_questionarioPageOptionsDTO options;

    public PazienteStudio_questionario_ParametrizedInput() {
    }


    public PazienteStudio_questionario_ParametrizedInput options(CliStudio_questionarioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteStudio_questionario_ParametrizedInput deepCopy() {
        PazienteStudio_questionario_ParametrizedInput parametrizedInput = new PazienteStudio_questionario_ParametrizedInput();
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
