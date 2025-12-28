package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Questionario_PRO_app.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliQuestionario_PRO_appFilterDTO implements java.io.Serializable {

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
    private Boolean alert_obbligatoria1___eq;
    private Boolean alert_obbligatoria1___ne;
    private Boolean alert_obbligatoria1___null;
    private Boolean alert_obbligatoria1___not___null;
    private Boolean alert_obbligatoria2___eq;
    private Boolean alert_obbligatoria2___ne;
    private Boolean alert_obbligatoria2___null;
    private Boolean alert_obbligatoria2___not___null;
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
    private String codice_interno_p___eq;
    private String codice_interno_p___ne;
    private Boolean codice_interno_p___null;
    private Boolean codice_interno_p___not___null;
    private java.util.List<String> codice_interno_p___in;
    private java.util.List<String> codice_interno_p___not___in;
    private String codice_interno_p___lt;
    private String codice_interno_p___lte;
    private String codice_interno_p___gt;
    private String codice_interno_p___gte;
    private String codice_interno_p___contains;
    private String codice_interno_p___not___contains;
    private String codice_interno_p___starts_with;
    private String codice_interno_p___not___starts_with;
    private String codice_interno_p___ends_with;
    private String codice_interno_p___not___ends_with;
    private Boolean confermato___eq;
    private Boolean confermato___ne;
    private Boolean confermato___null;
    private Boolean confermato___not___null;
    private String data_compilazione___eq;
    private String data_compilazione___ne;
    private Boolean data_compilazione___null;
    private Boolean data_compilazione___not___null;
    private java.util.List<String> data_compilazione___in;
    private java.util.List<String> data_compilazione___not___in;
    private String data_compilazione___lt;
    private String data_compilazione___lte;
    private String data_compilazione___gt;
    private String data_compilazione___gte;
    private String domanda_obblig_ids___eq;
    private String domanda_obblig_ids___ne;
    private Boolean domanda_obblig_ids___null;
    private Boolean domanda_obblig_ids___not___null;
    private java.util.List<String> domanda_obblig_ids___in;
    private java.util.List<String> domanda_obblig_ids___not___in;
    private String domanda_obblig_ids___lt;
    private String domanda_obblig_ids___lte;
    private String domanda_obblig_ids___gt;
    private String domanda_obblig_ids___gte;
    private String domanda_obblig_ids___contains;
    private String domanda_obblig_ids___not___contains;
    private String domanda_obblig_ids___starts_with;
    private String domanda_obblig_ids___not___starts_with;
    private String domanda_obblig_ids___ends_with;
    private String domanda_obblig_ids___not___ends_with;
    private String domanda_risp_ids___eq;
    private String domanda_risp_ids___ne;
    private Boolean domanda_risp_ids___null;
    private Boolean domanda_risp_ids___not___null;
    private java.util.List<String> domanda_risp_ids___in;
    private java.util.List<String> domanda_risp_ids___not___in;
    private String domanda_risp_ids___lt;
    private String domanda_risp_ids___lte;
    private String domanda_risp_ids___gt;
    private String domanda_risp_ids___gte;
    private String domanda_risp_ids___contains;
    private String domanda_risp_ids___not___contains;
    private String domanda_risp_ids___starts_with;
    private String domanda_risp_ids___not___starts_with;
    private String domanda_risp_ids___ends_with;
    private String domanda_risp_ids___not___ends_with;
    private Integer domande_totali___eq;
    private Integer domande_totali___ne;
    private Boolean domande_totali___null;
    private Boolean domande_totali___not___null;
    private java.util.List<Integer> domande_totali___in;
    private java.util.List<Integer> domande_totali___not___in;
    private Integer domande_totali___lt;
    private Integer domande_totali___lte;
    private Integer domande_totali___gt;
    private Integer domande_totali___gte;
    private Boolean filtro_classe___eq;
    private Boolean filtro_classe___ne;
    private Boolean filtro_classe___null;
    private Boolean filtro_classe___not___null;
    private Boolean i_filtro_classe___eq;
    private Boolean i_filtro_classe___ne;
    private Boolean i_filtro_classe___null;
    private Boolean i_filtro_classe___not___null;
    private Integer intervallo_compil_mesi___eq;
    private Integer intervallo_compil_mesi___ne;
    private Boolean intervallo_compil_mesi___null;
    private Boolean intervallo_compil_mesi___not___null;
    private java.util.List<Integer> intervallo_compil_mesi___in;
    private java.util.List<Integer> intervallo_compil_mesi___not___in;
    private Integer intervallo_compil_mesi___lt;
    private Integer intervallo_compil_mesi___lte;
    private Integer intervallo_compil_mesi___gt;
    private Integer intervallo_compil_mesi___gte;
    private Integer mesi_trascorsi___eq;
    private Integer mesi_trascorsi___ne;
    private Boolean mesi_trascorsi___null;
    private Boolean mesi_trascorsi___not___null;
    private java.util.List<Integer> mesi_trascorsi___in;
    private java.util.List<Integer> mesi_trascorsi___not___in;
    private Integer mesi_trascorsi___lt;
    private Integer mesi_trascorsi___lte;
    private Integer mesi_trascorsi___gt;
    private Integer mesi_trascorsi___gte;
    private Boolean p_filtro_classe___eq;
    private Boolean p_filtro_classe___ne;
    private Boolean p_filtro_classe___null;
    private Boolean p_filtro_classe___not___null;
    private Boolean parametri_personali___eq;
    private Boolean parametri_personali___ne;
    private Boolean parametri_personali___null;
    private Boolean parametri_personali___not___null;
    private String questionario___eq;
    private String questionario___ne;
    private Boolean questionario___null;
    private Boolean questionario___not___null;
    private java.util.List<String> questionario___in;
    private java.util.List<String> questionario___not___in;
    private String questionario___lt;
    private String questionario___lte;
    private String questionario___gt;
    private String questionario___gte;
    private String questionario___contains;
    private String questionario___not___contains;
    private String questionario___starts_with;
    private String questionario___not___starts_with;
    private String questionario___ends_with;
    private String questionario___not___ends_with;
    private Integer risposte_date___eq;
    private Integer risposte_date___ne;
    private Boolean risposte_date___null;
    private Boolean risposte_date___not___null;
    private java.util.List<Integer> risposte_date___in;
    private java.util.List<Integer> risposte_date___not___in;
    private Integer risposte_date___lt;
    private Integer risposte_date___lte;
    private Integer risposte_date___gt;
    private Integer risposte_date___gte;
    private Integer risposte_mancanti___eq;
    private Integer risposte_mancanti___ne;
    private Boolean risposte_mancanti___null;
    private Boolean risposte_mancanti___not___null;
    private java.util.List<Integer> risposte_mancanti___in;
    private java.util.List<Integer> risposte_mancanti___not___in;
    private Integer risposte_mancanti___lt;
    private Integer risposte_mancanti___lte;
    private Integer risposte_mancanti___gt;
    private Integer risposte_mancanti___gte;
    private String studi_ids___eq;
    private String studi_ids___ne;
    private Boolean studi_ids___null;
    private Boolean studi_ids___not___null;
    private java.util.List<String> studi_ids___in;
    private java.util.List<String> studi_ids___not___in;
    private String studi_ids___lt;
    private String studi_ids___lte;
    private String studi_ids___gt;
    private String studi_ids___gte;
    private String studi_ids___contains;
    private String studi_ids___not___contains;
    private String studi_ids___starts_with;
    private String studi_ids___not___starts_with;
    private String studi_ids___ends_with;
    private String studi_ids___not___ends_with;
    private String studi_ids_b___eq;
    private String studi_ids_b___ne;
    private Boolean studi_ids_b___null;
    private Boolean studi_ids_b___not___null;
    private java.util.List<String> studi_ids_b___in;
    private java.util.List<String> studi_ids_b___not___in;
    private String studi_ids_b___lt;
    private String studi_ids_b___lte;
    private String studi_ids_b___gt;
    private String studi_ids_b___gte;
    private String studi_ids_b___contains;
    private String studi_ids_b___not___contains;
    private String studi_ids_b___starts_with;
    private String studi_ids_b___not___starts_with;
    private String studi_ids_b___ends_with;
    private String studi_ids_b___not___ends_with;
    private String studi_ids_i___eq;
    private String studi_ids_i___ne;
    private Boolean studi_ids_i___null;
    private Boolean studi_ids_i___not___null;
    private java.util.List<String> studi_ids_i___in;
    private java.util.List<String> studi_ids_i___not___in;
    private String studi_ids_i___lt;
    private String studi_ids_i___lte;
    private String studi_ids_i___gt;
    private String studi_ids_i___gte;
    private String studi_ids_i___contains;
    private String studi_ids_i___not___contains;
    private String studi_ids_i___starts_with;
    private String studi_ids_i___not___starts_with;
    private String studi_ids_i___ends_with;
    private String studi_ids_i___not___ends_with;
    private String studi_ids_p___eq;
    private String studi_ids_p___ne;
    private Boolean studi_ids_p___null;
    private Boolean studi_ids_p___not___null;
    private java.util.List<String> studi_ids_p___in;
    private java.util.List<String> studi_ids_p___not___in;
    private String studi_ids_p___lt;
    private String studi_ids_p___lte;
    private String studi_ids_p___gt;
    private String studi_ids_p___gte;
    private String studi_ids_p___contains;
    private String studi_ids_p___not___contains;
    private String studi_ids_p___starts_with;
    private String studi_ids_p___not___starts_with;
    private String studi_ids_p___ends_with;
    private String studi_ids_p___not___ends_with;
    private String studi_ids_r___eq;
    private String studi_ids_r___ne;
    private Boolean studi_ids_r___null;
    private Boolean studi_ids_r___not___null;
    private java.util.List<String> studi_ids_r___in;
    private java.util.List<String> studi_ids_r___not___in;
    private String studi_ids_r___lt;
    private String studi_ids_r___lte;
    private String studi_ids_r___gt;
    private String studi_ids_r___gte;
    private String studi_ids_r___contains;
    private String studi_ids_r___not___contains;
    private String studi_ids_r___starts_with;
    private String studi_ids_r___not___starts_with;
    private String studi_ids_r___ends_with;
    private String studi_ids_r___not___ends_with;
    private String studio_questionario___eq;
    private String studio_questionario___ne;
    private Boolean studio_questionario___null;
    private Boolean studio_questionario___not___null;
    private java.util.List<String> studio_questionario___in;
    private java.util.List<String> studio_questionario___not___in;
    private String studio_questionario___lt;
    private String studio_questionario___lte;
    private String studio_questionario___gt;
    private String studio_questionario___gte;
    private String studio_questionario___contains;
    private String studio_questionario___not___contains;
    private String studio_questionario___starts_with;
    private String studio_questionario___not___starts_with;
    private String studio_questionario___ends_with;
    private String studio_questionario___not___ends_with;
    private java.util.List<CliQuestionario_PRO_appFilterDTO> AND;
    private java.util.List<CliQuestionario_PRO_appFilterDTO> OR;
    private CliQuestionario_PRO_appFilterDTO NOT;

    public CliQuestionario_PRO_appFilterDTO() {
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

    public Boolean getAlert_obbligatoria1___eq() {
        return alert_obbligatoria1___eq;
    }
    public void setAlert_obbligatoria1___eq(Boolean alert_obbligatoria1___eq) {
        this.alert_obbligatoria1___eq = alert_obbligatoria1___eq;
    }

    public Boolean getAlert_obbligatoria1___ne() {
        return alert_obbligatoria1___ne;
    }
    public void setAlert_obbligatoria1___ne(Boolean alert_obbligatoria1___ne) {
        this.alert_obbligatoria1___ne = alert_obbligatoria1___ne;
    }

    public Boolean getAlert_obbligatoria1___null() {
        return alert_obbligatoria1___null;
    }
    public void setAlert_obbligatoria1___null(Boolean alert_obbligatoria1___null) {
        this.alert_obbligatoria1___null = alert_obbligatoria1___null;
    }

    public Boolean getAlert_obbligatoria1___not___null() {
        return alert_obbligatoria1___not___null;
    }
    public void setAlert_obbligatoria1___not___null(Boolean alert_obbligatoria1___not___null) {
        this.alert_obbligatoria1___not___null = alert_obbligatoria1___not___null;
    }

    public Boolean getAlert_obbligatoria2___eq() {
        return alert_obbligatoria2___eq;
    }
    public void setAlert_obbligatoria2___eq(Boolean alert_obbligatoria2___eq) {
        this.alert_obbligatoria2___eq = alert_obbligatoria2___eq;
    }

    public Boolean getAlert_obbligatoria2___ne() {
        return alert_obbligatoria2___ne;
    }
    public void setAlert_obbligatoria2___ne(Boolean alert_obbligatoria2___ne) {
        this.alert_obbligatoria2___ne = alert_obbligatoria2___ne;
    }

    public Boolean getAlert_obbligatoria2___null() {
        return alert_obbligatoria2___null;
    }
    public void setAlert_obbligatoria2___null(Boolean alert_obbligatoria2___null) {
        this.alert_obbligatoria2___null = alert_obbligatoria2___null;
    }

    public Boolean getAlert_obbligatoria2___not___null() {
        return alert_obbligatoria2___not___null;
    }
    public void setAlert_obbligatoria2___not___null(Boolean alert_obbligatoria2___not___null) {
        this.alert_obbligatoria2___not___null = alert_obbligatoria2___not___null;
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

    public String getCodice_interno_p___eq() {
        return codice_interno_p___eq;
    }
    public void setCodice_interno_p___eq(String codice_interno_p___eq) {
        this.codice_interno_p___eq = codice_interno_p___eq;
    }

    public String getCodice_interno_p___ne() {
        return codice_interno_p___ne;
    }
    public void setCodice_interno_p___ne(String codice_interno_p___ne) {
        this.codice_interno_p___ne = codice_interno_p___ne;
    }

    public Boolean getCodice_interno_p___null() {
        return codice_interno_p___null;
    }
    public void setCodice_interno_p___null(Boolean codice_interno_p___null) {
        this.codice_interno_p___null = codice_interno_p___null;
    }

    public Boolean getCodice_interno_p___not___null() {
        return codice_interno_p___not___null;
    }
    public void setCodice_interno_p___not___null(Boolean codice_interno_p___not___null) {
        this.codice_interno_p___not___null = codice_interno_p___not___null;
    }

    public java.util.List<String> getCodice_interno_p___in() {
        return codice_interno_p___in;
    }
    public void setCodice_interno_p___in(java.util.List<String> codice_interno_p___in) {
        this.codice_interno_p___in = codice_interno_p___in;
    }

    public java.util.List<String> getCodice_interno_p___not___in() {
        return codice_interno_p___not___in;
    }
    public void setCodice_interno_p___not___in(java.util.List<String> codice_interno_p___not___in) {
        this.codice_interno_p___not___in = codice_interno_p___not___in;
    }

    public String getCodice_interno_p___lt() {
        return codice_interno_p___lt;
    }
    public void setCodice_interno_p___lt(String codice_interno_p___lt) {
        this.codice_interno_p___lt = codice_interno_p___lt;
    }

    public String getCodice_interno_p___lte() {
        return codice_interno_p___lte;
    }
    public void setCodice_interno_p___lte(String codice_interno_p___lte) {
        this.codice_interno_p___lte = codice_interno_p___lte;
    }

    public String getCodice_interno_p___gt() {
        return codice_interno_p___gt;
    }
    public void setCodice_interno_p___gt(String codice_interno_p___gt) {
        this.codice_interno_p___gt = codice_interno_p___gt;
    }

    public String getCodice_interno_p___gte() {
        return codice_interno_p___gte;
    }
    public void setCodice_interno_p___gte(String codice_interno_p___gte) {
        this.codice_interno_p___gte = codice_interno_p___gte;
    }

    public String getCodice_interno_p___contains() {
        return codice_interno_p___contains;
    }
    public void setCodice_interno_p___contains(String codice_interno_p___contains) {
        this.codice_interno_p___contains = codice_interno_p___contains;
    }

    public String getCodice_interno_p___not___contains() {
        return codice_interno_p___not___contains;
    }
    public void setCodice_interno_p___not___contains(String codice_interno_p___not___contains) {
        this.codice_interno_p___not___contains = codice_interno_p___not___contains;
    }

    public String getCodice_interno_p___starts_with() {
        return codice_interno_p___starts_with;
    }
    public void setCodice_interno_p___starts_with(String codice_interno_p___starts_with) {
        this.codice_interno_p___starts_with = codice_interno_p___starts_with;
    }

    public String getCodice_interno_p___not___starts_with() {
        return codice_interno_p___not___starts_with;
    }
    public void setCodice_interno_p___not___starts_with(String codice_interno_p___not___starts_with) {
        this.codice_interno_p___not___starts_with = codice_interno_p___not___starts_with;
    }

    public String getCodice_interno_p___ends_with() {
        return codice_interno_p___ends_with;
    }
    public void setCodice_interno_p___ends_with(String codice_interno_p___ends_with) {
        this.codice_interno_p___ends_with = codice_interno_p___ends_with;
    }

    public String getCodice_interno_p___not___ends_with() {
        return codice_interno_p___not___ends_with;
    }
    public void setCodice_interno_p___not___ends_with(String codice_interno_p___not___ends_with) {
        this.codice_interno_p___not___ends_with = codice_interno_p___not___ends_with;
    }

    public Boolean getConfermato___eq() {
        return confermato___eq;
    }
    public void setConfermato___eq(Boolean confermato___eq) {
        this.confermato___eq = confermato___eq;
    }

    public Boolean getConfermato___ne() {
        return confermato___ne;
    }
    public void setConfermato___ne(Boolean confermato___ne) {
        this.confermato___ne = confermato___ne;
    }

    public Boolean getConfermato___null() {
        return confermato___null;
    }
    public void setConfermato___null(Boolean confermato___null) {
        this.confermato___null = confermato___null;
    }

    public Boolean getConfermato___not___null() {
        return confermato___not___null;
    }
    public void setConfermato___not___null(Boolean confermato___not___null) {
        this.confermato___not___null = confermato___not___null;
    }

    public String getData_compilazione___eq() {
        return data_compilazione___eq;
    }
    public void setData_compilazione___eq(String data_compilazione___eq) {
        this.data_compilazione___eq = data_compilazione___eq;
    }

    public String getData_compilazione___ne() {
        return data_compilazione___ne;
    }
    public void setData_compilazione___ne(String data_compilazione___ne) {
        this.data_compilazione___ne = data_compilazione___ne;
    }

    public Boolean getData_compilazione___null() {
        return data_compilazione___null;
    }
    public void setData_compilazione___null(Boolean data_compilazione___null) {
        this.data_compilazione___null = data_compilazione___null;
    }

    public Boolean getData_compilazione___not___null() {
        return data_compilazione___not___null;
    }
    public void setData_compilazione___not___null(Boolean data_compilazione___not___null) {
        this.data_compilazione___not___null = data_compilazione___not___null;
    }

    public java.util.List<String> getData_compilazione___in() {
        return data_compilazione___in;
    }
    public void setData_compilazione___in(java.util.List<String> data_compilazione___in) {
        this.data_compilazione___in = data_compilazione___in;
    }

    public java.util.List<String> getData_compilazione___not___in() {
        return data_compilazione___not___in;
    }
    public void setData_compilazione___not___in(java.util.List<String> data_compilazione___not___in) {
        this.data_compilazione___not___in = data_compilazione___not___in;
    }

    public String getData_compilazione___lt() {
        return data_compilazione___lt;
    }
    public void setData_compilazione___lt(String data_compilazione___lt) {
        this.data_compilazione___lt = data_compilazione___lt;
    }

    public String getData_compilazione___lte() {
        return data_compilazione___lte;
    }
    public void setData_compilazione___lte(String data_compilazione___lte) {
        this.data_compilazione___lte = data_compilazione___lte;
    }

    public String getData_compilazione___gt() {
        return data_compilazione___gt;
    }
    public void setData_compilazione___gt(String data_compilazione___gt) {
        this.data_compilazione___gt = data_compilazione___gt;
    }

    public String getData_compilazione___gte() {
        return data_compilazione___gte;
    }
    public void setData_compilazione___gte(String data_compilazione___gte) {
        this.data_compilazione___gte = data_compilazione___gte;
    }

    public String getDomanda_obblig_ids___eq() {
        return domanda_obblig_ids___eq;
    }
    public void setDomanda_obblig_ids___eq(String domanda_obblig_ids___eq) {
        this.domanda_obblig_ids___eq = domanda_obblig_ids___eq;
    }

    public String getDomanda_obblig_ids___ne() {
        return domanda_obblig_ids___ne;
    }
    public void setDomanda_obblig_ids___ne(String domanda_obblig_ids___ne) {
        this.domanda_obblig_ids___ne = domanda_obblig_ids___ne;
    }

    public Boolean getDomanda_obblig_ids___null() {
        return domanda_obblig_ids___null;
    }
    public void setDomanda_obblig_ids___null(Boolean domanda_obblig_ids___null) {
        this.domanda_obblig_ids___null = domanda_obblig_ids___null;
    }

    public Boolean getDomanda_obblig_ids___not___null() {
        return domanda_obblig_ids___not___null;
    }
    public void setDomanda_obblig_ids___not___null(Boolean domanda_obblig_ids___not___null) {
        this.domanda_obblig_ids___not___null = domanda_obblig_ids___not___null;
    }

    public java.util.List<String> getDomanda_obblig_ids___in() {
        return domanda_obblig_ids___in;
    }
    public void setDomanda_obblig_ids___in(java.util.List<String> domanda_obblig_ids___in) {
        this.domanda_obblig_ids___in = domanda_obblig_ids___in;
    }

    public java.util.List<String> getDomanda_obblig_ids___not___in() {
        return domanda_obblig_ids___not___in;
    }
    public void setDomanda_obblig_ids___not___in(java.util.List<String> domanda_obblig_ids___not___in) {
        this.domanda_obblig_ids___not___in = domanda_obblig_ids___not___in;
    }

    public String getDomanda_obblig_ids___lt() {
        return domanda_obblig_ids___lt;
    }
    public void setDomanda_obblig_ids___lt(String domanda_obblig_ids___lt) {
        this.domanda_obblig_ids___lt = domanda_obblig_ids___lt;
    }

    public String getDomanda_obblig_ids___lte() {
        return domanda_obblig_ids___lte;
    }
    public void setDomanda_obblig_ids___lte(String domanda_obblig_ids___lte) {
        this.domanda_obblig_ids___lte = domanda_obblig_ids___lte;
    }

    public String getDomanda_obblig_ids___gt() {
        return domanda_obblig_ids___gt;
    }
    public void setDomanda_obblig_ids___gt(String domanda_obblig_ids___gt) {
        this.domanda_obblig_ids___gt = domanda_obblig_ids___gt;
    }

    public String getDomanda_obblig_ids___gte() {
        return domanda_obblig_ids___gte;
    }
    public void setDomanda_obblig_ids___gte(String domanda_obblig_ids___gte) {
        this.domanda_obblig_ids___gte = domanda_obblig_ids___gte;
    }

    public String getDomanda_obblig_ids___contains() {
        return domanda_obblig_ids___contains;
    }
    public void setDomanda_obblig_ids___contains(String domanda_obblig_ids___contains) {
        this.domanda_obblig_ids___contains = domanda_obblig_ids___contains;
    }

    public String getDomanda_obblig_ids___not___contains() {
        return domanda_obblig_ids___not___contains;
    }
    public void setDomanda_obblig_ids___not___contains(String domanda_obblig_ids___not___contains) {
        this.domanda_obblig_ids___not___contains = domanda_obblig_ids___not___contains;
    }

    public String getDomanda_obblig_ids___starts_with() {
        return domanda_obblig_ids___starts_with;
    }
    public void setDomanda_obblig_ids___starts_with(String domanda_obblig_ids___starts_with) {
        this.domanda_obblig_ids___starts_with = domanda_obblig_ids___starts_with;
    }

    public String getDomanda_obblig_ids___not___starts_with() {
        return domanda_obblig_ids___not___starts_with;
    }
    public void setDomanda_obblig_ids___not___starts_with(String domanda_obblig_ids___not___starts_with) {
        this.domanda_obblig_ids___not___starts_with = domanda_obblig_ids___not___starts_with;
    }

    public String getDomanda_obblig_ids___ends_with() {
        return domanda_obblig_ids___ends_with;
    }
    public void setDomanda_obblig_ids___ends_with(String domanda_obblig_ids___ends_with) {
        this.domanda_obblig_ids___ends_with = domanda_obblig_ids___ends_with;
    }

    public String getDomanda_obblig_ids___not___ends_with() {
        return domanda_obblig_ids___not___ends_with;
    }
    public void setDomanda_obblig_ids___not___ends_with(String domanda_obblig_ids___not___ends_with) {
        this.domanda_obblig_ids___not___ends_with = domanda_obblig_ids___not___ends_with;
    }

    public String getDomanda_risp_ids___eq() {
        return domanda_risp_ids___eq;
    }
    public void setDomanda_risp_ids___eq(String domanda_risp_ids___eq) {
        this.domanda_risp_ids___eq = domanda_risp_ids___eq;
    }

    public String getDomanda_risp_ids___ne() {
        return domanda_risp_ids___ne;
    }
    public void setDomanda_risp_ids___ne(String domanda_risp_ids___ne) {
        this.domanda_risp_ids___ne = domanda_risp_ids___ne;
    }

    public Boolean getDomanda_risp_ids___null() {
        return domanda_risp_ids___null;
    }
    public void setDomanda_risp_ids___null(Boolean domanda_risp_ids___null) {
        this.domanda_risp_ids___null = domanda_risp_ids___null;
    }

    public Boolean getDomanda_risp_ids___not___null() {
        return domanda_risp_ids___not___null;
    }
    public void setDomanda_risp_ids___not___null(Boolean domanda_risp_ids___not___null) {
        this.domanda_risp_ids___not___null = domanda_risp_ids___not___null;
    }

    public java.util.List<String> getDomanda_risp_ids___in() {
        return domanda_risp_ids___in;
    }
    public void setDomanda_risp_ids___in(java.util.List<String> domanda_risp_ids___in) {
        this.domanda_risp_ids___in = domanda_risp_ids___in;
    }

    public java.util.List<String> getDomanda_risp_ids___not___in() {
        return domanda_risp_ids___not___in;
    }
    public void setDomanda_risp_ids___not___in(java.util.List<String> domanda_risp_ids___not___in) {
        this.domanda_risp_ids___not___in = domanda_risp_ids___not___in;
    }

    public String getDomanda_risp_ids___lt() {
        return domanda_risp_ids___lt;
    }
    public void setDomanda_risp_ids___lt(String domanda_risp_ids___lt) {
        this.domanda_risp_ids___lt = domanda_risp_ids___lt;
    }

    public String getDomanda_risp_ids___lte() {
        return domanda_risp_ids___lte;
    }
    public void setDomanda_risp_ids___lte(String domanda_risp_ids___lte) {
        this.domanda_risp_ids___lte = domanda_risp_ids___lte;
    }

    public String getDomanda_risp_ids___gt() {
        return domanda_risp_ids___gt;
    }
    public void setDomanda_risp_ids___gt(String domanda_risp_ids___gt) {
        this.domanda_risp_ids___gt = domanda_risp_ids___gt;
    }

    public String getDomanda_risp_ids___gte() {
        return domanda_risp_ids___gte;
    }
    public void setDomanda_risp_ids___gte(String domanda_risp_ids___gte) {
        this.domanda_risp_ids___gte = domanda_risp_ids___gte;
    }

    public String getDomanda_risp_ids___contains() {
        return domanda_risp_ids___contains;
    }
    public void setDomanda_risp_ids___contains(String domanda_risp_ids___contains) {
        this.domanda_risp_ids___contains = domanda_risp_ids___contains;
    }

    public String getDomanda_risp_ids___not___contains() {
        return domanda_risp_ids___not___contains;
    }
    public void setDomanda_risp_ids___not___contains(String domanda_risp_ids___not___contains) {
        this.domanda_risp_ids___not___contains = domanda_risp_ids___not___contains;
    }

    public String getDomanda_risp_ids___starts_with() {
        return domanda_risp_ids___starts_with;
    }
    public void setDomanda_risp_ids___starts_with(String domanda_risp_ids___starts_with) {
        this.domanda_risp_ids___starts_with = domanda_risp_ids___starts_with;
    }

    public String getDomanda_risp_ids___not___starts_with() {
        return domanda_risp_ids___not___starts_with;
    }
    public void setDomanda_risp_ids___not___starts_with(String domanda_risp_ids___not___starts_with) {
        this.domanda_risp_ids___not___starts_with = domanda_risp_ids___not___starts_with;
    }

    public String getDomanda_risp_ids___ends_with() {
        return domanda_risp_ids___ends_with;
    }
    public void setDomanda_risp_ids___ends_with(String domanda_risp_ids___ends_with) {
        this.domanda_risp_ids___ends_with = domanda_risp_ids___ends_with;
    }

    public String getDomanda_risp_ids___not___ends_with() {
        return domanda_risp_ids___not___ends_with;
    }
    public void setDomanda_risp_ids___not___ends_with(String domanda_risp_ids___not___ends_with) {
        this.domanda_risp_ids___not___ends_with = domanda_risp_ids___not___ends_with;
    }

    public Integer getDomande_totali___eq() {
        return domande_totali___eq;
    }
    public void setDomande_totali___eq(Integer domande_totali___eq) {
        this.domande_totali___eq = domande_totali___eq;
    }

    public Integer getDomande_totali___ne() {
        return domande_totali___ne;
    }
    public void setDomande_totali___ne(Integer domande_totali___ne) {
        this.domande_totali___ne = domande_totali___ne;
    }

    public Boolean getDomande_totali___null() {
        return domande_totali___null;
    }
    public void setDomande_totali___null(Boolean domande_totali___null) {
        this.domande_totali___null = domande_totali___null;
    }

    public Boolean getDomande_totali___not___null() {
        return domande_totali___not___null;
    }
    public void setDomande_totali___not___null(Boolean domande_totali___not___null) {
        this.domande_totali___not___null = domande_totali___not___null;
    }

    public java.util.List<Integer> getDomande_totali___in() {
        return domande_totali___in;
    }
    public void setDomande_totali___in(java.util.List<Integer> domande_totali___in) {
        this.domande_totali___in = domande_totali___in;
    }

    public java.util.List<Integer> getDomande_totali___not___in() {
        return domande_totali___not___in;
    }
    public void setDomande_totali___not___in(java.util.List<Integer> domande_totali___not___in) {
        this.domande_totali___not___in = domande_totali___not___in;
    }

    public Integer getDomande_totali___lt() {
        return domande_totali___lt;
    }
    public void setDomande_totali___lt(Integer domande_totali___lt) {
        this.domande_totali___lt = domande_totali___lt;
    }

    public Integer getDomande_totali___lte() {
        return domande_totali___lte;
    }
    public void setDomande_totali___lte(Integer domande_totali___lte) {
        this.domande_totali___lte = domande_totali___lte;
    }

    public Integer getDomande_totali___gt() {
        return domande_totali___gt;
    }
    public void setDomande_totali___gt(Integer domande_totali___gt) {
        this.domande_totali___gt = domande_totali___gt;
    }

    public Integer getDomande_totali___gte() {
        return domande_totali___gte;
    }
    public void setDomande_totali___gte(Integer domande_totali___gte) {
        this.domande_totali___gte = domande_totali___gte;
    }

    public Boolean getFiltro_classe___eq() {
        return filtro_classe___eq;
    }
    public void setFiltro_classe___eq(Boolean filtro_classe___eq) {
        this.filtro_classe___eq = filtro_classe___eq;
    }

    public Boolean getFiltro_classe___ne() {
        return filtro_classe___ne;
    }
    public void setFiltro_classe___ne(Boolean filtro_classe___ne) {
        this.filtro_classe___ne = filtro_classe___ne;
    }

    public Boolean getFiltro_classe___null() {
        return filtro_classe___null;
    }
    public void setFiltro_classe___null(Boolean filtro_classe___null) {
        this.filtro_classe___null = filtro_classe___null;
    }

    public Boolean getFiltro_classe___not___null() {
        return filtro_classe___not___null;
    }
    public void setFiltro_classe___not___null(Boolean filtro_classe___not___null) {
        this.filtro_classe___not___null = filtro_classe___not___null;
    }

    public Boolean getI_filtro_classe___eq() {
        return i_filtro_classe___eq;
    }
    public void setI_filtro_classe___eq(Boolean i_filtro_classe___eq) {
        this.i_filtro_classe___eq = i_filtro_classe___eq;
    }

    public Boolean getI_filtro_classe___ne() {
        return i_filtro_classe___ne;
    }
    public void setI_filtro_classe___ne(Boolean i_filtro_classe___ne) {
        this.i_filtro_classe___ne = i_filtro_classe___ne;
    }

    public Boolean getI_filtro_classe___null() {
        return i_filtro_classe___null;
    }
    public void setI_filtro_classe___null(Boolean i_filtro_classe___null) {
        this.i_filtro_classe___null = i_filtro_classe___null;
    }

    public Boolean getI_filtro_classe___not___null() {
        return i_filtro_classe___not___null;
    }
    public void setI_filtro_classe___not___null(Boolean i_filtro_classe___not___null) {
        this.i_filtro_classe___not___null = i_filtro_classe___not___null;
    }

    public Integer getIntervallo_compil_mesi___eq() {
        return intervallo_compil_mesi___eq;
    }
    public void setIntervallo_compil_mesi___eq(Integer intervallo_compil_mesi___eq) {
        this.intervallo_compil_mesi___eq = intervallo_compil_mesi___eq;
    }

    public Integer getIntervallo_compil_mesi___ne() {
        return intervallo_compil_mesi___ne;
    }
    public void setIntervallo_compil_mesi___ne(Integer intervallo_compil_mesi___ne) {
        this.intervallo_compil_mesi___ne = intervallo_compil_mesi___ne;
    }

    public Boolean getIntervallo_compil_mesi___null() {
        return intervallo_compil_mesi___null;
    }
    public void setIntervallo_compil_mesi___null(Boolean intervallo_compil_mesi___null) {
        this.intervallo_compil_mesi___null = intervallo_compil_mesi___null;
    }

    public Boolean getIntervallo_compil_mesi___not___null() {
        return intervallo_compil_mesi___not___null;
    }
    public void setIntervallo_compil_mesi___not___null(Boolean intervallo_compil_mesi___not___null) {
        this.intervallo_compil_mesi___not___null = intervallo_compil_mesi___not___null;
    }

    public java.util.List<Integer> getIntervallo_compil_mesi___in() {
        return intervallo_compil_mesi___in;
    }
    public void setIntervallo_compil_mesi___in(java.util.List<Integer> intervallo_compil_mesi___in) {
        this.intervallo_compil_mesi___in = intervallo_compil_mesi___in;
    }

    public java.util.List<Integer> getIntervallo_compil_mesi___not___in() {
        return intervallo_compil_mesi___not___in;
    }
    public void setIntervallo_compil_mesi___not___in(java.util.List<Integer> intervallo_compil_mesi___not___in) {
        this.intervallo_compil_mesi___not___in = intervallo_compil_mesi___not___in;
    }

    public Integer getIntervallo_compil_mesi___lt() {
        return intervallo_compil_mesi___lt;
    }
    public void setIntervallo_compil_mesi___lt(Integer intervallo_compil_mesi___lt) {
        this.intervallo_compil_mesi___lt = intervallo_compil_mesi___lt;
    }

    public Integer getIntervallo_compil_mesi___lte() {
        return intervallo_compil_mesi___lte;
    }
    public void setIntervallo_compil_mesi___lte(Integer intervallo_compil_mesi___lte) {
        this.intervallo_compil_mesi___lte = intervallo_compil_mesi___lte;
    }

    public Integer getIntervallo_compil_mesi___gt() {
        return intervallo_compil_mesi___gt;
    }
    public void setIntervallo_compil_mesi___gt(Integer intervallo_compil_mesi___gt) {
        this.intervallo_compil_mesi___gt = intervallo_compil_mesi___gt;
    }

    public Integer getIntervallo_compil_mesi___gte() {
        return intervallo_compil_mesi___gte;
    }
    public void setIntervallo_compil_mesi___gte(Integer intervallo_compil_mesi___gte) {
        this.intervallo_compil_mesi___gte = intervallo_compil_mesi___gte;
    }

    public Integer getMesi_trascorsi___eq() {
        return mesi_trascorsi___eq;
    }
    public void setMesi_trascorsi___eq(Integer mesi_trascorsi___eq) {
        this.mesi_trascorsi___eq = mesi_trascorsi___eq;
    }

    public Integer getMesi_trascorsi___ne() {
        return mesi_trascorsi___ne;
    }
    public void setMesi_trascorsi___ne(Integer mesi_trascorsi___ne) {
        this.mesi_trascorsi___ne = mesi_trascorsi___ne;
    }

    public Boolean getMesi_trascorsi___null() {
        return mesi_trascorsi___null;
    }
    public void setMesi_trascorsi___null(Boolean mesi_trascorsi___null) {
        this.mesi_trascorsi___null = mesi_trascorsi___null;
    }

    public Boolean getMesi_trascorsi___not___null() {
        return mesi_trascorsi___not___null;
    }
    public void setMesi_trascorsi___not___null(Boolean mesi_trascorsi___not___null) {
        this.mesi_trascorsi___not___null = mesi_trascorsi___not___null;
    }

    public java.util.List<Integer> getMesi_trascorsi___in() {
        return mesi_trascorsi___in;
    }
    public void setMesi_trascorsi___in(java.util.List<Integer> mesi_trascorsi___in) {
        this.mesi_trascorsi___in = mesi_trascorsi___in;
    }

    public java.util.List<Integer> getMesi_trascorsi___not___in() {
        return mesi_trascorsi___not___in;
    }
    public void setMesi_trascorsi___not___in(java.util.List<Integer> mesi_trascorsi___not___in) {
        this.mesi_trascorsi___not___in = mesi_trascorsi___not___in;
    }

    public Integer getMesi_trascorsi___lt() {
        return mesi_trascorsi___lt;
    }
    public void setMesi_trascorsi___lt(Integer mesi_trascorsi___lt) {
        this.mesi_trascorsi___lt = mesi_trascorsi___lt;
    }

    public Integer getMesi_trascorsi___lte() {
        return mesi_trascorsi___lte;
    }
    public void setMesi_trascorsi___lte(Integer mesi_trascorsi___lte) {
        this.mesi_trascorsi___lte = mesi_trascorsi___lte;
    }

    public Integer getMesi_trascorsi___gt() {
        return mesi_trascorsi___gt;
    }
    public void setMesi_trascorsi___gt(Integer mesi_trascorsi___gt) {
        this.mesi_trascorsi___gt = mesi_trascorsi___gt;
    }

    public Integer getMesi_trascorsi___gte() {
        return mesi_trascorsi___gte;
    }
    public void setMesi_trascorsi___gte(Integer mesi_trascorsi___gte) {
        this.mesi_trascorsi___gte = mesi_trascorsi___gte;
    }

    public Boolean getP_filtro_classe___eq() {
        return p_filtro_classe___eq;
    }
    public void setP_filtro_classe___eq(Boolean p_filtro_classe___eq) {
        this.p_filtro_classe___eq = p_filtro_classe___eq;
    }

    public Boolean getP_filtro_classe___ne() {
        return p_filtro_classe___ne;
    }
    public void setP_filtro_classe___ne(Boolean p_filtro_classe___ne) {
        this.p_filtro_classe___ne = p_filtro_classe___ne;
    }

    public Boolean getP_filtro_classe___null() {
        return p_filtro_classe___null;
    }
    public void setP_filtro_classe___null(Boolean p_filtro_classe___null) {
        this.p_filtro_classe___null = p_filtro_classe___null;
    }

    public Boolean getP_filtro_classe___not___null() {
        return p_filtro_classe___not___null;
    }
    public void setP_filtro_classe___not___null(Boolean p_filtro_classe___not___null) {
        this.p_filtro_classe___not___null = p_filtro_classe___not___null;
    }

    public Boolean getParametri_personali___eq() {
        return parametri_personali___eq;
    }
    public void setParametri_personali___eq(Boolean parametri_personali___eq) {
        this.parametri_personali___eq = parametri_personali___eq;
    }

    public Boolean getParametri_personali___ne() {
        return parametri_personali___ne;
    }
    public void setParametri_personali___ne(Boolean parametri_personali___ne) {
        this.parametri_personali___ne = parametri_personali___ne;
    }

    public Boolean getParametri_personali___null() {
        return parametri_personali___null;
    }
    public void setParametri_personali___null(Boolean parametri_personali___null) {
        this.parametri_personali___null = parametri_personali___null;
    }

    public Boolean getParametri_personali___not___null() {
        return parametri_personali___not___null;
    }
    public void setParametri_personali___not___null(Boolean parametri_personali___not___null) {
        this.parametri_personali___not___null = parametri_personali___not___null;
    }

    public String getQuestionario___eq() {
        return questionario___eq;
    }
    public void setQuestionario___eq(String questionario___eq) {
        this.questionario___eq = questionario___eq;
    }

    public String getQuestionario___ne() {
        return questionario___ne;
    }
    public void setQuestionario___ne(String questionario___ne) {
        this.questionario___ne = questionario___ne;
    }

    public Boolean getQuestionario___null() {
        return questionario___null;
    }
    public void setQuestionario___null(Boolean questionario___null) {
        this.questionario___null = questionario___null;
    }

    public Boolean getQuestionario___not___null() {
        return questionario___not___null;
    }
    public void setQuestionario___not___null(Boolean questionario___not___null) {
        this.questionario___not___null = questionario___not___null;
    }

    public java.util.List<String> getQuestionario___in() {
        return questionario___in;
    }
    public void setQuestionario___in(java.util.List<String> questionario___in) {
        this.questionario___in = questionario___in;
    }

    public java.util.List<String> getQuestionario___not___in() {
        return questionario___not___in;
    }
    public void setQuestionario___not___in(java.util.List<String> questionario___not___in) {
        this.questionario___not___in = questionario___not___in;
    }

    public String getQuestionario___lt() {
        return questionario___lt;
    }
    public void setQuestionario___lt(String questionario___lt) {
        this.questionario___lt = questionario___lt;
    }

    public String getQuestionario___lte() {
        return questionario___lte;
    }
    public void setQuestionario___lte(String questionario___lte) {
        this.questionario___lte = questionario___lte;
    }

    public String getQuestionario___gt() {
        return questionario___gt;
    }
    public void setQuestionario___gt(String questionario___gt) {
        this.questionario___gt = questionario___gt;
    }

    public String getQuestionario___gte() {
        return questionario___gte;
    }
    public void setQuestionario___gte(String questionario___gte) {
        this.questionario___gte = questionario___gte;
    }

    public String getQuestionario___contains() {
        return questionario___contains;
    }
    public void setQuestionario___contains(String questionario___contains) {
        this.questionario___contains = questionario___contains;
    }

    public String getQuestionario___not___contains() {
        return questionario___not___contains;
    }
    public void setQuestionario___not___contains(String questionario___not___contains) {
        this.questionario___not___contains = questionario___not___contains;
    }

    public String getQuestionario___starts_with() {
        return questionario___starts_with;
    }
    public void setQuestionario___starts_with(String questionario___starts_with) {
        this.questionario___starts_with = questionario___starts_with;
    }

    public String getQuestionario___not___starts_with() {
        return questionario___not___starts_with;
    }
    public void setQuestionario___not___starts_with(String questionario___not___starts_with) {
        this.questionario___not___starts_with = questionario___not___starts_with;
    }

    public String getQuestionario___ends_with() {
        return questionario___ends_with;
    }
    public void setQuestionario___ends_with(String questionario___ends_with) {
        this.questionario___ends_with = questionario___ends_with;
    }

    public String getQuestionario___not___ends_with() {
        return questionario___not___ends_with;
    }
    public void setQuestionario___not___ends_with(String questionario___not___ends_with) {
        this.questionario___not___ends_with = questionario___not___ends_with;
    }

    public Integer getRisposte_date___eq() {
        return risposte_date___eq;
    }
    public void setRisposte_date___eq(Integer risposte_date___eq) {
        this.risposte_date___eq = risposte_date___eq;
    }

    public Integer getRisposte_date___ne() {
        return risposte_date___ne;
    }
    public void setRisposte_date___ne(Integer risposte_date___ne) {
        this.risposte_date___ne = risposte_date___ne;
    }

    public Boolean getRisposte_date___null() {
        return risposte_date___null;
    }
    public void setRisposte_date___null(Boolean risposte_date___null) {
        this.risposte_date___null = risposte_date___null;
    }

    public Boolean getRisposte_date___not___null() {
        return risposte_date___not___null;
    }
    public void setRisposte_date___not___null(Boolean risposte_date___not___null) {
        this.risposte_date___not___null = risposte_date___not___null;
    }

    public java.util.List<Integer> getRisposte_date___in() {
        return risposte_date___in;
    }
    public void setRisposte_date___in(java.util.List<Integer> risposte_date___in) {
        this.risposte_date___in = risposte_date___in;
    }

    public java.util.List<Integer> getRisposte_date___not___in() {
        return risposte_date___not___in;
    }
    public void setRisposte_date___not___in(java.util.List<Integer> risposte_date___not___in) {
        this.risposte_date___not___in = risposte_date___not___in;
    }

    public Integer getRisposte_date___lt() {
        return risposte_date___lt;
    }
    public void setRisposte_date___lt(Integer risposte_date___lt) {
        this.risposte_date___lt = risposte_date___lt;
    }

    public Integer getRisposte_date___lte() {
        return risposte_date___lte;
    }
    public void setRisposte_date___lte(Integer risposte_date___lte) {
        this.risposte_date___lte = risposte_date___lte;
    }

    public Integer getRisposte_date___gt() {
        return risposte_date___gt;
    }
    public void setRisposte_date___gt(Integer risposte_date___gt) {
        this.risposte_date___gt = risposte_date___gt;
    }

    public Integer getRisposte_date___gte() {
        return risposte_date___gte;
    }
    public void setRisposte_date___gte(Integer risposte_date___gte) {
        this.risposte_date___gte = risposte_date___gte;
    }

    public Integer getRisposte_mancanti___eq() {
        return risposte_mancanti___eq;
    }
    public void setRisposte_mancanti___eq(Integer risposte_mancanti___eq) {
        this.risposte_mancanti___eq = risposte_mancanti___eq;
    }

    public Integer getRisposte_mancanti___ne() {
        return risposte_mancanti___ne;
    }
    public void setRisposte_mancanti___ne(Integer risposte_mancanti___ne) {
        this.risposte_mancanti___ne = risposte_mancanti___ne;
    }

    public Boolean getRisposte_mancanti___null() {
        return risposte_mancanti___null;
    }
    public void setRisposte_mancanti___null(Boolean risposte_mancanti___null) {
        this.risposte_mancanti___null = risposte_mancanti___null;
    }

    public Boolean getRisposte_mancanti___not___null() {
        return risposte_mancanti___not___null;
    }
    public void setRisposte_mancanti___not___null(Boolean risposte_mancanti___not___null) {
        this.risposte_mancanti___not___null = risposte_mancanti___not___null;
    }

    public java.util.List<Integer> getRisposte_mancanti___in() {
        return risposte_mancanti___in;
    }
    public void setRisposte_mancanti___in(java.util.List<Integer> risposte_mancanti___in) {
        this.risposte_mancanti___in = risposte_mancanti___in;
    }

    public java.util.List<Integer> getRisposte_mancanti___not___in() {
        return risposte_mancanti___not___in;
    }
    public void setRisposte_mancanti___not___in(java.util.List<Integer> risposte_mancanti___not___in) {
        this.risposte_mancanti___not___in = risposte_mancanti___not___in;
    }

    public Integer getRisposte_mancanti___lt() {
        return risposte_mancanti___lt;
    }
    public void setRisposte_mancanti___lt(Integer risposte_mancanti___lt) {
        this.risposte_mancanti___lt = risposte_mancanti___lt;
    }

    public Integer getRisposte_mancanti___lte() {
        return risposte_mancanti___lte;
    }
    public void setRisposte_mancanti___lte(Integer risposte_mancanti___lte) {
        this.risposte_mancanti___lte = risposte_mancanti___lte;
    }

    public Integer getRisposte_mancanti___gt() {
        return risposte_mancanti___gt;
    }
    public void setRisposte_mancanti___gt(Integer risposte_mancanti___gt) {
        this.risposte_mancanti___gt = risposte_mancanti___gt;
    }

    public Integer getRisposte_mancanti___gte() {
        return risposte_mancanti___gte;
    }
    public void setRisposte_mancanti___gte(Integer risposte_mancanti___gte) {
        this.risposte_mancanti___gte = risposte_mancanti___gte;
    }

    public String getStudi_ids___eq() {
        return studi_ids___eq;
    }
    public void setStudi_ids___eq(String studi_ids___eq) {
        this.studi_ids___eq = studi_ids___eq;
    }

    public String getStudi_ids___ne() {
        return studi_ids___ne;
    }
    public void setStudi_ids___ne(String studi_ids___ne) {
        this.studi_ids___ne = studi_ids___ne;
    }

    public Boolean getStudi_ids___null() {
        return studi_ids___null;
    }
    public void setStudi_ids___null(Boolean studi_ids___null) {
        this.studi_ids___null = studi_ids___null;
    }

    public Boolean getStudi_ids___not___null() {
        return studi_ids___not___null;
    }
    public void setStudi_ids___not___null(Boolean studi_ids___not___null) {
        this.studi_ids___not___null = studi_ids___not___null;
    }

    public java.util.List<String> getStudi_ids___in() {
        return studi_ids___in;
    }
    public void setStudi_ids___in(java.util.List<String> studi_ids___in) {
        this.studi_ids___in = studi_ids___in;
    }

    public java.util.List<String> getStudi_ids___not___in() {
        return studi_ids___not___in;
    }
    public void setStudi_ids___not___in(java.util.List<String> studi_ids___not___in) {
        this.studi_ids___not___in = studi_ids___not___in;
    }

    public String getStudi_ids___lt() {
        return studi_ids___lt;
    }
    public void setStudi_ids___lt(String studi_ids___lt) {
        this.studi_ids___lt = studi_ids___lt;
    }

    public String getStudi_ids___lte() {
        return studi_ids___lte;
    }
    public void setStudi_ids___lte(String studi_ids___lte) {
        this.studi_ids___lte = studi_ids___lte;
    }

    public String getStudi_ids___gt() {
        return studi_ids___gt;
    }
    public void setStudi_ids___gt(String studi_ids___gt) {
        this.studi_ids___gt = studi_ids___gt;
    }

    public String getStudi_ids___gte() {
        return studi_ids___gte;
    }
    public void setStudi_ids___gte(String studi_ids___gte) {
        this.studi_ids___gte = studi_ids___gte;
    }

    public String getStudi_ids___contains() {
        return studi_ids___contains;
    }
    public void setStudi_ids___contains(String studi_ids___contains) {
        this.studi_ids___contains = studi_ids___contains;
    }

    public String getStudi_ids___not___contains() {
        return studi_ids___not___contains;
    }
    public void setStudi_ids___not___contains(String studi_ids___not___contains) {
        this.studi_ids___not___contains = studi_ids___not___contains;
    }

    public String getStudi_ids___starts_with() {
        return studi_ids___starts_with;
    }
    public void setStudi_ids___starts_with(String studi_ids___starts_with) {
        this.studi_ids___starts_with = studi_ids___starts_with;
    }

    public String getStudi_ids___not___starts_with() {
        return studi_ids___not___starts_with;
    }
    public void setStudi_ids___not___starts_with(String studi_ids___not___starts_with) {
        this.studi_ids___not___starts_with = studi_ids___not___starts_with;
    }

    public String getStudi_ids___ends_with() {
        return studi_ids___ends_with;
    }
    public void setStudi_ids___ends_with(String studi_ids___ends_with) {
        this.studi_ids___ends_with = studi_ids___ends_with;
    }

    public String getStudi_ids___not___ends_with() {
        return studi_ids___not___ends_with;
    }
    public void setStudi_ids___not___ends_with(String studi_ids___not___ends_with) {
        this.studi_ids___not___ends_with = studi_ids___not___ends_with;
    }

    public String getStudi_ids_b___eq() {
        return studi_ids_b___eq;
    }
    public void setStudi_ids_b___eq(String studi_ids_b___eq) {
        this.studi_ids_b___eq = studi_ids_b___eq;
    }

    public String getStudi_ids_b___ne() {
        return studi_ids_b___ne;
    }
    public void setStudi_ids_b___ne(String studi_ids_b___ne) {
        this.studi_ids_b___ne = studi_ids_b___ne;
    }

    public Boolean getStudi_ids_b___null() {
        return studi_ids_b___null;
    }
    public void setStudi_ids_b___null(Boolean studi_ids_b___null) {
        this.studi_ids_b___null = studi_ids_b___null;
    }

    public Boolean getStudi_ids_b___not___null() {
        return studi_ids_b___not___null;
    }
    public void setStudi_ids_b___not___null(Boolean studi_ids_b___not___null) {
        this.studi_ids_b___not___null = studi_ids_b___not___null;
    }

    public java.util.List<String> getStudi_ids_b___in() {
        return studi_ids_b___in;
    }
    public void setStudi_ids_b___in(java.util.List<String> studi_ids_b___in) {
        this.studi_ids_b___in = studi_ids_b___in;
    }

    public java.util.List<String> getStudi_ids_b___not___in() {
        return studi_ids_b___not___in;
    }
    public void setStudi_ids_b___not___in(java.util.List<String> studi_ids_b___not___in) {
        this.studi_ids_b___not___in = studi_ids_b___not___in;
    }

    public String getStudi_ids_b___lt() {
        return studi_ids_b___lt;
    }
    public void setStudi_ids_b___lt(String studi_ids_b___lt) {
        this.studi_ids_b___lt = studi_ids_b___lt;
    }

    public String getStudi_ids_b___lte() {
        return studi_ids_b___lte;
    }
    public void setStudi_ids_b___lte(String studi_ids_b___lte) {
        this.studi_ids_b___lte = studi_ids_b___lte;
    }

    public String getStudi_ids_b___gt() {
        return studi_ids_b___gt;
    }
    public void setStudi_ids_b___gt(String studi_ids_b___gt) {
        this.studi_ids_b___gt = studi_ids_b___gt;
    }

    public String getStudi_ids_b___gte() {
        return studi_ids_b___gte;
    }
    public void setStudi_ids_b___gte(String studi_ids_b___gte) {
        this.studi_ids_b___gte = studi_ids_b___gte;
    }

    public String getStudi_ids_b___contains() {
        return studi_ids_b___contains;
    }
    public void setStudi_ids_b___contains(String studi_ids_b___contains) {
        this.studi_ids_b___contains = studi_ids_b___contains;
    }

    public String getStudi_ids_b___not___contains() {
        return studi_ids_b___not___contains;
    }
    public void setStudi_ids_b___not___contains(String studi_ids_b___not___contains) {
        this.studi_ids_b___not___contains = studi_ids_b___not___contains;
    }

    public String getStudi_ids_b___starts_with() {
        return studi_ids_b___starts_with;
    }
    public void setStudi_ids_b___starts_with(String studi_ids_b___starts_with) {
        this.studi_ids_b___starts_with = studi_ids_b___starts_with;
    }

    public String getStudi_ids_b___not___starts_with() {
        return studi_ids_b___not___starts_with;
    }
    public void setStudi_ids_b___not___starts_with(String studi_ids_b___not___starts_with) {
        this.studi_ids_b___not___starts_with = studi_ids_b___not___starts_with;
    }

    public String getStudi_ids_b___ends_with() {
        return studi_ids_b___ends_with;
    }
    public void setStudi_ids_b___ends_with(String studi_ids_b___ends_with) {
        this.studi_ids_b___ends_with = studi_ids_b___ends_with;
    }

    public String getStudi_ids_b___not___ends_with() {
        return studi_ids_b___not___ends_with;
    }
    public void setStudi_ids_b___not___ends_with(String studi_ids_b___not___ends_with) {
        this.studi_ids_b___not___ends_with = studi_ids_b___not___ends_with;
    }

    public String getStudi_ids_i___eq() {
        return studi_ids_i___eq;
    }
    public void setStudi_ids_i___eq(String studi_ids_i___eq) {
        this.studi_ids_i___eq = studi_ids_i___eq;
    }

    public String getStudi_ids_i___ne() {
        return studi_ids_i___ne;
    }
    public void setStudi_ids_i___ne(String studi_ids_i___ne) {
        this.studi_ids_i___ne = studi_ids_i___ne;
    }

    public Boolean getStudi_ids_i___null() {
        return studi_ids_i___null;
    }
    public void setStudi_ids_i___null(Boolean studi_ids_i___null) {
        this.studi_ids_i___null = studi_ids_i___null;
    }

    public Boolean getStudi_ids_i___not___null() {
        return studi_ids_i___not___null;
    }
    public void setStudi_ids_i___not___null(Boolean studi_ids_i___not___null) {
        this.studi_ids_i___not___null = studi_ids_i___not___null;
    }

    public java.util.List<String> getStudi_ids_i___in() {
        return studi_ids_i___in;
    }
    public void setStudi_ids_i___in(java.util.List<String> studi_ids_i___in) {
        this.studi_ids_i___in = studi_ids_i___in;
    }

    public java.util.List<String> getStudi_ids_i___not___in() {
        return studi_ids_i___not___in;
    }
    public void setStudi_ids_i___not___in(java.util.List<String> studi_ids_i___not___in) {
        this.studi_ids_i___not___in = studi_ids_i___not___in;
    }

    public String getStudi_ids_i___lt() {
        return studi_ids_i___lt;
    }
    public void setStudi_ids_i___lt(String studi_ids_i___lt) {
        this.studi_ids_i___lt = studi_ids_i___lt;
    }

    public String getStudi_ids_i___lte() {
        return studi_ids_i___lte;
    }
    public void setStudi_ids_i___lte(String studi_ids_i___lte) {
        this.studi_ids_i___lte = studi_ids_i___lte;
    }

    public String getStudi_ids_i___gt() {
        return studi_ids_i___gt;
    }
    public void setStudi_ids_i___gt(String studi_ids_i___gt) {
        this.studi_ids_i___gt = studi_ids_i___gt;
    }

    public String getStudi_ids_i___gte() {
        return studi_ids_i___gte;
    }
    public void setStudi_ids_i___gte(String studi_ids_i___gte) {
        this.studi_ids_i___gte = studi_ids_i___gte;
    }

    public String getStudi_ids_i___contains() {
        return studi_ids_i___contains;
    }
    public void setStudi_ids_i___contains(String studi_ids_i___contains) {
        this.studi_ids_i___contains = studi_ids_i___contains;
    }

    public String getStudi_ids_i___not___contains() {
        return studi_ids_i___not___contains;
    }
    public void setStudi_ids_i___not___contains(String studi_ids_i___not___contains) {
        this.studi_ids_i___not___contains = studi_ids_i___not___contains;
    }

    public String getStudi_ids_i___starts_with() {
        return studi_ids_i___starts_with;
    }
    public void setStudi_ids_i___starts_with(String studi_ids_i___starts_with) {
        this.studi_ids_i___starts_with = studi_ids_i___starts_with;
    }

    public String getStudi_ids_i___not___starts_with() {
        return studi_ids_i___not___starts_with;
    }
    public void setStudi_ids_i___not___starts_with(String studi_ids_i___not___starts_with) {
        this.studi_ids_i___not___starts_with = studi_ids_i___not___starts_with;
    }

    public String getStudi_ids_i___ends_with() {
        return studi_ids_i___ends_with;
    }
    public void setStudi_ids_i___ends_with(String studi_ids_i___ends_with) {
        this.studi_ids_i___ends_with = studi_ids_i___ends_with;
    }

    public String getStudi_ids_i___not___ends_with() {
        return studi_ids_i___not___ends_with;
    }
    public void setStudi_ids_i___not___ends_with(String studi_ids_i___not___ends_with) {
        this.studi_ids_i___not___ends_with = studi_ids_i___not___ends_with;
    }

    public String getStudi_ids_p___eq() {
        return studi_ids_p___eq;
    }
    public void setStudi_ids_p___eq(String studi_ids_p___eq) {
        this.studi_ids_p___eq = studi_ids_p___eq;
    }

    public String getStudi_ids_p___ne() {
        return studi_ids_p___ne;
    }
    public void setStudi_ids_p___ne(String studi_ids_p___ne) {
        this.studi_ids_p___ne = studi_ids_p___ne;
    }

    public Boolean getStudi_ids_p___null() {
        return studi_ids_p___null;
    }
    public void setStudi_ids_p___null(Boolean studi_ids_p___null) {
        this.studi_ids_p___null = studi_ids_p___null;
    }

    public Boolean getStudi_ids_p___not___null() {
        return studi_ids_p___not___null;
    }
    public void setStudi_ids_p___not___null(Boolean studi_ids_p___not___null) {
        this.studi_ids_p___not___null = studi_ids_p___not___null;
    }

    public java.util.List<String> getStudi_ids_p___in() {
        return studi_ids_p___in;
    }
    public void setStudi_ids_p___in(java.util.List<String> studi_ids_p___in) {
        this.studi_ids_p___in = studi_ids_p___in;
    }

    public java.util.List<String> getStudi_ids_p___not___in() {
        return studi_ids_p___not___in;
    }
    public void setStudi_ids_p___not___in(java.util.List<String> studi_ids_p___not___in) {
        this.studi_ids_p___not___in = studi_ids_p___not___in;
    }

    public String getStudi_ids_p___lt() {
        return studi_ids_p___lt;
    }
    public void setStudi_ids_p___lt(String studi_ids_p___lt) {
        this.studi_ids_p___lt = studi_ids_p___lt;
    }

    public String getStudi_ids_p___lte() {
        return studi_ids_p___lte;
    }
    public void setStudi_ids_p___lte(String studi_ids_p___lte) {
        this.studi_ids_p___lte = studi_ids_p___lte;
    }

    public String getStudi_ids_p___gt() {
        return studi_ids_p___gt;
    }
    public void setStudi_ids_p___gt(String studi_ids_p___gt) {
        this.studi_ids_p___gt = studi_ids_p___gt;
    }

    public String getStudi_ids_p___gte() {
        return studi_ids_p___gte;
    }
    public void setStudi_ids_p___gte(String studi_ids_p___gte) {
        this.studi_ids_p___gte = studi_ids_p___gte;
    }

    public String getStudi_ids_p___contains() {
        return studi_ids_p___contains;
    }
    public void setStudi_ids_p___contains(String studi_ids_p___contains) {
        this.studi_ids_p___contains = studi_ids_p___contains;
    }

    public String getStudi_ids_p___not___contains() {
        return studi_ids_p___not___contains;
    }
    public void setStudi_ids_p___not___contains(String studi_ids_p___not___contains) {
        this.studi_ids_p___not___contains = studi_ids_p___not___contains;
    }

    public String getStudi_ids_p___starts_with() {
        return studi_ids_p___starts_with;
    }
    public void setStudi_ids_p___starts_with(String studi_ids_p___starts_with) {
        this.studi_ids_p___starts_with = studi_ids_p___starts_with;
    }

    public String getStudi_ids_p___not___starts_with() {
        return studi_ids_p___not___starts_with;
    }
    public void setStudi_ids_p___not___starts_with(String studi_ids_p___not___starts_with) {
        this.studi_ids_p___not___starts_with = studi_ids_p___not___starts_with;
    }

    public String getStudi_ids_p___ends_with() {
        return studi_ids_p___ends_with;
    }
    public void setStudi_ids_p___ends_with(String studi_ids_p___ends_with) {
        this.studi_ids_p___ends_with = studi_ids_p___ends_with;
    }

    public String getStudi_ids_p___not___ends_with() {
        return studi_ids_p___not___ends_with;
    }
    public void setStudi_ids_p___not___ends_with(String studi_ids_p___not___ends_with) {
        this.studi_ids_p___not___ends_with = studi_ids_p___not___ends_with;
    }

    public String getStudi_ids_r___eq() {
        return studi_ids_r___eq;
    }
    public void setStudi_ids_r___eq(String studi_ids_r___eq) {
        this.studi_ids_r___eq = studi_ids_r___eq;
    }

    public String getStudi_ids_r___ne() {
        return studi_ids_r___ne;
    }
    public void setStudi_ids_r___ne(String studi_ids_r___ne) {
        this.studi_ids_r___ne = studi_ids_r___ne;
    }

    public Boolean getStudi_ids_r___null() {
        return studi_ids_r___null;
    }
    public void setStudi_ids_r___null(Boolean studi_ids_r___null) {
        this.studi_ids_r___null = studi_ids_r___null;
    }

    public Boolean getStudi_ids_r___not___null() {
        return studi_ids_r___not___null;
    }
    public void setStudi_ids_r___not___null(Boolean studi_ids_r___not___null) {
        this.studi_ids_r___not___null = studi_ids_r___not___null;
    }

    public java.util.List<String> getStudi_ids_r___in() {
        return studi_ids_r___in;
    }
    public void setStudi_ids_r___in(java.util.List<String> studi_ids_r___in) {
        this.studi_ids_r___in = studi_ids_r___in;
    }

    public java.util.List<String> getStudi_ids_r___not___in() {
        return studi_ids_r___not___in;
    }
    public void setStudi_ids_r___not___in(java.util.List<String> studi_ids_r___not___in) {
        this.studi_ids_r___not___in = studi_ids_r___not___in;
    }

    public String getStudi_ids_r___lt() {
        return studi_ids_r___lt;
    }
    public void setStudi_ids_r___lt(String studi_ids_r___lt) {
        this.studi_ids_r___lt = studi_ids_r___lt;
    }

    public String getStudi_ids_r___lte() {
        return studi_ids_r___lte;
    }
    public void setStudi_ids_r___lte(String studi_ids_r___lte) {
        this.studi_ids_r___lte = studi_ids_r___lte;
    }

    public String getStudi_ids_r___gt() {
        return studi_ids_r___gt;
    }
    public void setStudi_ids_r___gt(String studi_ids_r___gt) {
        this.studi_ids_r___gt = studi_ids_r___gt;
    }

    public String getStudi_ids_r___gte() {
        return studi_ids_r___gte;
    }
    public void setStudi_ids_r___gte(String studi_ids_r___gte) {
        this.studi_ids_r___gte = studi_ids_r___gte;
    }

    public String getStudi_ids_r___contains() {
        return studi_ids_r___contains;
    }
    public void setStudi_ids_r___contains(String studi_ids_r___contains) {
        this.studi_ids_r___contains = studi_ids_r___contains;
    }

    public String getStudi_ids_r___not___contains() {
        return studi_ids_r___not___contains;
    }
    public void setStudi_ids_r___not___contains(String studi_ids_r___not___contains) {
        this.studi_ids_r___not___contains = studi_ids_r___not___contains;
    }

    public String getStudi_ids_r___starts_with() {
        return studi_ids_r___starts_with;
    }
    public void setStudi_ids_r___starts_with(String studi_ids_r___starts_with) {
        this.studi_ids_r___starts_with = studi_ids_r___starts_with;
    }

    public String getStudi_ids_r___not___starts_with() {
        return studi_ids_r___not___starts_with;
    }
    public void setStudi_ids_r___not___starts_with(String studi_ids_r___not___starts_with) {
        this.studi_ids_r___not___starts_with = studi_ids_r___not___starts_with;
    }

    public String getStudi_ids_r___ends_with() {
        return studi_ids_r___ends_with;
    }
    public void setStudi_ids_r___ends_with(String studi_ids_r___ends_with) {
        this.studi_ids_r___ends_with = studi_ids_r___ends_with;
    }

    public String getStudi_ids_r___not___ends_with() {
        return studi_ids_r___not___ends_with;
    }
    public void setStudi_ids_r___not___ends_with(String studi_ids_r___not___ends_with) {
        this.studi_ids_r___not___ends_with = studi_ids_r___not___ends_with;
    }

    public String getStudio_questionario___eq() {
        return studio_questionario___eq;
    }
    public void setStudio_questionario___eq(String studio_questionario___eq) {
        this.studio_questionario___eq = studio_questionario___eq;
    }

    public String getStudio_questionario___ne() {
        return studio_questionario___ne;
    }
    public void setStudio_questionario___ne(String studio_questionario___ne) {
        this.studio_questionario___ne = studio_questionario___ne;
    }

    public Boolean getStudio_questionario___null() {
        return studio_questionario___null;
    }
    public void setStudio_questionario___null(Boolean studio_questionario___null) {
        this.studio_questionario___null = studio_questionario___null;
    }

    public Boolean getStudio_questionario___not___null() {
        return studio_questionario___not___null;
    }
    public void setStudio_questionario___not___null(Boolean studio_questionario___not___null) {
        this.studio_questionario___not___null = studio_questionario___not___null;
    }

    public java.util.List<String> getStudio_questionario___in() {
        return studio_questionario___in;
    }
    public void setStudio_questionario___in(java.util.List<String> studio_questionario___in) {
        this.studio_questionario___in = studio_questionario___in;
    }

    public java.util.List<String> getStudio_questionario___not___in() {
        return studio_questionario___not___in;
    }
    public void setStudio_questionario___not___in(java.util.List<String> studio_questionario___not___in) {
        this.studio_questionario___not___in = studio_questionario___not___in;
    }

    public String getStudio_questionario___lt() {
        return studio_questionario___lt;
    }
    public void setStudio_questionario___lt(String studio_questionario___lt) {
        this.studio_questionario___lt = studio_questionario___lt;
    }

    public String getStudio_questionario___lte() {
        return studio_questionario___lte;
    }
    public void setStudio_questionario___lte(String studio_questionario___lte) {
        this.studio_questionario___lte = studio_questionario___lte;
    }

    public String getStudio_questionario___gt() {
        return studio_questionario___gt;
    }
    public void setStudio_questionario___gt(String studio_questionario___gt) {
        this.studio_questionario___gt = studio_questionario___gt;
    }

    public String getStudio_questionario___gte() {
        return studio_questionario___gte;
    }
    public void setStudio_questionario___gte(String studio_questionario___gte) {
        this.studio_questionario___gte = studio_questionario___gte;
    }

    public String getStudio_questionario___contains() {
        return studio_questionario___contains;
    }
    public void setStudio_questionario___contains(String studio_questionario___contains) {
        this.studio_questionario___contains = studio_questionario___contains;
    }

    public String getStudio_questionario___not___contains() {
        return studio_questionario___not___contains;
    }
    public void setStudio_questionario___not___contains(String studio_questionario___not___contains) {
        this.studio_questionario___not___contains = studio_questionario___not___contains;
    }

    public String getStudio_questionario___starts_with() {
        return studio_questionario___starts_with;
    }
    public void setStudio_questionario___starts_with(String studio_questionario___starts_with) {
        this.studio_questionario___starts_with = studio_questionario___starts_with;
    }

    public String getStudio_questionario___not___starts_with() {
        return studio_questionario___not___starts_with;
    }
    public void setStudio_questionario___not___starts_with(String studio_questionario___not___starts_with) {
        this.studio_questionario___not___starts_with = studio_questionario___not___starts_with;
    }

    public String getStudio_questionario___ends_with() {
        return studio_questionario___ends_with;
    }
    public void setStudio_questionario___ends_with(String studio_questionario___ends_with) {
        this.studio_questionario___ends_with = studio_questionario___ends_with;
    }

    public String getStudio_questionario___not___ends_with() {
        return studio_questionario___not___ends_with;
    }
    public void setStudio_questionario___not___ends_with(String studio_questionario___not___ends_with) {
        this.studio_questionario___not___ends_with = studio_questionario___not___ends_with;
    }

    public java.util.List<CliQuestionario_PRO_appFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliQuestionario_PRO_appFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliQuestionario_PRO_appFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliQuestionario_PRO_appFilterDTO> OR) {
        this.OR = OR;
    }

    public CliQuestionario_PRO_appFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliQuestionario_PRO_appFilterDTO NOT) {
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
        if (alert_obbligatoria1___eq != null) {
            joiner.add("alert_obbligatoria1___eq: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria1___eq));
        }
        if (alert_obbligatoria1___ne != null) {
            joiner.add("alert_obbligatoria1___ne: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria1___ne));
        }
        if (alert_obbligatoria1___null != null) {
            joiner.add("alert_obbligatoria1___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria1___null));
        }
        if (alert_obbligatoria1___not___null != null) {
            joiner.add("alert_obbligatoria1___not___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria1___not___null));
        }
        if (alert_obbligatoria2___eq != null) {
            joiner.add("alert_obbligatoria2___eq: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria2___eq));
        }
        if (alert_obbligatoria2___ne != null) {
            joiner.add("alert_obbligatoria2___ne: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria2___ne));
        }
        if (alert_obbligatoria2___null != null) {
            joiner.add("alert_obbligatoria2___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria2___null));
        }
        if (alert_obbligatoria2___not___null != null) {
            joiner.add("alert_obbligatoria2___not___null: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria2___not___null));
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
        if (codice_interno_p___eq != null) {
            joiner.add("codice_interno_p___eq: " + GraphQLRequestSerializer.getEntry(codice_interno_p___eq));
        }
        if (codice_interno_p___ne != null) {
            joiner.add("codice_interno_p___ne: " + GraphQLRequestSerializer.getEntry(codice_interno_p___ne));
        }
        if (codice_interno_p___null != null) {
            joiner.add("codice_interno_p___null: " + GraphQLRequestSerializer.getEntry(codice_interno_p___null));
        }
        if (codice_interno_p___not___null != null) {
            joiner.add("codice_interno_p___not___null: " + GraphQLRequestSerializer.getEntry(codice_interno_p___not___null));
        }
        if (codice_interno_p___in != null) {
            joiner.add("codice_interno_p___in: " + GraphQLRequestSerializer.getEntry(codice_interno_p___in));
        }
        if (codice_interno_p___not___in != null) {
            joiner.add("codice_interno_p___not___in: " + GraphQLRequestSerializer.getEntry(codice_interno_p___not___in));
        }
        if (codice_interno_p___lt != null) {
            joiner.add("codice_interno_p___lt: " + GraphQLRequestSerializer.getEntry(codice_interno_p___lt));
        }
        if (codice_interno_p___lte != null) {
            joiner.add("codice_interno_p___lte: " + GraphQLRequestSerializer.getEntry(codice_interno_p___lte));
        }
        if (codice_interno_p___gt != null) {
            joiner.add("codice_interno_p___gt: " + GraphQLRequestSerializer.getEntry(codice_interno_p___gt));
        }
        if (codice_interno_p___gte != null) {
            joiner.add("codice_interno_p___gte: " + GraphQLRequestSerializer.getEntry(codice_interno_p___gte));
        }
        if (codice_interno_p___contains != null) {
            joiner.add("codice_interno_p___contains: " + GraphQLRequestSerializer.getEntry(codice_interno_p___contains));
        }
        if (codice_interno_p___not___contains != null) {
            joiner.add("codice_interno_p___not___contains: " + GraphQLRequestSerializer.getEntry(codice_interno_p___not___contains));
        }
        if (codice_interno_p___starts_with != null) {
            joiner.add("codice_interno_p___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno_p___starts_with));
        }
        if (codice_interno_p___not___starts_with != null) {
            joiner.add("codice_interno_p___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno_p___not___starts_with));
        }
        if (codice_interno_p___ends_with != null) {
            joiner.add("codice_interno_p___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno_p___ends_with));
        }
        if (codice_interno_p___not___ends_with != null) {
            joiner.add("codice_interno_p___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno_p___not___ends_with));
        }
        if (confermato___eq != null) {
            joiner.add("confermato___eq: " + GraphQLRequestSerializer.getEntry(confermato___eq));
        }
        if (confermato___ne != null) {
            joiner.add("confermato___ne: " + GraphQLRequestSerializer.getEntry(confermato___ne));
        }
        if (confermato___null != null) {
            joiner.add("confermato___null: " + GraphQLRequestSerializer.getEntry(confermato___null));
        }
        if (confermato___not___null != null) {
            joiner.add("confermato___not___null: " + GraphQLRequestSerializer.getEntry(confermato___not___null));
        }
        if (data_compilazione___eq != null) {
            joiner.add("data_compilazione___eq: " + GraphQLRequestSerializer.getEntry(data_compilazione___eq));
        }
        if (data_compilazione___ne != null) {
            joiner.add("data_compilazione___ne: " + GraphQLRequestSerializer.getEntry(data_compilazione___ne));
        }
        if (data_compilazione___null != null) {
            joiner.add("data_compilazione___null: " + GraphQLRequestSerializer.getEntry(data_compilazione___null));
        }
        if (data_compilazione___not___null != null) {
            joiner.add("data_compilazione___not___null: " + GraphQLRequestSerializer.getEntry(data_compilazione___not___null));
        }
        if (data_compilazione___in != null) {
            joiner.add("data_compilazione___in: " + GraphQLRequestSerializer.getEntry(data_compilazione___in));
        }
        if (data_compilazione___not___in != null) {
            joiner.add("data_compilazione___not___in: " + GraphQLRequestSerializer.getEntry(data_compilazione___not___in));
        }
        if (data_compilazione___lt != null) {
            joiner.add("data_compilazione___lt: " + GraphQLRequestSerializer.getEntry(data_compilazione___lt));
        }
        if (data_compilazione___lte != null) {
            joiner.add("data_compilazione___lte: " + GraphQLRequestSerializer.getEntry(data_compilazione___lte));
        }
        if (data_compilazione___gt != null) {
            joiner.add("data_compilazione___gt: " + GraphQLRequestSerializer.getEntry(data_compilazione___gt));
        }
        if (data_compilazione___gte != null) {
            joiner.add("data_compilazione___gte: " + GraphQLRequestSerializer.getEntry(data_compilazione___gte));
        }
        if (domanda_obblig_ids___eq != null) {
            joiner.add("domanda_obblig_ids___eq: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___eq));
        }
        if (domanda_obblig_ids___ne != null) {
            joiner.add("domanda_obblig_ids___ne: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___ne));
        }
        if (domanda_obblig_ids___null != null) {
            joiner.add("domanda_obblig_ids___null: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___null));
        }
        if (domanda_obblig_ids___not___null != null) {
            joiner.add("domanda_obblig_ids___not___null: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___not___null));
        }
        if (domanda_obblig_ids___in != null) {
            joiner.add("domanda_obblig_ids___in: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___in));
        }
        if (domanda_obblig_ids___not___in != null) {
            joiner.add("domanda_obblig_ids___not___in: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___not___in));
        }
        if (domanda_obblig_ids___lt != null) {
            joiner.add("domanda_obblig_ids___lt: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___lt));
        }
        if (domanda_obblig_ids___lte != null) {
            joiner.add("domanda_obblig_ids___lte: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___lte));
        }
        if (domanda_obblig_ids___gt != null) {
            joiner.add("domanda_obblig_ids___gt: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___gt));
        }
        if (domanda_obblig_ids___gte != null) {
            joiner.add("domanda_obblig_ids___gte: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___gte));
        }
        if (domanda_obblig_ids___contains != null) {
            joiner.add("domanda_obblig_ids___contains: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___contains));
        }
        if (domanda_obblig_ids___not___contains != null) {
            joiner.add("domanda_obblig_ids___not___contains: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___not___contains));
        }
        if (domanda_obblig_ids___starts_with != null) {
            joiner.add("domanda_obblig_ids___starts_with: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___starts_with));
        }
        if (domanda_obblig_ids___not___starts_with != null) {
            joiner.add("domanda_obblig_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___not___starts_with));
        }
        if (domanda_obblig_ids___ends_with != null) {
            joiner.add("domanda_obblig_ids___ends_with: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___ends_with));
        }
        if (domanda_obblig_ids___not___ends_with != null) {
            joiner.add("domanda_obblig_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids___not___ends_with));
        }
        if (domanda_risp_ids___eq != null) {
            joiner.add("domanda_risp_ids___eq: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___eq));
        }
        if (domanda_risp_ids___ne != null) {
            joiner.add("domanda_risp_ids___ne: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___ne));
        }
        if (domanda_risp_ids___null != null) {
            joiner.add("domanda_risp_ids___null: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___null));
        }
        if (domanda_risp_ids___not___null != null) {
            joiner.add("domanda_risp_ids___not___null: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___not___null));
        }
        if (domanda_risp_ids___in != null) {
            joiner.add("domanda_risp_ids___in: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___in));
        }
        if (domanda_risp_ids___not___in != null) {
            joiner.add("domanda_risp_ids___not___in: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___not___in));
        }
        if (domanda_risp_ids___lt != null) {
            joiner.add("domanda_risp_ids___lt: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___lt));
        }
        if (domanda_risp_ids___lte != null) {
            joiner.add("domanda_risp_ids___lte: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___lte));
        }
        if (domanda_risp_ids___gt != null) {
            joiner.add("domanda_risp_ids___gt: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___gt));
        }
        if (domanda_risp_ids___gte != null) {
            joiner.add("domanda_risp_ids___gte: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___gte));
        }
        if (domanda_risp_ids___contains != null) {
            joiner.add("domanda_risp_ids___contains: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___contains));
        }
        if (domanda_risp_ids___not___contains != null) {
            joiner.add("domanda_risp_ids___not___contains: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___not___contains));
        }
        if (domanda_risp_ids___starts_with != null) {
            joiner.add("domanda_risp_ids___starts_with: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___starts_with));
        }
        if (domanda_risp_ids___not___starts_with != null) {
            joiner.add("domanda_risp_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___not___starts_with));
        }
        if (domanda_risp_ids___ends_with != null) {
            joiner.add("domanda_risp_ids___ends_with: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___ends_with));
        }
        if (domanda_risp_ids___not___ends_with != null) {
            joiner.add("domanda_risp_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids___not___ends_with));
        }
        if (domande_totali___eq != null) {
            joiner.add("domande_totali___eq: " + GraphQLRequestSerializer.getEntry(domande_totali___eq));
        }
        if (domande_totali___ne != null) {
            joiner.add("domande_totali___ne: " + GraphQLRequestSerializer.getEntry(domande_totali___ne));
        }
        if (domande_totali___null != null) {
            joiner.add("domande_totali___null: " + GraphQLRequestSerializer.getEntry(domande_totali___null));
        }
        if (domande_totali___not___null != null) {
            joiner.add("domande_totali___not___null: " + GraphQLRequestSerializer.getEntry(domande_totali___not___null));
        }
        if (domande_totali___in != null) {
            joiner.add("domande_totali___in: " + GraphQLRequestSerializer.getEntry(domande_totali___in));
        }
        if (domande_totali___not___in != null) {
            joiner.add("domande_totali___not___in: " + GraphQLRequestSerializer.getEntry(domande_totali___not___in));
        }
        if (domande_totali___lt != null) {
            joiner.add("domande_totali___lt: " + GraphQLRequestSerializer.getEntry(domande_totali___lt));
        }
        if (domande_totali___lte != null) {
            joiner.add("domande_totali___lte: " + GraphQLRequestSerializer.getEntry(domande_totali___lte));
        }
        if (domande_totali___gt != null) {
            joiner.add("domande_totali___gt: " + GraphQLRequestSerializer.getEntry(domande_totali___gt));
        }
        if (domande_totali___gte != null) {
            joiner.add("domande_totali___gte: " + GraphQLRequestSerializer.getEntry(domande_totali___gte));
        }
        if (filtro_classe___eq != null) {
            joiner.add("filtro_classe___eq: " + GraphQLRequestSerializer.getEntry(filtro_classe___eq));
        }
        if (filtro_classe___ne != null) {
            joiner.add("filtro_classe___ne: " + GraphQLRequestSerializer.getEntry(filtro_classe___ne));
        }
        if (filtro_classe___null != null) {
            joiner.add("filtro_classe___null: " + GraphQLRequestSerializer.getEntry(filtro_classe___null));
        }
        if (filtro_classe___not___null != null) {
            joiner.add("filtro_classe___not___null: " + GraphQLRequestSerializer.getEntry(filtro_classe___not___null));
        }
        if (i_filtro_classe___eq != null) {
            joiner.add("i_filtro_classe___eq: " + GraphQLRequestSerializer.getEntry(i_filtro_classe___eq));
        }
        if (i_filtro_classe___ne != null) {
            joiner.add("i_filtro_classe___ne: " + GraphQLRequestSerializer.getEntry(i_filtro_classe___ne));
        }
        if (i_filtro_classe___null != null) {
            joiner.add("i_filtro_classe___null: " + GraphQLRequestSerializer.getEntry(i_filtro_classe___null));
        }
        if (i_filtro_classe___not___null != null) {
            joiner.add("i_filtro_classe___not___null: " + GraphQLRequestSerializer.getEntry(i_filtro_classe___not___null));
        }
        if (intervallo_compil_mesi___eq != null) {
            joiner.add("intervallo_compil_mesi___eq: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___eq));
        }
        if (intervallo_compil_mesi___ne != null) {
            joiner.add("intervallo_compil_mesi___ne: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___ne));
        }
        if (intervallo_compil_mesi___null != null) {
            joiner.add("intervallo_compil_mesi___null: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___null));
        }
        if (intervallo_compil_mesi___not___null != null) {
            joiner.add("intervallo_compil_mesi___not___null: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___not___null));
        }
        if (intervallo_compil_mesi___in != null) {
            joiner.add("intervallo_compil_mesi___in: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___in));
        }
        if (intervallo_compil_mesi___not___in != null) {
            joiner.add("intervallo_compil_mesi___not___in: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___not___in));
        }
        if (intervallo_compil_mesi___lt != null) {
            joiner.add("intervallo_compil_mesi___lt: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___lt));
        }
        if (intervallo_compil_mesi___lte != null) {
            joiner.add("intervallo_compil_mesi___lte: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___lte));
        }
        if (intervallo_compil_mesi___gt != null) {
            joiner.add("intervallo_compil_mesi___gt: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___gt));
        }
        if (intervallo_compil_mesi___gte != null) {
            joiner.add("intervallo_compil_mesi___gte: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___gte));
        }
        if (mesi_trascorsi___eq != null) {
            joiner.add("mesi_trascorsi___eq: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___eq));
        }
        if (mesi_trascorsi___ne != null) {
            joiner.add("mesi_trascorsi___ne: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___ne));
        }
        if (mesi_trascorsi___null != null) {
            joiner.add("mesi_trascorsi___null: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___null));
        }
        if (mesi_trascorsi___not___null != null) {
            joiner.add("mesi_trascorsi___not___null: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___not___null));
        }
        if (mesi_trascorsi___in != null) {
            joiner.add("mesi_trascorsi___in: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___in));
        }
        if (mesi_trascorsi___not___in != null) {
            joiner.add("mesi_trascorsi___not___in: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___not___in));
        }
        if (mesi_trascorsi___lt != null) {
            joiner.add("mesi_trascorsi___lt: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___lt));
        }
        if (mesi_trascorsi___lte != null) {
            joiner.add("mesi_trascorsi___lte: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___lte));
        }
        if (mesi_trascorsi___gt != null) {
            joiner.add("mesi_trascorsi___gt: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___gt));
        }
        if (mesi_trascorsi___gte != null) {
            joiner.add("mesi_trascorsi___gte: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi___gte));
        }
        if (p_filtro_classe___eq != null) {
            joiner.add("p_filtro_classe___eq: " + GraphQLRequestSerializer.getEntry(p_filtro_classe___eq));
        }
        if (p_filtro_classe___ne != null) {
            joiner.add("p_filtro_classe___ne: " + GraphQLRequestSerializer.getEntry(p_filtro_classe___ne));
        }
        if (p_filtro_classe___null != null) {
            joiner.add("p_filtro_classe___null: " + GraphQLRequestSerializer.getEntry(p_filtro_classe___null));
        }
        if (p_filtro_classe___not___null != null) {
            joiner.add("p_filtro_classe___not___null: " + GraphQLRequestSerializer.getEntry(p_filtro_classe___not___null));
        }
        if (parametri_personali___eq != null) {
            joiner.add("parametri_personali___eq: " + GraphQLRequestSerializer.getEntry(parametri_personali___eq));
        }
        if (parametri_personali___ne != null) {
            joiner.add("parametri_personali___ne: " + GraphQLRequestSerializer.getEntry(parametri_personali___ne));
        }
        if (parametri_personali___null != null) {
            joiner.add("parametri_personali___null: " + GraphQLRequestSerializer.getEntry(parametri_personali___null));
        }
        if (parametri_personali___not___null != null) {
            joiner.add("parametri_personali___not___null: " + GraphQLRequestSerializer.getEntry(parametri_personali___not___null));
        }
        if (questionario___eq != null) {
            joiner.add("questionario___eq: " + GraphQLRequestSerializer.getEntry(questionario___eq));
        }
        if (questionario___ne != null) {
            joiner.add("questionario___ne: " + GraphQLRequestSerializer.getEntry(questionario___ne));
        }
        if (questionario___null != null) {
            joiner.add("questionario___null: " + GraphQLRequestSerializer.getEntry(questionario___null));
        }
        if (questionario___not___null != null) {
            joiner.add("questionario___not___null: " + GraphQLRequestSerializer.getEntry(questionario___not___null));
        }
        if (questionario___in != null) {
            joiner.add("questionario___in: " + GraphQLRequestSerializer.getEntry(questionario___in));
        }
        if (questionario___not___in != null) {
            joiner.add("questionario___not___in: " + GraphQLRequestSerializer.getEntry(questionario___not___in));
        }
        if (questionario___lt != null) {
            joiner.add("questionario___lt: " + GraphQLRequestSerializer.getEntry(questionario___lt));
        }
        if (questionario___lte != null) {
            joiner.add("questionario___lte: " + GraphQLRequestSerializer.getEntry(questionario___lte));
        }
        if (questionario___gt != null) {
            joiner.add("questionario___gt: " + GraphQLRequestSerializer.getEntry(questionario___gt));
        }
        if (questionario___gte != null) {
            joiner.add("questionario___gte: " + GraphQLRequestSerializer.getEntry(questionario___gte));
        }
        if (questionario___contains != null) {
            joiner.add("questionario___contains: " + GraphQLRequestSerializer.getEntry(questionario___contains));
        }
        if (questionario___not___contains != null) {
            joiner.add("questionario___not___contains: " + GraphQLRequestSerializer.getEntry(questionario___not___contains));
        }
        if (questionario___starts_with != null) {
            joiner.add("questionario___starts_with: " + GraphQLRequestSerializer.getEntry(questionario___starts_with));
        }
        if (questionario___not___starts_with != null) {
            joiner.add("questionario___not___starts_with: " + GraphQLRequestSerializer.getEntry(questionario___not___starts_with));
        }
        if (questionario___ends_with != null) {
            joiner.add("questionario___ends_with: " + GraphQLRequestSerializer.getEntry(questionario___ends_with));
        }
        if (questionario___not___ends_with != null) {
            joiner.add("questionario___not___ends_with: " + GraphQLRequestSerializer.getEntry(questionario___not___ends_with));
        }
        if (risposte_date___eq != null) {
            joiner.add("risposte_date___eq: " + GraphQLRequestSerializer.getEntry(risposte_date___eq));
        }
        if (risposte_date___ne != null) {
            joiner.add("risposte_date___ne: " + GraphQLRequestSerializer.getEntry(risposte_date___ne));
        }
        if (risposte_date___null != null) {
            joiner.add("risposte_date___null: " + GraphQLRequestSerializer.getEntry(risposte_date___null));
        }
        if (risposte_date___not___null != null) {
            joiner.add("risposte_date___not___null: " + GraphQLRequestSerializer.getEntry(risposte_date___not___null));
        }
        if (risposte_date___in != null) {
            joiner.add("risposte_date___in: " + GraphQLRequestSerializer.getEntry(risposte_date___in));
        }
        if (risposte_date___not___in != null) {
            joiner.add("risposte_date___not___in: " + GraphQLRequestSerializer.getEntry(risposte_date___not___in));
        }
        if (risposte_date___lt != null) {
            joiner.add("risposte_date___lt: " + GraphQLRequestSerializer.getEntry(risposte_date___lt));
        }
        if (risposte_date___lte != null) {
            joiner.add("risposte_date___lte: " + GraphQLRequestSerializer.getEntry(risposte_date___lte));
        }
        if (risposte_date___gt != null) {
            joiner.add("risposte_date___gt: " + GraphQLRequestSerializer.getEntry(risposte_date___gt));
        }
        if (risposte_date___gte != null) {
            joiner.add("risposte_date___gte: " + GraphQLRequestSerializer.getEntry(risposte_date___gte));
        }
        if (risposte_mancanti___eq != null) {
            joiner.add("risposte_mancanti___eq: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___eq));
        }
        if (risposte_mancanti___ne != null) {
            joiner.add("risposte_mancanti___ne: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___ne));
        }
        if (risposte_mancanti___null != null) {
            joiner.add("risposte_mancanti___null: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___null));
        }
        if (risposte_mancanti___not___null != null) {
            joiner.add("risposte_mancanti___not___null: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___not___null));
        }
        if (risposte_mancanti___in != null) {
            joiner.add("risposte_mancanti___in: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___in));
        }
        if (risposte_mancanti___not___in != null) {
            joiner.add("risposte_mancanti___not___in: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___not___in));
        }
        if (risposte_mancanti___lt != null) {
            joiner.add("risposte_mancanti___lt: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___lt));
        }
        if (risposte_mancanti___lte != null) {
            joiner.add("risposte_mancanti___lte: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___lte));
        }
        if (risposte_mancanti___gt != null) {
            joiner.add("risposte_mancanti___gt: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___gt));
        }
        if (risposte_mancanti___gte != null) {
            joiner.add("risposte_mancanti___gte: " + GraphQLRequestSerializer.getEntry(risposte_mancanti___gte));
        }
        if (studi_ids___eq != null) {
            joiner.add("studi_ids___eq: " + GraphQLRequestSerializer.getEntry(studi_ids___eq));
        }
        if (studi_ids___ne != null) {
            joiner.add("studi_ids___ne: " + GraphQLRequestSerializer.getEntry(studi_ids___ne));
        }
        if (studi_ids___null != null) {
            joiner.add("studi_ids___null: " + GraphQLRequestSerializer.getEntry(studi_ids___null));
        }
        if (studi_ids___not___null != null) {
            joiner.add("studi_ids___not___null: " + GraphQLRequestSerializer.getEntry(studi_ids___not___null));
        }
        if (studi_ids___in != null) {
            joiner.add("studi_ids___in: " + GraphQLRequestSerializer.getEntry(studi_ids___in));
        }
        if (studi_ids___not___in != null) {
            joiner.add("studi_ids___not___in: " + GraphQLRequestSerializer.getEntry(studi_ids___not___in));
        }
        if (studi_ids___lt != null) {
            joiner.add("studi_ids___lt: " + GraphQLRequestSerializer.getEntry(studi_ids___lt));
        }
        if (studi_ids___lte != null) {
            joiner.add("studi_ids___lte: " + GraphQLRequestSerializer.getEntry(studi_ids___lte));
        }
        if (studi_ids___gt != null) {
            joiner.add("studi_ids___gt: " + GraphQLRequestSerializer.getEntry(studi_ids___gt));
        }
        if (studi_ids___gte != null) {
            joiner.add("studi_ids___gte: " + GraphQLRequestSerializer.getEntry(studi_ids___gte));
        }
        if (studi_ids___contains != null) {
            joiner.add("studi_ids___contains: " + GraphQLRequestSerializer.getEntry(studi_ids___contains));
        }
        if (studi_ids___not___contains != null) {
            joiner.add("studi_ids___not___contains: " + GraphQLRequestSerializer.getEntry(studi_ids___not___contains));
        }
        if (studi_ids___starts_with != null) {
            joiner.add("studi_ids___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids___starts_with));
        }
        if (studi_ids___not___starts_with != null) {
            joiner.add("studi_ids___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids___not___starts_with));
        }
        if (studi_ids___ends_with != null) {
            joiner.add("studi_ids___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids___ends_with));
        }
        if (studi_ids___not___ends_with != null) {
            joiner.add("studi_ids___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids___not___ends_with));
        }
        if (studi_ids_b___eq != null) {
            joiner.add("studi_ids_b___eq: " + GraphQLRequestSerializer.getEntry(studi_ids_b___eq));
        }
        if (studi_ids_b___ne != null) {
            joiner.add("studi_ids_b___ne: " + GraphQLRequestSerializer.getEntry(studi_ids_b___ne));
        }
        if (studi_ids_b___null != null) {
            joiner.add("studi_ids_b___null: " + GraphQLRequestSerializer.getEntry(studi_ids_b___null));
        }
        if (studi_ids_b___not___null != null) {
            joiner.add("studi_ids_b___not___null: " + GraphQLRequestSerializer.getEntry(studi_ids_b___not___null));
        }
        if (studi_ids_b___in != null) {
            joiner.add("studi_ids_b___in: " + GraphQLRequestSerializer.getEntry(studi_ids_b___in));
        }
        if (studi_ids_b___not___in != null) {
            joiner.add("studi_ids_b___not___in: " + GraphQLRequestSerializer.getEntry(studi_ids_b___not___in));
        }
        if (studi_ids_b___lt != null) {
            joiner.add("studi_ids_b___lt: " + GraphQLRequestSerializer.getEntry(studi_ids_b___lt));
        }
        if (studi_ids_b___lte != null) {
            joiner.add("studi_ids_b___lte: " + GraphQLRequestSerializer.getEntry(studi_ids_b___lte));
        }
        if (studi_ids_b___gt != null) {
            joiner.add("studi_ids_b___gt: " + GraphQLRequestSerializer.getEntry(studi_ids_b___gt));
        }
        if (studi_ids_b___gte != null) {
            joiner.add("studi_ids_b___gte: " + GraphQLRequestSerializer.getEntry(studi_ids_b___gte));
        }
        if (studi_ids_b___contains != null) {
            joiner.add("studi_ids_b___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_b___contains));
        }
        if (studi_ids_b___not___contains != null) {
            joiner.add("studi_ids_b___not___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_b___not___contains));
        }
        if (studi_ids_b___starts_with != null) {
            joiner.add("studi_ids_b___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_b___starts_with));
        }
        if (studi_ids_b___not___starts_with != null) {
            joiner.add("studi_ids_b___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_b___not___starts_with));
        }
        if (studi_ids_b___ends_with != null) {
            joiner.add("studi_ids_b___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_b___ends_with));
        }
        if (studi_ids_b___not___ends_with != null) {
            joiner.add("studi_ids_b___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_b___not___ends_with));
        }
        if (studi_ids_i___eq != null) {
            joiner.add("studi_ids_i___eq: " + GraphQLRequestSerializer.getEntry(studi_ids_i___eq));
        }
        if (studi_ids_i___ne != null) {
            joiner.add("studi_ids_i___ne: " + GraphQLRequestSerializer.getEntry(studi_ids_i___ne));
        }
        if (studi_ids_i___null != null) {
            joiner.add("studi_ids_i___null: " + GraphQLRequestSerializer.getEntry(studi_ids_i___null));
        }
        if (studi_ids_i___not___null != null) {
            joiner.add("studi_ids_i___not___null: " + GraphQLRequestSerializer.getEntry(studi_ids_i___not___null));
        }
        if (studi_ids_i___in != null) {
            joiner.add("studi_ids_i___in: " + GraphQLRequestSerializer.getEntry(studi_ids_i___in));
        }
        if (studi_ids_i___not___in != null) {
            joiner.add("studi_ids_i___not___in: " + GraphQLRequestSerializer.getEntry(studi_ids_i___not___in));
        }
        if (studi_ids_i___lt != null) {
            joiner.add("studi_ids_i___lt: " + GraphQLRequestSerializer.getEntry(studi_ids_i___lt));
        }
        if (studi_ids_i___lte != null) {
            joiner.add("studi_ids_i___lte: " + GraphQLRequestSerializer.getEntry(studi_ids_i___lte));
        }
        if (studi_ids_i___gt != null) {
            joiner.add("studi_ids_i___gt: " + GraphQLRequestSerializer.getEntry(studi_ids_i___gt));
        }
        if (studi_ids_i___gte != null) {
            joiner.add("studi_ids_i___gte: " + GraphQLRequestSerializer.getEntry(studi_ids_i___gte));
        }
        if (studi_ids_i___contains != null) {
            joiner.add("studi_ids_i___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_i___contains));
        }
        if (studi_ids_i___not___contains != null) {
            joiner.add("studi_ids_i___not___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_i___not___contains));
        }
        if (studi_ids_i___starts_with != null) {
            joiner.add("studi_ids_i___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_i___starts_with));
        }
        if (studi_ids_i___not___starts_with != null) {
            joiner.add("studi_ids_i___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_i___not___starts_with));
        }
        if (studi_ids_i___ends_with != null) {
            joiner.add("studi_ids_i___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_i___ends_with));
        }
        if (studi_ids_i___not___ends_with != null) {
            joiner.add("studi_ids_i___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_i___not___ends_with));
        }
        if (studi_ids_p___eq != null) {
            joiner.add("studi_ids_p___eq: " + GraphQLRequestSerializer.getEntry(studi_ids_p___eq));
        }
        if (studi_ids_p___ne != null) {
            joiner.add("studi_ids_p___ne: " + GraphQLRequestSerializer.getEntry(studi_ids_p___ne));
        }
        if (studi_ids_p___null != null) {
            joiner.add("studi_ids_p___null: " + GraphQLRequestSerializer.getEntry(studi_ids_p___null));
        }
        if (studi_ids_p___not___null != null) {
            joiner.add("studi_ids_p___not___null: " + GraphQLRequestSerializer.getEntry(studi_ids_p___not___null));
        }
        if (studi_ids_p___in != null) {
            joiner.add("studi_ids_p___in: " + GraphQLRequestSerializer.getEntry(studi_ids_p___in));
        }
        if (studi_ids_p___not___in != null) {
            joiner.add("studi_ids_p___not___in: " + GraphQLRequestSerializer.getEntry(studi_ids_p___not___in));
        }
        if (studi_ids_p___lt != null) {
            joiner.add("studi_ids_p___lt: " + GraphQLRequestSerializer.getEntry(studi_ids_p___lt));
        }
        if (studi_ids_p___lte != null) {
            joiner.add("studi_ids_p___lte: " + GraphQLRequestSerializer.getEntry(studi_ids_p___lte));
        }
        if (studi_ids_p___gt != null) {
            joiner.add("studi_ids_p___gt: " + GraphQLRequestSerializer.getEntry(studi_ids_p___gt));
        }
        if (studi_ids_p___gte != null) {
            joiner.add("studi_ids_p___gte: " + GraphQLRequestSerializer.getEntry(studi_ids_p___gte));
        }
        if (studi_ids_p___contains != null) {
            joiner.add("studi_ids_p___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_p___contains));
        }
        if (studi_ids_p___not___contains != null) {
            joiner.add("studi_ids_p___not___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_p___not___contains));
        }
        if (studi_ids_p___starts_with != null) {
            joiner.add("studi_ids_p___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_p___starts_with));
        }
        if (studi_ids_p___not___starts_with != null) {
            joiner.add("studi_ids_p___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_p___not___starts_with));
        }
        if (studi_ids_p___ends_with != null) {
            joiner.add("studi_ids_p___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_p___ends_with));
        }
        if (studi_ids_p___not___ends_with != null) {
            joiner.add("studi_ids_p___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_p___not___ends_with));
        }
        if (studi_ids_r___eq != null) {
            joiner.add("studi_ids_r___eq: " + GraphQLRequestSerializer.getEntry(studi_ids_r___eq));
        }
        if (studi_ids_r___ne != null) {
            joiner.add("studi_ids_r___ne: " + GraphQLRequestSerializer.getEntry(studi_ids_r___ne));
        }
        if (studi_ids_r___null != null) {
            joiner.add("studi_ids_r___null: " + GraphQLRequestSerializer.getEntry(studi_ids_r___null));
        }
        if (studi_ids_r___not___null != null) {
            joiner.add("studi_ids_r___not___null: " + GraphQLRequestSerializer.getEntry(studi_ids_r___not___null));
        }
        if (studi_ids_r___in != null) {
            joiner.add("studi_ids_r___in: " + GraphQLRequestSerializer.getEntry(studi_ids_r___in));
        }
        if (studi_ids_r___not___in != null) {
            joiner.add("studi_ids_r___not___in: " + GraphQLRequestSerializer.getEntry(studi_ids_r___not___in));
        }
        if (studi_ids_r___lt != null) {
            joiner.add("studi_ids_r___lt: " + GraphQLRequestSerializer.getEntry(studi_ids_r___lt));
        }
        if (studi_ids_r___lte != null) {
            joiner.add("studi_ids_r___lte: " + GraphQLRequestSerializer.getEntry(studi_ids_r___lte));
        }
        if (studi_ids_r___gt != null) {
            joiner.add("studi_ids_r___gt: " + GraphQLRequestSerializer.getEntry(studi_ids_r___gt));
        }
        if (studi_ids_r___gte != null) {
            joiner.add("studi_ids_r___gte: " + GraphQLRequestSerializer.getEntry(studi_ids_r___gte));
        }
        if (studi_ids_r___contains != null) {
            joiner.add("studi_ids_r___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_r___contains));
        }
        if (studi_ids_r___not___contains != null) {
            joiner.add("studi_ids_r___not___contains: " + GraphQLRequestSerializer.getEntry(studi_ids_r___not___contains));
        }
        if (studi_ids_r___starts_with != null) {
            joiner.add("studi_ids_r___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_r___starts_with));
        }
        if (studi_ids_r___not___starts_with != null) {
            joiner.add("studi_ids_r___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_ids_r___not___starts_with));
        }
        if (studi_ids_r___ends_with != null) {
            joiner.add("studi_ids_r___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_r___ends_with));
        }
        if (studi_ids_r___not___ends_with != null) {
            joiner.add("studi_ids_r___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_ids_r___not___ends_with));
        }
        if (studio_questionario___eq != null) {
            joiner.add("studio_questionario___eq: " + GraphQLRequestSerializer.getEntry(studio_questionario___eq));
        }
        if (studio_questionario___ne != null) {
            joiner.add("studio_questionario___ne: " + GraphQLRequestSerializer.getEntry(studio_questionario___ne));
        }
        if (studio_questionario___null != null) {
            joiner.add("studio_questionario___null: " + GraphQLRequestSerializer.getEntry(studio_questionario___null));
        }
        if (studio_questionario___not___null != null) {
            joiner.add("studio_questionario___not___null: " + GraphQLRequestSerializer.getEntry(studio_questionario___not___null));
        }
        if (studio_questionario___in != null) {
            joiner.add("studio_questionario___in: " + GraphQLRequestSerializer.getEntry(studio_questionario___in));
        }
        if (studio_questionario___not___in != null) {
            joiner.add("studio_questionario___not___in: " + GraphQLRequestSerializer.getEntry(studio_questionario___not___in));
        }
        if (studio_questionario___lt != null) {
            joiner.add("studio_questionario___lt: " + GraphQLRequestSerializer.getEntry(studio_questionario___lt));
        }
        if (studio_questionario___lte != null) {
            joiner.add("studio_questionario___lte: " + GraphQLRequestSerializer.getEntry(studio_questionario___lte));
        }
        if (studio_questionario___gt != null) {
            joiner.add("studio_questionario___gt: " + GraphQLRequestSerializer.getEntry(studio_questionario___gt));
        }
        if (studio_questionario___gte != null) {
            joiner.add("studio_questionario___gte: " + GraphQLRequestSerializer.getEntry(studio_questionario___gte));
        }
        if (studio_questionario___contains != null) {
            joiner.add("studio_questionario___contains: " + GraphQLRequestSerializer.getEntry(studio_questionario___contains));
        }
        if (studio_questionario___not___contains != null) {
            joiner.add("studio_questionario___not___contains: " + GraphQLRequestSerializer.getEntry(studio_questionario___not___contains));
        }
        if (studio_questionario___starts_with != null) {
            joiner.add("studio_questionario___starts_with: " + GraphQLRequestSerializer.getEntry(studio_questionario___starts_with));
        }
        if (studio_questionario___not___starts_with != null) {
            joiner.add("studio_questionario___not___starts_with: " + GraphQLRequestSerializer.getEntry(studio_questionario___not___starts_with));
        }
        if (studio_questionario___ends_with != null) {
            joiner.add("studio_questionario___ends_with: " + GraphQLRequestSerializer.getEntry(studio_questionario___ends_with));
        }
        if (studio_questionario___not___ends_with != null) {
            joiner.add("studio_questionario___not___ends_with: " + GraphQLRequestSerializer.getEntry(studio_questionario___not___ends_with));
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

    public static CliQuestionario_PRO_appFilterDTO.Builder builder() {
        return new CliQuestionario_PRO_appFilterDTO.Builder();
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
        private Boolean alert_obbligatoria1___eq;
        private Boolean alert_obbligatoria1___ne;
        private Boolean alert_obbligatoria1___null;
        private Boolean alert_obbligatoria1___not___null;
        private Boolean alert_obbligatoria2___eq;
        private Boolean alert_obbligatoria2___ne;
        private Boolean alert_obbligatoria2___null;
        private Boolean alert_obbligatoria2___not___null;
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
        private String codice_interno_p___eq;
        private String codice_interno_p___ne;
        private Boolean codice_interno_p___null;
        private Boolean codice_interno_p___not___null;
        private java.util.List<String> codice_interno_p___in;
        private java.util.List<String> codice_interno_p___not___in;
        private String codice_interno_p___lt;
        private String codice_interno_p___lte;
        private String codice_interno_p___gt;
        private String codice_interno_p___gte;
        private String codice_interno_p___contains;
        private String codice_interno_p___not___contains;
        private String codice_interno_p___starts_with;
        private String codice_interno_p___not___starts_with;
        private String codice_interno_p___ends_with;
        private String codice_interno_p___not___ends_with;
        private Boolean confermato___eq;
        private Boolean confermato___ne;
        private Boolean confermato___null;
        private Boolean confermato___not___null;
        private String data_compilazione___eq;
        private String data_compilazione___ne;
        private Boolean data_compilazione___null;
        private Boolean data_compilazione___not___null;
        private java.util.List<String> data_compilazione___in;
        private java.util.List<String> data_compilazione___not___in;
        private String data_compilazione___lt;
        private String data_compilazione___lte;
        private String data_compilazione___gt;
        private String data_compilazione___gte;
        private String domanda_obblig_ids___eq;
        private String domanda_obblig_ids___ne;
        private Boolean domanda_obblig_ids___null;
        private Boolean domanda_obblig_ids___not___null;
        private java.util.List<String> domanda_obblig_ids___in;
        private java.util.List<String> domanda_obblig_ids___not___in;
        private String domanda_obblig_ids___lt;
        private String domanda_obblig_ids___lte;
        private String domanda_obblig_ids___gt;
        private String domanda_obblig_ids___gte;
        private String domanda_obblig_ids___contains;
        private String domanda_obblig_ids___not___contains;
        private String domanda_obblig_ids___starts_with;
        private String domanda_obblig_ids___not___starts_with;
        private String domanda_obblig_ids___ends_with;
        private String domanda_obblig_ids___not___ends_with;
        private String domanda_risp_ids___eq;
        private String domanda_risp_ids___ne;
        private Boolean domanda_risp_ids___null;
        private Boolean domanda_risp_ids___not___null;
        private java.util.List<String> domanda_risp_ids___in;
        private java.util.List<String> domanda_risp_ids___not___in;
        private String domanda_risp_ids___lt;
        private String domanda_risp_ids___lte;
        private String domanda_risp_ids___gt;
        private String domanda_risp_ids___gte;
        private String domanda_risp_ids___contains;
        private String domanda_risp_ids___not___contains;
        private String domanda_risp_ids___starts_with;
        private String domanda_risp_ids___not___starts_with;
        private String domanda_risp_ids___ends_with;
        private String domanda_risp_ids___not___ends_with;
        private Integer domande_totali___eq;
        private Integer domande_totali___ne;
        private Boolean domande_totali___null;
        private Boolean domande_totali___not___null;
        private java.util.List<Integer> domande_totali___in;
        private java.util.List<Integer> domande_totali___not___in;
        private Integer domande_totali___lt;
        private Integer domande_totali___lte;
        private Integer domande_totali___gt;
        private Integer domande_totali___gte;
        private Boolean filtro_classe___eq;
        private Boolean filtro_classe___ne;
        private Boolean filtro_classe___null;
        private Boolean filtro_classe___not___null;
        private Boolean i_filtro_classe___eq;
        private Boolean i_filtro_classe___ne;
        private Boolean i_filtro_classe___null;
        private Boolean i_filtro_classe___not___null;
        private Integer intervallo_compil_mesi___eq;
        private Integer intervallo_compil_mesi___ne;
        private Boolean intervallo_compil_mesi___null;
        private Boolean intervallo_compil_mesi___not___null;
        private java.util.List<Integer> intervallo_compil_mesi___in;
        private java.util.List<Integer> intervallo_compil_mesi___not___in;
        private Integer intervallo_compil_mesi___lt;
        private Integer intervallo_compil_mesi___lte;
        private Integer intervallo_compil_mesi___gt;
        private Integer intervallo_compil_mesi___gte;
        private Integer mesi_trascorsi___eq;
        private Integer mesi_trascorsi___ne;
        private Boolean mesi_trascorsi___null;
        private Boolean mesi_trascorsi___not___null;
        private java.util.List<Integer> mesi_trascorsi___in;
        private java.util.List<Integer> mesi_trascorsi___not___in;
        private Integer mesi_trascorsi___lt;
        private Integer mesi_trascorsi___lte;
        private Integer mesi_trascorsi___gt;
        private Integer mesi_trascorsi___gte;
        private Boolean p_filtro_classe___eq;
        private Boolean p_filtro_classe___ne;
        private Boolean p_filtro_classe___null;
        private Boolean p_filtro_classe___not___null;
        private Boolean parametri_personali___eq;
        private Boolean parametri_personali___ne;
        private Boolean parametri_personali___null;
        private Boolean parametri_personali___not___null;
        private String questionario___eq;
        private String questionario___ne;
        private Boolean questionario___null;
        private Boolean questionario___not___null;
        private java.util.List<String> questionario___in;
        private java.util.List<String> questionario___not___in;
        private String questionario___lt;
        private String questionario___lte;
        private String questionario___gt;
        private String questionario___gte;
        private String questionario___contains;
        private String questionario___not___contains;
        private String questionario___starts_with;
        private String questionario___not___starts_with;
        private String questionario___ends_with;
        private String questionario___not___ends_with;
        private Integer risposte_date___eq;
        private Integer risposte_date___ne;
        private Boolean risposte_date___null;
        private Boolean risposte_date___not___null;
        private java.util.List<Integer> risposte_date___in;
        private java.util.List<Integer> risposte_date___not___in;
        private Integer risposte_date___lt;
        private Integer risposte_date___lte;
        private Integer risposte_date___gt;
        private Integer risposte_date___gte;
        private Integer risposte_mancanti___eq;
        private Integer risposte_mancanti___ne;
        private Boolean risposte_mancanti___null;
        private Boolean risposte_mancanti___not___null;
        private java.util.List<Integer> risposte_mancanti___in;
        private java.util.List<Integer> risposte_mancanti___not___in;
        private Integer risposte_mancanti___lt;
        private Integer risposte_mancanti___lte;
        private Integer risposte_mancanti___gt;
        private Integer risposte_mancanti___gte;
        private String studi_ids___eq;
        private String studi_ids___ne;
        private Boolean studi_ids___null;
        private Boolean studi_ids___not___null;
        private java.util.List<String> studi_ids___in;
        private java.util.List<String> studi_ids___not___in;
        private String studi_ids___lt;
        private String studi_ids___lte;
        private String studi_ids___gt;
        private String studi_ids___gte;
        private String studi_ids___contains;
        private String studi_ids___not___contains;
        private String studi_ids___starts_with;
        private String studi_ids___not___starts_with;
        private String studi_ids___ends_with;
        private String studi_ids___not___ends_with;
        private String studi_ids_b___eq;
        private String studi_ids_b___ne;
        private Boolean studi_ids_b___null;
        private Boolean studi_ids_b___not___null;
        private java.util.List<String> studi_ids_b___in;
        private java.util.List<String> studi_ids_b___not___in;
        private String studi_ids_b___lt;
        private String studi_ids_b___lte;
        private String studi_ids_b___gt;
        private String studi_ids_b___gte;
        private String studi_ids_b___contains;
        private String studi_ids_b___not___contains;
        private String studi_ids_b___starts_with;
        private String studi_ids_b___not___starts_with;
        private String studi_ids_b___ends_with;
        private String studi_ids_b___not___ends_with;
        private String studi_ids_i___eq;
        private String studi_ids_i___ne;
        private Boolean studi_ids_i___null;
        private Boolean studi_ids_i___not___null;
        private java.util.List<String> studi_ids_i___in;
        private java.util.List<String> studi_ids_i___not___in;
        private String studi_ids_i___lt;
        private String studi_ids_i___lte;
        private String studi_ids_i___gt;
        private String studi_ids_i___gte;
        private String studi_ids_i___contains;
        private String studi_ids_i___not___contains;
        private String studi_ids_i___starts_with;
        private String studi_ids_i___not___starts_with;
        private String studi_ids_i___ends_with;
        private String studi_ids_i___not___ends_with;
        private String studi_ids_p___eq;
        private String studi_ids_p___ne;
        private Boolean studi_ids_p___null;
        private Boolean studi_ids_p___not___null;
        private java.util.List<String> studi_ids_p___in;
        private java.util.List<String> studi_ids_p___not___in;
        private String studi_ids_p___lt;
        private String studi_ids_p___lte;
        private String studi_ids_p___gt;
        private String studi_ids_p___gte;
        private String studi_ids_p___contains;
        private String studi_ids_p___not___contains;
        private String studi_ids_p___starts_with;
        private String studi_ids_p___not___starts_with;
        private String studi_ids_p___ends_with;
        private String studi_ids_p___not___ends_with;
        private String studi_ids_r___eq;
        private String studi_ids_r___ne;
        private Boolean studi_ids_r___null;
        private Boolean studi_ids_r___not___null;
        private java.util.List<String> studi_ids_r___in;
        private java.util.List<String> studi_ids_r___not___in;
        private String studi_ids_r___lt;
        private String studi_ids_r___lte;
        private String studi_ids_r___gt;
        private String studi_ids_r___gte;
        private String studi_ids_r___contains;
        private String studi_ids_r___not___contains;
        private String studi_ids_r___starts_with;
        private String studi_ids_r___not___starts_with;
        private String studi_ids_r___ends_with;
        private String studi_ids_r___not___ends_with;
        private String studio_questionario___eq;
        private String studio_questionario___ne;
        private Boolean studio_questionario___null;
        private Boolean studio_questionario___not___null;
        private java.util.List<String> studio_questionario___in;
        private java.util.List<String> studio_questionario___not___in;
        private String studio_questionario___lt;
        private String studio_questionario___lte;
        private String studio_questionario___gt;
        private String studio_questionario___gte;
        private String studio_questionario___contains;
        private String studio_questionario___not___contains;
        private String studio_questionario___starts_with;
        private String studio_questionario___not___starts_with;
        private String studio_questionario___ends_with;
        private String studio_questionario___not___ends_with;
        private java.util.List<CliQuestionario_PRO_appFilterDTO> AND;
        private java.util.List<CliQuestionario_PRO_appFilterDTO> OR;
        private CliQuestionario_PRO_appFilterDTO NOT;

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

        public Builder setAlert_obbligatoria1___eq(Boolean alert_obbligatoria1___eq) {
            this.alert_obbligatoria1___eq = alert_obbligatoria1___eq;
            return this;
        }

        public Builder setAlert_obbligatoria1___ne(Boolean alert_obbligatoria1___ne) {
            this.alert_obbligatoria1___ne = alert_obbligatoria1___ne;
            return this;
        }

        public Builder setAlert_obbligatoria1___null(Boolean alert_obbligatoria1___null) {
            this.alert_obbligatoria1___null = alert_obbligatoria1___null;
            return this;
        }

        public Builder setAlert_obbligatoria1___not___null(Boolean alert_obbligatoria1___not___null) {
            this.alert_obbligatoria1___not___null = alert_obbligatoria1___not___null;
            return this;
        }

        public Builder setAlert_obbligatoria2___eq(Boolean alert_obbligatoria2___eq) {
            this.alert_obbligatoria2___eq = alert_obbligatoria2___eq;
            return this;
        }

        public Builder setAlert_obbligatoria2___ne(Boolean alert_obbligatoria2___ne) {
            this.alert_obbligatoria2___ne = alert_obbligatoria2___ne;
            return this;
        }

        public Builder setAlert_obbligatoria2___null(Boolean alert_obbligatoria2___null) {
            this.alert_obbligatoria2___null = alert_obbligatoria2___null;
            return this;
        }

        public Builder setAlert_obbligatoria2___not___null(Boolean alert_obbligatoria2___not___null) {
            this.alert_obbligatoria2___not___null = alert_obbligatoria2___not___null;
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

        public Builder setCodice_interno_p___eq(String codice_interno_p___eq) {
            this.codice_interno_p___eq = codice_interno_p___eq;
            return this;
        }

        public Builder setCodice_interno_p___ne(String codice_interno_p___ne) {
            this.codice_interno_p___ne = codice_interno_p___ne;
            return this;
        }

        public Builder setCodice_interno_p___null(Boolean codice_interno_p___null) {
            this.codice_interno_p___null = codice_interno_p___null;
            return this;
        }

        public Builder setCodice_interno_p___not___null(Boolean codice_interno_p___not___null) {
            this.codice_interno_p___not___null = codice_interno_p___not___null;
            return this;
        }

        public Builder setCodice_interno_p___in(java.util.List<String> codice_interno_p___in) {
            this.codice_interno_p___in = codice_interno_p___in;
            return this;
        }

        public Builder setCodice_interno_p___not___in(java.util.List<String> codice_interno_p___not___in) {
            this.codice_interno_p___not___in = codice_interno_p___not___in;
            return this;
        }

        public Builder setCodice_interno_p___lt(String codice_interno_p___lt) {
            this.codice_interno_p___lt = codice_interno_p___lt;
            return this;
        }

        public Builder setCodice_interno_p___lte(String codice_interno_p___lte) {
            this.codice_interno_p___lte = codice_interno_p___lte;
            return this;
        }

        public Builder setCodice_interno_p___gt(String codice_interno_p___gt) {
            this.codice_interno_p___gt = codice_interno_p___gt;
            return this;
        }

        public Builder setCodice_interno_p___gte(String codice_interno_p___gte) {
            this.codice_interno_p___gte = codice_interno_p___gte;
            return this;
        }

        public Builder setCodice_interno_p___contains(String codice_interno_p___contains) {
            this.codice_interno_p___contains = codice_interno_p___contains;
            return this;
        }

        public Builder setCodice_interno_p___not___contains(String codice_interno_p___not___contains) {
            this.codice_interno_p___not___contains = codice_interno_p___not___contains;
            return this;
        }

        public Builder setCodice_interno_p___starts_with(String codice_interno_p___starts_with) {
            this.codice_interno_p___starts_with = codice_interno_p___starts_with;
            return this;
        }

        public Builder setCodice_interno_p___not___starts_with(String codice_interno_p___not___starts_with) {
            this.codice_interno_p___not___starts_with = codice_interno_p___not___starts_with;
            return this;
        }

        public Builder setCodice_interno_p___ends_with(String codice_interno_p___ends_with) {
            this.codice_interno_p___ends_with = codice_interno_p___ends_with;
            return this;
        }

        public Builder setCodice_interno_p___not___ends_with(String codice_interno_p___not___ends_with) {
            this.codice_interno_p___not___ends_with = codice_interno_p___not___ends_with;
            return this;
        }

        public Builder setConfermato___eq(Boolean confermato___eq) {
            this.confermato___eq = confermato___eq;
            return this;
        }

        public Builder setConfermato___ne(Boolean confermato___ne) {
            this.confermato___ne = confermato___ne;
            return this;
        }

        public Builder setConfermato___null(Boolean confermato___null) {
            this.confermato___null = confermato___null;
            return this;
        }

        public Builder setConfermato___not___null(Boolean confermato___not___null) {
            this.confermato___not___null = confermato___not___null;
            return this;
        }

        public Builder setData_compilazione___eq(String data_compilazione___eq) {
            this.data_compilazione___eq = data_compilazione___eq;
            return this;
        }

        public Builder setData_compilazione___ne(String data_compilazione___ne) {
            this.data_compilazione___ne = data_compilazione___ne;
            return this;
        }

        public Builder setData_compilazione___null(Boolean data_compilazione___null) {
            this.data_compilazione___null = data_compilazione___null;
            return this;
        }

        public Builder setData_compilazione___not___null(Boolean data_compilazione___not___null) {
            this.data_compilazione___not___null = data_compilazione___not___null;
            return this;
        }

        public Builder setData_compilazione___in(java.util.List<String> data_compilazione___in) {
            this.data_compilazione___in = data_compilazione___in;
            return this;
        }

        public Builder setData_compilazione___not___in(java.util.List<String> data_compilazione___not___in) {
            this.data_compilazione___not___in = data_compilazione___not___in;
            return this;
        }

        public Builder setData_compilazione___lt(String data_compilazione___lt) {
            this.data_compilazione___lt = data_compilazione___lt;
            return this;
        }

        public Builder setData_compilazione___lte(String data_compilazione___lte) {
            this.data_compilazione___lte = data_compilazione___lte;
            return this;
        }

        public Builder setData_compilazione___gt(String data_compilazione___gt) {
            this.data_compilazione___gt = data_compilazione___gt;
            return this;
        }

        public Builder setData_compilazione___gte(String data_compilazione___gte) {
            this.data_compilazione___gte = data_compilazione___gte;
            return this;
        }

        public Builder setDomanda_obblig_ids___eq(String domanda_obblig_ids___eq) {
            this.domanda_obblig_ids___eq = domanda_obblig_ids___eq;
            return this;
        }

        public Builder setDomanda_obblig_ids___ne(String domanda_obblig_ids___ne) {
            this.domanda_obblig_ids___ne = domanda_obblig_ids___ne;
            return this;
        }

        public Builder setDomanda_obblig_ids___null(Boolean domanda_obblig_ids___null) {
            this.domanda_obblig_ids___null = domanda_obblig_ids___null;
            return this;
        }

        public Builder setDomanda_obblig_ids___not___null(Boolean domanda_obblig_ids___not___null) {
            this.domanda_obblig_ids___not___null = domanda_obblig_ids___not___null;
            return this;
        }

        public Builder setDomanda_obblig_ids___in(java.util.List<String> domanda_obblig_ids___in) {
            this.domanda_obblig_ids___in = domanda_obblig_ids___in;
            return this;
        }

        public Builder setDomanda_obblig_ids___not___in(java.util.List<String> domanda_obblig_ids___not___in) {
            this.domanda_obblig_ids___not___in = domanda_obblig_ids___not___in;
            return this;
        }

        public Builder setDomanda_obblig_ids___lt(String domanda_obblig_ids___lt) {
            this.domanda_obblig_ids___lt = domanda_obblig_ids___lt;
            return this;
        }

        public Builder setDomanda_obblig_ids___lte(String domanda_obblig_ids___lte) {
            this.domanda_obblig_ids___lte = domanda_obblig_ids___lte;
            return this;
        }

        public Builder setDomanda_obblig_ids___gt(String domanda_obblig_ids___gt) {
            this.domanda_obblig_ids___gt = domanda_obblig_ids___gt;
            return this;
        }

        public Builder setDomanda_obblig_ids___gte(String domanda_obblig_ids___gte) {
            this.domanda_obblig_ids___gte = domanda_obblig_ids___gte;
            return this;
        }

        public Builder setDomanda_obblig_ids___contains(String domanda_obblig_ids___contains) {
            this.domanda_obblig_ids___contains = domanda_obblig_ids___contains;
            return this;
        }

        public Builder setDomanda_obblig_ids___not___contains(String domanda_obblig_ids___not___contains) {
            this.domanda_obblig_ids___not___contains = domanda_obblig_ids___not___contains;
            return this;
        }

        public Builder setDomanda_obblig_ids___starts_with(String domanda_obblig_ids___starts_with) {
            this.domanda_obblig_ids___starts_with = domanda_obblig_ids___starts_with;
            return this;
        }

        public Builder setDomanda_obblig_ids___not___starts_with(String domanda_obblig_ids___not___starts_with) {
            this.domanda_obblig_ids___not___starts_with = domanda_obblig_ids___not___starts_with;
            return this;
        }

        public Builder setDomanda_obblig_ids___ends_with(String domanda_obblig_ids___ends_with) {
            this.domanda_obblig_ids___ends_with = domanda_obblig_ids___ends_with;
            return this;
        }

        public Builder setDomanda_obblig_ids___not___ends_with(String domanda_obblig_ids___not___ends_with) {
            this.domanda_obblig_ids___not___ends_with = domanda_obblig_ids___not___ends_with;
            return this;
        }

        public Builder setDomanda_risp_ids___eq(String domanda_risp_ids___eq) {
            this.domanda_risp_ids___eq = domanda_risp_ids___eq;
            return this;
        }

        public Builder setDomanda_risp_ids___ne(String domanda_risp_ids___ne) {
            this.domanda_risp_ids___ne = domanda_risp_ids___ne;
            return this;
        }

        public Builder setDomanda_risp_ids___null(Boolean domanda_risp_ids___null) {
            this.domanda_risp_ids___null = domanda_risp_ids___null;
            return this;
        }

        public Builder setDomanda_risp_ids___not___null(Boolean domanda_risp_ids___not___null) {
            this.domanda_risp_ids___not___null = domanda_risp_ids___not___null;
            return this;
        }

        public Builder setDomanda_risp_ids___in(java.util.List<String> domanda_risp_ids___in) {
            this.domanda_risp_ids___in = domanda_risp_ids___in;
            return this;
        }

        public Builder setDomanda_risp_ids___not___in(java.util.List<String> domanda_risp_ids___not___in) {
            this.domanda_risp_ids___not___in = domanda_risp_ids___not___in;
            return this;
        }

        public Builder setDomanda_risp_ids___lt(String domanda_risp_ids___lt) {
            this.domanda_risp_ids___lt = domanda_risp_ids___lt;
            return this;
        }

        public Builder setDomanda_risp_ids___lte(String domanda_risp_ids___lte) {
            this.domanda_risp_ids___lte = domanda_risp_ids___lte;
            return this;
        }

        public Builder setDomanda_risp_ids___gt(String domanda_risp_ids___gt) {
            this.domanda_risp_ids___gt = domanda_risp_ids___gt;
            return this;
        }

        public Builder setDomanda_risp_ids___gte(String domanda_risp_ids___gte) {
            this.domanda_risp_ids___gte = domanda_risp_ids___gte;
            return this;
        }

        public Builder setDomanda_risp_ids___contains(String domanda_risp_ids___contains) {
            this.domanda_risp_ids___contains = domanda_risp_ids___contains;
            return this;
        }

        public Builder setDomanda_risp_ids___not___contains(String domanda_risp_ids___not___contains) {
            this.domanda_risp_ids___not___contains = domanda_risp_ids___not___contains;
            return this;
        }

        public Builder setDomanda_risp_ids___starts_with(String domanda_risp_ids___starts_with) {
            this.domanda_risp_ids___starts_with = domanda_risp_ids___starts_with;
            return this;
        }

        public Builder setDomanda_risp_ids___not___starts_with(String domanda_risp_ids___not___starts_with) {
            this.domanda_risp_ids___not___starts_with = domanda_risp_ids___not___starts_with;
            return this;
        }

        public Builder setDomanda_risp_ids___ends_with(String domanda_risp_ids___ends_with) {
            this.domanda_risp_ids___ends_with = domanda_risp_ids___ends_with;
            return this;
        }

        public Builder setDomanda_risp_ids___not___ends_with(String domanda_risp_ids___not___ends_with) {
            this.domanda_risp_ids___not___ends_with = domanda_risp_ids___not___ends_with;
            return this;
        }

        public Builder setDomande_totali___eq(Integer domande_totali___eq) {
            this.domande_totali___eq = domande_totali___eq;
            return this;
        }

        public Builder setDomande_totali___ne(Integer domande_totali___ne) {
            this.domande_totali___ne = domande_totali___ne;
            return this;
        }

        public Builder setDomande_totali___null(Boolean domande_totali___null) {
            this.domande_totali___null = domande_totali___null;
            return this;
        }

        public Builder setDomande_totali___not___null(Boolean domande_totali___not___null) {
            this.domande_totali___not___null = domande_totali___not___null;
            return this;
        }

        public Builder setDomande_totali___in(java.util.List<Integer> domande_totali___in) {
            this.domande_totali___in = domande_totali___in;
            return this;
        }

        public Builder setDomande_totali___not___in(java.util.List<Integer> domande_totali___not___in) {
            this.domande_totali___not___in = domande_totali___not___in;
            return this;
        }

        public Builder setDomande_totali___lt(Integer domande_totali___lt) {
            this.domande_totali___lt = domande_totali___lt;
            return this;
        }

        public Builder setDomande_totali___lte(Integer domande_totali___lte) {
            this.domande_totali___lte = domande_totali___lte;
            return this;
        }

        public Builder setDomande_totali___gt(Integer domande_totali___gt) {
            this.domande_totali___gt = domande_totali___gt;
            return this;
        }

        public Builder setDomande_totali___gte(Integer domande_totali___gte) {
            this.domande_totali___gte = domande_totali___gte;
            return this;
        }

        public Builder setFiltro_classe___eq(Boolean filtro_classe___eq) {
            this.filtro_classe___eq = filtro_classe___eq;
            return this;
        }

        public Builder setFiltro_classe___ne(Boolean filtro_classe___ne) {
            this.filtro_classe___ne = filtro_classe___ne;
            return this;
        }

        public Builder setFiltro_classe___null(Boolean filtro_classe___null) {
            this.filtro_classe___null = filtro_classe___null;
            return this;
        }

        public Builder setFiltro_classe___not___null(Boolean filtro_classe___not___null) {
            this.filtro_classe___not___null = filtro_classe___not___null;
            return this;
        }

        public Builder setI_filtro_classe___eq(Boolean i_filtro_classe___eq) {
            this.i_filtro_classe___eq = i_filtro_classe___eq;
            return this;
        }

        public Builder setI_filtro_classe___ne(Boolean i_filtro_classe___ne) {
            this.i_filtro_classe___ne = i_filtro_classe___ne;
            return this;
        }

        public Builder setI_filtro_classe___null(Boolean i_filtro_classe___null) {
            this.i_filtro_classe___null = i_filtro_classe___null;
            return this;
        }

        public Builder setI_filtro_classe___not___null(Boolean i_filtro_classe___not___null) {
            this.i_filtro_classe___not___null = i_filtro_classe___not___null;
            return this;
        }

        public Builder setIntervallo_compil_mesi___eq(Integer intervallo_compil_mesi___eq) {
            this.intervallo_compil_mesi___eq = intervallo_compil_mesi___eq;
            return this;
        }

        public Builder setIntervallo_compil_mesi___ne(Integer intervallo_compil_mesi___ne) {
            this.intervallo_compil_mesi___ne = intervallo_compil_mesi___ne;
            return this;
        }

        public Builder setIntervallo_compil_mesi___null(Boolean intervallo_compil_mesi___null) {
            this.intervallo_compil_mesi___null = intervallo_compil_mesi___null;
            return this;
        }

        public Builder setIntervallo_compil_mesi___not___null(Boolean intervallo_compil_mesi___not___null) {
            this.intervallo_compil_mesi___not___null = intervallo_compil_mesi___not___null;
            return this;
        }

        public Builder setIntervallo_compil_mesi___in(java.util.List<Integer> intervallo_compil_mesi___in) {
            this.intervallo_compil_mesi___in = intervallo_compil_mesi___in;
            return this;
        }

        public Builder setIntervallo_compil_mesi___not___in(java.util.List<Integer> intervallo_compil_mesi___not___in) {
            this.intervallo_compil_mesi___not___in = intervallo_compil_mesi___not___in;
            return this;
        }

        public Builder setIntervallo_compil_mesi___lt(Integer intervallo_compil_mesi___lt) {
            this.intervallo_compil_mesi___lt = intervallo_compil_mesi___lt;
            return this;
        }

        public Builder setIntervallo_compil_mesi___lte(Integer intervallo_compil_mesi___lte) {
            this.intervallo_compil_mesi___lte = intervallo_compil_mesi___lte;
            return this;
        }

        public Builder setIntervallo_compil_mesi___gt(Integer intervallo_compil_mesi___gt) {
            this.intervallo_compil_mesi___gt = intervallo_compil_mesi___gt;
            return this;
        }

        public Builder setIntervallo_compil_mesi___gte(Integer intervallo_compil_mesi___gte) {
            this.intervallo_compil_mesi___gte = intervallo_compil_mesi___gte;
            return this;
        }

        public Builder setMesi_trascorsi___eq(Integer mesi_trascorsi___eq) {
            this.mesi_trascorsi___eq = mesi_trascorsi___eq;
            return this;
        }

        public Builder setMesi_trascorsi___ne(Integer mesi_trascorsi___ne) {
            this.mesi_trascorsi___ne = mesi_trascorsi___ne;
            return this;
        }

        public Builder setMesi_trascorsi___null(Boolean mesi_trascorsi___null) {
            this.mesi_trascorsi___null = mesi_trascorsi___null;
            return this;
        }

        public Builder setMesi_trascorsi___not___null(Boolean mesi_trascorsi___not___null) {
            this.mesi_trascorsi___not___null = mesi_trascorsi___not___null;
            return this;
        }

        public Builder setMesi_trascorsi___in(java.util.List<Integer> mesi_trascorsi___in) {
            this.mesi_trascorsi___in = mesi_trascorsi___in;
            return this;
        }

        public Builder setMesi_trascorsi___not___in(java.util.List<Integer> mesi_trascorsi___not___in) {
            this.mesi_trascorsi___not___in = mesi_trascorsi___not___in;
            return this;
        }

        public Builder setMesi_trascorsi___lt(Integer mesi_trascorsi___lt) {
            this.mesi_trascorsi___lt = mesi_trascorsi___lt;
            return this;
        }

        public Builder setMesi_trascorsi___lte(Integer mesi_trascorsi___lte) {
            this.mesi_trascorsi___lte = mesi_trascorsi___lte;
            return this;
        }

        public Builder setMesi_trascorsi___gt(Integer mesi_trascorsi___gt) {
            this.mesi_trascorsi___gt = mesi_trascorsi___gt;
            return this;
        }

        public Builder setMesi_trascorsi___gte(Integer mesi_trascorsi___gte) {
            this.mesi_trascorsi___gte = mesi_trascorsi___gte;
            return this;
        }

        public Builder setP_filtro_classe___eq(Boolean p_filtro_classe___eq) {
            this.p_filtro_classe___eq = p_filtro_classe___eq;
            return this;
        }

        public Builder setP_filtro_classe___ne(Boolean p_filtro_classe___ne) {
            this.p_filtro_classe___ne = p_filtro_classe___ne;
            return this;
        }

        public Builder setP_filtro_classe___null(Boolean p_filtro_classe___null) {
            this.p_filtro_classe___null = p_filtro_classe___null;
            return this;
        }

        public Builder setP_filtro_classe___not___null(Boolean p_filtro_classe___not___null) {
            this.p_filtro_classe___not___null = p_filtro_classe___not___null;
            return this;
        }

        public Builder setParametri_personali___eq(Boolean parametri_personali___eq) {
            this.parametri_personali___eq = parametri_personali___eq;
            return this;
        }

        public Builder setParametri_personali___ne(Boolean parametri_personali___ne) {
            this.parametri_personali___ne = parametri_personali___ne;
            return this;
        }

        public Builder setParametri_personali___null(Boolean parametri_personali___null) {
            this.parametri_personali___null = parametri_personali___null;
            return this;
        }

        public Builder setParametri_personali___not___null(Boolean parametri_personali___not___null) {
            this.parametri_personali___not___null = parametri_personali___not___null;
            return this;
        }

        public Builder setQuestionario___eq(String questionario___eq) {
            this.questionario___eq = questionario___eq;
            return this;
        }

        public Builder setQuestionario___ne(String questionario___ne) {
            this.questionario___ne = questionario___ne;
            return this;
        }

        public Builder setQuestionario___null(Boolean questionario___null) {
            this.questionario___null = questionario___null;
            return this;
        }

        public Builder setQuestionario___not___null(Boolean questionario___not___null) {
            this.questionario___not___null = questionario___not___null;
            return this;
        }

        public Builder setQuestionario___in(java.util.List<String> questionario___in) {
            this.questionario___in = questionario___in;
            return this;
        }

        public Builder setQuestionario___not___in(java.util.List<String> questionario___not___in) {
            this.questionario___not___in = questionario___not___in;
            return this;
        }

        public Builder setQuestionario___lt(String questionario___lt) {
            this.questionario___lt = questionario___lt;
            return this;
        }

        public Builder setQuestionario___lte(String questionario___lte) {
            this.questionario___lte = questionario___lte;
            return this;
        }

        public Builder setQuestionario___gt(String questionario___gt) {
            this.questionario___gt = questionario___gt;
            return this;
        }

        public Builder setQuestionario___gte(String questionario___gte) {
            this.questionario___gte = questionario___gte;
            return this;
        }

        public Builder setQuestionario___contains(String questionario___contains) {
            this.questionario___contains = questionario___contains;
            return this;
        }

        public Builder setQuestionario___not___contains(String questionario___not___contains) {
            this.questionario___not___contains = questionario___not___contains;
            return this;
        }

        public Builder setQuestionario___starts_with(String questionario___starts_with) {
            this.questionario___starts_with = questionario___starts_with;
            return this;
        }

        public Builder setQuestionario___not___starts_with(String questionario___not___starts_with) {
            this.questionario___not___starts_with = questionario___not___starts_with;
            return this;
        }

        public Builder setQuestionario___ends_with(String questionario___ends_with) {
            this.questionario___ends_with = questionario___ends_with;
            return this;
        }

        public Builder setQuestionario___not___ends_with(String questionario___not___ends_with) {
            this.questionario___not___ends_with = questionario___not___ends_with;
            return this;
        }

        public Builder setRisposte_date___eq(Integer risposte_date___eq) {
            this.risposte_date___eq = risposte_date___eq;
            return this;
        }

        public Builder setRisposte_date___ne(Integer risposte_date___ne) {
            this.risposte_date___ne = risposte_date___ne;
            return this;
        }

        public Builder setRisposte_date___null(Boolean risposte_date___null) {
            this.risposte_date___null = risposte_date___null;
            return this;
        }

        public Builder setRisposte_date___not___null(Boolean risposte_date___not___null) {
            this.risposte_date___not___null = risposte_date___not___null;
            return this;
        }

        public Builder setRisposte_date___in(java.util.List<Integer> risposte_date___in) {
            this.risposte_date___in = risposte_date___in;
            return this;
        }

        public Builder setRisposte_date___not___in(java.util.List<Integer> risposte_date___not___in) {
            this.risposte_date___not___in = risposte_date___not___in;
            return this;
        }

        public Builder setRisposte_date___lt(Integer risposte_date___lt) {
            this.risposte_date___lt = risposte_date___lt;
            return this;
        }

        public Builder setRisposte_date___lte(Integer risposte_date___lte) {
            this.risposte_date___lte = risposte_date___lte;
            return this;
        }

        public Builder setRisposte_date___gt(Integer risposte_date___gt) {
            this.risposte_date___gt = risposte_date___gt;
            return this;
        }

        public Builder setRisposte_date___gte(Integer risposte_date___gte) {
            this.risposte_date___gte = risposte_date___gte;
            return this;
        }

        public Builder setRisposte_mancanti___eq(Integer risposte_mancanti___eq) {
            this.risposte_mancanti___eq = risposte_mancanti___eq;
            return this;
        }

        public Builder setRisposte_mancanti___ne(Integer risposte_mancanti___ne) {
            this.risposte_mancanti___ne = risposte_mancanti___ne;
            return this;
        }

        public Builder setRisposte_mancanti___null(Boolean risposte_mancanti___null) {
            this.risposte_mancanti___null = risposte_mancanti___null;
            return this;
        }

        public Builder setRisposte_mancanti___not___null(Boolean risposte_mancanti___not___null) {
            this.risposte_mancanti___not___null = risposte_mancanti___not___null;
            return this;
        }

        public Builder setRisposte_mancanti___in(java.util.List<Integer> risposte_mancanti___in) {
            this.risposte_mancanti___in = risposte_mancanti___in;
            return this;
        }

        public Builder setRisposte_mancanti___not___in(java.util.List<Integer> risposte_mancanti___not___in) {
            this.risposte_mancanti___not___in = risposte_mancanti___not___in;
            return this;
        }

        public Builder setRisposte_mancanti___lt(Integer risposte_mancanti___lt) {
            this.risposte_mancanti___lt = risposte_mancanti___lt;
            return this;
        }

        public Builder setRisposte_mancanti___lte(Integer risposte_mancanti___lte) {
            this.risposte_mancanti___lte = risposte_mancanti___lte;
            return this;
        }

        public Builder setRisposte_mancanti___gt(Integer risposte_mancanti___gt) {
            this.risposte_mancanti___gt = risposte_mancanti___gt;
            return this;
        }

        public Builder setRisposte_mancanti___gte(Integer risposte_mancanti___gte) {
            this.risposte_mancanti___gte = risposte_mancanti___gte;
            return this;
        }

        public Builder setStudi_ids___eq(String studi_ids___eq) {
            this.studi_ids___eq = studi_ids___eq;
            return this;
        }

        public Builder setStudi_ids___ne(String studi_ids___ne) {
            this.studi_ids___ne = studi_ids___ne;
            return this;
        }

        public Builder setStudi_ids___null(Boolean studi_ids___null) {
            this.studi_ids___null = studi_ids___null;
            return this;
        }

        public Builder setStudi_ids___not___null(Boolean studi_ids___not___null) {
            this.studi_ids___not___null = studi_ids___not___null;
            return this;
        }

        public Builder setStudi_ids___in(java.util.List<String> studi_ids___in) {
            this.studi_ids___in = studi_ids___in;
            return this;
        }

        public Builder setStudi_ids___not___in(java.util.List<String> studi_ids___not___in) {
            this.studi_ids___not___in = studi_ids___not___in;
            return this;
        }

        public Builder setStudi_ids___lt(String studi_ids___lt) {
            this.studi_ids___lt = studi_ids___lt;
            return this;
        }

        public Builder setStudi_ids___lte(String studi_ids___lte) {
            this.studi_ids___lte = studi_ids___lte;
            return this;
        }

        public Builder setStudi_ids___gt(String studi_ids___gt) {
            this.studi_ids___gt = studi_ids___gt;
            return this;
        }

        public Builder setStudi_ids___gte(String studi_ids___gte) {
            this.studi_ids___gte = studi_ids___gte;
            return this;
        }

        public Builder setStudi_ids___contains(String studi_ids___contains) {
            this.studi_ids___contains = studi_ids___contains;
            return this;
        }

        public Builder setStudi_ids___not___contains(String studi_ids___not___contains) {
            this.studi_ids___not___contains = studi_ids___not___contains;
            return this;
        }

        public Builder setStudi_ids___starts_with(String studi_ids___starts_with) {
            this.studi_ids___starts_with = studi_ids___starts_with;
            return this;
        }

        public Builder setStudi_ids___not___starts_with(String studi_ids___not___starts_with) {
            this.studi_ids___not___starts_with = studi_ids___not___starts_with;
            return this;
        }

        public Builder setStudi_ids___ends_with(String studi_ids___ends_with) {
            this.studi_ids___ends_with = studi_ids___ends_with;
            return this;
        }

        public Builder setStudi_ids___not___ends_with(String studi_ids___not___ends_with) {
            this.studi_ids___not___ends_with = studi_ids___not___ends_with;
            return this;
        }

        public Builder setStudi_ids_b___eq(String studi_ids_b___eq) {
            this.studi_ids_b___eq = studi_ids_b___eq;
            return this;
        }

        public Builder setStudi_ids_b___ne(String studi_ids_b___ne) {
            this.studi_ids_b___ne = studi_ids_b___ne;
            return this;
        }

        public Builder setStudi_ids_b___null(Boolean studi_ids_b___null) {
            this.studi_ids_b___null = studi_ids_b___null;
            return this;
        }

        public Builder setStudi_ids_b___not___null(Boolean studi_ids_b___not___null) {
            this.studi_ids_b___not___null = studi_ids_b___not___null;
            return this;
        }

        public Builder setStudi_ids_b___in(java.util.List<String> studi_ids_b___in) {
            this.studi_ids_b___in = studi_ids_b___in;
            return this;
        }

        public Builder setStudi_ids_b___not___in(java.util.List<String> studi_ids_b___not___in) {
            this.studi_ids_b___not___in = studi_ids_b___not___in;
            return this;
        }

        public Builder setStudi_ids_b___lt(String studi_ids_b___lt) {
            this.studi_ids_b___lt = studi_ids_b___lt;
            return this;
        }

        public Builder setStudi_ids_b___lte(String studi_ids_b___lte) {
            this.studi_ids_b___lte = studi_ids_b___lte;
            return this;
        }

        public Builder setStudi_ids_b___gt(String studi_ids_b___gt) {
            this.studi_ids_b___gt = studi_ids_b___gt;
            return this;
        }

        public Builder setStudi_ids_b___gte(String studi_ids_b___gte) {
            this.studi_ids_b___gte = studi_ids_b___gte;
            return this;
        }

        public Builder setStudi_ids_b___contains(String studi_ids_b___contains) {
            this.studi_ids_b___contains = studi_ids_b___contains;
            return this;
        }

        public Builder setStudi_ids_b___not___contains(String studi_ids_b___not___contains) {
            this.studi_ids_b___not___contains = studi_ids_b___not___contains;
            return this;
        }

        public Builder setStudi_ids_b___starts_with(String studi_ids_b___starts_with) {
            this.studi_ids_b___starts_with = studi_ids_b___starts_with;
            return this;
        }

        public Builder setStudi_ids_b___not___starts_with(String studi_ids_b___not___starts_with) {
            this.studi_ids_b___not___starts_with = studi_ids_b___not___starts_with;
            return this;
        }

        public Builder setStudi_ids_b___ends_with(String studi_ids_b___ends_with) {
            this.studi_ids_b___ends_with = studi_ids_b___ends_with;
            return this;
        }

        public Builder setStudi_ids_b___not___ends_with(String studi_ids_b___not___ends_with) {
            this.studi_ids_b___not___ends_with = studi_ids_b___not___ends_with;
            return this;
        }

        public Builder setStudi_ids_i___eq(String studi_ids_i___eq) {
            this.studi_ids_i___eq = studi_ids_i___eq;
            return this;
        }

        public Builder setStudi_ids_i___ne(String studi_ids_i___ne) {
            this.studi_ids_i___ne = studi_ids_i___ne;
            return this;
        }

        public Builder setStudi_ids_i___null(Boolean studi_ids_i___null) {
            this.studi_ids_i___null = studi_ids_i___null;
            return this;
        }

        public Builder setStudi_ids_i___not___null(Boolean studi_ids_i___not___null) {
            this.studi_ids_i___not___null = studi_ids_i___not___null;
            return this;
        }

        public Builder setStudi_ids_i___in(java.util.List<String> studi_ids_i___in) {
            this.studi_ids_i___in = studi_ids_i___in;
            return this;
        }

        public Builder setStudi_ids_i___not___in(java.util.List<String> studi_ids_i___not___in) {
            this.studi_ids_i___not___in = studi_ids_i___not___in;
            return this;
        }

        public Builder setStudi_ids_i___lt(String studi_ids_i___lt) {
            this.studi_ids_i___lt = studi_ids_i___lt;
            return this;
        }

        public Builder setStudi_ids_i___lte(String studi_ids_i___lte) {
            this.studi_ids_i___lte = studi_ids_i___lte;
            return this;
        }

        public Builder setStudi_ids_i___gt(String studi_ids_i___gt) {
            this.studi_ids_i___gt = studi_ids_i___gt;
            return this;
        }

        public Builder setStudi_ids_i___gte(String studi_ids_i___gte) {
            this.studi_ids_i___gte = studi_ids_i___gte;
            return this;
        }

        public Builder setStudi_ids_i___contains(String studi_ids_i___contains) {
            this.studi_ids_i___contains = studi_ids_i___contains;
            return this;
        }

        public Builder setStudi_ids_i___not___contains(String studi_ids_i___not___contains) {
            this.studi_ids_i___not___contains = studi_ids_i___not___contains;
            return this;
        }

        public Builder setStudi_ids_i___starts_with(String studi_ids_i___starts_with) {
            this.studi_ids_i___starts_with = studi_ids_i___starts_with;
            return this;
        }

        public Builder setStudi_ids_i___not___starts_with(String studi_ids_i___not___starts_with) {
            this.studi_ids_i___not___starts_with = studi_ids_i___not___starts_with;
            return this;
        }

        public Builder setStudi_ids_i___ends_with(String studi_ids_i___ends_with) {
            this.studi_ids_i___ends_with = studi_ids_i___ends_with;
            return this;
        }

        public Builder setStudi_ids_i___not___ends_with(String studi_ids_i___not___ends_with) {
            this.studi_ids_i___not___ends_with = studi_ids_i___not___ends_with;
            return this;
        }

        public Builder setStudi_ids_p___eq(String studi_ids_p___eq) {
            this.studi_ids_p___eq = studi_ids_p___eq;
            return this;
        }

        public Builder setStudi_ids_p___ne(String studi_ids_p___ne) {
            this.studi_ids_p___ne = studi_ids_p___ne;
            return this;
        }

        public Builder setStudi_ids_p___null(Boolean studi_ids_p___null) {
            this.studi_ids_p___null = studi_ids_p___null;
            return this;
        }

        public Builder setStudi_ids_p___not___null(Boolean studi_ids_p___not___null) {
            this.studi_ids_p___not___null = studi_ids_p___not___null;
            return this;
        }

        public Builder setStudi_ids_p___in(java.util.List<String> studi_ids_p___in) {
            this.studi_ids_p___in = studi_ids_p___in;
            return this;
        }

        public Builder setStudi_ids_p___not___in(java.util.List<String> studi_ids_p___not___in) {
            this.studi_ids_p___not___in = studi_ids_p___not___in;
            return this;
        }

        public Builder setStudi_ids_p___lt(String studi_ids_p___lt) {
            this.studi_ids_p___lt = studi_ids_p___lt;
            return this;
        }

        public Builder setStudi_ids_p___lte(String studi_ids_p___lte) {
            this.studi_ids_p___lte = studi_ids_p___lte;
            return this;
        }

        public Builder setStudi_ids_p___gt(String studi_ids_p___gt) {
            this.studi_ids_p___gt = studi_ids_p___gt;
            return this;
        }

        public Builder setStudi_ids_p___gte(String studi_ids_p___gte) {
            this.studi_ids_p___gte = studi_ids_p___gte;
            return this;
        }

        public Builder setStudi_ids_p___contains(String studi_ids_p___contains) {
            this.studi_ids_p___contains = studi_ids_p___contains;
            return this;
        }

        public Builder setStudi_ids_p___not___contains(String studi_ids_p___not___contains) {
            this.studi_ids_p___not___contains = studi_ids_p___not___contains;
            return this;
        }

        public Builder setStudi_ids_p___starts_with(String studi_ids_p___starts_with) {
            this.studi_ids_p___starts_with = studi_ids_p___starts_with;
            return this;
        }

        public Builder setStudi_ids_p___not___starts_with(String studi_ids_p___not___starts_with) {
            this.studi_ids_p___not___starts_with = studi_ids_p___not___starts_with;
            return this;
        }

        public Builder setStudi_ids_p___ends_with(String studi_ids_p___ends_with) {
            this.studi_ids_p___ends_with = studi_ids_p___ends_with;
            return this;
        }

        public Builder setStudi_ids_p___not___ends_with(String studi_ids_p___not___ends_with) {
            this.studi_ids_p___not___ends_with = studi_ids_p___not___ends_with;
            return this;
        }

        public Builder setStudi_ids_r___eq(String studi_ids_r___eq) {
            this.studi_ids_r___eq = studi_ids_r___eq;
            return this;
        }

        public Builder setStudi_ids_r___ne(String studi_ids_r___ne) {
            this.studi_ids_r___ne = studi_ids_r___ne;
            return this;
        }

        public Builder setStudi_ids_r___null(Boolean studi_ids_r___null) {
            this.studi_ids_r___null = studi_ids_r___null;
            return this;
        }

        public Builder setStudi_ids_r___not___null(Boolean studi_ids_r___not___null) {
            this.studi_ids_r___not___null = studi_ids_r___not___null;
            return this;
        }

        public Builder setStudi_ids_r___in(java.util.List<String> studi_ids_r___in) {
            this.studi_ids_r___in = studi_ids_r___in;
            return this;
        }

        public Builder setStudi_ids_r___not___in(java.util.List<String> studi_ids_r___not___in) {
            this.studi_ids_r___not___in = studi_ids_r___not___in;
            return this;
        }

        public Builder setStudi_ids_r___lt(String studi_ids_r___lt) {
            this.studi_ids_r___lt = studi_ids_r___lt;
            return this;
        }

        public Builder setStudi_ids_r___lte(String studi_ids_r___lte) {
            this.studi_ids_r___lte = studi_ids_r___lte;
            return this;
        }

        public Builder setStudi_ids_r___gt(String studi_ids_r___gt) {
            this.studi_ids_r___gt = studi_ids_r___gt;
            return this;
        }

        public Builder setStudi_ids_r___gte(String studi_ids_r___gte) {
            this.studi_ids_r___gte = studi_ids_r___gte;
            return this;
        }

        public Builder setStudi_ids_r___contains(String studi_ids_r___contains) {
            this.studi_ids_r___contains = studi_ids_r___contains;
            return this;
        }

        public Builder setStudi_ids_r___not___contains(String studi_ids_r___not___contains) {
            this.studi_ids_r___not___contains = studi_ids_r___not___contains;
            return this;
        }

        public Builder setStudi_ids_r___starts_with(String studi_ids_r___starts_with) {
            this.studi_ids_r___starts_with = studi_ids_r___starts_with;
            return this;
        }

        public Builder setStudi_ids_r___not___starts_with(String studi_ids_r___not___starts_with) {
            this.studi_ids_r___not___starts_with = studi_ids_r___not___starts_with;
            return this;
        }

        public Builder setStudi_ids_r___ends_with(String studi_ids_r___ends_with) {
            this.studi_ids_r___ends_with = studi_ids_r___ends_with;
            return this;
        }

        public Builder setStudi_ids_r___not___ends_with(String studi_ids_r___not___ends_with) {
            this.studi_ids_r___not___ends_with = studi_ids_r___not___ends_with;
            return this;
        }

        public Builder setStudio_questionario___eq(String studio_questionario___eq) {
            this.studio_questionario___eq = studio_questionario___eq;
            return this;
        }

        public Builder setStudio_questionario___ne(String studio_questionario___ne) {
            this.studio_questionario___ne = studio_questionario___ne;
            return this;
        }

        public Builder setStudio_questionario___null(Boolean studio_questionario___null) {
            this.studio_questionario___null = studio_questionario___null;
            return this;
        }

        public Builder setStudio_questionario___not___null(Boolean studio_questionario___not___null) {
            this.studio_questionario___not___null = studio_questionario___not___null;
            return this;
        }

        public Builder setStudio_questionario___in(java.util.List<String> studio_questionario___in) {
            this.studio_questionario___in = studio_questionario___in;
            return this;
        }

        public Builder setStudio_questionario___not___in(java.util.List<String> studio_questionario___not___in) {
            this.studio_questionario___not___in = studio_questionario___not___in;
            return this;
        }

        public Builder setStudio_questionario___lt(String studio_questionario___lt) {
            this.studio_questionario___lt = studio_questionario___lt;
            return this;
        }

        public Builder setStudio_questionario___lte(String studio_questionario___lte) {
            this.studio_questionario___lte = studio_questionario___lte;
            return this;
        }

        public Builder setStudio_questionario___gt(String studio_questionario___gt) {
            this.studio_questionario___gt = studio_questionario___gt;
            return this;
        }

        public Builder setStudio_questionario___gte(String studio_questionario___gte) {
            this.studio_questionario___gte = studio_questionario___gte;
            return this;
        }

        public Builder setStudio_questionario___contains(String studio_questionario___contains) {
            this.studio_questionario___contains = studio_questionario___contains;
            return this;
        }

        public Builder setStudio_questionario___not___contains(String studio_questionario___not___contains) {
            this.studio_questionario___not___contains = studio_questionario___not___contains;
            return this;
        }

        public Builder setStudio_questionario___starts_with(String studio_questionario___starts_with) {
            this.studio_questionario___starts_with = studio_questionario___starts_with;
            return this;
        }

        public Builder setStudio_questionario___not___starts_with(String studio_questionario___not___starts_with) {
            this.studio_questionario___not___starts_with = studio_questionario___not___starts_with;
            return this;
        }

        public Builder setStudio_questionario___ends_with(String studio_questionario___ends_with) {
            this.studio_questionario___ends_with = studio_questionario___ends_with;
            return this;
        }

        public Builder setStudio_questionario___not___ends_with(String studio_questionario___not___ends_with) {
            this.studio_questionario___not___ends_with = studio_questionario___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliQuestionario_PRO_appFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliQuestionario_PRO_appFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliQuestionario_PRO_appFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliQuestionario_PRO_appFilterDTO build() {
            CliQuestionario_PRO_appFilterDTO result = new CliQuestionario_PRO_appFilterDTO();
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
            result.setAlert_obbligatoria1___eq(this.alert_obbligatoria1___eq);
            result.setAlert_obbligatoria1___ne(this.alert_obbligatoria1___ne);
            result.setAlert_obbligatoria1___null(this.alert_obbligatoria1___null);
            result.setAlert_obbligatoria1___not___null(this.alert_obbligatoria1___not___null);
            result.setAlert_obbligatoria2___eq(this.alert_obbligatoria2___eq);
            result.setAlert_obbligatoria2___ne(this.alert_obbligatoria2___ne);
            result.setAlert_obbligatoria2___null(this.alert_obbligatoria2___null);
            result.setAlert_obbligatoria2___not___null(this.alert_obbligatoria2___not___null);
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
            result.setCodice_interno_p___eq(this.codice_interno_p___eq);
            result.setCodice_interno_p___ne(this.codice_interno_p___ne);
            result.setCodice_interno_p___null(this.codice_interno_p___null);
            result.setCodice_interno_p___not___null(this.codice_interno_p___not___null);
            result.setCodice_interno_p___in(this.codice_interno_p___in);
            result.setCodice_interno_p___not___in(this.codice_interno_p___not___in);
            result.setCodice_interno_p___lt(this.codice_interno_p___lt);
            result.setCodice_interno_p___lte(this.codice_interno_p___lte);
            result.setCodice_interno_p___gt(this.codice_interno_p___gt);
            result.setCodice_interno_p___gte(this.codice_interno_p___gte);
            result.setCodice_interno_p___contains(this.codice_interno_p___contains);
            result.setCodice_interno_p___not___contains(this.codice_interno_p___not___contains);
            result.setCodice_interno_p___starts_with(this.codice_interno_p___starts_with);
            result.setCodice_interno_p___not___starts_with(this.codice_interno_p___not___starts_with);
            result.setCodice_interno_p___ends_with(this.codice_interno_p___ends_with);
            result.setCodice_interno_p___not___ends_with(this.codice_interno_p___not___ends_with);
            result.setConfermato___eq(this.confermato___eq);
            result.setConfermato___ne(this.confermato___ne);
            result.setConfermato___null(this.confermato___null);
            result.setConfermato___not___null(this.confermato___not___null);
            result.setData_compilazione___eq(this.data_compilazione___eq);
            result.setData_compilazione___ne(this.data_compilazione___ne);
            result.setData_compilazione___null(this.data_compilazione___null);
            result.setData_compilazione___not___null(this.data_compilazione___not___null);
            result.setData_compilazione___in(this.data_compilazione___in);
            result.setData_compilazione___not___in(this.data_compilazione___not___in);
            result.setData_compilazione___lt(this.data_compilazione___lt);
            result.setData_compilazione___lte(this.data_compilazione___lte);
            result.setData_compilazione___gt(this.data_compilazione___gt);
            result.setData_compilazione___gte(this.data_compilazione___gte);
            result.setDomanda_obblig_ids___eq(this.domanda_obblig_ids___eq);
            result.setDomanda_obblig_ids___ne(this.domanda_obblig_ids___ne);
            result.setDomanda_obblig_ids___null(this.domanda_obblig_ids___null);
            result.setDomanda_obblig_ids___not___null(this.domanda_obblig_ids___not___null);
            result.setDomanda_obblig_ids___in(this.domanda_obblig_ids___in);
            result.setDomanda_obblig_ids___not___in(this.domanda_obblig_ids___not___in);
            result.setDomanda_obblig_ids___lt(this.domanda_obblig_ids___lt);
            result.setDomanda_obblig_ids___lte(this.domanda_obblig_ids___lte);
            result.setDomanda_obblig_ids___gt(this.domanda_obblig_ids___gt);
            result.setDomanda_obblig_ids___gte(this.domanda_obblig_ids___gte);
            result.setDomanda_obblig_ids___contains(this.domanda_obblig_ids___contains);
            result.setDomanda_obblig_ids___not___contains(this.domanda_obblig_ids___not___contains);
            result.setDomanda_obblig_ids___starts_with(this.domanda_obblig_ids___starts_with);
            result.setDomanda_obblig_ids___not___starts_with(this.domanda_obblig_ids___not___starts_with);
            result.setDomanda_obblig_ids___ends_with(this.domanda_obblig_ids___ends_with);
            result.setDomanda_obblig_ids___not___ends_with(this.domanda_obblig_ids___not___ends_with);
            result.setDomanda_risp_ids___eq(this.domanda_risp_ids___eq);
            result.setDomanda_risp_ids___ne(this.domanda_risp_ids___ne);
            result.setDomanda_risp_ids___null(this.domanda_risp_ids___null);
            result.setDomanda_risp_ids___not___null(this.domanda_risp_ids___not___null);
            result.setDomanda_risp_ids___in(this.domanda_risp_ids___in);
            result.setDomanda_risp_ids___not___in(this.domanda_risp_ids___not___in);
            result.setDomanda_risp_ids___lt(this.domanda_risp_ids___lt);
            result.setDomanda_risp_ids___lte(this.domanda_risp_ids___lte);
            result.setDomanda_risp_ids___gt(this.domanda_risp_ids___gt);
            result.setDomanda_risp_ids___gte(this.domanda_risp_ids___gte);
            result.setDomanda_risp_ids___contains(this.domanda_risp_ids___contains);
            result.setDomanda_risp_ids___not___contains(this.domanda_risp_ids___not___contains);
            result.setDomanda_risp_ids___starts_with(this.domanda_risp_ids___starts_with);
            result.setDomanda_risp_ids___not___starts_with(this.domanda_risp_ids___not___starts_with);
            result.setDomanda_risp_ids___ends_with(this.domanda_risp_ids___ends_with);
            result.setDomanda_risp_ids___not___ends_with(this.domanda_risp_ids___not___ends_with);
            result.setDomande_totali___eq(this.domande_totali___eq);
            result.setDomande_totali___ne(this.domande_totali___ne);
            result.setDomande_totali___null(this.domande_totali___null);
            result.setDomande_totali___not___null(this.domande_totali___not___null);
            result.setDomande_totali___in(this.domande_totali___in);
            result.setDomande_totali___not___in(this.domande_totali___not___in);
            result.setDomande_totali___lt(this.domande_totali___lt);
            result.setDomande_totali___lte(this.domande_totali___lte);
            result.setDomande_totali___gt(this.domande_totali___gt);
            result.setDomande_totali___gte(this.domande_totali___gte);
            result.setFiltro_classe___eq(this.filtro_classe___eq);
            result.setFiltro_classe___ne(this.filtro_classe___ne);
            result.setFiltro_classe___null(this.filtro_classe___null);
            result.setFiltro_classe___not___null(this.filtro_classe___not___null);
            result.setI_filtro_classe___eq(this.i_filtro_classe___eq);
            result.setI_filtro_classe___ne(this.i_filtro_classe___ne);
            result.setI_filtro_classe___null(this.i_filtro_classe___null);
            result.setI_filtro_classe___not___null(this.i_filtro_classe___not___null);
            result.setIntervallo_compil_mesi___eq(this.intervallo_compil_mesi___eq);
            result.setIntervallo_compil_mesi___ne(this.intervallo_compil_mesi___ne);
            result.setIntervallo_compil_mesi___null(this.intervallo_compil_mesi___null);
            result.setIntervallo_compil_mesi___not___null(this.intervallo_compil_mesi___not___null);
            result.setIntervallo_compil_mesi___in(this.intervallo_compil_mesi___in);
            result.setIntervallo_compil_mesi___not___in(this.intervallo_compil_mesi___not___in);
            result.setIntervallo_compil_mesi___lt(this.intervallo_compil_mesi___lt);
            result.setIntervallo_compil_mesi___lte(this.intervallo_compil_mesi___lte);
            result.setIntervallo_compil_mesi___gt(this.intervallo_compil_mesi___gt);
            result.setIntervallo_compil_mesi___gte(this.intervallo_compil_mesi___gte);
            result.setMesi_trascorsi___eq(this.mesi_trascorsi___eq);
            result.setMesi_trascorsi___ne(this.mesi_trascorsi___ne);
            result.setMesi_trascorsi___null(this.mesi_trascorsi___null);
            result.setMesi_trascorsi___not___null(this.mesi_trascorsi___not___null);
            result.setMesi_trascorsi___in(this.mesi_trascorsi___in);
            result.setMesi_trascorsi___not___in(this.mesi_trascorsi___not___in);
            result.setMesi_trascorsi___lt(this.mesi_trascorsi___lt);
            result.setMesi_trascorsi___lte(this.mesi_trascorsi___lte);
            result.setMesi_trascorsi___gt(this.mesi_trascorsi___gt);
            result.setMesi_trascorsi___gte(this.mesi_trascorsi___gte);
            result.setP_filtro_classe___eq(this.p_filtro_classe___eq);
            result.setP_filtro_classe___ne(this.p_filtro_classe___ne);
            result.setP_filtro_classe___null(this.p_filtro_classe___null);
            result.setP_filtro_classe___not___null(this.p_filtro_classe___not___null);
            result.setParametri_personali___eq(this.parametri_personali___eq);
            result.setParametri_personali___ne(this.parametri_personali___ne);
            result.setParametri_personali___null(this.parametri_personali___null);
            result.setParametri_personali___not___null(this.parametri_personali___not___null);
            result.setQuestionario___eq(this.questionario___eq);
            result.setQuestionario___ne(this.questionario___ne);
            result.setQuestionario___null(this.questionario___null);
            result.setQuestionario___not___null(this.questionario___not___null);
            result.setQuestionario___in(this.questionario___in);
            result.setQuestionario___not___in(this.questionario___not___in);
            result.setQuestionario___lt(this.questionario___lt);
            result.setQuestionario___lte(this.questionario___lte);
            result.setQuestionario___gt(this.questionario___gt);
            result.setQuestionario___gte(this.questionario___gte);
            result.setQuestionario___contains(this.questionario___contains);
            result.setQuestionario___not___contains(this.questionario___not___contains);
            result.setQuestionario___starts_with(this.questionario___starts_with);
            result.setQuestionario___not___starts_with(this.questionario___not___starts_with);
            result.setQuestionario___ends_with(this.questionario___ends_with);
            result.setQuestionario___not___ends_with(this.questionario___not___ends_with);
            result.setRisposte_date___eq(this.risposte_date___eq);
            result.setRisposte_date___ne(this.risposte_date___ne);
            result.setRisposte_date___null(this.risposte_date___null);
            result.setRisposte_date___not___null(this.risposte_date___not___null);
            result.setRisposte_date___in(this.risposte_date___in);
            result.setRisposte_date___not___in(this.risposte_date___not___in);
            result.setRisposte_date___lt(this.risposte_date___lt);
            result.setRisposte_date___lte(this.risposte_date___lte);
            result.setRisposte_date___gt(this.risposte_date___gt);
            result.setRisposte_date___gte(this.risposte_date___gte);
            result.setRisposte_mancanti___eq(this.risposte_mancanti___eq);
            result.setRisposte_mancanti___ne(this.risposte_mancanti___ne);
            result.setRisposte_mancanti___null(this.risposte_mancanti___null);
            result.setRisposte_mancanti___not___null(this.risposte_mancanti___not___null);
            result.setRisposte_mancanti___in(this.risposte_mancanti___in);
            result.setRisposte_mancanti___not___in(this.risposte_mancanti___not___in);
            result.setRisposte_mancanti___lt(this.risposte_mancanti___lt);
            result.setRisposte_mancanti___lte(this.risposte_mancanti___lte);
            result.setRisposte_mancanti___gt(this.risposte_mancanti___gt);
            result.setRisposte_mancanti___gte(this.risposte_mancanti___gte);
            result.setStudi_ids___eq(this.studi_ids___eq);
            result.setStudi_ids___ne(this.studi_ids___ne);
            result.setStudi_ids___null(this.studi_ids___null);
            result.setStudi_ids___not___null(this.studi_ids___not___null);
            result.setStudi_ids___in(this.studi_ids___in);
            result.setStudi_ids___not___in(this.studi_ids___not___in);
            result.setStudi_ids___lt(this.studi_ids___lt);
            result.setStudi_ids___lte(this.studi_ids___lte);
            result.setStudi_ids___gt(this.studi_ids___gt);
            result.setStudi_ids___gte(this.studi_ids___gte);
            result.setStudi_ids___contains(this.studi_ids___contains);
            result.setStudi_ids___not___contains(this.studi_ids___not___contains);
            result.setStudi_ids___starts_with(this.studi_ids___starts_with);
            result.setStudi_ids___not___starts_with(this.studi_ids___not___starts_with);
            result.setStudi_ids___ends_with(this.studi_ids___ends_with);
            result.setStudi_ids___not___ends_with(this.studi_ids___not___ends_with);
            result.setStudi_ids_b___eq(this.studi_ids_b___eq);
            result.setStudi_ids_b___ne(this.studi_ids_b___ne);
            result.setStudi_ids_b___null(this.studi_ids_b___null);
            result.setStudi_ids_b___not___null(this.studi_ids_b___not___null);
            result.setStudi_ids_b___in(this.studi_ids_b___in);
            result.setStudi_ids_b___not___in(this.studi_ids_b___not___in);
            result.setStudi_ids_b___lt(this.studi_ids_b___lt);
            result.setStudi_ids_b___lte(this.studi_ids_b___lte);
            result.setStudi_ids_b___gt(this.studi_ids_b___gt);
            result.setStudi_ids_b___gte(this.studi_ids_b___gte);
            result.setStudi_ids_b___contains(this.studi_ids_b___contains);
            result.setStudi_ids_b___not___contains(this.studi_ids_b___not___contains);
            result.setStudi_ids_b___starts_with(this.studi_ids_b___starts_with);
            result.setStudi_ids_b___not___starts_with(this.studi_ids_b___not___starts_with);
            result.setStudi_ids_b___ends_with(this.studi_ids_b___ends_with);
            result.setStudi_ids_b___not___ends_with(this.studi_ids_b___not___ends_with);
            result.setStudi_ids_i___eq(this.studi_ids_i___eq);
            result.setStudi_ids_i___ne(this.studi_ids_i___ne);
            result.setStudi_ids_i___null(this.studi_ids_i___null);
            result.setStudi_ids_i___not___null(this.studi_ids_i___not___null);
            result.setStudi_ids_i___in(this.studi_ids_i___in);
            result.setStudi_ids_i___not___in(this.studi_ids_i___not___in);
            result.setStudi_ids_i___lt(this.studi_ids_i___lt);
            result.setStudi_ids_i___lte(this.studi_ids_i___lte);
            result.setStudi_ids_i___gt(this.studi_ids_i___gt);
            result.setStudi_ids_i___gte(this.studi_ids_i___gte);
            result.setStudi_ids_i___contains(this.studi_ids_i___contains);
            result.setStudi_ids_i___not___contains(this.studi_ids_i___not___contains);
            result.setStudi_ids_i___starts_with(this.studi_ids_i___starts_with);
            result.setStudi_ids_i___not___starts_with(this.studi_ids_i___not___starts_with);
            result.setStudi_ids_i___ends_with(this.studi_ids_i___ends_with);
            result.setStudi_ids_i___not___ends_with(this.studi_ids_i___not___ends_with);
            result.setStudi_ids_p___eq(this.studi_ids_p___eq);
            result.setStudi_ids_p___ne(this.studi_ids_p___ne);
            result.setStudi_ids_p___null(this.studi_ids_p___null);
            result.setStudi_ids_p___not___null(this.studi_ids_p___not___null);
            result.setStudi_ids_p___in(this.studi_ids_p___in);
            result.setStudi_ids_p___not___in(this.studi_ids_p___not___in);
            result.setStudi_ids_p___lt(this.studi_ids_p___lt);
            result.setStudi_ids_p___lte(this.studi_ids_p___lte);
            result.setStudi_ids_p___gt(this.studi_ids_p___gt);
            result.setStudi_ids_p___gte(this.studi_ids_p___gte);
            result.setStudi_ids_p___contains(this.studi_ids_p___contains);
            result.setStudi_ids_p___not___contains(this.studi_ids_p___not___contains);
            result.setStudi_ids_p___starts_with(this.studi_ids_p___starts_with);
            result.setStudi_ids_p___not___starts_with(this.studi_ids_p___not___starts_with);
            result.setStudi_ids_p___ends_with(this.studi_ids_p___ends_with);
            result.setStudi_ids_p___not___ends_with(this.studi_ids_p___not___ends_with);
            result.setStudi_ids_r___eq(this.studi_ids_r___eq);
            result.setStudi_ids_r___ne(this.studi_ids_r___ne);
            result.setStudi_ids_r___null(this.studi_ids_r___null);
            result.setStudi_ids_r___not___null(this.studi_ids_r___not___null);
            result.setStudi_ids_r___in(this.studi_ids_r___in);
            result.setStudi_ids_r___not___in(this.studi_ids_r___not___in);
            result.setStudi_ids_r___lt(this.studi_ids_r___lt);
            result.setStudi_ids_r___lte(this.studi_ids_r___lte);
            result.setStudi_ids_r___gt(this.studi_ids_r___gt);
            result.setStudi_ids_r___gte(this.studi_ids_r___gte);
            result.setStudi_ids_r___contains(this.studi_ids_r___contains);
            result.setStudi_ids_r___not___contains(this.studi_ids_r___not___contains);
            result.setStudi_ids_r___starts_with(this.studi_ids_r___starts_with);
            result.setStudi_ids_r___not___starts_with(this.studi_ids_r___not___starts_with);
            result.setStudi_ids_r___ends_with(this.studi_ids_r___ends_with);
            result.setStudi_ids_r___not___ends_with(this.studi_ids_r___not___ends_with);
            result.setStudio_questionario___eq(this.studio_questionario___eq);
            result.setStudio_questionario___ne(this.studio_questionario___ne);
            result.setStudio_questionario___null(this.studio_questionario___null);
            result.setStudio_questionario___not___null(this.studio_questionario___not___null);
            result.setStudio_questionario___in(this.studio_questionario___in);
            result.setStudio_questionario___not___in(this.studio_questionario___not___in);
            result.setStudio_questionario___lt(this.studio_questionario___lt);
            result.setStudio_questionario___lte(this.studio_questionario___lte);
            result.setStudio_questionario___gt(this.studio_questionario___gt);
            result.setStudio_questionario___gte(this.studio_questionario___gte);
            result.setStudio_questionario___contains(this.studio_questionario___contains);
            result.setStudio_questionario___not___contains(this.studio_questionario___not___contains);
            result.setStudio_questionario___starts_with(this.studio_questionario___starts_with);
            result.setStudio_questionario___not___starts_with(this.studio_questionario___not___starts_with);
            result.setStudio_questionario___ends_with(this.studio_questionario___ends_with);
            result.setStudio_questionario___not___ends_with(this.studio_questionario___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
