package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field questionario_PRO_app_ in type P_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazienteQuestionario_PRO_app_ParametrizedInput implements GraphQLParametrizedInput {

    private CliQuestionario_PRO_appPageOptionsDTO options;

    public P_PazienteQuestionario_PRO_app_ParametrizedInput() {
    }


    public P_PazienteQuestionario_PRO_app_ParametrizedInput options(CliQuestionario_PRO_appPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public P_PazienteQuestionario_PRO_app_ParametrizedInput deepCopy() {
        P_PazienteQuestionario_PRO_app_ParametrizedInput parametrizedInput = new P_PazienteQuestionario_PRO_app_ParametrizedInput();
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
