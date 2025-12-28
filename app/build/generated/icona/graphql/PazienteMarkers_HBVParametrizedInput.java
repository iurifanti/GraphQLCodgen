package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field markers_HBV in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteMarkers_HBVParametrizedInput implements GraphQLParametrizedInput {

    private CliMarkers_HBVPageOptionsDTO options;

    public PazienteMarkers_HBVParametrizedInput() {
    }


    public PazienteMarkers_HBVParametrizedInput options(CliMarkers_HBVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteMarkers_HBVParametrizedInput deepCopy() {
        PazienteMarkers_HBVParametrizedInput parametrizedInput = new PazienteMarkers_HBVParametrizedInput();
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
