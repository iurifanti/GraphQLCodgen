package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Questionario_PRO_app.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PRO_appUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean confermato;
    private String data_compilazione;
    private CliQuestionarioRoleRefDTO questionario_;
    private CliRispostaRoleObjectsDTO risposta_;
    private CliStudio_questionarioRoleRefDTO studio_questionario_;

    public CliQuestionario_PRO_appUpdateBulkDTO() {
    }


    public Boolean getConfermato() {
        return confermato;
    }
    public void setConfermato(Boolean confermato) {
        this.confermato = confermato;
    }

    public String getData_compilazione() {
        return data_compilazione;
    }
    public void setData_compilazione(String data_compilazione) {
        this.data_compilazione = data_compilazione;
    }

    public CliQuestionarioRoleRefDTO getQuestionario_() {
        return questionario_;
    }
    public void setQuestionario_(CliQuestionarioRoleRefDTO questionario_) {
        this.questionario_ = questionario_;
    }

    public CliRispostaRoleObjectsDTO getRisposta_() {
        return risposta_;
    }
    public void setRisposta_(CliRispostaRoleObjectsDTO risposta_) {
        this.risposta_ = risposta_;
    }

    public CliStudio_questionarioRoleRefDTO getStudio_questionario_() {
        return studio_questionario_;
    }
    public void setStudio_questionario_(CliStudio_questionarioRoleRefDTO studio_questionario_) {
        this.studio_questionario_ = studio_questionario_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (confermato != null) {
            joiner.add("confermato: " + GraphQLRequestSerializer.getEntry(confermato));
        }
        if (data_compilazione != null) {
            joiner.add("data_compilazione: " + GraphQLRequestSerializer.getEntry(data_compilazione));
        }
        if (questionario_ != null) {
            joiner.add("questionario_: " + GraphQLRequestSerializer.getEntry(questionario_));
        }
        if (risposta_ != null) {
            joiner.add("risposta_: " + GraphQLRequestSerializer.getEntry(risposta_));
        }
        if (studio_questionario_ != null) {
            joiner.add("studio_questionario_: " + GraphQLRequestSerializer.getEntry(studio_questionario_));
        }
        return joiner.toString();
    }

    public static CliQuestionario_PRO_appUpdateBulkDTO.Builder builder() {
        return new CliQuestionario_PRO_appUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private Boolean confermato;
        private String data_compilazione;
        private CliQuestionarioRoleRefDTO questionario_;
        private CliRispostaRoleObjectsDTO risposta_;
        private CliStudio_questionarioRoleRefDTO studio_questionario_;

        public Builder() {
        }

        public Builder setConfermato(Boolean confermato) {
            this.confermato = confermato;
            return this;
        }

        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        public Builder setQuestionario_(CliQuestionarioRoleRefDTO questionario_) {
            this.questionario_ = questionario_;
            return this;
        }

        public Builder setRisposta_(CliRispostaRoleObjectsDTO risposta_) {
            this.risposta_ = risposta_;
            return this;
        }

        public Builder setStudio_questionario_(CliStudio_questionarioRoleRefDTO studio_questionario_) {
            this.studio_questionario_ = studio_questionario_;
            return this;
        }


        public CliQuestionario_PRO_appUpdateBulkDTO build() {
            CliQuestionario_PRO_appUpdateBulkDTO result = new CliQuestionario_PRO_appUpdateBulkDTO();
            result.setConfermato(this.confermato);
            result.setData_compilazione(this.data_compilazione);
            result.setQuestionario_(this.questionario_);
            result.setRisposta_(this.risposta_);
            result.setStudio_questionario_(this.studio_questionario_);
            return result;
        }

    }
}
