package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tempo_sierologia_covid____associables in type Sierologie_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTempo_sierologia_covidPageOptionsDTO options;

    public Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput() {
    }


    public Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput options(CliTempo_sierologia_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput deepCopy() {
        Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput parametrizedInput = new Sierologie_covidTempo_sierologia_covid____associablesParametrizedInput();
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
