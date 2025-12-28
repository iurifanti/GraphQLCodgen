package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field regione____associables in type Provincia
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ProvinciaRegione____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliRegionePageOptionsDTO options;

    public ProvinciaRegione____associablesParametrizedInput() {
    }


    public ProvinciaRegione____associablesParametrizedInput options(CliRegionePageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public ProvinciaRegione____associablesParametrizedInput deepCopy() {
        ProvinciaRegione____associablesParametrizedInput parametrizedInput = new ProvinciaRegione____associablesParametrizedInput();
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
