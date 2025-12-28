package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field studio_questionario____associables in type P_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class P_PazienteStudio_questionario____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliStudio_questionarioPageOptionsDTO options;

    public P_PazienteStudio_questionario____associablesParametrizedInput() {
    }


    public P_PazienteStudio_questionario____associablesParametrizedInput options(CliStudio_questionarioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public P_PazienteStudio_questionario____associablesParametrizedInput deepCopy() {
        P_PazienteStudio_questionario____associablesParametrizedInput parametrizedInput = new P_PazienteStudio_questionario____associablesParametrizedInput();
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
