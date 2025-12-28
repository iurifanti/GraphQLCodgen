package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field classe____associables in type Componente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ComponenteClasse____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliClassePageOptionsDTO options;

    public ComponenteClasse____associablesParametrizedInput() {
    }


    public ComponenteClasse____associablesParametrizedInput options(CliClassePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public ComponenteClasse____associablesParametrizedInput deepCopy() {
        ComponenteClasse____associablesParametrizedInput parametrizedInput = new ComponenteClasse____associablesParametrizedInput();
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
