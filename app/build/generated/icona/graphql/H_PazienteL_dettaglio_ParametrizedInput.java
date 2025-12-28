package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field l_dettaglio_ in type H_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class H_PazienteL_dettaglio_ParametrizedInput implements GraphQLParametrizedInput {

    private CliL_dettaglioPageOptionsDTO options;

    public H_PazienteL_dettaglio_ParametrizedInput() {
    }


    public H_PazienteL_dettaglio_ParametrizedInput options(CliL_dettaglioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public H_PazienteL_dettaglio_ParametrizedInput deepCopy() {
        H_PazienteL_dettaglio_ParametrizedInput parametrizedInput = new H_PazienteL_dettaglio_ParametrizedInput();
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
