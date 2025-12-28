package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field motivazione_naive___associables in type Anamnesi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AnamnesiMotivazione_naive___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMotivazione_naivePageOptionsDTO options;

    public AnamnesiMotivazione_naive___associablesParametrizedInput() {
    }


    public AnamnesiMotivazione_naive___associablesParametrizedInput options(CliMotivazione_naivePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public AnamnesiMotivazione_naive___associablesParametrizedInput deepCopy() {
        AnamnesiMotivazione_naive___associablesParametrizedInput parametrizedInput = new AnamnesiMotivazione_naive___associablesParametrizedInput();
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
