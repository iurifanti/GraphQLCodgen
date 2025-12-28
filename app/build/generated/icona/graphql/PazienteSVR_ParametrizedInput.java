package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sVR_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteSVR_ParametrizedInput implements GraphQLParametrizedInput {

    private CliSVRPageOptionsDTO options;

    public PazienteSVR_ParametrizedInput() {
    }


    public PazienteSVR_ParametrizedInput options(CliSVRPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteSVR_ParametrizedInput deepCopy() {
        PazienteSVR_ParametrizedInput parametrizedInput = new PazienteSVR_ParametrizedInput();
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
