package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field questionario_PRO_app in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteQuestionario_PRO_appParametrizedInput implements GraphQLParametrizedInput {

    private CliQuestionario_PRO_appPageOptionsDTO options;

    public PazienteQuestionario_PRO_appParametrizedInput() {
    }


    public PazienteQuestionario_PRO_appParametrizedInput options(CliQuestionario_PRO_appPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteQuestionario_PRO_appParametrizedInput deepCopy() {
        PazienteQuestionario_PRO_appParametrizedInput parametrizedInput = new PazienteQuestionario_PRO_appParametrizedInput();
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
