package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tempo_visita____associables in type L_dettaglio
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class L_dettaglioTempo_visita____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTempo_visitaPageOptionsDTO options;

    public L_dettaglioTempo_visita____associablesParametrizedInput() {
    }


    public L_dettaglioTempo_visita____associablesParametrizedInput options(CliTempo_visitaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public L_dettaglioTempo_visita____associablesParametrizedInput deepCopy() {
        L_dettaglioTempo_visita____associablesParametrizedInput parametrizedInput = new L_dettaglioTempo_visita____associablesParametrizedInput();
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
