package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sierologie_covid_ in type Controllo_clinico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Controllo_clinicoSierologie_covid_ParametrizedInput implements GraphQLParametrizedInput {

    private CliSierologie_covidPageOptionsDTO options;

    public Controllo_clinicoSierologie_covid_ParametrizedInput() {
    }


    public Controllo_clinicoSierologie_covid_ParametrizedInput options(CliSierologie_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Controllo_clinicoSierologie_covid_ParametrizedInput deepCopy() {
        Controllo_clinicoSierologie_covid_ParametrizedInput parametrizedInput = new Controllo_clinicoSierologie_covid_ParametrizedInput();
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
