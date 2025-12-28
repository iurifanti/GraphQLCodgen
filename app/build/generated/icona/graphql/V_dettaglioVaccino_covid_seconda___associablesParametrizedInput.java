package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field vaccino_covid_seconda___associables in type V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioVaccino_covid_seconda___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_altroPageOptionsDTO options;

    public V_dettaglioVaccino_covid_seconda___associablesParametrizedInput() {
    }


    public V_dettaglioVaccino_covid_seconda___associablesParametrizedInput options(CliFarmaco_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public V_dettaglioVaccino_covid_seconda___associablesParametrizedInput deepCopy() {
        V_dettaglioVaccino_covid_seconda___associablesParametrizedInput parametrizedInput = new V_dettaglioVaccino_covid_seconda___associablesParametrizedInput();
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
