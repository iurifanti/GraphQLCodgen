package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field relazione_decesso_2___associables in type Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutRelazione_decesso_2___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliRelazione_decessoPageOptionsDTO options;

    public DropoutRelazione_decesso_2___associablesParametrizedInput() {
    }


    public DropoutRelazione_decesso_2___associablesParametrizedInput options(CliRelazione_decessoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public DropoutRelazione_decesso_2___associablesParametrizedInput deepCopy() {
        DropoutRelazione_decesso_2___associablesParametrizedInput parametrizedInput = new DropoutRelazione_decesso_2___associablesParametrizedInput();
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
