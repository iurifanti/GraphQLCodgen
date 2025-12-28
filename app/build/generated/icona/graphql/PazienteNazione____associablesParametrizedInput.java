package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field nazione____associables in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteNazione____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliNazionePageOptionsDTO options;

    public PazienteNazione____associablesParametrizedInput() {
    }


    public PazienteNazione____associablesParametrizedInput options(CliNazionePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteNazione____associablesParametrizedInput deepCopy() {
        PazienteNazione____associablesParametrizedInput parametrizedInput = new PazienteNazione____associablesParametrizedInput();
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
