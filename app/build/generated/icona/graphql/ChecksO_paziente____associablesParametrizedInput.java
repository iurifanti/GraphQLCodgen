package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field o_paziente____associables in type Checks
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ChecksO_paziente____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliO_PazientePageOptionsDTO options;

    public ChecksO_paziente____associablesParametrizedInput() {
    }


    public ChecksO_paziente____associablesParametrizedInput options(CliO_PazientePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public ChecksO_paziente____associablesParametrizedInput deepCopy() {
        ChecksO_paziente____associablesParametrizedInput parametrizedInput = new ChecksO_paziente____associablesParametrizedInput();
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
