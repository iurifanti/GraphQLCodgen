package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Questionario_PRO.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliQuestionario_PRODraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String data_compilazione;
    private String mese;

    public CliQuestionario_PRODraftUpdateBulkDTO() {
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
        if (data_compilazione != null) {
            joiner.add("data_compilazione: " + GraphQLRequestSerializer.getEntry(data_compilazione));
        }
        if (mese != null) {
            joiner.add("mese: " + GraphQLRequestSerializer.getEntry(mese));
        }
        return joiner.toString();
    }

    public static CliQuestionario_PRODraftUpdateBulkDTO.Builder builder() {
        return new CliQuestionario_PRODraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String data_compilazione;
        private String mese;

        public Builder() {
        }

        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        public Builder setMese(String mese) {
            this.mese = mese;
            return this;
        }


        public CliQuestionario_PRODraftUpdateBulkDTO build() {
            CliQuestionario_PRODraftUpdateBulkDTO result = new CliQuestionario_PRODraftUpdateBulkDTO();
            result.setData_compilazione(this.data_compilazione);
            result.setMese(this.mese);
            return result;
        }

    }
}
