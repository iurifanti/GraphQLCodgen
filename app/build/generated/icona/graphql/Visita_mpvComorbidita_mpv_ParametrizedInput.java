package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field comorbidita_mpv_ in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvComorbidita_mpv_ParametrizedInput implements GraphQLParametrizedInput {

    private CliComorbidita_mpvPageOptionsDTO options;

    public Visita_mpvComorbidita_mpv_ParametrizedInput() {
    }


    public Visita_mpvComorbidita_mpv_ParametrizedInput options(CliComorbidita_mpvPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvComorbidita_mpv_ParametrizedInput deepCopy() {
        Visita_mpvComorbidita_mpv_ParametrizedInput parametrizedInput = new Visita_mpvComorbidita_mpv_ParametrizedInput();
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
