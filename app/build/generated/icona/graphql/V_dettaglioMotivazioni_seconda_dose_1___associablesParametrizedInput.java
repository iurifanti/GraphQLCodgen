package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field motivazioni_seconda_dose_1___associables in type V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMotivazioni_seconda_dosePageOptionsDTO options;

    public V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput() {
    }


    public V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput options(CliMotivazioni_seconda_dosePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput deepCopy() {
        V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput parametrizedInput = new V_dettaglioMotivazioni_seconda_dose_1___associablesParametrizedInput();
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
