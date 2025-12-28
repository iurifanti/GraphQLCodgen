package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field centro_provenienza____associables in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvCentro_provenienza____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCentro_provenienzaPageOptionsDTO options;

    public Visita_mpvCentro_provenienza____associablesParametrizedInput() {
    }


    public Visita_mpvCentro_provenienza____associablesParametrizedInput options(CliCentro_provenienzaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvCentro_provenienza____associablesParametrizedInput deepCopy() {
        Visita_mpvCentro_provenienza____associablesParametrizedInput parametrizedInput = new Visita_mpvCentro_provenienza____associablesParametrizedInput();
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
