package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field modalita_somministrazione____associables in type Dose_mpv
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_mpvModalita_somministrazione____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliModalita_somministrazionePageOptionsDTO options;

    public Dose_mpvModalita_somministrazione____associablesParametrizedInput() {
    }


    public Dose_mpvModalita_somministrazione____associablesParametrizedInput options(CliModalita_somministrazionePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Dose_mpvModalita_somministrazione____associablesParametrizedInput deepCopy() {
        Dose_mpvModalita_somministrazione____associablesParametrizedInput parametrizedInput = new Dose_mpvModalita_somministrazione____associablesParametrizedInput();
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
