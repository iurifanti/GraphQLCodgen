package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field terapia_epatica in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteTerapia_epaticaParametrizedInput implements GraphQLParametrizedInput {

    private CliTerapia_altroPageOptionsDTO options;

    public PazienteTerapia_epaticaParametrizedInput() {
    }


    public PazienteTerapia_epaticaParametrizedInput options(CliTerapia_altroPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteTerapia_epaticaParametrizedInput deepCopy() {
        PazienteTerapia_epaticaParametrizedInput parametrizedInput = new PazienteTerapia_epaticaParametrizedInput();
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
