package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dosaggio____associables in type Terapia_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_ARVDosaggio____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliDosaggioPageOptionsDTO options;

    public Terapia_ARVDosaggio____associablesParametrizedInput() {
    }


    public Terapia_ARVDosaggio____associablesParametrizedInput options(CliDosaggioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_ARVDosaggio____associablesParametrizedInput deepCopy() {
        Terapia_ARVDosaggio____associablesParametrizedInput parametrizedInput = new Terapia_ARVDosaggio____associablesParametrizedInput();
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
