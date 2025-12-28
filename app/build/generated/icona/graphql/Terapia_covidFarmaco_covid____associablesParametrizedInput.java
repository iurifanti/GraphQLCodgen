package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field farmaco_covid____associables in type Terapia_covid
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Terapia_covidFarmaco_covid____associablesParametrizedInput implements GraphQLParametrizedInput {

    private CliFarmaco_covidPageOptionsDTO options;

    public Terapia_covidFarmaco_covid____associablesParametrizedInput() {
    }


    public Terapia_covidFarmaco_covid____associablesParametrizedInput options(CliFarmaco_covidPageOptionsDTO options) {
        this.options = options;
        return this;
    }

    @Override
    public Terapia_covidFarmaco_covid____associablesParametrizedInput deepCopy() {
        Terapia_covidFarmaco_covid____associablesParametrizedInput parametrizedInput = new Terapia_covidFarmaco_covid____associablesParametrizedInput();
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
