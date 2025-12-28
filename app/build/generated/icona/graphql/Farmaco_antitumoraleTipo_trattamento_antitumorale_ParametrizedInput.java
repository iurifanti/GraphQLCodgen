package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field tipo_trattamento_antitumorale_ in type Farmaco_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput implements GraphQLParametrizedInput {

    private CliTipo_trattamento_antitumoralePageOptionsDTO options;

    public Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput() {
    }


    public Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput options(CliTipo_trattamento_antitumoralePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput deepCopy() {
        Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput parametrizedInput = new Farmaco_antitumoraleTipo_trattamento_antitumorale_ParametrizedInput();
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
