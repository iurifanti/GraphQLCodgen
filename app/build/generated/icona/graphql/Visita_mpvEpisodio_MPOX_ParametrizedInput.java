package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field episodio_MPOX_ in type Visita_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Visita_mpvEpisodio_MPOX_ParametrizedInput implements GraphQLParametrizedInput {

    private CliEpisodio_MPOXPageOptionsDTO options;

    public Visita_mpvEpisodio_MPOX_ParametrizedInput() {
    }


    public Visita_mpvEpisodio_MPOX_ParametrizedInput options(CliEpisodio_MPOXPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Visita_mpvEpisodio_MPOX_ParametrizedInput deepCopy() {
        Visita_mpvEpisodio_MPOX_ParametrizedInput parametrizedInput = new Visita_mpvEpisodio_MPOX_ParametrizedInput();
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
