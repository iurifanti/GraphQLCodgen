package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sequenza_genomica in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteSequenza_genomicaParametrizedInput implements GraphQLParametrizedInput {

    private CliSequenza_genomicaPageOptionsDTO options;

    public PazienteSequenza_genomicaParametrizedInput() {
    }


    public PazienteSequenza_genomicaParametrizedInput options(CliSequenza_genomicaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteSequenza_genomicaParametrizedInput deepCopy() {
        PazienteSequenza_genomicaParametrizedInput parametrizedInput = new PazienteSequenza_genomicaParametrizedInput();
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
