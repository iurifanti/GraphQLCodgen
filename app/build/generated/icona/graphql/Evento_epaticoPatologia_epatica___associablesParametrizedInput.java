package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field patologia_epatica___associables in type Evento_epatico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Evento_epaticoPatologia_epatica___associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliPatologiaPageOptionsDTO options;

    public Evento_epaticoPatologia_epatica___associablesParametrizedInput() {
    }


    public Evento_epaticoPatologia_epatica___associablesParametrizedInput options(CliPatologiaPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Evento_epaticoPatologia_epatica___associablesParametrizedInput deepCopy() {
        Evento_epaticoPatologia_epatica___associablesParametrizedInput parametrizedInput = new Evento_epaticoPatologia_epatica___associablesParametrizedInput();
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
