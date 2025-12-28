package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field outcome_covid____associables in type C_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class C_dettaglioOutcome_covid____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliOutcome_covidPageOptionsDTO options;

    public C_dettaglioOutcome_covid____associablesParametrizedInput() {
    }


    public C_dettaglioOutcome_covid____associablesParametrizedInput options(CliOutcome_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public C_dettaglioOutcome_covid____associablesParametrizedInput deepCopy() {
        C_dettaglioOutcome_covid____associablesParametrizedInput parametrizedInput = new C_dettaglioOutcome_covid____associablesParametrizedInput();
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
