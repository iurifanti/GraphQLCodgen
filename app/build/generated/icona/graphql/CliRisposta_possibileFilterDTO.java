package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Risposta_possibile.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRisposta_possibileFilterDTO implements java.io.Serializable {

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
    private String conc___eq;
    private String conc___ne;
    private Boolean conc___null;
    private Boolean conc___not___null;
    private java.util.List<String> conc___in;
    private java.util.List<String> conc___not___in;
    private String conc___lt;
    private String conc___lte;
    private String conc___gt;
    private String conc___gte;
    private String conc___contains;
    private String conc___not___contains;
    private String conc___starts_with;
    private String conc___not___starts_with;
    private String conc___ends_with;
    private String conc___not___ends_with;
    private Integer domande_associate___eq;
    private Integer domande_associate___ne;
    private Boolean domande_associate___null;
    private Boolean domande_associate___not___null;
    private java.util.List<Integer> domande_associate___in;
    private java.util.List<Integer> domande_associate___not___in;
    private Integer domande_associate___lt;
    private Integer domande_associate___lte;
    private Integer domande_associate___gt;
    private Integer domande_associate___gte;
    private String domande_associate_ids___eq;
    private String domande_associate_ids___ne;
    private Boolean domande_associate_ids___null;
    private Boolean domande_associate_ids___not___null;
    private java.util.List<String> domande_associate_ids___in;
    private java.util.List<String> domande_associate_ids___not___in;
    private String domande_associate_ids___lt;
    private String domande_associate_ids___lte;
    private String domande_associate_ids___gt;
    private String domande_associate_ids___gte;
    private String domande_associate_ids___contains;
    private String domande_associate_ids___not___contains;
    private String domande_associate_ids___starts_with;
    private String domande_associate_ids___not___starts_with;
    private String domande_associate_ids___ends_with;
    private String domande_associate_ids___not___ends_with;
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
    private String punteggio___eq;
    private String punteggio___ne;
    private Boolean punteggio___null;
    private Boolean punteggio___not___null;
    private java.util.List<String> punteggio___in;
    private java.util.List<String> punteggio___not___in;
    private String punteggio___lt;
    private String punteggio___lte;
    private String punteggio___gt;
    private String punteggio___gte;
    private Integer risposte_associate___eq;
    private Integer risposte_associate___ne;
    private Boolean risposte_associate___null;
    private Boolean risposte_associate___not___null;
    private java.util.List<Integer> risposte_associate___in;
    private java.util.List<Integer> risposte_associate___not___in;
    private Integer risposte_associate___lt;
    private Integer risposte_associate___lte;
    private Integer risposte_associate___gt;
    private Integer risposte_associate___gte;
    private String risposte_associate_ids___eq;
    private String risposte_associate_ids___ne;
    private Boolean risposte_associate_ids___null;
    private Boolean risposte_associate_ids___not___null;
    private java.util.List<String> risposte_associate_ids___in;
    private java.util.List<String> risposte_associate_ids___not___in;
    private String risposte_associate_ids___lt;
    private String risposte_associate_ids___lte;
    private String risposte_associate_ids___gt;
    private String risposte_associate_ids___gte;
    private String risposte_associate_ids___contains;
    private String risposte_associate_ids___not___contains;
    private String risposte_associate_ids___starts_with;
    private String risposte_associate_ids___not___starts_with;
    private String risposte_associate_ids___ends_with;
    private String risposte_associate_ids___not___ends_with;
    private String testo___eq;
    private String testo___ne;
    private Boolean testo___null;
    private Boolean testo___not___null;
    private java.util.List<String> testo___in;
    private java.util.List<String> testo___not___in;
    private String testo___lt;
    private String testo___lte;
    private String testo___gt;
    private String testo___gte;
    private String testo___contains;
    private String testo___not___contains;
    private String testo___starts_with;
    private String testo___not___starts_with;
    private String testo___ends_with;
    private String testo___not___ends_with;
    private java.util.List<CliRisposta_possibileFilterDTO> AND;
    private java.util.List<CliRisposta_possibileFilterDTO> OR;
    private CliRisposta_possibileFilterDTO NOT;

    public CliRisposta_possibileFilterDTO() {
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

    public String getConc___eq() {
        return conc___eq;
    }
    public void setConc___eq(String conc___eq) {
        this.conc___eq = conc___eq;
    }

    public String getConc___ne() {
        return conc___ne;
    }
    public void setConc___ne(String conc___ne) {
        this.conc___ne = conc___ne;
    }

    public Boolean getConc___null() {
        return conc___null;
    }
    public void setConc___null(Boolean conc___null) {
        this.conc___null = conc___null;
    }

    public Boolean getConc___not___null() {
        return conc___not___null;
    }
    public void setConc___not___null(Boolean conc___not___null) {
        this.conc___not___null = conc___not___null;
    }

    public java.util.List<String> getConc___in() {
        return conc___in;
    }
    public void setConc___in(java.util.List<String> conc___in) {
        this.conc___in = conc___in;
    }

    public java.util.List<String> getConc___not___in() {
        return conc___not___in;
    }
    public void setConc___not___in(java.util.List<String> conc___not___in) {
        this.conc___not___in = conc___not___in;
    }

    public String getConc___lt() {
        return conc___lt;
    }
    public void setConc___lt(String conc___lt) {
        this.conc___lt = conc___lt;
    }

    public String getConc___lte() {
        return conc___lte;
    }
    public void setConc___lte(String conc___lte) {
        this.conc___lte = conc___lte;
    }

    public String getConc___gt() {
        return conc___gt;
    }
    public void setConc___gt(String conc___gt) {
        this.conc___gt = conc___gt;
    }

    public String getConc___gte() {
        return conc___gte;
    }
    public void setConc___gte(String conc___gte) {
        this.conc___gte = conc___gte;
    }

    public String getConc___contains() {
        return conc___contains;
    }
    public void setConc___contains(String conc___contains) {
        this.conc___contains = conc___contains;
    }

    public String getConc___not___contains() {
        return conc___not___contains;
    }
    public void setConc___not___contains(String conc___not___contains) {
        this.conc___not___contains = conc___not___contains;
    }

    public String getConc___starts_with() {
        return conc___starts_with;
    }
    public void setConc___starts_with(String conc___starts_with) {
        this.conc___starts_with = conc___starts_with;
    }

    public String getConc___not___starts_with() {
        return conc___not___starts_with;
    }
    public void setConc___not___starts_with(String conc___not___starts_with) {
        this.conc___not___starts_with = conc___not___starts_with;
    }

    public String getConc___ends_with() {
        return conc___ends_with;
    }
    public void setConc___ends_with(String conc___ends_with) {
        this.conc___ends_with = conc___ends_with;
    }

    public String getConc___not___ends_with() {
        return conc___not___ends_with;
    }
    public void setConc___not___ends_with(String conc___not___ends_with) {
        this.conc___not___ends_with = conc___not___ends_with;
    }

    public Integer getDomande_associate___eq() {
        return domande_associate___eq;
    }
    public void setDomande_associate___eq(Integer domande_associate___eq) {
        this.domande_associate___eq = domande_associate___eq;
    }

    public Integer getDomande_associate___ne() {
        return domande_associate___ne;
    }
    public void setDomande_associate___ne(Integer domande_associate___ne) {
        this.domande_associate___ne = domande_associate___ne;
    }

    public Boolean getDomande_associate___null() {
        return domande_associate___null;
    }
    public void setDomande_associate___null(Boolean domande_associate___null) {
        this.domande_associate___null = domande_associate___null;
    }

    public Boolean getDomande_associate___not___null() {
        return domande_associate___not___null;
    }
    public void setDomande_associate___not___null(Boolean domande_associate___not___null) {
        this.domande_associate___not___null = domande_associate___not___null;
    }

    public java.util.List<Integer> getDomande_associate___in() {
        return domande_associate___in;
    }
    public void setDomande_associate___in(java.util.List<Integer> domande_associate___in) {
        this.domande_associate___in = domande_associate___in;
    }

    public java.util.List<Integer> getDomande_associate___not___in() {
        return domande_associate___not___in;
    }
    public void setDomande_associate___not___in(java.util.List<Integer> domande_associate___not___in) {
        this.domande_associate___not___in = domande_associate___not___in;
    }

    public Integer getDomande_associate___lt() {
        return domande_associate___lt;
    }
    public void setDomande_associate___lt(Integer domande_associate___lt) {
        this.domande_associate___lt = domande_associate___lt;
    }

    public Integer getDomande_associate___lte() {
        return domande_associate___lte;
    }
    public void setDomande_associate___lte(Integer domande_associate___lte) {
        this.domande_associate___lte = domande_associate___lte;
    }

    public Integer getDomande_associate___gt() {
        return domande_associate___gt;
    }
    public void setDomande_associate___gt(Integer domande_associate___gt) {
        this.domande_associate___gt = domande_associate___gt;
    }

    public Integer getDomande_associate___gte() {
        return domande_associate___gte;
    }
    public void setDomande_associate___gte(Integer domande_associate___gte) {
        this.domande_associate___gte = domande_associate___gte;
    }

    public String getDomande_associate_ids___eq() {
        return domande_associate_ids___eq;
    }
    public void setDomande_associate_ids___eq(String domande_associate_ids___eq) {
        this.domande_associate_ids___eq = domande_associate_ids___eq;
    }

    public String getDomande_associate_ids___ne() {
        return domande_associate_ids___ne;
    }
    public void setDomande_associate_ids___ne(String domande_associate_ids___ne) {
        this.domande_associate_ids___ne = domande_associate_ids___ne;
    }

    public Boolean getDomande_associate_ids___null() {
        return domande_associate_ids___null;
    }
    public void setDomande_associate_ids___null(Boolean domande_associate_ids___null) {
        this.domande_associate_ids___null = domande_associate_ids___null;
    }

    public Boolean getDomande_associate_ids___not___null() {
        return domande_associate_ids___not___null;
    }
    public void setDomande_associate_ids___not___null(Boolean domande_associate_ids___not___null) {
        this.domande_associate_ids___not___null = domande_associate_ids___not___null;
    }

    public java.util.List<String> getDomande_associate_ids___in() {
        return domande_associate_ids___in;
    }
    public void setDomande_associate_ids___in(java.util.List<String> domande_associate_ids___in) {
        this.domande_associate_ids___in = domande_associate_ids___in;
    }

    public java.util.List<String> getDomande_associate_ids___not___in() {
        return domande_associate_ids___not___in;
    }
    public void setDomande_associate_ids___not___in(java.util.List<String> domande_associate_ids___not___in) {
        this.domande_associate_ids___not___in = domande_associate_ids___not___in;
    }

    public String getDomande_associate_ids___lt() {
        return domande_associate_ids___lt;
    }
    public void setDomande_associate_ids___lt(String domande_associate_ids___lt) {
        this.domande_associate_ids___lt = domande_associate_ids___lt;
    }

    public String getDomande_associate_ids___lte() {
        return domande_associate_ids___lte;
    }
    public void setDomande_associate_ids___lte(String domande_associate_ids___lte) {
        this.domande_associate_ids___lte = domande_associate_ids___lte;
    }

    public String getDomande_associate_ids___gt() {
        return domande_associate_ids___gt;
    }
    public void setDomande_associate_ids___gt(String domande_associate_ids___gt) {
        this.domande_associate_ids___gt = domande_associate_ids___gt;
    }

    public String getDomande_associate_ids___gte() {
        return domande_associate_ids___gte;
    }
    public void setDomande_associate_ids___gte(String domande_associate_ids___gte) {
        this.domande_associate_ids___gte = domande_associate_ids___gte;
    }

    public String getDomande_associate_ids___contains() {
        return domande_associate_ids___contains;
    }
    public void setDomande_associate_ids___contains(String domande_associate_ids___contains) {
        this.domande_associate_ids___contains = domande_associate_ids___contains;
    }

    public String getDomande_associate_ids___not___contains() {
        return domande_associate_ids___not___contains;
    }
    public void setDomande_associate_ids___not___contains(String domande_associate_ids___not___contains) {
        this.domande_associate_ids___not___contains = domande_associate_ids___not___contains;
    }

    public String getDomande_associate_ids___starts_with() {
        return domande_associate_ids___starts_with;
    }
    public void setDomande_associate_ids___starts_with(String domande_associate_ids___starts_with) {
        this.domande_associate_ids___starts_with = domande_associate_ids___starts_with;
    }

    public String getDomande_associate_ids___not___starts_with() {
        return domande_associate_ids___not___starts_with;
    }
    public void setDomande_associate_ids___not___starts_with(String domande_associate_ids___not___starts_with) {
        this.domande_associate_ids___not___starts_with = domande_associate_ids___not___starts_with;
    }

    public String getDomande_associate_ids___ends_with() {
        return domande_associate_ids___ends_with;
    }
    public void setDomande_associate_ids___ends_with(String domande_associate_ids___ends_with) {
        this.domande_associate_ids___ends_with = domande_associate_ids___ends_with;
    }

    public String getDomande_associate_ids___not___ends_with() {
        return domande_associate_ids___not___ends_with;
    }
    public void setDomande_associate_ids___not___ends_with(String domande_associate_ids___not___ends_with) {
        this.domande_associate_ids___not___ends_with = domande_associate_ids___not___ends_with;
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

    public String getPunteggio___eq() {
        return punteggio___eq;
    }
    public void setPunteggio___eq(String punteggio___eq) {
        this.punteggio___eq = punteggio___eq;
    }

    public String getPunteggio___ne() {
        return punteggio___ne;
    }
    public void setPunteggio___ne(String punteggio___ne) {
        this.punteggio___ne = punteggio___ne;
    }

    public Boolean getPunteggio___null() {
        return punteggio___null;
    }
    public void setPunteggio___null(Boolean punteggio___null) {
        this.punteggio___null = punteggio___null;
    }

    public Boolean getPunteggio___not___null() {
        return punteggio___not___null;
    }
    public void setPunteggio___not___null(Boolean punteggio___not___null) {
        this.punteggio___not___null = punteggio___not___null;
    }

    public java.util.List<String> getPunteggio___in() {
        return punteggio___in;
    }
    public void setPunteggio___in(java.util.List<String> punteggio___in) {
        this.punteggio___in = punteggio___in;
    }

    public java.util.List<String> getPunteggio___not___in() {
        return punteggio___not___in;
    }
    public void setPunteggio___not___in(java.util.List<String> punteggio___not___in) {
        this.punteggio___not___in = punteggio___not___in;
    }

    public String getPunteggio___lt() {
        return punteggio___lt;
    }
    public void setPunteggio___lt(String punteggio___lt) {
        this.punteggio___lt = punteggio___lt;
    }

    public String getPunteggio___lte() {
        return punteggio___lte;
    }
    public void setPunteggio___lte(String punteggio___lte) {
        this.punteggio___lte = punteggio___lte;
    }

    public String getPunteggio___gt() {
        return punteggio___gt;
    }
    public void setPunteggio___gt(String punteggio___gt) {
        this.punteggio___gt = punteggio___gt;
    }

    public String getPunteggio___gte() {
        return punteggio___gte;
    }
    public void setPunteggio___gte(String punteggio___gte) {
        this.punteggio___gte = punteggio___gte;
    }

    public Integer getRisposte_associate___eq() {
        return risposte_associate___eq;
    }
    public void setRisposte_associate___eq(Integer risposte_associate___eq) {
        this.risposte_associate___eq = risposte_associate___eq;
    }

    public Integer getRisposte_associate___ne() {
        return risposte_associate___ne;
    }
    public void setRisposte_associate___ne(Integer risposte_associate___ne) {
        this.risposte_associate___ne = risposte_associate___ne;
    }

    public Boolean getRisposte_associate___null() {
        return risposte_associate___null;
    }
    public void setRisposte_associate___null(Boolean risposte_associate___null) {
        this.risposte_associate___null = risposte_associate___null;
    }

    public Boolean getRisposte_associate___not___null() {
        return risposte_associate___not___null;
    }
    public void setRisposte_associate___not___null(Boolean risposte_associate___not___null) {
        this.risposte_associate___not___null = risposte_associate___not___null;
    }

    public java.util.List<Integer> getRisposte_associate___in() {
        return risposte_associate___in;
    }
    public void setRisposte_associate___in(java.util.List<Integer> risposte_associate___in) {
        this.risposte_associate___in = risposte_associate___in;
    }

    public java.util.List<Integer> getRisposte_associate___not___in() {
        return risposte_associate___not___in;
    }
    public void setRisposte_associate___not___in(java.util.List<Integer> risposte_associate___not___in) {
        this.risposte_associate___not___in = risposte_associate___not___in;
    }

    public Integer getRisposte_associate___lt() {
        return risposte_associate___lt;
    }
    public void setRisposte_associate___lt(Integer risposte_associate___lt) {
        this.risposte_associate___lt = risposte_associate___lt;
    }

    public Integer getRisposte_associate___lte() {
        return risposte_associate___lte;
    }
    public void setRisposte_associate___lte(Integer risposte_associate___lte) {
        this.risposte_associate___lte = risposte_associate___lte;
    }

    public Integer getRisposte_associate___gt() {
        return risposte_associate___gt;
    }
    public void setRisposte_associate___gt(Integer risposte_associate___gt) {
        this.risposte_associate___gt = risposte_associate___gt;
    }

    public Integer getRisposte_associate___gte() {
        return risposte_associate___gte;
    }
    public void setRisposte_associate___gte(Integer risposte_associate___gte) {
        this.risposte_associate___gte = risposte_associate___gte;
    }

    public String getRisposte_associate_ids___eq() {
        return risposte_associate_ids___eq;
    }
    public void setRisposte_associate_ids___eq(String risposte_associate_ids___eq) {
        this.risposte_associate_ids___eq = risposte_associate_ids___eq;
    }

    public String getRisposte_associate_ids___ne() {
        return risposte_associate_ids___ne;
    }
    public void setRisposte_associate_ids___ne(String risposte_associate_ids___ne) {
        this.risposte_associate_ids___ne = risposte_associate_ids___ne;
    }

    public Boolean getRisposte_associate_ids___null() {
        return risposte_associate_ids___null;
    }
    public void setRisposte_associate_ids___null(Boolean risposte_associate_ids___null) {
        this.risposte_associate_ids___null = risposte_associate_ids___null;
    }

    public Boolean getRisposte_associate_ids___not___null() {
        return risposte_associate_ids___not___null;
    }
    public void setRisposte_associate_ids___not___null(Boolean risposte_associate_ids___not___null) {
        this.risposte_associate_ids___not___null = risposte_associate_ids___not___null;
    }

    public java.util.List<String> getRisposte_associate_ids___in() {
        return risposte_associate_ids___in;
    }
    public void setRisposte_associate_ids___in(java.util.List<String> risposte_associate_ids___in) {
        this.risposte_associate_ids___in = risposte_associate_ids___in;
    }

    public java.util.List<String> getRisposte_associate_ids___not___in() {
        return risposte_associate_ids___not___in;
    }
    public void setRisposte_associate_ids___not___in(java.util.List<String> risposte_associate_ids___not___in) {
        this.risposte_associate_ids___not___in = risposte_associate_ids___not___in;
    }

    public String getRisposte_associate_ids___lt() {
        return risposte_associate_ids___lt;
    }
    public void setRisposte_associate_ids___lt(String risposte_associate_ids___lt) {
        this.risposte_associate_ids___lt = risposte_associate_ids___lt;
    }

    public String getRisposte_associate_ids___lte() {
        return risposte_associate_ids___lte;
    }
    public void setRisposte_associate_ids___lte(String risposte_associate_ids___lte) {
        this.risposte_associate_ids___lte = risposte_associate_ids___lte;
    }

    public String getRisposte_associate_ids___gt() {
        return risposte_associate_ids___gt;
    }
    public void setRisposte_associate_ids___gt(String risposte_associate_ids___gt) {
        this.risposte_associate_ids___gt = risposte_associate_ids___gt;
    }

    public String getRisposte_associate_ids___gte() {
        return risposte_associate_ids___gte;
    }
    public void setRisposte_associate_ids___gte(String risposte_associate_ids___gte) {
        this.risposte_associate_ids___gte = risposte_associate_ids___gte;
    }

    public String getRisposte_associate_ids___contains() {
        return risposte_associate_ids___contains;
    }
    public void setRisposte_associate_ids___contains(String risposte_associate_ids___contains) {
        this.risposte_associate_ids___contains = risposte_associate_ids___contains;
    }

    public String getRisposte_associate_ids___not___contains() {
        return risposte_associate_ids___not___contains;
    }
    public void setRisposte_associate_ids___not___contains(String risposte_associate_ids___not___contains) {
        this.risposte_associate_ids___not___contains = risposte_associate_ids___not___contains;
    }

    public String getRisposte_associate_ids___starts_with() {
        return risposte_associate_ids___starts_with;
    }
    public void setRisposte_associate_ids___starts_with(String risposte_associate_ids___starts_with) {
        this.risposte_associate_ids___starts_with = risposte_associate_ids___starts_with;
    }

    public String getRisposte_associate_ids___not___starts_with() {
        return risposte_associate_ids___not___starts_with;
    }
    public void setRisposte_associate_ids___not___starts_with(String risposte_associate_ids___not___starts_with) {
        this.risposte_associate_ids___not___starts_with = risposte_associate_ids___not___starts_with;
    }

    public String getRisposte_associate_ids___ends_with() {
        return risposte_associate_ids___ends_with;
    }
    public void setRisposte_associate_ids___ends_with(String risposte_associate_ids___ends_with) {
        this.risposte_associate_ids___ends_with = risposte_associate_ids___ends_with;
    }

    public String getRisposte_associate_ids___not___ends_with() {
        return risposte_associate_ids___not___ends_with;
    }
    public void setRisposte_associate_ids___not___ends_with(String risposte_associate_ids___not___ends_with) {
        this.risposte_associate_ids___not___ends_with = risposte_associate_ids___not___ends_with;
    }

    public String getTesto___eq() {
        return testo___eq;
    }
    public void setTesto___eq(String testo___eq) {
        this.testo___eq = testo___eq;
    }

    public String getTesto___ne() {
        return testo___ne;
    }
    public void setTesto___ne(String testo___ne) {
        this.testo___ne = testo___ne;
    }

    public Boolean getTesto___null() {
        return testo___null;
    }
    public void setTesto___null(Boolean testo___null) {
        this.testo___null = testo___null;
    }

    public Boolean getTesto___not___null() {
        return testo___not___null;
    }
    public void setTesto___not___null(Boolean testo___not___null) {
        this.testo___not___null = testo___not___null;
    }

    public java.util.List<String> getTesto___in() {
        return testo___in;
    }
    public void setTesto___in(java.util.List<String> testo___in) {
        this.testo___in = testo___in;
    }

    public java.util.List<String> getTesto___not___in() {
        return testo___not___in;
    }
    public void setTesto___not___in(java.util.List<String> testo___not___in) {
        this.testo___not___in = testo___not___in;
    }

    public String getTesto___lt() {
        return testo___lt;
    }
    public void setTesto___lt(String testo___lt) {
        this.testo___lt = testo___lt;
    }

    public String getTesto___lte() {
        return testo___lte;
    }
    public void setTesto___lte(String testo___lte) {
        this.testo___lte = testo___lte;
    }

    public String getTesto___gt() {
        return testo___gt;
    }
    public void setTesto___gt(String testo___gt) {
        this.testo___gt = testo___gt;
    }

    public String getTesto___gte() {
        return testo___gte;
    }
    public void setTesto___gte(String testo___gte) {
        this.testo___gte = testo___gte;
    }

    public String getTesto___contains() {
        return testo___contains;
    }
    public void setTesto___contains(String testo___contains) {
        this.testo___contains = testo___contains;
    }

    public String getTesto___not___contains() {
        return testo___not___contains;
    }
    public void setTesto___not___contains(String testo___not___contains) {
        this.testo___not___contains = testo___not___contains;
    }

    public String getTesto___starts_with() {
        return testo___starts_with;
    }
    public void setTesto___starts_with(String testo___starts_with) {
        this.testo___starts_with = testo___starts_with;
    }

    public String getTesto___not___starts_with() {
        return testo___not___starts_with;
    }
    public void setTesto___not___starts_with(String testo___not___starts_with) {
        this.testo___not___starts_with = testo___not___starts_with;
    }

    public String getTesto___ends_with() {
        return testo___ends_with;
    }
    public void setTesto___ends_with(String testo___ends_with) {
        this.testo___ends_with = testo___ends_with;
    }

    public String getTesto___not___ends_with() {
        return testo___not___ends_with;
    }
    public void setTesto___not___ends_with(String testo___not___ends_with) {
        this.testo___not___ends_with = testo___not___ends_with;
    }

    public java.util.List<CliRisposta_possibileFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliRisposta_possibileFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliRisposta_possibileFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliRisposta_possibileFilterDTO> OR) {
        this.OR = OR;
    }

    public CliRisposta_possibileFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliRisposta_possibileFilterDTO NOT) {
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
        if (conc___eq != null) {
            joiner.add("conc___eq: " + GraphQLRequestSerializer.getEntry(conc___eq));
        }
        if (conc___ne != null) {
            joiner.add("conc___ne: " + GraphQLRequestSerializer.getEntry(conc___ne));
        }
        if (conc___null != null) {
            joiner.add("conc___null: " + GraphQLRequestSerializer.getEntry(conc___null));
        }
        if (conc___not___null != null) {
            joiner.add("conc___not___null: " + GraphQLRequestSerializer.getEntry(conc___not___null));
        }
        if (conc___in != null) {
            joiner.add("conc___in: " + GraphQLRequestSerializer.getEntry(conc___in));
        }
        if (conc___not___in != null) {
            joiner.add("conc___not___in: " + GraphQLRequestSerializer.getEntry(conc___not___in));
        }
        if (conc___lt != null) {
            joiner.add("conc___lt: " + GraphQLRequestSerializer.getEntry(conc___lt));
        }
        if (conc___lte != null) {
            joiner.add("conc___lte: " + GraphQLRequestSerializer.getEntry(conc___lte));
        }
        if (conc___gt != null) {
            joiner.add("conc___gt: " + GraphQLRequestSerializer.getEntry(conc___gt));
        }
        if (conc___gte != null) {
            joiner.add("conc___gte: " + GraphQLRequestSerializer.getEntry(conc___gte));
        }
        if (conc___contains != null) {
            joiner.add("conc___contains: " + GraphQLRequestSerializer.getEntry(conc___contains));
        }
        if (conc___not___contains != null) {
            joiner.add("conc___not___contains: " + GraphQLRequestSerializer.getEntry(conc___not___contains));
        }
        if (conc___starts_with != null) {
            joiner.add("conc___starts_with: " + GraphQLRequestSerializer.getEntry(conc___starts_with));
        }
        if (conc___not___starts_with != null) {
            joiner.add("conc___not___starts_with: " + GraphQLRequestSerializer.getEntry(conc___not___starts_with));
        }
        if (conc___ends_with != null) {
            joiner.add("conc___ends_with: " + GraphQLRequestSerializer.getEntry(conc___ends_with));
        }
        if (conc___not___ends_with != null) {
            joiner.add("conc___not___ends_with: " + GraphQLRequestSerializer.getEntry(conc___not___ends_with));
        }
        if (domande_associate___eq != null) {
            joiner.add("domande_associate___eq: " + GraphQLRequestSerializer.getEntry(domande_associate___eq));
        }
        if (domande_associate___ne != null) {
            joiner.add("domande_associate___ne: " + GraphQLRequestSerializer.getEntry(domande_associate___ne));
        }
        if (domande_associate___null != null) {
            joiner.add("domande_associate___null: " + GraphQLRequestSerializer.getEntry(domande_associate___null));
        }
        if (domande_associate___not___null != null) {
            joiner.add("domande_associate___not___null: " + GraphQLRequestSerializer.getEntry(domande_associate___not___null));
        }
        if (domande_associate___in != null) {
            joiner.add("domande_associate___in: " + GraphQLRequestSerializer.getEntry(domande_associate___in));
        }
        if (domande_associate___not___in != null) {
            joiner.add("domande_associate___not___in: " + GraphQLRequestSerializer.getEntry(domande_associate___not___in));
        }
        if (domande_associate___lt != null) {
            joiner.add("domande_associate___lt: " + GraphQLRequestSerializer.getEntry(domande_associate___lt));
        }
        if (domande_associate___lte != null) {
            joiner.add("domande_associate___lte: " + GraphQLRequestSerializer.getEntry(domande_associate___lte));
        }
        if (domande_associate___gt != null) {
            joiner.add("domande_associate___gt: " + GraphQLRequestSerializer.getEntry(domande_associate___gt));
        }
        if (domande_associate___gte != null) {
            joiner.add("domande_associate___gte: " + GraphQLRequestSerializer.getEntry(domande_associate___gte));
        }
        if (domande_associate_ids___eq != null) {
            joiner.add("domande_associate_ids___eq: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___eq));
        }
        if (domande_associate_ids___ne != null) {
            joiner.add("domande_associate_ids___ne: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___ne));
        }
        if (domande_associate_ids___null != null) {
            joiner.add("domande_associate_ids___null: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___null));
        }
        if (domande_associate_ids___not___null != null) {
            joiner.add("domande_associate_ids___not___null: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___not___null));
        }
        if (domande_associate_ids___in != null) {
            joiner.add("domande_associate_ids___in: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___in));
        }
        if (domande_associate_ids___not___in != null) {
            joiner.add("domande_associate_ids___not___in: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___not___in));
        }
        if (domande_associate_ids___lt != null) {
            joiner.add("domande_associate_ids___lt: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___lt));
        }
        if (domande_associate_ids___lte != null) {
            joiner.add("domande_associate_ids___lte: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___lte));
        }
        if (domande_associate_ids___gt != null) {
            joiner.add("domande_associate_ids___gt: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___gt));
        }
        if (domande_associate_ids___gte != null) {
            joiner.add("domande_associate_ids___gte: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___gte));
        }
        if (domande_associate_ids___contains != null) {
            joiner.add("domande_associate_ids___contains: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___contains));
        }
        if (domande_associate_ids___not___contains != null) {
            joiner.add("domande_associate_ids___not___contains: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___not___contains));
        }
        if (domande_associate_ids___starts_with != null) {
            joiner.add("domande_associate_ids___starts_with: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___starts_with));
        }
        if (domande_associate_ids___not___starts_with != null) {
            joiner.add("domande_associate_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___not___starts_with));
        }
        if (domande_associate_ids___ends_with != null) {
            joiner.add("domande_associate_ids___ends_with: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___ends_with));
        }
        if (domande_associate_ids___not___ends_with != null) {
            joiner.add("domande_associate_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(domande_associate_ids___not___ends_with));
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
        if (punteggio___eq != null) {
            joiner.add("punteggio___eq: " + GraphQLRequestSerializer.getEntry(punteggio___eq));
        }
        if (punteggio___ne != null) {
            joiner.add("punteggio___ne: " + GraphQLRequestSerializer.getEntry(punteggio___ne));
        }
        if (punteggio___null != null) {
            joiner.add("punteggio___null: " + GraphQLRequestSerializer.getEntry(punteggio___null));
        }
        if (punteggio___not___null != null) {
            joiner.add("punteggio___not___null: " + GraphQLRequestSerializer.getEntry(punteggio___not___null));
        }
        if (punteggio___in != null) {
            joiner.add("punteggio___in: " + GraphQLRequestSerializer.getEntry(punteggio___in));
        }
        if (punteggio___not___in != null) {
            joiner.add("punteggio___not___in: " + GraphQLRequestSerializer.getEntry(punteggio___not___in));
        }
        if (punteggio___lt != null) {
            joiner.add("punteggio___lt: " + GraphQLRequestSerializer.getEntry(punteggio___lt));
        }
        if (punteggio___lte != null) {
            joiner.add("punteggio___lte: " + GraphQLRequestSerializer.getEntry(punteggio___lte));
        }
        if (punteggio___gt != null) {
            joiner.add("punteggio___gt: " + GraphQLRequestSerializer.getEntry(punteggio___gt));
        }
        if (punteggio___gte != null) {
            joiner.add("punteggio___gte: " + GraphQLRequestSerializer.getEntry(punteggio___gte));
        }
        if (risposte_associate___eq != null) {
            joiner.add("risposte_associate___eq: " + GraphQLRequestSerializer.getEntry(risposte_associate___eq));
        }
        if (risposte_associate___ne != null) {
            joiner.add("risposte_associate___ne: " + GraphQLRequestSerializer.getEntry(risposte_associate___ne));
        }
        if (risposte_associate___null != null) {
            joiner.add("risposte_associate___null: " + GraphQLRequestSerializer.getEntry(risposte_associate___null));
        }
        if (risposte_associate___not___null != null) {
            joiner.add("risposte_associate___not___null: " + GraphQLRequestSerializer.getEntry(risposte_associate___not___null));
        }
        if (risposte_associate___in != null) {
            joiner.add("risposte_associate___in: " + GraphQLRequestSerializer.getEntry(risposte_associate___in));
        }
        if (risposte_associate___not___in != null) {
            joiner.add("risposte_associate___not___in: " + GraphQLRequestSerializer.getEntry(risposte_associate___not___in));
        }
        if (risposte_associate___lt != null) {
            joiner.add("risposte_associate___lt: " + GraphQLRequestSerializer.getEntry(risposte_associate___lt));
        }
        if (risposte_associate___lte != null) {
            joiner.add("risposte_associate___lte: " + GraphQLRequestSerializer.getEntry(risposte_associate___lte));
        }
        if (risposte_associate___gt != null) {
            joiner.add("risposte_associate___gt: " + GraphQLRequestSerializer.getEntry(risposte_associate___gt));
        }
        if (risposte_associate___gte != null) {
            joiner.add("risposte_associate___gte: " + GraphQLRequestSerializer.getEntry(risposte_associate___gte));
        }
        if (risposte_associate_ids___eq != null) {
            joiner.add("risposte_associate_ids___eq: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___eq));
        }
        if (risposte_associate_ids___ne != null) {
            joiner.add("risposte_associate_ids___ne: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___ne));
        }
        if (risposte_associate_ids___null != null) {
            joiner.add("risposte_associate_ids___null: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___null));
        }
        if (risposte_associate_ids___not___null != null) {
            joiner.add("risposte_associate_ids___not___null: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___not___null));
        }
        if (risposte_associate_ids___in != null) {
            joiner.add("risposte_associate_ids___in: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___in));
        }
        if (risposte_associate_ids___not___in != null) {
            joiner.add("risposte_associate_ids___not___in: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___not___in));
        }
        if (risposte_associate_ids___lt != null) {
            joiner.add("risposte_associate_ids___lt: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___lt));
        }
        if (risposte_associate_ids___lte != null) {
            joiner.add("risposte_associate_ids___lte: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___lte));
        }
        if (risposte_associate_ids___gt != null) {
            joiner.add("risposte_associate_ids___gt: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___gt));
        }
        if (risposte_associate_ids___gte != null) {
            joiner.add("risposte_associate_ids___gte: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___gte));
        }
        if (risposte_associate_ids___contains != null) {
            joiner.add("risposte_associate_ids___contains: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___contains));
        }
        if (risposte_associate_ids___not___contains != null) {
            joiner.add("risposte_associate_ids___not___contains: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___not___contains));
        }
        if (risposte_associate_ids___starts_with != null) {
            joiner.add("risposte_associate_ids___starts_with: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___starts_with));
        }
        if (risposte_associate_ids___not___starts_with != null) {
            joiner.add("risposte_associate_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___not___starts_with));
        }
        if (risposte_associate_ids___ends_with != null) {
            joiner.add("risposte_associate_ids___ends_with: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___ends_with));
        }
        if (risposte_associate_ids___not___ends_with != null) {
            joiner.add("risposte_associate_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids___not___ends_with));
        }
        if (testo___eq != null) {
            joiner.add("testo___eq: " + GraphQLRequestSerializer.getEntry(testo___eq));
        }
        if (testo___ne != null) {
            joiner.add("testo___ne: " + GraphQLRequestSerializer.getEntry(testo___ne));
        }
        if (testo___null != null) {
            joiner.add("testo___null: " + GraphQLRequestSerializer.getEntry(testo___null));
        }
        if (testo___not___null != null) {
            joiner.add("testo___not___null: " + GraphQLRequestSerializer.getEntry(testo___not___null));
        }
        if (testo___in != null) {
            joiner.add("testo___in: " + GraphQLRequestSerializer.getEntry(testo___in));
        }
        if (testo___not___in != null) {
            joiner.add("testo___not___in: " + GraphQLRequestSerializer.getEntry(testo___not___in));
        }
        if (testo___lt != null) {
            joiner.add("testo___lt: " + GraphQLRequestSerializer.getEntry(testo___lt));
        }
        if (testo___lte != null) {
            joiner.add("testo___lte: " + GraphQLRequestSerializer.getEntry(testo___lte));
        }
        if (testo___gt != null) {
            joiner.add("testo___gt: " + GraphQLRequestSerializer.getEntry(testo___gt));
        }
        if (testo___gte != null) {
            joiner.add("testo___gte: " + GraphQLRequestSerializer.getEntry(testo___gte));
        }
        if (testo___contains != null) {
            joiner.add("testo___contains: " + GraphQLRequestSerializer.getEntry(testo___contains));
        }
        if (testo___not___contains != null) {
            joiner.add("testo___not___contains: " + GraphQLRequestSerializer.getEntry(testo___not___contains));
        }
        if (testo___starts_with != null) {
            joiner.add("testo___starts_with: " + GraphQLRequestSerializer.getEntry(testo___starts_with));
        }
        if (testo___not___starts_with != null) {
            joiner.add("testo___not___starts_with: " + GraphQLRequestSerializer.getEntry(testo___not___starts_with));
        }
        if (testo___ends_with != null) {
            joiner.add("testo___ends_with: " + GraphQLRequestSerializer.getEntry(testo___ends_with));
        }
        if (testo___not___ends_with != null) {
            joiner.add("testo___not___ends_with: " + GraphQLRequestSerializer.getEntry(testo___not___ends_with));
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

    public static CliRisposta_possibileFilterDTO.Builder builder() {
        return new CliRisposta_possibileFilterDTO.Builder();
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
        private String conc___eq;
        private String conc___ne;
        private Boolean conc___null;
        private Boolean conc___not___null;
        private java.util.List<String> conc___in;
        private java.util.List<String> conc___not___in;
        private String conc___lt;
        private String conc___lte;
        private String conc___gt;
        private String conc___gte;
        private String conc___contains;
        private String conc___not___contains;
        private String conc___starts_with;
        private String conc___not___starts_with;
        private String conc___ends_with;
        private String conc___not___ends_with;
        private Integer domande_associate___eq;
        private Integer domande_associate___ne;
        private Boolean domande_associate___null;
        private Boolean domande_associate___not___null;
        private java.util.List<Integer> domande_associate___in;
        private java.util.List<Integer> domande_associate___not___in;
        private Integer domande_associate___lt;
        private Integer domande_associate___lte;
        private Integer domande_associate___gt;
        private Integer domande_associate___gte;
        private String domande_associate_ids___eq;
        private String domande_associate_ids___ne;
        private Boolean domande_associate_ids___null;
        private Boolean domande_associate_ids___not___null;
        private java.util.List<String> domande_associate_ids___in;
        private java.util.List<String> domande_associate_ids___not___in;
        private String domande_associate_ids___lt;
        private String domande_associate_ids___lte;
        private String domande_associate_ids___gt;
        private String domande_associate_ids___gte;
        private String domande_associate_ids___contains;
        private String domande_associate_ids___not___contains;
        private String domande_associate_ids___starts_with;
        private String domande_associate_ids___not___starts_with;
        private String domande_associate_ids___ends_with;
        private String domande_associate_ids___not___ends_with;
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
        private String punteggio___eq;
        private String punteggio___ne;
        private Boolean punteggio___null;
        private Boolean punteggio___not___null;
        private java.util.List<String> punteggio___in;
        private java.util.List<String> punteggio___not___in;
        private String punteggio___lt;
        private String punteggio___lte;
        private String punteggio___gt;
        private String punteggio___gte;
        private Integer risposte_associate___eq;
        private Integer risposte_associate___ne;
        private Boolean risposte_associate___null;
        private Boolean risposte_associate___not___null;
        private java.util.List<Integer> risposte_associate___in;
        private java.util.List<Integer> risposte_associate___not___in;
        private Integer risposte_associate___lt;
        private Integer risposte_associate___lte;
        private Integer risposte_associate___gt;
        private Integer risposte_associate___gte;
        private String risposte_associate_ids___eq;
        private String risposte_associate_ids___ne;
        private Boolean risposte_associate_ids___null;
        private Boolean risposte_associate_ids___not___null;
        private java.util.List<String> risposte_associate_ids___in;
        private java.util.List<String> risposte_associate_ids___not___in;
        private String risposte_associate_ids___lt;
        private String risposte_associate_ids___lte;
        private String risposte_associate_ids___gt;
        private String risposte_associate_ids___gte;
        private String risposte_associate_ids___contains;
        private String risposte_associate_ids___not___contains;
        private String risposte_associate_ids___starts_with;
        private String risposte_associate_ids___not___starts_with;
        private String risposte_associate_ids___ends_with;
        private String risposte_associate_ids___not___ends_with;
        private String testo___eq;
        private String testo___ne;
        private Boolean testo___null;
        private Boolean testo___not___null;
        private java.util.List<String> testo___in;
        private java.util.List<String> testo___not___in;
        private String testo___lt;
        private String testo___lte;
        private String testo___gt;
        private String testo___gte;
        private String testo___contains;
        private String testo___not___contains;
        private String testo___starts_with;
        private String testo___not___starts_with;
        private String testo___ends_with;
        private String testo___not___ends_with;
        private java.util.List<CliRisposta_possibileFilterDTO> AND;
        private java.util.List<CliRisposta_possibileFilterDTO> OR;
        private CliRisposta_possibileFilterDTO NOT;

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

        public Builder setConc___eq(String conc___eq) {
            this.conc___eq = conc___eq;
            return this;
        }

        public Builder setConc___ne(String conc___ne) {
            this.conc___ne = conc___ne;
            return this;
        }

        public Builder setConc___null(Boolean conc___null) {
            this.conc___null = conc___null;
            return this;
        }

        public Builder setConc___not___null(Boolean conc___not___null) {
            this.conc___not___null = conc___not___null;
            return this;
        }

        public Builder setConc___in(java.util.List<String> conc___in) {
            this.conc___in = conc___in;
            return this;
        }

        public Builder setConc___not___in(java.util.List<String> conc___not___in) {
            this.conc___not___in = conc___not___in;
            return this;
        }

        public Builder setConc___lt(String conc___lt) {
            this.conc___lt = conc___lt;
            return this;
        }

        public Builder setConc___lte(String conc___lte) {
            this.conc___lte = conc___lte;
            return this;
        }

        public Builder setConc___gt(String conc___gt) {
            this.conc___gt = conc___gt;
            return this;
        }

        public Builder setConc___gte(String conc___gte) {
            this.conc___gte = conc___gte;
            return this;
        }

        public Builder setConc___contains(String conc___contains) {
            this.conc___contains = conc___contains;
            return this;
        }

        public Builder setConc___not___contains(String conc___not___contains) {
            this.conc___not___contains = conc___not___contains;
            return this;
        }

        public Builder setConc___starts_with(String conc___starts_with) {
            this.conc___starts_with = conc___starts_with;
            return this;
        }

        public Builder setConc___not___starts_with(String conc___not___starts_with) {
            this.conc___not___starts_with = conc___not___starts_with;
            return this;
        }

        public Builder setConc___ends_with(String conc___ends_with) {
            this.conc___ends_with = conc___ends_with;
            return this;
        }

        public Builder setConc___not___ends_with(String conc___not___ends_with) {
            this.conc___not___ends_with = conc___not___ends_with;
            return this;
        }

        public Builder setDomande_associate___eq(Integer domande_associate___eq) {
            this.domande_associate___eq = domande_associate___eq;
            return this;
        }

        public Builder setDomande_associate___ne(Integer domande_associate___ne) {
            this.domande_associate___ne = domande_associate___ne;
            return this;
        }

        public Builder setDomande_associate___null(Boolean domande_associate___null) {
            this.domande_associate___null = domande_associate___null;
            return this;
        }

        public Builder setDomande_associate___not___null(Boolean domande_associate___not___null) {
            this.domande_associate___not___null = domande_associate___not___null;
            return this;
        }

        public Builder setDomande_associate___in(java.util.List<Integer> domande_associate___in) {
            this.domande_associate___in = domande_associate___in;
            return this;
        }

        public Builder setDomande_associate___not___in(java.util.List<Integer> domande_associate___not___in) {
            this.domande_associate___not___in = domande_associate___not___in;
            return this;
        }

        public Builder setDomande_associate___lt(Integer domande_associate___lt) {
            this.domande_associate___lt = domande_associate___lt;
            return this;
        }

        public Builder setDomande_associate___lte(Integer domande_associate___lte) {
            this.domande_associate___lte = domande_associate___lte;
            return this;
        }

        public Builder setDomande_associate___gt(Integer domande_associate___gt) {
            this.domande_associate___gt = domande_associate___gt;
            return this;
        }

        public Builder setDomande_associate___gte(Integer domande_associate___gte) {
            this.domande_associate___gte = domande_associate___gte;
            return this;
        }

        public Builder setDomande_associate_ids___eq(String domande_associate_ids___eq) {
            this.domande_associate_ids___eq = domande_associate_ids___eq;
            return this;
        }

        public Builder setDomande_associate_ids___ne(String domande_associate_ids___ne) {
            this.domande_associate_ids___ne = domande_associate_ids___ne;
            return this;
        }

        public Builder setDomande_associate_ids___null(Boolean domande_associate_ids___null) {
            this.domande_associate_ids___null = domande_associate_ids___null;
            return this;
        }

        public Builder setDomande_associate_ids___not___null(Boolean domande_associate_ids___not___null) {
            this.domande_associate_ids___not___null = domande_associate_ids___not___null;
            return this;
        }

        public Builder setDomande_associate_ids___in(java.util.List<String> domande_associate_ids___in) {
            this.domande_associate_ids___in = domande_associate_ids___in;
            return this;
        }

        public Builder setDomande_associate_ids___not___in(java.util.List<String> domande_associate_ids___not___in) {
            this.domande_associate_ids___not___in = domande_associate_ids___not___in;
            return this;
        }

        public Builder setDomande_associate_ids___lt(String domande_associate_ids___lt) {
            this.domande_associate_ids___lt = domande_associate_ids___lt;
            return this;
        }

        public Builder setDomande_associate_ids___lte(String domande_associate_ids___lte) {
            this.domande_associate_ids___lte = domande_associate_ids___lte;
            return this;
        }

        public Builder setDomande_associate_ids___gt(String domande_associate_ids___gt) {
            this.domande_associate_ids___gt = domande_associate_ids___gt;
            return this;
        }

        public Builder setDomande_associate_ids___gte(String domande_associate_ids___gte) {
            this.domande_associate_ids___gte = domande_associate_ids___gte;
            return this;
        }

        public Builder setDomande_associate_ids___contains(String domande_associate_ids___contains) {
            this.domande_associate_ids___contains = domande_associate_ids___contains;
            return this;
        }

        public Builder setDomande_associate_ids___not___contains(String domande_associate_ids___not___contains) {
            this.domande_associate_ids___not___contains = domande_associate_ids___not___contains;
            return this;
        }

        public Builder setDomande_associate_ids___starts_with(String domande_associate_ids___starts_with) {
            this.domande_associate_ids___starts_with = domande_associate_ids___starts_with;
            return this;
        }

        public Builder setDomande_associate_ids___not___starts_with(String domande_associate_ids___not___starts_with) {
            this.domande_associate_ids___not___starts_with = domande_associate_ids___not___starts_with;
            return this;
        }

        public Builder setDomande_associate_ids___ends_with(String domande_associate_ids___ends_with) {
            this.domande_associate_ids___ends_with = domande_associate_ids___ends_with;
            return this;
        }

        public Builder setDomande_associate_ids___not___ends_with(String domande_associate_ids___not___ends_with) {
            this.domande_associate_ids___not___ends_with = domande_associate_ids___not___ends_with;
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

        public Builder setPunteggio___eq(String punteggio___eq) {
            this.punteggio___eq = punteggio___eq;
            return this;
        }

        public Builder setPunteggio___ne(String punteggio___ne) {
            this.punteggio___ne = punteggio___ne;
            return this;
        }

        public Builder setPunteggio___null(Boolean punteggio___null) {
            this.punteggio___null = punteggio___null;
            return this;
        }

        public Builder setPunteggio___not___null(Boolean punteggio___not___null) {
            this.punteggio___not___null = punteggio___not___null;
            return this;
        }

        public Builder setPunteggio___in(java.util.List<String> punteggio___in) {
            this.punteggio___in = punteggio___in;
            return this;
        }

        public Builder setPunteggio___not___in(java.util.List<String> punteggio___not___in) {
            this.punteggio___not___in = punteggio___not___in;
            return this;
        }

        public Builder setPunteggio___lt(String punteggio___lt) {
            this.punteggio___lt = punteggio___lt;
            return this;
        }

        public Builder setPunteggio___lte(String punteggio___lte) {
            this.punteggio___lte = punteggio___lte;
            return this;
        }

        public Builder setPunteggio___gt(String punteggio___gt) {
            this.punteggio___gt = punteggio___gt;
            return this;
        }

        public Builder setPunteggio___gte(String punteggio___gte) {
            this.punteggio___gte = punteggio___gte;
            return this;
        }

        public Builder setRisposte_associate___eq(Integer risposte_associate___eq) {
            this.risposte_associate___eq = risposte_associate___eq;
            return this;
        }

        public Builder setRisposte_associate___ne(Integer risposte_associate___ne) {
            this.risposte_associate___ne = risposte_associate___ne;
            return this;
        }

        public Builder setRisposte_associate___null(Boolean risposte_associate___null) {
            this.risposte_associate___null = risposte_associate___null;
            return this;
        }

        public Builder setRisposte_associate___not___null(Boolean risposte_associate___not___null) {
            this.risposte_associate___not___null = risposte_associate___not___null;
            return this;
        }

        public Builder setRisposte_associate___in(java.util.List<Integer> risposte_associate___in) {
            this.risposte_associate___in = risposte_associate___in;
            return this;
        }

        public Builder setRisposte_associate___not___in(java.util.List<Integer> risposte_associate___not___in) {
            this.risposte_associate___not___in = risposte_associate___not___in;
            return this;
        }

        public Builder setRisposte_associate___lt(Integer risposte_associate___lt) {
            this.risposte_associate___lt = risposte_associate___lt;
            return this;
        }

        public Builder setRisposte_associate___lte(Integer risposte_associate___lte) {
            this.risposte_associate___lte = risposte_associate___lte;
            return this;
        }

        public Builder setRisposte_associate___gt(Integer risposte_associate___gt) {
            this.risposte_associate___gt = risposte_associate___gt;
            return this;
        }

        public Builder setRisposte_associate___gte(Integer risposte_associate___gte) {
            this.risposte_associate___gte = risposte_associate___gte;
            return this;
        }

        public Builder setRisposte_associate_ids___eq(String risposte_associate_ids___eq) {
            this.risposte_associate_ids___eq = risposte_associate_ids___eq;
            return this;
        }

        public Builder setRisposte_associate_ids___ne(String risposte_associate_ids___ne) {
            this.risposte_associate_ids___ne = risposte_associate_ids___ne;
            return this;
        }

        public Builder setRisposte_associate_ids___null(Boolean risposte_associate_ids___null) {
            this.risposte_associate_ids___null = risposte_associate_ids___null;
            return this;
        }

        public Builder setRisposte_associate_ids___not___null(Boolean risposte_associate_ids___not___null) {
            this.risposte_associate_ids___not___null = risposte_associate_ids___not___null;
            return this;
        }

        public Builder setRisposte_associate_ids___in(java.util.List<String> risposte_associate_ids___in) {
            this.risposte_associate_ids___in = risposte_associate_ids___in;
            return this;
        }

        public Builder setRisposte_associate_ids___not___in(java.util.List<String> risposte_associate_ids___not___in) {
            this.risposte_associate_ids___not___in = risposte_associate_ids___not___in;
            return this;
        }

        public Builder setRisposte_associate_ids___lt(String risposte_associate_ids___lt) {
            this.risposte_associate_ids___lt = risposte_associate_ids___lt;
            return this;
        }

        public Builder setRisposte_associate_ids___lte(String risposte_associate_ids___lte) {
            this.risposte_associate_ids___lte = risposte_associate_ids___lte;
            return this;
        }

        public Builder setRisposte_associate_ids___gt(String risposte_associate_ids___gt) {
            this.risposte_associate_ids___gt = risposte_associate_ids___gt;
            return this;
        }

        public Builder setRisposte_associate_ids___gte(String risposte_associate_ids___gte) {
            this.risposte_associate_ids___gte = risposte_associate_ids___gte;
            return this;
        }

        public Builder setRisposte_associate_ids___contains(String risposte_associate_ids___contains) {
            this.risposte_associate_ids___contains = risposte_associate_ids___contains;
            return this;
        }

        public Builder setRisposte_associate_ids___not___contains(String risposte_associate_ids___not___contains) {
            this.risposte_associate_ids___not___contains = risposte_associate_ids___not___contains;
            return this;
        }

        public Builder setRisposte_associate_ids___starts_with(String risposte_associate_ids___starts_with) {
            this.risposte_associate_ids___starts_with = risposte_associate_ids___starts_with;
            return this;
        }

        public Builder setRisposte_associate_ids___not___starts_with(String risposte_associate_ids___not___starts_with) {
            this.risposte_associate_ids___not___starts_with = risposte_associate_ids___not___starts_with;
            return this;
        }

        public Builder setRisposte_associate_ids___ends_with(String risposte_associate_ids___ends_with) {
            this.risposte_associate_ids___ends_with = risposte_associate_ids___ends_with;
            return this;
        }

        public Builder setRisposte_associate_ids___not___ends_with(String risposte_associate_ids___not___ends_with) {
            this.risposte_associate_ids___not___ends_with = risposte_associate_ids___not___ends_with;
            return this;
        }

        public Builder setTesto___eq(String testo___eq) {
            this.testo___eq = testo___eq;
            return this;
        }

        public Builder setTesto___ne(String testo___ne) {
            this.testo___ne = testo___ne;
            return this;
        }

        public Builder setTesto___null(Boolean testo___null) {
            this.testo___null = testo___null;
            return this;
        }

        public Builder setTesto___not___null(Boolean testo___not___null) {
            this.testo___not___null = testo___not___null;
            return this;
        }

        public Builder setTesto___in(java.util.List<String> testo___in) {
            this.testo___in = testo___in;
            return this;
        }

        public Builder setTesto___not___in(java.util.List<String> testo___not___in) {
            this.testo___not___in = testo___not___in;
            return this;
        }

        public Builder setTesto___lt(String testo___lt) {
            this.testo___lt = testo___lt;
            return this;
        }

        public Builder setTesto___lte(String testo___lte) {
            this.testo___lte = testo___lte;
            return this;
        }

        public Builder setTesto___gt(String testo___gt) {
            this.testo___gt = testo___gt;
            return this;
        }

        public Builder setTesto___gte(String testo___gte) {
            this.testo___gte = testo___gte;
            return this;
        }

        public Builder setTesto___contains(String testo___contains) {
            this.testo___contains = testo___contains;
            return this;
        }

        public Builder setTesto___not___contains(String testo___not___contains) {
            this.testo___not___contains = testo___not___contains;
            return this;
        }

        public Builder setTesto___starts_with(String testo___starts_with) {
            this.testo___starts_with = testo___starts_with;
            return this;
        }

        public Builder setTesto___not___starts_with(String testo___not___starts_with) {
            this.testo___not___starts_with = testo___not___starts_with;
            return this;
        }

        public Builder setTesto___ends_with(String testo___ends_with) {
            this.testo___ends_with = testo___ends_with;
            return this;
        }

        public Builder setTesto___not___ends_with(String testo___not___ends_with) {
            this.testo___not___ends_with = testo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliRisposta_possibileFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliRisposta_possibileFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliRisposta_possibileFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliRisposta_possibileFilterDTO build() {
            CliRisposta_possibileFilterDTO result = new CliRisposta_possibileFilterDTO();
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
            result.setConc___eq(this.conc___eq);
            result.setConc___ne(this.conc___ne);
            result.setConc___null(this.conc___null);
            result.setConc___not___null(this.conc___not___null);
            result.setConc___in(this.conc___in);
            result.setConc___not___in(this.conc___not___in);
            result.setConc___lt(this.conc___lt);
            result.setConc___lte(this.conc___lte);
            result.setConc___gt(this.conc___gt);
            result.setConc___gte(this.conc___gte);
            result.setConc___contains(this.conc___contains);
            result.setConc___not___contains(this.conc___not___contains);
            result.setConc___starts_with(this.conc___starts_with);
            result.setConc___not___starts_with(this.conc___not___starts_with);
            result.setConc___ends_with(this.conc___ends_with);
            result.setConc___not___ends_with(this.conc___not___ends_with);
            result.setDomande_associate___eq(this.domande_associate___eq);
            result.setDomande_associate___ne(this.domande_associate___ne);
            result.setDomande_associate___null(this.domande_associate___null);
            result.setDomande_associate___not___null(this.domande_associate___not___null);
            result.setDomande_associate___in(this.domande_associate___in);
            result.setDomande_associate___not___in(this.domande_associate___not___in);
            result.setDomande_associate___lt(this.domande_associate___lt);
            result.setDomande_associate___lte(this.domande_associate___lte);
            result.setDomande_associate___gt(this.domande_associate___gt);
            result.setDomande_associate___gte(this.domande_associate___gte);
            result.setDomande_associate_ids___eq(this.domande_associate_ids___eq);
            result.setDomande_associate_ids___ne(this.domande_associate_ids___ne);
            result.setDomande_associate_ids___null(this.domande_associate_ids___null);
            result.setDomande_associate_ids___not___null(this.domande_associate_ids___not___null);
            result.setDomande_associate_ids___in(this.domande_associate_ids___in);
            result.setDomande_associate_ids___not___in(this.domande_associate_ids___not___in);
            result.setDomande_associate_ids___lt(this.domande_associate_ids___lt);
            result.setDomande_associate_ids___lte(this.domande_associate_ids___lte);
            result.setDomande_associate_ids___gt(this.domande_associate_ids___gt);
            result.setDomande_associate_ids___gte(this.domande_associate_ids___gte);
            result.setDomande_associate_ids___contains(this.domande_associate_ids___contains);
            result.setDomande_associate_ids___not___contains(this.domande_associate_ids___not___contains);
            result.setDomande_associate_ids___starts_with(this.domande_associate_ids___starts_with);
            result.setDomande_associate_ids___not___starts_with(this.domande_associate_ids___not___starts_with);
            result.setDomande_associate_ids___ends_with(this.domande_associate_ids___ends_with);
            result.setDomande_associate_ids___not___ends_with(this.domande_associate_ids___not___ends_with);
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
            result.setPunteggio___eq(this.punteggio___eq);
            result.setPunteggio___ne(this.punteggio___ne);
            result.setPunteggio___null(this.punteggio___null);
            result.setPunteggio___not___null(this.punteggio___not___null);
            result.setPunteggio___in(this.punteggio___in);
            result.setPunteggio___not___in(this.punteggio___not___in);
            result.setPunteggio___lt(this.punteggio___lt);
            result.setPunteggio___lte(this.punteggio___lte);
            result.setPunteggio___gt(this.punteggio___gt);
            result.setPunteggio___gte(this.punteggio___gte);
            result.setRisposte_associate___eq(this.risposte_associate___eq);
            result.setRisposte_associate___ne(this.risposte_associate___ne);
            result.setRisposte_associate___null(this.risposte_associate___null);
            result.setRisposte_associate___not___null(this.risposte_associate___not___null);
            result.setRisposte_associate___in(this.risposte_associate___in);
            result.setRisposte_associate___not___in(this.risposte_associate___not___in);
            result.setRisposte_associate___lt(this.risposte_associate___lt);
            result.setRisposte_associate___lte(this.risposte_associate___lte);
            result.setRisposte_associate___gt(this.risposte_associate___gt);
            result.setRisposte_associate___gte(this.risposte_associate___gte);
            result.setRisposte_associate_ids___eq(this.risposte_associate_ids___eq);
            result.setRisposte_associate_ids___ne(this.risposte_associate_ids___ne);
            result.setRisposte_associate_ids___null(this.risposte_associate_ids___null);
            result.setRisposte_associate_ids___not___null(this.risposte_associate_ids___not___null);
            result.setRisposte_associate_ids___in(this.risposte_associate_ids___in);
            result.setRisposte_associate_ids___not___in(this.risposte_associate_ids___not___in);
            result.setRisposte_associate_ids___lt(this.risposte_associate_ids___lt);
            result.setRisposte_associate_ids___lte(this.risposte_associate_ids___lte);
            result.setRisposte_associate_ids___gt(this.risposte_associate_ids___gt);
            result.setRisposte_associate_ids___gte(this.risposte_associate_ids___gte);
            result.setRisposte_associate_ids___contains(this.risposte_associate_ids___contains);
            result.setRisposte_associate_ids___not___contains(this.risposte_associate_ids___not___contains);
            result.setRisposte_associate_ids___starts_with(this.risposte_associate_ids___starts_with);
            result.setRisposte_associate_ids___not___starts_with(this.risposte_associate_ids___not___starts_with);
            result.setRisposte_associate_ids___ends_with(this.risposte_associate_ids___ends_with);
            result.setRisposte_associate_ids___not___ends_with(this.risposte_associate_ids___not___ends_with);
            result.setTesto___eq(this.testo___eq);
            result.setTesto___ne(this.testo___ne);
            result.setTesto___null(this.testo___null);
            result.setTesto___not___null(this.testo___not___null);
            result.setTesto___in(this.testo___in);
            result.setTesto___not___in(this.testo___not___in);
            result.setTesto___lt(this.testo___lt);
            result.setTesto___lte(this.testo___lte);
            result.setTesto___gt(this.testo___gt);
            result.setTesto___gte(this.testo___gte);
            result.setTesto___contains(this.testo___contains);
            result.setTesto___not___contains(this.testo___not___contains);
            result.setTesto___starts_with(this.testo___starts_with);
            result.setTesto___not___starts_with(this.testo___not___starts_with);
            result.setTesto___ends_with(this.testo___ends_with);
            result.setTesto___not___ends_with(this.testo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
