package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field markers_HIV in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteMarkers_HIVParametrizedInput implements GraphQLParametrizedInput {

    private CliMarkers_HIVPageOptionsDTO options;

    public PazienteMarkers_HIVParametrizedInput() {
    }


    public PazienteMarkers_HIVParametrizedInput options(CliMarkers_HIVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteMarkers_HIVParametrizedInput deepCopy() {
        PazienteMarkers_HIVParametrizedInput parametrizedInput = new PazienteMarkers_HIVParametrizedInput();
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
