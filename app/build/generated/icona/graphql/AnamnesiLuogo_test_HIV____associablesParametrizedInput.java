package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field luogo_test_HIV____associables in type Anamnesi
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class AnamnesiLuogo_test_HIV____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliLuogo_test_HIVPageOptionsDTO options;

    public AnamnesiLuogo_test_HIV____associablesParametrizedInput() {
    }


    public AnamnesiLuogo_test_HIV____associablesParametrizedInput options(CliLuogo_test_HIVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public AnamnesiLuogo_test_HIV____associablesParametrizedInput deepCopy() {
        AnamnesiLuogo_test_HIV____associablesParametrizedInput parametrizedInput = new AnamnesiLuogo_test_HIV____associablesParametrizedInput();
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
