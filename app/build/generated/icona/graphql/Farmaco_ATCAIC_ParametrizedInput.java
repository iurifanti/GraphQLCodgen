package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field AIC_ in type Farmaco_ATC
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ATCAIC_ParametrizedInput implements GraphQLParametrizedInput {

    private CliAICPageOptionsDTO options;

    public Farmaco_ATCAIC_ParametrizedInput() {
    }


    public Farmaco_ATCAIC_ParametrizedInput options(CliAICPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Farmaco_ATCAIC_ParametrizedInput deepCopy() {
        Farmaco_ATCAIC_ParametrizedInput parametrizedInput = new Farmaco_ATCAIC_ParametrizedInput();
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
