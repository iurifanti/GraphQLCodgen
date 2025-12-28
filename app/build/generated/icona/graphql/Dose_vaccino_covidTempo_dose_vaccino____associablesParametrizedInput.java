package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tempo_dose_vaccino____associables in type Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTempo_dose_vaccinoPageOptionsDTO options;

    public Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput() {
    }


    public Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput options(CliTempo_dose_vaccinoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput deepCopy() {
        Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput parametrizedInput = new Dose_vaccino_covidTempo_dose_vaccino____associablesParametrizedInput();
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
