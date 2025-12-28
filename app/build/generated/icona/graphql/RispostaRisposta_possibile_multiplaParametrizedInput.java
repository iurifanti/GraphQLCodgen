package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field risposta_possibile_multipla in type Risposta
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RispostaRisposta_possibile_multiplaParametrizedInput implements GraphQLParametrizedInput {

    private CliRisposta_possibilePageOptionsDTO options;

    public RispostaRisposta_possibile_multiplaParametrizedInput() {
    }


    public RispostaRisposta_possibile_multiplaParametrizedInput options(CliRisposta_possibilePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public RispostaRisposta_possibile_multiplaParametrizedInput deepCopy() {
        RispostaRisposta_possibile_multiplaParametrizedInput parametrizedInput = new RispostaRisposta_possibile_multiplaParametrizedInput();
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
