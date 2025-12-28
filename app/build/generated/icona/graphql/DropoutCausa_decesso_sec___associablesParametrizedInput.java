package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field causa_decesso_sec___associables in type Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutCausa_decesso_sec___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliCausa_decessoPageOptionsDTO options;

    public DropoutCausa_decesso_sec___associablesParametrizedInput() {
    }


    public DropoutCausa_decesso_sec___associablesParametrizedInput options(CliCausa_decessoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public DropoutCausa_decesso_sec___associablesParametrizedInput deepCopy() {
        DropoutCausa_decesso_sec___associablesParametrizedInput parametrizedInput = new DropoutCausa_decesso_sec___associablesParametrizedInput();
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
