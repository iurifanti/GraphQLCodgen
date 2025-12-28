package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type L_dettaglio.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliL_dettaglioFilterDTO implements java.io.Serializable {

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
    private Boolean altezza___eq;
    private Boolean altezza___ne;
    private Boolean altezza___null;
    private Boolean altezza___not___null;
    private Boolean chimica___eq;
    private Boolean chimica___ne;
    private Boolean chimica___null;
    private Boolean chimica___not___null;
    private String data___eq;
    private String data___ne;
    private Boolean data___null;
    private Boolean data___not___null;
    private java.util.List<String> data___in;
    private java.util.List<String> data___not___in;
    private String data___lt;
    private String data___lte;
    private String data___gt;
    private String data___gte;
    private Boolean eventi_clinici___eq;
    private Boolean eventi_clinici___ne;
    private Boolean eventi_clinici___null;
    private Boolean eventi_clinici___not___null;
    private Boolean flag_altezza___eq;
    private Boolean flag_altezza___ne;
    private Boolean flag_altezza___null;
    private Boolean flag_altezza___not___null;
    private Boolean flag_chimica___eq;
    private Boolean flag_chimica___ne;
    private Boolean flag_chimica___null;
    private Boolean flag_chimica___not___null;
    private Boolean flag_eventi_clinici___eq;
    private Boolean flag_eventi_clinici___ne;
    private Boolean flag_eventi_clinici___null;
    private Boolean flag_eventi_clinici___not___null;
    private Boolean flag_peso___eq;
    private Boolean flag_peso___ne;
    private Boolean flag_peso___null;
    private Boolean flag_peso___not___null;
    private Boolean flag_plasma_raccolto___eq;
    private Boolean flag_plasma_raccolto___ne;
    private Boolean flag_plasma_raccolto___null;
    private Boolean flag_plasma_raccolto___not___null;
    private Boolean flag_presentato___eq;
    private Boolean flag_presentato___ne;
    private Boolean flag_presentato___null;
    private Boolean flag_presentato___not___null;
    private Boolean flag_questionari___eq;
    private Boolean flag_questionari___ne;
    private Boolean flag_questionari___null;
    private Boolean flag_questionari___not___null;
    private Boolean flag_sangue_intero_raccolto___eq;
    private Boolean flag_sangue_intero_raccolto___ne;
    private Boolean flag_sangue_intero_raccolto___null;
    private Boolean flag_sangue_intero_raccolto___not___null;
    private Boolean flag_viro_immun___eq;
    private Boolean flag_viro_immun___ne;
    private Boolean flag_viro_immun___null;
    private Boolean flag_viro_immun___not___null;
    private Integer mese___eq;
    private Integer mese___ne;
    private Boolean mese___null;
    private Boolean mese___not___null;
    private java.util.List<Integer> mese___in;
    private java.util.List<Integer> mese___not___in;
    private Integer mese___lt;
    private Integer mese___lte;
    private Integer mese___gt;
    private Integer mese___gte;
    private Boolean peso___eq;
    private Boolean peso___ne;
    private Boolean peso___null;
    private Boolean peso___not___null;
    private Boolean plasma_raccolto___eq;
    private Boolean plasma_raccolto___ne;
    private Boolean plasma_raccolto___null;
    private Boolean plasma_raccolto___not___null;
    private Boolean presentato___eq;
    private Boolean presentato___ne;
    private Boolean presentato___null;
    private Boolean presentato___not___null;
    private Boolean questionari___eq;
    private Boolean questionari___ne;
    private Boolean questionari___null;
    private Boolean questionari___not___null;
    private Boolean sangue_intero_raccolto___eq;
    private Boolean sangue_intero_raccolto___ne;
    private Boolean sangue_intero_raccolto___null;
    private Boolean sangue_intero_raccolto___not___null;
    private String tempo_visita___eq;
    private String tempo_visita___ne;
    private Boolean tempo_visita___null;
    private Boolean tempo_visita___not___null;
    private java.util.List<String> tempo_visita___in;
    private java.util.List<String> tempo_visita___not___in;
    private String tempo_visita___lt;
    private String tempo_visita___lte;
    private String tempo_visita___gt;
    private String tempo_visita___gte;
    private String tempo_visita___contains;
    private String tempo_visita___not___contains;
    private String tempo_visita___starts_with;
    private String tempo_visita___not___starts_with;
    private String tempo_visita___ends_with;
    private String tempo_visita___not___ends_with;
    private Boolean viro_immun___eq;
    private Boolean viro_immun___ne;
    private Boolean viro_immun___null;
    private Boolean viro_immun___not___null;
    private java.util.List<CliL_dettaglioFilterDTO> AND;
    private java.util.List<CliL_dettaglioFilterDTO> OR;
    private CliL_dettaglioFilterDTO NOT;

    public CliL_dettaglioFilterDTO() {
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

    public Boolean getAltezza___eq() {
        return altezza___eq;
    }
    public void setAltezza___eq(Boolean altezza___eq) {
        this.altezza___eq = altezza___eq;
    }

    public Boolean getAltezza___ne() {
        return altezza___ne;
    }
    public void setAltezza___ne(Boolean altezza___ne) {
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

    public Boolean getChimica___eq() {
        return chimica___eq;
    }
    public void setChimica___eq(Boolean chimica___eq) {
        this.chimica___eq = chimica___eq;
    }

    public Boolean getChimica___ne() {
        return chimica___ne;
    }
    public void setChimica___ne(Boolean chimica___ne) {
        this.chimica___ne = chimica___ne;
    }

    public Boolean getChimica___null() {
        return chimica___null;
    }
    public void setChimica___null(Boolean chimica___null) {
        this.chimica___null = chimica___null;
    }

    public Boolean getChimica___not___null() {
        return chimica___not___null;
    }
    public void setChimica___not___null(Boolean chimica___not___null) {
        this.chimica___not___null = chimica___not___null;
    }

    public String getData___eq() {
        return data___eq;
    }
    public void setData___eq(String data___eq) {
        this.data___eq = data___eq;
    }

    public String getData___ne() {
        return data___ne;
    }
    public void setData___ne(String data___ne) {
        this.data___ne = data___ne;
    }

    public Boolean getData___null() {
        return data___null;
    }
    public void setData___null(Boolean data___null) {
        this.data___null = data___null;
    }

    public Boolean getData___not___null() {
        return data___not___null;
    }
    public void setData___not___null(Boolean data___not___null) {
        this.data___not___null = data___not___null;
    }

    public java.util.List<String> getData___in() {
        return data___in;
    }
    public void setData___in(java.util.List<String> data___in) {
        this.data___in = data___in;
    }

    public java.util.List<String> getData___not___in() {
        return data___not___in;
    }
    public void setData___not___in(java.util.List<String> data___not___in) {
        this.data___not___in = data___not___in;
    }

    public String getData___lt() {
        return data___lt;
    }
    public void setData___lt(String data___lt) {
        this.data___lt = data___lt;
    }

    public String getData___lte() {
        return data___lte;
    }
    public void setData___lte(String data___lte) {
        this.data___lte = data___lte;
    }

    public String getData___gt() {
        return data___gt;
    }
    public void setData___gt(String data___gt) {
        this.data___gt = data___gt;
    }

    public String getData___gte() {
        return data___gte;
    }
    public void setData___gte(String data___gte) {
        this.data___gte = data___gte;
    }

    public Boolean getEventi_clinici___eq() {
        return eventi_clinici___eq;
    }
    public void setEventi_clinici___eq(Boolean eventi_clinici___eq) {
        this.eventi_clinici___eq = eventi_clinici___eq;
    }

    public Boolean getEventi_clinici___ne() {
        return eventi_clinici___ne;
    }
    public void setEventi_clinici___ne(Boolean eventi_clinici___ne) {
        this.eventi_clinici___ne = eventi_clinici___ne;
    }

    public Boolean getEventi_clinici___null() {
        return eventi_clinici___null;
    }
    public void setEventi_clinici___null(Boolean eventi_clinici___null) {
        this.eventi_clinici___null = eventi_clinici___null;
    }

    public Boolean getEventi_clinici___not___null() {
        return eventi_clinici___not___null;
    }
    public void setEventi_clinici___not___null(Boolean eventi_clinici___not___null) {
        this.eventi_clinici___not___null = eventi_clinici___not___null;
    }

    public Boolean getFlag_altezza___eq() {
        return flag_altezza___eq;
    }
    public void setFlag_altezza___eq(Boolean flag_altezza___eq) {
        this.flag_altezza___eq = flag_altezza___eq;
    }

    public Boolean getFlag_altezza___ne() {
        return flag_altezza___ne;
    }
    public void setFlag_altezza___ne(Boolean flag_altezza___ne) {
        this.flag_altezza___ne = flag_altezza___ne;
    }

    public Boolean getFlag_altezza___null() {
        return flag_altezza___null;
    }
    public void setFlag_altezza___null(Boolean flag_altezza___null) {
        this.flag_altezza___null = flag_altezza___null;
    }

    public Boolean getFlag_altezza___not___null() {
        return flag_altezza___not___null;
    }
    public void setFlag_altezza___not___null(Boolean flag_altezza___not___null) {
        this.flag_altezza___not___null = flag_altezza___not___null;
    }

    public Boolean getFlag_chimica___eq() {
        return flag_chimica___eq;
    }
    public void setFlag_chimica___eq(Boolean flag_chimica___eq) {
        this.flag_chimica___eq = flag_chimica___eq;
    }

    public Boolean getFlag_chimica___ne() {
        return flag_chimica___ne;
    }
    public void setFlag_chimica___ne(Boolean flag_chimica___ne) {
        this.flag_chimica___ne = flag_chimica___ne;
    }

    public Boolean getFlag_chimica___null() {
        return flag_chimica___null;
    }
    public void setFlag_chimica___null(Boolean flag_chimica___null) {
        this.flag_chimica___null = flag_chimica___null;
    }

    public Boolean getFlag_chimica___not___null() {
        return flag_chimica___not___null;
    }
    public void setFlag_chimica___not___null(Boolean flag_chimica___not___null) {
        this.flag_chimica___not___null = flag_chimica___not___null;
    }

    public Boolean getFlag_eventi_clinici___eq() {
        return flag_eventi_clinici___eq;
    }
    public void setFlag_eventi_clinici___eq(Boolean flag_eventi_clinici___eq) {
        this.flag_eventi_clinici___eq = flag_eventi_clinici___eq;
    }

    public Boolean getFlag_eventi_clinici___ne() {
        return flag_eventi_clinici___ne;
    }
    public void setFlag_eventi_clinici___ne(Boolean flag_eventi_clinici___ne) {
        this.flag_eventi_clinici___ne = flag_eventi_clinici___ne;
    }

    public Boolean getFlag_eventi_clinici___null() {
        return flag_eventi_clinici___null;
    }
    public void setFlag_eventi_clinici___null(Boolean flag_eventi_clinici___null) {
        this.flag_eventi_clinici___null = flag_eventi_clinici___null;
    }

    public Boolean getFlag_eventi_clinici___not___null() {
        return flag_eventi_clinici___not___null;
    }
    public void setFlag_eventi_clinici___not___null(Boolean flag_eventi_clinici___not___null) {
        this.flag_eventi_clinici___not___null = flag_eventi_clinici___not___null;
    }

    public Boolean getFlag_peso___eq() {
        return flag_peso___eq;
    }
    public void setFlag_peso___eq(Boolean flag_peso___eq) {
        this.flag_peso___eq = flag_peso___eq;
    }

    public Boolean getFlag_peso___ne() {
        return flag_peso___ne;
    }
    public void setFlag_peso___ne(Boolean flag_peso___ne) {
        this.flag_peso___ne = flag_peso___ne;
    }

    public Boolean getFlag_peso___null() {
        return flag_peso___null;
    }
    public void setFlag_peso___null(Boolean flag_peso___null) {
        this.flag_peso___null = flag_peso___null;
    }

    public Boolean getFlag_peso___not___null() {
        return flag_peso___not___null;
    }
    public void setFlag_peso___not___null(Boolean flag_peso___not___null) {
        this.flag_peso___not___null = flag_peso___not___null;
    }

    public Boolean getFlag_plasma_raccolto___eq() {
        return flag_plasma_raccolto___eq;
    }
    public void setFlag_plasma_raccolto___eq(Boolean flag_plasma_raccolto___eq) {
        this.flag_plasma_raccolto___eq = flag_plasma_raccolto___eq;
    }

    public Boolean getFlag_plasma_raccolto___ne() {
        return flag_plasma_raccolto___ne;
    }
    public void setFlag_plasma_raccolto___ne(Boolean flag_plasma_raccolto___ne) {
        this.flag_plasma_raccolto___ne = flag_plasma_raccolto___ne;
    }

    public Boolean getFlag_plasma_raccolto___null() {
        return flag_plasma_raccolto___null;
    }
    public void setFlag_plasma_raccolto___null(Boolean flag_plasma_raccolto___null) {
        this.flag_plasma_raccolto___null = flag_plasma_raccolto___null;
    }

    public Boolean getFlag_plasma_raccolto___not___null() {
        return flag_plasma_raccolto___not___null;
    }
    public void setFlag_plasma_raccolto___not___null(Boolean flag_plasma_raccolto___not___null) {
        this.flag_plasma_raccolto___not___null = flag_plasma_raccolto___not___null;
    }

    public Boolean getFlag_presentato___eq() {
        return flag_presentato___eq;
    }
    public void setFlag_presentato___eq(Boolean flag_presentato___eq) {
        this.flag_presentato___eq = flag_presentato___eq;
    }

    public Boolean getFlag_presentato___ne() {
        return flag_presentato___ne;
    }
    public void setFlag_presentato___ne(Boolean flag_presentato___ne) {
        this.flag_presentato___ne = flag_presentato___ne;
    }

    public Boolean getFlag_presentato___null() {
        return flag_presentato___null;
    }
    public void setFlag_presentato___null(Boolean flag_presentato___null) {
        this.flag_presentato___null = flag_presentato___null;
    }

    public Boolean getFlag_presentato___not___null() {
        return flag_presentato___not___null;
    }
    public void setFlag_presentato___not___null(Boolean flag_presentato___not___null) {
        this.flag_presentato___not___null = flag_presentato___not___null;
    }

    public Boolean getFlag_questionari___eq() {
        return flag_questionari___eq;
    }
    public void setFlag_questionari___eq(Boolean flag_questionari___eq) {
        this.flag_questionari___eq = flag_questionari___eq;
    }

    public Boolean getFlag_questionari___ne() {
        return flag_questionari___ne;
    }
    public void setFlag_questionari___ne(Boolean flag_questionari___ne) {
        this.flag_questionari___ne = flag_questionari___ne;
    }

    public Boolean getFlag_questionari___null() {
        return flag_questionari___null;
    }
    public void setFlag_questionari___null(Boolean flag_questionari___null) {
        this.flag_questionari___null = flag_questionari___null;
    }

    public Boolean getFlag_questionari___not___null() {
        return flag_questionari___not___null;
    }
    public void setFlag_questionari___not___null(Boolean flag_questionari___not___null) {
        this.flag_questionari___not___null = flag_questionari___not___null;
    }

    public Boolean getFlag_sangue_intero_raccolto___eq() {
        return flag_sangue_intero_raccolto___eq;
    }
    public void setFlag_sangue_intero_raccolto___eq(Boolean flag_sangue_intero_raccolto___eq) {
        this.flag_sangue_intero_raccolto___eq = flag_sangue_intero_raccolto___eq;
    }

    public Boolean getFlag_sangue_intero_raccolto___ne() {
        return flag_sangue_intero_raccolto___ne;
    }
    public void setFlag_sangue_intero_raccolto___ne(Boolean flag_sangue_intero_raccolto___ne) {
        this.flag_sangue_intero_raccolto___ne = flag_sangue_intero_raccolto___ne;
    }

    public Boolean getFlag_sangue_intero_raccolto___null() {
        return flag_sangue_intero_raccolto___null;
    }
    public void setFlag_sangue_intero_raccolto___null(Boolean flag_sangue_intero_raccolto___null) {
        this.flag_sangue_intero_raccolto___null = flag_sangue_intero_raccolto___null;
    }

    public Boolean getFlag_sangue_intero_raccolto___not___null() {
        return flag_sangue_intero_raccolto___not___null;
    }
    public void setFlag_sangue_intero_raccolto___not___null(Boolean flag_sangue_intero_raccolto___not___null) {
        this.flag_sangue_intero_raccolto___not___null = flag_sangue_intero_raccolto___not___null;
    }

    public Boolean getFlag_viro_immun___eq() {
        return flag_viro_immun___eq;
    }
    public void setFlag_viro_immun___eq(Boolean flag_viro_immun___eq) {
        this.flag_viro_immun___eq = flag_viro_immun___eq;
    }

    public Boolean getFlag_viro_immun___ne() {
        return flag_viro_immun___ne;
    }
    public void setFlag_viro_immun___ne(Boolean flag_viro_immun___ne) {
        this.flag_viro_immun___ne = flag_viro_immun___ne;
    }

    public Boolean getFlag_viro_immun___null() {
        return flag_viro_immun___null;
    }
    public void setFlag_viro_immun___null(Boolean flag_viro_immun___null) {
        this.flag_viro_immun___null = flag_viro_immun___null;
    }

    public Boolean getFlag_viro_immun___not___null() {
        return flag_viro_immun___not___null;
    }
    public void setFlag_viro_immun___not___null(Boolean flag_viro_immun___not___null) {
        this.flag_viro_immun___not___null = flag_viro_immun___not___null;
    }

    public Integer getMese___eq() {
        return mese___eq;
    }
    public void setMese___eq(Integer mese___eq) {
        this.mese___eq = mese___eq;
    }

    public Integer getMese___ne() {
        return mese___ne;
    }
    public void setMese___ne(Integer mese___ne) {
        this.mese___ne = mese___ne;
    }

    public Boolean getMese___null() {
        return mese___null;
    }
    public void setMese___null(Boolean mese___null) {
        this.mese___null = mese___null;
    }

    public Boolean getMese___not___null() {
        return mese___not___null;
    }
    public void setMese___not___null(Boolean mese___not___null) {
        this.mese___not___null = mese___not___null;
    }

    public java.util.List<Integer> getMese___in() {
        return mese___in;
    }
    public void setMese___in(java.util.List<Integer> mese___in) {
        this.mese___in = mese___in;
    }

    public java.util.List<Integer> getMese___not___in() {
        return mese___not___in;
    }
    public void setMese___not___in(java.util.List<Integer> mese___not___in) {
        this.mese___not___in = mese___not___in;
    }

    public Integer getMese___lt() {
        return mese___lt;
    }
    public void setMese___lt(Integer mese___lt) {
        this.mese___lt = mese___lt;
    }

    public Integer getMese___lte() {
        return mese___lte;
    }
    public void setMese___lte(Integer mese___lte) {
        this.mese___lte = mese___lte;
    }

    public Integer getMese___gt() {
        return mese___gt;
    }
    public void setMese___gt(Integer mese___gt) {
        this.mese___gt = mese___gt;
    }

    public Integer getMese___gte() {
        return mese___gte;
    }
    public void setMese___gte(Integer mese___gte) {
        this.mese___gte = mese___gte;
    }

    public Boolean getPeso___eq() {
        return peso___eq;
    }
    public void setPeso___eq(Boolean peso___eq) {
        this.peso___eq = peso___eq;
    }

    public Boolean getPeso___ne() {
        return peso___ne;
    }
    public void setPeso___ne(Boolean peso___ne) {
        this.peso___ne = peso___ne;
    }

    public Boolean getPeso___null() {
        return peso___null;
    }
    public void setPeso___null(Boolean peso___null) {
        this.peso___null = peso___null;
    }

    public Boolean getPeso___not___null() {
        return peso___not___null;
    }
    public void setPeso___not___null(Boolean peso___not___null) {
        this.peso___not___null = peso___not___null;
    }

    public Boolean getPlasma_raccolto___eq() {
        return plasma_raccolto___eq;
    }
    public void setPlasma_raccolto___eq(Boolean plasma_raccolto___eq) {
        this.plasma_raccolto___eq = plasma_raccolto___eq;
    }

    public Boolean getPlasma_raccolto___ne() {
        return plasma_raccolto___ne;
    }
    public void setPlasma_raccolto___ne(Boolean plasma_raccolto___ne) {
        this.plasma_raccolto___ne = plasma_raccolto___ne;
    }

    public Boolean getPlasma_raccolto___null() {
        return plasma_raccolto___null;
    }
    public void setPlasma_raccolto___null(Boolean plasma_raccolto___null) {
        this.plasma_raccolto___null = plasma_raccolto___null;
    }

    public Boolean getPlasma_raccolto___not___null() {
        return plasma_raccolto___not___null;
    }
    public void setPlasma_raccolto___not___null(Boolean plasma_raccolto___not___null) {
        this.plasma_raccolto___not___null = plasma_raccolto___not___null;
    }

    public Boolean getPresentato___eq() {
        return presentato___eq;
    }
    public void setPresentato___eq(Boolean presentato___eq) {
        this.presentato___eq = presentato___eq;
    }

    public Boolean getPresentato___ne() {
        return presentato___ne;
    }
    public void setPresentato___ne(Boolean presentato___ne) {
        this.presentato___ne = presentato___ne;
    }

    public Boolean getPresentato___null() {
        return presentato___null;
    }
    public void setPresentato___null(Boolean presentato___null) {
        this.presentato___null = presentato___null;
    }

    public Boolean getPresentato___not___null() {
        return presentato___not___null;
    }
    public void setPresentato___not___null(Boolean presentato___not___null) {
        this.presentato___not___null = presentato___not___null;
    }

    public Boolean getQuestionari___eq() {
        return questionari___eq;
    }
    public void setQuestionari___eq(Boolean questionari___eq) {
        this.questionari___eq = questionari___eq;
    }

    public Boolean getQuestionari___ne() {
        return questionari___ne;
    }
    public void setQuestionari___ne(Boolean questionari___ne) {
        this.questionari___ne = questionari___ne;
    }

    public Boolean getQuestionari___null() {
        return questionari___null;
    }
    public void setQuestionari___null(Boolean questionari___null) {
        this.questionari___null = questionari___null;
    }

    public Boolean getQuestionari___not___null() {
        return questionari___not___null;
    }
    public void setQuestionari___not___null(Boolean questionari___not___null) {
        this.questionari___not___null = questionari___not___null;
    }

    public Boolean getSangue_intero_raccolto___eq() {
        return sangue_intero_raccolto___eq;
    }
    public void setSangue_intero_raccolto___eq(Boolean sangue_intero_raccolto___eq) {
        this.sangue_intero_raccolto___eq = sangue_intero_raccolto___eq;
    }

    public Boolean getSangue_intero_raccolto___ne() {
        return sangue_intero_raccolto___ne;
    }
    public void setSangue_intero_raccolto___ne(Boolean sangue_intero_raccolto___ne) {
        this.sangue_intero_raccolto___ne = sangue_intero_raccolto___ne;
    }

    public Boolean getSangue_intero_raccolto___null() {
        return sangue_intero_raccolto___null;
    }
    public void setSangue_intero_raccolto___null(Boolean sangue_intero_raccolto___null) {
        this.sangue_intero_raccolto___null = sangue_intero_raccolto___null;
    }

    public Boolean getSangue_intero_raccolto___not___null() {
        return sangue_intero_raccolto___not___null;
    }
    public void setSangue_intero_raccolto___not___null(Boolean sangue_intero_raccolto___not___null) {
        this.sangue_intero_raccolto___not___null = sangue_intero_raccolto___not___null;
    }

    public String getTempo_visita___eq() {
        return tempo_visita___eq;
    }
    public void setTempo_visita___eq(String tempo_visita___eq) {
        this.tempo_visita___eq = tempo_visita___eq;
    }

    public String getTempo_visita___ne() {
        return tempo_visita___ne;
    }
    public void setTempo_visita___ne(String tempo_visita___ne) {
        this.tempo_visita___ne = tempo_visita___ne;
    }

    public Boolean getTempo_visita___null() {
        return tempo_visita___null;
    }
    public void setTempo_visita___null(Boolean tempo_visita___null) {
        this.tempo_visita___null = tempo_visita___null;
    }

    public Boolean getTempo_visita___not___null() {
        return tempo_visita___not___null;
    }
    public void setTempo_visita___not___null(Boolean tempo_visita___not___null) {
        this.tempo_visita___not___null = tempo_visita___not___null;
    }

    public java.util.List<String> getTempo_visita___in() {
        return tempo_visita___in;
    }
    public void setTempo_visita___in(java.util.List<String> tempo_visita___in) {
        this.tempo_visita___in = tempo_visita___in;
    }

    public java.util.List<String> getTempo_visita___not___in() {
        return tempo_visita___not___in;
    }
    public void setTempo_visita___not___in(java.util.List<String> tempo_visita___not___in) {
        this.tempo_visita___not___in = tempo_visita___not___in;
    }

    public String getTempo_visita___lt() {
        return tempo_visita___lt;
    }
    public void setTempo_visita___lt(String tempo_visita___lt) {
        this.tempo_visita___lt = tempo_visita___lt;
    }

    public String getTempo_visita___lte() {
        return tempo_visita___lte;
    }
    public void setTempo_visita___lte(String tempo_visita___lte) {
        this.tempo_visita___lte = tempo_visita___lte;
    }

    public String getTempo_visita___gt() {
        return tempo_visita___gt;
    }
    public void setTempo_visita___gt(String tempo_visita___gt) {
        this.tempo_visita___gt = tempo_visita___gt;
    }

    public String getTempo_visita___gte() {
        return tempo_visita___gte;
    }
    public void setTempo_visita___gte(String tempo_visita___gte) {
        this.tempo_visita___gte = tempo_visita___gte;
    }

    public String getTempo_visita___contains() {
        return tempo_visita___contains;
    }
    public void setTempo_visita___contains(String tempo_visita___contains) {
        this.tempo_visita___contains = tempo_visita___contains;
    }

    public String getTempo_visita___not___contains() {
        return tempo_visita___not___contains;
    }
    public void setTempo_visita___not___contains(String tempo_visita___not___contains) {
        this.tempo_visita___not___contains = tempo_visita___not___contains;
    }

    public String getTempo_visita___starts_with() {
        return tempo_visita___starts_with;
    }
    public void setTempo_visita___starts_with(String tempo_visita___starts_with) {
        this.tempo_visita___starts_with = tempo_visita___starts_with;
    }

    public String getTempo_visita___not___starts_with() {
        return tempo_visita___not___starts_with;
    }
    public void setTempo_visita___not___starts_with(String tempo_visita___not___starts_with) {
        this.tempo_visita___not___starts_with = tempo_visita___not___starts_with;
    }

    public String getTempo_visita___ends_with() {
        return tempo_visita___ends_with;
    }
    public void setTempo_visita___ends_with(String tempo_visita___ends_with) {
        this.tempo_visita___ends_with = tempo_visita___ends_with;
    }

    public String getTempo_visita___not___ends_with() {
        return tempo_visita___not___ends_with;
    }
    public void setTempo_visita___not___ends_with(String tempo_visita___not___ends_with) {
        this.tempo_visita___not___ends_with = tempo_visita___not___ends_with;
    }

    public Boolean getViro_immun___eq() {
        return viro_immun___eq;
    }
    public void setViro_immun___eq(Boolean viro_immun___eq) {
        this.viro_immun___eq = viro_immun___eq;
    }

    public Boolean getViro_immun___ne() {
        return viro_immun___ne;
    }
    public void setViro_immun___ne(Boolean viro_immun___ne) {
        this.viro_immun___ne = viro_immun___ne;
    }

    public Boolean getViro_immun___null() {
        return viro_immun___null;
    }
    public void setViro_immun___null(Boolean viro_immun___null) {
        this.viro_immun___null = viro_immun___null;
    }

    public Boolean getViro_immun___not___null() {
        return viro_immun___not___null;
    }
    public void setViro_immun___not___null(Boolean viro_immun___not___null) {
        this.viro_immun___not___null = viro_immun___not___null;
    }

    public java.util.List<CliL_dettaglioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliL_dettaglioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliL_dettaglioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliL_dettaglioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliL_dettaglioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliL_dettaglioFilterDTO NOT) {
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
        if (chimica___eq != null) {
            joiner.add("chimica___eq: " + GraphQLRequestSerializer.getEntry(chimica___eq));
        }
        if (chimica___ne != null) {
            joiner.add("chimica___ne: " + GraphQLRequestSerializer.getEntry(chimica___ne));
        }
        if (chimica___null != null) {
            joiner.add("chimica___null: " + GraphQLRequestSerializer.getEntry(chimica___null));
        }
        if (chimica___not___null != null) {
            joiner.add("chimica___not___null: " + GraphQLRequestSerializer.getEntry(chimica___not___null));
        }
        if (data___eq != null) {
            joiner.add("data___eq: " + GraphQLRequestSerializer.getEntry(data___eq));
        }
        if (data___ne != null) {
            joiner.add("data___ne: " + GraphQLRequestSerializer.getEntry(data___ne));
        }
        if (data___null != null) {
            joiner.add("data___null: " + GraphQLRequestSerializer.getEntry(data___null));
        }
        if (data___not___null != null) {
            joiner.add("data___not___null: " + GraphQLRequestSerializer.getEntry(data___not___null));
        }
        if (data___in != null) {
            joiner.add("data___in: " + GraphQLRequestSerializer.getEntry(data___in));
        }
        if (data___not___in != null) {
            joiner.add("data___not___in: " + GraphQLRequestSerializer.getEntry(data___not___in));
        }
        if (data___lt != null) {
            joiner.add("data___lt: " + GraphQLRequestSerializer.getEntry(data___lt));
        }
        if (data___lte != null) {
            joiner.add("data___lte: " + GraphQLRequestSerializer.getEntry(data___lte));
        }
        if (data___gt != null) {
            joiner.add("data___gt: " + GraphQLRequestSerializer.getEntry(data___gt));
        }
        if (data___gte != null) {
            joiner.add("data___gte: " + GraphQLRequestSerializer.getEntry(data___gte));
        }
        if (eventi_clinici___eq != null) {
            joiner.add("eventi_clinici___eq: " + GraphQLRequestSerializer.getEntry(eventi_clinici___eq));
        }
        if (eventi_clinici___ne != null) {
            joiner.add("eventi_clinici___ne: " + GraphQLRequestSerializer.getEntry(eventi_clinici___ne));
        }
        if (eventi_clinici___null != null) {
            joiner.add("eventi_clinici___null: " + GraphQLRequestSerializer.getEntry(eventi_clinici___null));
        }
        if (eventi_clinici___not___null != null) {
            joiner.add("eventi_clinici___not___null: " + GraphQLRequestSerializer.getEntry(eventi_clinici___not___null));
        }
        if (flag_altezza___eq != null) {
            joiner.add("flag_altezza___eq: " + GraphQLRequestSerializer.getEntry(flag_altezza___eq));
        }
        if (flag_altezza___ne != null) {
            joiner.add("flag_altezza___ne: " + GraphQLRequestSerializer.getEntry(flag_altezza___ne));
        }
        if (flag_altezza___null != null) {
            joiner.add("flag_altezza___null: " + GraphQLRequestSerializer.getEntry(flag_altezza___null));
        }
        if (flag_altezza___not___null != null) {
            joiner.add("flag_altezza___not___null: " + GraphQLRequestSerializer.getEntry(flag_altezza___not___null));
        }
        if (flag_chimica___eq != null) {
            joiner.add("flag_chimica___eq: " + GraphQLRequestSerializer.getEntry(flag_chimica___eq));
        }
        if (flag_chimica___ne != null) {
            joiner.add("flag_chimica___ne: " + GraphQLRequestSerializer.getEntry(flag_chimica___ne));
        }
        if (flag_chimica___null != null) {
            joiner.add("flag_chimica___null: " + GraphQLRequestSerializer.getEntry(flag_chimica___null));
        }
        if (flag_chimica___not___null != null) {
            joiner.add("flag_chimica___not___null: " + GraphQLRequestSerializer.getEntry(flag_chimica___not___null));
        }
        if (flag_eventi_clinici___eq != null) {
            joiner.add("flag_eventi_clinici___eq: " + GraphQLRequestSerializer.getEntry(flag_eventi_clinici___eq));
        }
        if (flag_eventi_clinici___ne != null) {
            joiner.add("flag_eventi_clinici___ne: " + GraphQLRequestSerializer.getEntry(flag_eventi_clinici___ne));
        }
        if (flag_eventi_clinici___null != null) {
            joiner.add("flag_eventi_clinici___null: " + GraphQLRequestSerializer.getEntry(flag_eventi_clinici___null));
        }
        if (flag_eventi_clinici___not___null != null) {
            joiner.add("flag_eventi_clinici___not___null: " + GraphQLRequestSerializer.getEntry(flag_eventi_clinici___not___null));
        }
        if (flag_peso___eq != null) {
            joiner.add("flag_peso___eq: " + GraphQLRequestSerializer.getEntry(flag_peso___eq));
        }
        if (flag_peso___ne != null) {
            joiner.add("flag_peso___ne: " + GraphQLRequestSerializer.getEntry(flag_peso___ne));
        }
        if (flag_peso___null != null) {
            joiner.add("flag_peso___null: " + GraphQLRequestSerializer.getEntry(flag_peso___null));
        }
        if (flag_peso___not___null != null) {
            joiner.add("flag_peso___not___null: " + GraphQLRequestSerializer.getEntry(flag_peso___not___null));
        }
        if (flag_plasma_raccolto___eq != null) {
            joiner.add("flag_plasma_raccolto___eq: " + GraphQLRequestSerializer.getEntry(flag_plasma_raccolto___eq));
        }
        if (flag_plasma_raccolto___ne != null) {
            joiner.add("flag_plasma_raccolto___ne: " + GraphQLRequestSerializer.getEntry(flag_plasma_raccolto___ne));
        }
        if (flag_plasma_raccolto___null != null) {
            joiner.add("flag_plasma_raccolto___null: " + GraphQLRequestSerializer.getEntry(flag_plasma_raccolto___null));
        }
        if (flag_plasma_raccolto___not___null != null) {
            joiner.add("flag_plasma_raccolto___not___null: " + GraphQLRequestSerializer.getEntry(flag_plasma_raccolto___not___null));
        }
        if (flag_presentato___eq != null) {
            joiner.add("flag_presentato___eq: " + GraphQLRequestSerializer.getEntry(flag_presentato___eq));
        }
        if (flag_presentato___ne != null) {
            joiner.add("flag_presentato___ne: " + GraphQLRequestSerializer.getEntry(flag_presentato___ne));
        }
        if (flag_presentato___null != null) {
            joiner.add("flag_presentato___null: " + GraphQLRequestSerializer.getEntry(flag_presentato___null));
        }
        if (flag_presentato___not___null != null) {
            joiner.add("flag_presentato___not___null: " + GraphQLRequestSerializer.getEntry(flag_presentato___not___null));
        }
        if (flag_questionari___eq != null) {
            joiner.add("flag_questionari___eq: " + GraphQLRequestSerializer.getEntry(flag_questionari___eq));
        }
        if (flag_questionari___ne != null) {
            joiner.add("flag_questionari___ne: " + GraphQLRequestSerializer.getEntry(flag_questionari___ne));
        }
        if (flag_questionari___null != null) {
            joiner.add("flag_questionari___null: " + GraphQLRequestSerializer.getEntry(flag_questionari___null));
        }
        if (flag_questionari___not___null != null) {
            joiner.add("flag_questionari___not___null: " + GraphQLRequestSerializer.getEntry(flag_questionari___not___null));
        }
        if (flag_sangue_intero_raccolto___eq != null) {
            joiner.add("flag_sangue_intero_raccolto___eq: " + GraphQLRequestSerializer.getEntry(flag_sangue_intero_raccolto___eq));
        }
        if (flag_sangue_intero_raccolto___ne != null) {
            joiner.add("flag_sangue_intero_raccolto___ne: " + GraphQLRequestSerializer.getEntry(flag_sangue_intero_raccolto___ne));
        }
        if (flag_sangue_intero_raccolto___null != null) {
            joiner.add("flag_sangue_intero_raccolto___null: " + GraphQLRequestSerializer.getEntry(flag_sangue_intero_raccolto___null));
        }
        if (flag_sangue_intero_raccolto___not___null != null) {
            joiner.add("flag_sangue_intero_raccolto___not___null: " + GraphQLRequestSerializer.getEntry(flag_sangue_intero_raccolto___not___null));
        }
        if (flag_viro_immun___eq != null) {
            joiner.add("flag_viro_immun___eq: " + GraphQLRequestSerializer.getEntry(flag_viro_immun___eq));
        }
        if (flag_viro_immun___ne != null) {
            joiner.add("flag_viro_immun___ne: " + GraphQLRequestSerializer.getEntry(flag_viro_immun___ne));
        }
        if (flag_viro_immun___null != null) {
            joiner.add("flag_viro_immun___null: " + GraphQLRequestSerializer.getEntry(flag_viro_immun___null));
        }
        if (flag_viro_immun___not___null != null) {
            joiner.add("flag_viro_immun___not___null: " + GraphQLRequestSerializer.getEntry(flag_viro_immun___not___null));
        }
        if (mese___eq != null) {
            joiner.add("mese___eq: " + GraphQLRequestSerializer.getEntry(mese___eq));
        }
        if (mese___ne != null) {
            joiner.add("mese___ne: " + GraphQLRequestSerializer.getEntry(mese___ne));
        }
        if (mese___null != null) {
            joiner.add("mese___null: " + GraphQLRequestSerializer.getEntry(mese___null));
        }
        if (mese___not___null != null) {
            joiner.add("mese___not___null: " + GraphQLRequestSerializer.getEntry(mese___not___null));
        }
        if (mese___in != null) {
            joiner.add("mese___in: " + GraphQLRequestSerializer.getEntry(mese___in));
        }
        if (mese___not___in != null) {
            joiner.add("mese___not___in: " + GraphQLRequestSerializer.getEntry(mese___not___in));
        }
        if (mese___lt != null) {
            joiner.add("mese___lt: " + GraphQLRequestSerializer.getEntry(mese___lt));
        }
        if (mese___lte != null) {
            joiner.add("mese___lte: " + GraphQLRequestSerializer.getEntry(mese___lte));
        }
        if (mese___gt != null) {
            joiner.add("mese___gt: " + GraphQLRequestSerializer.getEntry(mese___gt));
        }
        if (mese___gte != null) {
            joiner.add("mese___gte: " + GraphQLRequestSerializer.getEntry(mese___gte));
        }
        if (peso___eq != null) {
            joiner.add("peso___eq: " + GraphQLRequestSerializer.getEntry(peso___eq));
        }
        if (peso___ne != null) {
            joiner.add("peso___ne: " + GraphQLRequestSerializer.getEntry(peso___ne));
        }
        if (peso___null != null) {
            joiner.add("peso___null: " + GraphQLRequestSerializer.getEntry(peso___null));
        }
        if (peso___not___null != null) {
            joiner.add("peso___not___null: " + GraphQLRequestSerializer.getEntry(peso___not___null));
        }
        if (plasma_raccolto___eq != null) {
            joiner.add("plasma_raccolto___eq: " + GraphQLRequestSerializer.getEntry(plasma_raccolto___eq));
        }
        if (plasma_raccolto___ne != null) {
            joiner.add("plasma_raccolto___ne: " + GraphQLRequestSerializer.getEntry(plasma_raccolto___ne));
        }
        if (plasma_raccolto___null != null) {
            joiner.add("plasma_raccolto___null: " + GraphQLRequestSerializer.getEntry(plasma_raccolto___null));
        }
        if (plasma_raccolto___not___null != null) {
            joiner.add("plasma_raccolto___not___null: " + GraphQLRequestSerializer.getEntry(plasma_raccolto___not___null));
        }
        if (presentato___eq != null) {
            joiner.add("presentato___eq: " + GraphQLRequestSerializer.getEntry(presentato___eq));
        }
        if (presentato___ne != null) {
            joiner.add("presentato___ne: " + GraphQLRequestSerializer.getEntry(presentato___ne));
        }
        if (presentato___null != null) {
            joiner.add("presentato___null: " + GraphQLRequestSerializer.getEntry(presentato___null));
        }
        if (presentato___not___null != null) {
            joiner.add("presentato___not___null: " + GraphQLRequestSerializer.getEntry(presentato___not___null));
        }
        if (questionari___eq != null) {
            joiner.add("questionari___eq: " + GraphQLRequestSerializer.getEntry(questionari___eq));
        }
        if (questionari___ne != null) {
            joiner.add("questionari___ne: " + GraphQLRequestSerializer.getEntry(questionari___ne));
        }
        if (questionari___null != null) {
            joiner.add("questionari___null: " + GraphQLRequestSerializer.getEntry(questionari___null));
        }
        if (questionari___not___null != null) {
            joiner.add("questionari___not___null: " + GraphQLRequestSerializer.getEntry(questionari___not___null));
        }
        if (sangue_intero_raccolto___eq != null) {
            joiner.add("sangue_intero_raccolto___eq: " + GraphQLRequestSerializer.getEntry(sangue_intero_raccolto___eq));
        }
        if (sangue_intero_raccolto___ne != null) {
            joiner.add("sangue_intero_raccolto___ne: " + GraphQLRequestSerializer.getEntry(sangue_intero_raccolto___ne));
        }
        if (sangue_intero_raccolto___null != null) {
            joiner.add("sangue_intero_raccolto___null: " + GraphQLRequestSerializer.getEntry(sangue_intero_raccolto___null));
        }
        if (sangue_intero_raccolto___not___null != null) {
            joiner.add("sangue_intero_raccolto___not___null: " + GraphQLRequestSerializer.getEntry(sangue_intero_raccolto___not___null));
        }
        if (tempo_visita___eq != null) {
            joiner.add("tempo_visita___eq: " + GraphQLRequestSerializer.getEntry(tempo_visita___eq));
        }
        if (tempo_visita___ne != null) {
            joiner.add("tempo_visita___ne: " + GraphQLRequestSerializer.getEntry(tempo_visita___ne));
        }
        if (tempo_visita___null != null) {
            joiner.add("tempo_visita___null: " + GraphQLRequestSerializer.getEntry(tempo_visita___null));
        }
        if (tempo_visita___not___null != null) {
            joiner.add("tempo_visita___not___null: " + GraphQLRequestSerializer.getEntry(tempo_visita___not___null));
        }
        if (tempo_visita___in != null) {
            joiner.add("tempo_visita___in: " + GraphQLRequestSerializer.getEntry(tempo_visita___in));
        }
        if (tempo_visita___not___in != null) {
            joiner.add("tempo_visita___not___in: " + GraphQLRequestSerializer.getEntry(tempo_visita___not___in));
        }
        if (tempo_visita___lt != null) {
            joiner.add("tempo_visita___lt: " + GraphQLRequestSerializer.getEntry(tempo_visita___lt));
        }
        if (tempo_visita___lte != null) {
            joiner.add("tempo_visita___lte: " + GraphQLRequestSerializer.getEntry(tempo_visita___lte));
        }
        if (tempo_visita___gt != null) {
            joiner.add("tempo_visita___gt: " + GraphQLRequestSerializer.getEntry(tempo_visita___gt));
        }
        if (tempo_visita___gte != null) {
            joiner.add("tempo_visita___gte: " + GraphQLRequestSerializer.getEntry(tempo_visita___gte));
        }
        if (tempo_visita___contains != null) {
            joiner.add("tempo_visita___contains: " + GraphQLRequestSerializer.getEntry(tempo_visita___contains));
        }
        if (tempo_visita___not___contains != null) {
            joiner.add("tempo_visita___not___contains: " + GraphQLRequestSerializer.getEntry(tempo_visita___not___contains));
        }
        if (tempo_visita___starts_with != null) {
            joiner.add("tempo_visita___starts_with: " + GraphQLRequestSerializer.getEntry(tempo_visita___starts_with));
        }
        if (tempo_visita___not___starts_with != null) {
            joiner.add("tempo_visita___not___starts_with: " + GraphQLRequestSerializer.getEntry(tempo_visita___not___starts_with));
        }
        if (tempo_visita___ends_with != null) {
            joiner.add("tempo_visita___ends_with: " + GraphQLRequestSerializer.getEntry(tempo_visita___ends_with));
        }
        if (tempo_visita___not___ends_with != null) {
            joiner.add("tempo_visita___not___ends_with: " + GraphQLRequestSerializer.getEntry(tempo_visita___not___ends_with));
        }
        if (viro_immun___eq != null) {
            joiner.add("viro_immun___eq: " + GraphQLRequestSerializer.getEntry(viro_immun___eq));
        }
        if (viro_immun___ne != null) {
            joiner.add("viro_immun___ne: " + GraphQLRequestSerializer.getEntry(viro_immun___ne));
        }
        if (viro_immun___null != null) {
            joiner.add("viro_immun___null: " + GraphQLRequestSerializer.getEntry(viro_immun___null));
        }
        if (viro_immun___not___null != null) {
            joiner.add("viro_immun___not___null: " + GraphQLRequestSerializer.getEntry(viro_immun___not___null));
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

    public static CliL_dettaglioFilterDTO.Builder builder() {
        return new CliL_dettaglioFilterDTO.Builder();
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
        private Boolean altezza___eq;
        private Boolean altezza___ne;
        private Boolean altezza___null;
        private Boolean altezza___not___null;
        private Boolean chimica___eq;
        private Boolean chimica___ne;
        private Boolean chimica___null;
        private Boolean chimica___not___null;
        private String data___eq;
        private String data___ne;
        private Boolean data___null;
        private Boolean data___not___null;
        private java.util.List<String> data___in;
        private java.util.List<String> data___not___in;
        private String data___lt;
        private String data___lte;
        private String data___gt;
        private String data___gte;
        private Boolean eventi_clinici___eq;
        private Boolean eventi_clinici___ne;
        private Boolean eventi_clinici___null;
        private Boolean eventi_clinici___not___null;
        private Boolean flag_altezza___eq;
        private Boolean flag_altezza___ne;
        private Boolean flag_altezza___null;
        private Boolean flag_altezza___not___null;
        private Boolean flag_chimica___eq;
        private Boolean flag_chimica___ne;
        private Boolean flag_chimica___null;
        private Boolean flag_chimica___not___null;
        private Boolean flag_eventi_clinici___eq;
        private Boolean flag_eventi_clinici___ne;
        private Boolean flag_eventi_clinici___null;
        private Boolean flag_eventi_clinici___not___null;
        private Boolean flag_peso___eq;
        private Boolean flag_peso___ne;
        private Boolean flag_peso___null;
        private Boolean flag_peso___not___null;
        private Boolean flag_plasma_raccolto___eq;
        private Boolean flag_plasma_raccolto___ne;
        private Boolean flag_plasma_raccolto___null;
        private Boolean flag_plasma_raccolto___not___null;
        private Boolean flag_presentato___eq;
        private Boolean flag_presentato___ne;
        private Boolean flag_presentato___null;
        private Boolean flag_presentato___not___null;
        private Boolean flag_questionari___eq;
        private Boolean flag_questionari___ne;
        private Boolean flag_questionari___null;
        private Boolean flag_questionari___not___null;
        private Boolean flag_sangue_intero_raccolto___eq;
        private Boolean flag_sangue_intero_raccolto___ne;
        private Boolean flag_sangue_intero_raccolto___null;
        private Boolean flag_sangue_intero_raccolto___not___null;
        private Boolean flag_viro_immun___eq;
        private Boolean flag_viro_immun___ne;
        private Boolean flag_viro_immun___null;
        private Boolean flag_viro_immun___not___null;
        private Integer mese___eq;
        private Integer mese___ne;
        private Boolean mese___null;
        private Boolean mese___not___null;
        private java.util.List<Integer> mese___in;
        private java.util.List<Integer> mese___not___in;
        private Integer mese___lt;
        private Integer mese___lte;
        private Integer mese___gt;
        private Integer mese___gte;
        private Boolean peso___eq;
        private Boolean peso___ne;
        private Boolean peso___null;
        private Boolean peso___not___null;
        private Boolean plasma_raccolto___eq;
        private Boolean plasma_raccolto___ne;
        private Boolean plasma_raccolto___null;
        private Boolean plasma_raccolto___not___null;
        private Boolean presentato___eq;
        private Boolean presentato___ne;
        private Boolean presentato___null;
        private Boolean presentato___not___null;
        private Boolean questionari___eq;
        private Boolean questionari___ne;
        private Boolean questionari___null;
        private Boolean questionari___not___null;
        private Boolean sangue_intero_raccolto___eq;
        private Boolean sangue_intero_raccolto___ne;
        private Boolean sangue_intero_raccolto___null;
        private Boolean sangue_intero_raccolto___not___null;
        private String tempo_visita___eq;
        private String tempo_visita___ne;
        private Boolean tempo_visita___null;
        private Boolean tempo_visita___not___null;
        private java.util.List<String> tempo_visita___in;
        private java.util.List<String> tempo_visita___not___in;
        private String tempo_visita___lt;
        private String tempo_visita___lte;
        private String tempo_visita___gt;
        private String tempo_visita___gte;
        private String tempo_visita___contains;
        private String tempo_visita___not___contains;
        private String tempo_visita___starts_with;
        private String tempo_visita___not___starts_with;
        private String tempo_visita___ends_with;
        private String tempo_visita___not___ends_with;
        private Boolean viro_immun___eq;
        private Boolean viro_immun___ne;
        private Boolean viro_immun___null;
        private Boolean viro_immun___not___null;
        private java.util.List<CliL_dettaglioFilterDTO> AND;
        private java.util.List<CliL_dettaglioFilterDTO> OR;
        private CliL_dettaglioFilterDTO NOT;

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

        public Builder setAltezza___eq(Boolean altezza___eq) {
            this.altezza___eq = altezza___eq;
            return this;
        }

        public Builder setAltezza___ne(Boolean altezza___ne) {
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

        public Builder setChimica___eq(Boolean chimica___eq) {
            this.chimica___eq = chimica___eq;
            return this;
        }

        public Builder setChimica___ne(Boolean chimica___ne) {
            this.chimica___ne = chimica___ne;
            return this;
        }

        public Builder setChimica___null(Boolean chimica___null) {
            this.chimica___null = chimica___null;
            return this;
        }

        public Builder setChimica___not___null(Boolean chimica___not___null) {
            this.chimica___not___null = chimica___not___null;
            return this;
        }

        public Builder setData___eq(String data___eq) {
            this.data___eq = data___eq;
            return this;
        }

        public Builder setData___ne(String data___ne) {
            this.data___ne = data___ne;
            return this;
        }

        public Builder setData___null(Boolean data___null) {
            this.data___null = data___null;
            return this;
        }

        public Builder setData___not___null(Boolean data___not___null) {
            this.data___not___null = data___not___null;
            return this;
        }

        public Builder setData___in(java.util.List<String> data___in) {
            this.data___in = data___in;
            return this;
        }

        public Builder setData___not___in(java.util.List<String> data___not___in) {
            this.data___not___in = data___not___in;
            return this;
        }

        public Builder setData___lt(String data___lt) {
            this.data___lt = data___lt;
            return this;
        }

        public Builder setData___lte(String data___lte) {
            this.data___lte = data___lte;
            return this;
        }

        public Builder setData___gt(String data___gt) {
            this.data___gt = data___gt;
            return this;
        }

        public Builder setData___gte(String data___gte) {
            this.data___gte = data___gte;
            return this;
        }

        public Builder setEventi_clinici___eq(Boolean eventi_clinici___eq) {
            this.eventi_clinici___eq = eventi_clinici___eq;
            return this;
        }

        public Builder setEventi_clinici___ne(Boolean eventi_clinici___ne) {
            this.eventi_clinici___ne = eventi_clinici___ne;
            return this;
        }

        public Builder setEventi_clinici___null(Boolean eventi_clinici___null) {
            this.eventi_clinici___null = eventi_clinici___null;
            return this;
        }

        public Builder setEventi_clinici___not___null(Boolean eventi_clinici___not___null) {
            this.eventi_clinici___not___null = eventi_clinici___not___null;
            return this;
        }

        public Builder setFlag_altezza___eq(Boolean flag_altezza___eq) {
            this.flag_altezza___eq = flag_altezza___eq;
            return this;
        }

        public Builder setFlag_altezza___ne(Boolean flag_altezza___ne) {
            this.flag_altezza___ne = flag_altezza___ne;
            return this;
        }

        public Builder setFlag_altezza___null(Boolean flag_altezza___null) {
            this.flag_altezza___null = flag_altezza___null;
            return this;
        }

        public Builder setFlag_altezza___not___null(Boolean flag_altezza___not___null) {
            this.flag_altezza___not___null = flag_altezza___not___null;
            return this;
        }

        public Builder setFlag_chimica___eq(Boolean flag_chimica___eq) {
            this.flag_chimica___eq = flag_chimica___eq;
            return this;
        }

        public Builder setFlag_chimica___ne(Boolean flag_chimica___ne) {
            this.flag_chimica___ne = flag_chimica___ne;
            return this;
        }

        public Builder setFlag_chimica___null(Boolean flag_chimica___null) {
            this.flag_chimica___null = flag_chimica___null;
            return this;
        }

        public Builder setFlag_chimica___not___null(Boolean flag_chimica___not___null) {
            this.flag_chimica___not___null = flag_chimica___not___null;
            return this;
        }

        public Builder setFlag_eventi_clinici___eq(Boolean flag_eventi_clinici___eq) {
            this.flag_eventi_clinici___eq = flag_eventi_clinici___eq;
            return this;
        }

        public Builder setFlag_eventi_clinici___ne(Boolean flag_eventi_clinici___ne) {
            this.flag_eventi_clinici___ne = flag_eventi_clinici___ne;
            return this;
        }

        public Builder setFlag_eventi_clinici___null(Boolean flag_eventi_clinici___null) {
            this.flag_eventi_clinici___null = flag_eventi_clinici___null;
            return this;
        }

        public Builder setFlag_eventi_clinici___not___null(Boolean flag_eventi_clinici___not___null) {
            this.flag_eventi_clinici___not___null = flag_eventi_clinici___not___null;
            return this;
        }

        public Builder setFlag_peso___eq(Boolean flag_peso___eq) {
            this.flag_peso___eq = flag_peso___eq;
            return this;
        }

        public Builder setFlag_peso___ne(Boolean flag_peso___ne) {
            this.flag_peso___ne = flag_peso___ne;
            return this;
        }

        public Builder setFlag_peso___null(Boolean flag_peso___null) {
            this.flag_peso___null = flag_peso___null;
            return this;
        }

        public Builder setFlag_peso___not___null(Boolean flag_peso___not___null) {
            this.flag_peso___not___null = flag_peso___not___null;
            return this;
        }

        public Builder setFlag_plasma_raccolto___eq(Boolean flag_plasma_raccolto___eq) {
            this.flag_plasma_raccolto___eq = flag_plasma_raccolto___eq;
            return this;
        }

        public Builder setFlag_plasma_raccolto___ne(Boolean flag_plasma_raccolto___ne) {
            this.flag_plasma_raccolto___ne = flag_plasma_raccolto___ne;
            return this;
        }

        public Builder setFlag_plasma_raccolto___null(Boolean flag_plasma_raccolto___null) {
            this.flag_plasma_raccolto___null = flag_plasma_raccolto___null;
            return this;
        }

        public Builder setFlag_plasma_raccolto___not___null(Boolean flag_plasma_raccolto___not___null) {
            this.flag_plasma_raccolto___not___null = flag_plasma_raccolto___not___null;
            return this;
        }

        public Builder setFlag_presentato___eq(Boolean flag_presentato___eq) {
            this.flag_presentato___eq = flag_presentato___eq;
            return this;
        }

        public Builder setFlag_presentato___ne(Boolean flag_presentato___ne) {
            this.flag_presentato___ne = flag_presentato___ne;
            return this;
        }

        public Builder setFlag_presentato___null(Boolean flag_presentato___null) {
            this.flag_presentato___null = flag_presentato___null;
            return this;
        }

        public Builder setFlag_presentato___not___null(Boolean flag_presentato___not___null) {
            this.flag_presentato___not___null = flag_presentato___not___null;
            return this;
        }

        public Builder setFlag_questionari___eq(Boolean flag_questionari___eq) {
            this.flag_questionari___eq = flag_questionari___eq;
            return this;
        }

        public Builder setFlag_questionari___ne(Boolean flag_questionari___ne) {
            this.flag_questionari___ne = flag_questionari___ne;
            return this;
        }

        public Builder setFlag_questionari___null(Boolean flag_questionari___null) {
            this.flag_questionari___null = flag_questionari___null;
            return this;
        }

        public Builder setFlag_questionari___not___null(Boolean flag_questionari___not___null) {
            this.flag_questionari___not___null = flag_questionari___not___null;
            return this;
        }

        public Builder setFlag_sangue_intero_raccolto___eq(Boolean flag_sangue_intero_raccolto___eq) {
            this.flag_sangue_intero_raccolto___eq = flag_sangue_intero_raccolto___eq;
            return this;
        }

        public Builder setFlag_sangue_intero_raccolto___ne(Boolean flag_sangue_intero_raccolto___ne) {
            this.flag_sangue_intero_raccolto___ne = flag_sangue_intero_raccolto___ne;
            return this;
        }

        public Builder setFlag_sangue_intero_raccolto___null(Boolean flag_sangue_intero_raccolto___null) {
            this.flag_sangue_intero_raccolto___null = flag_sangue_intero_raccolto___null;
            return this;
        }

        public Builder setFlag_sangue_intero_raccolto___not___null(Boolean flag_sangue_intero_raccolto___not___null) {
            this.flag_sangue_intero_raccolto___not___null = flag_sangue_intero_raccolto___not___null;
            return this;
        }

        public Builder setFlag_viro_immun___eq(Boolean flag_viro_immun___eq) {
            this.flag_viro_immun___eq = flag_viro_immun___eq;
            return this;
        }

        public Builder setFlag_viro_immun___ne(Boolean flag_viro_immun___ne) {
            this.flag_viro_immun___ne = flag_viro_immun___ne;
            return this;
        }

        public Builder setFlag_viro_immun___null(Boolean flag_viro_immun___null) {
            this.flag_viro_immun___null = flag_viro_immun___null;
            return this;
        }

        public Builder setFlag_viro_immun___not___null(Boolean flag_viro_immun___not___null) {
            this.flag_viro_immun___not___null = flag_viro_immun___not___null;
            return this;
        }

        public Builder setMese___eq(Integer mese___eq) {
            this.mese___eq = mese___eq;
            return this;
        }

        public Builder setMese___ne(Integer mese___ne) {
            this.mese___ne = mese___ne;
            return this;
        }

        public Builder setMese___null(Boolean mese___null) {
            this.mese___null = mese___null;
            return this;
        }

        public Builder setMese___not___null(Boolean mese___not___null) {
            this.mese___not___null = mese___not___null;
            return this;
        }

        public Builder setMese___in(java.util.List<Integer> mese___in) {
            this.mese___in = mese___in;
            return this;
        }

        public Builder setMese___not___in(java.util.List<Integer> mese___not___in) {
            this.mese___not___in = mese___not___in;
            return this;
        }

        public Builder setMese___lt(Integer mese___lt) {
            this.mese___lt = mese___lt;
            return this;
        }

        public Builder setMese___lte(Integer mese___lte) {
            this.mese___lte = mese___lte;
            return this;
        }

        public Builder setMese___gt(Integer mese___gt) {
            this.mese___gt = mese___gt;
            return this;
        }

        public Builder setMese___gte(Integer mese___gte) {
            this.mese___gte = mese___gte;
            return this;
        }

        public Builder setPeso___eq(Boolean peso___eq) {
            this.peso___eq = peso___eq;
            return this;
        }

        public Builder setPeso___ne(Boolean peso___ne) {
            this.peso___ne = peso___ne;
            return this;
        }

        public Builder setPeso___null(Boolean peso___null) {
            this.peso___null = peso___null;
            return this;
        }

        public Builder setPeso___not___null(Boolean peso___not___null) {
            this.peso___not___null = peso___not___null;
            return this;
        }

        public Builder setPlasma_raccolto___eq(Boolean plasma_raccolto___eq) {
            this.plasma_raccolto___eq = plasma_raccolto___eq;
            return this;
        }

        public Builder setPlasma_raccolto___ne(Boolean plasma_raccolto___ne) {
            this.plasma_raccolto___ne = plasma_raccolto___ne;
            return this;
        }

        public Builder setPlasma_raccolto___null(Boolean plasma_raccolto___null) {
            this.plasma_raccolto___null = plasma_raccolto___null;
            return this;
        }

        public Builder setPlasma_raccolto___not___null(Boolean plasma_raccolto___not___null) {
            this.plasma_raccolto___not___null = plasma_raccolto___not___null;
            return this;
        }

        public Builder setPresentato___eq(Boolean presentato___eq) {
            this.presentato___eq = presentato___eq;
            return this;
        }

        public Builder setPresentato___ne(Boolean presentato___ne) {
            this.presentato___ne = presentato___ne;
            return this;
        }

        public Builder setPresentato___null(Boolean presentato___null) {
            this.presentato___null = presentato___null;
            return this;
        }

        public Builder setPresentato___not___null(Boolean presentato___not___null) {
            this.presentato___not___null = presentato___not___null;
            return this;
        }

        public Builder setQuestionari___eq(Boolean questionari___eq) {
            this.questionari___eq = questionari___eq;
            return this;
        }

        public Builder setQuestionari___ne(Boolean questionari___ne) {
            this.questionari___ne = questionari___ne;
            return this;
        }

        public Builder setQuestionari___null(Boolean questionari___null) {
            this.questionari___null = questionari___null;
            return this;
        }

        public Builder setQuestionari___not___null(Boolean questionari___not___null) {
            this.questionari___not___null = questionari___not___null;
            return this;
        }

        public Builder setSangue_intero_raccolto___eq(Boolean sangue_intero_raccolto___eq) {
            this.sangue_intero_raccolto___eq = sangue_intero_raccolto___eq;
            return this;
        }

        public Builder setSangue_intero_raccolto___ne(Boolean sangue_intero_raccolto___ne) {
            this.sangue_intero_raccolto___ne = sangue_intero_raccolto___ne;
            return this;
        }

        public Builder setSangue_intero_raccolto___null(Boolean sangue_intero_raccolto___null) {
            this.sangue_intero_raccolto___null = sangue_intero_raccolto___null;
            return this;
        }

        public Builder setSangue_intero_raccolto___not___null(Boolean sangue_intero_raccolto___not___null) {
            this.sangue_intero_raccolto___not___null = sangue_intero_raccolto___not___null;
            return this;
        }

        public Builder setTempo_visita___eq(String tempo_visita___eq) {
            this.tempo_visita___eq = tempo_visita___eq;
            return this;
        }

        public Builder setTempo_visita___ne(String tempo_visita___ne) {
            this.tempo_visita___ne = tempo_visita___ne;
            return this;
        }

        public Builder setTempo_visita___null(Boolean tempo_visita___null) {
            this.tempo_visita___null = tempo_visita___null;
            return this;
        }

        public Builder setTempo_visita___not___null(Boolean tempo_visita___not___null) {
            this.tempo_visita___not___null = tempo_visita___not___null;
            return this;
        }

        public Builder setTempo_visita___in(java.util.List<String> tempo_visita___in) {
            this.tempo_visita___in = tempo_visita___in;
            return this;
        }

        public Builder setTempo_visita___not___in(java.util.List<String> tempo_visita___not___in) {
            this.tempo_visita___not___in = tempo_visita___not___in;
            return this;
        }

        public Builder setTempo_visita___lt(String tempo_visita___lt) {
            this.tempo_visita___lt = tempo_visita___lt;
            return this;
        }

        public Builder setTempo_visita___lte(String tempo_visita___lte) {
            this.tempo_visita___lte = tempo_visita___lte;
            return this;
        }

        public Builder setTempo_visita___gt(String tempo_visita___gt) {
            this.tempo_visita___gt = tempo_visita___gt;
            return this;
        }

        public Builder setTempo_visita___gte(String tempo_visita___gte) {
            this.tempo_visita___gte = tempo_visita___gte;
            return this;
        }

        public Builder setTempo_visita___contains(String tempo_visita___contains) {
            this.tempo_visita___contains = tempo_visita___contains;
            return this;
        }

        public Builder setTempo_visita___not___contains(String tempo_visita___not___contains) {
            this.tempo_visita___not___contains = tempo_visita___not___contains;
            return this;
        }

        public Builder setTempo_visita___starts_with(String tempo_visita___starts_with) {
            this.tempo_visita___starts_with = tempo_visita___starts_with;
            return this;
        }

        public Builder setTempo_visita___not___starts_with(String tempo_visita___not___starts_with) {
            this.tempo_visita___not___starts_with = tempo_visita___not___starts_with;
            return this;
        }

        public Builder setTempo_visita___ends_with(String tempo_visita___ends_with) {
            this.tempo_visita___ends_with = tempo_visita___ends_with;
            return this;
        }

        public Builder setTempo_visita___not___ends_with(String tempo_visita___not___ends_with) {
            this.tempo_visita___not___ends_with = tempo_visita___not___ends_with;
            return this;
        }

        public Builder setViro_immun___eq(Boolean viro_immun___eq) {
            this.viro_immun___eq = viro_immun___eq;
            return this;
        }

        public Builder setViro_immun___ne(Boolean viro_immun___ne) {
            this.viro_immun___ne = viro_immun___ne;
            return this;
        }

        public Builder setViro_immun___null(Boolean viro_immun___null) {
            this.viro_immun___null = viro_immun___null;
            return this;
        }

        public Builder setViro_immun___not___null(Boolean viro_immun___not___null) {
            this.viro_immun___not___null = viro_immun___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliL_dettaglioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliL_dettaglioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliL_dettaglioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliL_dettaglioFilterDTO build() {
            CliL_dettaglioFilterDTO result = new CliL_dettaglioFilterDTO();
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
            result.setChimica___eq(this.chimica___eq);
            result.setChimica___ne(this.chimica___ne);
            result.setChimica___null(this.chimica___null);
            result.setChimica___not___null(this.chimica___not___null);
            result.setData___eq(this.data___eq);
            result.setData___ne(this.data___ne);
            result.setData___null(this.data___null);
            result.setData___not___null(this.data___not___null);
            result.setData___in(this.data___in);
            result.setData___not___in(this.data___not___in);
            result.setData___lt(this.data___lt);
            result.setData___lte(this.data___lte);
            result.setData___gt(this.data___gt);
            result.setData___gte(this.data___gte);
            result.setEventi_clinici___eq(this.eventi_clinici___eq);
            result.setEventi_clinici___ne(this.eventi_clinici___ne);
            result.setEventi_clinici___null(this.eventi_clinici___null);
            result.setEventi_clinici___not___null(this.eventi_clinici___not___null);
            result.setFlag_altezza___eq(this.flag_altezza___eq);
            result.setFlag_altezza___ne(this.flag_altezza___ne);
            result.setFlag_altezza___null(this.flag_altezza___null);
            result.setFlag_altezza___not___null(this.flag_altezza___not___null);
            result.setFlag_chimica___eq(this.flag_chimica___eq);
            result.setFlag_chimica___ne(this.flag_chimica___ne);
            result.setFlag_chimica___null(this.flag_chimica___null);
            result.setFlag_chimica___not___null(this.flag_chimica___not___null);
            result.setFlag_eventi_clinici___eq(this.flag_eventi_clinici___eq);
            result.setFlag_eventi_clinici___ne(this.flag_eventi_clinici___ne);
            result.setFlag_eventi_clinici___null(this.flag_eventi_clinici___null);
            result.setFlag_eventi_clinici___not___null(this.flag_eventi_clinici___not___null);
            result.setFlag_peso___eq(this.flag_peso___eq);
            result.setFlag_peso___ne(this.flag_peso___ne);
            result.setFlag_peso___null(this.flag_peso___null);
            result.setFlag_peso___not___null(this.flag_peso___not___null);
            result.setFlag_plasma_raccolto___eq(this.flag_plasma_raccolto___eq);
            result.setFlag_plasma_raccolto___ne(this.flag_plasma_raccolto___ne);
            result.setFlag_plasma_raccolto___null(this.flag_plasma_raccolto___null);
            result.setFlag_plasma_raccolto___not___null(this.flag_plasma_raccolto___not___null);
            result.setFlag_presentato___eq(this.flag_presentato___eq);
            result.setFlag_presentato___ne(this.flag_presentato___ne);
            result.setFlag_presentato___null(this.flag_presentato___null);
            result.setFlag_presentato___not___null(this.flag_presentato___not___null);
            result.setFlag_questionari___eq(this.flag_questionari___eq);
            result.setFlag_questionari___ne(this.flag_questionari___ne);
            result.setFlag_questionari___null(this.flag_questionari___null);
            result.setFlag_questionari___not___null(this.flag_questionari___not___null);
            result.setFlag_sangue_intero_raccolto___eq(this.flag_sangue_intero_raccolto___eq);
            result.setFlag_sangue_intero_raccolto___ne(this.flag_sangue_intero_raccolto___ne);
            result.setFlag_sangue_intero_raccolto___null(this.flag_sangue_intero_raccolto___null);
            result.setFlag_sangue_intero_raccolto___not___null(this.flag_sangue_intero_raccolto___not___null);
            result.setFlag_viro_immun___eq(this.flag_viro_immun___eq);
            result.setFlag_viro_immun___ne(this.flag_viro_immun___ne);
            result.setFlag_viro_immun___null(this.flag_viro_immun___null);
            result.setFlag_viro_immun___not___null(this.flag_viro_immun___not___null);
            result.setMese___eq(this.mese___eq);
            result.setMese___ne(this.mese___ne);
            result.setMese___null(this.mese___null);
            result.setMese___not___null(this.mese___not___null);
            result.setMese___in(this.mese___in);
            result.setMese___not___in(this.mese___not___in);
            result.setMese___lt(this.mese___lt);
            result.setMese___lte(this.mese___lte);
            result.setMese___gt(this.mese___gt);
            result.setMese___gte(this.mese___gte);
            result.setPeso___eq(this.peso___eq);
            result.setPeso___ne(this.peso___ne);
            result.setPeso___null(this.peso___null);
            result.setPeso___not___null(this.peso___not___null);
            result.setPlasma_raccolto___eq(this.plasma_raccolto___eq);
            result.setPlasma_raccolto___ne(this.plasma_raccolto___ne);
            result.setPlasma_raccolto___null(this.plasma_raccolto___null);
            result.setPlasma_raccolto___not___null(this.plasma_raccolto___not___null);
            result.setPresentato___eq(this.presentato___eq);
            result.setPresentato___ne(this.presentato___ne);
            result.setPresentato___null(this.presentato___null);
            result.setPresentato___not___null(this.presentato___not___null);
            result.setQuestionari___eq(this.questionari___eq);
            result.setQuestionari___ne(this.questionari___ne);
            result.setQuestionari___null(this.questionari___null);
            result.setQuestionari___not___null(this.questionari___not___null);
            result.setSangue_intero_raccolto___eq(this.sangue_intero_raccolto___eq);
            result.setSangue_intero_raccolto___ne(this.sangue_intero_raccolto___ne);
            result.setSangue_intero_raccolto___null(this.sangue_intero_raccolto___null);
            result.setSangue_intero_raccolto___not___null(this.sangue_intero_raccolto___not___null);
            result.setTempo_visita___eq(this.tempo_visita___eq);
            result.setTempo_visita___ne(this.tempo_visita___ne);
            result.setTempo_visita___null(this.tempo_visita___null);
            result.setTempo_visita___not___null(this.tempo_visita___not___null);
            result.setTempo_visita___in(this.tempo_visita___in);
            result.setTempo_visita___not___in(this.tempo_visita___not___in);
            result.setTempo_visita___lt(this.tempo_visita___lt);
            result.setTempo_visita___lte(this.tempo_visita___lte);
            result.setTempo_visita___gt(this.tempo_visita___gt);
            result.setTempo_visita___gte(this.tempo_visita___gte);
            result.setTempo_visita___contains(this.tempo_visita___contains);
            result.setTempo_visita___not___contains(this.tempo_visita___not___contains);
            result.setTempo_visita___starts_with(this.tempo_visita___starts_with);
            result.setTempo_visita___not___starts_with(this.tempo_visita___not___starts_with);
            result.setTempo_visita___ends_with(this.tempo_visita___ends_with);
            result.setTempo_visita___not___ends_with(this.tempo_visita___not___ends_with);
            result.setViro_immun___eq(this.viro_immun___eq);
            result.setViro_immun___ne(this.viro_immun___ne);
            result.setViro_immun___null(this.viro_immun___null);
            result.setViro_immun___not___null(this.viro_immun___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
