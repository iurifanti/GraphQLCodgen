package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_antitumorale_ in type Tipo_trattamento_antitumorale
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_antitumoralePageOptionsDTO options;

    public Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput() {
    }


    public Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput options(CliFarmaco_antitumoralePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput deepCopy() {
        Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput parametrizedInput = new Tipo_trattamento_antitumoraleFarmaco_antitumorale_ParametrizedInput();
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
