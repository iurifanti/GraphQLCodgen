package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
P_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliP_PazienteCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Integer altezza;
    private String codice_centro;
    private String codice_interno;
    private Boolean importato;
    private String password_pro;
    private String sessione_pro;
    private String studi_pro_abilitati;
    private String token_notifiche_pro;
    private String username_pro;

    public CliP_PazienteCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getAltezza() {
        return altezza;
    }
    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
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

    public String getStudi_pro_abilitati() {
        return studi_pro_abilitati;
    }
    public void setStudi_pro_abilitati(String studi_pro_abilitati) {
        this.studi_pro_abilitati = studi_pro_abilitati;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altezza != null) {
            joiner.add("altezza: " + GraphQLRequestSerializer.getEntry(altezza));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
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
        if (studi_pro_abilitati != null) {
            joiner.add("studi_pro_abilitati: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati));
        }
        if (token_notifiche_pro != null) {
            joiner.add("token_notifiche_pro: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro));
        }
        if (username_pro != null) {
            joiner.add("username_pro: " + GraphQLRequestSerializer.getEntry(username_pro));
        }
        return joiner.toString();
    }

    public static CliP_PazienteCursorDTO.Builder builder() {
        return new CliP_PazienteCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private Integer altezza;
        private String codice_centro;
        private String codice_interno;
        private Boolean importato;
        private String password_pro;
        private String sessione_pro;
        private String studi_pro_abilitati;
        private String token_notifiche_pro;
        private String username_pro;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltezza(Integer altezza) {
            this.altezza = altezza;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
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

        public Builder setStudi_pro_abilitati(String studi_pro_abilitati) {
            this.studi_pro_abilitati = studi_pro_abilitati;
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


        public CliP_PazienteCursorDTO build() {
            CliP_PazienteCursorDTO result = new CliP_PazienteCursorDTO();
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_interno(this.codice_interno);
            result.setImportato(this.importato);
            result.setPassword_pro(this.password_pro);
            result.setSessione_pro(this.sessione_pro);
            result.setStudi_pro_abilitati(this.studi_pro_abilitati);
            result.setToken_notifiche_pro(this.token_notifiche_pro);
            result.setUsername_pro(this.username_pro);
            return result;
        }

    }
}
