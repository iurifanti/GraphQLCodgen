package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field modalita_somministrazione_pre2___associables in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliModalita_somministrazionePageOptionsDTO options;

    public Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput() {
    }


    public Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput options(CliModalita_somministrazionePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput deepCopy() {
        Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput parametrizedInput = new Visita_mpvModalita_somministrazione_pre2___associablesParametrizedInput();
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
