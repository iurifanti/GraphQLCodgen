package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tipo_visita_mp_booster___associables in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTipo_visita_mpvPageOptionsDTO options;

    public Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput() {
    }


    public Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput options(CliTipo_visita_mpvPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput deepCopy() {
        Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput parametrizedInput = new Visita_mpvTipo_visita_mp_booster___associablesParametrizedInput();
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
