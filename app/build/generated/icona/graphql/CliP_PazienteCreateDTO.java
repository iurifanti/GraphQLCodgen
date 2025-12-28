package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliP_PazienteCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Integer altezza;
    @javax.validation.constraints.NotNull
    private String codice_interno;
    private Boolean importato;
    @javax.validation.constraints.NotNull
    private String password_pro;
    private String sessione_pro;
    private String token_notifiche_pro;
    @javax.validation.constraints.NotNull
    private String username_pro;
    @javax.validation.constraints.NotNull
    private String centro_;
    private java.util.List<CliQuestionario_PRO_appCreateDTO> questionario_PRO_app_;
    private java.util.List<String> studio_questionario_;

    public CliP_PazienteCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public Integer getAltezza() {
        return altezza;
    }
    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public String getCodice_interno() {
        return codice_interno;
    }
    public void setCodice_interno(String codice_interno) {
        this.codice_interno = codice_interno;
    }

    public Boolean getImportato() {
        return importato;
    }
    public void setImportato(Boolean importato) {
        this.importato = importato;
    }

    public String getPassword_pro() {
        return password_pro;
    }
    public void setPassword_pro(String password_pro) {
        this.password_pro = password_pro;
    }

    public String getSessione_pro() {
        return sessione_pro;
    }
    public void setSessione_pro(String sessione_pro) {
        this.sessione_pro = sessione_pro;
    }

    public String getToken_notifiche_pro() {
        return token_notifiche_pro;
    }
    public void setToken_notifiche_pro(String token_notifiche_pro) {
        this.token_notifiche_pro = token_notifiche_pro;
    }

    public String getUsername_pro() {
        return username_pro;
    }
    public void setUsername_pro(String username_pro) {
        this.username_pro = username_pro;
    }

    public String getCentro_() {
        return centro_;
    }
    public void setCentro_(String centro_) {
        this.centro_ = centro_;
    }

    public java.util.List<CliQuestionario_PRO_appCreateDTO> getQuestionario_PRO_app_() {
        return questionario_PRO_app_;
    }
    public void setQuestionario_PRO_app_(java.util.List<CliQuestionario_PRO_appCreateDTO> questionario_PRO_app_) {
        this.questionario_PRO_app_ = questionario_PRO_app_;
    }

    public java.util.List<String> getStudio_questionario_() {
        return studio_questionario_;
    }
    public void setStudio_questionario_(java.util.List<String> studio_questionario_) {
        this.studio_questionario_ = studio_questionario_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (altezza != null) {
            joiner.add("altezza: " + GraphQLRequestSerializer.getEntry(altezza));
        }
        if (codice_interno != null) {
            joiner.add("codice_interno: " + GraphQLRequestSerializer.getEntry(codice_interno));
        }
        if (importato != null) {
            joiner.add("importato: " + GraphQLRequestSerializer.getEntry(importato));
        }
        if (password_pro != null) {
            joiner.add("password_pro: " + GraphQLRequestSerializer.getEntry(password_pro));
        }
        if (sessione_pro != null) {
            joiner.add("sessione_pro: " + GraphQLRequestSerializer.getEntry(sessione_pro));
        }
        if (token_notifiche_pro != null) {
            joiner.add("token_notifiche_pro: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro));
        }
        if (username_pro != null) {
            joiner.add("username_pro: " + GraphQLRequestSerializer.getEntry(username_pro));
        }
        if (centro_ != null) {
            joiner.add("centro_: " + GraphQLRequestSerializer.getEntry(centro_));
        }
        if (questionario_PRO_app_ != null) {
            joiner.add("questionario_PRO_app_: " + GraphQLRequestSerializer.getEntry(questionario_PRO_app_));
        }
        if (studio_questionario_ != null) {
            joiner.add("studio_questionario_: " + GraphQLRequestSerializer.getEntry(studio_questionario_));
        }
        return joiner.toString();
    }

    public static CliP_PazienteCreateDTO.Builder builder() {
        return new CliP_PazienteCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private Integer altezza;
        private String codice_interno;
        private Boolean importato;
        private String password_pro;
        private String sessione_pro;
        private String token_notifiche_pro;
        private String username_pro;
        private String centro_;
        private java.util.List<CliQuestionario_PRO_appCreateDTO> questionario_PRO_app_;
        private java.util.List<String> studio_questionario_;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setAltezza(Integer altezza) {
            this.altezza = altezza;
            return this;
        }

        public Builder setCodice_interno(String codice_interno) {
            this.codice_interno = codice_interno;
            return this;
        }

        public Builder setImportato(Boolean importato) {
            this.importato = importato;
            return this;
        }

        public Builder setPassword_pro(String password_pro) {
            this.password_pro = password_pro;
            return this;
        }

        public Builder setSessione_pro(String sessione_pro) {
            this.sessione_pro = sessione_pro;
            return this;
        }

        public Builder setToken_notifiche_pro(String token_notifiche_pro) {
            this.token_notifiche_pro = token_notifiche_pro;
            return this;
        }

        public Builder setUsername_pro(String username_pro) {
            this.username_pro = username_pro;
            return this;
        }

        public Builder setCentro_(String centro_) {
            this.centro_ = centro_;
            return this;
        }

        public Builder setQuestionario_PRO_app_(java.util.List<CliQuestionario_PRO_appCreateDTO> questionario_PRO_app_) {
            this.questionario_PRO_app_ = questionario_PRO_app_;
            return this;
        }

        public Builder setStudio_questionario_(java.util.List<String> studio_questionario_) {
            this.studio_questionario_ = studio_questionario_;
            return this;
        }


        public CliP_PazienteCreateDTO build() {
            CliP_PazienteCreateDTO result = new CliP_PazienteCreateDTO();
            result.set_clientId(this._clientId);
            result.setAltezza(this.altezza);
            result.setCodice_interno(this.codice_interno);
            result.setImportato(this.importato);
            result.setPassword_pro(this.password_pro);
            result.setSessione_pro(this.sessione_pro);
            result.setToken_notifiche_pro(this.token_notifiche_pro);
            result.setUsername_pro(this.username_pro);
            result.setCentro_(this.centro_);
            result.setQuestionario_PRO_app_(this.questionario_PRO_app_);
            result.setStudio_questionario_(this.studio_questionario_);
            return result;
        }

    }
}
