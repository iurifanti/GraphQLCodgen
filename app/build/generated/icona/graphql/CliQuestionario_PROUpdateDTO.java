package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Questionario_PRO.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliQuestionario_PROUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String data_compilazione;
    private String mese;

    public CliQuestionario_PROUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getData_compilazione() {
        return data_compilazione;
    }
    public void setData_compilazione(String data_compilazione) {
        this.data_compilazione = data_compilazione;
    }

    public String getMese() {
        return mese;
    }
    public void setMese(String mese) {
        this.mese = mese;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (data_compilazione != null) {
            joiner.add("data_compilazione: " + GraphQLRequestSerializer.getEntry(data_compilazione));
        }
        if (mese != null) {
            joiner.add("mese: " + GraphQLRequestSerializer.getEntry(mese));
        }
        return joiner.toString();
    }

    public static CliQuestionario_PROUpdateDTO.Builder builder() {
        return new CliQuestionario_PROUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String data_compilazione;
        private String mese;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        public Builder setMese(String mese) {
            this.mese = mese;
            return this;
        }


        public CliQuestionario_PROUpdateDTO build() {
            CliQuestionario_PROUpdateDTO result = new CliQuestionario_PROUpdateDTO();
            result.set_id(this._id);
            result.setData_compilazione(this.data_compilazione);
            result.setMese(this.mese);
            return result;
        }

    }
}
