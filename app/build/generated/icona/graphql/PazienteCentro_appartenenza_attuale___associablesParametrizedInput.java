package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field centro_appartenenza_attuale___associables in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteCentro_appartenenza_attuale___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCentroPageOptionsDTO options;

    public PazienteCentro_appartenenza_attuale___associablesParametrizedInput() {
    }


    public PazienteCentro_appartenenza_attuale___associablesParametrizedInput options(CliCentroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteCentro_appartenenza_attuale___associablesParametrizedInput deepCopy() {
        PazienteCentro_appartenenza_attuale___associablesParametrizedInput parametrizedInput = new PazienteCentro_appartenenza_attuale___associablesParametrizedInput();
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
