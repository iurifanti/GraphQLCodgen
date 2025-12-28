package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field unita_di_misura_viremia___associables in type Markers_HCV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliUnita_di_misura_viremiaPageOptionsDTO options;

    public Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput() {
    }


    public Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput options(CliUnita_di_misura_viremiaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput deepCopy() {
        Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput parametrizedInput = new Markers_HCVUnita_di_misura_viremia___associablesParametrizedInput();
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
