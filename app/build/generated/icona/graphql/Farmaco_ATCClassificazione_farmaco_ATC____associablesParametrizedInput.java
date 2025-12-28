package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field classificazione_farmaco_ATC____associables in type Farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliClassificazione_farmaco_ATCPageOptionsDTO options;

    public Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput() {
    }


    public Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput options(CliClassificazione_farmaco_ATCPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput deepCopy() {
        Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput parametrizedInput = new Farmaco_ATCClassificazione_farmaco_ATC____associablesParametrizedInput();
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
