package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field modalita___associables in type Gravidanza
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GravidanzaModalita___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCodici_gravidanzaPageOptionsDTO options;

    public GravidanzaModalita___associablesParametrizedInput() {
    }


    public GravidanzaModalita___associablesParametrizedInput options(CliCodici_gravidanzaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public GravidanzaModalita___associablesParametrizedInput deepCopy() {
        GravidanzaModalita___associablesParametrizedInput parametrizedInput = new GravidanzaModalita___associablesParametrizedInput();
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
