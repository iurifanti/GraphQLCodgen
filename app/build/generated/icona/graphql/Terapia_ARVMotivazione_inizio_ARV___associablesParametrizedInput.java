package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field motivazione_inizio_ARV___associables in type Terapia_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliMotivazione_inizio_ARVPageOptionsDTO options;

    public Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput() {
    }


    public Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput options(CliMotivazione_inizio_ARVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput deepCopy() {
        Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput parametrizedInput = new Terapia_ARVMotivazione_inizio_ARV___associablesParametrizedInput();
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
