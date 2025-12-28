package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field terapia_covid_ in type C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class C_dettaglioTerapia_covid_ParametrizedInput implements GraphQLParametrizedInput {

    private CliTerapia_covidPageOptionsDTO options;

    public C_dettaglioTerapia_covid_ParametrizedInput() {
    }


    public C_dettaglioTerapia_covid_ParametrizedInput options(CliTerapia_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public C_dettaglioTerapia_covid_ParametrizedInput deepCopy() {
        C_dettaglioTerapia_covid_ParametrizedInput parametrizedInput = new C_dettaglioTerapia_covid_ParametrizedInput();
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
