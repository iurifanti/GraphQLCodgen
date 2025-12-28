package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sede_biobanca____associables in type campione_old
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Campione_oldSede_biobanca____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliSede_biobancaPageOptionsDTO options;

    public Campione_oldSede_biobanca____associablesParametrizedInput() {
    }


    public Campione_oldSede_biobanca____associablesParametrizedInput options(CliSede_biobancaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Campione_oldSede_biobanca____associablesParametrizedInput deepCopy() {
        Campione_oldSede_biobanca____associablesParametrizedInput parametrizedInput = new Campione_oldSede_biobanca____associablesParametrizedInput();
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
