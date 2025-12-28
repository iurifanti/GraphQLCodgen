package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field evento_covid in type C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class C_dettaglioEvento_covidParametrizedInput implements GraphQLParametrizedInput {

    private CliEventoPageOptionsDTO options;

    public C_dettaglioEvento_covidParametrizedInput() {
    }


    public C_dettaglioEvento_covidParametrizedInput options(CliEventoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public C_dettaglioEvento_covidParametrizedInput deepCopy() {
        C_dettaglioEvento_covidParametrizedInput parametrizedInput = new C_dettaglioEvento_covidParametrizedInput();
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
