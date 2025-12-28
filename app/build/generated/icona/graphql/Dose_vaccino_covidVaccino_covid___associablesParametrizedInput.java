package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field vaccino_covid___associables in type Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_vaccino_covidVaccino_covid___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_altroPageOptionsDTO options;

    public Dose_vaccino_covidVaccino_covid___associablesParametrizedInput() {
    }


    public Dose_vaccino_covidVaccino_covid___associablesParametrizedInput options(CliFarmaco_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Dose_vaccino_covidVaccino_covid___associablesParametrizedInput deepCopy() {
        Dose_vaccino_covidVaccino_covid___associablesParametrizedInput parametrizedInput = new Dose_vaccino_covidVaccino_covid___associablesParametrizedInput();
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
