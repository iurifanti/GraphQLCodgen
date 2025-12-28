package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field centro_sequenziatore___associables in type Sequenza_genomica
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCentro_sequenziatorePageOptionsDTO options;

    public Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput() {
    }


    public Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput options(CliCentro_sequenziatorePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput deepCopy() {
        Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput parametrizedInput = new Sequenza_genomicaCentro_sequenziatore___associablesParametrizedInput();
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
