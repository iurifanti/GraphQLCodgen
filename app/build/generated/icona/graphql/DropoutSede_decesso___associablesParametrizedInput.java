package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field sede_decesso___associables in type Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutSede_decesso___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliSede_decessoPageOptionsDTO options;

    public DropoutSede_decesso___associablesParametrizedInput() {
    }


    public DropoutSede_decesso___associablesParametrizedInput options(CliSede_decessoPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public DropoutSede_decesso___associablesParametrizedInput deepCopy() {
        DropoutSede_decesso___associablesParametrizedInput parametrizedInput = new DropoutSede_decesso___associablesParametrizedInput();
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
