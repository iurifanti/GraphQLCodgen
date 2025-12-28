package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field paziente____associables in type Checks
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ChecksPaziente____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliPazientePageOptionsDTO options;

    public ChecksPaziente____associablesParametrizedInput() {
    }


    public ChecksPaziente____associablesParametrizedInput options(CliPazientePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public ChecksPaziente____associablesParametrizedInput deepCopy() {
        ChecksPaziente____associablesParametrizedInput parametrizedInput = new ChecksPaziente____associablesParametrizedInput();
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
