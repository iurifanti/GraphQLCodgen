package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field esame_strumentale_ in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteEsame_strumentale_ParametrizedInput implements GraphQLParametrizedInput {

    private CliEsame_strumentalePageOptionsDTO options;

    public PazienteEsame_strumentale_ParametrizedInput() {
    }


    public PazienteEsame_strumentale_ParametrizedInput options(CliEsame_strumentalePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteEsame_strumentale_ParametrizedInput deepCopy() {
        PazienteEsame_strumentale_ParametrizedInput parametrizedInput = new PazienteEsame_strumentale_ParametrizedInput();
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
