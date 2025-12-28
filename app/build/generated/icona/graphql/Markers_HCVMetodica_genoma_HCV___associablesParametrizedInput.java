package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field metodica_genoma_HCV___associables in type Markers_HCV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMetodica_genoma_HCV_HBVPageOptionsDTO options;

    public Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput() {
    }


    public Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput options(CliMetodica_genoma_HCV_HBVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput deepCopy() {
        Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput parametrizedInput = new Markers_HCVMetodica_genoma_HCV___associablesParametrizedInput();
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
