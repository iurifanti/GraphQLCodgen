package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dose_mpv_ in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvDose_mpv_ParametrizedInput implements GraphQLParametrizedInput {

    private CliDose_mpvPageOptionsDTO options;

    public Visita_mpvDose_mpv_ParametrizedInput() {
    }


    public Visita_mpvDose_mpv_ParametrizedInput options(CliDose_mpvPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvDose_mpv_ParametrizedInput deepCopy() {
        Visita_mpvDose_mpv_ParametrizedInput parametrizedInput = new Visita_mpvDose_mpv_ParametrizedInput();
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
