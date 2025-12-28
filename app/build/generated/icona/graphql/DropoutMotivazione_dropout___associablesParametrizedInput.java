package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field motivazione_dropout___associables in type Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutMotivazione_dropout___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMotivazione_dropoutPageOptionsDTO options;

    public DropoutMotivazione_dropout___associablesParametrizedInput() {
    }


    public DropoutMotivazione_dropout___associablesParametrizedInput options(CliMotivazione_dropoutPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public DropoutMotivazione_dropout___associablesParametrizedInput deepCopy() {
        DropoutMotivazione_dropout___associablesParametrizedInput parametrizedInput = new DropoutMotivazione_dropout___associablesParametrizedInput();
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
