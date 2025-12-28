package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field classificazione_ICD10____associables in type Evento
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class EventoClassificazione_ICD10____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliClassificazione_ICD10PageOptionsDTO options;

    public EventoClassificazione_ICD10____associablesParametrizedInput() {
    }


    public EventoClassificazione_ICD10____associablesParametrizedInput options(CliClassificazione_ICD10PageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public EventoClassificazione_ICD10____associablesParametrizedInput deepCopy() {
        EventoClassificazione_ICD10____associablesParametrizedInput parametrizedInput = new EventoClassificazione_ICD10____associablesParametrizedInput();
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
