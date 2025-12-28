package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field questionario____associables in type Questionario_PRO_app
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Questionario_PRO_appQuestionario____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliQuestionarioPageOptionsDTO options;

    public Questionario_PRO_appQuestionario____associablesParametrizedInput() {
    }


    public Questionario_PRO_appQuestionario____associablesParametrizedInput options(CliQuestionarioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Questionario_PRO_appQuestionario____associablesParametrizedInput deepCopy() {
        Questionario_PRO_appQuestionario____associablesParametrizedInput parametrizedInput = new Questionario_PRO_appQuestionario____associablesParametrizedInput();
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
