package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tipo_marker____associables in type Markers_altri
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_altriTipo_marker____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTipo_markerPageOptionsDTO options;

    public Markers_altriTipo_marker____associablesParametrizedInput() {
    }


    public Markers_altriTipo_marker____associablesParametrizedInput options(CliTipo_markerPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Markers_altriTipo_marker____associablesParametrizedInput deepCopy() {
        Markers_altriTipo_marker____associablesParametrizedInput parametrizedInput = new Markers_altriTipo_marker____associablesParametrizedInput();
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
