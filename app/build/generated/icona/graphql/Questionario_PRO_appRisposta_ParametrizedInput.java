package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field risposta_ in type Questionario_PRO_app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PRO_appRisposta_ParametrizedInput implements GraphQLParametrizedInput {

    private CliRispostaPageOptionsDTO options;

    public Questionario_PRO_appRisposta_ParametrizedInput() {
    }


    public Questionario_PRO_appRisposta_ParametrizedInput options(CliRispostaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Questionario_PRO_appRisposta_ParametrizedInput deepCopy() {
        Questionario_PRO_appRisposta_ParametrizedInput parametrizedInput = new Questionario_PRO_appRisposta_ParametrizedInput();
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
