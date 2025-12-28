package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field trattamento_antitumorale_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteTrattamento_antitumorale_ParametrizedInput implements GraphQLParametrizedInput {

    private CliTrattamento_antitumoralePageOptionsDTO options;

    public PazienteTrattamento_antitumorale_ParametrizedInput() {
    }


    public PazienteTrattamento_antitumorale_ParametrizedInput options(CliTrattamento_antitumoralePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteTrattamento_antitumorale_ParametrizedInput deepCopy() {
        PazienteTrattamento_antitumorale_ParametrizedInput parametrizedInput = new PazienteTrattamento_antitumorale_ParametrizedInput();
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
