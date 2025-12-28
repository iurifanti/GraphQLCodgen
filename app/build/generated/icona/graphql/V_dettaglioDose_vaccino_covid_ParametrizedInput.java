package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dose_vaccino_covid_ in type V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioDose_vaccino_covid_ParametrizedInput implements GraphQLParametrizedInput {

    private CliDose_vaccino_covidPageOptionsDTO options;

    public V_dettaglioDose_vaccino_covid_ParametrizedInput() {
    }


    public V_dettaglioDose_vaccino_covid_ParametrizedInput options(CliDose_vaccino_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public V_dettaglioDose_vaccino_covid_ParametrizedInput deepCopy() {
        V_dettaglioDose_vaccino_covid_ParametrizedInput parametrizedInput = new V_dettaglioDose_vaccino_covid_ParametrizedInput();
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
