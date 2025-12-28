package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field provincia_ in type Regione
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class RegioneProvincia_ParametrizedInput implements GraphQLParametrizedInput {

    private CliProvinciaPageOptionsDTO options;

    public RegioneProvincia_ParametrizedInput() {
    }


    public RegioneProvincia_ParametrizedInput options(CliProvinciaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public RegioneProvincia_ParametrizedInput deepCopy() {
        RegioneProvincia_ParametrizedInput parametrizedInput = new RegioneProvincia_ParametrizedInput();
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
