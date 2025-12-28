package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field paziente___associables in type Sequenza_genomica
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaPaziente___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliPazientePageOptionsDTO options;

    public Sequenza_genomicaPaziente___associablesParametrizedInput() {
    }


    public Sequenza_genomicaPaziente___associablesParametrizedInput options(CliPazientePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Sequenza_genomicaPaziente___associablesParametrizedInput deepCopy() {
        Sequenza_genomicaPaziente___associablesParametrizedInput parametrizedInput = new Sequenza_genomicaPaziente___associablesParametrizedInput();
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
