package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field terapia_ARV in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteTerapia_ARVParametrizedInput implements GraphQLParametrizedInput {

    private CliTerapia_ARVPageOptionsDTO options;

    public PazienteTerapia_ARVParametrizedInput() {
    }


    public PazienteTerapia_ARVParametrizedInput options(CliTerapia_ARVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteTerapia_ARVParametrizedInput deepCopy() {
        PazienteTerapia_ARVParametrizedInput parametrizedInput = new PazienteTerapia_ARVParametrizedInput();
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
