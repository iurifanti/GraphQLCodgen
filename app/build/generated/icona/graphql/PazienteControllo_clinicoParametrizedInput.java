package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field controllo_clinico in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteControllo_clinicoParametrizedInput implements GraphQLParametrizedInput {

    private CliControllo_clinicoPageOptionsDTO options;

    public PazienteControllo_clinicoParametrizedInput() {
    }


    public PazienteControllo_clinicoParametrizedInput options(CliControllo_clinicoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteControllo_clinicoParametrizedInput deepCopy() {
        PazienteControllo_clinicoParametrizedInput parametrizedInput = new PazienteControllo_clinicoParametrizedInput();
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
