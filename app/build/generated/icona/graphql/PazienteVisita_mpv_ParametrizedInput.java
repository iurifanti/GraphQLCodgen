package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field visita_mpv_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteVisita_mpv_ParametrizedInput implements GraphQLParametrizedInput {

    private CliVisita_mpvPageOptionsDTO options;

    public PazienteVisita_mpv_ParametrizedInput() {
    }


    public PazienteVisita_mpv_ParametrizedInput options(CliVisita_mpvPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteVisita_mpv_ParametrizedInput deepCopy() {
        PazienteVisita_mpv_ParametrizedInput parametrizedInput = new PazienteVisita_mpv_ParametrizedInput();
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
