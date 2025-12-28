package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field dosaggio_ in type Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVDosaggio_ParametrizedInput implements GraphQLParametrizedInput {

    private CliDosaggioPageOptionsDTO options;

    public Farmaco_ARVDosaggio_ParametrizedInput() {
    }


    public Farmaco_ARVDosaggio_ParametrizedInput options(CliDosaggioPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ARVDosaggio_ParametrizedInput deepCopy() {
        Farmaco_ARVDosaggio_ParametrizedInput parametrizedInput = new Farmaco_ARVDosaggio_ParametrizedInput();
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
