package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type P_Paziente.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliP_PazienteFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String _id___eq;
    private String _id___ne;
    private Boolean _id___null;
    private Boolean _id___not___null;
    private java.util.List<String> _id___in;
    private java.util.List<String> _id___not___in;
    private String _id___lt;
    private String _id___lte;
    private String _id___gt;
    private String _id___gte;
    private Integer altezza___eq;
    private Integer altezza___ne;
    private Boolean altezza___null;
    private Boolean altezza___not___null;
    private java.util.List<Integer> altezza___in;
    private java.util.List<Integer> altezza___not___in;
    private Integer altezza___lt;
    private Integer altezza___lte;
    private Integer altezza___gt;
    private Integer altezza___gte;
    private String codice_centro___eq;
    private String codice_centro___ne;
    private Boolean codice_centro___null;
    private Boolean codice_centro___not___null;
    private java.util.List<String> codice_centro___in;
    private java.util.List<String> codice_centro___not___in;
    private String codice_centro___lt;
    private String codice_centro___lte;
    private String codice_centro___gt;
    private String codice_centro___gte;
    private String codice_centro___contains;
    private String codice_centro___not___contains;
    private String codice_centro___starts_with;
    private String codice_centro___not___starts_with;
    private String codice_centro___ends_with;
    private String codice_centro___not___ends_with;
    private String codice_interno___eq;
    private String codice_interno___ne;
    private Boolean codice_interno___null;
    private Boolean codice_interno___not___null;
    private java.util.List<String> codice_interno___in;
    private java.util.List<String> codice_interno___not___in;
    private String codice_interno___lt;
    private String codice_interno___lte;
    private String codice_interno___gt;
    private String codice_interno___gte;
    private String codice_interno___contains;
    private String codice_interno___not___contains;
    private String codice_interno___starts_with;
    private String codice_interno___not___starts_with;
    private String codice_interno___ends_with;
    private String codice_interno___not___ends_with;
    private Boolean importato___eq;
    private Boolean importato___ne;
    private Boolean importato___null;
    private Boolean importato___not___null;
    private String password_pro___eq;
    private String password_pro___ne;
    private Boolean password_pro___null;
    private Boolean password_pro___not___null;
    private java.util.List<String> password_pro___in;
    private java.util.List<String> password_pro___not___in;
    private String password_pro___lt;
    private String password_pro___lte;
    private String password_pro___gt;
    private String password_pro___gte;
    private String password_pro___contains;
    private String password_pro___not___contains;
    private String password_pro___starts_with;
    private String password_pro___not___starts_with;
    private String password_pro___ends_with;
    private String password_pro___not___ends_with;
    private String sessione_pro___eq;
    private String sessione_pro___ne;
    private Boolean sessione_pro___null;
    private Boolean sessione_pro___not___null;
    private java.util.List<String> sessione_pro___in;
    private java.util.List<String> sessione_pro___not___in;
    private String sessione_pro___lt;
    private String sessione_pro___lte;
    private String sessione_pro___gt;
    private String sessione_pro___gte;
    private String sessione_pro___contains;
    private String sessione_pro___not___contains;
    private String sessione_pro___starts_with;
    private String sessione_pro___not___starts_with;
    private String sessione_pro___ends_with;
    private String sessione_pro___not___ends_with;
    private String studi_pro_abilitati___eq;
    private String studi_pro_abilitati___ne;
    private Boolean studi_pro_abilitati___null;
    private Boolean studi_pro_abilitati___not___null;
    private java.util.List<String> studi_pro_abilitati___in;
    private java.util.List<String> studi_pro_abilitati___not___in;
    private String studi_pro_abilitati___lt;
    private String studi_pro_abilitati___lte;
    private String studi_pro_abilitati___gt;
    private String studi_pro_abilitati___gte;
    private String studi_pro_abilitati___contains;
    private String studi_pro_abilitati___not___contains;
    private String studi_pro_abilitati___starts_with;
    private String studi_pro_abilitati___not___starts_with;
    private String studi_pro_abilitati___ends_with;
    private String studi_pro_abilitati___not___ends_with;
    private String token_notifiche_pro___eq;
    private String token_notifiche_pro___ne;
    private Boolean token_notifiche_pro___null;
    private Boolean token_notifiche_pro___not___null;
    private java.util.List<String> token_notifiche_pro___in;
    private java.util.List<String> token_notifiche_pro___not___in;
    private String token_notifiche_pro___lt;
    private String token_notifiche_pro___lte;
    private String token_notifiche_pro___gt;
    private String token_notifiche_pro___gte;
    private String token_notifiche_pro___contains;
    private String token_notifiche_pro___not___contains;
    private String token_notifiche_pro___starts_with;
    private String token_notifiche_pro___not___starts_with;
    private String token_notifiche_pro___ends_with;
    private String token_notifiche_pro___not___ends_with;
    private String username_pro___eq;
    private String username_pro___ne;
    private Boolean username_pro___null;
    private Boolean username_pro___not___null;
    private java.util.List<String> username_pro___in;
    private java.util.List<String> username_pro___not___in;
    private String username_pro___lt;
    private String username_pro___lte;
    private String username_pro___gt;
    private String username_pro___gte;
    private String username_pro___contains;
    private String username_pro___not___contains;
    private String username_pro___starts_with;
    private String username_pro___not___starts_with;
    private String username_pro___ends_with;
    private String username_pro___not___ends_with;
    private java.util.List<CliP_PazienteFilterDTO> AND;
    private java.util.List<CliP_PazienteFilterDTO> OR;
    private CliP_PazienteFilterDTO NOT;

    public CliP_PazienteFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String get_id___eq() {
        return _id___eq;
    }
    public void set_id___eq(String _id___eq) {
        this._id___eq = _id___eq;
    }

    public String get_id___ne() {
        return _id___ne;
    }
    public void set_id___ne(String _id___ne) {
        this._id___ne = _id___ne;
    }

    public Boolean get_id___null() {
        return _id___null;
    }
    public void set_id___null(Boolean _id___null) {
        this._id___null = _id___null;
    }

    public Boolean get_id___not___null() {
        return _id___not___null;
    }
    public void set_id___not___null(Boolean _id___not___null) {
        this._id___not___null = _id___not___null;
    }

    public java.util.List<String> get_id___in() {
        return _id___in;
    }
    public void set_id___in(java.util.List<String> _id___in) {
        this._id___in = _id___in;
    }

    public java.util.List<String> get_id___not___in() {
        return _id___not___in;
    }
    public void set_id___not___in(java.util.List<String> _id___not___in) {
        this._id___not___in = _id___not___in;
    }

    public String get_id___lt() {
        return _id___lt;
    }
    public void set_id___lt(String _id___lt) {
        this._id___lt = _id___lt;
    }

    public String get_id___lte() {
        return _id___lte;
    }
    public void set_id___lte(String _id___lte) {
        this._id___lte = _id___lte;
    }

    public String get_id___gt() {
        return _id___gt;
    }
    public void set_id___gt(String _id___gt) {
        this._id___gt = _id___gt;
    }

    public String get_id___gte() {
        return _id___gte;
    }
    public void set_id___gte(String _id___gte) {
        this._id___gte = _id___gte;
    }

    public Integer getAltezza___eq() {
        return altezza___eq;
    }
    public void setAltezza___eq(Integer altezza___eq) {
        this.altezza___eq = altezza___eq;
    }

    public Integer getAltezza___ne() {
        return altezza___ne;
    }
    public void setAltezza___ne(Integer altezza___ne) {
        this.altezza___ne = altezza___ne;
    }

    public Boolean getAltezza___null() {
        return altezza___null;
    }
    public void setAltezza___null(Boolean altezza___null) {
        this.altezza___null = altezza___null;
    }

    public Boolean getAltezza___not___null() {
        return altezza___not___null;
    }
    public void setAltezza___not___null(Boolean altezza___not___null) {
        this.altezza___not___null = altezza___not___null;
    }

    public java.util.List<Integer> getAltezza___in() {
        return altezza___in;
    }
    public void setAltezza___in(java.util.List<Integer> altezza___in) {
        this.altezza___in = altezza___in;
    }

    public java.util.List<Integer> getAltezza___not___in() {
        return altezza___not___in;
    }
    public void setAltezza___not___in(java.util.List<Integer> altezza___not___in) {
        this.altezza___not___in = altezza___not___in;
    }

    public Integer getAltezza___lt() {
        return altezza___lt;
    }
    public void setAltezza___lt(Integer altezza___lt) {
        this.altezza___lt = altezza___lt;
    }

    public Integer getAltezza___lte() {
        return altezza___lte;
    }
    public void setAltezza___lte(Integer altezza___lte) {
        this.altezza___lte = altezza___lte;
    }

    public Integer getAltezza___gt() {
        return altezza___gt;
    }
    public void setAltezza___gt(Integer altezza___gt) {
        this.altezza___gt = altezza___gt;
    }

    public Integer getAltezza___gte() {
        return altezza___gte;
    }
    public void setAltezza___gte(Integer altezza___gte) {
        this.altezza___gte = altezza___gte;
    }

    public String getCodice_centro___eq() {
        return codice_centro___eq;
    }
    public void setCodice_centro___eq(String codice_centro___eq) {
        this.codice_centro___eq = codice_centro___eq;
    }

    public String getCodice_centro___ne() {
        return codice_centro___ne;
    }
    public void setCodice_centro___ne(String codice_centro___ne) {
        this.codice_centro___ne = codice_centro___ne;
    }

    public Boolean getCodice_centro___null() {
        return codice_centro___null;
    }
    public void setCodice_centro___null(Boolean codice_centro___null) {
        this.codice_centro___null = codice_centro___null;
    }

    public Boolean getCodice_centro___not___null() {
        return codice_centro___not___null;
    }
    public void setCodice_centro___not___null(Boolean codice_centro___not___null) {
        this.codice_centro___not___null = codice_centro___not___null;
    }

    public java.util.List<String> getCodice_centro___in() {
        return codice_centro___in;
    }
    public void setCodice_centro___in(java.util.List<String> codice_centro___in) {
        this.codice_centro___in = codice_centro___in;
    }

    public java.util.List<String> getCodice_centro___not___in() {
        return codice_centro___not___in;
    }
    public void setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
        this.codice_centro___not___in = codice_centro___not___in;
    }

    public String getCodice_centro___lt() {
        return codice_centro___lt;
    }
    public void setCodice_centro___lt(String codice_centro___lt) {
        this.codice_centro___lt = codice_centro___lt;
    }

    public String getCodice_centro___lte() {
        return codice_centro___lte;
    }
    public void setCodice_centro___lte(String codice_centro___lte) {
        this.codice_centro___lte = codice_centro___lte;
    }

    public String getCodice_centro___gt() {
        return codice_centro___gt;
    }
    public void setCodice_centro___gt(String codice_centro___gt) {
        this.codice_centro___gt = codice_centro___gt;
    }

    public String getCodice_centro___gte() {
        return codice_centro___gte;
    }
    public void setCodice_centro___gte(String codice_centro___gte) {
        this.codice_centro___gte = codice_centro___gte;
    }

    public String getCodice_centro___contains() {
        return codice_centro___contains;
    }
    public void setCodice_centro___contains(String codice_centro___contains) {
        this.codice_centro___contains = codice_centro___contains;
    }

    public String getCodice_centro___not___contains() {
        return codice_centro___not___contains;
    }
    public void setCodice_centro___not___contains(String codice_centro___not___contains) {
        this.codice_centro___not___contains = codice_centro___not___contains;
    }

    public String getCodice_centro___starts_with() {
        return codice_centro___starts_with;
    }
    public void setCodice_centro___starts_with(String codice_centro___starts_with) {
        this.codice_centro___starts_with = codice_centro___starts_with;
    }

    public String getCodice_centro___not___starts_with() {
        return codice_centro___not___starts_with;
    }
    public void setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
        this.codice_centro___not___starts_with = codice_centro___not___starts_with;
    }

    public String getCodice_centro___ends_with() {
        return codice_centro___ends_with;
    }
    public void setCodice_centro___ends_with(String codice_centro___ends_with) {
        this.codice_centro___ends_with = codice_centro___ends_with;
    }

    public String getCodice_centro___not___ends_with() {
        return codice_centro___not___ends_with;
    }
    public void setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
        this.codice_centro___not___ends_with = codice_centro___not___ends_with;
    }

    public String getCodice_interno___eq() {
        return codice_interno___eq;
    }
    public void setCodice_interno___eq(String codice_interno___eq) {
        this.codice_interno___eq = codice_interno___eq;
    }

    public String getCodice_interno___ne() {
        return codice_interno___ne;
    }
    public void setCodice_interno___ne(String codice_interno___ne) {
        this.codice_interno___ne = codice_interno___ne;
    }

    public Boolean getCodice_interno___null() {
        return codice_interno___null;
    }
    public void setCodice_interno___null(Boolean codice_interno___null) {
        this.codice_interno___null = codice_interno___null;
    }

    public Boolean getCodice_interno___not___null() {
        return codice_interno___not___null;
    }
    public void setCodice_interno___not___null(Boolean codice_interno___not___null) {
        this.codice_interno___not___null = codice_interno___not___null;
    }

    public java.util.List<String> getCodice_interno___in() {
        return codice_interno___in;
    }
    public void setCodice_interno___in(java.util.List<String> codice_interno___in) {
        this.codice_interno___in = codice_interno___in;
    }

    public java.util.List<String> getCodice_interno___not___in() {
        return codice_interno___not___in;
    }
    public void setCodice_interno___not___in(java.util.List<String> codice_interno___not___in) {
        this.codice_interno___not___in = codice_interno___not___in;
    }

    public String getCodice_interno___lt() {
        return codice_interno___lt;
    }
    public void setCodice_interno___lt(String codice_interno___lt) {
        this.codice_interno___lt = codice_interno___lt;
    }

    public String getCodice_interno___lte() {
        return codice_interno___lte;
    }
    public void setCodice_interno___lte(String codice_interno___lte) {
        this.codice_interno___lte = codice_interno___lte;
    }

    public String getCodice_interno___gt() {
        return codice_interno___gt;
    }
    public void setCodice_interno___gt(String codice_interno___gt) {
        this.codice_interno___gt = codice_interno___gt;
    }

    public String getCodice_interno___gte() {
        return codice_interno___gte;
    }
    public void setCodice_interno___gte(String codice_interno___gte) {
        this.codice_interno___gte = codice_interno___gte;
    }

    public String getCodice_interno___contains() {
        return codice_interno___contains;
    }
    public void setCodice_interno___contains(String codice_interno___contains) {
        this.codice_interno___contains = codice_interno___contains;
    }

    public String getCodice_interno___not___contains() {
        return codice_interno___not___contains;
    }
    public void setCodice_interno___not___contains(String codice_interno___not___contains) {
        this.codice_interno___not___contains = codice_interno___not___contains;
    }

    public String getCodice_interno___starts_with() {
        return codice_interno___starts_with;
    }
    public void setCodice_interno___starts_with(String codice_interno___starts_with) {
        this.codice_interno___starts_with = codice_interno___starts_with;
    }

    public String getCodice_interno___not___starts_with() {
        return codice_interno___not___starts_with;
    }
    public void setCodice_interno___not___starts_with(String codice_interno___not___starts_with) {
        this.codice_interno___not___starts_with = codice_interno___not___starts_with;
    }

    public String getCodice_interno___ends_with() {
        return codice_interno___ends_with;
    }
    public void setCodice_interno___ends_with(String codice_interno___ends_with) {
        this.codice_interno___ends_with = codice_interno___ends_with;
    }

    public String getCodice_interno___not___ends_with() {
        return codice_interno___not___ends_with;
    }
    public void setCodice_interno___not___ends_with(String codice_interno___not___ends_with) {
        this.codice_interno___not___ends_with = codice_interno___not___ends_with;
    }

    public Boolean getImportato___eq() {
        return importato___eq;
    }
    public void setImportato___eq(Boolean importato___eq) {
        this.importato___eq = importato___eq;
    }

    public Boolean getImportato___ne() {
        return importato___ne;
    }
    public void setImportato___ne(Boolean importato___ne) {
        this.importato___ne = importato___ne;
    }

    public Boolean getImportato___null() {
        return importato___null;
    }
    public void setImportato___null(Boolean importato___null) {
        this.importato___null = importato___null;
    }

    public Boolean getImportato___not___null() {
        return importato___not___null;
    }
    public void setImportato___not___null(Boolean importato___not___null) {
        this.importato___not___null = importato___not___null;
    }

    public String getPassword_pro___eq() {
        return password_pro___eq;
    }
    public void setPassword_pro___eq(String password_pro___eq) {
        this.password_pro___eq = password_pro___eq;
    }

    public String getPassword_pro___ne() {
        return password_pro___ne;
    }
    public void setPassword_pro___ne(String password_pro___ne) {
        this.password_pro___ne = password_pro___ne;
    }

    public Boolean getPassword_pro___null() {
        return password_pro___null;
    }
    public void setPassword_pro___null(Boolean password_pro___null) {
        this.password_pro___null = password_pro___null;
    }

    public Boolean getPassword_pro___not___null() {
        return password_pro___not___null;
    }
    public void setPassword_pro___not___null(Boolean password_pro___not___null) {
        this.password_pro___not___null = password_pro___not___null;
    }

    public java.util.List<String> getPassword_pro___in() {
        return password_pro___in;
    }
    public void setPassword_pro___in(java.util.List<String> password_pro___in) {
        this.password_pro___in = password_pro___in;
    }

    public java.util.List<String> getPassword_pro___not___in() {
        return password_pro___not___in;
    }
    public void setPassword_pro___not___in(java.util.List<String> password_pro___not___in) {
        this.password_pro___not___in = password_pro___not___in;
    }

    public String getPassword_pro___lt() {
        return password_pro___lt;
    }
    public void setPassword_pro___lt(String password_pro___lt) {
        this.password_pro___lt = password_pro___lt;
    }

    public String getPassword_pro___lte() {
        return password_pro___lte;
    }
    public void setPassword_pro___lte(String password_pro___lte) {
        this.password_pro___lte = password_pro___lte;
    }

    public String getPassword_pro___gt() {
        return password_pro___gt;
    }
    public void setPassword_pro___gt(String password_pro___gt) {
        this.password_pro___gt = password_pro___gt;
    }

    public String getPassword_pro___gte() {
        return password_pro___gte;
    }
    public void setPassword_pro___gte(String password_pro___gte) {
        this.password_pro___gte = password_pro___gte;
    }

    public String getPassword_pro___contains() {
        return password_pro___contains;
    }
    public void setPassword_pro___contains(String password_pro___contains) {
        this.password_pro___contains = password_pro___contains;
    }

    public String getPassword_pro___not___contains() {
        return password_pro___not___contains;
    }
    public void setPassword_pro___not___contains(String password_pro___not___contains) {
        this.password_pro___not___contains = password_pro___not___contains;
    }

    public String getPassword_pro___starts_with() {
        return password_pro___starts_with;
    }
    public void setPassword_pro___starts_with(String password_pro___starts_with) {
        this.password_pro___starts_with = password_pro___starts_with;
    }

    public String getPassword_pro___not___starts_with() {
        return password_pro___not___starts_with;
    }
    public void setPassword_pro___not___starts_with(String password_pro___not___starts_with) {
        this.password_pro___not___starts_with = password_pro___not___starts_with;
    }

    public String getPassword_pro___ends_with() {
        return password_pro___ends_with;
    }
    public void setPassword_pro___ends_with(String password_pro___ends_with) {
        this.password_pro___ends_with = password_pro___ends_with;
    }

    public String getPassword_pro___not___ends_with() {
        return password_pro___not___ends_with;
    }
    public void setPassword_pro___not___ends_with(String password_pro___not___ends_with) {
        this.password_pro___not___ends_with = password_pro___not___ends_with;
    }

    public String getSessione_pro___eq() {
        return sessione_pro___eq;
    }
    public void setSessione_pro___eq(String sessione_pro___eq) {
        this.sessione_pro___eq = sessione_pro___eq;
    }

    public String getSessione_pro___ne() {
        return sessione_pro___ne;
    }
    public void setSessione_pro___ne(String sessione_pro___ne) {
        this.sessione_pro___ne = sessione_pro___ne;
    }

    public Boolean getSessione_pro___null() {
        return sessione_pro___null;
    }
    public void setSessione_pro___null(Boolean sessione_pro___null) {
        this.sessione_pro___null = sessione_pro___null;
    }

    public Boolean getSessione_pro___not___null() {
        return sessione_pro___not___null;
    }
    public void setSessione_pro___not___null(Boolean sessione_pro___not___null) {
        this.sessione_pro___not___null = sessione_pro___not___null;
    }

    public java.util.List<String> getSessione_pro___in() {
        return sessione_pro___in;
    }
    public void setSessione_pro___in(java.util.List<String> sessione_pro___in) {
        this.sessione_pro___in = sessione_pro___in;
    }

    public java.util.List<String> getSessione_pro___not___in() {
        return sessione_pro___not___in;
    }
    public void setSessione_pro___not___in(java.util.List<String> sessione_pro___not___in) {
        this.sessione_pro___not___in = sessione_pro___not___in;
    }

    public String getSessione_pro___lt() {
        return sessione_pro___lt;
    }
    public void setSessione_pro___lt(String sessione_pro___lt) {
        this.sessione_pro___lt = sessione_pro___lt;
    }

    public String getSessione_pro___lte() {
        return sessione_pro___lte;
    }
    public void setSessione_pro___lte(String sessione_pro___lte) {
        this.sessione_pro___lte = sessione_pro___lte;
    }

    public String getSessione_pro___gt() {
        return sessione_pro___gt;
    }
    public void setSessione_pro___gt(String sessione_pro___gt) {
        this.sessione_pro___gt = sessione_pro___gt;
    }

    public String getSessione_pro___gte() {
        return sessione_pro___gte;
    }
    public void setSessione_pro___gte(String sessione_pro___gte) {
        this.sessione_pro___gte = sessione_pro___gte;
    }

    public String getSessione_pro___contains() {
        return sessione_pro___contains;
    }
    public void setSessione_pro___contains(String sessione_pro___contains) {
        this.sessione_pro___contains = sessione_pro___contains;
    }

    public String getSessione_pro___not___contains() {
        return sessione_pro___not___contains;
    }
    public void setSessione_pro___not___contains(String sessione_pro___not___contains) {
        this.sessione_pro___not___contains = sessione_pro___not___contains;
    }

    public String getSessione_pro___starts_with() {
        return sessione_pro___starts_with;
    }
    public void setSessione_pro___starts_with(String sessione_pro___starts_with) {
        this.sessione_pro___starts_with = sessione_pro___starts_with;
    }

    public String getSessione_pro___not___starts_with() {
        return sessione_pro___not___starts_with;
    }
    public void setSessione_pro___not___starts_with(String sessione_pro___not___starts_with) {
        this.sessione_pro___not___starts_with = sessione_pro___not___starts_with;
    }

    public String getSessione_pro___ends_with() {
        return sessione_pro___ends_with;
    }
    public void setSessione_pro___ends_with(String sessione_pro___ends_with) {
        this.sessione_pro___ends_with = sessione_pro___ends_with;
    }

    public String getSessione_pro___not___ends_with() {
        return sessione_pro___not___ends_with;
    }
    public void setSessione_pro___not___ends_with(String sessione_pro___not___ends_with) {
        this.sessione_pro___not___ends_with = sessione_pro___not___ends_with;
    }

    public String getStudi_pro_abilitati___eq() {
        return studi_pro_abilitati___eq;
    }
    public void setStudi_pro_abilitati___eq(String studi_pro_abilitati___eq) {
        this.studi_pro_abilitati___eq = studi_pro_abilitati___eq;
    }

    public String getStudi_pro_abilitati___ne() {
        return studi_pro_abilitati___ne;
    }
    public void setStudi_pro_abilitati___ne(String studi_pro_abilitati___ne) {
        this.studi_pro_abilitati___ne = studi_pro_abilitati___ne;
    }

    public Boolean getStudi_pro_abilitati___null() {
        return studi_pro_abilitati___null;
    }
    public void setStudi_pro_abilitati___null(Boolean studi_pro_abilitati___null) {
        this.studi_pro_abilitati___null = studi_pro_abilitati___null;
    }

    public Boolean getStudi_pro_abilitati___not___null() {
        return studi_pro_abilitati___not___null;
    }
    public void setStudi_pro_abilitati___not___null(Boolean studi_pro_abilitati___not___null) {
        this.studi_pro_abilitati___not___null = studi_pro_abilitati___not___null;
    }

    public java.util.List<String> getStudi_pro_abilitati___in() {
        return studi_pro_abilitati___in;
    }
    public void setStudi_pro_abilitati___in(java.util.List<String> studi_pro_abilitati___in) {
        this.studi_pro_abilitati___in = studi_pro_abilitati___in;
    }

    public java.util.List<String> getStudi_pro_abilitati___not___in() {
        return studi_pro_abilitati___not___in;
    }
    public void setStudi_pro_abilitati___not___in(java.util.List<String> studi_pro_abilitati___not___in) {
        this.studi_pro_abilitati___not___in = studi_pro_abilitati___not___in;
    }

    public String getStudi_pro_abilitati___lt() {
        return studi_pro_abilitati___lt;
    }
    public void setStudi_pro_abilitati___lt(String studi_pro_abilitati___lt) {
        this.studi_pro_abilitati___lt = studi_pro_abilitati___lt;
    }

    public String getStudi_pro_abilitati___lte() {
        return studi_pro_abilitati___lte;
    }
    public void setStudi_pro_abilitati___lte(String studi_pro_abilitati___lte) {
        this.studi_pro_abilitati___lte = studi_pro_abilitati___lte;
    }

    public String getStudi_pro_abilitati___gt() {
        return studi_pro_abilitati___gt;
    }
    public void setStudi_pro_abilitati___gt(String studi_pro_abilitati___gt) {
        this.studi_pro_abilitati___gt = studi_pro_abilitati___gt;
    }

    public String getStudi_pro_abilitati___gte() {
        return studi_pro_abilitati___gte;
    }
    public void setStudi_pro_abilitati___gte(String studi_pro_abilitati___gte) {
        this.studi_pro_abilitati___gte = studi_pro_abilitati___gte;
    }

    public String getStudi_pro_abilitati___contains() {
        return studi_pro_abilitati___contains;
    }
    public void setStudi_pro_abilitati___contains(String studi_pro_abilitati___contains) {
        this.studi_pro_abilitati___contains = studi_pro_abilitati___contains;
    }

    public String getStudi_pro_abilitati___not___contains() {
        return studi_pro_abilitati___not___contains;
    }
    public void setStudi_pro_abilitati___not___contains(String studi_pro_abilitati___not___contains) {
        this.studi_pro_abilitati___not___contains = studi_pro_abilitati___not___contains;
    }

    public String getStudi_pro_abilitati___starts_with() {
        return studi_pro_abilitati___starts_with;
    }
    public void setStudi_pro_abilitati___starts_with(String studi_pro_abilitati___starts_with) {
        this.studi_pro_abilitati___starts_with = studi_pro_abilitati___starts_with;
    }

    public String getStudi_pro_abilitati___not___starts_with() {
        return studi_pro_abilitati___not___starts_with;
    }
    public void setStudi_pro_abilitati___not___starts_with(String studi_pro_abilitati___not___starts_with) {
        this.studi_pro_abilitati___not___starts_with = studi_pro_abilitati___not___starts_with;
    }

    public String getStudi_pro_abilitati___ends_with() {
        return studi_pro_abilitati___ends_with;
    }
    public void setStudi_pro_abilitati___ends_with(String studi_pro_abilitati___ends_with) {
        this.studi_pro_abilitati___ends_with = studi_pro_abilitati___ends_with;
    }

    public String getStudi_pro_abilitati___not___ends_with() {
        return studi_pro_abilitati___not___ends_with;
    }
    public void setStudi_pro_abilitati___not___ends_with(String studi_pro_abilitati___not___ends_with) {
        this.studi_pro_abilitati___not___ends_with = studi_pro_abilitati___not___ends_with;
    }

    public String getToken_notifiche_pro___eq() {
        return token_notifiche_pro___eq;
    }
    public void setToken_notifiche_pro___eq(String token_notifiche_pro___eq) {
        this.token_notifiche_pro___eq = token_notifiche_pro___eq;
    }

    public String getToken_notifiche_pro___ne() {
        return token_notifiche_pro___ne;
    }
    public void setToken_notifiche_pro___ne(String token_notifiche_pro___ne) {
        this.token_notifiche_pro___ne = token_notifiche_pro___ne;
    }

    public Boolean getToken_notifiche_pro___null() {
        return token_notifiche_pro___null;
    }
    public void setToken_notifiche_pro___null(Boolean token_notifiche_pro___null) {
        this.token_notifiche_pro___null = token_notifiche_pro___null;
    }

    public Boolean getToken_notifiche_pro___not___null() {
        return token_notifiche_pro___not___null;
    }
    public void setToken_notifiche_pro___not___null(Boolean token_notifiche_pro___not___null) {
        this.token_notifiche_pro___not___null = token_notifiche_pro___not___null;
    }

    public java.util.List<String> getToken_notifiche_pro___in() {
        return token_notifiche_pro___in;
    }
    public void setToken_notifiche_pro___in(java.util.List<String> token_notifiche_pro___in) {
        this.token_notifiche_pro___in = token_notifiche_pro___in;
    }

    public java.util.List<String> getToken_notifiche_pro___not___in() {
        return token_notifiche_pro___not___in;
    }
    public void setToken_notifiche_pro___not___in(java.util.List<String> token_notifiche_pro___not___in) {
        this.token_notifiche_pro___not___in = token_notifiche_pro___not___in;
    }

    public String getToken_notifiche_pro___lt() {
        return token_notifiche_pro___lt;
    }
    public void setToken_notifiche_pro___lt(String token_notifiche_pro___lt) {
        this.token_notifiche_pro___lt = token_notifiche_pro___lt;
    }

    public String getToken_notifiche_pro___lte() {
        return token_notifiche_pro___lte;
    }
    public void setToken_notifiche_pro___lte(String token_notifiche_pro___lte) {
        this.token_notifiche_pro___lte = token_notifiche_pro___lte;
    }

    public String getToken_notifiche_pro___gt() {
        return token_notifiche_pro___gt;
    }
    public void setToken_notifiche_pro___gt(String token_notifiche_pro___gt) {
        this.token_notifiche_pro___gt = token_notifiche_pro___gt;
    }

    public String getToken_notifiche_pro___gte() {
        return token_notifiche_pro___gte;
    }
    public void setToken_notifiche_pro___gte(String token_notifiche_pro___gte) {
        this.token_notifiche_pro___gte = token_notifiche_pro___gte;
    }

    public String getToken_notifiche_pro___contains() {
        return token_notifiche_pro___contains;
    }
    public void setToken_notifiche_pro___contains(String token_notifiche_pro___contains) {
        this.token_notifiche_pro___contains = token_notifiche_pro___contains;
    }

    public String getToken_notifiche_pro___not___contains() {
        return token_notifiche_pro___not___contains;
    }
    public void setToken_notifiche_pro___not___contains(String token_notifiche_pro___not___contains) {
        this.token_notifiche_pro___not___contains = token_notifiche_pro___not___contains;
    }

    public String getToken_notifiche_pro___starts_with() {
        return token_notifiche_pro___starts_with;
    }
    public void setToken_notifiche_pro___starts_with(String token_notifiche_pro___starts_with) {
        this.token_notifiche_pro___starts_with = token_notifiche_pro___starts_with;
    }

    public String getToken_notifiche_pro___not___starts_with() {
        return token_notifiche_pro___not___starts_with;
    }
    public void setToken_notifiche_pro___not___starts_with(String token_notifiche_pro___not___starts_with) {
        this.token_notifiche_pro___not___starts_with = token_notifiche_pro___not___starts_with;
    }

    public String getToken_notifiche_pro___ends_with() {
        return token_notifiche_pro___ends_with;
    }
    public void setToken_notifiche_pro___ends_with(String token_notifiche_pro___ends_with) {
        this.token_notifiche_pro___ends_with = token_notifiche_pro___ends_with;
    }

    public String getToken_notifiche_pro___not___ends_with() {
        return token_notifiche_pro___not___ends_with;
    }
    public void setToken_notifiche_pro___not___ends_with(String token_notifiche_pro___not___ends_with) {
        this.token_notifiche_pro___not___ends_with = token_notifiche_pro___not___ends_with;
    }

    public String getUsername_pro___eq() {
        return username_pro___eq;
    }
    public void setUsername_pro___eq(String username_pro___eq) {
        this.username_pro___eq = username_pro___eq;
    }

    public String getUsername_pro___ne() {
        return username_pro___ne;
    }
    public void setUsername_pro___ne(String username_pro___ne) {
        this.username_pro___ne = username_pro___ne;
    }

    public Boolean getUsername_pro___null() {
        return username_pro___null;
    }
    public void setUsername_pro___null(Boolean username_pro___null) {
        this.username_pro___null = username_pro___null;
    }

    public Boolean getUsername_pro___not___null() {
        return username_pro___not___null;
    }
    public void setUsername_pro___not___null(Boolean username_pro___not___null) {
        this.username_pro___not___null = username_pro___not___null;
    }

    public java.util.List<String> getUsername_pro___in() {
        return username_pro___in;
    }
    public void setUsername_pro___in(java.util.List<String> username_pro___in) {
        this.username_pro___in = username_pro___in;
    }

    public java.util.List<String> getUsername_pro___not___in() {
        return username_pro___not___in;
    }
    public void setUsername_pro___not___in(java.util.List<String> username_pro___not___in) {
        this.username_pro___not___in = username_pro___not___in;
    }

    public String getUsername_pro___lt() {
        return username_pro___lt;
    }
    public void setUsername_pro___lt(String username_pro___lt) {
        this.username_pro___lt = username_pro___lt;
    }

    public String getUsername_pro___lte() {
        return username_pro___lte;
    }
    public void setUsername_pro___lte(String username_pro___lte) {
        this.username_pro___lte = username_pro___lte;
    }

    public String getUsername_pro___gt() {
        return username_pro___gt;
    }
    public void setUsername_pro___gt(String username_pro___gt) {
        this.username_pro___gt = username_pro___gt;
    }

    public String getUsername_pro___gte() {
        return username_pro___gte;
    }
    public void setUsername_pro___gte(String username_pro___gte) {
        this.username_pro___gte = username_pro___gte;
    }

    public String getUsername_pro___contains() {
        return username_pro___contains;
    }
    public void setUsername_pro___contains(String username_pro___contains) {
        this.username_pro___contains = username_pro___contains;
    }

    public String getUsername_pro___not___contains() {
        return username_pro___not___contains;
    }
    public void setUsername_pro___not___contains(String username_pro___not___contains) {
        this.username_pro___not___contains = username_pro___not___contains;
    }

    public String getUsername_pro___starts_with() {
        return username_pro___starts_with;
    }
    public void setUsername_pro___starts_with(String username_pro___starts_with) {
        this.username_pro___starts_with = username_pro___starts_with;
    }

    public String getUsername_pro___not___starts_with() {
        return username_pro___not___starts_with;
    }
    public void setUsername_pro___not___starts_with(String username_pro___not___starts_with) {
        this.username_pro___not___starts_with = username_pro___not___starts_with;
    }

    public String getUsername_pro___ends_with() {
        return username_pro___ends_with;
    }
    public void setUsername_pro___ends_with(String username_pro___ends_with) {
        this.username_pro___ends_with = username_pro___ends_with;
    }

    public String getUsername_pro___not___ends_with() {
        return username_pro___not___ends_with;
    }
    public void setUsername_pro___not___ends_with(String username_pro___not___ends_with) {
        this.username_pro___not___ends_with = username_pro___not___ends_with;
    }

    public java.util.List<CliP_PazienteFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliP_PazienteFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliP_PazienteFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliP_PazienteFilterDTO> OR) {
        this.OR = OR;
    }

    public CliP_PazienteFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliP_PazienteFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (_id___eq != null) {
            joiner.add("_id___eq: " + GraphQLRequestSerializer.getEntry(_id___eq));
        }
        if (_id___ne != null) {
            joiner.add("_id___ne: " + GraphQLRequestSerializer.getEntry(_id___ne));
        }
        if (_id___null != null) {
            joiner.add("_id___null: " + GraphQLRequestSerializer.getEntry(_id___null));
        }
        if (_id___not___null != null) {
            joiner.add("_id___not___null: " + GraphQLRequestSerializer.getEntry(_id___not___null));
        }
        if (_id___in != null) {
            joiner.add("_id___in: " + GraphQLRequestSerializer.getEntry(_id___in));
        }
        if (_id___not___in != null) {
            joiner.add("_id___not___in: " + GraphQLRequestSerializer.getEntry(_id___not___in));
        }
        if (_id___lt != null) {
            joiner.add("_id___lt: " + GraphQLRequestSerializer.getEntry(_id___lt));
        }
        if (_id___lte != null) {
            joiner.add("_id___lte: " + GraphQLRequestSerializer.getEntry(_id___lte));
        }
        if (_id___gt != null) {
            joiner.add("_id___gt: " + GraphQLRequestSerializer.getEntry(_id___gt));
        }
        if (_id___gte != null) {
            joiner.add("_id___gte: " + GraphQLRequestSerializer.getEntry(_id___gte));
        }
        if (altezza___eq != null) {
            joiner.add("altezza___eq: " + GraphQLRequestSerializer.getEntry(altezza___eq));
        }
        if (altezza___ne != null) {
            joiner.add("altezza___ne: " + GraphQLRequestSerializer.getEntry(altezza___ne));
        }
        if (altezza___null != null) {
            joiner.add("altezza___null: " + GraphQLRequestSerializer.getEntry(altezza___null));
        }
        if (altezza___not___null != null) {
            joiner.add("altezza___not___null: " + GraphQLRequestSerializer.getEntry(altezza___not___null));
        }
        if (altezza___in != null) {
            joiner.add("altezza___in: " + GraphQLRequestSerializer.getEntry(altezza___in));
        }
        if (altezza___not___in != null) {
            joiner.add("altezza___not___in: " + GraphQLRequestSerializer.getEntry(altezza___not___in));
        }
        if (altezza___lt != null) {
            joiner.add("altezza___lt: " + GraphQLRequestSerializer.getEntry(altezza___lt));
        }
        if (altezza___lte != null) {
            joiner.add("altezza___lte: " + GraphQLRequestSerializer.getEntry(altezza___lte));
        }
        if (altezza___gt != null) {
            joiner.add("altezza___gt: " + GraphQLRequestSerializer.getEntry(altezza___gt));
        }
        if (altezza___gte != null) {
            joiner.add("altezza___gte: " + GraphQLRequestSerializer.getEntry(altezza___gte));
        }
        if (codice_centro___eq != null) {
            joiner.add("codice_centro___eq: " + GraphQLRequestSerializer.getEntry(codice_centro___eq));
        }
        if (codice_centro___ne != null) {
            joiner.add("codice_centro___ne: " + GraphQLRequestSerializer.getEntry(codice_centro___ne));
        }
        if (codice_centro___null != null) {
            joiner.add("codice_centro___null: " + GraphQLRequestSerializer.getEntry(codice_centro___null));
        }
        if (codice_centro___not___null != null) {
            joiner.add("codice_centro___not___null: " + GraphQLRequestSerializer.getEntry(codice_centro___not___null));
        }
        if (codice_centro___in != null) {
            joiner.add("codice_centro___in: " + GraphQLRequestSerializer.getEntry(codice_centro___in));
        }
        if (codice_centro___not___in != null) {
            joiner.add("codice_centro___not___in: " + GraphQLRequestSerializer.getEntry(codice_centro___not___in));
        }
        if (codice_centro___lt != null) {
            joiner.add("codice_centro___lt: " + GraphQLRequestSerializer.getEntry(codice_centro___lt));
        }
        if (codice_centro___lte != null) {
            joiner.add("codice_centro___lte: " + GraphQLRequestSerializer.getEntry(codice_centro___lte));
        }
        if (codice_centro___gt != null) {
            joiner.add("codice_centro___gt: " + GraphQLRequestSerializer.getEntry(codice_centro___gt));
        }
        if (codice_centro___gte != null) {
            joiner.add("codice_centro___gte: " + GraphQLRequestSerializer.getEntry(codice_centro___gte));
        }
        if (codice_centro___contains != null) {
            joiner.add("codice_centro___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___contains));
        }
        if (codice_centro___not___contains != null) {
            joiner.add("codice_centro___not___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___not___contains));
        }
        if (codice_centro___starts_with != null) {
            joiner.add("codice_centro___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___starts_with));
        }
        if (codice_centro___not___starts_with != null) {
            joiner.add("codice_centro___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___starts_with));
        }
        if (codice_centro___ends_with != null) {
            joiner.add("codice_centro___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___ends_with));
        }
        if (codice_centro___not___ends_with != null) {
            joiner.add("codice_centro___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___ends_with));
        }
        if (codice_interno___eq != null) {
            joiner.add("codice_interno___eq: " + GraphQLRequestSerializer.getEntry(codice_interno___eq));
        }
        if (codice_interno___ne != null) {
            joiner.add("codice_interno___ne: " + GraphQLRequestSerializer.getEntry(codice_interno___ne));
        }
        if (codice_interno___null != null) {
            joiner.add("codice_interno___null: " + GraphQLRequestSerializer.getEntry(codice_interno___null));
        }
        if (codice_interno___not___null != null) {
            joiner.add("codice_interno___not___null: " + GraphQLRequestSerializer.getEntry(codice_interno___not___null));
        }
        if (codice_interno___in != null) {
            joiner.add("codice_interno___in: " + GraphQLRequestSerializer.getEntry(codice_interno___in));
        }
        if (codice_interno___not___in != null) {
            joiner.add("codice_interno___not___in: " + GraphQLRequestSerializer.getEntry(codice_interno___not___in));
        }
        if (codice_interno___lt != null) {
            joiner.add("codice_interno___lt: " + GraphQLRequestSerializer.getEntry(codice_interno___lt));
        }
        if (codice_interno___lte != null) {
            joiner.add("codice_interno___lte: " + GraphQLRequestSerializer.getEntry(codice_interno___lte));
        }
        if (codice_interno___gt != null) {
            joiner.add("codice_interno___gt: " + GraphQLRequestSerializer.getEntry(codice_interno___gt));
        }
        if (codice_interno___gte != null) {
            joiner.add("codice_interno___gte: " + GraphQLRequestSerializer.getEntry(codice_interno___gte));
        }
        if (codice_interno___contains != null) {
            joiner.add("codice_interno___contains: " + GraphQLRequestSerializer.getEntry(codice_interno___contains));
        }
        if (codice_interno___not___contains != null) {
            joiner.add("codice_interno___not___contains: " + GraphQLRequestSerializer.getEntry(codice_interno___not___contains));
        }
        if (codice_interno___starts_with != null) {
            joiner.add("codice_interno___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno___starts_with));
        }
        if (codice_interno___not___starts_with != null) {
            joiner.add("codice_interno___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno___not___starts_with));
        }
        if (codice_interno___ends_with != null) {
            joiner.add("codice_interno___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno___ends_with));
        }
        if (codice_interno___not___ends_with != null) {
            joiner.add("codice_interno___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno___not___ends_with));
        }
        if (importato___eq != null) {
            joiner.add("importato___eq: " + GraphQLRequestSerializer.getEntry(importato___eq));
        }
        if (importato___ne != null) {
            joiner.add("importato___ne: " + GraphQLRequestSerializer.getEntry(importato___ne));
        }
        if (importato___null != null) {
            joiner.add("importato___null: " + GraphQLRequestSerializer.getEntry(importato___null));
        }
        if (importato___not___null != null) {
            joiner.add("importato___not___null: " + GraphQLRequestSerializer.getEntry(importato___not___null));
        }
        if (password_pro___eq != null) {
            joiner.add("password_pro___eq: " + GraphQLRequestSerializer.getEntry(password_pro___eq));
        }
        if (password_pro___ne != null) {
            joiner.add("password_pro___ne: " + GraphQLRequestSerializer.getEntry(password_pro___ne));
        }
        if (password_pro___null != null) {
            joiner.add("password_pro___null: " + GraphQLRequestSerializer.getEntry(password_pro___null));
        }
        if (password_pro___not___null != null) {
            joiner.add("password_pro___not___null: " + GraphQLRequestSerializer.getEntry(password_pro___not___null));
        }
        if (password_pro___in != null) {
            joiner.add("password_pro___in: " + GraphQLRequestSerializer.getEntry(password_pro___in));
        }
        if (password_pro___not___in != null) {
            joiner.add("password_pro___not___in: " + GraphQLRequestSerializer.getEntry(password_pro___not___in));
        }
        if (password_pro___lt != null) {
            joiner.add("password_pro___lt: " + GraphQLRequestSerializer.getEntry(password_pro___lt));
        }
        if (password_pro___lte != null) {
            joiner.add("password_pro___lte: " + GraphQLRequestSerializer.getEntry(password_pro___lte));
        }
        if (password_pro___gt != null) {
            joiner.add("password_pro___gt: " + GraphQLRequestSerializer.getEntry(password_pro___gt));
        }
        if (password_pro___gte != null) {
            joiner.add("password_pro___gte: " + GraphQLRequestSerializer.getEntry(password_pro___gte));
        }
        if (password_pro___contains != null) {
            joiner.add("password_pro___contains: " + GraphQLRequestSerializer.getEntry(password_pro___contains));
        }
        if (password_pro___not___contains != null) {
            joiner.add("password_pro___not___contains: " + GraphQLRequestSerializer.getEntry(password_pro___not___contains));
        }
        if (password_pro___starts_with != null) {
            joiner.add("password_pro___starts_with: " + GraphQLRequestSerializer.getEntry(password_pro___starts_with));
        }
        if (password_pro___not___starts_with != null) {
            joiner.add("password_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(password_pro___not___starts_with));
        }
        if (password_pro___ends_with != null) {
            joiner.add("password_pro___ends_with: " + GraphQLRequestSerializer.getEntry(password_pro___ends_with));
        }
        if (password_pro___not___ends_with != null) {
            joiner.add("password_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(password_pro___not___ends_with));
        }
        if (sessione_pro___eq != null) {
            joiner.add("sessione_pro___eq: " + GraphQLRequestSerializer.getEntry(sessione_pro___eq));
        }
        if (sessione_pro___ne != null) {
            joiner.add("sessione_pro___ne: " + GraphQLRequestSerializer.getEntry(sessione_pro___ne));
        }
        if (sessione_pro___null != null) {
            joiner.add("sessione_pro___null: " + GraphQLRequestSerializer.getEntry(sessione_pro___null));
        }
        if (sessione_pro___not___null != null) {
            joiner.add("sessione_pro___not___null: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___null));
        }
        if (sessione_pro___in != null) {
            joiner.add("sessione_pro___in: " + GraphQLRequestSerializer.getEntry(sessione_pro___in));
        }
        if (sessione_pro___not___in != null) {
            joiner.add("sessione_pro___not___in: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___in));
        }
        if (sessione_pro___lt != null) {
            joiner.add("sessione_pro___lt: " + GraphQLRequestSerializer.getEntry(sessione_pro___lt));
        }
        if (sessione_pro___lte != null) {
            joiner.add("sessione_pro___lte: " + GraphQLRequestSerializer.getEntry(sessione_pro___lte));
        }
        if (sessione_pro___gt != null) {
            joiner.add("sessione_pro___gt: " + GraphQLRequestSerializer.getEntry(sessione_pro___gt));
        }
        if (sessione_pro___gte != null) {
            joiner.add("sessione_pro___gte: " + GraphQLRequestSerializer.getEntry(sessione_pro___gte));
        }
        if (sessione_pro___contains != null) {
            joiner.add("sessione_pro___contains: " + GraphQLRequestSerializer.getEntry(sessione_pro___contains));
        }
        if (sessione_pro___not___contains != null) {
            joiner.add("sessione_pro___not___contains: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___contains));
        }
        if (sessione_pro___starts_with != null) {
            joiner.add("sessione_pro___starts_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___starts_with));
        }
        if (sessione_pro___not___starts_with != null) {
            joiner.add("sessione_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___starts_with));
        }
        if (sessione_pro___ends_with != null) {
            joiner.add("sessione_pro___ends_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___ends_with));
        }
        if (sessione_pro___not___ends_with != null) {
            joiner.add("sessione_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___ends_with));
        }
        if (studi_pro_abilitati___eq != null) {
            joiner.add("studi_pro_abilitati___eq: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___eq));
        }
        if (studi_pro_abilitati___ne != null) {
            joiner.add("studi_pro_abilitati___ne: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___ne));
        }
        if (studi_pro_abilitati___null != null) {
            joiner.add("studi_pro_abilitati___null: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___null));
        }
        if (studi_pro_abilitati___not___null != null) {
            joiner.add("studi_pro_abilitati___not___null: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___null));
        }
        if (studi_pro_abilitati___in != null) {
            joiner.add("studi_pro_abilitati___in: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___in));
        }
        if (studi_pro_abilitati___not___in != null) {
            joiner.add("studi_pro_abilitati___not___in: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___in));
        }
        if (studi_pro_abilitati___lt != null) {
            joiner.add("studi_pro_abilitati___lt: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___lt));
        }
        if (studi_pro_abilitati___lte != null) {
            joiner.add("studi_pro_abilitati___lte: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___lte));
        }
        if (studi_pro_abilitati___gt != null) {
            joiner.add("studi_pro_abilitati___gt: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___gt));
        }
        if (studi_pro_abilitati___gte != null) {
            joiner.add("studi_pro_abilitati___gte: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___gte));
        }
        if (studi_pro_abilitati___contains != null) {
            joiner.add("studi_pro_abilitati___contains: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___contains));
        }
        if (studi_pro_abilitati___not___contains != null) {
            joiner.add("studi_pro_abilitati___not___contains: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___contains));
        }
        if (studi_pro_abilitati___starts_with != null) {
            joiner.add("studi_pro_abilitati___starts_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___starts_with));
        }
        if (studi_pro_abilitati___not___starts_with != null) {
            joiner.add("studi_pro_abilitati___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___starts_with));
        }
        if (studi_pro_abilitati___ends_with != null) {
            joiner.add("studi_pro_abilitati___ends_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___ends_with));
        }
        if (studi_pro_abilitati___not___ends_with != null) {
            joiner.add("studi_pro_abilitati___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___ends_with));
        }
        if (token_notifiche_pro___eq != null) {
            joiner.add("token_notifiche_pro___eq: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___eq));
        }
        if (token_notifiche_pro___ne != null) {
            joiner.add("token_notifiche_pro___ne: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___ne));
        }
        if (token_notifiche_pro___null != null) {
            joiner.add("token_notifiche_pro___null: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___null));
        }
        if (token_notifiche_pro___not___null != null) {
            joiner.add("token_notifiche_pro___not___null: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___null));
        }
        if (token_notifiche_pro___in != null) {
            joiner.add("token_notifiche_pro___in: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___in));
        }
        if (token_notifiche_pro___not___in != null) {
            joiner.add("token_notifiche_pro___not___in: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___in));
        }
        if (token_notifiche_pro___lt != null) {
            joiner.add("token_notifiche_pro___lt: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___lt));
        }
        if (token_notifiche_pro___lte != null) {
            joiner.add("token_notifiche_pro___lte: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___lte));
        }
        if (token_notifiche_pro___gt != null) {
            joiner.add("token_notifiche_pro___gt: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___gt));
        }
        if (token_notifiche_pro___gte != null) {
            joiner.add("token_notifiche_pro___gte: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___gte));
        }
        if (token_notifiche_pro___contains != null) {
            joiner.add("token_notifiche_pro___contains: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___contains));
        }
        if (token_notifiche_pro___not___contains != null) {
            joiner.add("token_notifiche_pro___not___contains: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___contains));
        }
        if (token_notifiche_pro___starts_with != null) {
            joiner.add("token_notifiche_pro___starts_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___starts_with));
        }
        if (token_notifiche_pro___not___starts_with != null) {
            joiner.add("token_notifiche_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___starts_with));
        }
        if (token_notifiche_pro___ends_with != null) {
            joiner.add("token_notifiche_pro___ends_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___ends_with));
        }
        if (token_notifiche_pro___not___ends_with != null) {
            joiner.add("token_notifiche_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___ends_with));
        }
        if (username_pro___eq != null) {
            joiner.add("username_pro___eq: " + GraphQLRequestSerializer.getEntry(username_pro___eq));
        }
        if (username_pro___ne != null) {
            joiner.add("username_pro___ne: " + GraphQLRequestSerializer.getEntry(username_pro___ne));
        }
        if (username_pro___null != null) {
            joiner.add("username_pro___null: " + GraphQLRequestSerializer.getEntry(username_pro___null));
        }
        if (username_pro___not___null != null) {
            joiner.add("username_pro___not___null: " + GraphQLRequestSerializer.getEntry(username_pro___not___null));
        }
        if (username_pro___in != null) {
            joiner.add("username_pro___in: " + GraphQLRequestSerializer.getEntry(username_pro___in));
        }
        if (username_pro___not___in != null) {
            joiner.add("username_pro___not___in: " + GraphQLRequestSerializer.getEntry(username_pro___not___in));
        }
        if (username_pro___lt != null) {
            joiner.add("username_pro___lt: " + GraphQLRequestSerializer.getEntry(username_pro___lt));
        }
        if (username_pro___lte != null) {
            joiner.add("username_pro___lte: " + GraphQLRequestSerializer.getEntry(username_pro___lte));
        }
        if (username_pro___gt != null) {
            joiner.add("username_pro___gt: " + GraphQLRequestSerializer.getEntry(username_pro___gt));
        }
        if (username_pro___gte != null) {
            joiner.add("username_pro___gte: " + GraphQLRequestSerializer.getEntry(username_pro___gte));
        }
        if (username_pro___contains != null) {
            joiner.add("username_pro___contains: " + GraphQLRequestSerializer.getEntry(username_pro___contains));
        }
        if (username_pro___not___contains != null) {
            joiner.add("username_pro___not___contains: " + GraphQLRequestSerializer.getEntry(username_pro___not___contains));
        }
        if (username_pro___starts_with != null) {
            joiner.add("username_pro___starts_with: " + GraphQLRequestSerializer.getEntry(username_pro___starts_with));
        }
        if (username_pro___not___starts_with != null) {
            joiner.add("username_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(username_pro___not___starts_with));
        }
        if (username_pro___ends_with != null) {
            joiner.add("username_pro___ends_with: " + GraphQLRequestSerializer.getEntry(username_pro___ends_with));
        }
        if (username_pro___not___ends_with != null) {
            joiner.add("username_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(username_pro___not___ends_with));
        }
        if (AND != null) {
            joiner.add("AND: " + GraphQLRequestSerializer.getEntry(AND));
        }
        if (OR != null) {
            joiner.add("OR: " + GraphQLRequestSerializer.getEntry(OR));
        }
        if (NOT != null) {
            joiner.add("NOT: " + GraphQLRequestSerializer.getEntry(NOT));
        }
        return joiner.toString();
    }

    public static CliP_PazienteFilterDTO.Builder builder() {
        return new CliP_PazienteFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String _id___eq;
        private String _id___ne;
        private Boolean _id___null;
        private Boolean _id___not___null;
        private java.util.List<String> _id___in;
        private java.util.List<String> _id___not___in;
        private String _id___lt;
        private String _id___lte;
        private String _id___gt;
        private String _id___gte;
        private Integer altezza___eq;
        private Integer altezza___ne;
        private Boolean altezza___null;
        private Boolean altezza___not___null;
        private java.util.List<Integer> altezza___in;
        private java.util.List<Integer> altezza___not___in;
        private Integer altezza___lt;
        private Integer altezza___lte;
        private Integer altezza___gt;
        private Integer altezza___gte;
        private String codice_centro___eq;
        private String codice_centro___ne;
        private Boolean codice_centro___null;
        private Boolean codice_centro___not___null;
        private java.util.List<String> codice_centro___in;
        private java.util.List<String> codice_centro___not___in;
        private String codice_centro___lt;
        private String codice_centro___lte;
        private String codice_centro___gt;
        private String codice_centro___gte;
        private String codice_centro___contains;
        private String codice_centro___not___contains;
        private String codice_centro___starts_with;
        private String codice_centro___not___starts_with;
        private String codice_centro___ends_with;
        private String codice_centro___not___ends_with;
        private String codice_interno___eq;
        private String codice_interno___ne;
        private Boolean codice_interno___null;
        private Boolean codice_interno___not___null;
        private java.util.List<String> codice_interno___in;
        private java.util.List<String> codice_interno___not___in;
        private String codice_interno___lt;
        private String codice_interno___lte;
        private String codice_interno___gt;
        private String codice_interno___gte;
        private String codice_interno___contains;
        private String codice_interno___not___contains;
        private String codice_interno___starts_with;
        private String codice_interno___not___starts_with;
        private String codice_interno___ends_with;
        private String codice_interno___not___ends_with;
        private Boolean importato___eq;
        private Boolean importato___ne;
        private Boolean importato___null;
        private Boolean importato___not___null;
        private String password_pro___eq;
        private String password_pro___ne;
        private Boolean password_pro___null;
        private Boolean password_pro___not___null;
        private java.util.List<String> password_pro___in;
        private java.util.List<String> password_pro___not___in;
        private String password_pro___lt;
        private String password_pro___lte;
        private String password_pro___gt;
        private String password_pro___gte;
        private String password_pro___contains;
        private String password_pro___not___contains;
        private String password_pro___starts_with;
        private String password_pro___not___starts_with;
        private String password_pro___ends_with;
        private String password_pro___not___ends_with;
        private String sessione_pro___eq;
        private String sessione_pro___ne;
        private Boolean sessione_pro___null;
        private Boolean sessione_pro___not___null;
        private java.util.List<String> sessione_pro___in;
        private java.util.List<String> sessione_pro___not___in;
        private String sessione_pro___lt;
        private String sessione_pro___lte;
        private String sessione_pro___gt;
        private String sessione_pro___gte;
        private String sessione_pro___contains;
        private String sessione_pro___not___contains;
        private String sessione_pro___starts_with;
        private String sessione_pro___not___starts_with;
        private String sessione_pro___ends_with;
        private String sessione_pro___not___ends_with;
        private String studi_pro_abilitati___eq;
        private String studi_pro_abilitati___ne;
        private Boolean studi_pro_abilitati___null;
        private Boolean studi_pro_abilitati___not___null;
        private java.util.List<String> studi_pro_abilitati___in;
        private java.util.List<String> studi_pro_abilitati___not___in;
        private String studi_pro_abilitati___lt;
        private String studi_pro_abilitati___lte;
        private String studi_pro_abilitati___gt;
        private String studi_pro_abilitati___gte;
        private String studi_pro_abilitati___contains;
        private String studi_pro_abilitati___not___contains;
        private String studi_pro_abilitati___starts_with;
        private String studi_pro_abilitati___not___starts_with;
        private String studi_pro_abilitati___ends_with;
        private String studi_pro_abilitati___not___ends_with;
        private String token_notifiche_pro___eq;
        private String token_notifiche_pro___ne;
        private Boolean token_notifiche_pro___null;
        private Boolean token_notifiche_pro___not___null;
        private java.util.List<String> token_notifiche_pro___in;
        private java.util.List<String> token_notifiche_pro___not___in;
        private String token_notifiche_pro___lt;
        private String token_notifiche_pro___lte;
        private String token_notifiche_pro___gt;
        private String token_notifiche_pro___gte;
        private String token_notifiche_pro___contains;
        private String token_notifiche_pro___not___contains;
        private String token_notifiche_pro___starts_with;
        private String token_notifiche_pro___not___starts_with;
        private String token_notifiche_pro___ends_with;
        private String token_notifiche_pro___not___ends_with;
        private String username_pro___eq;
        private String username_pro___ne;
        private Boolean username_pro___null;
        private Boolean username_pro___not___null;
        private java.util.List<String> username_pro___in;
        private java.util.List<String> username_pro___not___in;
        private String username_pro___lt;
        private String username_pro___lte;
        private String username_pro___gt;
        private String username_pro___gte;
        private String username_pro___contains;
        private String username_pro___not___contains;
        private String username_pro___starts_with;
        private String username_pro___not___starts_with;
        private String username_pro___ends_with;
        private String username_pro___not___ends_with;
        private java.util.List<CliP_PazienteFilterDTO> AND;
        private java.util.List<CliP_PazienteFilterDTO> OR;
        private CliP_PazienteFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder set_id___eq(String _id___eq) {
            this._id___eq = _id___eq;
            return this;
        }

        public Builder set_id___ne(String _id___ne) {
            this._id___ne = _id___ne;
            return this;
        }

        public Builder set_id___null(Boolean _id___null) {
            this._id___null = _id___null;
            return this;
        }

        public Builder set_id___not___null(Boolean _id___not___null) {
            this._id___not___null = _id___not___null;
            return this;
        }

        public Builder set_id___in(java.util.List<String> _id___in) {
            this._id___in = _id___in;
            return this;
        }

        public Builder set_id___not___in(java.util.List<String> _id___not___in) {
            this._id___not___in = _id___not___in;
            return this;
        }

        public Builder set_id___lt(String _id___lt) {
            this._id___lt = _id___lt;
            return this;
        }

        public Builder set_id___lte(String _id___lte) {
            this._id___lte = _id___lte;
            return this;
        }

        public Builder set_id___gt(String _id___gt) {
            this._id___gt = _id___gt;
            return this;
        }

        public Builder set_id___gte(String _id___gte) {
            this._id___gte = _id___gte;
            return this;
        }

        public Builder setAltezza___eq(Integer altezza___eq) {
            this.altezza___eq = altezza___eq;
            return this;
        }

        public Builder setAltezza___ne(Integer altezza___ne) {
            this.altezza___ne = altezza___ne;
            return this;
        }

        public Builder setAltezza___null(Boolean altezza___null) {
            this.altezza___null = altezza___null;
            return this;
        }

        public Builder setAltezza___not___null(Boolean altezza___not___null) {
            this.altezza___not___null = altezza___not___null;
            return this;
        }

        public Builder setAltezza___in(java.util.List<Integer> altezza___in) {
            this.altezza___in = altezza___in;
            return this;
        }

        public Builder setAltezza___not___in(java.util.List<Integer> altezza___not___in) {
            this.altezza___not___in = altezza___not___in;
            return this;
        }

        public Builder setAltezza___lt(Integer altezza___lt) {
            this.altezza___lt = altezza___lt;
            return this;
        }

        public Builder setAltezza___lte(Integer altezza___lte) {
            this.altezza___lte = altezza___lte;
            return this;
        }

        public Builder setAltezza___gt(Integer altezza___gt) {
            this.altezza___gt = altezza___gt;
            return this;
        }

        public Builder setAltezza___gte(Integer altezza___gte) {
            this.altezza___gte = altezza___gte;
            return this;
        }

        public Builder setCodice_centro___eq(String codice_centro___eq) {
            this.codice_centro___eq = codice_centro___eq;
            return this;
        }

        public Builder setCodice_centro___ne(String codice_centro___ne) {
            this.codice_centro___ne = codice_centro___ne;
            return this;
        }

        public Builder setCodice_centro___null(Boolean codice_centro___null) {
            this.codice_centro___null = codice_centro___null;
            return this;
        }

        public Builder setCodice_centro___not___null(Boolean codice_centro___not___null) {
            this.codice_centro___not___null = codice_centro___not___null;
            return this;
        }

        public Builder setCodice_centro___in(java.util.List<String> codice_centro___in) {
            this.codice_centro___in = codice_centro___in;
            return this;
        }

        public Builder setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
            this.codice_centro___not___in = codice_centro___not___in;
            return this;
        }

        public Builder setCodice_centro___lt(String codice_centro___lt) {
            this.codice_centro___lt = codice_centro___lt;
            return this;
        }

        public Builder setCodice_centro___lte(String codice_centro___lte) {
            this.codice_centro___lte = codice_centro___lte;
            return this;
        }

        public Builder setCodice_centro___gt(String codice_centro___gt) {
            this.codice_centro___gt = codice_centro___gt;
            return this;
        }

        public Builder setCodice_centro___gte(String codice_centro___gte) {
            this.codice_centro___gte = codice_centro___gte;
            return this;
        }

        public Builder setCodice_centro___contains(String codice_centro___contains) {
            this.codice_centro___contains = codice_centro___contains;
            return this;
        }

        public Builder setCodice_centro___not___contains(String codice_centro___not___contains) {
            this.codice_centro___not___contains = codice_centro___not___contains;
            return this;
        }

        public Builder setCodice_centro___starts_with(String codice_centro___starts_with) {
            this.codice_centro___starts_with = codice_centro___starts_with;
            return this;
        }

        public Builder setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
            this.codice_centro___not___starts_with = codice_centro___not___starts_with;
            return this;
        }

        public Builder setCodice_centro___ends_with(String codice_centro___ends_with) {
            this.codice_centro___ends_with = codice_centro___ends_with;
            return this;
        }

        public Builder setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
            this.codice_centro___not___ends_with = codice_centro___not___ends_with;
            return this;
        }

        public Builder setCodice_interno___eq(String codice_interno___eq) {
            this.codice_interno___eq = codice_interno___eq;
            return this;
        }

        public Builder setCodice_interno___ne(String codice_interno___ne) {
            this.codice_interno___ne = codice_interno___ne;
            return this;
        }

        public Builder setCodice_interno___null(Boolean codice_interno___null) {
            this.codice_interno___null = codice_interno___null;
            return this;
        }

        public Builder setCodice_interno___not___null(Boolean codice_interno___not___null) {
            this.codice_interno___not___null = codice_interno___not___null;
            return this;
        }

        public Builder setCodice_interno___in(java.util.List<String> codice_interno___in) {
            this.codice_interno___in = codice_interno___in;
            return this;
        }

        public Builder setCodice_interno___not___in(java.util.List<String> codice_interno___not___in) {
            this.codice_interno___not___in = codice_interno___not___in;
            return this;
        }

        public Builder setCodice_interno___lt(String codice_interno___lt) {
            this.codice_interno___lt = codice_interno___lt;
            return this;
        }

        public Builder setCodice_interno___lte(String codice_interno___lte) {
            this.codice_interno___lte = codice_interno___lte;
            return this;
        }

        public Builder setCodice_interno___gt(String codice_interno___gt) {
            this.codice_interno___gt = codice_interno___gt;
            return this;
        }

        public Builder setCodice_interno___gte(String codice_interno___gte) {
            this.codice_interno___gte = codice_interno___gte;
            return this;
        }

        public Builder setCodice_interno___contains(String codice_interno___contains) {
            this.codice_interno___contains = codice_interno___contains;
            return this;
        }

        public Builder setCodice_interno___not___contains(String codice_interno___not___contains) {
            this.codice_interno___not___contains = codice_interno___not___contains;
            return this;
        }

        public Builder setCodice_interno___starts_with(String codice_interno___starts_with) {
            this.codice_interno___starts_with = codice_interno___starts_with;
            return this;
        }

        public Builder setCodice_interno___not___starts_with(String codice_interno___not___starts_with) {
            this.codice_interno___not___starts_with = codice_interno___not___starts_with;
            return this;
        }

        public Builder setCodice_interno___ends_with(String codice_interno___ends_with) {
            this.codice_interno___ends_with = codice_interno___ends_with;
            return this;
        }

        public Builder setCodice_interno___not___ends_with(String codice_interno___not___ends_with) {
            this.codice_interno___not___ends_with = codice_interno___not___ends_with;
            return this;
        }

        public Builder setImportato___eq(Boolean importato___eq) {
            this.importato___eq = importato___eq;
            return this;
        }

        public Builder setImportato___ne(Boolean importato___ne) {
            this.importato___ne = importato___ne;
            return this;
        }

        public Builder setImportato___null(Boolean importato___null) {
            this.importato___null = importato___null;
            return this;
        }

        public Builder setImportato___not___null(Boolean importato___not___null) {
            this.importato___not___null = importato___not___null;
            return this;
        }

        public Builder setPassword_pro___eq(String password_pro___eq) {
            this.password_pro___eq = password_pro___eq;
            return this;
        }

        public Builder setPassword_pro___ne(String password_pro___ne) {
            this.password_pro___ne = password_pro___ne;
            return this;
        }

        public Builder setPassword_pro___null(Boolean password_pro___null) {
            this.password_pro___null = password_pro___null;
            return this;
        }

        public Builder setPassword_pro___not___null(Boolean password_pro___not___null) {
            this.password_pro___not___null = password_pro___not___null;
            return this;
        }

        public Builder setPassword_pro___in(java.util.List<String> password_pro___in) {
            this.password_pro___in = password_pro___in;
            return this;
        }

        public Builder setPassword_pro___not___in(java.util.List<String> password_pro___not___in) {
            this.password_pro___not___in = password_pro___not___in;
            return this;
        }

        public Builder setPassword_pro___lt(String password_pro___lt) {
            this.password_pro___lt = password_pro___lt;
            return this;
        }

        public Builder setPassword_pro___lte(String password_pro___lte) {
            this.password_pro___lte = password_pro___lte;
            return this;
        }

        public Builder setPassword_pro___gt(String password_pro___gt) {
            this.password_pro___gt = password_pro___gt;
            return this;
        }

        public Builder setPassword_pro___gte(String password_pro___gte) {
            this.password_pro___gte = password_pro___gte;
            return this;
        }

        public Builder setPassword_pro___contains(String password_pro___contains) {
            this.password_pro___contains = password_pro___contains;
            return this;
        }

        public Builder setPassword_pro___not___contains(String password_pro___not___contains) {
            this.password_pro___not___contains = password_pro___not___contains;
            return this;
        }

        public Builder setPassword_pro___starts_with(String password_pro___starts_with) {
            this.password_pro___starts_with = password_pro___starts_with;
            return this;
        }

        public Builder setPassword_pro___not___starts_with(String password_pro___not___starts_with) {
            this.password_pro___not___starts_with = password_pro___not___starts_with;
            return this;
        }

        public Builder setPassword_pro___ends_with(String password_pro___ends_with) {
            this.password_pro___ends_with = password_pro___ends_with;
            return this;
        }

        public Builder setPassword_pro___not___ends_with(String password_pro___not___ends_with) {
            this.password_pro___not___ends_with = password_pro___not___ends_with;
            return this;
        }

        public Builder setSessione_pro___eq(String sessione_pro___eq) {
            this.sessione_pro___eq = sessione_pro___eq;
            return this;
        }

        public Builder setSessione_pro___ne(String sessione_pro___ne) {
            this.sessione_pro___ne = sessione_pro___ne;
            return this;
        }

        public Builder setSessione_pro___null(Boolean sessione_pro___null) {
            this.sessione_pro___null = sessione_pro___null;
            return this;
        }

        public Builder setSessione_pro___not___null(Boolean sessione_pro___not___null) {
            this.sessione_pro___not___null = sessione_pro___not___null;
            return this;
        }

        public Builder setSessione_pro___in(java.util.List<String> sessione_pro___in) {
            this.sessione_pro___in = sessione_pro___in;
            return this;
        }

        public Builder setSessione_pro___not___in(java.util.List<String> sessione_pro___not___in) {
            this.sessione_pro___not___in = sessione_pro___not___in;
            return this;
        }

        public Builder setSessione_pro___lt(String sessione_pro___lt) {
            this.sessione_pro___lt = sessione_pro___lt;
            return this;
        }

        public Builder setSessione_pro___lte(String sessione_pro___lte) {
            this.sessione_pro___lte = sessione_pro___lte;
            return this;
        }

        public Builder setSessione_pro___gt(String sessione_pro___gt) {
            this.sessione_pro___gt = sessione_pro___gt;
            return this;
        }

        public Builder setSessione_pro___gte(String sessione_pro___gte) {
            this.sessione_pro___gte = sessione_pro___gte;
            return this;
        }

        public Builder setSessione_pro___contains(String sessione_pro___contains) {
            this.sessione_pro___contains = sessione_pro___contains;
            return this;
        }

        public Builder setSessione_pro___not___contains(String sessione_pro___not___contains) {
            this.sessione_pro___not___contains = sessione_pro___not___contains;
            return this;
        }

        public Builder setSessione_pro___starts_with(String sessione_pro___starts_with) {
            this.sessione_pro___starts_with = sessione_pro___starts_with;
            return this;
        }

        public Builder setSessione_pro___not___starts_with(String sessione_pro___not___starts_with) {
            this.sessione_pro___not___starts_with = sessione_pro___not___starts_with;
            return this;
        }

        public Builder setSessione_pro___ends_with(String sessione_pro___ends_with) {
            this.sessione_pro___ends_with = sessione_pro___ends_with;
            return this;
        }

        public Builder setSessione_pro___not___ends_with(String sessione_pro___not___ends_with) {
            this.sessione_pro___not___ends_with = sessione_pro___not___ends_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___eq(String studi_pro_abilitati___eq) {
            this.studi_pro_abilitati___eq = studi_pro_abilitati___eq;
            return this;
        }

        public Builder setStudi_pro_abilitati___ne(String studi_pro_abilitati___ne) {
            this.studi_pro_abilitati___ne = studi_pro_abilitati___ne;
            return this;
        }

        public Builder setStudi_pro_abilitati___null(Boolean studi_pro_abilitati___null) {
            this.studi_pro_abilitati___null = studi_pro_abilitati___null;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___null(Boolean studi_pro_abilitati___not___null) {
            this.studi_pro_abilitati___not___null = studi_pro_abilitati___not___null;
            return this;
        }

        public Builder setStudi_pro_abilitati___in(java.util.List<String> studi_pro_abilitati___in) {
            this.studi_pro_abilitati___in = studi_pro_abilitati___in;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___in(java.util.List<String> studi_pro_abilitati___not___in) {
            this.studi_pro_abilitati___not___in = studi_pro_abilitati___not___in;
            return this;
        }

        public Builder setStudi_pro_abilitati___lt(String studi_pro_abilitati___lt) {
            this.studi_pro_abilitati___lt = studi_pro_abilitati___lt;
            return this;
        }

        public Builder setStudi_pro_abilitati___lte(String studi_pro_abilitati___lte) {
            this.studi_pro_abilitati___lte = studi_pro_abilitati___lte;
            return this;
        }

        public Builder setStudi_pro_abilitati___gt(String studi_pro_abilitati___gt) {
            this.studi_pro_abilitati___gt = studi_pro_abilitati___gt;
            return this;
        }

        public Builder setStudi_pro_abilitati___gte(String studi_pro_abilitati___gte) {
            this.studi_pro_abilitati___gte = studi_pro_abilitati___gte;
            return this;
        }

        public Builder setStudi_pro_abilitati___contains(String studi_pro_abilitati___contains) {
            this.studi_pro_abilitati___contains = studi_pro_abilitati___contains;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___contains(String studi_pro_abilitati___not___contains) {
            this.studi_pro_abilitati___not___contains = studi_pro_abilitati___not___contains;
            return this;
        }

        public Builder setStudi_pro_abilitati___starts_with(String studi_pro_abilitati___starts_with) {
            this.studi_pro_abilitati___starts_with = studi_pro_abilitati___starts_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___starts_with(String studi_pro_abilitati___not___starts_with) {
            this.studi_pro_abilitati___not___starts_with = studi_pro_abilitati___not___starts_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___ends_with(String studi_pro_abilitati___ends_with) {
            this.studi_pro_abilitati___ends_with = studi_pro_abilitati___ends_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___ends_with(String studi_pro_abilitati___not___ends_with) {
            this.studi_pro_abilitati___not___ends_with = studi_pro_abilitati___not___ends_with;
            return this;
        }

        public Builder setToken_notifiche_pro___eq(String token_notifiche_pro___eq) {
            this.token_notifiche_pro___eq = token_notifiche_pro___eq;
            return this;
        }

        public Builder setToken_notifiche_pro___ne(String token_notifiche_pro___ne) {
            this.token_notifiche_pro___ne = token_notifiche_pro___ne;
            return this;
        }

        public Builder setToken_notifiche_pro___null(Boolean token_notifiche_pro___null) {
            this.token_notifiche_pro___null = token_notifiche_pro___null;
            return this;
        }

        public Builder setToken_notifiche_pro___not___null(Boolean token_notifiche_pro___not___null) {
            this.token_notifiche_pro___not___null = token_notifiche_pro___not___null;
            return this;
        }

        public Builder setToken_notifiche_pro___in(java.util.List<String> token_notifiche_pro___in) {
            this.token_notifiche_pro___in = token_notifiche_pro___in;
            return this;
        }

        public Builder setToken_notifiche_pro___not___in(java.util.List<String> token_notifiche_pro___not___in) {
            this.token_notifiche_pro___not___in = token_notifiche_pro___not___in;
            return this;
        }

        public Builder setToken_notifiche_pro___lt(String token_notifiche_pro___lt) {
            this.token_notifiche_pro___lt = token_notifiche_pro___lt;
            return this;
        }

        public Builder setToken_notifiche_pro___lte(String token_notifiche_pro___lte) {
            this.token_notifiche_pro___lte = token_notifiche_pro___lte;
            return this;
        }

        public Builder setToken_notifiche_pro___gt(String token_notifiche_pro___gt) {
            this.token_notifiche_pro___gt = token_notifiche_pro___gt;
            return this;
        }

        public Builder setToken_notifiche_pro___gte(String token_notifiche_pro___gte) {
            this.token_notifiche_pro___gte = token_notifiche_pro___gte;
            return this;
        }

        public Builder setToken_notifiche_pro___contains(String token_notifiche_pro___contains) {
            this.token_notifiche_pro___contains = token_notifiche_pro___contains;
            return this;
        }

        public Builder setToken_notifiche_pro___not___contains(String token_notifiche_pro___not___contains) {
            this.token_notifiche_pro___not___contains = token_notifiche_pro___not___contains;
            return this;
        }

        public Builder setToken_notifiche_pro___starts_with(String token_notifiche_pro___starts_with) {
            this.token_notifiche_pro___starts_with = token_notifiche_pro___starts_with;
            return this;
        }

        public Builder setToken_notifiche_pro___not___starts_with(String token_notifiche_pro___not___starts_with) {
            this.token_notifiche_pro___not___starts_with = token_notifiche_pro___not___starts_with;
            return this;
        }

        public Builder setToken_notifiche_pro___ends_with(String token_notifiche_pro___ends_with) {
            this.token_notifiche_pro___ends_with = token_notifiche_pro___ends_with;
            return this;
        }

        public Builder setToken_notifiche_pro___not___ends_with(String token_notifiche_pro___not___ends_with) {
            this.token_notifiche_pro___not___ends_with = token_notifiche_pro___not___ends_with;
            return this;
        }

        public Builder setUsername_pro___eq(String username_pro___eq) {
            this.username_pro___eq = username_pro___eq;
            return this;
        }

        public Builder setUsername_pro___ne(String username_pro___ne) {
            this.username_pro___ne = username_pro___ne;
            return this;
        }

        public Builder setUsername_pro___null(Boolean username_pro___null) {
            this.username_pro___null = username_pro___null;
            return this;
        }

        public Builder setUsername_pro___not___null(Boolean username_pro___not___null) {
            this.username_pro___not___null = username_pro___not___null;
            return this;
        }

        public Builder setUsername_pro___in(java.util.List<String> username_pro___in) {
            this.username_pro___in = username_pro___in;
            return this;
        }

        public Builder setUsername_pro___not___in(java.util.List<String> username_pro___not___in) {
            this.username_pro___not___in = username_pro___not___in;
            return this;
        }

        public Builder setUsername_pro___lt(String username_pro___lt) {
            this.username_pro___lt = username_pro___lt;
            return this;
        }

        public Builder setUsername_pro___lte(String username_pro___lte) {
            this.username_pro___lte = username_pro___lte;
            return this;
        }

        public Builder setUsername_pro___gt(String username_pro___gt) {
            this.username_pro___gt = username_pro___gt;
            return this;
        }

        public Builder setUsername_pro___gte(String username_pro___gte) {
            this.username_pro___gte = username_pro___gte;
            return this;
        }

        public Builder setUsername_pro___contains(String username_pro___contains) {
            this.username_pro___contains = username_pro___contains;
            return this;
        }

        public Builder setUsername_pro___not___contains(String username_pro___not___contains) {
            this.username_pro___not___contains = username_pro___not___contains;
            return this;
        }

        public Builder setUsername_pro___starts_with(String username_pro___starts_with) {
            this.username_pro___starts_with = username_pro___starts_with;
            return this;
        }

        public Builder setUsername_pro___not___starts_with(String username_pro___not___starts_with) {
            this.username_pro___not___starts_with = username_pro___not___starts_with;
            return this;
        }

        public Builder setUsername_pro___ends_with(String username_pro___ends_with) {
            this.username_pro___ends_with = username_pro___ends_with;
            return this;
        }

        public Builder setUsername_pro___not___ends_with(String username_pro___not___ends_with) {
            this.username_pro___not___ends_with = username_pro___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliP_PazienteFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliP_PazienteFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliP_PazienteFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliP_PazienteFilterDTO build() {
            CliP_PazienteFilterDTO result = new CliP_PazienteFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.set_id___eq(this._id___eq);
            result.set_id___ne(this._id___ne);
            result.set_id___null(this._id___null);
            result.set_id___not___null(this._id___not___null);
            result.set_id___in(this._id___in);
            result.set_id___not___in(this._id___not___in);
            result.set_id___lt(this._id___lt);
            result.set_id___lte(this._id___lte);
            result.set_id___gt(this._id___gt);
            result.set_id___gte(this._id___gte);
            result.setAltezza___eq(this.altezza___eq);
            result.setAltezza___ne(this.altezza___ne);
            result.setAltezza___null(this.altezza___null);
            result.setAltezza___not___null(this.altezza___not___null);
            result.setAltezza___in(this.altezza___in);
            result.setAltezza___not___in(this.altezza___not___in);
            result.setAltezza___lt(this.altezza___lt);
            result.setAltezza___lte(this.altezza___lte);
            result.setAltezza___gt(this.altezza___gt);
            result.setAltezza___gte(this.altezza___gte);
            result.setCodice_centro___eq(this.codice_centro___eq);
            result.setCodice_centro___ne(this.codice_centro___ne);
            result.setCodice_centro___null(this.codice_centro___null);
            result.setCodice_centro___not___null(this.codice_centro___not___null);
            result.setCodice_centro___in(this.codice_centro___in);
            result.setCodice_centro___not___in(this.codice_centro___not___in);
            result.setCodice_centro___lt(this.codice_centro___lt);
            result.setCodice_centro___lte(this.codice_centro___lte);
            result.setCodice_centro___gt(this.codice_centro___gt);
            result.setCodice_centro___gte(this.codice_centro___gte);
            result.setCodice_centro___contains(this.codice_centro___contains);
            result.setCodice_centro___not___contains(this.codice_centro___not___contains);
            result.setCodice_centro___starts_with(this.codice_centro___starts_with);
            result.setCodice_centro___not___starts_with(this.codice_centro___not___starts_with);
            result.setCodice_centro___ends_with(this.codice_centro___ends_with);
            result.setCodice_centro___not___ends_with(this.codice_centro___not___ends_with);
            result.setCodice_interno___eq(this.codice_interno___eq);
            result.setCodice_interno___ne(this.codice_interno___ne);
            result.setCodice_interno___null(this.codice_interno___null);
            result.setCodice_interno___not___null(this.codice_interno___not___null);
            result.setCodice_interno___in(this.codice_interno___in);
            result.setCodice_interno___not___in(this.codice_interno___not___in);
            result.setCodice_interno___lt(this.codice_interno___lt);
            result.setCodice_interno___lte(this.codice_interno___lte);
            result.setCodice_interno___gt(this.codice_interno___gt);
            result.setCodice_interno___gte(this.codice_interno___gte);
            result.setCodice_interno___contains(this.codice_interno___contains);
            result.setCodice_interno___not___contains(this.codice_interno___not___contains);
            result.setCodice_interno___starts_with(this.codice_interno___starts_with);
            result.setCodice_interno___not___starts_with(this.codice_interno___not___starts_with);
            result.setCodice_interno___ends_with(this.codice_interno___ends_with);
            result.setCodice_interno___not___ends_with(this.codice_interno___not___ends_with);
            result.setImportato___eq(this.importato___eq);
            result.setImportato___ne(this.importato___ne);
            result.setImportato___null(this.importato___null);
            result.setImportato___not___null(this.importato___not___null);
            result.setPassword_pro___eq(this.password_pro___eq);
            result.setPassword_pro___ne(this.password_pro___ne);
            result.setPassword_pro___null(this.password_pro___null);
            result.setPassword_pro___not___null(this.password_pro___not___null);
            result.setPassword_pro___in(this.password_pro___in);
            result.setPassword_pro___not___in(this.password_pro___not___in);
            result.setPassword_pro___lt(this.password_pro___lt);
            result.setPassword_pro___lte(this.password_pro___lte);
            result.setPassword_pro___gt(this.password_pro___gt);
            result.setPassword_pro___gte(this.password_pro___gte);
            result.setPassword_pro___contains(this.password_pro___contains);
            result.setPassword_pro___not___contains(this.password_pro___not___contains);
            result.setPassword_pro___starts_with(this.password_pro___starts_with);
            result.setPassword_pro___not___starts_with(this.password_pro___not___starts_with);
            result.setPassword_pro___ends_with(this.password_pro___ends_with);
            result.setPassword_pro___not___ends_with(this.password_pro___not___ends_with);
            result.setSessione_pro___eq(this.sessione_pro___eq);
            result.setSessione_pro___ne(this.sessione_pro___ne);
            result.setSessione_pro___null(this.sessione_pro___null);
            result.setSessione_pro___not___null(this.sessione_pro___not___null);
            result.setSessione_pro___in(this.sessione_pro___in);
            result.setSessione_pro___not___in(this.sessione_pro___not___in);
            result.setSessione_pro___lt(this.sessione_pro___lt);
            result.setSessione_pro___lte(this.sessione_pro___lte);
            result.setSessione_pro___gt(this.sessione_pro___gt);
            result.setSessione_pro___gte(this.sessione_pro___gte);
            result.setSessione_pro___contains(this.sessione_pro___contains);
            result.setSessione_pro___not___contains(this.sessione_pro___not___contains);
            result.setSessione_pro___starts_with(this.sessione_pro___starts_with);
            result.setSessione_pro___not___starts_with(this.sessione_pro___not___starts_with);
            result.setSessione_pro___ends_with(this.sessione_pro___ends_with);
            result.setSessione_pro___not___ends_with(this.sessione_pro___not___ends_with);
            result.setStudi_pro_abilitati___eq(this.studi_pro_abilitati___eq);
            result.setStudi_pro_abilitati___ne(this.studi_pro_abilitati___ne);
            result.setStudi_pro_abilitati___null(this.studi_pro_abilitati___null);
            result.setStudi_pro_abilitati___not___null(this.studi_pro_abilitati___not___null);
            result.setStudi_pro_abilitati___in(this.studi_pro_abilitati___in);
            result.setStudi_pro_abilitati___not___in(this.studi_pro_abilitati___not___in);
            result.setStudi_pro_abilitati___lt(this.studi_pro_abilitati___lt);
            result.setStudi_pro_abilitati___lte(this.studi_pro_abilitati___lte);
            result.setStudi_pro_abilitati___gt(this.studi_pro_abilitati___gt);
            result.setStudi_pro_abilitati___gte(this.studi_pro_abilitati___gte);
            result.setStudi_pro_abilitati___contains(this.studi_pro_abilitati___contains);
            result.setStudi_pro_abilitati___not___contains(this.studi_pro_abilitati___not___contains);
            result.setStudi_pro_abilitati___starts_with(this.studi_pro_abilitati___starts_with);
            result.setStudi_pro_abilitati___not___starts_with(this.studi_pro_abilitati___not___starts_with);
            result.setStudi_pro_abilitati___ends_with(this.studi_pro_abilitati___ends_with);
            result.setStudi_pro_abilitati___not___ends_with(this.studi_pro_abilitati___not___ends_with);
            result.setToken_notifiche_pro___eq(this.token_notifiche_pro___eq);
            result.setToken_notifiche_pro___ne(this.token_notifiche_pro___ne);
            result.setToken_notifiche_pro___null(this.token_notifiche_pro___null);
            result.setToken_notifiche_pro___not___null(this.token_notifiche_pro___not___null);
            result.setToken_notifiche_pro___in(this.token_notifiche_pro___in);
            result.setToken_notifiche_pro___not___in(this.token_notifiche_pro___not___in);
            result.setToken_notifiche_pro___lt(this.token_notifiche_pro___lt);
            result.setToken_notifiche_pro___lte(this.token_notifiche_pro___lte);
            result.setToken_notifiche_pro___gt(this.token_notifiche_pro___gt);
            result.setToken_notifiche_pro___gte(this.token_notifiche_pro___gte);
            result.setToken_notifiche_pro___contains(this.token_notifiche_pro___contains);
            result.setToken_notifiche_pro___not___contains(this.token_notifiche_pro___not___contains);
            result.setToken_notifiche_pro___starts_with(this.token_notifiche_pro___starts_with);
            result.setToken_notifiche_pro___not___starts_with(this.token_notifiche_pro___not___starts_with);
            result.setToken_notifiche_pro___ends_with(this.token_notifiche_pro___ends_with);
            result.setToken_notifiche_pro___not___ends_with(this.token_notifiche_pro___not___ends_with);
            result.setUsername_pro___eq(this.username_pro___eq);
            result.setUsername_pro___ne(this.username_pro___ne);
            result.setUsername_pro___null(this.username_pro___null);
            result.setUsername_pro___not___null(this.username_pro___not___null);
            result.setUsername_pro___in(this.username_pro___in);
            result.setUsername_pro___not___in(this.username_pro___not___in);
            result.setUsername_pro___lt(this.username_pro___lt);
            result.setUsername_pro___lte(this.username_pro___lte);
            result.setUsername_pro___gt(this.username_pro___gt);
            result.setUsername_pro___gte(this.username_pro___gte);
            result.setUsername_pro___contains(this.username_pro___contains);
            result.setUsername_pro___not___contains(this.username_pro___not___contains);
            result.setUsername_pro___starts_with(this.username_pro___starts_with);
            result.setUsername_pro___not___starts_with(this.username_pro___not___starts_with);
            result.setUsername_pro___ends_with(this.username_pro___ends_with);
            result.setUsername_pro___not___ends_with(this.username_pro___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
