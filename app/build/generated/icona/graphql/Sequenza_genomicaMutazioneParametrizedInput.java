package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field mutazione in type Sequenza_genomica
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Sequenza_genomicaMutazioneParametrizedInput implements GraphQLParametrizedInput {

    private CliMutazionePageOptionsDTO options;

    public Sequenza_genomicaMutazioneParametrizedInput() {
    }


    public Sequenza_genomicaMutazioneParametrizedInput options(CliMutazionePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Sequenza_genomicaMutazioneParametrizedInput deepCopy() {
        Sequenza_genomicaMutazioneParametrizedInput parametrizedInput = new Sequenza_genomicaMutazioneParametrizedInput();
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
