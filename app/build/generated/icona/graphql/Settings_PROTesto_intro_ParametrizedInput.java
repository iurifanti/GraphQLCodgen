package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field testo_intro_ in type Settings_PRO
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Settings_PROTesto_intro_ParametrizedInput implements GraphQLParametrizedInput {

    private CliTesto_introPageOptionsDTO options;

    public Settings_PROTesto_intro_ParametrizedInput() {
    }


    public Settings_PROTesto_intro_ParametrizedInput options(CliTesto_introPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Settings_PROTesto_intro_ParametrizedInput deepCopy() {
        Settings_PROTesto_intro_ParametrizedInput parametrizedInput = new Settings_PROTesto_intro_ParametrizedInput();
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
