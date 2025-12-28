package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field metodica_HIVRNA___associables in type Markers_HIV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HIVMetodica_HIVRNA___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMetodica_HIVRNAPageOptionsDTO options;

    public Markers_HIVMetodica_HIVRNA___associablesParametrizedInput() {
    }


    public Markers_HIVMetodica_HIVRNA___associablesParametrizedInput options(CliMetodica_HIVRNAPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Markers_HIVMetodica_HIVRNA___associablesParametrizedInput deepCopy() {
        Markers_HIVMetodica_HIVRNA___associablesParametrizedInput parametrizedInput = new Markers_HIVMetodica_HIVRNA___associablesParametrizedInput();
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
