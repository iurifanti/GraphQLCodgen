package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field codice_studio_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteCodice_studio_ParametrizedInput implements GraphQLParametrizedInput {

    private CliCodice_studioPageOptionsDTO options;

    public PazienteCodice_studio_ParametrizedInput() {
    }


    public PazienteCodice_studio_ParametrizedInput options(CliCodice_studioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteCodice_studio_ParametrizedInput deepCopy() {
        PazienteCodice_studio_ParametrizedInput parametrizedInput = new PazienteCodice_studio_ParametrizedInput();
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
