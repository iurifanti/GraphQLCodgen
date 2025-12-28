package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_ATC____associables in type Terapia_altro
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_altroFarmaco_ATC____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_ATCPageOptionsDTO options;

    public Terapia_altroFarmaco_ATC____associablesParametrizedInput() {
    }


    public Terapia_altroFarmaco_ATC____associablesParametrizedInput options(CliFarmaco_ATCPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_altroFarmaco_ATC____associablesParametrizedInput deepCopy() {
        Terapia_altroFarmaco_ATC____associablesParametrizedInput parametrizedInput = new Terapia_altroFarmaco_ATC____associablesParametrizedInput();
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
