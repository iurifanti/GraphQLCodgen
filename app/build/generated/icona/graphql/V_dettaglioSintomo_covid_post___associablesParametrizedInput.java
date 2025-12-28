package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sintomo_covid_post___associables in type V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioSintomo_covid_post___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliPatologiaPageOptionsDTO options;

    public V_dettaglioSintomo_covid_post___associablesParametrizedInput() {
    }


    public V_dettaglioSintomo_covid_post___associablesParametrizedInput options(CliPatologiaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public V_dettaglioSintomo_covid_post___associablesParametrizedInput deepCopy() {
        V_dettaglioSintomo_covid_post___associablesParametrizedInput parametrizedInput = new V_dettaglioSintomo_covid_post___associablesParametrizedInput();
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
