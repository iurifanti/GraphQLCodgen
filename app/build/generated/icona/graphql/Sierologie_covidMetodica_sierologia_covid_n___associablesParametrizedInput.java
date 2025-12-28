package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field metodica_sierologia_covid_n___associables in type Sierologie_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMetodica_sierologia_covidPageOptionsDTO options;

    public Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput() {
    }


    public Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput options(CliMetodica_sierologia_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput deepCopy() {
        Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput parametrizedInput = new Sierologie_covidMetodica_sierologia_covid_n___associablesParametrizedInput();
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
