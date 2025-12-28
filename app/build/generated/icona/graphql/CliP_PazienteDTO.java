package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class P_Paziente, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliP_PazienteDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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
    private CliCentroDTO centro_;

    public CliP_PazienteDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of P_Paziente. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of P_Paziente. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altezza of P_Paziente. It is of type Int. Ranges: 0:220.
     */
    public Integer getAltezza() {
        return altezza;
    }
    /**
     * The attribute altezza of P_Paziente. It is of type Int. Ranges: 0:220.
     */
    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    /**
     * The attribute codice_centro of P_Paziente. It is of type String. Path: centro_ codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of P_Paziente. It is of type String. Path: centro_ codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute codice_interno of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public String getCodice_interno() {
        return codice_interno;
    }
    /**
     * The attribute codice_interno of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public void setCodice_interno(String codice_interno) {
        this.codice_interno = codice_interno;
    }

    /**
     * The attribute importato of P_Paziente. It is of type Boolean.
     */
    public Boolean getImportato() {
        return importato;
    }
    /**
     * The attribute importato of P_Paziente. It is of type Boolean.
     */
    public void setImportato(Boolean importato) {
        this.importato = importato;
    }

    /**
     * The attribute password_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public String getPassword_pro() {
        return password_pro;
    }
    /**
     * The attribute password_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public void setPassword_pro(String password_pro) {
        this.password_pro = password_pro;
    }

    /**
     * The attribute sessione_pro of P_Paziente. It is of type Text.
     */
    public String getSessione_pro() {
        return sessione_pro;
    }
    /**
     * The attribute sessione_pro of P_Paziente. It is of type Text.
     */
    public void setSessione_pro(String sessione_pro) {
        this.sessione_pro = sessione_pro;
    }

    /**
     * The attribute studi_pro_abilitati of P_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)studio_questionario_ nome. Cannot be null.
     */
    public String getStudi_pro_abilitati() {
        return studi_pro_abilitati;
    }
    /**
     * The attribute studi_pro_abilitati of P_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)studio_questionario_ nome. Cannot be null.
     */
    public void setStudi_pro_abilitati(String studi_pro_abilitati) {
        this.studi_pro_abilitati = studi_pro_abilitati;
    }

    /**
     * The attribute token_notifiche_pro of P_Paziente. It is of type Text.
     */
    public String getToken_notifiche_pro() {
        return token_notifiche_pro;
    }
    /**
     * The attribute token_notifiche_pro of P_Paziente. It is of type Text.
     */
    public void setToken_notifiche_pro(String token_notifiche_pro) {
        this.token_notifiche_pro = token_notifiche_pro;
    }

    /**
     * The attribute username_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public String getUsername_pro() {
        return username_pro;
    }
    /**
     * The attribute username_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public void setUsername_pro(String username_pro) {
        this.username_pro = username_pro;
    }

    /**
     * The associated object for the role centro_.
     */
    public CliCentroDTO getCentro_() {
        return centro_;
    }
    /**
     * The associated object for the role centro_.
     */
    public void setCentro_(CliCentroDTO centro_) {
        this.centro_ = centro_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (centro_ != null) {
            joiner.add("centro_: " + GraphQLRequestSerializer.getEntry(centro_));
        }
        return joiner.toString();
    }

    public static CliP_PazienteDTO.Builder builder() {
        return new CliP_PazienteDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
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
        private CliCentroDTO centro_;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of P_Paziente. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altezza of P_Paziente. It is of type Int. Ranges: 0:220.
         */
        public Builder setAltezza(Integer altezza) {
            this.altezza = altezza;
            return this;
        }

        /**
         * The attribute codice_centro of P_Paziente. It is of type String. Path: centro_ codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute codice_interno of P_Paziente. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setCodice_interno(String codice_interno) {
            this.codice_interno = codice_interno;
            return this;
        }

        /**
         * The attribute importato of P_Paziente. It is of type Boolean.
         */
        public Builder setImportato(Boolean importato) {
            this.importato = importato;
            return this;
        }

        /**
         * The attribute password_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setPassword_pro(String password_pro) {
            this.password_pro = password_pro;
            return this;
        }

        /**
         * The attribute sessione_pro of P_Paziente. It is of type Text.
         */
        public Builder setSessione_pro(String sessione_pro) {
            this.sessione_pro = sessione_pro;
            return this;
        }

        /**
         * The attribute studi_pro_abilitati of P_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)studio_questionario_ nome. Cannot be null.
         */
        public Builder setStudi_pro_abilitati(String studi_pro_abilitati) {
            this.studi_pro_abilitati = studi_pro_abilitati;
            return this;
        }

        /**
         * The attribute token_notifiche_pro of P_Paziente. It is of type Text.
         */
        public Builder setToken_notifiche_pro(String token_notifiche_pro) {
            this.token_notifiche_pro = token_notifiche_pro;
            return this;
        }

        /**
         * The attribute username_pro of P_Paziente. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setUsername_pro(String username_pro) {
            this.username_pro = username_pro;
            return this;
        }

        /**
         * The associated object for the role centro_.
         */
        public Builder setCentro_(CliCentroDTO centro_) {
            this.centro_ = centro_;
            return this;
        }


        public CliP_PazienteDTO build() {
            CliP_PazienteDTO result = new CliP_PazienteDTO();
            result.set_clientId(this._clientId);
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
            result.setCentro_(this.centro_);
            return result;
        }

    }
}
