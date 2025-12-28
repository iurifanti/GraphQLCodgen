package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field fattore_di_rischio___associables in type Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteFattore_di_rischio___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFattore_di_rischioPageOptionsDTO options;

    public PazienteFattore_di_rischio___associablesParametrizedInput() {
    }


    public PazienteFattore_di_rischio___associablesParametrizedInput options(CliFattore_di_rischioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public PazienteFattore_di_rischio___associablesParametrizedInput deepCopy() {
        PazienteFattore_di_rischio___associablesParametrizedInput parametrizedInput = new PazienteFattore_di_rischio___associablesParametrizedInput();
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
