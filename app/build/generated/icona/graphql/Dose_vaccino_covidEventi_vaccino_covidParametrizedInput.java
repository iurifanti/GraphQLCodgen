package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field eventi_vaccino_covid in type Dose_vaccino_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Dose_vaccino_covidEventi_vaccino_covidParametrizedInput implements GraphQLParametrizedInput {

    private CliPatologiaPageOptionsDTO options;

    public Dose_vaccino_covidEventi_vaccino_covidParametrizedInput() {
    }


    public Dose_vaccino_covidEventi_vaccino_covidParametrizedInput options(CliPatologiaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Dose_vaccino_covidEventi_vaccino_covidParametrizedInput deepCopy() {
        Dose_vaccino_covidEventi_vaccino_covidParametrizedInput parametrizedInput = new Dose_vaccino_covidEventi_vaccino_covidParametrizedInput();
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
