package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field condizione_lavorativa___associables in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteCondizione_lavorativa___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCondizione_lavorativaPageOptionsDTO options;

    public PazienteCondizione_lavorativa___associablesParametrizedInput() {
    }


    public PazienteCondizione_lavorativa___associablesParametrizedInput options(CliCondizione_lavorativaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteCondizione_lavorativa___associablesParametrizedInput deepCopy() {
        PazienteCondizione_lavorativa___associablesParametrizedInput parametrizedInput = new PazienteCondizione_lavorativa___associablesParametrizedInput();
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
