package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field motivazione_fine_ARV_princ___associables in type Terapia_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMotivazione_fine_ARVPageOptionsDTO options;

    public Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput() {
    }


    public Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput options(CliMotivazione_fine_ARVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput deepCopy() {
        Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput parametrizedInput = new Terapia_ARVMotivazione_fine_ARV_princ___associablesParametrizedInput();
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
