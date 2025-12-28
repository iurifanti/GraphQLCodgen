package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field studio_paziente____associables in type Codice_studio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Codice_studioStudio_paziente____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliStudio_pazientePageOptionsDTO options;

    public Codice_studioStudio_paziente____associablesParametrizedInput() {
    }


    public Codice_studioStudio_paziente____associablesParametrizedInput options(CliStudio_pazientePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Codice_studioStudio_paziente____associablesParametrizedInput deepCopy() {
        Codice_studioStudio_paziente____associablesParametrizedInput parametrizedInput = new Codice_studioStudio_paziente____associablesParametrizedInput();
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
