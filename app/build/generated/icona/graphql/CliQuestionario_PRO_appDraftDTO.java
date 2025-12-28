package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Questionario_PRO_app.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PRO_appDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private Boolean confermato;
    private String data_compilazione;
    private String questionario_;
    private CliRispostaDraftRoleObjectsDTO risposta_;
    private String studio_questionario_;

    public CliQuestionario_PRO_appDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getQuestionario_() {
        return questionario_;
    }
    public void setQuestionario_(String questionario_) {
        this.questionario_ = questionario_;
    }

    public CliRispostaDraftRoleObjectsDTO getRisposta_() {
        return risposta_;
    }
    public void setRisposta_(CliRispostaDraftRoleObjectsDTO risposta_) {
        this.risposta_ = risposta_;
    }

    public String getStudio_questionario_() {
        return studio_questionario_;
    }
    public void setStudio_questionario_(String studio_questionario_) {
        this.studio_questionario_ = studio_questionario_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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

    public static CliQuestionario_PRO_appDraftDTO.Builder builder() {
        return new CliQuestionario_PRO_appDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private Boolean confermato;
        private String data_compilazione;
        private String questionario_;
        private CliRispostaDraftRoleObjectsDTO risposta_;
        private String studio_questionario_;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setConfermato(Boolean confermato) {
            this.confermato = confermato;
            return this;
        }

        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        public Builder setQuestionario_(String questionario_) {
            this.questionario_ = questionario_;
            return this;
        }

        public Builder setRisposta_(CliRispostaDraftRoleObjectsDTO risposta_) {
            this.risposta_ = risposta_;
            return this;
        }

        public Builder setStudio_questionario_(String studio_questionario_) {
            this.studio_questionario_ = studio_questionario_;
            return this;
        }


        public CliQuestionario_PRO_appDraftDTO build() {
            CliQuestionario_PRO_appDraftDTO result = new CliQuestionario_PRO_appDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setConfermato(this.confermato);
            result.setData_compilazione(this.data_compilazione);
            result.setQuestionario_(this.questionario_);
            result.setRisposta_(this.risposta_);
            result.setStudio_questionario_(this.studio_questionario_);
            return result;
        }

    }
}
