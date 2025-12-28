package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field gruppo____associables in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvGruppo____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliGruppoPageOptionsDTO options;

    public Visita_mpvGruppo____associablesParametrizedInput() {
    }


    public Visita_mpvGruppo____associablesParametrizedInput options(CliGruppoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvGruppo____associablesParametrizedInput deepCopy() {
        Visita_mpvGruppo____associablesParametrizedInput parametrizedInput = new Visita_mpvGruppo____associablesParametrizedInput();
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
