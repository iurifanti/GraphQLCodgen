package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Risposta.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRispostaFilterDTO implements java.io.Serializable {

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
    private Boolean alert_obbligatoria___eq;
    private Boolean alert_obbligatoria___ne;
    private Boolean alert_obbligatoria___null;
    private Boolean alert_obbligatoria___not___null;
    private String codice_interno_i___eq;
    private String codice_interno_i___ne;
    private Boolean codice_interno_i___null;
    private Boolean codice_interno_i___not___null;
    private java.util.List<String> codice_interno_i___in;
    private java.util.List<String> codice_interno_i___not___in;
    private String codice_interno_i___lt;
    private String codice_interno_i___lte;
    private String codice_interno_i___gt;
    private String codice_interno_i___gte;
    private String codice_interno_i___contains;
    private String codice_interno_i___not___contains;
    private String codice_interno_i___starts_with;
    private String codice_interno_i___not___starts_with;
    private String codice_interno_i___ends_with;
    private String codice_interno_i___not___ends_with;
    private Boolean decimale___eq;
    private Boolean decimale___ne;
    private Boolean decimale___null;
    private Boolean decimale___not___null;
    private String domanda___eq;
    private String domanda___ne;
    private Boolean domanda___null;
    private Boolean domanda___not___null;
    private java.util.List<String> domanda___in;
    private java.util.List<String> domanda___not___in;
    private String domanda___lt;
    private String domanda___lte;
    private String domanda___gt;
    private String domanda___gte;
    private String domanda___contains;
    private String domanda___not___contains;
    private String domanda___starts_with;
    private String domanda___not___starts_with;
    private String domanda___ends_with;
    private String domanda___not___ends_with;
    private Integer domanda_id___eq;
    private Integer domanda_id___ne;
    private Boolean domanda_id___null;
    private Boolean domanda_id___not___null;
    private java.util.List<Integer> domanda_id___in;
    private java.util.List<Integer> domanda_id___not___in;
    private Integer domanda_id___lt;
    private Integer domanda_id___lte;
    private Integer domanda_id___gt;
    private Integer domanda_id___gte;
    private String domande_questionario_ids___eq;
    private String domande_questionario_ids___ne;
    private Boolean domande_questionario_ids___null;
    private Boolean domande_questionario_ids___not___null;
    private java.util.List<String> domande_questionario_ids___in;
    private java.util.List<String> domande_questionario_ids___not___in;
    private String domande_questionario_ids___lt;
    private String domande_questionario_ids___lte;
    private String domande_questionario_ids___gt;
    private String domande_questionario_ids___gte;
    private String domande_questionario_ids___contains;
    private String domande_questionario_ids___not___contains;
    private String domande_questionario_ids___starts_with;
    private String domande_questionario_ids___not___starts_with;
    private String domande_questionario_ids___ends_with;
    private String domande_questionario_ids___not___ends_with;
    private Integer id_risposta_peso___eq;
    private Integer id_risposta_peso___ne;
    private Boolean id_risposta_peso___null;
    private Boolean id_risposta_peso___not___null;
    private java.util.List<Integer> id_risposta_peso___in;
    private java.util.List<Integer> id_risposta_peso___not___in;
    private Integer id_risposta_peso___lt;
    private Integer id_risposta_peso___lte;
    private Integer id_risposta_peso___gt;
    private Integer id_risposta_peso___gte;
    private Boolean intero___eq;
    private Boolean intero___ne;
    private Boolean intero___null;
    private Boolean intero___not___null;
    private Boolean obbligatoria___eq;
    private Boolean obbligatoria___ne;
    private Boolean obbligatoria___null;
    private Boolean obbligatoria___not___null;
    private Boolean opzioni_multipla___eq;
    private Boolean opzioni_multipla___ne;
    private Boolean opzioni_multipla___null;
    private Boolean opzioni_multipla___not___null;
    private Boolean opzioni_singola___eq;
    private Boolean opzioni_singola___ne;
    private Boolean opzioni_singola___null;
    private Boolean opzioni_singola___not___null;
    private Integer ordine___eq;
    private Integer ordine___ne;
    private Boolean ordine___null;
    private Boolean ordine___not___null;
    private java.util.List<Integer> ordine___in;
    private java.util.List<Integer> ordine___not___in;
    private Integer ordine___lt;
    private Integer ordine___lte;
    private Integer ordine___gt;
    private Integer ordine___gte;
    private Integer ordine_risposta___eq;
    private Integer ordine_risposta___ne;
    private Boolean ordine_risposta___null;
    private Boolean ordine_risposta___not___null;
    private java.util.List<Integer> ordine_risposta___in;
    private java.util.List<Integer> ordine_risposta___not___in;
    private Integer ordine_risposta___lt;
    private Integer ordine_risposta___lte;
    private Integer ordine_risposta___gt;
    private Integer ordine_risposta___gte;
    private String peso_punteggio___eq;
    private String peso_punteggio___ne;
    private Boolean peso_punteggio___null;
    private Boolean peso_punteggio___not___null;
    private java.util.List<String> peso_punteggio___in;
    private java.util.List<String> peso_punteggio___not___in;
    private String peso_punteggio___lt;
    private String peso_punteggio___lte;
    private String peso_punteggio___gt;
    private String peso_punteggio___gte;
    private String punteggio_risposta___eq;
    private String punteggio_risposta___ne;
    private Boolean punteggio_risposta___null;
    private Boolean punteggio_risposta___not___null;
    private java.util.List<String> punteggio_risposta___in;
    private java.util.List<String> punteggio_risposta___not___in;
    private String punteggio_risposta___lt;
    private String punteggio_risposta___lte;
    private String punteggio_risposta___gt;
    private String punteggio_risposta___gte;
    private String punteggio_totale___eq;
    private String punteggio_totale___ne;
    private Boolean punteggio_totale___null;
    private Boolean punteggio_totale___not___null;
    private java.util.List<String> punteggio_totale___in;
    private java.util.List<String> punteggio_totale___not___in;
    private String punteggio_totale___lt;
    private String punteggio_totale___lte;
    private String punteggio_totale___gt;
    private String punteggio_totale___gte;
    private Integer questionario_id___eq;
    private Integer questionario_id___ne;
    private Boolean questionario_id___null;
    private Boolean questionario_id___not___null;
    private java.util.List<Integer> questionario_id___in;
    private java.util.List<Integer> questionario_id___not___in;
    private Integer questionario_id___lt;
    private Integer questionario_id___lte;
    private Integer questionario_id___gt;
    private Integer questionario_id___gte;
    private Integer questionario_pro_app_id___eq;
    private Integer questionario_pro_app_id___ne;
    private Boolean questionario_pro_app_id___null;
    private Boolean questionario_pro_app_id___not___null;
    private java.util.List<Integer> questionario_pro_app_id___in;
    private java.util.List<Integer> questionario_pro_app_id___not___in;
    private Integer questionario_pro_app_id___lt;
    private Integer questionario_pro_app_id___lte;
    private Integer questionario_pro_app_id___gt;
    private Integer questionario_pro_app_id___gte;
    private String risposta___eq;
    private String risposta___ne;
    private Boolean risposta___null;
    private Boolean risposta___not___null;
    private java.util.List<String> risposta___in;
    private java.util.List<String> risposta___not___in;
    private String risposta___lt;
    private String risposta___lte;
    private String risposta___gt;
    private String risposta___gte;
    private String risposta___contains;
    private String risposta___not___contains;
    private String risposta___starts_with;
    private String risposta___not___starts_with;
    private String risposta___ends_with;
    private String risposta___not___ends_with;
    private String risposta_dec___eq;
    private String risposta_dec___ne;
    private Boolean risposta_dec___null;
    private Boolean risposta_dec___not___null;
    private java.util.List<String> risposta_dec___in;
    private java.util.List<String> risposta_dec___not___in;
    private String risposta_dec___lt;
    private String risposta_dec___lte;
    private String risposta_dec___gt;
    private String risposta_dec___gte;
    private Integer risposta_int___eq;
    private Integer risposta_int___ne;
    private Boolean risposta_int___null;
    private Boolean risposta_int___not___null;
    private java.util.List<Integer> risposta_int___in;
    private java.util.List<Integer> risposta_int___not___in;
    private Integer risposta_int___lt;
    private Integer risposta_int___lte;
    private Integer risposta_int___gt;
    private Integer risposta_int___gte;
    private String risposta_multipla___eq;
    private String risposta_multipla___ne;
    private Boolean risposta_multipla___null;
    private Boolean risposta_multipla___not___null;
    private java.util.List<String> risposta_multipla___in;
    private java.util.List<String> risposta_multipla___not___in;
    private String risposta_multipla___lt;
    private String risposta_multipla___lte;
    private String risposta_multipla___gt;
    private String risposta_multipla___gte;
    private String risposta_multipla___contains;
    private String risposta_multipla___not___contains;
    private String risposta_multipla___starts_with;
    private String risposta_multipla___not___starts_with;
    private String risposta_multipla___ends_with;
    private String risposta_multipla___not___ends_with;
    private String risposta_str___eq;
    private String risposta_str___ne;
    private Boolean risposta_str___null;
    private Boolean risposta_str___not___null;
    private java.util.List<String> risposta_str___in;
    private java.util.List<String> risposta_str___not___in;
    private String risposta_str___lt;
    private String risposta_str___lte;
    private String risposta_str___gt;
    private String risposta_str___gte;
    private String risposta_str___contains;
    private String risposta_str___not___contains;
    private String risposta_str___starts_with;
    private String risposta_str___not___starts_with;
    private String risposta_str___ends_with;
    private String risposta_str___not___ends_with;
    private Boolean scala_intera___eq;
    private Boolean scala_intera___ne;
    private Boolean scala_intera___null;
    private Boolean scala_intera___not___null;
    private Boolean solo_intro___eq;
    private Boolean solo_intro___ne;
    private Boolean solo_intro___null;
    private Boolean solo_intro___not___null;
    private Boolean stringa___eq;
    private Boolean stringa___ne;
    private Boolean stringa___null;
    private Boolean stringa___not___null;
    private Integer studio_questionario_id___eq;
    private Integer studio_questionario_id___ne;
    private Boolean studio_questionario_id___null;
    private Boolean studio_questionario_id___not___null;
    private java.util.List<Integer> studio_questionario_id___in;
    private java.util.List<Integer> studio_questionario_id___not___in;
    private Integer studio_questionario_id___lt;
    private Integer studio_questionario_id___lte;
    private Integer studio_questionario_id___gt;
    private Integer studio_questionario_id___gte;
    private java.util.List<CliRispostaFilterDTO> AND;
    private java.util.List<CliRispostaFilterDTO> OR;
    private CliRispostaFilterDTO NOT;

    public CliRispostaFilterDTO() {
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

    public Boolean getAlert_obbligatoria___eq() {
        return alert_obbligatoria___eq;
    }
    public void setAlert_obbligatoria___eq(Boolean alert_obbligatoria___eq) {
        this.alert_obbligatoria___eq = alert_obbligatoria___eq;
    }

    public Boolean getAlert_obbligatoria___ne() {
        return alert_obbligatoria___ne;
    }
    public void setAlert_obbligatoria___ne(Boolean alert_obbligatoria___ne) {
        this.alert_obbligatoria___ne = alert_obbligatoria___ne;
    }

    public Boolean getAlert_obbligatoria___null() {
        return alert_obbligatoria___null;
    }
    public void setAlert_obbligatoria___null(Boolean alert_obbligatoria___null) {
        this.alert_obbligatoria___null = alert_obbligatoria___null;
    }

    public Boolean getAlert_obbligatoria___not___null() {
        return alert_obbligatoria___not___null;
    }
    public void setAlert_obbligatoria___not___null(Boolean alert_obbligatoria___not___null) {
        this.alert_obbligatoria___not___null = alert_obbligatoria___not___null;
    }

    public String getCodice_interno_i___eq() {
        return codice_interno_i___eq;
    }
    public void setCodice_interno_i___eq(String codice_interno_i___eq) {
        this.codice_interno_i___eq = codice_interno_i___eq;
    }

    public String getCodice_interno_i___ne() {
        return codice_interno_i___ne;
    }
    public void setCodice_interno_i___ne(String codice_interno_i___ne) {
        this.codice_interno_i___ne = codice_interno_i___ne;
    }

    public Boolean getCodice_interno_i___null() {
        return codice_interno_i___null;
    }
    public void setCodice_interno_i___null(Boolean codice_interno_i___null) {
        this.codice_interno_i___null = codice_interno_i___null;
    }

    public Boolean getCodice_interno_i___not___null() {
        return codice_interno_i___not___null;
    }
    public void setCodice_interno_i___not___null(Boolean codice_interno_i___not___null) {
        this.codice_interno_i___not___null = codice_interno_i___not___null;
    }

    public java.util.List<String> getCodice_interno_i___in() {
        return codice_interno_i___in;
    }
    public void setCodice_interno_i___in(java.util.List<String> codice_interno_i___in) {
        this.codice_interno_i___in = codice_interno_i___in;
    }

    public java.util.List<String> getCodice_interno_i___not___in() {
        return codice_interno_i___not___in;
    }
    public void setCodice_interno_i___not___in(java.util.List<String> codice_interno_i___not___in) {
        this.codice_interno_i___not___in = codice_interno_i___not___in;
    }

    public String getCodice_interno_i___lt() {
        return codice_interno_i___lt;
    }
    public void setCodice_interno_i___lt(String codice_interno_i___lt) {
        this.codice_interno_i___lt = codice_interno_i___lt;
    }

    public String getCodice_interno_i___lte() {
        return codice_interno_i___lte;
    }
    public void setCodice_interno_i___lte(String codice_interno_i___lte) {
        this.codice_interno_i___lte = codice_interno_i___lte;
    }

    public String getCodice_interno_i___gt() {
        return codice_interno_i___gt;
    }
    public void setCodice_interno_i___gt(String codice_interno_i___gt) {
        this.codice_interno_i___gt = codice_interno_i___gt;
    }

    public String getCodice_interno_i___gte() {
        return codice_interno_i___gte;
    }
    public void setCodice_interno_i___gte(String codice_interno_i___gte) {
        this.codice_interno_i___gte = codice_interno_i___gte;
    }

    public String getCodice_interno_i___contains() {
        return codice_interno_i___contains;
    }
    public void setCodice_interno_i___contains(String codice_interno_i___contains) {
        this.codice_interno_i___contains = codice_interno_i___contains;
    }

    public String getCodice_interno_i___not___contains() {
        return codice_interno_i___not___contains;
    }
    public void setCodice_interno_i___not___contains(String codice_interno_i___not___contains) {
        this.codice_interno_i___not___contains = codice_interno_i___not___contains;
    }

    public String getCodice_interno_i___starts_with() {
        return codice_interno_i___starts_with;
    }
    public void setCodice_interno_i___starts_with(String codice_interno_i___starts_with) {
        this.codice_interno_i___starts_with = codice_interno_i___starts_with;
    }

    public String getCodice_interno_i___not___starts_with() {
        return codice_interno_i___not___starts_with;
    }
    public void setCodice_interno_i___not___starts_with(String codice_interno_i___not___starts_with) {
        this.codice_interno_i___not___starts_with = codice_interno_i___not___starts_with;
    }

    public String getCodice_interno_i___ends_with() {
        return codice_interno_i___ends_with;
    }
    public void setCodice_interno_i___ends_with(String codice_interno_i___ends_with) {
        this.codice_interno_i___ends_with = codice_interno_i___ends_with;
    }

    public String getCodice_interno_i___not___ends_with() {
        return codice_interno_i___not___ends_with;
    }
    public void setCodice_interno_i___not___ends_with(String codice_interno_i___not___ends_with) {
        this.codice_interno_i___not___ends_with = codice_interno_i___not___ends_with;
    }

    public Boolean getDecimale___eq() {
        return decimale___eq;
    }
    public void setDecimale___eq(Boolean decimale___eq) {
        this.decimale___eq = decimale___eq;
    }

    public Boolean getDecimale___ne() {
        return decimale___ne;
    }
    public void setDecimale___ne(Boolean decimale___ne) {
        this.decimale___ne = decimale___ne;
    }

    public Boolean getDecimale___null() {
        return decimale___null;
    }
    public void setDecimale___null(Boolean decimale___null) {
        this.decimale___null = decimale___null;
    }

    public Boolean getDecimale___not___null() {
        return decimale___not___null;
    }
    public void setDecimale___not___null(Boolean decimale___not___null) {
        this.decimale___not___null = decimale___not___null;
    }

    public String getDomanda___eq() {
        return domanda___eq;
    }
    public void setDomanda___eq(String domanda___eq) {
        this.domanda___eq = domanda___eq;
    }

    public String getDomanda___ne() {
        return domanda___ne;
    }
    public void setDomanda___ne(String domanda___ne) {
        this.domanda___ne = domanda___ne;
    }

    public Boolean getDomanda___null() {
        return domanda___null;
    }
    public void setDomanda___null(Boolean domanda___null) {
        this.domanda___null = domanda___null;
    }

    public Boolean getDomanda___not___null() {
        return domanda___not___null;
    }
    public void setDomanda___not___null(Boolean domanda___not___null) {
        this.domanda___not___null = domanda___not___null;
    }

    public java.util.List<String> getDomanda___in() {
        return domanda___in;
    }
    public void setDomanda___in(java.util.List<String> domanda___in) {
        this.domanda___in = domanda___in;
    }

    public java.util.List<String> getDomanda___not___in() {
        return domanda___not___in;
    }
    public void setDomanda___not___in(java.util.List<String> domanda___not___in) {
        this.domanda___not___in = domanda___not___in;
    }

    public String getDomanda___lt() {
        return domanda___lt;
    }
    public void setDomanda___lt(String domanda___lt) {
        this.domanda___lt = domanda___lt;
    }

    public String getDomanda___lte() {
        return domanda___lte;
    }
    public void setDomanda___lte(String domanda___lte) {
        this.domanda___lte = domanda___lte;
    }

    public String getDomanda___gt() {
        return domanda___gt;
    }
    public void setDomanda___gt(String domanda___gt) {
        this.domanda___gt = domanda___gt;
    }

    public String getDomanda___gte() {
        return domanda___gte;
    }
    public void setDomanda___gte(String domanda___gte) {
        this.domanda___gte = domanda___gte;
    }

    public String getDomanda___contains() {
        return domanda___contains;
    }
    public void setDomanda___contains(String domanda___contains) {
        this.domanda___contains = domanda___contains;
    }

    public String getDomanda___not___contains() {
        return domanda___not___contains;
    }
    public void setDomanda___not___contains(String domanda___not___contains) {
        this.domanda___not___contains = domanda___not___contains;
    }

    public String getDomanda___starts_with() {
        return domanda___starts_with;
    }
    public void setDomanda___starts_with(String domanda___starts_with) {
        this.domanda___starts_with = domanda___starts_with;
    }

    public String getDomanda___not___starts_with() {
        return domanda___not___starts_with;
    }
    public void setDomanda___not___starts_with(String domanda___not___starts_with) {
        this.domanda___not___starts_with = domanda___not___starts_with;
    }

    public String getDomanda___ends_with() {
        return domanda___ends_with;
    }
    public void setDomanda___ends_with(String domanda___ends_with) {
        this.domanda___ends_with = domanda___ends_with;
    }

    public String getDomanda___not___ends_with() {
        return domanda___not___ends_with;
    }
    public void setDomanda___not___ends_with(String domanda___not___ends_with) {
        this.domanda___not___ends_with = domanda___not___ends_with;
    }

    public Integer getDomanda_id___eq() {
        return domanda_id___eq;
    }
    public void setDomanda_id___eq(Integer domanda_id___eq) {
        this.domanda_id___eq = domanda_id___eq;
    }

    public Integer getDomanda_id___ne() {
        return domanda_id___ne;
    }
    public void setDomanda_id___ne(Integer domanda_id___ne) {
        this.domanda_id___ne = domanda_id___ne;
    }

    public Boolean getDomanda_id___null() {
        return domanda_id___null;
    }
    public void setDomanda_id___null(Boolean domanda_id___null) {
        this.domanda_id___null = domanda_id___null;
    }

    public Boolean getDomanda_id___not___null() {
        return domanda_id___not___null;
    }
    public void setDomanda_id___not___null(Boolean domanda_id___not___null) {
        this.domanda_id___not___null = domanda_id___not___null;
    }

    public java.util.List<Integer> getDomanda_id___in() {
        return domanda_id___in;
    }
    public void setDomanda_id___in(java.util.List<Integer> domanda_id___in) {
        this.domanda_id___in = domanda_id___in;
    }

    public java.util.List<Integer> getDomanda_id___not___in() {
        return domanda_id___not___in;
    }
    public void setDomanda_id___not___in(java.util.List<Integer> domanda_id___not___in) {
        this.domanda_id___not___in = domanda_id___not___in;
    }

    public Integer getDomanda_id___lt() {
        return domanda_id___lt;
    }
    public void setDomanda_id___lt(Integer domanda_id___lt) {
        this.domanda_id___lt = domanda_id___lt;
    }

    public Integer getDomanda_id___lte() {
        return domanda_id___lte;
    }
    public void setDomanda_id___lte(Integer domanda_id___lte) {
        this.domanda_id___lte = domanda_id___lte;
    }

    public Integer getDomanda_id___gt() {
        return domanda_id___gt;
    }
    public void setDomanda_id___gt(Integer domanda_id___gt) {
        this.domanda_id___gt = domanda_id___gt;
    }

    public Integer getDomanda_id___gte() {
        return domanda_id___gte;
    }
    public void setDomanda_id___gte(Integer domanda_id___gte) {
        this.domanda_id___gte = domanda_id___gte;
    }

    public String getDomande_questionario_ids___eq() {
        return domande_questionario_ids___eq;
    }
    public void setDomande_questionario_ids___eq(String domande_questionario_ids___eq) {
        this.domande_questionario_ids___eq = domande_questionario_ids___eq;
    }

    public String getDomande_questionario_ids___ne() {
        return domande_questionario_ids___ne;
    }
    public void setDomande_questionario_ids___ne(String domande_questionario_ids___ne) {
        this.domande_questionario_ids___ne = domande_questionario_ids___ne;
    }

    public Boolean getDomande_questionario_ids___null() {
        return domande_questionario_ids___null;
    }
    public void setDomande_questionario_ids___null(Boolean domande_questionario_ids___null) {
        this.domande_questionario_ids___null = domande_questionario_ids___null;
    }

    public Boolean getDomande_questionario_ids___not___null() {
        return domande_questionario_ids___not___null;
    }
    public void setDomande_questionario_ids___not___null(Boolean domande_questionario_ids___not___null) {
        this.domande_questionario_ids___not___null = domande_questionario_ids___not___null;
    }

    public java.util.List<String> getDomande_questionario_ids___in() {
        return domande_questionario_ids___in;
    }
    public void setDomande_questionario_ids___in(java.util.List<String> domande_questionario_ids___in) {
        this.domande_questionario_ids___in = domande_questionario_ids___in;
    }

    public java.util.List<String> getDomande_questionario_ids___not___in() {
        return domande_questionario_ids___not___in;
    }
    public void setDomande_questionario_ids___not___in(java.util.List<String> domande_questionario_ids___not___in) {
        this.domande_questionario_ids___not___in = domande_questionario_ids___not___in;
    }

    public String getDomande_questionario_ids___lt() {
        return domande_questionario_ids___lt;
    }
    public void setDomande_questionario_ids___lt(String domande_questionario_ids___lt) {
        this.domande_questionario_ids___lt = domande_questionario_ids___lt;
    }

    public String getDomande_questionario_ids___lte() {
        return domande_questionario_ids___lte;
    }
    public void setDomande_questionario_ids___lte(String domande_questionario_ids___lte) {
        this.domande_questionario_ids___lte = domande_questionario_ids___lte;
    }

    public String getDomande_questionario_ids___gt() {
        return domande_questionario_ids___gt;
    }
    public void setDomande_questionario_ids___gt(String domande_questionario_ids___gt) {
        this.domande_questionario_ids___gt = domande_questionario_ids___gt;
    }

    public String getDomande_questionario_ids___gte() {
        return domande_questionario_ids___gte;
    }
    public void setDomande_questionario_ids___gte(String domande_questionario_ids___gte) {
        this.domande_questionario_ids___gte = domande_questionario_ids___gte;
    }

    public String getDomande_questionario_ids___contains() {
        return domande_questionario_ids___contains;
    }
    public void setDomande_questionario_ids___contains(String domande_questionario_ids___contains) {
        this.domande_questionario_ids___contains = domande_questionario_ids___contains;
    }

    public String getDomande_questionario_ids___not___contains() {
        return domande_questionario_ids___not___contains;
    }
    public void setDomande_questionario_ids___not___contains(String domande_questionario_ids___not___contains) {
        this.domande_questionario_ids___not___contains = domande_questionario_ids___not___contains;
    }

    public String getDomande_questionario_ids___starts_with() {
        return domande_questionario_ids___starts_with;
    }
    public void setDomande_questionario_ids___starts_with(String domande_questionario_ids___starts_with) {
        this.domande_questionario_ids___starts_with = domande_questionario_ids___starts_with;
    }

    public String getDomande_questionario_ids___not___starts_with() {
        return domande_questionario_ids___not___starts_with;
    }
    public void setDomande_questionario_ids___not___starts_with(String domande_questionario_ids___not___starts_with) {
        this.domande_questionario_ids___not___starts_with = domande_questionario_ids___not___starts_with;
    }

    public String getDomande_questionario_ids___ends_with() {
        return domande_questionario_ids___ends_with;
    }
    public void setDomande_questionario_ids___ends_with(String domande_questionario_ids___ends_with) {
        this.domande_questionario_ids___ends_with = domande_questionario_ids___ends_with;
    }

    public String getDomande_questionario_ids___not___ends_with() {
        return domande_questionario_ids___not___ends_with;
    }
    public void setDomande_questionario_ids___not___ends_with(String domande_questionario_ids___not___ends_with) {
        this.domande_questionario_ids___not___ends_with = domande_questionario_ids___not___ends_with;
    }

    public Integer getId_risposta_peso___eq() {
        return id_risposta_peso___eq;
    }
    public void setId_risposta_peso___eq(Integer id_risposta_peso___eq) {
        this.id_risposta_peso___eq = id_risposta_peso___eq;
    }

    public Integer getId_risposta_peso___ne() {
        return id_risposta_peso___ne;
    }
    public void setId_risposta_peso___ne(Integer id_risposta_peso___ne) {
        this.id_risposta_peso___ne = id_risposta_peso___ne;
    }

    public Boolean getId_risposta_peso___null() {
        return id_risposta_peso___null;
    }
    public void setId_risposta_peso___null(Boolean id_risposta_peso___null) {
        this.id_risposta_peso___null = id_risposta_peso___null;
    }

    public Boolean getId_risposta_peso___not___null() {
        return id_risposta_peso___not___null;
    }
    public void setId_risposta_peso___not___null(Boolean id_risposta_peso___not___null) {
        this.id_risposta_peso___not___null = id_risposta_peso___not___null;
    }

    public java.util.List<Integer> getId_risposta_peso___in() {
        return id_risposta_peso___in;
    }
    public void setId_risposta_peso___in(java.util.List<Integer> id_risposta_peso___in) {
        this.id_risposta_peso___in = id_risposta_peso___in;
    }

    public java.util.List<Integer> getId_risposta_peso___not___in() {
        return id_risposta_peso___not___in;
    }
    public void setId_risposta_peso___not___in(java.util.List<Integer> id_risposta_peso___not___in) {
        this.id_risposta_peso___not___in = id_risposta_peso___not___in;
    }

    public Integer getId_risposta_peso___lt() {
        return id_risposta_peso___lt;
    }
    public void setId_risposta_peso___lt(Integer id_risposta_peso___lt) {
        this.id_risposta_peso___lt = id_risposta_peso___lt;
    }

    public Integer getId_risposta_peso___lte() {
        return id_risposta_peso___lte;
    }
    public void setId_risposta_peso___lte(Integer id_risposta_peso___lte) {
        this.id_risposta_peso___lte = id_risposta_peso___lte;
    }

    public Integer getId_risposta_peso___gt() {
        return id_risposta_peso___gt;
    }
    public void setId_risposta_peso___gt(Integer id_risposta_peso___gt) {
        this.id_risposta_peso___gt = id_risposta_peso___gt;
    }

    public Integer getId_risposta_peso___gte() {
        return id_risposta_peso___gte;
    }
    public void setId_risposta_peso___gte(Integer id_risposta_peso___gte) {
        this.id_risposta_peso___gte = id_risposta_peso___gte;
    }

    public Boolean getIntero___eq() {
        return intero___eq;
    }
    public void setIntero___eq(Boolean intero___eq) {
        this.intero___eq = intero___eq;
    }

    public Boolean getIntero___ne() {
        return intero___ne;
    }
    public void setIntero___ne(Boolean intero___ne) {
        this.intero___ne = intero___ne;
    }

    public Boolean getIntero___null() {
        return intero___null;
    }
    public void setIntero___null(Boolean intero___null) {
        this.intero___null = intero___null;
    }

    public Boolean getIntero___not___null() {
        return intero___not___null;
    }
    public void setIntero___not___null(Boolean intero___not___null) {
        this.intero___not___null = intero___not___null;
    }

    public Boolean getObbligatoria___eq() {
        return obbligatoria___eq;
    }
    public void setObbligatoria___eq(Boolean obbligatoria___eq) {
        this.obbligatoria___eq = obbligatoria___eq;
    }

    public Boolean getObbligatoria___ne() {
        return obbligatoria___ne;
    }
    public void setObbligatoria___ne(Boolean obbligatoria___ne) {
        this.obbligatoria___ne = obbligatoria___ne;
    }

    public Boolean getObbligatoria___null() {
        return obbligatoria___null;
    }
    public void setObbligatoria___null(Boolean obbligatoria___null) {
        this.obbligatoria___null = obbligatoria___null;
    }

    public Boolean getObbligatoria___not___null() {
        return obbligatoria___not___null;
    }
    public void setObbligatoria___not___null(Boolean obbligatoria___not___null) {
        this.obbligatoria___not___null = obbligatoria___not___null;
    }

    public Boolean getOpzioni_multipla___eq() {
        return opzioni_multipla___eq;
    }
    public void setOpzioni_multipla___eq(Boolean opzioni_multipla___eq) {
        this.opzioni_multipla___eq = opzioni_multipla___eq;
    }

    public Boolean getOpzioni_multipla___ne() {
        return opzioni_multipla___ne;
    }
    public void setOpzioni_multipla___ne(Boolean opzioni_multipla___ne) {
        this.opzioni_multipla___ne = opzioni_multipla___ne;
    }

    public Boolean getOpzioni_multipla___null() {
        return opzioni_multipla___null;
    }
    public void setOpzioni_multipla___null(Boolean opzioni_multipla___null) {
        this.opzioni_multipla___null = opzioni_multipla___null;
    }

    public Boolean getOpzioni_multipla___not___null() {
        return opzioni_multipla___not___null;
    }
    public void setOpzioni_multipla___not___null(Boolean opzioni_multipla___not___null) {
        this.opzioni_multipla___not___null = opzioni_multipla___not___null;
    }

    public Boolean getOpzioni_singola___eq() {
        return opzioni_singola___eq;
    }
    public void setOpzioni_singola___eq(Boolean opzioni_singola___eq) {
        this.opzioni_singola___eq = opzioni_singola___eq;
    }

    public Boolean getOpzioni_singola___ne() {
        return opzioni_singola___ne;
    }
    public void setOpzioni_singola___ne(Boolean opzioni_singola___ne) {
        this.opzioni_singola___ne = opzioni_singola___ne;
    }

    public Boolean getOpzioni_singola___null() {
        return opzioni_singola___null;
    }
    public void setOpzioni_singola___null(Boolean opzioni_singola___null) {
        this.opzioni_singola___null = opzioni_singola___null;
    }

    public Boolean getOpzioni_singola___not___null() {
        return opzioni_singola___not___null;
    }
    public void setOpzioni_singola___not___null(Boolean opzioni_singola___not___null) {
        this.opzioni_singola___not___null = opzioni_singola___not___null;
    }

    public Integer getOrdine___eq() {
        return ordine___eq;
    }
    public void setOrdine___eq(Integer ordine___eq) {
        this.ordine___eq = ordine___eq;
    }

    public Integer getOrdine___ne() {
        return ordine___ne;
    }
    public void setOrdine___ne(Integer ordine___ne) {
        this.ordine___ne = ordine___ne;
    }

    public Boolean getOrdine___null() {
        return ordine___null;
    }
    public void setOrdine___null(Boolean ordine___null) {
        this.ordine___null = ordine___null;
    }

    public Boolean getOrdine___not___null() {
        return ordine___not___null;
    }
    public void setOrdine___not___null(Boolean ordine___not___null) {
        this.ordine___not___null = ordine___not___null;
    }

    public java.util.List<Integer> getOrdine___in() {
        return ordine___in;
    }
    public void setOrdine___in(java.util.List<Integer> ordine___in) {
        this.ordine___in = ordine___in;
    }

    public java.util.List<Integer> getOrdine___not___in() {
        return ordine___not___in;
    }
    public void setOrdine___not___in(java.util.List<Integer> ordine___not___in) {
        this.ordine___not___in = ordine___not___in;
    }

    public Integer getOrdine___lt() {
        return ordine___lt;
    }
    public void setOrdine___lt(Integer ordine___lt) {
        this.ordine___lt = ordine___lt;
    }

    public Integer getOrdine___lte() {
        return ordine___lte;
    }
    public void setOrdine___lte(Integer ordine___lte) {
        this.ordine___lte = ordine___lte;
    }

    public Integer getOrdine___gt() {
        return ordine___gt;
    }
    public void setOrdine___gt(Integer ordine___gt) {
        this.ordine___gt = ordine___gt;
    }

    public Integer getOrdine___gte() {
        return ordine___gte;
    }
    public void setOrdine___gte(Integer ordine___gte) {
        this.ordine___gte = ordine___gte;
    }

    public Integer getOrdine_risposta___eq() {
        return ordine_risposta___eq;
    }
    public void setOrdine_risposta___eq(Integer ordine_risposta___eq) {
        this.ordine_risposta___eq = ordine_risposta___eq;
    }

    public Integer getOrdine_risposta___ne() {
        return ordine_risposta___ne;
    }
    public void setOrdine_risposta___ne(Integer ordine_risposta___ne) {
        this.ordine_risposta___ne = ordine_risposta___ne;
    }

    public Boolean getOrdine_risposta___null() {
        return ordine_risposta___null;
    }
    public void setOrdine_risposta___null(Boolean ordine_risposta___null) {
        this.ordine_risposta___null = ordine_risposta___null;
    }

    public Boolean getOrdine_risposta___not___null() {
        return ordine_risposta___not___null;
    }
    public void setOrdine_risposta___not___null(Boolean ordine_risposta___not___null) {
        this.ordine_risposta___not___null = ordine_risposta___not___null;
    }

    public java.util.List<Integer> getOrdine_risposta___in() {
        return ordine_risposta___in;
    }
    public void setOrdine_risposta___in(java.util.List<Integer> ordine_risposta___in) {
        this.ordine_risposta___in = ordine_risposta___in;
    }

    public java.util.List<Integer> getOrdine_risposta___not___in() {
        return ordine_risposta___not___in;
    }
    public void setOrdine_risposta___not___in(java.util.List<Integer> ordine_risposta___not___in) {
        this.ordine_risposta___not___in = ordine_risposta___not___in;
    }

    public Integer getOrdine_risposta___lt() {
        return ordine_risposta___lt;
    }
    public void setOrdine_risposta___lt(Integer ordine_risposta___lt) {
        this.ordine_risposta___lt = ordine_risposta___lt;
    }

    public Integer getOrdine_risposta___lte() {
        return ordine_risposta___lte;
    }
    public void setOrdine_risposta___lte(Integer ordine_risposta___lte) {
        this.ordine_risposta___lte = ordine_risposta___lte;
    }

    public Integer getOrdine_risposta___gt() {
        return ordine_risposta___gt;
    }
    public void setOrdine_risposta___gt(Integer ordine_risposta___gt) {
        this.ordine_risposta___gt = ordine_risposta___gt;
    }

    public Integer getOrdine_risposta___gte() {
        return ordine_risposta___gte;
    }
    public void setOrdine_risposta___gte(Integer ordine_risposta___gte) {
        this.ordine_risposta___gte = ordine_risposta___gte;
    }

    public String getPeso_punteggio___eq() {
        return peso_punteggio___eq;
    }
    public void setPeso_punteggio___eq(String peso_punteggio___eq) {
        this.peso_punteggio___eq = peso_punteggio___eq;
    }

    public String getPeso_punteggio___ne() {
        return peso_punteggio___ne;
    }
    public void setPeso_punteggio___ne(String peso_punteggio___ne) {
        this.peso_punteggio___ne = peso_punteggio___ne;
    }

    public Boolean getPeso_punteggio___null() {
        return peso_punteggio___null;
    }
    public void setPeso_punteggio___null(Boolean peso_punteggio___null) {
        this.peso_punteggio___null = peso_punteggio___null;
    }

    public Boolean getPeso_punteggio___not___null() {
        return peso_punteggio___not___null;
    }
    public void setPeso_punteggio___not___null(Boolean peso_punteggio___not___null) {
        this.peso_punteggio___not___null = peso_punteggio___not___null;
    }

    public java.util.List<String> getPeso_punteggio___in() {
        return peso_punteggio___in;
    }
    public void setPeso_punteggio___in(java.util.List<String> peso_punteggio___in) {
        this.peso_punteggio___in = peso_punteggio___in;
    }

    public java.util.List<String> getPeso_punteggio___not___in() {
        return peso_punteggio___not___in;
    }
    public void setPeso_punteggio___not___in(java.util.List<String> peso_punteggio___not___in) {
        this.peso_punteggio___not___in = peso_punteggio___not___in;
    }

    public String getPeso_punteggio___lt() {
        return peso_punteggio___lt;
    }
    public void setPeso_punteggio___lt(String peso_punteggio___lt) {
        this.peso_punteggio___lt = peso_punteggio___lt;
    }

    public String getPeso_punteggio___lte() {
        return peso_punteggio___lte;
    }
    public void setPeso_punteggio___lte(String peso_punteggio___lte) {
        this.peso_punteggio___lte = peso_punteggio___lte;
    }

    public String getPeso_punteggio___gt() {
        return peso_punteggio___gt;
    }
    public void setPeso_punteggio___gt(String peso_punteggio___gt) {
        this.peso_punteggio___gt = peso_punteggio___gt;
    }

    public String getPeso_punteggio___gte() {
        return peso_punteggio___gte;
    }
    public void setPeso_punteggio___gte(String peso_punteggio___gte) {
        this.peso_punteggio___gte = peso_punteggio___gte;
    }

    public String getPunteggio_risposta___eq() {
        return punteggio_risposta___eq;
    }
    public void setPunteggio_risposta___eq(String punteggio_risposta___eq) {
        this.punteggio_risposta___eq = punteggio_risposta___eq;
    }

    public String getPunteggio_risposta___ne() {
        return punteggio_risposta___ne;
    }
    public void setPunteggio_risposta___ne(String punteggio_risposta___ne) {
        this.punteggio_risposta___ne = punteggio_risposta___ne;
    }

    public Boolean getPunteggio_risposta___null() {
        return punteggio_risposta___null;
    }
    public void setPunteggio_risposta___null(Boolean punteggio_risposta___null) {
        this.punteggio_risposta___null = punteggio_risposta___null;
    }

    public Boolean getPunteggio_risposta___not___null() {
        return punteggio_risposta___not___null;
    }
    public void setPunteggio_risposta___not___null(Boolean punteggio_risposta___not___null) {
        this.punteggio_risposta___not___null = punteggio_risposta___not___null;
    }

    public java.util.List<String> getPunteggio_risposta___in() {
        return punteggio_risposta___in;
    }
    public void setPunteggio_risposta___in(java.util.List<String> punteggio_risposta___in) {
        this.punteggio_risposta___in = punteggio_risposta___in;
    }

    public java.util.List<String> getPunteggio_risposta___not___in() {
        return punteggio_risposta___not___in;
    }
    public void setPunteggio_risposta___not___in(java.util.List<String> punteggio_risposta___not___in) {
        this.punteggio_risposta___not___in = punteggio_risposta___not___in;
    }

    public String getPunteggio_risposta___lt() {
        return punteggio_risposta___lt;
    }
    public void setPunteggio_risposta___lt(String punteggio_risposta___lt) {
        this.punteggio_risposta___lt = punteggio_risposta___lt;
    }

    public String getPunteggio_risposta___lte() {
        return punteggio_risposta___lte;
    }
    public void setPunteggio_risposta___lte(String punteggio_risposta___lte) {
        this.punteggio_risposta___lte = punteggio_risposta___lte;
    }

    public String getPunteggio_risposta___gt() {
        return punteggio_risposta___gt;
    }
    public void setPunteggio_risposta___gt(String punteggio_risposta___gt) {
        this.punteggio_risposta___gt = punteggio_risposta___gt;
    }

    public String getPunteggio_risposta___gte() {
        return punteggio_risposta___gte;
    }
    public void setPunteggio_risposta___gte(String punteggio_risposta___gte) {
        this.punteggio_risposta___gte = punteggio_risposta___gte;
    }

    public String getPunteggio_totale___eq() {
        return punteggio_totale___eq;
    }
    public void setPunteggio_totale___eq(String punteggio_totale___eq) {
        this.punteggio_totale___eq = punteggio_totale___eq;
    }

    public String getPunteggio_totale___ne() {
        return punteggio_totale___ne;
    }
    public void setPunteggio_totale___ne(String punteggio_totale___ne) {
        this.punteggio_totale___ne = punteggio_totale___ne;
    }

    public Boolean getPunteggio_totale___null() {
        return punteggio_totale___null;
    }
    public void setPunteggio_totale___null(Boolean punteggio_totale___null) {
        this.punteggio_totale___null = punteggio_totale___null;
    }

    public Boolean getPunteggio_totale___not___null() {
        return punteggio_totale___not___null;
    }
    public void setPunteggio_totale___not___null(Boolean punteggio_totale___not___null) {
        this.punteggio_totale___not___null = punteggio_totale___not___null;
    }

    public java.util.List<String> getPunteggio_totale___in() {
        return punteggio_totale___in;
    }
    public void setPunteggio_totale___in(java.util.List<String> punteggio_totale___in) {
        this.punteggio_totale___in = punteggio_totale___in;
    }

    public java.util.List<String> getPunteggio_totale___not___in() {
        return punteggio_totale___not___in;
    }
    public void setPunteggio_totale___not___in(java.util.List<String> punteggio_totale___not___in) {
        this.punteggio_totale___not___in = punteggio_totale___not___in;
    }

    public String getPunteggio_totale___lt() {
        return punteggio_totale___lt;
    }
    public void setPunteggio_totale___lt(String punteggio_totale___lt) {
        this.punteggio_totale___lt = punteggio_totale___lt;
    }

    public String getPunteggio_totale___lte() {
        return punteggio_totale___lte;
    }
    public void setPunteggio_totale___lte(String punteggio_totale___lte) {
        this.punteggio_totale___lte = punteggio_totale___lte;
    }

    public String getPunteggio_totale___gt() {
        return punteggio_totale___gt;
    }
    public void setPunteggio_totale___gt(String punteggio_totale___gt) {
        this.punteggio_totale___gt = punteggio_totale___gt;
    }

    public String getPunteggio_totale___gte() {
        return punteggio_totale___gte;
    }
    public void setPunteggio_totale___gte(String punteggio_totale___gte) {
        this.punteggio_totale___gte = punteggio_totale___gte;
    }

    public Integer getQuestionario_id___eq() {
        return questionario_id___eq;
    }
    public void setQuestionario_id___eq(Integer questionario_id___eq) {
        this.questionario_id___eq = questionario_id___eq;
    }

    public Integer getQuestionario_id___ne() {
        return questionario_id___ne;
    }
    public void setQuestionario_id___ne(Integer questionario_id___ne) {
        this.questionario_id___ne = questionario_id___ne;
    }

    public Boolean getQuestionario_id___null() {
        return questionario_id___null;
    }
    public void setQuestionario_id___null(Boolean questionario_id___null) {
        this.questionario_id___null = questionario_id___null;
    }

    public Boolean getQuestionario_id___not___null() {
        return questionario_id___not___null;
    }
    public void setQuestionario_id___not___null(Boolean questionario_id___not___null) {
        this.questionario_id___not___null = questionario_id___not___null;
    }

    public java.util.List<Integer> getQuestionario_id___in() {
        return questionario_id___in;
    }
    public void setQuestionario_id___in(java.util.List<Integer> questionario_id___in) {
        this.questionario_id___in = questionario_id___in;
    }

    public java.util.List<Integer> getQuestionario_id___not___in() {
        return questionario_id___not___in;
    }
    public void setQuestionario_id___not___in(java.util.List<Integer> questionario_id___not___in) {
        this.questionario_id___not___in = questionario_id___not___in;
    }

    public Integer getQuestionario_id___lt() {
        return questionario_id___lt;
    }
    public void setQuestionario_id___lt(Integer questionario_id___lt) {
        this.questionario_id___lt = questionario_id___lt;
    }

    public Integer getQuestionario_id___lte() {
        return questionario_id___lte;
    }
    public void setQuestionario_id___lte(Integer questionario_id___lte) {
        this.questionario_id___lte = questionario_id___lte;
    }

    public Integer getQuestionario_id___gt() {
        return questionario_id___gt;
    }
    public void setQuestionario_id___gt(Integer questionario_id___gt) {
        this.questionario_id___gt = questionario_id___gt;
    }

    public Integer getQuestionario_id___gte() {
        return questionario_id___gte;
    }
    public void setQuestionario_id___gte(Integer questionario_id___gte) {
        this.questionario_id___gte = questionario_id___gte;
    }

    public Integer getQuestionario_pro_app_id___eq() {
        return questionario_pro_app_id___eq;
    }
    public void setQuestionario_pro_app_id___eq(Integer questionario_pro_app_id___eq) {
        this.questionario_pro_app_id___eq = questionario_pro_app_id___eq;
    }

    public Integer getQuestionario_pro_app_id___ne() {
        return questionario_pro_app_id___ne;
    }
    public void setQuestionario_pro_app_id___ne(Integer questionario_pro_app_id___ne) {
        this.questionario_pro_app_id___ne = questionario_pro_app_id___ne;
    }

    public Boolean getQuestionario_pro_app_id___null() {
        return questionario_pro_app_id___null;
    }
    public void setQuestionario_pro_app_id___null(Boolean questionario_pro_app_id___null) {
        this.questionario_pro_app_id___null = questionario_pro_app_id___null;
    }

    public Boolean getQuestionario_pro_app_id___not___null() {
        return questionario_pro_app_id___not___null;
    }
    public void setQuestionario_pro_app_id___not___null(Boolean questionario_pro_app_id___not___null) {
        this.questionario_pro_app_id___not___null = questionario_pro_app_id___not___null;
    }

    public java.util.List<Integer> getQuestionario_pro_app_id___in() {
        return questionario_pro_app_id___in;
    }
    public void setQuestionario_pro_app_id___in(java.util.List<Integer> questionario_pro_app_id___in) {
        this.questionario_pro_app_id___in = questionario_pro_app_id___in;
    }

    public java.util.List<Integer> getQuestionario_pro_app_id___not___in() {
        return questionario_pro_app_id___not___in;
    }
    public void setQuestionario_pro_app_id___not___in(java.util.List<Integer> questionario_pro_app_id___not___in) {
        this.questionario_pro_app_id___not___in = questionario_pro_app_id___not___in;
    }

    public Integer getQuestionario_pro_app_id___lt() {
        return questionario_pro_app_id___lt;
    }
    public void setQuestionario_pro_app_id___lt(Integer questionario_pro_app_id___lt) {
        this.questionario_pro_app_id___lt = questionario_pro_app_id___lt;
    }

    public Integer getQuestionario_pro_app_id___lte() {
        return questionario_pro_app_id___lte;
    }
    public void setQuestionario_pro_app_id___lte(Integer questionario_pro_app_id___lte) {
        this.questionario_pro_app_id___lte = questionario_pro_app_id___lte;
    }

    public Integer getQuestionario_pro_app_id___gt() {
        return questionario_pro_app_id___gt;
    }
    public void setQuestionario_pro_app_id___gt(Integer questionario_pro_app_id___gt) {
        this.questionario_pro_app_id___gt = questionario_pro_app_id___gt;
    }

    public Integer getQuestionario_pro_app_id___gte() {
        return questionario_pro_app_id___gte;
    }
    public void setQuestionario_pro_app_id___gte(Integer questionario_pro_app_id___gte) {
        this.questionario_pro_app_id___gte = questionario_pro_app_id___gte;
    }

    public String getRisposta___eq() {
        return risposta___eq;
    }
    public void setRisposta___eq(String risposta___eq) {
        this.risposta___eq = risposta___eq;
    }

    public String getRisposta___ne() {
        return risposta___ne;
    }
    public void setRisposta___ne(String risposta___ne) {
        this.risposta___ne = risposta___ne;
    }

    public Boolean getRisposta___null() {
        return risposta___null;
    }
    public void setRisposta___null(Boolean risposta___null) {
        this.risposta___null = risposta___null;
    }

    public Boolean getRisposta___not___null() {
        return risposta___not___null;
    }
    public void setRisposta___not___null(Boolean risposta___not___null) {
        this.risposta___not___null = risposta___not___null;
    }

    public java.util.List<String> getRisposta___in() {
        return risposta___in;
    }
    public void setRisposta___in(java.util.List<String> risposta___in) {
        this.risposta___in = risposta___in;
    }

    public java.util.List<String> getRisposta___not___in() {
        return risposta___not___in;
    }
    public void setRisposta___not___in(java.util.List<String> risposta___not___in) {
        this.risposta___not___in = risposta___not___in;
    }

    public String getRisposta___lt() {
        return risposta___lt;
    }
    public void setRisposta___lt(String risposta___lt) {
        this.risposta___lt = risposta___lt;
    }

    public String getRisposta___lte() {
        return risposta___lte;
    }
    public void setRisposta___lte(String risposta___lte) {
        this.risposta___lte = risposta___lte;
    }

    public String getRisposta___gt() {
        return risposta___gt;
    }
    public void setRisposta___gt(String risposta___gt) {
        this.risposta___gt = risposta___gt;
    }

    public String getRisposta___gte() {
        return risposta___gte;
    }
    public void setRisposta___gte(String risposta___gte) {
        this.risposta___gte = risposta___gte;
    }

    public String getRisposta___contains() {
        return risposta___contains;
    }
    public void setRisposta___contains(String risposta___contains) {
        this.risposta___contains = risposta___contains;
    }

    public String getRisposta___not___contains() {
        return risposta___not___contains;
    }
    public void setRisposta___not___contains(String risposta___not___contains) {
        this.risposta___not___contains = risposta___not___contains;
    }

    public String getRisposta___starts_with() {
        return risposta___starts_with;
    }
    public void setRisposta___starts_with(String risposta___starts_with) {
        this.risposta___starts_with = risposta___starts_with;
    }

    public String getRisposta___not___starts_with() {
        return risposta___not___starts_with;
    }
    public void setRisposta___not___starts_with(String risposta___not___starts_with) {
        this.risposta___not___starts_with = risposta___not___starts_with;
    }

    public String getRisposta___ends_with() {
        return risposta___ends_with;
    }
    public void setRisposta___ends_with(String risposta___ends_with) {
        this.risposta___ends_with = risposta___ends_with;
    }

    public String getRisposta___not___ends_with() {
        return risposta___not___ends_with;
    }
    public void setRisposta___not___ends_with(String risposta___not___ends_with) {
        this.risposta___not___ends_with = risposta___not___ends_with;
    }

    public String getRisposta_dec___eq() {
        return risposta_dec___eq;
    }
    public void setRisposta_dec___eq(String risposta_dec___eq) {
        this.risposta_dec___eq = risposta_dec___eq;
    }

    public String getRisposta_dec___ne() {
        return risposta_dec___ne;
    }
    public void setRisposta_dec___ne(String risposta_dec___ne) {
        this.risposta_dec___ne = risposta_dec___ne;
    }

    public Boolean getRisposta_dec___null() {
        return risposta_dec___null;
    }
    public void setRisposta_dec___null(Boolean risposta_dec___null) {
        this.risposta_dec___null = risposta_dec___null;
    }

    public Boolean getRisposta_dec___not___null() {
        return risposta_dec___not___null;
    }
    public void setRisposta_dec___not___null(Boolean risposta_dec___not___null) {
        this.risposta_dec___not___null = risposta_dec___not___null;
    }

    public java.util.List<String> getRisposta_dec___in() {
        return risposta_dec___in;
    }
    public void setRisposta_dec___in(java.util.List<String> risposta_dec___in) {
        this.risposta_dec___in = risposta_dec___in;
    }

    public java.util.List<String> getRisposta_dec___not___in() {
        return risposta_dec___not___in;
    }
    public void setRisposta_dec___not___in(java.util.List<String> risposta_dec___not___in) {
        this.risposta_dec___not___in = risposta_dec___not___in;
    }

    public String getRisposta_dec___lt() {
        return risposta_dec___lt;
    }
    public void setRisposta_dec___lt(String risposta_dec___lt) {
        this.risposta_dec___lt = risposta_dec___lt;
    }

    public String getRisposta_dec___lte() {
        return risposta_dec___lte;
    }
    public void setRisposta_dec___lte(String risposta_dec___lte) {
        this.risposta_dec___lte = risposta_dec___lte;
    }

    public String getRisposta_dec___gt() {
        return risposta_dec___gt;
    }
    public void setRisposta_dec___gt(String risposta_dec___gt) {
        this.risposta_dec___gt = risposta_dec___gt;
    }

    public String getRisposta_dec___gte() {
        return risposta_dec___gte;
    }
    public void setRisposta_dec___gte(String risposta_dec___gte) {
        this.risposta_dec___gte = risposta_dec___gte;
    }

    public Integer getRisposta_int___eq() {
        return risposta_int___eq;
    }
    public void setRisposta_int___eq(Integer risposta_int___eq) {
        this.risposta_int___eq = risposta_int___eq;
    }

    public Integer getRisposta_int___ne() {
        return risposta_int___ne;
    }
    public void setRisposta_int___ne(Integer risposta_int___ne) {
        this.risposta_int___ne = risposta_int___ne;
    }

    public Boolean getRisposta_int___null() {
        return risposta_int___null;
    }
    public void setRisposta_int___null(Boolean risposta_int___null) {
        this.risposta_int___null = risposta_int___null;
    }

    public Boolean getRisposta_int___not___null() {
        return risposta_int___not___null;
    }
    public void setRisposta_int___not___null(Boolean risposta_int___not___null) {
        this.risposta_int___not___null = risposta_int___not___null;
    }

    public java.util.List<Integer> getRisposta_int___in() {
        return risposta_int___in;
    }
    public void setRisposta_int___in(java.util.List<Integer> risposta_int___in) {
        this.risposta_int___in = risposta_int___in;
    }

    public java.util.List<Integer> getRisposta_int___not___in() {
        return risposta_int___not___in;
    }
    public void setRisposta_int___not___in(java.util.List<Integer> risposta_int___not___in) {
        this.risposta_int___not___in = risposta_int___not___in;
    }

    public Integer getRisposta_int___lt() {
        return risposta_int___lt;
    }
    public void setRisposta_int___lt(Integer risposta_int___lt) {
        this.risposta_int___lt = risposta_int___lt;
    }

    public Integer getRisposta_int___lte() {
        return risposta_int___lte;
    }
    public void setRisposta_int___lte(Integer risposta_int___lte) {
        this.risposta_int___lte = risposta_int___lte;
    }

    public Integer getRisposta_int___gt() {
        return risposta_int___gt;
    }
    public void setRisposta_int___gt(Integer risposta_int___gt) {
        this.risposta_int___gt = risposta_int___gt;
    }

    public Integer getRisposta_int___gte() {
        return risposta_int___gte;
    }
    public void setRisposta_int___gte(Integer risposta_int___gte) {
        this.risposta_int___gte = risposta_int___gte;
    }

    public String getRisposta_multipla___eq() {
        return risposta_multipla___eq;
    }
    public void setRisposta_multipla___eq(String risposta_multipla___eq) {
        this.risposta_multipla___eq = risposta_multipla___eq;
    }

    public String getRisposta_multipla___ne() {
        return risposta_multipla___ne;
    }
    public void setRisposta_multipla___ne(String risposta_multipla___ne) {
        this.risposta_multipla___ne = risposta_multipla___ne;
    }

    public Boolean getRisposta_multipla___null() {
        return risposta_multipla___null;
    }
    public void setRisposta_multipla___null(Boolean risposta_multipla___null) {
        this.risposta_multipla___null = risposta_multipla___null;
    }

    public Boolean getRisposta_multipla___not___null() {
        return risposta_multipla___not___null;
    }
    public void setRisposta_multipla___not___null(Boolean risposta_multipla___not___null) {
        this.risposta_multipla___not___null = risposta_multipla___not___null;
    }

    public java.util.List<String> getRisposta_multipla___in() {
        return risposta_multipla___in;
    }
    public void setRisposta_multipla___in(java.util.List<String> risposta_multipla___in) {
        this.risposta_multipla___in = risposta_multipla___in;
    }

    public java.util.List<String> getRisposta_multipla___not___in() {
        return risposta_multipla___not___in;
    }
    public void setRisposta_multipla___not___in(java.util.List<String> risposta_multipla___not___in) {
        this.risposta_multipla___not___in = risposta_multipla___not___in;
    }

    public String getRisposta_multipla___lt() {
        return risposta_multipla___lt;
    }
    public void setRisposta_multipla___lt(String risposta_multipla___lt) {
        this.risposta_multipla___lt = risposta_multipla___lt;
    }

    public String getRisposta_multipla___lte() {
        return risposta_multipla___lte;
    }
    public void setRisposta_multipla___lte(String risposta_multipla___lte) {
        this.risposta_multipla___lte = risposta_multipla___lte;
    }

    public String getRisposta_multipla___gt() {
        return risposta_multipla___gt;
    }
    public void setRisposta_multipla___gt(String risposta_multipla___gt) {
        this.risposta_multipla___gt = risposta_multipla___gt;
    }

    public String getRisposta_multipla___gte() {
        return risposta_multipla___gte;
    }
    public void setRisposta_multipla___gte(String risposta_multipla___gte) {
        this.risposta_multipla___gte = risposta_multipla___gte;
    }

    public String getRisposta_multipla___contains() {
        return risposta_multipla___contains;
    }
    public void setRisposta_multipla___contains(String risposta_multipla___contains) {
        this.risposta_multipla___contains = risposta_multipla___contains;
    }

    public String getRisposta_multipla___not___contains() {
        return risposta_multipla___not___contains;
    }
    public void setRisposta_multipla___not___contains(String risposta_multipla___not___contains) {
        this.risposta_multipla___not___contains = risposta_multipla___not___contains;
    }

    public String getRisposta_multipla___starts_with() {
        return risposta_multipla___starts_with;
    }
    public void setRisposta_multipla___starts_with(String risposta_multipla___starts_with) {
        this.risposta_multipla___starts_with = risposta_multipla___starts_with;
    }

    public String getRisposta_multipla___not___starts_with() {
        return risposta_multipla___not___starts_with;
    }
    public void setRisposta_multipla___not___starts_with(String risposta_multipla___not___starts_with) {
        this.risposta_multipla___not___starts_with = risposta_multipla___not___starts_with;
    }

    public String getRisposta_multipla___ends_with() {
        return risposta_multipla___ends_with;
    }
    public void setRisposta_multipla___ends_with(String risposta_multipla___ends_with) {
        this.risposta_multipla___ends_with = risposta_multipla___ends_with;
    }

    public String getRisposta_multipla___not___ends_with() {
        return risposta_multipla___not___ends_with;
    }
    public void setRisposta_multipla___not___ends_with(String risposta_multipla___not___ends_with) {
        this.risposta_multipla___not___ends_with = risposta_multipla___not___ends_with;
    }

    public String getRisposta_str___eq() {
        return risposta_str___eq;
    }
    public void setRisposta_str___eq(String risposta_str___eq) {
        this.risposta_str___eq = risposta_str___eq;
    }

    public String getRisposta_str___ne() {
        return risposta_str___ne;
    }
    public void setRisposta_str___ne(String risposta_str___ne) {
        this.risposta_str___ne = risposta_str___ne;
    }

    public Boolean getRisposta_str___null() {
        return risposta_str___null;
    }
    public void setRisposta_str___null(Boolean risposta_str___null) {
        this.risposta_str___null = risposta_str___null;
    }

    public Boolean getRisposta_str___not___null() {
        return risposta_str___not___null;
    }
    public void setRisposta_str___not___null(Boolean risposta_str___not___null) {
        this.risposta_str___not___null = risposta_str___not___null;
    }

    public java.util.List<String> getRisposta_str___in() {
        return risposta_str___in;
    }
    public void setRisposta_str___in(java.util.List<String> risposta_str___in) {
        this.risposta_str___in = risposta_str___in;
    }

    public java.util.List<String> getRisposta_str___not___in() {
        return risposta_str___not___in;
    }
    public void setRisposta_str___not___in(java.util.List<String> risposta_str___not___in) {
        this.risposta_str___not___in = risposta_str___not___in;
    }

    public String getRisposta_str___lt() {
        return risposta_str___lt;
    }
    public void setRisposta_str___lt(String risposta_str___lt) {
        this.risposta_str___lt = risposta_str___lt;
    }

    public String getRisposta_str___lte() {
        return risposta_str___lte;
    }
    public void setRisposta_str___lte(String risposta_str___lte) {
        this.risposta_str___lte = risposta_str___lte;
    }

    public String getRisposta_str___gt() {
        return risposta_str___gt;
    }
    public void setRisposta_str___gt(String risposta_str___gt) {
        this.risposta_str___gt = risposta_str___gt;
    }

    public String getRisposta_str___gte() {
        return risposta_str___gte;
    }
    public void setRisposta_str___gte(String risposta_str___gte) {
        this.risposta_str___gte = risposta_str___gte;
    }

    public String getRisposta_str___contains() {
        return risposta_str___contains;
    }
    public void setRisposta_str___contains(String risposta_str___contains) {
        this.risposta_str___contains = risposta_str___contains;
    }

    public String getRisposta_str___not___contains() {
        return risposta_str___not___contains;
    }
    public void setRisposta_str___not___contains(String risposta_str___not___contains) {
        this.risposta_str___not___contains = risposta_str___not___contains;
    }

    public String getRisposta_str___starts_with() {
        return risposta_str___starts_with;
    }
    public void setRisposta_str___starts_with(String risposta_str___starts_with) {
        this.risposta_str___starts_with = risposta_str___starts_with;
    }

    public String getRisposta_str___not___starts_with() {
        return risposta_str___not___starts_with;
    }
    public void setRisposta_str___not___starts_with(String risposta_str___not___starts_with) {
        this.risposta_str___not___starts_with = risposta_str___not___starts_with;
    }

    public String getRisposta_str___ends_with() {
        return risposta_str___ends_with;
    }
    public void setRisposta_str___ends_with(String risposta_str___ends_with) {
        this.risposta_str___ends_with = risposta_str___ends_with;
    }

    public String getRisposta_str___not___ends_with() {
        return risposta_str___not___ends_with;
    }
    public void setRisposta_str___not___ends_with(String risposta_str___not___ends_with) {
        this.risposta_str___not___ends_with = risposta_str___not___ends_with;
    }

    public Boolean getScala_intera___eq() {
        return scala_intera___eq;
    }
    public void setScala_intera___eq(Boolean scala_intera___eq) {
        this.scala_intera___eq = scala_intera___eq;
    }

    public Boolean getScala_intera___ne() {
        return scala_intera___ne;
    }
    public void setScala_intera___ne(Boolean scala_intera___ne) {
        this.scala_intera___ne = scala_intera___ne;
    }

    public Boolean getScala_intera___null() {
        return scala_intera___null;
    }
    public void setScala_intera___null(Boolean scala_intera___null) {
        this.scala_intera___null = scala_intera___null;
    }

    public Boolean getScala_intera___not___null() {
        return scala_intera___not___null;
    }
    public void setScala_intera___not___null(Boolean scala_intera___not___null) {
        this.scala_intera___not___null = scala_intera___not___null;
    }

    public Boolean getSolo_intro___eq() {
        return solo_intro___eq;
    }
    public void setSolo_intro___eq(Boolean solo_intro___eq) {
        this.solo_intro___eq = solo_intro___eq;
    }

    public Boolean getSolo_intro___ne() {
        return solo_intro___ne;
    }
    public void setSolo_intro___ne(Boolean solo_intro___ne) {
        this.solo_intro___ne = solo_intro___ne;
    }

    public Boolean getSolo_intro___null() {
        return solo_intro___null;
    }
    public void setSolo_intro___null(Boolean solo_intro___null) {
        this.solo_intro___null = solo_intro___null;
    }

    public Boolean getSolo_intro___not___null() {
        return solo_intro___not___null;
    }
    public void setSolo_intro___not___null(Boolean solo_intro___not___null) {
        this.solo_intro___not___null = solo_intro___not___null;
    }

    public Boolean getStringa___eq() {
        return stringa___eq;
    }
    public void setStringa___eq(Boolean stringa___eq) {
        this.stringa___eq = stringa___eq;
    }

    public Boolean getStringa___ne() {
        return stringa___ne;
    }
    public void setStringa___ne(Boolean stringa___ne) {
        this.stringa___ne = stringa___ne;
    }

    public Boolean getStringa___null() {
        return stringa___null;
    }
    public void setStringa___null(Boolean stringa___null) {
        this.stringa___null = stringa___null;
    }

    public Boolean getStringa___not___null() {
        return stringa___not___null;
    }
    public void setStringa___not___null(Boolean stringa___not___null) {
        this.stringa___not___null = stringa___not___null;
    }

    public Integer getStudio_questionario_id___eq() {
        return studio_questionario_id___eq;
    }
    public void setStudio_questionario_id___eq(Integer studio_questionario_id___eq) {
        this.studio_questionario_id___eq = studio_questionario_id___eq;
    }

    public Integer getStudio_questionario_id___ne() {
        return studio_questionario_id___ne;
    }
    public void setStudio_questionario_id___ne(Integer studio_questionario_id___ne) {
        this.studio_questionario_id___ne = studio_questionario_id___ne;
    }

    public Boolean getStudio_questionario_id___null() {
        return studio_questionario_id___null;
    }
    public void setStudio_questionario_id___null(Boolean studio_questionario_id___null) {
        this.studio_questionario_id___null = studio_questionario_id___null;
    }

    public Boolean getStudio_questionario_id___not___null() {
        return studio_questionario_id___not___null;
    }
    public void setStudio_questionario_id___not___null(Boolean studio_questionario_id___not___null) {
        this.studio_questionario_id___not___null = studio_questionario_id___not___null;
    }

    public java.util.List<Integer> getStudio_questionario_id___in() {
        return studio_questionario_id___in;
    }
    public void setStudio_questionario_id___in(java.util.List<Integer> studio_questionario_id___in) {
        this.studio_questionario_id___in = studio_questionario_id___in;
    }

    public java.util.List<Integer> getStudio_questionario_id___not___in() {
        return studio_questionario_id___not___in;
    }
    public void setStudio_questionario_id___not___in(java.util.List<Integer> studio_questionario_id___not___in) {
        this.studio_questionario_id___not___in = studio_questionario_id___not___in;
    }

    public Integer getStudio_questionario_id___lt() {
        return studio_questionario_id___lt;
    }
    public void setStudio_questionario_id___lt(Integer studio_questionario_id___lt) {
        this.studio_questionario_id___lt = studio_questionario_id___lt;
    }

    public Integer getStudio_questionario_id___lte() {
        return studio_questionario_id___lte;
    }
    public void setStudio_questionario_id___lte(Integer studio_questionario_id___lte) {
        this.studio_questionario_id___lte = studio_questionario_id___lte;
    }

    public Integer getStudio_questionario_id___gt() {
        return studio_questionario_id___gt;
    }
    public void setStudio_questionario_id___gt(Integer studio_questionario_id___gt) {
        this.studio_questionario_id___gt = studio_questionario_id___gt;
    }

    public Integer getStudio_questionario_id___gte() {
        return studio_questionario_id___gte;
    }
    public void setStudio_questionario_id___gte(Integer studio_questionario_id___gte) {
        this.studio_questionario_id___gte = studio_questionario_id___gte;
    }

    public java.util.List<CliRispostaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliRispostaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliRispostaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliRispostaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliRispostaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliRispostaFilterDTO NOT) {
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
        if (alert_obbligatoria___eq != null) {
            joiner.add("alert_obbligatoria___eq: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria___eq));
        }
        if (alert_obbligatoria___ne != null) {
            joiner.add("alert_obbligatoria___ne: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria___ne));
        }
        if (alert_obbligatoria___null != null) {
            joiner.add("alert_obbligatoria___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria___null));
        }
        if (alert_obbligatoria___not___null != null) {
            joiner.add("alert_obbligatoria___not___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria___not___null));
        }
        if (codice_interno_i___eq != null) {
            joiner.add("codice_interno_i___eq: " + GraphQLRequestSerializer.getEntry(codice_interno_i___eq));
        }
        if (codice_interno_i___ne != null) {
            joiner.add("codice_interno_i___ne: " + GraphQLRequestSerializer.getEntry(codice_interno_i___ne));
        }
        if (codice_interno_i___null != null) {
            joiner.add("codice_interno_i___null: " + GraphQLRequestSerializer.getEntry(codice_interno_i___null));
        }
        if (codice_interno_i___not___null != null) {
            joiner.add("codice_interno_i___not___null: " + GraphQLRequestSerializer.getEntry(codice_interno_i___not___null));
        }
        if (codice_interno_i___in != null) {
            joiner.add("codice_interno_i___in: " + GraphQLRequestSerializer.getEntry(codice_interno_i___in));
        }
        if (codice_interno_i___not___in != null) {
            joiner.add("codice_interno_i___not___in: " + GraphQLRequestSerializer.getEntry(codice_interno_i___not___in));
        }
        if (codice_interno_i___lt != null) {
            joiner.add("codice_interno_i___lt: " + GraphQLRequestSerializer.getEntry(codice_interno_i___lt));
        }
        if (codice_interno_i___lte != null) {
            joiner.add("codice_interno_i___lte: " + GraphQLRequestSerializer.getEntry(codice_interno_i___lte));
        }
        if (codice_interno_i___gt != null) {
            joiner.add("codice_interno_i___gt: " + GraphQLRequestSerializer.getEntry(codice_interno_i___gt));
        }
        if (codice_interno_i___gte != null) {
            joiner.add("codice_interno_i___gte: " + GraphQLRequestSerializer.getEntry(codice_interno_i___gte));
        }
        if (codice_interno_i___contains != null) {
            joiner.add("codice_interno_i___contains: " + GraphQLRequestSerializer.getEntry(codice_interno_i___contains));
        }
        if (codice_interno_i___not___contains != null) {
            joiner.add("codice_interno_i___not___contains: " + GraphQLRequestSerializer.getEntry(codice_interno_i___not___contains));
        }
        if (codice_interno_i___starts_with != null) {
            joiner.add("codice_interno_i___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno_i___starts_with));
        }
        if (codice_interno_i___not___starts_with != null) {
            joiner.add("codice_interno_i___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno_i___not___starts_with));
        }
        if (codice_interno_i___ends_with != null) {
            joiner.add("codice_interno_i___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno_i___ends_with));
        }
        if (codice_interno_i___not___ends_with != null) {
            joiner.add("codice_interno_i___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno_i___not___ends_with));
        }
        if (decimale___eq != null) {
            joiner.add("decimale___eq: " + GraphQLRequestSerializer.getEntry(decimale___eq));
        }
        if (decimale___ne != null) {
            joiner.add("decimale___ne: " + GraphQLRequestSerializer.getEntry(decimale___ne));
        }
        if (decimale___null != null) {
            joiner.add("decimale___null: " + GraphQLRequestSerializer.getEntry(decimale___null));
        }
        if (decimale___not___null != null) {
            joiner.add("decimale___not___null: " + GraphQLRequestSerializer.getEntry(decimale___not___null));
        }
        if (domanda___eq != null) {
            joiner.add("domanda___eq: " + GraphQLRequestSerializer.getEntry(domanda___eq));
        }
        if (domanda___ne != null) {
            joiner.add("domanda___ne: " + GraphQLRequestSerializer.getEntry(domanda___ne));
        }
        if (domanda___null != null) {
            joiner.add("domanda___null: " + GraphQLRequestSerializer.getEntry(domanda___null));
        }
        if (domanda___not___null != null) {
            joiner.add("domanda___not___null: " + GraphQLRequestSerializer.getEntry(domanda___not___null));
        }
        if (domanda___in != null) {
            joiner.add("domanda___in: " + GraphQLRequestSerializer.getEntry(domanda___in));
        }
        if (domanda___not___in != null) {
            joiner.add("domanda___not___in: " + GraphQLRequestSerializer.getEntry(domanda___not___in));
        }
        if (domanda___lt != null) {
            joiner.add("domanda___lt: " + GraphQLRequestSerializer.getEntry(domanda___lt));
        }
        if (domanda___lte != null) {
            joiner.add("domanda___lte: " + GraphQLRequestSerializer.getEntry(domanda___lte));
        }
        if (domanda___gt != null) {
            joiner.add("domanda___gt: " + GraphQLRequestSerializer.getEntry(domanda___gt));
        }
        if (domanda___gte != null) {
            joiner.add("domanda___gte: " + GraphQLRequestSerializer.getEntry(domanda___gte));
        }
        if (domanda___contains != null) {
            joiner.add("domanda___contains: " + GraphQLRequestSerializer.getEntry(domanda___contains));
        }
        if (domanda___not___contains != null) {
            joiner.add("domanda___not___contains: " + GraphQLRequestSerializer.getEntry(domanda___not___contains));
        }
        if (domanda___starts_with != null) {
            joiner.add("domanda___starts_with: " + GraphQLRequestSerializer.getEntry(domanda___starts_with));
        }
        if (domanda___not___starts_with != null) {
            joiner.add("domanda___not___starts_with: " + GraphQLRequestSerializer.getEntry(domanda___not___starts_with));
        }
        if (domanda___ends_with != null) {
            joiner.add("domanda___ends_with: " + GraphQLRequestSerializer.getEntry(domanda___ends_with));
        }
        if (domanda___not___ends_with != null) {
            joiner.add("domanda___not___ends_with: " + GraphQLRequestSerializer.getEntry(domanda___not___ends_with));
        }
        if (domanda_id___eq != null) {
            joiner.add("domanda_id___eq: " + GraphQLRequestSerializer.getEntry(domanda_id___eq));
        }
        if (domanda_id___ne != null) {
            joiner.add("domanda_id___ne: " + GraphQLRequestSerializer.getEntry(domanda_id___ne));
        }
        if (domanda_id___null != null) {
            joiner.add("domanda_id___null: " + GraphQLRequestSerializer.getEntry(domanda_id___null));
        }
        if (domanda_id___not___null != null) {
            joiner.add("domanda_id___not___null: " + GraphQLRequestSerializer.getEntry(domanda_id___not___null));
        }
        if (domanda_id___in != null) {
            joiner.add("domanda_id___in: " + GraphQLRequestSerializer.getEntry(domanda_id___in));
        }
        if (domanda_id___not___in != null) {
            joiner.add("domanda_id___not___in: " + GraphQLRequestSerializer.getEntry(domanda_id___not___in));
        }
        if (domanda_id___lt != null) {
            joiner.add("domanda_id___lt: " + GraphQLRequestSerializer.getEntry(domanda_id___lt));
        }
        if (domanda_id___lte != null) {
            joiner.add("domanda_id___lte: " + GraphQLRequestSerializer.getEntry(domanda_id___lte));
        }
        if (domanda_id___gt != null) {
            joiner.add("domanda_id___gt: " + GraphQLRequestSerializer.getEntry(domanda_id___gt));
        }
        if (domanda_id___gte != null) {
            joiner.add("domanda_id___gte: " + GraphQLRequestSerializer.getEntry(domanda_id___gte));
        }
        if (domande_questionario_ids___eq != null) {
            joiner.add("domande_questionario_ids___eq: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___eq));
        }
        if (domande_questionario_ids___ne != null) {
            joiner.add("domande_questionario_ids___ne: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___ne));
        }
        if (domande_questionario_ids___null != null) {
            joiner.add("domande_questionario_ids___null: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___null));
        }
        if (domande_questionario_ids___not___null != null) {
            joiner.add("domande_questionario_ids___not___null: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___not___null));
        }
        if (domande_questionario_ids___in != null) {
            joiner.add("domande_questionario_ids___in: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___in));
        }
        if (domande_questionario_ids___not___in != null) {
            joiner.add("domande_questionario_ids___not___in: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___not___in));
        }
        if (domande_questionario_ids___lt != null) {
            joiner.add("domande_questionario_ids___lt: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___lt));
        }
        if (domande_questionario_ids___lte != null) {
            joiner.add("domande_questionario_ids___lte: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___lte));
        }
        if (domande_questionario_ids___gt != null) {
            joiner.add("domande_questionario_ids___gt: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___gt));
        }
        if (domande_questionario_ids___gte != null) {
            joiner.add("domande_questionario_ids___gte: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___gte));
        }
        if (domande_questionario_ids___contains != null) {
            joiner.add("domande_questionario_ids___contains: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___contains));
        }
        if (domande_questionario_ids___not___contains != null) {
            joiner.add("domande_questionario_ids___not___contains: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___not___contains));
        }
        if (domande_questionario_ids___starts_with != null) {
            joiner.add("domande_questionario_ids___starts_with: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___starts_with));
        }
        if (domande_questionario_ids___not___starts_with != null) {
            joiner.add("domande_questionario_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___not___starts_with));
        }
        if (domande_questionario_ids___ends_with != null) {
            joiner.add("domande_questionario_ids___ends_with: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___ends_with));
        }
        if (domande_questionario_ids___not___ends_with != null) {
            joiner.add("domande_questionario_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids___not___ends_with));
        }
        if (id_risposta_peso___eq != null) {
            joiner.add("id_risposta_peso___eq: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___eq));
        }
        if (id_risposta_peso___ne != null) {
            joiner.add("id_risposta_peso___ne: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___ne));
        }
        if (id_risposta_peso___null != null) {
            joiner.add("id_risposta_peso___null: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___null));
        }
        if (id_risposta_peso___not___null != null) {
            joiner.add("id_risposta_peso___not___null: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___not___null));
        }
        if (id_risposta_peso___in != null) {
            joiner.add("id_risposta_peso___in: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___in));
        }
        if (id_risposta_peso___not___in != null) {
            joiner.add("id_risposta_peso___not___in: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___not___in));
        }
        if (id_risposta_peso___lt != null) {
            joiner.add("id_risposta_peso___lt: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___lt));
        }
        if (id_risposta_peso___lte != null) {
            joiner.add("id_risposta_peso___lte: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___lte));
        }
        if (id_risposta_peso___gt != null) {
            joiner.add("id_risposta_peso___gt: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___gt));
        }
        if (id_risposta_peso___gte != null) {
            joiner.add("id_risposta_peso___gte: " + GraphQLRequestSerializer.getEntry(id_risposta_peso___gte));
        }
        if (intero___eq != null) {
            joiner.add("intero___eq: " + GraphQLRequestSerializer.getEntry(intero___eq));
        }
        if (intero___ne != null) {
            joiner.add("intero___ne: " + GraphQLRequestSerializer.getEntry(intero___ne));
        }
        if (intero___null != null) {
            joiner.add("intero___null: " + GraphQLRequestSerializer.getEntry(intero___null));
        }
        if (intero___not___null != null) {
            joiner.add("intero___not___null: " + GraphQLRequestSerializer.getEntry(intero___not___null));
        }
        if (obbligatoria___eq != null) {
            joiner.add("obbligatoria___eq: " + GraphQLRequestSerializer.getEntry(obbligatoria___eq));
        }
        if (obbligatoria___ne != null) {
            joiner.add("obbligatoria___ne: " + GraphQLRequestSerializer.getEntry(obbligatoria___ne));
        }
        if (obbligatoria___null != null) {
            joiner.add("obbligatoria___null: " + GraphQLRequestSerializer.getEntry(obbligatoria___null));
        }
        if (obbligatoria___not___null != null) {
            joiner.add("obbligatoria___not___null: " + GraphQLRequestSerializer.getEntry(obbligatoria___not___null));
        }
        if (opzioni_multipla___eq != null) {
            joiner.add("opzioni_multipla___eq: " + GraphQLRequestSerializer.getEntry(opzioni_multipla___eq));
        }
        if (opzioni_multipla___ne != null) {
            joiner.add("opzioni_multipla___ne: " + GraphQLRequestSerializer.getEntry(opzioni_multipla___ne));
        }
        if (opzioni_multipla___null != null) {
            joiner.add("opzioni_multipla___null: " + GraphQLRequestSerializer.getEntry(opzioni_multipla___null));
        }
        if (opzioni_multipla___not___null != null) {
            joiner.add("opzioni_multipla___not___null: " + GraphQLRequestSerializer.getEntry(opzioni_multipla___not___null));
        }
        if (opzioni_singola___eq != null) {
            joiner.add("opzioni_singola___eq: " + GraphQLRequestSerializer.getEntry(opzioni_singola___eq));
        }
        if (opzioni_singola___ne != null) {
            joiner.add("opzioni_singola___ne: " + GraphQLRequestSerializer.getEntry(opzioni_singola___ne));
        }
        if (opzioni_singola___null != null) {
            joiner.add("opzioni_singola___null: " + GraphQLRequestSerializer.getEntry(opzioni_singola___null));
        }
        if (opzioni_singola___not___null != null) {
            joiner.add("opzioni_singola___not___null: " + GraphQLRequestSerializer.getEntry(opzioni_singola___not___null));
        }
        if (ordine___eq != null) {
            joiner.add("ordine___eq: " + GraphQLRequestSerializer.getEntry(ordine___eq));
        }
        if (ordine___ne != null) {
            joiner.add("ordine___ne: " + GraphQLRequestSerializer.getEntry(ordine___ne));
        }
        if (ordine___null != null) {
            joiner.add("ordine___null: " + GraphQLRequestSerializer.getEntry(ordine___null));
        }
        if (ordine___not___null != null) {
            joiner.add("ordine___not___null: " + GraphQLRequestSerializer.getEntry(ordine___not___null));
        }
        if (ordine___in != null) {
            joiner.add("ordine___in: " + GraphQLRequestSerializer.getEntry(ordine___in));
        }
        if (ordine___not___in != null) {
            joiner.add("ordine___not___in: " + GraphQLRequestSerializer.getEntry(ordine___not___in));
        }
        if (ordine___lt != null) {
            joiner.add("ordine___lt: " + GraphQLRequestSerializer.getEntry(ordine___lt));
        }
        if (ordine___lte != null) {
            joiner.add("ordine___lte: " + GraphQLRequestSerializer.getEntry(ordine___lte));
        }
        if (ordine___gt != null) {
            joiner.add("ordine___gt: " + GraphQLRequestSerializer.getEntry(ordine___gt));
        }
        if (ordine___gte != null) {
            joiner.add("ordine___gte: " + GraphQLRequestSerializer.getEntry(ordine___gte));
        }
        if (ordine_risposta___eq != null) {
            joiner.add("ordine_risposta___eq: " + GraphQLRequestSerializer.getEntry(ordine_risposta___eq));
        }
        if (ordine_risposta___ne != null) {
            joiner.add("ordine_risposta___ne: " + GraphQLRequestSerializer.getEntry(ordine_risposta___ne));
        }
        if (ordine_risposta___null != null) {
            joiner.add("ordine_risposta___null: " + GraphQLRequestSerializer.getEntry(ordine_risposta___null));
        }
        if (ordine_risposta___not___null != null) {
            joiner.add("ordine_risposta___not___null: " + GraphQLRequestSerializer.getEntry(ordine_risposta___not___null));
        }
        if (ordine_risposta___in != null) {
            joiner.add("ordine_risposta___in: " + GraphQLRequestSerializer.getEntry(ordine_risposta___in));
        }
        if (ordine_risposta___not___in != null) {
            joiner.add("ordine_risposta___not___in: " + GraphQLRequestSerializer.getEntry(ordine_risposta___not___in));
        }
        if (ordine_risposta___lt != null) {
            joiner.add("ordine_risposta___lt: " + GraphQLRequestSerializer.getEntry(ordine_risposta___lt));
        }
        if (ordine_risposta___lte != null) {
            joiner.add("ordine_risposta___lte: " + GraphQLRequestSerializer.getEntry(ordine_risposta___lte));
        }
        if (ordine_risposta___gt != null) {
            joiner.add("ordine_risposta___gt: " + GraphQLRequestSerializer.getEntry(ordine_risposta___gt));
        }
        if (ordine_risposta___gte != null) {
            joiner.add("ordine_risposta___gte: " + GraphQLRequestSerializer.getEntry(ordine_risposta___gte));
        }
        if (peso_punteggio___eq != null) {
            joiner.add("peso_punteggio___eq: " + GraphQLRequestSerializer.getEntry(peso_punteggio___eq));
        }
        if (peso_punteggio___ne != null) {
            joiner.add("peso_punteggio___ne: " + GraphQLRequestSerializer.getEntry(peso_punteggio___ne));
        }
        if (peso_punteggio___null != null) {
            joiner.add("peso_punteggio___null: " + GraphQLRequestSerializer.getEntry(peso_punteggio___null));
        }
        if (peso_punteggio___not___null != null) {
            joiner.add("peso_punteggio___not___null: " + GraphQLRequestSerializer.getEntry(peso_punteggio___not___null));
        }
        if (peso_punteggio___in != null) {
            joiner.add("peso_punteggio___in: " + GraphQLRequestSerializer.getEntry(peso_punteggio___in));
        }
        if (peso_punteggio___not___in != null) {
            joiner.add("peso_punteggio___not___in: " + GraphQLRequestSerializer.getEntry(peso_punteggio___not___in));
        }
        if (peso_punteggio___lt != null) {
            joiner.add("peso_punteggio___lt: " + GraphQLRequestSerializer.getEntry(peso_punteggio___lt));
        }
        if (peso_punteggio___lte != null) {
            joiner.add("peso_punteggio___lte: " + GraphQLRequestSerializer.getEntry(peso_punteggio___lte));
        }
        if (peso_punteggio___gt != null) {
            joiner.add("peso_punteggio___gt: " + GraphQLRequestSerializer.getEntry(peso_punteggio___gt));
        }
        if (peso_punteggio___gte != null) {
            joiner.add("peso_punteggio___gte: " + GraphQLRequestSerializer.getEntry(peso_punteggio___gte));
        }
        if (punteggio_risposta___eq != null) {
            joiner.add("punteggio_risposta___eq: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___eq));
        }
        if (punteggio_risposta___ne != null) {
            joiner.add("punteggio_risposta___ne: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___ne));
        }
        if (punteggio_risposta___null != null) {
            joiner.add("punteggio_risposta___null: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___null));
        }
        if (punteggio_risposta___not___null != null) {
            joiner.add("punteggio_risposta___not___null: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___not___null));
        }
        if (punteggio_risposta___in != null) {
            joiner.add("punteggio_risposta___in: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___in));
        }
        if (punteggio_risposta___not___in != null) {
            joiner.add("punteggio_risposta___not___in: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___not___in));
        }
        if (punteggio_risposta___lt != null) {
            joiner.add("punteggio_risposta___lt: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___lt));
        }
        if (punteggio_risposta___lte != null) {
            joiner.add("punteggio_risposta___lte: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___lte));
        }
        if (punteggio_risposta___gt != null) {
            joiner.add("punteggio_risposta___gt: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___gt));
        }
        if (punteggio_risposta___gte != null) {
            joiner.add("punteggio_risposta___gte: " + GraphQLRequestSerializer.getEntry(punteggio_risposta___gte));
        }
        if (punteggio_totale___eq != null) {
            joiner.add("punteggio_totale___eq: " + GraphQLRequestSerializer.getEntry(punteggio_totale___eq));
        }
        if (punteggio_totale___ne != null) {
            joiner.add("punteggio_totale___ne: " + GraphQLRequestSerializer.getEntry(punteggio_totale___ne));
        }
        if (punteggio_totale___null != null) {
            joiner.add("punteggio_totale___null: " + GraphQLRequestSerializer.getEntry(punteggio_totale___null));
        }
        if (punteggio_totale___not___null != null) {
            joiner.add("punteggio_totale___not___null: " + GraphQLRequestSerializer.getEntry(punteggio_totale___not___null));
        }
        if (punteggio_totale___in != null) {
            joiner.add("punteggio_totale___in: " + GraphQLRequestSerializer.getEntry(punteggio_totale___in));
        }
        if (punteggio_totale___not___in != null) {
            joiner.add("punteggio_totale___not___in: " + GraphQLRequestSerializer.getEntry(punteggio_totale___not___in));
        }
        if (punteggio_totale___lt != null) {
            joiner.add("punteggio_totale___lt: " + GraphQLRequestSerializer.getEntry(punteggio_totale___lt));
        }
        if (punteggio_totale___lte != null) {
            joiner.add("punteggio_totale___lte: " + GraphQLRequestSerializer.getEntry(punteggio_totale___lte));
        }
        if (punteggio_totale___gt != null) {
            joiner.add("punteggio_totale___gt: " + GraphQLRequestSerializer.getEntry(punteggio_totale___gt));
        }
        if (punteggio_totale___gte != null) {
            joiner.add("punteggio_totale___gte: " + GraphQLRequestSerializer.getEntry(punteggio_totale___gte));
        }
        if (questionario_id___eq != null) {
            joiner.add("questionario_id___eq: " + GraphQLRequestSerializer.getEntry(questionario_id___eq));
        }
        if (questionario_id___ne != null) {
            joiner.add("questionario_id___ne: " + GraphQLRequestSerializer.getEntry(questionario_id___ne));
        }
        if (questionario_id___null != null) {
            joiner.add("questionario_id___null: " + GraphQLRequestSerializer.getEntry(questionario_id___null));
        }
        if (questionario_id___not___null != null) {
            joiner.add("questionario_id___not___null: " + GraphQLRequestSerializer.getEntry(questionario_id___not___null));
        }
        if (questionario_id___in != null) {
            joiner.add("questionario_id___in: " + GraphQLRequestSerializer.getEntry(questionario_id___in));
        }
        if (questionario_id___not___in != null) {
            joiner.add("questionario_id___not___in: " + GraphQLRequestSerializer.getEntry(questionario_id___not___in));
        }
        if (questionario_id___lt != null) {
            joiner.add("questionario_id___lt: " + GraphQLRequestSerializer.getEntry(questionario_id___lt));
        }
        if (questionario_id___lte != null) {
            joiner.add("questionario_id___lte: " + GraphQLRequestSerializer.getEntry(questionario_id___lte));
        }
        if (questionario_id___gt != null) {
            joiner.add("questionario_id___gt: " + GraphQLRequestSerializer.getEntry(questionario_id___gt));
        }
        if (questionario_id___gte != null) {
            joiner.add("questionario_id___gte: " + GraphQLRequestSerializer.getEntry(questionario_id___gte));
        }
        if (questionario_pro_app_id___eq != null) {
            joiner.add("questionario_pro_app_id___eq: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___eq));
        }
        if (questionario_pro_app_id___ne != null) {
            joiner.add("questionario_pro_app_id___ne: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___ne));
        }
        if (questionario_pro_app_id___null != null) {
            joiner.add("questionario_pro_app_id___null: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___null));
        }
        if (questionario_pro_app_id___not___null != null) {
            joiner.add("questionario_pro_app_id___not___null: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___not___null));
        }
        if (questionario_pro_app_id___in != null) {
            joiner.add("questionario_pro_app_id___in: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___in));
        }
        if (questionario_pro_app_id___not___in != null) {
            joiner.add("questionario_pro_app_id___not___in: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___not___in));
        }
        if (questionario_pro_app_id___lt != null) {
            joiner.add("questionario_pro_app_id___lt: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___lt));
        }
        if (questionario_pro_app_id___lte != null) {
            joiner.add("questionario_pro_app_id___lte: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___lte));
        }
        if (questionario_pro_app_id___gt != null) {
            joiner.add("questionario_pro_app_id___gt: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___gt));
        }
        if (questionario_pro_app_id___gte != null) {
            joiner.add("questionario_pro_app_id___gte: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id___gte));
        }
        if (risposta___eq != null) {
            joiner.add("risposta___eq: " + GraphQLRequestSerializer.getEntry(risposta___eq));
        }
        if (risposta___ne != null) {
            joiner.add("risposta___ne: " + GraphQLRequestSerializer.getEntry(risposta___ne));
        }
        if (risposta___null != null) {
            joiner.add("risposta___null: " + GraphQLRequestSerializer.getEntry(risposta___null));
        }
        if (risposta___not___null != null) {
            joiner.add("risposta___not___null: " + GraphQLRequestSerializer.getEntry(risposta___not___null));
        }
        if (risposta___in != null) {
            joiner.add("risposta___in: " + GraphQLRequestSerializer.getEntry(risposta___in));
        }
        if (risposta___not___in != null) {
            joiner.add("risposta___not___in: " + GraphQLRequestSerializer.getEntry(risposta___not___in));
        }
        if (risposta___lt != null) {
            joiner.add("risposta___lt: " + GraphQLRequestSerializer.getEntry(risposta___lt));
        }
        if (risposta___lte != null) {
            joiner.add("risposta___lte: " + GraphQLRequestSerializer.getEntry(risposta___lte));
        }
        if (risposta___gt != null) {
            joiner.add("risposta___gt: " + GraphQLRequestSerializer.getEntry(risposta___gt));
        }
        if (risposta___gte != null) {
            joiner.add("risposta___gte: " + GraphQLRequestSerializer.getEntry(risposta___gte));
        }
        if (risposta___contains != null) {
            joiner.add("risposta___contains: " + GraphQLRequestSerializer.getEntry(risposta___contains));
        }
        if (risposta___not___contains != null) {
            joiner.add("risposta___not___contains: " + GraphQLRequestSerializer.getEntry(risposta___not___contains));
        }
        if (risposta___starts_with != null) {
            joiner.add("risposta___starts_with: " + GraphQLRequestSerializer.getEntry(risposta___starts_with));
        }
        if (risposta___not___starts_with != null) {
            joiner.add("risposta___not___starts_with: " + GraphQLRequestSerializer.getEntry(risposta___not___starts_with));
        }
        if (risposta___ends_with != null) {
            joiner.add("risposta___ends_with: " + GraphQLRequestSerializer.getEntry(risposta___ends_with));
        }
        if (risposta___not___ends_with != null) {
            joiner.add("risposta___not___ends_with: " + GraphQLRequestSerializer.getEntry(risposta___not___ends_with));
        }
        if (risposta_dec___eq != null) {
            joiner.add("risposta_dec___eq: " + GraphQLRequestSerializer.getEntry(risposta_dec___eq));
        }
        if (risposta_dec___ne != null) {
            joiner.add("risposta_dec___ne: " + GraphQLRequestSerializer.getEntry(risposta_dec___ne));
        }
        if (risposta_dec___null != null) {
            joiner.add("risposta_dec___null: " + GraphQLRequestSerializer.getEntry(risposta_dec___null));
        }
        if (risposta_dec___not___null != null) {
            joiner.add("risposta_dec___not___null: " + GraphQLRequestSerializer.getEntry(risposta_dec___not___null));
        }
        if (risposta_dec___in != null) {
            joiner.add("risposta_dec___in: " + GraphQLRequestSerializer.getEntry(risposta_dec___in));
        }
        if (risposta_dec___not___in != null) {
            joiner.add("risposta_dec___not___in: " + GraphQLRequestSerializer.getEntry(risposta_dec___not___in));
        }
        if (risposta_dec___lt != null) {
            joiner.add("risposta_dec___lt: " + GraphQLRequestSerializer.getEntry(risposta_dec___lt));
        }
        if (risposta_dec___lte != null) {
            joiner.add("risposta_dec___lte: " + GraphQLRequestSerializer.getEntry(risposta_dec___lte));
        }
        if (risposta_dec___gt != null) {
            joiner.add("risposta_dec___gt: " + GraphQLRequestSerializer.getEntry(risposta_dec___gt));
        }
        if (risposta_dec___gte != null) {
            joiner.add("risposta_dec___gte: " + GraphQLRequestSerializer.getEntry(risposta_dec___gte));
        }
        if (risposta_int___eq != null) {
            joiner.add("risposta_int___eq: " + GraphQLRequestSerializer.getEntry(risposta_int___eq));
        }
        if (risposta_int___ne != null) {
            joiner.add("risposta_int___ne: " + GraphQLRequestSerializer.getEntry(risposta_int___ne));
        }
        if (risposta_int___null != null) {
            joiner.add("risposta_int___null: " + GraphQLRequestSerializer.getEntry(risposta_int___null));
        }
        if (risposta_int___not___null != null) {
            joiner.add("risposta_int___not___null: " + GraphQLRequestSerializer.getEntry(risposta_int___not___null));
        }
        if (risposta_int___in != null) {
            joiner.add("risposta_int___in: " + GraphQLRequestSerializer.getEntry(risposta_int___in));
        }
        if (risposta_int___not___in != null) {
            joiner.add("risposta_int___not___in: " + GraphQLRequestSerializer.getEntry(risposta_int___not___in));
        }
        if (risposta_int___lt != null) {
            joiner.add("risposta_int___lt: " + GraphQLRequestSerializer.getEntry(risposta_int___lt));
        }
        if (risposta_int___lte != null) {
            joiner.add("risposta_int___lte: " + GraphQLRequestSerializer.getEntry(risposta_int___lte));
        }
        if (risposta_int___gt != null) {
            joiner.add("risposta_int___gt: " + GraphQLRequestSerializer.getEntry(risposta_int___gt));
        }
        if (risposta_int___gte != null) {
            joiner.add("risposta_int___gte: " + GraphQLRequestSerializer.getEntry(risposta_int___gte));
        }
        if (risposta_multipla___eq != null) {
            joiner.add("risposta_multipla___eq: " + GraphQLRequestSerializer.getEntry(risposta_multipla___eq));
        }
        if (risposta_multipla___ne != null) {
            joiner.add("risposta_multipla___ne: " + GraphQLRequestSerializer.getEntry(risposta_multipla___ne));
        }
        if (risposta_multipla___null != null) {
            joiner.add("risposta_multipla___null: " + GraphQLRequestSerializer.getEntry(risposta_multipla___null));
        }
        if (risposta_multipla___not___null != null) {
            joiner.add("risposta_multipla___not___null: " + GraphQLRequestSerializer.getEntry(risposta_multipla___not___null));
        }
        if (risposta_multipla___in != null) {
            joiner.add("risposta_multipla___in: " + GraphQLRequestSerializer.getEntry(risposta_multipla___in));
        }
        if (risposta_multipla___not___in != null) {
            joiner.add("risposta_multipla___not___in: " + GraphQLRequestSerializer.getEntry(risposta_multipla___not___in));
        }
        if (risposta_multipla___lt != null) {
            joiner.add("risposta_multipla___lt: " + GraphQLRequestSerializer.getEntry(risposta_multipla___lt));
        }
        if (risposta_multipla___lte != null) {
            joiner.add("risposta_multipla___lte: " + GraphQLRequestSerializer.getEntry(risposta_multipla___lte));
        }
        if (risposta_multipla___gt != null) {
            joiner.add("risposta_multipla___gt: " + GraphQLRequestSerializer.getEntry(risposta_multipla___gt));
        }
        if (risposta_multipla___gte != null) {
            joiner.add("risposta_multipla___gte: " + GraphQLRequestSerializer.getEntry(risposta_multipla___gte));
        }
        if (risposta_multipla___contains != null) {
            joiner.add("risposta_multipla___contains: " + GraphQLRequestSerializer.getEntry(risposta_multipla___contains));
        }
        if (risposta_multipla___not___contains != null) {
            joiner.add("risposta_multipla___not___contains: " + GraphQLRequestSerializer.getEntry(risposta_multipla___not___contains));
        }
        if (risposta_multipla___starts_with != null) {
            joiner.add("risposta_multipla___starts_with: " + GraphQLRequestSerializer.getEntry(risposta_multipla___starts_with));
        }
        if (risposta_multipla___not___starts_with != null) {
            joiner.add("risposta_multipla___not___starts_with: " + GraphQLRequestSerializer.getEntry(risposta_multipla___not___starts_with));
        }
        if (risposta_multipla___ends_with != null) {
            joiner.add("risposta_multipla___ends_with: " + GraphQLRequestSerializer.getEntry(risposta_multipla___ends_with));
        }
        if (risposta_multipla___not___ends_with != null) {
            joiner.add("risposta_multipla___not___ends_with: " + GraphQLRequestSerializer.getEntry(risposta_multipla___not___ends_with));
        }
        if (risposta_str___eq != null) {
            joiner.add("risposta_str___eq: " + GraphQLRequestSerializer.getEntry(risposta_str___eq));
        }
        if (risposta_str___ne != null) {
            joiner.add("risposta_str___ne: " + GraphQLRequestSerializer.getEntry(risposta_str___ne));
        }
        if (risposta_str___null != null) {
            joiner.add("risposta_str___null: " + GraphQLRequestSerializer.getEntry(risposta_str___null));
        }
        if (risposta_str___not___null != null) {
            joiner.add("risposta_str___not___null: " + GraphQLRequestSerializer.getEntry(risposta_str___not___null));
        }
        if (risposta_str___in != null) {
            joiner.add("risposta_str___in: " + GraphQLRequestSerializer.getEntry(risposta_str___in));
        }
        if (risposta_str___not___in != null) {
            joiner.add("risposta_str___not___in: " + GraphQLRequestSerializer.getEntry(risposta_str___not___in));
        }
        if (risposta_str___lt != null) {
            joiner.add("risposta_str___lt: " + GraphQLRequestSerializer.getEntry(risposta_str___lt));
        }
        if (risposta_str___lte != null) {
            joiner.add("risposta_str___lte: " + GraphQLRequestSerializer.getEntry(risposta_str___lte));
        }
        if (risposta_str___gt != null) {
            joiner.add("risposta_str___gt: " + GraphQLRequestSerializer.getEntry(risposta_str___gt));
        }
        if (risposta_str___gte != null) {
            joiner.add("risposta_str___gte: " + GraphQLRequestSerializer.getEntry(risposta_str___gte));
        }
        if (risposta_str___contains != null) {
            joiner.add("risposta_str___contains: " + GraphQLRequestSerializer.getEntry(risposta_str___contains));
        }
        if (risposta_str___not___contains != null) {
            joiner.add("risposta_str___not___contains: " + GraphQLRequestSerializer.getEntry(risposta_str___not___contains));
        }
        if (risposta_str___starts_with != null) {
            joiner.add("risposta_str___starts_with: " + GraphQLRequestSerializer.getEntry(risposta_str___starts_with));
        }
        if (risposta_str___not___starts_with != null) {
            joiner.add("risposta_str___not___starts_with: " + GraphQLRequestSerializer.getEntry(risposta_str___not___starts_with));
        }
        if (risposta_str___ends_with != null) {
            joiner.add("risposta_str___ends_with: " + GraphQLRequestSerializer.getEntry(risposta_str___ends_with));
        }
        if (risposta_str___not___ends_with != null) {
            joiner.add("risposta_str___not___ends_with: " + GraphQLRequestSerializer.getEntry(risposta_str___not___ends_with));
        }
        if (scala_intera___eq != null) {
            joiner.add("scala_intera___eq: " + GraphQLRequestSerializer.getEntry(scala_intera___eq));
        }
        if (scala_intera___ne != null) {
            joiner.add("scala_intera___ne: " + GraphQLRequestSerializer.getEntry(scala_intera___ne));
        }
        if (scala_intera___null != null) {
            joiner.add("scala_intera___null: " + GraphQLRequestSerializer.getEntry(scala_intera___null));
        }
        if (scala_intera___not___null != null) {
            joiner.add("scala_intera___not___null: " + GraphQLRequestSerializer.getEntry(scala_intera___not___null));
        }
        if (solo_intro___eq != null) {
            joiner.add("solo_intro___eq: " + GraphQLRequestSerializer.getEntry(solo_intro___eq));
        }
        if (solo_intro___ne != null) {
            joiner.add("solo_intro___ne: " + GraphQLRequestSerializer.getEntry(solo_intro___ne));
        }
        if (solo_intro___null != null) {
            joiner.add("solo_intro___null: " + GraphQLRequestSerializer.getEntry(solo_intro___null));
        }
        if (solo_intro___not___null != null) {
            joiner.add("solo_intro___not___null: " + GraphQLRequestSerializer.getEntry(solo_intro___not___null));
        }
        if (stringa___eq != null) {
            joiner.add("stringa___eq: " + GraphQLRequestSerializer.getEntry(stringa___eq));
        }
        if (stringa___ne != null) {
            joiner.add("stringa___ne: " + GraphQLRequestSerializer.getEntry(stringa___ne));
        }
        if (stringa___null != null) {
            joiner.add("stringa___null: " + GraphQLRequestSerializer.getEntry(stringa___null));
        }
        if (stringa___not___null != null) {
            joiner.add("stringa___not___null: " + GraphQLRequestSerializer.getEntry(stringa___not___null));
        }
        if (studio_questionario_id___eq != null) {
            joiner.add("studio_questionario_id___eq: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___eq));
        }
        if (studio_questionario_id___ne != null) {
            joiner.add("studio_questionario_id___ne: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___ne));
        }
        if (studio_questionario_id___null != null) {
            joiner.add("studio_questionario_id___null: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___null));
        }
        if (studio_questionario_id___not___null != null) {
            joiner.add("studio_questionario_id___not___null: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___not___null));
        }
        if (studio_questionario_id___in != null) {
            joiner.add("studio_questionario_id___in: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___in));
        }
        if (studio_questionario_id___not___in != null) {
            joiner.add("studio_questionario_id___not___in: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___not___in));
        }
        if (studio_questionario_id___lt != null) {
            joiner.add("studio_questionario_id___lt: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___lt));
        }
        if (studio_questionario_id___lte != null) {
            joiner.add("studio_questionario_id___lte: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___lte));
        }
        if (studio_questionario_id___gt != null) {
            joiner.add("studio_questionario_id___gt: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___gt));
        }
        if (studio_questionario_id___gte != null) {
            joiner.add("studio_questionario_id___gte: " + GraphQLRequestSerializer.getEntry(studio_questionario_id___gte));
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

    public static CliRispostaFilterDTO.Builder builder() {
        return new CliRispostaFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
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
        private Boolean alert_obbligatoria___eq;
        private Boolean alert_obbligatoria___ne;
        private Boolean alert_obbligatoria___null;
        private Boolean alert_obbligatoria___not___null;
        private String codice_interno_i___eq;
        private String codice_interno_i___ne;
        private Boolean codice_interno_i___null;
        private Boolean codice_interno_i___not___null;
        private java.util.List<String> codice_interno_i___in;
        private java.util.List<String> codice_interno_i___not___in;
        private String codice_interno_i___lt;
        private String codice_interno_i___lte;
        private String codice_interno_i___gt;
        private String codice_interno_i___gte;
        private String codice_interno_i___contains;
        private String codice_interno_i___not___contains;
        private String codice_interno_i___starts_with;
        private String codice_interno_i___not___starts_with;
        private String codice_interno_i___ends_with;
        private String codice_interno_i___not___ends_with;
        private Boolean decimale___eq;
        private Boolean decimale___ne;
        private Boolean decimale___null;
        private Boolean decimale___not___null;
        private String domanda___eq;
        private String domanda___ne;
        private Boolean domanda___null;
        private Boolean domanda___not___null;
        private java.util.List<String> domanda___in;
        private java.util.List<String> domanda___not___in;
        private String domanda___lt;
        private String domanda___lte;
        private String domanda___gt;
        private String domanda___gte;
        private String domanda___contains;
        private String domanda___not___contains;
        private String domanda___starts_with;
        private String domanda___not___starts_with;
        private String domanda___ends_with;
        private String domanda___not___ends_with;
        private Integer domanda_id___eq;
        private Integer domanda_id___ne;
        private Boolean domanda_id___null;
        private Boolean domanda_id___not___null;
        private java.util.List<Integer> domanda_id___in;
        private java.util.List<Integer> domanda_id___not___in;
        private Integer domanda_id___lt;
        private Integer domanda_id___lte;
        private Integer domanda_id___gt;
        private Integer domanda_id___gte;
        private String domande_questionario_ids___eq;
        private String domande_questionario_ids___ne;
        private Boolean domande_questionario_ids___null;
        private Boolean domande_questionario_ids___not___null;
        private java.util.List<String> domande_questionario_ids___in;
        private java.util.List<String> domande_questionario_ids___not___in;
        private String domande_questionario_ids___lt;
        private String domande_questionario_ids___lte;
        private String domande_questionario_ids___gt;
        private String domande_questionario_ids___gte;
        private String domande_questionario_ids___contains;
        private String domande_questionario_ids___not___contains;
        private String domande_questionario_ids___starts_with;
        private String domande_questionario_ids___not___starts_with;
        private String domande_questionario_ids___ends_with;
        private String domande_questionario_ids___not___ends_with;
        private Integer id_risposta_peso___eq;
        private Integer id_risposta_peso___ne;
        private Boolean id_risposta_peso___null;
        private Boolean id_risposta_peso___not___null;
        private java.util.List<Integer> id_risposta_peso___in;
        private java.util.List<Integer> id_risposta_peso___not___in;
        private Integer id_risposta_peso___lt;
        private Integer id_risposta_peso___lte;
        private Integer id_risposta_peso___gt;
        private Integer id_risposta_peso___gte;
        private Boolean intero___eq;
        private Boolean intero___ne;
        private Boolean intero___null;
        private Boolean intero___not___null;
        private Boolean obbligatoria___eq;
        private Boolean obbligatoria___ne;
        private Boolean obbligatoria___null;
        private Boolean obbligatoria___not___null;
        private Boolean opzioni_multipla___eq;
        private Boolean opzioni_multipla___ne;
        private Boolean opzioni_multipla___null;
        private Boolean opzioni_multipla___not___null;
        private Boolean opzioni_singola___eq;
        private Boolean opzioni_singola___ne;
        private Boolean opzioni_singola___null;
        private Boolean opzioni_singola___not___null;
        private Integer ordine___eq;
        private Integer ordine___ne;
        private Boolean ordine___null;
        private Boolean ordine___not___null;
        private java.util.List<Integer> ordine___in;
        private java.util.List<Integer> ordine___not___in;
        private Integer ordine___lt;
        private Integer ordine___lte;
        private Integer ordine___gt;
        private Integer ordine___gte;
        private Integer ordine_risposta___eq;
        private Integer ordine_risposta___ne;
        private Boolean ordine_risposta___null;
        private Boolean ordine_risposta___not___null;
        private java.util.List<Integer> ordine_risposta___in;
        private java.util.List<Integer> ordine_risposta___not___in;
        private Integer ordine_risposta___lt;
        private Integer ordine_risposta___lte;
        private Integer ordine_risposta___gt;
        private Integer ordine_risposta___gte;
        private String peso_punteggio___eq;
        private String peso_punteggio___ne;
        private Boolean peso_punteggio___null;
        private Boolean peso_punteggio___not___null;
        private java.util.List<String> peso_punteggio___in;
        private java.util.List<String> peso_punteggio___not___in;
        private String peso_punteggio___lt;
        private String peso_punteggio___lte;
        private String peso_punteggio___gt;
        private String peso_punteggio___gte;
        private String punteggio_risposta___eq;
        private String punteggio_risposta___ne;
        private Boolean punteggio_risposta___null;
        private Boolean punteggio_risposta___not___null;
        private java.util.List<String> punteggio_risposta___in;
        private java.util.List<String> punteggio_risposta___not___in;
        private String punteggio_risposta___lt;
        private String punteggio_risposta___lte;
        private String punteggio_risposta___gt;
        private String punteggio_risposta___gte;
        private String punteggio_totale___eq;
        private String punteggio_totale___ne;
        private Boolean punteggio_totale___null;
        private Boolean punteggio_totale___not___null;
        private java.util.List<String> punteggio_totale___in;
        private java.util.List<String> punteggio_totale___not___in;
        private String punteggio_totale___lt;
        private String punteggio_totale___lte;
        private String punteggio_totale___gt;
        private String punteggio_totale___gte;
        private Integer questionario_id___eq;
        private Integer questionario_id___ne;
        private Boolean questionario_id___null;
        private Boolean questionario_id___not___null;
        private java.util.List<Integer> questionario_id___in;
        private java.util.List<Integer> questionario_id___not___in;
        private Integer questionario_id___lt;
        private Integer questionario_id___lte;
        private Integer questionario_id___gt;
        private Integer questionario_id___gte;
        private Integer questionario_pro_app_id___eq;
        private Integer questionario_pro_app_id___ne;
        private Boolean questionario_pro_app_id___null;
        private Boolean questionario_pro_app_id___not___null;
        private java.util.List<Integer> questionario_pro_app_id___in;
        private java.util.List<Integer> questionario_pro_app_id___not___in;
        private Integer questionario_pro_app_id___lt;
        private Integer questionario_pro_app_id___lte;
        private Integer questionario_pro_app_id___gt;
        private Integer questionario_pro_app_id___gte;
        private String risposta___eq;
        private String risposta___ne;
        private Boolean risposta___null;
        private Boolean risposta___not___null;
        private java.util.List<String> risposta___in;
        private java.util.List<String> risposta___not___in;
        private String risposta___lt;
        private String risposta___lte;
        private String risposta___gt;
        private String risposta___gte;
        private String risposta___contains;
        private String risposta___not___contains;
        private String risposta___starts_with;
        private String risposta___not___starts_with;
        private String risposta___ends_with;
        private String risposta___not___ends_with;
        private String risposta_dec___eq;
        private String risposta_dec___ne;
        private Boolean risposta_dec___null;
        private Boolean risposta_dec___not___null;
        private java.util.List<String> risposta_dec___in;
        private java.util.List<String> risposta_dec___not___in;
        private String risposta_dec___lt;
        private String risposta_dec___lte;
        private String risposta_dec___gt;
        private String risposta_dec___gte;
        private Integer risposta_int___eq;
        private Integer risposta_int___ne;
        private Boolean risposta_int___null;
        private Boolean risposta_int___not___null;
        private java.util.List<Integer> risposta_int___in;
        private java.util.List<Integer> risposta_int___not___in;
        private Integer risposta_int___lt;
        private Integer risposta_int___lte;
        private Integer risposta_int___gt;
        private Integer risposta_int___gte;
        private String risposta_multipla___eq;
        private String risposta_multipla___ne;
        private Boolean risposta_multipla___null;
        private Boolean risposta_multipla___not___null;
        private java.util.List<String> risposta_multipla___in;
        private java.util.List<String> risposta_multipla___not___in;
        private String risposta_multipla___lt;
        private String risposta_multipla___lte;
        private String risposta_multipla___gt;
        private String risposta_multipla___gte;
        private String risposta_multipla___contains;
        private String risposta_multipla___not___contains;
        private String risposta_multipla___starts_with;
        private String risposta_multipla___not___starts_with;
        private String risposta_multipla___ends_with;
        private String risposta_multipla___not___ends_with;
        private String risposta_str___eq;
        private String risposta_str___ne;
        private Boolean risposta_str___null;
        private Boolean risposta_str___not___null;
        private java.util.List<String> risposta_str___in;
        private java.util.List<String> risposta_str___not___in;
        private String risposta_str___lt;
        private String risposta_str___lte;
        private String risposta_str___gt;
        private String risposta_str___gte;
        private String risposta_str___contains;
        private String risposta_str___not___contains;
        private String risposta_str___starts_with;
        private String risposta_str___not___starts_with;
        private String risposta_str___ends_with;
        private String risposta_str___not___ends_with;
        private Boolean scala_intera___eq;
        private Boolean scala_intera___ne;
        private Boolean scala_intera___null;
        private Boolean scala_intera___not___null;
        private Boolean solo_intro___eq;
        private Boolean solo_intro___ne;
        private Boolean solo_intro___null;
        private Boolean solo_intro___not___null;
        private Boolean stringa___eq;
        private Boolean stringa___ne;
        private Boolean stringa___null;
        private Boolean stringa___not___null;
        private Integer studio_questionario_id___eq;
        private Integer studio_questionario_id___ne;
        private Boolean studio_questionario_id___null;
        private Boolean studio_questionario_id___not___null;
        private java.util.List<Integer> studio_questionario_id___in;
        private java.util.List<Integer> studio_questionario_id___not___in;
        private Integer studio_questionario_id___lt;
        private Integer studio_questionario_id___lte;
        private Integer studio_questionario_id___gt;
        private Integer studio_questionario_id___gte;
        private java.util.List<CliRispostaFilterDTO> AND;
        private java.util.List<CliRispostaFilterDTO> OR;
        private CliRispostaFilterDTO NOT;

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

        public Builder setAlert_obbligatoria___eq(Boolean alert_obbligatoria___eq) {
            this.alert_obbligatoria___eq = alert_obbligatoria___eq;
            return this;
        }

        public Builder setAlert_obbligatoria___ne(Boolean alert_obbligatoria___ne) {
            this.alert_obbligatoria___ne = alert_obbligatoria___ne;
            return this;
        }

        public Builder setAlert_obbligatoria___null(Boolean alert_obbligatoria___null) {
            this.alert_obbligatoria___null = alert_obbligatoria___null;
            return this;
        }

        public Builder setAlert_obbligatoria___not___null(Boolean alert_obbligatoria___not___null) {
            this.alert_obbligatoria___not___null = alert_obbligatoria___not___null;
            return this;
        }

        public Builder setCodice_interno_i___eq(String codice_interno_i___eq) {
            this.codice_interno_i___eq = codice_interno_i___eq;
            return this;
        }

        public Builder setCodice_interno_i___ne(String codice_interno_i___ne) {
            this.codice_interno_i___ne = codice_interno_i___ne;
            return this;
        }

        public Builder setCodice_interno_i___null(Boolean codice_interno_i___null) {
            this.codice_interno_i___null = codice_interno_i___null;
            return this;
        }

        public Builder setCodice_interno_i___not___null(Boolean codice_interno_i___not___null) {
            this.codice_interno_i___not___null = codice_interno_i___not___null;
            return this;
        }

        public Builder setCodice_interno_i___in(java.util.List<String> codice_interno_i___in) {
            this.codice_interno_i___in = codice_interno_i___in;
            return this;
        }

        public Builder setCodice_interno_i___not___in(java.util.List<String> codice_interno_i___not___in) {
            this.codice_interno_i___not___in = codice_interno_i___not___in;
            return this;
        }

        public Builder setCodice_interno_i___lt(String codice_interno_i___lt) {
            this.codice_interno_i___lt = codice_interno_i___lt;
            return this;
        }

        public Builder setCodice_interno_i___lte(String codice_interno_i___lte) {
            this.codice_interno_i___lte = codice_interno_i___lte;
            return this;
        }

        public Builder setCodice_interno_i___gt(String codice_interno_i___gt) {
            this.codice_interno_i___gt = codice_interno_i___gt;
            return this;
        }

        public Builder setCodice_interno_i___gte(String codice_interno_i___gte) {
            this.codice_interno_i___gte = codice_interno_i___gte;
            return this;
        }

        public Builder setCodice_interno_i___contains(String codice_interno_i___contains) {
            this.codice_interno_i___contains = codice_interno_i___contains;
            return this;
        }

        public Builder setCodice_interno_i___not___contains(String codice_interno_i___not___contains) {
            this.codice_interno_i___not___contains = codice_interno_i___not___contains;
            return this;
        }

        public Builder setCodice_interno_i___starts_with(String codice_interno_i___starts_with) {
            this.codice_interno_i___starts_with = codice_interno_i___starts_with;
            return this;
        }

        public Builder setCodice_interno_i___not___starts_with(String codice_interno_i___not___starts_with) {
            this.codice_interno_i___not___starts_with = codice_interno_i___not___starts_with;
            return this;
        }

        public Builder setCodice_interno_i___ends_with(String codice_interno_i___ends_with) {
            this.codice_interno_i___ends_with = codice_interno_i___ends_with;
            return this;
        }

        public Builder setCodice_interno_i___not___ends_with(String codice_interno_i___not___ends_with) {
            this.codice_interno_i___not___ends_with = codice_interno_i___not___ends_with;
            return this;
        }

        public Builder setDecimale___eq(Boolean decimale___eq) {
            this.decimale___eq = decimale___eq;
            return this;
        }

        public Builder setDecimale___ne(Boolean decimale___ne) {
            this.decimale___ne = decimale___ne;
            return this;
        }

        public Builder setDecimale___null(Boolean decimale___null) {
            this.decimale___null = decimale___null;
            return this;
        }

        public Builder setDecimale___not___null(Boolean decimale___not___null) {
            this.decimale___not___null = decimale___not___null;
            return this;
        }

        public Builder setDomanda___eq(String domanda___eq) {
            this.domanda___eq = domanda___eq;
            return this;
        }

        public Builder setDomanda___ne(String domanda___ne) {
            this.domanda___ne = domanda___ne;
            return this;
        }

        public Builder setDomanda___null(Boolean domanda___null) {
            this.domanda___null = domanda___null;
            return this;
        }

        public Builder setDomanda___not___null(Boolean domanda___not___null) {
            this.domanda___not___null = domanda___not___null;
            return this;
        }

        public Builder setDomanda___in(java.util.List<String> domanda___in) {
            this.domanda___in = domanda___in;
            return this;
        }

        public Builder setDomanda___not___in(java.util.List<String> domanda___not___in) {
            this.domanda___not___in = domanda___not___in;
            return this;
        }

        public Builder setDomanda___lt(String domanda___lt) {
            this.domanda___lt = domanda___lt;
            return this;
        }

        public Builder setDomanda___lte(String domanda___lte) {
            this.domanda___lte = domanda___lte;
            return this;
        }

        public Builder setDomanda___gt(String domanda___gt) {
            this.domanda___gt = domanda___gt;
            return this;
        }

        public Builder setDomanda___gte(String domanda___gte) {
            this.domanda___gte = domanda___gte;
            return this;
        }

        public Builder setDomanda___contains(String domanda___contains) {
            this.domanda___contains = domanda___contains;
            return this;
        }

        public Builder setDomanda___not___contains(String domanda___not___contains) {
            this.domanda___not___contains = domanda___not___contains;
            return this;
        }

        public Builder setDomanda___starts_with(String domanda___starts_with) {
            this.domanda___starts_with = domanda___starts_with;
            return this;
        }

        public Builder setDomanda___not___starts_with(String domanda___not___starts_with) {
            this.domanda___not___starts_with = domanda___not___starts_with;
            return this;
        }

        public Builder setDomanda___ends_with(String domanda___ends_with) {
            this.domanda___ends_with = domanda___ends_with;
            return this;
        }

        public Builder setDomanda___not___ends_with(String domanda___not___ends_with) {
            this.domanda___not___ends_with = domanda___not___ends_with;
            return this;
        }

        public Builder setDomanda_id___eq(Integer domanda_id___eq) {
            this.domanda_id___eq = domanda_id___eq;
            return this;
        }

        public Builder setDomanda_id___ne(Integer domanda_id___ne) {
            this.domanda_id___ne = domanda_id___ne;
            return this;
        }

        public Builder setDomanda_id___null(Boolean domanda_id___null) {
            this.domanda_id___null = domanda_id___null;
            return this;
        }

        public Builder setDomanda_id___not___null(Boolean domanda_id___not___null) {
            this.domanda_id___not___null = domanda_id___not___null;
            return this;
        }

        public Builder setDomanda_id___in(java.util.List<Integer> domanda_id___in) {
            this.domanda_id___in = domanda_id___in;
            return this;
        }

        public Builder setDomanda_id___not___in(java.util.List<Integer> domanda_id___not___in) {
            this.domanda_id___not___in = domanda_id___not___in;
            return this;
        }

        public Builder setDomanda_id___lt(Integer domanda_id___lt) {
            this.domanda_id___lt = domanda_id___lt;
            return this;
        }

        public Builder setDomanda_id___lte(Integer domanda_id___lte) {
            this.domanda_id___lte = domanda_id___lte;
            return this;
        }

        public Builder setDomanda_id___gt(Integer domanda_id___gt) {
            this.domanda_id___gt = domanda_id___gt;
            return this;
        }

        public Builder setDomanda_id___gte(Integer domanda_id___gte) {
            this.domanda_id___gte = domanda_id___gte;
            return this;
        }

        public Builder setDomande_questionario_ids___eq(String domande_questionario_ids___eq) {
            this.domande_questionario_ids___eq = domande_questionario_ids___eq;
            return this;
        }

        public Builder setDomande_questionario_ids___ne(String domande_questionario_ids___ne) {
            this.domande_questionario_ids___ne = domande_questionario_ids___ne;
            return this;
        }

        public Builder setDomande_questionario_ids___null(Boolean domande_questionario_ids___null) {
            this.domande_questionario_ids___null = domande_questionario_ids___null;
            return this;
        }

        public Builder setDomande_questionario_ids___not___null(Boolean domande_questionario_ids___not___null) {
            this.domande_questionario_ids___not___null = domande_questionario_ids___not___null;
            return this;
        }

        public Builder setDomande_questionario_ids___in(java.util.List<String> domande_questionario_ids___in) {
            this.domande_questionario_ids___in = domande_questionario_ids___in;
            return this;
        }

        public Builder setDomande_questionario_ids___not___in(java.util.List<String> domande_questionario_ids___not___in) {
            this.domande_questionario_ids___not___in = domande_questionario_ids___not___in;
            return this;
        }

        public Builder setDomande_questionario_ids___lt(String domande_questionario_ids___lt) {
            this.domande_questionario_ids___lt = domande_questionario_ids___lt;
            return this;
        }

        public Builder setDomande_questionario_ids___lte(String domande_questionario_ids___lte) {
            this.domande_questionario_ids___lte = domande_questionario_ids___lte;
            return this;
        }

        public Builder setDomande_questionario_ids___gt(String domande_questionario_ids___gt) {
            this.domande_questionario_ids___gt = domande_questionario_ids___gt;
            return this;
        }

        public Builder setDomande_questionario_ids___gte(String domande_questionario_ids___gte) {
            this.domande_questionario_ids___gte = domande_questionario_ids___gte;
            return this;
        }

        public Builder setDomande_questionario_ids___contains(String domande_questionario_ids___contains) {
            this.domande_questionario_ids___contains = domande_questionario_ids___contains;
            return this;
        }

        public Builder setDomande_questionario_ids___not___contains(String domande_questionario_ids___not___contains) {
            this.domande_questionario_ids___not___contains = domande_questionario_ids___not___contains;
            return this;
        }

        public Builder setDomande_questionario_ids___starts_with(String domande_questionario_ids___starts_with) {
            this.domande_questionario_ids___starts_with = domande_questionario_ids___starts_with;
            return this;
        }

        public Builder setDomande_questionario_ids___not___starts_with(String domande_questionario_ids___not___starts_with) {
            this.domande_questionario_ids___not___starts_with = domande_questionario_ids___not___starts_with;
            return this;
        }

        public Builder setDomande_questionario_ids___ends_with(String domande_questionario_ids___ends_with) {
            this.domande_questionario_ids___ends_with = domande_questionario_ids___ends_with;
            return this;
        }

        public Builder setDomande_questionario_ids___not___ends_with(String domande_questionario_ids___not___ends_with) {
            this.domande_questionario_ids___not___ends_with = domande_questionario_ids___not___ends_with;
            return this;
        }

        public Builder setId_risposta_peso___eq(Integer id_risposta_peso___eq) {
            this.id_risposta_peso___eq = id_risposta_peso___eq;
            return this;
        }

        public Builder setId_risposta_peso___ne(Integer id_risposta_peso___ne) {
            this.id_risposta_peso___ne = id_risposta_peso___ne;
            return this;
        }

        public Builder setId_risposta_peso___null(Boolean id_risposta_peso___null) {
            this.id_risposta_peso___null = id_risposta_peso___null;
            return this;
        }

        public Builder setId_risposta_peso___not___null(Boolean id_risposta_peso___not___null) {
            this.id_risposta_peso___not___null = id_risposta_peso___not___null;
            return this;
        }

        public Builder setId_risposta_peso___in(java.util.List<Integer> id_risposta_peso___in) {
            this.id_risposta_peso___in = id_risposta_peso___in;
            return this;
        }

        public Builder setId_risposta_peso___not___in(java.util.List<Integer> id_risposta_peso___not___in) {
            this.id_risposta_peso___not___in = id_risposta_peso___not___in;
            return this;
        }

        public Builder setId_risposta_peso___lt(Integer id_risposta_peso___lt) {
            this.id_risposta_peso___lt = id_risposta_peso___lt;
            return this;
        }

        public Builder setId_risposta_peso___lte(Integer id_risposta_peso___lte) {
            this.id_risposta_peso___lte = id_risposta_peso___lte;
            return this;
        }

        public Builder setId_risposta_peso___gt(Integer id_risposta_peso___gt) {
            this.id_risposta_peso___gt = id_risposta_peso___gt;
            return this;
        }

        public Builder setId_risposta_peso___gte(Integer id_risposta_peso___gte) {
            this.id_risposta_peso___gte = id_risposta_peso___gte;
            return this;
        }

        public Builder setIntero___eq(Boolean intero___eq) {
            this.intero___eq = intero___eq;
            return this;
        }

        public Builder setIntero___ne(Boolean intero___ne) {
            this.intero___ne = intero___ne;
            return this;
        }

        public Builder setIntero___null(Boolean intero___null) {
            this.intero___null = intero___null;
            return this;
        }

        public Builder setIntero___not___null(Boolean intero___not___null) {
            this.intero___not___null = intero___not___null;
            return this;
        }

        public Builder setObbligatoria___eq(Boolean obbligatoria___eq) {
            this.obbligatoria___eq = obbligatoria___eq;
            return this;
        }

        public Builder setObbligatoria___ne(Boolean obbligatoria___ne) {
            this.obbligatoria___ne = obbligatoria___ne;
            return this;
        }

        public Builder setObbligatoria___null(Boolean obbligatoria___null) {
            this.obbligatoria___null = obbligatoria___null;
            return this;
        }

        public Builder setObbligatoria___not___null(Boolean obbligatoria___not___null) {
            this.obbligatoria___not___null = obbligatoria___not___null;
            return this;
        }

        public Builder setOpzioni_multipla___eq(Boolean opzioni_multipla___eq) {
            this.opzioni_multipla___eq = opzioni_multipla___eq;
            return this;
        }

        public Builder setOpzioni_multipla___ne(Boolean opzioni_multipla___ne) {
            this.opzioni_multipla___ne = opzioni_multipla___ne;
            return this;
        }

        public Builder setOpzioni_multipla___null(Boolean opzioni_multipla___null) {
            this.opzioni_multipla___null = opzioni_multipla___null;
            return this;
        }

        public Builder setOpzioni_multipla___not___null(Boolean opzioni_multipla___not___null) {
            this.opzioni_multipla___not___null = opzioni_multipla___not___null;
            return this;
        }

        public Builder setOpzioni_singola___eq(Boolean opzioni_singola___eq) {
            this.opzioni_singola___eq = opzioni_singola___eq;
            return this;
        }

        public Builder setOpzioni_singola___ne(Boolean opzioni_singola___ne) {
            this.opzioni_singola___ne = opzioni_singola___ne;
            return this;
        }

        public Builder setOpzioni_singola___null(Boolean opzioni_singola___null) {
            this.opzioni_singola___null = opzioni_singola___null;
            return this;
        }

        public Builder setOpzioni_singola___not___null(Boolean opzioni_singola___not___null) {
            this.opzioni_singola___not___null = opzioni_singola___not___null;
            return this;
        }

        public Builder setOrdine___eq(Integer ordine___eq) {
            this.ordine___eq = ordine___eq;
            return this;
        }

        public Builder setOrdine___ne(Integer ordine___ne) {
            this.ordine___ne = ordine___ne;
            return this;
        }

        public Builder setOrdine___null(Boolean ordine___null) {
            this.ordine___null = ordine___null;
            return this;
        }

        public Builder setOrdine___not___null(Boolean ordine___not___null) {
            this.ordine___not___null = ordine___not___null;
            return this;
        }

        public Builder setOrdine___in(java.util.List<Integer> ordine___in) {
            this.ordine___in = ordine___in;
            return this;
        }

        public Builder setOrdine___not___in(java.util.List<Integer> ordine___not___in) {
            this.ordine___not___in = ordine___not___in;
            return this;
        }

        public Builder setOrdine___lt(Integer ordine___lt) {
            this.ordine___lt = ordine___lt;
            return this;
        }

        public Builder setOrdine___lte(Integer ordine___lte) {
            this.ordine___lte = ordine___lte;
            return this;
        }

        public Builder setOrdine___gt(Integer ordine___gt) {
            this.ordine___gt = ordine___gt;
            return this;
        }

        public Builder setOrdine___gte(Integer ordine___gte) {
            this.ordine___gte = ordine___gte;
            return this;
        }

        public Builder setOrdine_risposta___eq(Integer ordine_risposta___eq) {
            this.ordine_risposta___eq = ordine_risposta___eq;
            return this;
        }

        public Builder setOrdine_risposta___ne(Integer ordine_risposta___ne) {
            this.ordine_risposta___ne = ordine_risposta___ne;
            return this;
        }

        public Builder setOrdine_risposta___null(Boolean ordine_risposta___null) {
            this.ordine_risposta___null = ordine_risposta___null;
            return this;
        }

        public Builder setOrdine_risposta___not___null(Boolean ordine_risposta___not___null) {
            this.ordine_risposta___not___null = ordine_risposta___not___null;
            return this;
        }

        public Builder setOrdine_risposta___in(java.util.List<Integer> ordine_risposta___in) {
            this.ordine_risposta___in = ordine_risposta___in;
            return this;
        }

        public Builder setOrdine_risposta___not___in(java.util.List<Integer> ordine_risposta___not___in) {
            this.ordine_risposta___not___in = ordine_risposta___not___in;
            return this;
        }

        public Builder setOrdine_risposta___lt(Integer ordine_risposta___lt) {
            this.ordine_risposta___lt = ordine_risposta___lt;
            return this;
        }

        public Builder setOrdine_risposta___lte(Integer ordine_risposta___lte) {
            this.ordine_risposta___lte = ordine_risposta___lte;
            return this;
        }

        public Builder setOrdine_risposta___gt(Integer ordine_risposta___gt) {
            this.ordine_risposta___gt = ordine_risposta___gt;
            return this;
        }

        public Builder setOrdine_risposta___gte(Integer ordine_risposta___gte) {
            this.ordine_risposta___gte = ordine_risposta___gte;
            return this;
        }

        public Builder setPeso_punteggio___eq(String peso_punteggio___eq) {
            this.peso_punteggio___eq = peso_punteggio___eq;
            return this;
        }

        public Builder setPeso_punteggio___ne(String peso_punteggio___ne) {
            this.peso_punteggio___ne = peso_punteggio___ne;
            return this;
        }

        public Builder setPeso_punteggio___null(Boolean peso_punteggio___null) {
            this.peso_punteggio___null = peso_punteggio___null;
            return this;
        }

        public Builder setPeso_punteggio___not___null(Boolean peso_punteggio___not___null) {
            this.peso_punteggio___not___null = peso_punteggio___not___null;
            return this;
        }

        public Builder setPeso_punteggio___in(java.util.List<String> peso_punteggio___in) {
            this.peso_punteggio___in = peso_punteggio___in;
            return this;
        }

        public Builder setPeso_punteggio___not___in(java.util.List<String> peso_punteggio___not___in) {
            this.peso_punteggio___not___in = peso_punteggio___not___in;
            return this;
        }

        public Builder setPeso_punteggio___lt(String peso_punteggio___lt) {
            this.peso_punteggio___lt = peso_punteggio___lt;
            return this;
        }

        public Builder setPeso_punteggio___lte(String peso_punteggio___lte) {
            this.peso_punteggio___lte = peso_punteggio___lte;
            return this;
        }

        public Builder setPeso_punteggio___gt(String peso_punteggio___gt) {
            this.peso_punteggio___gt = peso_punteggio___gt;
            return this;
        }

        public Builder setPeso_punteggio___gte(String peso_punteggio___gte) {
            this.peso_punteggio___gte = peso_punteggio___gte;
            return this;
        }

        public Builder setPunteggio_risposta___eq(String punteggio_risposta___eq) {
            this.punteggio_risposta___eq = punteggio_risposta___eq;
            return this;
        }

        public Builder setPunteggio_risposta___ne(String punteggio_risposta___ne) {
            this.punteggio_risposta___ne = punteggio_risposta___ne;
            return this;
        }

        public Builder setPunteggio_risposta___null(Boolean punteggio_risposta___null) {
            this.punteggio_risposta___null = punteggio_risposta___null;
            return this;
        }

        public Builder setPunteggio_risposta___not___null(Boolean punteggio_risposta___not___null) {
            this.punteggio_risposta___not___null = punteggio_risposta___not___null;
            return this;
        }

        public Builder setPunteggio_risposta___in(java.util.List<String> punteggio_risposta___in) {
            this.punteggio_risposta___in = punteggio_risposta___in;
            return this;
        }

        public Builder setPunteggio_risposta___not___in(java.util.List<String> punteggio_risposta___not___in) {
            this.punteggio_risposta___not___in = punteggio_risposta___not___in;
            return this;
        }

        public Builder setPunteggio_risposta___lt(String punteggio_risposta___lt) {
            this.punteggio_risposta___lt = punteggio_risposta___lt;
            return this;
        }

        public Builder setPunteggio_risposta___lte(String punteggio_risposta___lte) {
            this.punteggio_risposta___lte = punteggio_risposta___lte;
            return this;
        }

        public Builder setPunteggio_risposta___gt(String punteggio_risposta___gt) {
            this.punteggio_risposta___gt = punteggio_risposta___gt;
            return this;
        }

        public Builder setPunteggio_risposta___gte(String punteggio_risposta___gte) {
            this.punteggio_risposta___gte = punteggio_risposta___gte;
            return this;
        }

        public Builder setPunteggio_totale___eq(String punteggio_totale___eq) {
            this.punteggio_totale___eq = punteggio_totale___eq;
            return this;
        }

        public Builder setPunteggio_totale___ne(String punteggio_totale___ne) {
            this.punteggio_totale___ne = punteggio_totale___ne;
            return this;
        }

        public Builder setPunteggio_totale___null(Boolean punteggio_totale___null) {
            this.punteggio_totale___null = punteggio_totale___null;
            return this;
        }

        public Builder setPunteggio_totale___not___null(Boolean punteggio_totale___not___null) {
            this.punteggio_totale___not___null = punteggio_totale___not___null;
            return this;
        }

        public Builder setPunteggio_totale___in(java.util.List<String> punteggio_totale___in) {
            this.punteggio_totale___in = punteggio_totale___in;
            return this;
        }

        public Builder setPunteggio_totale___not___in(java.util.List<String> punteggio_totale___not___in) {
            this.punteggio_totale___not___in = punteggio_totale___not___in;
            return this;
        }

        public Builder setPunteggio_totale___lt(String punteggio_totale___lt) {
            this.punteggio_totale___lt = punteggio_totale___lt;
            return this;
        }

        public Builder setPunteggio_totale___lte(String punteggio_totale___lte) {
            this.punteggio_totale___lte = punteggio_totale___lte;
            return this;
        }

        public Builder setPunteggio_totale___gt(String punteggio_totale___gt) {
            this.punteggio_totale___gt = punteggio_totale___gt;
            return this;
        }

        public Builder setPunteggio_totale___gte(String punteggio_totale___gte) {
            this.punteggio_totale___gte = punteggio_totale___gte;
            return this;
        }

        public Builder setQuestionario_id___eq(Integer questionario_id___eq) {
            this.questionario_id___eq = questionario_id___eq;
            return this;
        }

        public Builder setQuestionario_id___ne(Integer questionario_id___ne) {
            this.questionario_id___ne = questionario_id___ne;
            return this;
        }

        public Builder setQuestionario_id___null(Boolean questionario_id___null) {
            this.questionario_id___null = questionario_id___null;
            return this;
        }

        public Builder setQuestionario_id___not___null(Boolean questionario_id___not___null) {
            this.questionario_id___not___null = questionario_id___not___null;
            return this;
        }

        public Builder setQuestionario_id___in(java.util.List<Integer> questionario_id___in) {
            this.questionario_id___in = questionario_id___in;
            return this;
        }

        public Builder setQuestionario_id___not___in(java.util.List<Integer> questionario_id___not___in) {
            this.questionario_id___not___in = questionario_id___not___in;
            return this;
        }

        public Builder setQuestionario_id___lt(Integer questionario_id___lt) {
            this.questionario_id___lt = questionario_id___lt;
            return this;
        }

        public Builder setQuestionario_id___lte(Integer questionario_id___lte) {
            this.questionario_id___lte = questionario_id___lte;
            return this;
        }

        public Builder setQuestionario_id___gt(Integer questionario_id___gt) {
            this.questionario_id___gt = questionario_id___gt;
            return this;
        }

        public Builder setQuestionario_id___gte(Integer questionario_id___gte) {
            this.questionario_id___gte = questionario_id___gte;
            return this;
        }

        public Builder setQuestionario_pro_app_id___eq(Integer questionario_pro_app_id___eq) {
            this.questionario_pro_app_id___eq = questionario_pro_app_id___eq;
            return this;
        }

        public Builder setQuestionario_pro_app_id___ne(Integer questionario_pro_app_id___ne) {
            this.questionario_pro_app_id___ne = questionario_pro_app_id___ne;
            return this;
        }

        public Builder setQuestionario_pro_app_id___null(Boolean questionario_pro_app_id___null) {
            this.questionario_pro_app_id___null = questionario_pro_app_id___null;
            return this;
        }

        public Builder setQuestionario_pro_app_id___not___null(Boolean questionario_pro_app_id___not___null) {
            this.questionario_pro_app_id___not___null = questionario_pro_app_id___not___null;
            return this;
        }

        public Builder setQuestionario_pro_app_id___in(java.util.List<Integer> questionario_pro_app_id___in) {
            this.questionario_pro_app_id___in = questionario_pro_app_id___in;
            return this;
        }

        public Builder setQuestionario_pro_app_id___not___in(java.util.List<Integer> questionario_pro_app_id___not___in) {
            this.questionario_pro_app_id___not___in = questionario_pro_app_id___not___in;
            return this;
        }

        public Builder setQuestionario_pro_app_id___lt(Integer questionario_pro_app_id___lt) {
            this.questionario_pro_app_id___lt = questionario_pro_app_id___lt;
            return this;
        }

        public Builder setQuestionario_pro_app_id___lte(Integer questionario_pro_app_id___lte) {
            this.questionario_pro_app_id___lte = questionario_pro_app_id___lte;
            return this;
        }

        public Builder setQuestionario_pro_app_id___gt(Integer questionario_pro_app_id___gt) {
            this.questionario_pro_app_id___gt = questionario_pro_app_id___gt;
            return this;
        }

        public Builder setQuestionario_pro_app_id___gte(Integer questionario_pro_app_id___gte) {
            this.questionario_pro_app_id___gte = questionario_pro_app_id___gte;
            return this;
        }

        public Builder setRisposta___eq(String risposta___eq) {
            this.risposta___eq = risposta___eq;
            return this;
        }

        public Builder setRisposta___ne(String risposta___ne) {
            this.risposta___ne = risposta___ne;
            return this;
        }

        public Builder setRisposta___null(Boolean risposta___null) {
            this.risposta___null = risposta___null;
            return this;
        }

        public Builder setRisposta___not___null(Boolean risposta___not___null) {
            this.risposta___not___null = risposta___not___null;
            return this;
        }

        public Builder setRisposta___in(java.util.List<String> risposta___in) {
            this.risposta___in = risposta___in;
            return this;
        }

        public Builder setRisposta___not___in(java.util.List<String> risposta___not___in) {
            this.risposta___not___in = risposta___not___in;
            return this;
        }

        public Builder setRisposta___lt(String risposta___lt) {
            this.risposta___lt = risposta___lt;
            return this;
        }

        public Builder setRisposta___lte(String risposta___lte) {
            this.risposta___lte = risposta___lte;
            return this;
        }

        public Builder setRisposta___gt(String risposta___gt) {
            this.risposta___gt = risposta___gt;
            return this;
        }

        public Builder setRisposta___gte(String risposta___gte) {
            this.risposta___gte = risposta___gte;
            return this;
        }

        public Builder setRisposta___contains(String risposta___contains) {
            this.risposta___contains = risposta___contains;
            return this;
        }

        public Builder setRisposta___not___contains(String risposta___not___contains) {
            this.risposta___not___contains = risposta___not___contains;
            return this;
        }

        public Builder setRisposta___starts_with(String risposta___starts_with) {
            this.risposta___starts_with = risposta___starts_with;
            return this;
        }

        public Builder setRisposta___not___starts_with(String risposta___not___starts_with) {
            this.risposta___not___starts_with = risposta___not___starts_with;
            return this;
        }

        public Builder setRisposta___ends_with(String risposta___ends_with) {
            this.risposta___ends_with = risposta___ends_with;
            return this;
        }

        public Builder setRisposta___not___ends_with(String risposta___not___ends_with) {
            this.risposta___not___ends_with = risposta___not___ends_with;
            return this;
        }

        public Builder setRisposta_dec___eq(String risposta_dec___eq) {
            this.risposta_dec___eq = risposta_dec___eq;
            return this;
        }

        public Builder setRisposta_dec___ne(String risposta_dec___ne) {
            this.risposta_dec___ne = risposta_dec___ne;
            return this;
        }

        public Builder setRisposta_dec___null(Boolean risposta_dec___null) {
            this.risposta_dec___null = risposta_dec___null;
            return this;
        }

        public Builder setRisposta_dec___not___null(Boolean risposta_dec___not___null) {
            this.risposta_dec___not___null = risposta_dec___not___null;
            return this;
        }

        public Builder setRisposta_dec___in(java.util.List<String> risposta_dec___in) {
            this.risposta_dec___in = risposta_dec___in;
            return this;
        }

        public Builder setRisposta_dec___not___in(java.util.List<String> risposta_dec___not___in) {
            this.risposta_dec___not___in = risposta_dec___not___in;
            return this;
        }

        public Builder setRisposta_dec___lt(String risposta_dec___lt) {
            this.risposta_dec___lt = risposta_dec___lt;
            return this;
        }

        public Builder setRisposta_dec___lte(String risposta_dec___lte) {
            this.risposta_dec___lte = risposta_dec___lte;
            return this;
        }

        public Builder setRisposta_dec___gt(String risposta_dec___gt) {
            this.risposta_dec___gt = risposta_dec___gt;
            return this;
        }

        public Builder setRisposta_dec___gte(String risposta_dec___gte) {
            this.risposta_dec___gte = risposta_dec___gte;
            return this;
        }

        public Builder setRisposta_int___eq(Integer risposta_int___eq) {
            this.risposta_int___eq = risposta_int___eq;
            return this;
        }

        public Builder setRisposta_int___ne(Integer risposta_int___ne) {
            this.risposta_int___ne = risposta_int___ne;
            return this;
        }

        public Builder setRisposta_int___null(Boolean risposta_int___null) {
            this.risposta_int___null = risposta_int___null;
            return this;
        }

        public Builder setRisposta_int___not___null(Boolean risposta_int___not___null) {
            this.risposta_int___not___null = risposta_int___not___null;
            return this;
        }

        public Builder setRisposta_int___in(java.util.List<Integer> risposta_int___in) {
            this.risposta_int___in = risposta_int___in;
            return this;
        }

        public Builder setRisposta_int___not___in(java.util.List<Integer> risposta_int___not___in) {
            this.risposta_int___not___in = risposta_int___not___in;
            return this;
        }

        public Builder setRisposta_int___lt(Integer risposta_int___lt) {
            this.risposta_int___lt = risposta_int___lt;
            return this;
        }

        public Builder setRisposta_int___lte(Integer risposta_int___lte) {
            this.risposta_int___lte = risposta_int___lte;
            return this;
        }

        public Builder setRisposta_int___gt(Integer risposta_int___gt) {
            this.risposta_int___gt = risposta_int___gt;
            return this;
        }

        public Builder setRisposta_int___gte(Integer risposta_int___gte) {
            this.risposta_int___gte = risposta_int___gte;
            return this;
        }

        public Builder setRisposta_multipla___eq(String risposta_multipla___eq) {
            this.risposta_multipla___eq = risposta_multipla___eq;
            return this;
        }

        public Builder setRisposta_multipla___ne(String risposta_multipla___ne) {
            this.risposta_multipla___ne = risposta_multipla___ne;
            return this;
        }

        public Builder setRisposta_multipla___null(Boolean risposta_multipla___null) {
            this.risposta_multipla___null = risposta_multipla___null;
            return this;
        }

        public Builder setRisposta_multipla___not___null(Boolean risposta_multipla___not___null) {
            this.risposta_multipla___not___null = risposta_multipla___not___null;
            return this;
        }

        public Builder setRisposta_multipla___in(java.util.List<String> risposta_multipla___in) {
            this.risposta_multipla___in = risposta_multipla___in;
            return this;
        }

        public Builder setRisposta_multipla___not___in(java.util.List<String> risposta_multipla___not___in) {
            this.risposta_multipla___not___in = risposta_multipla___not___in;
            return this;
        }

        public Builder setRisposta_multipla___lt(String risposta_multipla___lt) {
            this.risposta_multipla___lt = risposta_multipla___lt;
            return this;
        }

        public Builder setRisposta_multipla___lte(String risposta_multipla___lte) {
            this.risposta_multipla___lte = risposta_multipla___lte;
            return this;
        }

        public Builder setRisposta_multipla___gt(String risposta_multipla___gt) {
            this.risposta_multipla___gt = risposta_multipla___gt;
            return this;
        }

        public Builder setRisposta_multipla___gte(String risposta_multipla___gte) {
            this.risposta_multipla___gte = risposta_multipla___gte;
            return this;
        }

        public Builder setRisposta_multipla___contains(String risposta_multipla___contains) {
            this.risposta_multipla___contains = risposta_multipla___contains;
            return this;
        }

        public Builder setRisposta_multipla___not___contains(String risposta_multipla___not___contains) {
            this.risposta_multipla___not___contains = risposta_multipla___not___contains;
            return this;
        }

        public Builder setRisposta_multipla___starts_with(String risposta_multipla___starts_with) {
            this.risposta_multipla___starts_with = risposta_multipla___starts_with;
            return this;
        }

        public Builder setRisposta_multipla___not___starts_with(String risposta_multipla___not___starts_with) {
            this.risposta_multipla___not___starts_with = risposta_multipla___not___starts_with;
            return this;
        }

        public Builder setRisposta_multipla___ends_with(String risposta_multipla___ends_with) {
            this.risposta_multipla___ends_with = risposta_multipla___ends_with;
            return this;
        }

        public Builder setRisposta_multipla___not___ends_with(String risposta_multipla___not___ends_with) {
            this.risposta_multipla___not___ends_with = risposta_multipla___not___ends_with;
            return this;
        }

        public Builder setRisposta_str___eq(String risposta_str___eq) {
            this.risposta_str___eq = risposta_str___eq;
            return this;
        }

        public Builder setRisposta_str___ne(String risposta_str___ne) {
            this.risposta_str___ne = risposta_str___ne;
            return this;
        }

        public Builder setRisposta_str___null(Boolean risposta_str___null) {
            this.risposta_str___null = risposta_str___null;
            return this;
        }

        public Builder setRisposta_str___not___null(Boolean risposta_str___not___null) {
            this.risposta_str___not___null = risposta_str___not___null;
            return this;
        }

        public Builder setRisposta_str___in(java.util.List<String> risposta_str___in) {
            this.risposta_str___in = risposta_str___in;
            return this;
        }

        public Builder setRisposta_str___not___in(java.util.List<String> risposta_str___not___in) {
            this.risposta_str___not___in = risposta_str___not___in;
            return this;
        }

        public Builder setRisposta_str___lt(String risposta_str___lt) {
            this.risposta_str___lt = risposta_str___lt;
            return this;
        }

        public Builder setRisposta_str___lte(String risposta_str___lte) {
            this.risposta_str___lte = risposta_str___lte;
            return this;
        }

        public Builder setRisposta_str___gt(String risposta_str___gt) {
            this.risposta_str___gt = risposta_str___gt;
            return this;
        }

        public Builder setRisposta_str___gte(String risposta_str___gte) {
            this.risposta_str___gte = risposta_str___gte;
            return this;
        }

        public Builder setRisposta_str___contains(String risposta_str___contains) {
            this.risposta_str___contains = risposta_str___contains;
            return this;
        }

        public Builder setRisposta_str___not___contains(String risposta_str___not___contains) {
            this.risposta_str___not___contains = risposta_str___not___contains;
            return this;
        }

        public Builder setRisposta_str___starts_with(String risposta_str___starts_with) {
            this.risposta_str___starts_with = risposta_str___starts_with;
            return this;
        }

        public Builder setRisposta_str___not___starts_with(String risposta_str___not___starts_with) {
            this.risposta_str___not___starts_with = risposta_str___not___starts_with;
            return this;
        }

        public Builder setRisposta_str___ends_with(String risposta_str___ends_with) {
            this.risposta_str___ends_with = risposta_str___ends_with;
            return this;
        }

        public Builder setRisposta_str___not___ends_with(String risposta_str___not___ends_with) {
            this.risposta_str___not___ends_with = risposta_str___not___ends_with;
            return this;
        }

        public Builder setScala_intera___eq(Boolean scala_intera___eq) {
            this.scala_intera___eq = scala_intera___eq;
            return this;
        }

        public Builder setScala_intera___ne(Boolean scala_intera___ne) {
            this.scala_intera___ne = scala_intera___ne;
            return this;
        }

        public Builder setScala_intera___null(Boolean scala_intera___null) {
            this.scala_intera___null = scala_intera___null;
            return this;
        }

        public Builder setScala_intera___not___null(Boolean scala_intera___not___null) {
            this.scala_intera___not___null = scala_intera___not___null;
            return this;
        }

        public Builder setSolo_intro___eq(Boolean solo_intro___eq) {
            this.solo_intro___eq = solo_intro___eq;
            return this;
        }

        public Builder setSolo_intro___ne(Boolean solo_intro___ne) {
            this.solo_intro___ne = solo_intro___ne;
            return this;
        }

        public Builder setSolo_intro___null(Boolean solo_intro___null) {
            this.solo_intro___null = solo_intro___null;
            return this;
        }

        public Builder setSolo_intro___not___null(Boolean solo_intro___not___null) {
            this.solo_intro___not___null = solo_intro___not___null;
            return this;
        }

        public Builder setStringa___eq(Boolean stringa___eq) {
            this.stringa___eq = stringa___eq;
            return this;
        }

        public Builder setStringa___ne(Boolean stringa___ne) {
            this.stringa___ne = stringa___ne;
            return this;
        }

        public Builder setStringa___null(Boolean stringa___null) {
            this.stringa___null = stringa___null;
            return this;
        }

        public Builder setStringa___not___null(Boolean stringa___not___null) {
            this.stringa___not___null = stringa___not___null;
            return this;
        }

        public Builder setStudio_questionario_id___eq(Integer studio_questionario_id___eq) {
            this.studio_questionario_id___eq = studio_questionario_id___eq;
            return this;
        }

        public Builder setStudio_questionario_id___ne(Integer studio_questionario_id___ne) {
            this.studio_questionario_id___ne = studio_questionario_id___ne;
            return this;
        }

        public Builder setStudio_questionario_id___null(Boolean studio_questionario_id___null) {
            this.studio_questionario_id___null = studio_questionario_id___null;
            return this;
        }

        public Builder setStudio_questionario_id___not___null(Boolean studio_questionario_id___not___null) {
            this.studio_questionario_id___not___null = studio_questionario_id___not___null;
            return this;
        }

        public Builder setStudio_questionario_id___in(java.util.List<Integer> studio_questionario_id___in) {
            this.studio_questionario_id___in = studio_questionario_id___in;
            return this;
        }

        public Builder setStudio_questionario_id___not___in(java.util.List<Integer> studio_questionario_id___not___in) {
            this.studio_questionario_id___not___in = studio_questionario_id___not___in;
            return this;
        }

        public Builder setStudio_questionario_id___lt(Integer studio_questionario_id___lt) {
            this.studio_questionario_id___lt = studio_questionario_id___lt;
            return this;
        }

        public Builder setStudio_questionario_id___lte(Integer studio_questionario_id___lte) {
            this.studio_questionario_id___lte = studio_questionario_id___lte;
            return this;
        }

        public Builder setStudio_questionario_id___gt(Integer studio_questionario_id___gt) {
            this.studio_questionario_id___gt = studio_questionario_id___gt;
            return this;
        }

        public Builder setStudio_questionario_id___gte(Integer studio_questionario_id___gte) {
            this.studio_questionario_id___gte = studio_questionario_id___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliRispostaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliRispostaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliRispostaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliRispostaFilterDTO build() {
            CliRispostaFilterDTO result = new CliRispostaFilterDTO();
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
            result.setAlert_obbligatoria___eq(this.alert_obbligatoria___eq);
            result.setAlert_obbligatoria___ne(this.alert_obbligatoria___ne);
            result.setAlert_obbligatoria___null(this.alert_obbligatoria___null);
            result.setAlert_obbligatoria___not___null(this.alert_obbligatoria___not___null);
            result.setCodice_interno_i___eq(this.codice_interno_i___eq);
            result.setCodice_interno_i___ne(this.codice_interno_i___ne);
            result.setCodice_interno_i___null(this.codice_interno_i___null);
            result.setCodice_interno_i___not___null(this.codice_interno_i___not___null);
            result.setCodice_interno_i___in(this.codice_interno_i___in);
            result.setCodice_interno_i___not___in(this.codice_interno_i___not___in);
            result.setCodice_interno_i___lt(this.codice_interno_i___lt);
            result.setCodice_interno_i___lte(this.codice_interno_i___lte);
            result.setCodice_interno_i___gt(this.codice_interno_i___gt);
            result.setCodice_interno_i___gte(this.codice_interno_i___gte);
            result.setCodice_interno_i___contains(this.codice_interno_i___contains);
            result.setCodice_interno_i___not___contains(this.codice_interno_i___not___contains);
            result.setCodice_interno_i___starts_with(this.codice_interno_i___starts_with);
            result.setCodice_interno_i___not___starts_with(this.codice_interno_i___not___starts_with);
            result.setCodice_interno_i___ends_with(this.codice_interno_i___ends_with);
            result.setCodice_interno_i___not___ends_with(this.codice_interno_i___not___ends_with);
            result.setDecimale___eq(this.decimale___eq);
            result.setDecimale___ne(this.decimale___ne);
            result.setDecimale___null(this.decimale___null);
            result.setDecimale___not___null(this.decimale___not___null);
            result.setDomanda___eq(this.domanda___eq);
            result.setDomanda___ne(this.domanda___ne);
            result.setDomanda___null(this.domanda___null);
            result.setDomanda___not___null(this.domanda___not___null);
            result.setDomanda___in(this.domanda___in);
            result.setDomanda___not___in(this.domanda___not___in);
            result.setDomanda___lt(this.domanda___lt);
            result.setDomanda___lte(this.domanda___lte);
            result.setDomanda___gt(this.domanda___gt);
            result.setDomanda___gte(this.domanda___gte);
            result.setDomanda___contains(this.domanda___contains);
            result.setDomanda___not___contains(this.domanda___not___contains);
            result.setDomanda___starts_with(this.domanda___starts_with);
            result.setDomanda___not___starts_with(this.domanda___not___starts_with);
            result.setDomanda___ends_with(this.domanda___ends_with);
            result.setDomanda___not___ends_with(this.domanda___not___ends_with);
            result.setDomanda_id___eq(this.domanda_id___eq);
            result.setDomanda_id___ne(this.domanda_id___ne);
            result.setDomanda_id___null(this.domanda_id___null);
            result.setDomanda_id___not___null(this.domanda_id___not___null);
            result.setDomanda_id___in(this.domanda_id___in);
            result.setDomanda_id___not___in(this.domanda_id___not___in);
            result.setDomanda_id___lt(this.domanda_id___lt);
            result.setDomanda_id___lte(this.domanda_id___lte);
            result.setDomanda_id___gt(this.domanda_id___gt);
            result.setDomanda_id___gte(this.domanda_id___gte);
            result.setDomande_questionario_ids___eq(this.domande_questionario_ids___eq);
            result.setDomande_questionario_ids___ne(this.domande_questionario_ids___ne);
            result.setDomande_questionario_ids___null(this.domande_questionario_ids___null);
            result.setDomande_questionario_ids___not___null(this.domande_questionario_ids___not___null);
            result.setDomande_questionario_ids___in(this.domande_questionario_ids___in);
            result.setDomande_questionario_ids___not___in(this.domande_questionario_ids___not___in);
            result.setDomande_questionario_ids___lt(this.domande_questionario_ids___lt);
            result.setDomande_questionario_ids___lte(this.domande_questionario_ids___lte);
            result.setDomande_questionario_ids___gt(this.domande_questionario_ids___gt);
            result.setDomande_questionario_ids___gte(this.domande_questionario_ids___gte);
            result.setDomande_questionario_ids___contains(this.domande_questionario_ids___contains);
            result.setDomande_questionario_ids___not___contains(this.domande_questionario_ids___not___contains);
            result.setDomande_questionario_ids___starts_with(this.domande_questionario_ids___starts_with);
            result.setDomande_questionario_ids___not___starts_with(this.domande_questionario_ids___not___starts_with);
            result.setDomande_questionario_ids___ends_with(this.domande_questionario_ids___ends_with);
            result.setDomande_questionario_ids___not___ends_with(this.domande_questionario_ids___not___ends_with);
            result.setId_risposta_peso___eq(this.id_risposta_peso___eq);
            result.setId_risposta_peso___ne(this.id_risposta_peso___ne);
            result.setId_risposta_peso___null(this.id_risposta_peso___null);
            result.setId_risposta_peso___not___null(this.id_risposta_peso___not___null);
            result.setId_risposta_peso___in(this.id_risposta_peso___in);
            result.setId_risposta_peso___not___in(this.id_risposta_peso___not___in);
            result.setId_risposta_peso___lt(this.id_risposta_peso___lt);
            result.setId_risposta_peso___lte(this.id_risposta_peso___lte);
            result.setId_risposta_peso___gt(this.id_risposta_peso___gt);
            result.setId_risposta_peso___gte(this.id_risposta_peso___gte);
            result.setIntero___eq(this.intero___eq);
            result.setIntero___ne(this.intero___ne);
            result.setIntero___null(this.intero___null);
            result.setIntero___not___null(this.intero___not___null);
            result.setObbligatoria___eq(this.obbligatoria___eq);
            result.setObbligatoria___ne(this.obbligatoria___ne);
            result.setObbligatoria___null(this.obbligatoria___null);
            result.setObbligatoria___not___null(this.obbligatoria___not___null);
            result.setOpzioni_multipla___eq(this.opzioni_multipla___eq);
            result.setOpzioni_multipla___ne(this.opzioni_multipla___ne);
            result.setOpzioni_multipla___null(this.opzioni_multipla___null);
            result.setOpzioni_multipla___not___null(this.opzioni_multipla___not___null);
            result.setOpzioni_singola___eq(this.opzioni_singola___eq);
            result.setOpzioni_singola___ne(this.opzioni_singola___ne);
            result.setOpzioni_singola___null(this.opzioni_singola___null);
            result.setOpzioni_singola___not___null(this.opzioni_singola___not___null);
            result.setOrdine___eq(this.ordine___eq);
            result.setOrdine___ne(this.ordine___ne);
            result.setOrdine___null(this.ordine___null);
            result.setOrdine___not___null(this.ordine___not___null);
            result.setOrdine___in(this.ordine___in);
            result.setOrdine___not___in(this.ordine___not___in);
            result.setOrdine___lt(this.ordine___lt);
            result.setOrdine___lte(this.ordine___lte);
            result.setOrdine___gt(this.ordine___gt);
            result.setOrdine___gte(this.ordine___gte);
            result.setOrdine_risposta___eq(this.ordine_risposta___eq);
            result.setOrdine_risposta___ne(this.ordine_risposta___ne);
            result.setOrdine_risposta___null(this.ordine_risposta___null);
            result.setOrdine_risposta___not___null(this.ordine_risposta___not___null);
            result.setOrdine_risposta___in(this.ordine_risposta___in);
            result.setOrdine_risposta___not___in(this.ordine_risposta___not___in);
            result.setOrdine_risposta___lt(this.ordine_risposta___lt);
            result.setOrdine_risposta___lte(this.ordine_risposta___lte);
            result.setOrdine_risposta___gt(this.ordine_risposta___gt);
            result.setOrdine_risposta___gte(this.ordine_risposta___gte);
            result.setPeso_punteggio___eq(this.peso_punteggio___eq);
            result.setPeso_punteggio___ne(this.peso_punteggio___ne);
            result.setPeso_punteggio___null(this.peso_punteggio___null);
            result.setPeso_punteggio___not___null(this.peso_punteggio___not___null);
            result.setPeso_punteggio___in(this.peso_punteggio___in);
            result.setPeso_punteggio___not___in(this.peso_punteggio___not___in);
            result.setPeso_punteggio___lt(this.peso_punteggio___lt);
            result.setPeso_punteggio___lte(this.peso_punteggio___lte);
            result.setPeso_punteggio___gt(this.peso_punteggio___gt);
            result.setPeso_punteggio___gte(this.peso_punteggio___gte);
            result.setPunteggio_risposta___eq(this.punteggio_risposta___eq);
            result.setPunteggio_risposta___ne(this.punteggio_risposta___ne);
            result.setPunteggio_risposta___null(this.punteggio_risposta___null);
            result.setPunteggio_risposta___not___null(this.punteggio_risposta___not___null);
            result.setPunteggio_risposta___in(this.punteggio_risposta___in);
            result.setPunteggio_risposta___not___in(this.punteggio_risposta___not___in);
            result.setPunteggio_risposta___lt(this.punteggio_risposta___lt);
            result.setPunteggio_risposta___lte(this.punteggio_risposta___lte);
            result.setPunteggio_risposta___gt(this.punteggio_risposta___gt);
            result.setPunteggio_risposta___gte(this.punteggio_risposta___gte);
            result.setPunteggio_totale___eq(this.punteggio_totale___eq);
            result.setPunteggio_totale___ne(this.punteggio_totale___ne);
            result.setPunteggio_totale___null(this.punteggio_totale___null);
            result.setPunteggio_totale___not___null(this.punteggio_totale___not___null);
            result.setPunteggio_totale___in(this.punteggio_totale___in);
            result.setPunteggio_totale___not___in(this.punteggio_totale___not___in);
            result.setPunteggio_totale___lt(this.punteggio_totale___lt);
            result.setPunteggio_totale___lte(this.punteggio_totale___lte);
            result.setPunteggio_totale___gt(this.punteggio_totale___gt);
            result.setPunteggio_totale___gte(this.punteggio_totale___gte);
            result.setQuestionario_id___eq(this.questionario_id___eq);
            result.setQuestionario_id___ne(this.questionario_id___ne);
            result.setQuestionario_id___null(this.questionario_id___null);
            result.setQuestionario_id___not___null(this.questionario_id___not___null);
            result.setQuestionario_id___in(this.questionario_id___in);
            result.setQuestionario_id___not___in(this.questionario_id___not___in);
            result.setQuestionario_id___lt(this.questionario_id___lt);
            result.setQuestionario_id___lte(this.questionario_id___lte);
            result.setQuestionario_id___gt(this.questionario_id___gt);
            result.setQuestionario_id___gte(this.questionario_id___gte);
            result.setQuestionario_pro_app_id___eq(this.questionario_pro_app_id___eq);
            result.setQuestionario_pro_app_id___ne(this.questionario_pro_app_id___ne);
            result.setQuestionario_pro_app_id___null(this.questionario_pro_app_id___null);
            result.setQuestionario_pro_app_id___not___null(this.questionario_pro_app_id___not___null);
            result.setQuestionario_pro_app_id___in(this.questionario_pro_app_id___in);
            result.setQuestionario_pro_app_id___not___in(this.questionario_pro_app_id___not___in);
            result.setQuestionario_pro_app_id___lt(this.questionario_pro_app_id___lt);
            result.setQuestionario_pro_app_id___lte(this.questionario_pro_app_id___lte);
            result.setQuestionario_pro_app_id___gt(this.questionario_pro_app_id___gt);
            result.setQuestionario_pro_app_id___gte(this.questionario_pro_app_id___gte);
            result.setRisposta___eq(this.risposta___eq);
            result.setRisposta___ne(this.risposta___ne);
            result.setRisposta___null(this.risposta___null);
            result.setRisposta___not___null(this.risposta___not___null);
            result.setRisposta___in(this.risposta___in);
            result.setRisposta___not___in(this.risposta___not___in);
            result.setRisposta___lt(this.risposta___lt);
            result.setRisposta___lte(this.risposta___lte);
            result.setRisposta___gt(this.risposta___gt);
            result.setRisposta___gte(this.risposta___gte);
            result.setRisposta___contains(this.risposta___contains);
            result.setRisposta___not___contains(this.risposta___not___contains);
            result.setRisposta___starts_with(this.risposta___starts_with);
            result.setRisposta___not___starts_with(this.risposta___not___starts_with);
            result.setRisposta___ends_with(this.risposta___ends_with);
            result.setRisposta___not___ends_with(this.risposta___not___ends_with);
            result.setRisposta_dec___eq(this.risposta_dec___eq);
            result.setRisposta_dec___ne(this.risposta_dec___ne);
            result.setRisposta_dec___null(this.risposta_dec___null);
            result.setRisposta_dec___not___null(this.risposta_dec___not___null);
            result.setRisposta_dec___in(this.risposta_dec___in);
            result.setRisposta_dec___not___in(this.risposta_dec___not___in);
            result.setRisposta_dec___lt(this.risposta_dec___lt);
            result.setRisposta_dec___lte(this.risposta_dec___lte);
            result.setRisposta_dec___gt(this.risposta_dec___gt);
            result.setRisposta_dec___gte(this.risposta_dec___gte);
            result.setRisposta_int___eq(this.risposta_int___eq);
            result.setRisposta_int___ne(this.risposta_int___ne);
            result.setRisposta_int___null(this.risposta_int___null);
            result.setRisposta_int___not___null(this.risposta_int___not___null);
            result.setRisposta_int___in(this.risposta_int___in);
            result.setRisposta_int___not___in(this.risposta_int___not___in);
            result.setRisposta_int___lt(this.risposta_int___lt);
            result.setRisposta_int___lte(this.risposta_int___lte);
            result.setRisposta_int___gt(this.risposta_int___gt);
            result.setRisposta_int___gte(this.risposta_int___gte);
            result.setRisposta_multipla___eq(this.risposta_multipla___eq);
            result.setRisposta_multipla___ne(this.risposta_multipla___ne);
            result.setRisposta_multipla___null(this.risposta_multipla___null);
            result.setRisposta_multipla___not___null(this.risposta_multipla___not___null);
            result.setRisposta_multipla___in(this.risposta_multipla___in);
            result.setRisposta_multipla___not___in(this.risposta_multipla___not___in);
            result.setRisposta_multipla___lt(this.risposta_multipla___lt);
            result.setRisposta_multipla___lte(this.risposta_multipla___lte);
            result.setRisposta_multipla___gt(this.risposta_multipla___gt);
            result.setRisposta_multipla___gte(this.risposta_multipla___gte);
            result.setRisposta_multipla___contains(this.risposta_multipla___contains);
            result.setRisposta_multipla___not___contains(this.risposta_multipla___not___contains);
            result.setRisposta_multipla___starts_with(this.risposta_multipla___starts_with);
            result.setRisposta_multipla___not___starts_with(this.risposta_multipla___not___starts_with);
            result.setRisposta_multipla___ends_with(this.risposta_multipla___ends_with);
            result.setRisposta_multipla___not___ends_with(this.risposta_multipla___not___ends_with);
            result.setRisposta_str___eq(this.risposta_str___eq);
            result.setRisposta_str___ne(this.risposta_str___ne);
            result.setRisposta_str___null(this.risposta_str___null);
            result.setRisposta_str___not___null(this.risposta_str___not___null);
            result.setRisposta_str___in(this.risposta_str___in);
            result.setRisposta_str___not___in(this.risposta_str___not___in);
            result.setRisposta_str___lt(this.risposta_str___lt);
            result.setRisposta_str___lte(this.risposta_str___lte);
            result.setRisposta_str___gt(this.risposta_str___gt);
            result.setRisposta_str___gte(this.risposta_str___gte);
            result.setRisposta_str___contains(this.risposta_str___contains);
            result.setRisposta_str___not___contains(this.risposta_str___not___contains);
            result.setRisposta_str___starts_with(this.risposta_str___starts_with);
            result.setRisposta_str___not___starts_with(this.risposta_str___not___starts_with);
            result.setRisposta_str___ends_with(this.risposta_str___ends_with);
            result.setRisposta_str___not___ends_with(this.risposta_str___not___ends_with);
            result.setScala_intera___eq(this.scala_intera___eq);
            result.setScala_intera___ne(this.scala_intera___ne);
            result.setScala_intera___null(this.scala_intera___null);
            result.setScala_intera___not___null(this.scala_intera___not___null);
            result.setSolo_intro___eq(this.solo_intro___eq);
            result.setSolo_intro___ne(this.solo_intro___ne);
            result.setSolo_intro___null(this.solo_intro___null);
            result.setSolo_intro___not___null(this.solo_intro___not___null);
            result.setStringa___eq(this.stringa___eq);
            result.setStringa___ne(this.stringa___ne);
            result.setStringa___null(this.stringa___null);
            result.setStringa___not___null(this.stringa___not___null);
            result.setStudio_questionario_id___eq(this.studio_questionario_id___eq);
            result.setStudio_questionario_id___ne(this.studio_questionario_id___ne);
            result.setStudio_questionario_id___null(this.studio_questionario_id___null);
            result.setStudio_questionario_id___not___null(this.studio_questionario_id___not___null);
            result.setStudio_questionario_id___in(this.studio_questionario_id___in);
            result.setStudio_questionario_id___not___in(this.studio_questionario_id___not___in);
            result.setStudio_questionario_id___lt(this.studio_questionario_id___lt);
            result.setStudio_questionario_id___lte(this.studio_questionario_id___lte);
            result.setStudio_questionario_id___gt(this.studio_questionario_id___gt);
            result.setStudio_questionario_id___gte(this.studio_questionario_id___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
