package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sintomo_covid_post in type V_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class V_dettaglioSintomo_covid_postParametrizedInput implements GraphQLParametrizedInput {

    private CliPatologiaPageOptionsDTO options;

    public V_dettaglioSintomo_covid_postParametrizedInput() {
    }


    public V_dettaglioSintomo_covid_postParametrizedInput options(CliPatologiaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public V_dettaglioSintomo_covid_postParametrizedInput deepCopy() {
        V_dettaglioSintomo_covid_postParametrizedInput parametrizedInput = new V_dettaglioSintomo_covid_postParametrizedInput();
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
