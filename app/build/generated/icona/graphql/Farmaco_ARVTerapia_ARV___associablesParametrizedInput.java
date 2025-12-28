package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field terapia_ARV___associables in type Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVTerapia_ARV___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliTerapia_ARVPageOptionsDTO options;

    public Farmaco_ARVTerapia_ARV___associablesParametrizedInput() {
    }


    public Farmaco_ARVTerapia_ARV___associablesParametrizedInput options(CliTerapia_ARVPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ARVTerapia_ARV___associablesParametrizedInput deepCopy() {
        Farmaco_ARVTerapia_ARV___associablesParametrizedInput parametrizedInput = new Farmaco_ARVTerapia_ARV___associablesParametrizedInput();
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
