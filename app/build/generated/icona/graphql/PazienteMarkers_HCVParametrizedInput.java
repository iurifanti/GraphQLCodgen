package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field markers_HCV in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteMarkers_HCVParametrizedInput implements GraphQLParametrizedInput {

    private CliMarkers_HCVPageOptionsDTO options;

    public PazienteMarkers_HCVParametrizedInput() {
    }


    public PazienteMarkers_HCVParametrizedInput options(CliMarkers_HCVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteMarkers_HCVParametrizedInput deepCopy() {
        PazienteMarkers_HCVParametrizedInput parametrizedInput = new PazienteMarkers_HCVParametrizedInput();
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
