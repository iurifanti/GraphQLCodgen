package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field markers_altri_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteMarkers_altri_ParametrizedInput implements GraphQLParametrizedInput {

    private CliMarkers_altriPageOptionsDTO options;

    public PazienteMarkers_altri_ParametrizedInput() {
    }


    public PazienteMarkers_altri_ParametrizedInput options(CliMarkers_altriPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteMarkers_altri_ParametrizedInput deepCopy() {
        PazienteMarkers_altri_ParametrizedInput parametrizedInput = new PazienteMarkers_altri_ParametrizedInput();
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
