package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliPazienteDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private String IL28B;
    private Integer altezza;
    private String altro_fattore_di_rischio;
    private Integer anno_nascita;
    private String codice_arca;
    private String codice_interno;
    private String comune_di_nascita;
    private Integer coorte_respond;
    private String data_consenso;
    private String data_consenso_pro;
    private String data_fine_terapia_ormonale;
    private String data_gilbert;
    private String data_hla;
    private String data_il28;
    private String data_inizio_terapia_ormonale;
    private String data_menopausa;
    private String data_prima_terapia_anti_hcv;
    private String data_primo_hcvab_pos;
    private String data_ultimo_HCVAb_pre_arr;
    private String data_ultimo_HbsAg_pre_arr;
    private String esito_ultima_terapia;
    private Boolean hbsag_pos;
    private Boolean hcvab_pos;
    private String hla_b5701;
    private Boolean hla_b5701_bool;
    private Integer id_respond;
    private Boolean ifn;
    private Integer in_italia_da_anni;
    private String note_terapia;
    private String password_pro;
    private Boolean pegifn;
    private Boolean pregresse_terapie_anti_hcv;
    private Boolean pride;
    private Boolean pro;
    private Boolean ribavirina;
    private String sessione_pro;
    private String sesso;
    private Boolean sex_worker;
    private Boolean terapia_ormonale;
    private String token_notifiche_pro;
    private Boolean trasferito;
    private String username_pro;
    private CliAnamnesiDraftDTO anamnesi;
    private CliC_dettaglioDraftDTO c_dettaglio_;
    private CliCampione_oldDraftRoleRefsDTO campione_old;
    private String centro_appartenenza_attuale;
    private CliChecksDraftRoleRefsDTO checks_;
    private CliCodice_studioDraftRoleObjectsDTO codice_studio_;
    private String condizione_lavorativa;
    private CliControllo_clinicoDraftRoleObjectsDTO controllo_clinico;
    private CliDropoutDraftRoleObjectsDTO dropout;
    private CliEsame_strumentaleDraftRoleObjectsDTO esame_strumentale_;
    private String etnia;
    private CliEventoDraftRoleObjectsDTO evento;
    private CliEvento_epaticoDraftRoleObjectsDTO evento_epatico_;
    private String fattore_di_rischio;
    private String gilbert_;
    private CliGravidanzaDraftRoleObjectsDTO gravidanza_;
    private String identita_genere_;
    private CliL_dettaglioDraftRoleObjectsDTO l_dettaglio_;
    private CliMarkers_HBVDraftRoleObjectsDTO markers_HBV;
    private CliMarkers_HCVDraftRoleObjectsDTO markers_HCV;
    private CliMarkers_HDVDraftRoleObjectsDTO markers_HDV_;
    private CliMarkers_HIVDraftRoleObjectsDTO markers_HIV;
    private CliMarkers_altriDraftRoleObjectsDTO markers_altri_;
    private String nazione_;
    private CliQuestionario_PRODraftRoleObjectsDTO questionario_PRO_;
    private CliQuestionario_PRO_appDraftRoleObjectsDTO questionario_PRO_app;
    private String regione_;
    private CliRicoveroDraftRoleObjectsDTO ricovero;
    private CliSVRDraftRoleObjectsDTO sVR_;
    private CliSequenza_genomicaDraftRoleRefsDTO sequenza_genomica;
    private CliStudio_questionarioDraftRoleRefsDTO studio_questionario_;
    private CliTerapia_ARVDraftRoleObjectsDTO terapia_ARV;
    private CliTerapia_altroDraftRoleObjectsDTO terapia_altro;
    private CliTerapia_altroDraftRoleObjectsDTO terapia_epatica;
    private CliTrattamento_antitumoraleDraftRoleObjectsDTO trattamento_antitumorale_;
    private CliV_dettaglioDraftDTO v_dettaglio_;
    private CliVisita_mpvDraftRoleObjectsDTO visita_mpv_;

    public CliPazienteDraftDTO() {
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

    public String getIL28B() {
        return IL28B;
    }
    public void setIL28B(String IL28B) {
        this.IL28B = IL28B;
    }

    public Integer getAltezza() {
        return altezza;
    }
    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    public String getAltro_fattore_di_rischio() {
        return altro_fattore_di_rischio;
    }
    public void setAltro_fattore_di_rischio(String altro_fattore_di_rischio) {
        this.altro_fattore_di_rischio = altro_fattore_di_rischio;
    }

    public Integer getAnno_nascita() {
        return anno_nascita;
    }
    public void setAnno_nascita(Integer anno_nascita) {
        this.anno_nascita = anno_nascita;
    }

    public String getCodice_arca() {
        return codice_arca;
    }
    public void setCodice_arca(String codice_arca) {
        this.codice_arca = codice_arca;
    }

    public String getCodice_interno() {
        return codice_interno;
    }
    public void setCodice_interno(String codice_interno) {
        this.codice_interno = codice_interno;
    }

    public String getComune_di_nascita() {
        return comune_di_nascita;
    }
    public void setComune_di_nascita(String comune_di_nascita) {
        this.comune_di_nascita = comune_di_nascita;
    }

    public Integer getCoorte_respond() {
        return coorte_respond;
    }
    public void setCoorte_respond(Integer coorte_respond) {
        this.coorte_respond = coorte_respond;
    }

    public String getData_consenso() {
        return data_consenso;
    }
    public void setData_consenso(String data_consenso) {
        this.data_consenso = data_consenso;
    }

    public String getData_consenso_pro() {
        return data_consenso_pro;
    }
    public void setData_consenso_pro(String data_consenso_pro) {
        this.data_consenso_pro = data_consenso_pro;
    }

    public String getData_fine_terapia_ormonale() {
        return data_fine_terapia_ormonale;
    }
    public void setData_fine_terapia_ormonale(String data_fine_terapia_ormonale) {
        this.data_fine_terapia_ormonale = data_fine_terapia_ormonale;
    }

    public String getData_gilbert() {
        return data_gilbert;
    }
    public void setData_gilbert(String data_gilbert) {
        this.data_gilbert = data_gilbert;
    }

    public String getData_hla() {
        return data_hla;
    }
    public void setData_hla(String data_hla) {
        this.data_hla = data_hla;
    }

    public String getData_il28() {
        return data_il28;
    }
    public void setData_il28(String data_il28) {
        this.data_il28 = data_il28;
    }

    public String getData_inizio_terapia_ormonale() {
        return data_inizio_terapia_ormonale;
    }
    public void setData_inizio_terapia_ormonale(String data_inizio_terapia_ormonale) {
        this.data_inizio_terapia_ormonale = data_inizio_terapia_ormonale;
    }

    public String getData_menopausa() {
        return data_menopausa;
    }
    public void setData_menopausa(String data_menopausa) {
        this.data_menopausa = data_menopausa;
    }

    public String getData_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv;
    }
    public void setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
        this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
    }

    public String getData_primo_hcvab_pos() {
        return data_primo_hcvab_pos;
    }
    public void setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
        this.data_primo_hcvab_pos = data_primo_hcvab_pos;
    }

    public String getData_ultimo_HCVAb_pre_arr() {
        return data_ultimo_HCVAb_pre_arr;
    }
    public void setData_ultimo_HCVAb_pre_arr(String data_ultimo_HCVAb_pre_arr) {
        this.data_ultimo_HCVAb_pre_arr = data_ultimo_HCVAb_pre_arr;
    }

    public String getData_ultimo_HbsAg_pre_arr() {
        return data_ultimo_HbsAg_pre_arr;
    }
    public void setData_ultimo_HbsAg_pre_arr(String data_ultimo_HbsAg_pre_arr) {
        this.data_ultimo_HbsAg_pre_arr = data_ultimo_HbsAg_pre_arr;
    }

    public String getEsito_ultima_terapia() {
        return esito_ultima_terapia;
    }
    public void setEsito_ultima_terapia(String esito_ultima_terapia) {
        this.esito_ultima_terapia = esito_ultima_terapia;
    }

    public Boolean getHbsag_pos() {
        return hbsag_pos;
    }
    public void setHbsag_pos(Boolean hbsag_pos) {
        this.hbsag_pos = hbsag_pos;
    }

    public Boolean getHcvab_pos() {
        return hcvab_pos;
    }
    public void setHcvab_pos(Boolean hcvab_pos) {
        this.hcvab_pos = hcvab_pos;
    }

    public String getHla_b5701() {
        return hla_b5701;
    }
    public void setHla_b5701(String hla_b5701) {
        this.hla_b5701 = hla_b5701;
    }

    public Boolean getHla_b5701_bool() {
        return hla_b5701_bool;
    }
    public void setHla_b5701_bool(Boolean hla_b5701_bool) {
        this.hla_b5701_bool = hla_b5701_bool;
    }

    public Integer getId_respond() {
        return id_respond;
    }
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    public Boolean getIfn() {
        return ifn;
    }
    public void setIfn(Boolean ifn) {
        this.ifn = ifn;
    }

    public Integer getIn_italia_da_anni() {
        return in_italia_da_anni;
    }
    public void setIn_italia_da_anni(Integer in_italia_da_anni) {
        this.in_italia_da_anni = in_italia_da_anni;
    }

    public String getNote_terapia() {
        return note_terapia;
    }
    public void setNote_terapia(String note_terapia) {
        this.note_terapia = note_terapia;
    }

    public String getPassword_pro() {
        return password_pro;
    }
    public void setPassword_pro(String password_pro) {
        this.password_pro = password_pro;
    }

    public Boolean getPegifn() {
        return pegifn;
    }
    public void setPegifn(Boolean pegifn) {
        this.pegifn = pegifn;
    }

    public Boolean getPregresse_terapie_anti_hcv() {
        return pregresse_terapie_anti_hcv;
    }
    public void setPregresse_terapie_anti_hcv(Boolean pregresse_terapie_anti_hcv) {
        this.pregresse_terapie_anti_hcv = pregresse_terapie_anti_hcv;
    }

    public Boolean getPride() {
        return pride;
    }
    public void setPride(Boolean pride) {
        this.pride = pride;
    }

    public Boolean getPro() {
        return pro;
    }
    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public Boolean getRibavirina() {
        return ribavirina;
    }
    public void setRibavirina(Boolean ribavirina) {
        this.ribavirina = ribavirina;
    }

    public String getSessione_pro() {
        return sessione_pro;
    }
    public void setSessione_pro(String sessione_pro) {
        this.sessione_pro = sessione_pro;
    }

    public String getSesso() {
        return sesso;
    }
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Boolean getSex_worker() {
        return sex_worker;
    }
    public void setSex_worker(Boolean sex_worker) {
        this.sex_worker = sex_worker;
    }

    public Boolean getTerapia_ormonale() {
        return terapia_ormonale;
    }
    public void setTerapia_ormonale(Boolean terapia_ormonale) {
        this.terapia_ormonale = terapia_ormonale;
    }

    public String getToken_notifiche_pro() {
        return token_notifiche_pro;
    }
    public void setToken_notifiche_pro(String token_notifiche_pro) {
        this.token_notifiche_pro = token_notifiche_pro;
    }

    public Boolean getTrasferito() {
        return trasferito;
    }
    public void setTrasferito(Boolean trasferito) {
        this.trasferito = trasferito;
    }

    public String getUsername_pro() {
        return username_pro;
    }
    public void setUsername_pro(String username_pro) {
        this.username_pro = username_pro;
    }

    public CliAnamnesiDraftDTO getAnamnesi() {
        return anamnesi;
    }
    public void setAnamnesi(CliAnamnesiDraftDTO anamnesi) {
        this.anamnesi = anamnesi;
    }

    public CliC_dettaglioDraftDTO getC_dettaglio_() {
        return c_dettaglio_;
    }
    public void setC_dettaglio_(CliC_dettaglioDraftDTO c_dettaglio_) {
        this.c_dettaglio_ = c_dettaglio_;
    }

    public CliCampione_oldDraftRoleRefsDTO getCampione_old() {
        return campione_old;
    }
    public void setCampione_old(CliCampione_oldDraftRoleRefsDTO campione_old) {
        this.campione_old = campione_old;
    }

    public String getCentro_appartenenza_attuale() {
        return centro_appartenenza_attuale;
    }
    public void setCentro_appartenenza_attuale(String centro_appartenenza_attuale) {
        this.centro_appartenenza_attuale = centro_appartenenza_attuale;
    }

    public CliChecksDraftRoleRefsDTO getChecks_() {
        return checks_;
    }
    public void setChecks_(CliChecksDraftRoleRefsDTO checks_) {
        this.checks_ = checks_;
    }

    public CliCodice_studioDraftRoleObjectsDTO getCodice_studio_() {
        return codice_studio_;
    }
    public void setCodice_studio_(CliCodice_studioDraftRoleObjectsDTO codice_studio_) {
        this.codice_studio_ = codice_studio_;
    }

    public String getCondizione_lavorativa() {
        return condizione_lavorativa;
    }
    public void setCondizione_lavorativa(String condizione_lavorativa) {
        this.condizione_lavorativa = condizione_lavorativa;
    }

    public CliControllo_clinicoDraftRoleObjectsDTO getControllo_clinico() {
        return controllo_clinico;
    }
    public void setControllo_clinico(CliControllo_clinicoDraftRoleObjectsDTO controllo_clinico) {
        this.controllo_clinico = controllo_clinico;
    }

    public CliDropoutDraftRoleObjectsDTO getDropout() {
        return dropout;
    }
    public void setDropout(CliDropoutDraftRoleObjectsDTO dropout) {
        this.dropout = dropout;
    }

    public CliEsame_strumentaleDraftRoleObjectsDTO getEsame_strumentale_() {
        return esame_strumentale_;
    }
    public void setEsame_strumentale_(CliEsame_strumentaleDraftRoleObjectsDTO esame_strumentale_) {
        this.esame_strumentale_ = esame_strumentale_;
    }

    public String getEtnia() {
        return etnia;
    }
    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public CliEventoDraftRoleObjectsDTO getEvento() {
        return evento;
    }
    public void setEvento(CliEventoDraftRoleObjectsDTO evento) {
        this.evento = evento;
    }

    public CliEvento_epaticoDraftRoleObjectsDTO getEvento_epatico_() {
        return evento_epatico_;
    }
    public void setEvento_epatico_(CliEvento_epaticoDraftRoleObjectsDTO evento_epatico_) {
        this.evento_epatico_ = evento_epatico_;
    }

    public String getFattore_di_rischio() {
        return fattore_di_rischio;
    }
    public void setFattore_di_rischio(String fattore_di_rischio) {
        this.fattore_di_rischio = fattore_di_rischio;
    }

    public String getGilbert_() {
        return gilbert_;
    }
    public void setGilbert_(String gilbert_) {
        this.gilbert_ = gilbert_;
    }

    public CliGravidanzaDraftRoleObjectsDTO getGravidanza_() {
        return gravidanza_;
    }
    public void setGravidanza_(CliGravidanzaDraftRoleObjectsDTO gravidanza_) {
        this.gravidanza_ = gravidanza_;
    }

    public String getIdentita_genere_() {
        return identita_genere_;
    }
    public void setIdentita_genere_(String identita_genere_) {
        this.identita_genere_ = identita_genere_;
    }

    public CliL_dettaglioDraftRoleObjectsDTO getL_dettaglio_() {
        return l_dettaglio_;
    }
    public void setL_dettaglio_(CliL_dettaglioDraftRoleObjectsDTO l_dettaglio_) {
        this.l_dettaglio_ = l_dettaglio_;
    }

    public CliMarkers_HBVDraftRoleObjectsDTO getMarkers_HBV() {
        return markers_HBV;
    }
    public void setMarkers_HBV(CliMarkers_HBVDraftRoleObjectsDTO markers_HBV) {
        this.markers_HBV = markers_HBV;
    }

    public CliMarkers_HCVDraftRoleObjectsDTO getMarkers_HCV() {
        return markers_HCV;
    }
    public void setMarkers_HCV(CliMarkers_HCVDraftRoleObjectsDTO markers_HCV) {
        this.markers_HCV = markers_HCV;
    }

    public CliMarkers_HDVDraftRoleObjectsDTO getMarkers_HDV_() {
        return markers_HDV_;
    }
    public void setMarkers_HDV_(CliMarkers_HDVDraftRoleObjectsDTO markers_HDV_) {
        this.markers_HDV_ = markers_HDV_;
    }

    public CliMarkers_HIVDraftRoleObjectsDTO getMarkers_HIV() {
        return markers_HIV;
    }
    public void setMarkers_HIV(CliMarkers_HIVDraftRoleObjectsDTO markers_HIV) {
        this.markers_HIV = markers_HIV;
    }

    public CliMarkers_altriDraftRoleObjectsDTO getMarkers_altri_() {
        return markers_altri_;
    }
    public void setMarkers_altri_(CliMarkers_altriDraftRoleObjectsDTO markers_altri_) {
        this.markers_altri_ = markers_altri_;
    }

    public String getNazione_() {
        return nazione_;
    }
    public void setNazione_(String nazione_) {
        this.nazione_ = nazione_;
    }

    public CliQuestionario_PRODraftRoleObjectsDTO getQuestionario_PRO_() {
        return questionario_PRO_;
    }
    public void setQuestionario_PRO_(CliQuestionario_PRODraftRoleObjectsDTO questionario_PRO_) {
        this.questionario_PRO_ = questionario_PRO_;
    }

    public CliQuestionario_PRO_appDraftRoleObjectsDTO getQuestionario_PRO_app() {
        return questionario_PRO_app;
    }
    public void setQuestionario_PRO_app(CliQuestionario_PRO_appDraftRoleObjectsDTO questionario_PRO_app) {
        this.questionario_PRO_app = questionario_PRO_app;
    }

    public String getRegione_() {
        return regione_;
    }
    public void setRegione_(String regione_) {
        this.regione_ = regione_;
    }

    public CliRicoveroDraftRoleObjectsDTO getRicovero() {
        return ricovero;
    }
    public void setRicovero(CliRicoveroDraftRoleObjectsDTO ricovero) {
        this.ricovero = ricovero;
    }

    public CliSVRDraftRoleObjectsDTO getSVR_() {
        return sVR_;
    }
    public void setSVR_(CliSVRDraftRoleObjectsDTO sVR_) {
        this.sVR_ = sVR_;
    }

    public CliSequenza_genomicaDraftRoleRefsDTO getSequenza_genomica() {
        return sequenza_genomica;
    }
    public void setSequenza_genomica(CliSequenza_genomicaDraftRoleRefsDTO sequenza_genomica) {
        this.sequenza_genomica = sequenza_genomica;
    }

    public CliStudio_questionarioDraftRoleRefsDTO getStudio_questionario_() {
        return studio_questionario_;
    }
    public void setStudio_questionario_(CliStudio_questionarioDraftRoleRefsDTO studio_questionario_) {
        this.studio_questionario_ = studio_questionario_;
    }

    public CliTerapia_ARVDraftRoleObjectsDTO getTerapia_ARV() {
        return terapia_ARV;
    }
    public void setTerapia_ARV(CliTerapia_ARVDraftRoleObjectsDTO terapia_ARV) {
        this.terapia_ARV = terapia_ARV;
    }

    public CliTerapia_altroDraftRoleObjectsDTO getTerapia_altro() {
        return terapia_altro;
    }
    public void setTerapia_altro(CliTerapia_altroDraftRoleObjectsDTO terapia_altro) {
        this.terapia_altro = terapia_altro;
    }

    public CliTerapia_altroDraftRoleObjectsDTO getTerapia_epatica() {
        return terapia_epatica;
    }
    public void setTerapia_epatica(CliTerapia_altroDraftRoleObjectsDTO terapia_epatica) {
        this.terapia_epatica = terapia_epatica;
    }

    public CliTrattamento_antitumoraleDraftRoleObjectsDTO getTrattamento_antitumorale_() {
        return trattamento_antitumorale_;
    }
    public void setTrattamento_antitumorale_(CliTrattamento_antitumoraleDraftRoleObjectsDTO trattamento_antitumorale_) {
        this.trattamento_antitumorale_ = trattamento_antitumorale_;
    }

    public CliV_dettaglioDraftDTO getV_dettaglio_() {
        return v_dettaglio_;
    }
    public void setV_dettaglio_(CliV_dettaglioDraftDTO v_dettaglio_) {
        this.v_dettaglio_ = v_dettaglio_;
    }

    public CliVisita_mpvDraftRoleObjectsDTO getVisita_mpv_() {
        return visita_mpv_;
    }
    public void setVisita_mpv_(CliVisita_mpvDraftRoleObjectsDTO visita_mpv_) {
        this.visita_mpv_ = visita_mpv_;
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
        if (IL28B != null) {
            joiner.add("IL28B: " + GraphQLRequestSerializer.getEntry(IL28B));
        }
        if (altezza != null) {
            joiner.add("altezza: " + GraphQLRequestSerializer.getEntry(altezza));
        }
        if (altro_fattore_di_rischio != null) {
            joiner.add("altro_fattore_di_rischio: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio));
        }
        if (anno_nascita != null) {
            joiner.add("anno_nascita: " + GraphQLRequestSerializer.getEntry(anno_nascita));
        }
        if (codice_arca != null) {
            joiner.add("codice_arca: " + GraphQLRequestSerializer.getEntry(codice_arca));
        }
        if (codice_interno != null) {
            joiner.add("codice_interno: " + GraphQLRequestSerializer.getEntry(codice_interno));
        }
        if (comune_di_nascita != null) {
            joiner.add("comune_di_nascita: " + GraphQLRequestSerializer.getEntry(comune_di_nascita));
        }
        if (coorte_respond != null) {
            joiner.add("coorte_respond: " + GraphQLRequestSerializer.getEntry(coorte_respond));
        }
        if (data_consenso != null) {
            joiner.add("data_consenso: " + GraphQLRequestSerializer.getEntry(data_consenso));
        }
        if (data_consenso_pro != null) {
            joiner.add("data_consenso_pro: " + GraphQLRequestSerializer.getEntry(data_consenso_pro));
        }
        if (data_fine_terapia_ormonale != null) {
            joiner.add("data_fine_terapia_ormonale: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale));
        }
        if (data_gilbert != null) {
            joiner.add("data_gilbert: " + GraphQLRequestSerializer.getEntry(data_gilbert));
        }
        if (data_hla != null) {
            joiner.add("data_hla: " + GraphQLRequestSerializer.getEntry(data_hla));
        }
        if (data_il28 != null) {
            joiner.add("data_il28: " + GraphQLRequestSerializer.getEntry(data_il28));
        }
        if (data_inizio_terapia_ormonale != null) {
            joiner.add("data_inizio_terapia_ormonale: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale));
        }
        if (data_menopausa != null) {
            joiner.add("data_menopausa: " + GraphQLRequestSerializer.getEntry(data_menopausa));
        }
        if (data_prima_terapia_anti_hcv != null) {
            joiner.add("data_prima_terapia_anti_hcv: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv));
        }
        if (data_primo_hcvab_pos != null) {
            joiner.add("data_primo_hcvab_pos: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos));
        }
        if (data_ultimo_HCVAb_pre_arr != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr));
        }
        if (data_ultimo_HbsAg_pre_arr != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr));
        }
        if (esito_ultima_terapia != null) {
            joiner.add("esito_ultima_terapia: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia));
        }
        if (hbsag_pos != null) {
            joiner.add("hbsag_pos: " + GraphQLRequestSerializer.getEntry(hbsag_pos));
        }
        if (hcvab_pos != null) {
            joiner.add("hcvab_pos: " + GraphQLRequestSerializer.getEntry(hcvab_pos));
        }
        if (hla_b5701 != null) {
            joiner.add("hla_b5701: " + GraphQLRequestSerializer.getEntry(hla_b5701));
        }
        if (hla_b5701_bool != null) {
            joiner.add("hla_b5701_bool: " + GraphQLRequestSerializer.getEntry(hla_b5701_bool));
        }
        if (id_respond != null) {
            joiner.add("id_respond: " + GraphQLRequestSerializer.getEntry(id_respond));
        }
        if (ifn != null) {
            joiner.add("ifn: " + GraphQLRequestSerializer.getEntry(ifn));
        }
        if (in_italia_da_anni != null) {
            joiner.add("in_italia_da_anni: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni));
        }
        if (note_terapia != null) {
            joiner.add("note_terapia: " + GraphQLRequestSerializer.getEntry(note_terapia));
        }
        if (password_pro != null) {
            joiner.add("password_pro: " + GraphQLRequestSerializer.getEntry(password_pro));
        }
        if (pegifn != null) {
            joiner.add("pegifn: " + GraphQLRequestSerializer.getEntry(pegifn));
        }
        if (pregresse_terapie_anti_hcv != null) {
            joiner.add("pregresse_terapie_anti_hcv: " + GraphQLRequestSerializer.getEntry(pregresse_terapie_anti_hcv));
        }
        if (pride != null) {
            joiner.add("pride: " + GraphQLRequestSerializer.getEntry(pride));
        }
        if (pro != null) {
            joiner.add("pro: " + GraphQLRequestSerializer.getEntry(pro));
        }
        if (ribavirina != null) {
            joiner.add("ribavirina: " + GraphQLRequestSerializer.getEntry(ribavirina));
        }
        if (sessione_pro != null) {
            joiner.add("sessione_pro: " + GraphQLRequestSerializer.getEntry(sessione_pro));
        }
        if (sesso != null) {
            joiner.add("sesso: " + GraphQLRequestSerializer.getEntry(sesso));
        }
        if (sex_worker != null) {
            joiner.add("sex_worker: " + GraphQLRequestSerializer.getEntry(sex_worker));
        }
        if (terapia_ormonale != null) {
            joiner.add("terapia_ormonale: " + GraphQLRequestSerializer.getEntry(terapia_ormonale));
        }
        if (token_notifiche_pro != null) {
            joiner.add("token_notifiche_pro: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro));
        }
        if (trasferito != null) {
            joiner.add("trasferito: " + GraphQLRequestSerializer.getEntry(trasferito));
        }
        if (username_pro != null) {
            joiner.add("username_pro: " + GraphQLRequestSerializer.getEntry(username_pro));
        }
        if (anamnesi != null) {
            joiner.add("anamnesi: " + GraphQLRequestSerializer.getEntry(anamnesi));
        }
        if (c_dettaglio_ != null) {
            joiner.add("c_dettaglio_: " + GraphQLRequestSerializer.getEntry(c_dettaglio_));
        }
        if (campione_old != null) {
            joiner.add("campione_old: " + GraphQLRequestSerializer.getEntry(campione_old));
        }
        if (centro_appartenenza_attuale != null) {
            joiner.add("centro_appartenenza_attuale: " + GraphQLRequestSerializer.getEntry(centro_appartenenza_attuale));
        }
        if (checks_ != null) {
            joiner.add("checks_: " + GraphQLRequestSerializer.getEntry(checks_));
        }
        if (codice_studio_ != null) {
            joiner.add("codice_studio_: " + GraphQLRequestSerializer.getEntry(codice_studio_));
        }
        if (condizione_lavorativa != null) {
            joiner.add("condizione_lavorativa: " + GraphQLRequestSerializer.getEntry(condizione_lavorativa));
        }
        if (controllo_clinico != null) {
            joiner.add("controllo_clinico: " + GraphQLRequestSerializer.getEntry(controllo_clinico));
        }
        if (dropout != null) {
            joiner.add("dropout: " + GraphQLRequestSerializer.getEntry(dropout));
        }
        if (esame_strumentale_ != null) {
            joiner.add("esame_strumentale_: " + GraphQLRequestSerializer.getEntry(esame_strumentale_));
        }
        if (etnia != null) {
            joiner.add("etnia: " + GraphQLRequestSerializer.getEntry(etnia));
        }
        if (evento != null) {
            joiner.add("evento: " + GraphQLRequestSerializer.getEntry(evento));
        }
        if (evento_epatico_ != null) {
            joiner.add("evento_epatico_: " + GraphQLRequestSerializer.getEntry(evento_epatico_));
        }
        if (fattore_di_rischio != null) {
            joiner.add("fattore_di_rischio: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio));
        }
        if (gilbert_ != null) {
            joiner.add("gilbert_: " + GraphQLRequestSerializer.getEntry(gilbert_));
        }
        if (gravidanza_ != null) {
            joiner.add("gravidanza_: " + GraphQLRequestSerializer.getEntry(gravidanza_));
        }
        if (identita_genere_ != null) {
            joiner.add("identita_genere_: " + GraphQLRequestSerializer.getEntry(identita_genere_));
        }
        if (l_dettaglio_ != null) {
            joiner.add("l_dettaglio_: " + GraphQLRequestSerializer.getEntry(l_dettaglio_));
        }
        if (markers_HBV != null) {
            joiner.add("markers_HBV: " + GraphQLRequestSerializer.getEntry(markers_HBV));
        }
        if (markers_HCV != null) {
            joiner.add("markers_HCV: " + GraphQLRequestSerializer.getEntry(markers_HCV));
        }
        if (markers_HDV_ != null) {
            joiner.add("markers_HDV_: " + GraphQLRequestSerializer.getEntry(markers_HDV_));
        }
        if (markers_HIV != null) {
            joiner.add("markers_HIV: " + GraphQLRequestSerializer.getEntry(markers_HIV));
        }
        if (markers_altri_ != null) {
            joiner.add("markers_altri_: " + GraphQLRequestSerializer.getEntry(markers_altri_));
        }
        if (nazione_ != null) {
            joiner.add("nazione_: " + GraphQLRequestSerializer.getEntry(nazione_));
        }
        if (questionario_PRO_ != null) {
            joiner.add("questionario_PRO_: " + GraphQLRequestSerializer.getEntry(questionario_PRO_));
        }
        if (questionario_PRO_app != null) {
            joiner.add("questionario_PRO_app: " + GraphQLRequestSerializer.getEntry(questionario_PRO_app));
        }
        if (regione_ != null) {
            joiner.add("regione_: " + GraphQLRequestSerializer.getEntry(regione_));
        }
        if (ricovero != null) {
            joiner.add("ricovero: " + GraphQLRequestSerializer.getEntry(ricovero));
        }
        if (sVR_ != null) {
            joiner.add("sVR_: " + GraphQLRequestSerializer.getEntry(sVR_));
        }
        if (sequenza_genomica != null) {
            joiner.add("sequenza_genomica: " + GraphQLRequestSerializer.getEntry(sequenza_genomica));
        }
        if (studio_questionario_ != null) {
            joiner.add("studio_questionario_: " + GraphQLRequestSerializer.getEntry(studio_questionario_));
        }
        if (terapia_ARV != null) {
            joiner.add("terapia_ARV: " + GraphQLRequestSerializer.getEntry(terapia_ARV));
        }
        if (terapia_altro != null) {
            joiner.add("terapia_altro: " + GraphQLRequestSerializer.getEntry(terapia_altro));
        }
        if (terapia_epatica != null) {
            joiner.add("terapia_epatica: " + GraphQLRequestSerializer.getEntry(terapia_epatica));
        }
        if (trattamento_antitumorale_ != null) {
            joiner.add("trattamento_antitumorale_: " + GraphQLRequestSerializer.getEntry(trattamento_antitumorale_));
        }
        if (v_dettaglio_ != null) {
            joiner.add("v_dettaglio_: " + GraphQLRequestSerializer.getEntry(v_dettaglio_));
        }
        if (visita_mpv_ != null) {
            joiner.add("visita_mpv_: " + GraphQLRequestSerializer.getEntry(visita_mpv_));
        }
        return joiner.toString();
    }

    public static CliPazienteDraftDTO.Builder builder() {
        return new CliPazienteDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private String IL28B;
        private Integer altezza;
        private String altro_fattore_di_rischio;
        private Integer anno_nascita;
        private String codice_arca;
        private String codice_interno;
        private String comune_di_nascita;
        private Integer coorte_respond;
        private String data_consenso;
        private String data_consenso_pro;
        private String data_fine_terapia_ormonale;
        private String data_gilbert;
        private String data_hla;
        private String data_il28;
        private String data_inizio_terapia_ormonale;
        private String data_menopausa;
        private String data_prima_terapia_anti_hcv;
        private String data_primo_hcvab_pos;
        private String data_ultimo_HCVAb_pre_arr;
        private String data_ultimo_HbsAg_pre_arr;
        private String esito_ultima_terapia;
        private Boolean hbsag_pos;
        private Boolean hcvab_pos;
        private String hla_b5701;
        private Boolean hla_b5701_bool;
        private Integer id_respond;
        private Boolean ifn;
        private Integer in_italia_da_anni;
        private String note_terapia;
        private String password_pro;
        private Boolean pegifn;
        private Boolean pregresse_terapie_anti_hcv;
        private Boolean pride;
        private Boolean pro;
        private Boolean ribavirina;
        private String sessione_pro;
        private String sesso;
        private Boolean sex_worker;
        private Boolean terapia_ormonale;
        private String token_notifiche_pro;
        private Boolean trasferito;
        private String username_pro;
        private CliAnamnesiDraftDTO anamnesi;
        private CliC_dettaglioDraftDTO c_dettaglio_;
        private CliCampione_oldDraftRoleRefsDTO campione_old;
        private String centro_appartenenza_attuale;
        private CliChecksDraftRoleRefsDTO checks_;
        private CliCodice_studioDraftRoleObjectsDTO codice_studio_;
        private String condizione_lavorativa;
        private CliControllo_clinicoDraftRoleObjectsDTO controllo_clinico;
        private CliDropoutDraftRoleObjectsDTO dropout;
        private CliEsame_strumentaleDraftRoleObjectsDTO esame_strumentale_;
        private String etnia;
        private CliEventoDraftRoleObjectsDTO evento;
        private CliEvento_epaticoDraftRoleObjectsDTO evento_epatico_;
        private String fattore_di_rischio;
        private String gilbert_;
        private CliGravidanzaDraftRoleObjectsDTO gravidanza_;
        private String identita_genere_;
        private CliL_dettaglioDraftRoleObjectsDTO l_dettaglio_;
        private CliMarkers_HBVDraftRoleObjectsDTO markers_HBV;
        private CliMarkers_HCVDraftRoleObjectsDTO markers_HCV;
        private CliMarkers_HDVDraftRoleObjectsDTO markers_HDV_;
        private CliMarkers_HIVDraftRoleObjectsDTO markers_HIV;
        private CliMarkers_altriDraftRoleObjectsDTO markers_altri_;
        private String nazione_;
        private CliQuestionario_PRODraftRoleObjectsDTO questionario_PRO_;
        private CliQuestionario_PRO_appDraftRoleObjectsDTO questionario_PRO_app;
        private String regione_;
        private CliRicoveroDraftRoleObjectsDTO ricovero;
        private CliSVRDraftRoleObjectsDTO sVR_;
        private CliSequenza_genomicaDraftRoleRefsDTO sequenza_genomica;
        private CliStudio_questionarioDraftRoleRefsDTO studio_questionario_;
        private CliTerapia_ARVDraftRoleObjectsDTO terapia_ARV;
        private CliTerapia_altroDraftRoleObjectsDTO terapia_altro;
        private CliTerapia_altroDraftRoleObjectsDTO terapia_epatica;
        private CliTrattamento_antitumoraleDraftRoleObjectsDTO trattamento_antitumorale_;
        private CliV_dettaglioDraftDTO v_dettaglio_;
        private CliVisita_mpvDraftRoleObjectsDTO visita_mpv_;

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

        public Builder setIL28B(String IL28B) {
            this.IL28B = IL28B;
            return this;
        }

        public Builder setAltezza(Integer altezza) {
            this.altezza = altezza;
            return this;
        }

        public Builder setAltro_fattore_di_rischio(String altro_fattore_di_rischio) {
            this.altro_fattore_di_rischio = altro_fattore_di_rischio;
            return this;
        }

        public Builder setAnno_nascita(Integer anno_nascita) {
            this.anno_nascita = anno_nascita;
            return this;
        }

        public Builder setCodice_arca(String codice_arca) {
            this.codice_arca = codice_arca;
            return this;
        }

        public Builder setCodice_interno(String codice_interno) {
            this.codice_interno = codice_interno;
            return this;
        }

        public Builder setComune_di_nascita(String comune_di_nascita) {
            this.comune_di_nascita = comune_di_nascita;
            return this;
        }

        public Builder setCoorte_respond(Integer coorte_respond) {
            this.coorte_respond = coorte_respond;
            return this;
        }

        public Builder setData_consenso(String data_consenso) {
            this.data_consenso = data_consenso;
            return this;
        }

        public Builder setData_consenso_pro(String data_consenso_pro) {
            this.data_consenso_pro = data_consenso_pro;
            return this;
        }

        public Builder setData_fine_terapia_ormonale(String data_fine_terapia_ormonale) {
            this.data_fine_terapia_ormonale = data_fine_terapia_ormonale;
            return this;
        }

        public Builder setData_gilbert(String data_gilbert) {
            this.data_gilbert = data_gilbert;
            return this;
        }

        public Builder setData_hla(String data_hla) {
            this.data_hla = data_hla;
            return this;
        }

        public Builder setData_il28(String data_il28) {
            this.data_il28 = data_il28;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale(String data_inizio_terapia_ormonale) {
            this.data_inizio_terapia_ormonale = data_inizio_terapia_ormonale;
            return this;
        }

        public Builder setData_menopausa(String data_menopausa) {
            this.data_menopausa = data_menopausa;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
            this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
            return this;
        }

        public Builder setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
            this.data_primo_hcvab_pos = data_primo_hcvab_pos;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr(String data_ultimo_HCVAb_pre_arr) {
            this.data_ultimo_HCVAb_pre_arr = data_ultimo_HCVAb_pre_arr;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr(String data_ultimo_HbsAg_pre_arr) {
            this.data_ultimo_HbsAg_pre_arr = data_ultimo_HbsAg_pre_arr;
            return this;
        }

        public Builder setEsito_ultima_terapia(String esito_ultima_terapia) {
            this.esito_ultima_terapia = esito_ultima_terapia;
            return this;
        }

        public Builder setHbsag_pos(Boolean hbsag_pos) {
            this.hbsag_pos = hbsag_pos;
            return this;
        }

        public Builder setHcvab_pos(Boolean hcvab_pos) {
            this.hcvab_pos = hcvab_pos;
            return this;
        }

        public Builder setHla_b5701(String hla_b5701) {
            this.hla_b5701 = hla_b5701;
            return this;
        }

        public Builder setHla_b5701_bool(Boolean hla_b5701_bool) {
            this.hla_b5701_bool = hla_b5701_bool;
            return this;
        }

        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        public Builder setIfn(Boolean ifn) {
            this.ifn = ifn;
            return this;
        }

        public Builder setIn_italia_da_anni(Integer in_italia_da_anni) {
            this.in_italia_da_anni = in_italia_da_anni;
            return this;
        }

        public Builder setNote_terapia(String note_terapia) {
            this.note_terapia = note_terapia;
            return this;
        }

        public Builder setPassword_pro(String password_pro) {
            this.password_pro = password_pro;
            return this;
        }

        public Builder setPegifn(Boolean pegifn) {
            this.pegifn = pegifn;
            return this;
        }

        public Builder setPregresse_terapie_anti_hcv(Boolean pregresse_terapie_anti_hcv) {
            this.pregresse_terapie_anti_hcv = pregresse_terapie_anti_hcv;
            return this;
        }

        public Builder setPride(Boolean pride) {
            this.pride = pride;
            return this;
        }

        public Builder setPro(Boolean pro) {
            this.pro = pro;
            return this;
        }

        public Builder setRibavirina(Boolean ribavirina) {
            this.ribavirina = ribavirina;
            return this;
        }

        public Builder setSessione_pro(String sessione_pro) {
            this.sessione_pro = sessione_pro;
            return this;
        }

        public Builder setSesso(String sesso) {
            this.sesso = sesso;
            return this;
        }

        public Builder setSex_worker(Boolean sex_worker) {
            this.sex_worker = sex_worker;
            return this;
        }

        public Builder setTerapia_ormonale(Boolean terapia_ormonale) {
            this.terapia_ormonale = terapia_ormonale;
            return this;
        }

        public Builder setToken_notifiche_pro(String token_notifiche_pro) {
            this.token_notifiche_pro = token_notifiche_pro;
            return this;
        }

        public Builder setTrasferito(Boolean trasferito) {
            this.trasferito = trasferito;
            return this;
        }

        public Builder setUsername_pro(String username_pro) {
            this.username_pro = username_pro;
            return this;
        }

        public Builder setAnamnesi(CliAnamnesiDraftDTO anamnesi) {
            this.anamnesi = anamnesi;
            return this;
        }

        public Builder setC_dettaglio_(CliC_dettaglioDraftDTO c_dettaglio_) {
            this.c_dettaglio_ = c_dettaglio_;
            return this;
        }

        public Builder setCampione_old(CliCampione_oldDraftRoleRefsDTO campione_old) {
            this.campione_old = campione_old;
            return this;
        }

        public Builder setCentro_appartenenza_attuale(String centro_appartenenza_attuale) {
            this.centro_appartenenza_attuale = centro_appartenenza_attuale;
            return this;
        }

        public Builder setChecks_(CliChecksDraftRoleRefsDTO checks_) {
            this.checks_ = checks_;
            return this;
        }

        public Builder setCodice_studio_(CliCodice_studioDraftRoleObjectsDTO codice_studio_) {
            this.codice_studio_ = codice_studio_;
            return this;
        }

        public Builder setCondizione_lavorativa(String condizione_lavorativa) {
            this.condizione_lavorativa = condizione_lavorativa;
            return this;
        }

        public Builder setControllo_clinico(CliControllo_clinicoDraftRoleObjectsDTO controllo_clinico) {
            this.controllo_clinico = controllo_clinico;
            return this;
        }

        public Builder setDropout(CliDropoutDraftRoleObjectsDTO dropout) {
            this.dropout = dropout;
            return this;
        }

        public Builder setEsame_strumentale_(CliEsame_strumentaleDraftRoleObjectsDTO esame_strumentale_) {
            this.esame_strumentale_ = esame_strumentale_;
            return this;
        }

        public Builder setEtnia(String etnia) {
            this.etnia = etnia;
            return this;
        }

        public Builder setEvento(CliEventoDraftRoleObjectsDTO evento) {
            this.evento = evento;
            return this;
        }

        public Builder setEvento_epatico_(CliEvento_epaticoDraftRoleObjectsDTO evento_epatico_) {
            this.evento_epatico_ = evento_epatico_;
            return this;
        }

        public Builder setFattore_di_rischio(String fattore_di_rischio) {
            this.fattore_di_rischio = fattore_di_rischio;
            return this;
        }

        public Builder setGilbert_(String gilbert_) {
            this.gilbert_ = gilbert_;
            return this;
        }

        public Builder setGravidanza_(CliGravidanzaDraftRoleObjectsDTO gravidanza_) {
            this.gravidanza_ = gravidanza_;
            return this;
        }

        public Builder setIdentita_genere_(String identita_genere_) {
            this.identita_genere_ = identita_genere_;
            return this;
        }

        public Builder setL_dettaglio_(CliL_dettaglioDraftRoleObjectsDTO l_dettaglio_) {
            this.l_dettaglio_ = l_dettaglio_;
            return this;
        }

        public Builder setMarkers_HBV(CliMarkers_HBVDraftRoleObjectsDTO markers_HBV) {
            this.markers_HBV = markers_HBV;
            return this;
        }

        public Builder setMarkers_HCV(CliMarkers_HCVDraftRoleObjectsDTO markers_HCV) {
            this.markers_HCV = markers_HCV;
            return this;
        }

        public Builder setMarkers_HDV_(CliMarkers_HDVDraftRoleObjectsDTO markers_HDV_) {
            this.markers_HDV_ = markers_HDV_;
            return this;
        }

        public Builder setMarkers_HIV(CliMarkers_HIVDraftRoleObjectsDTO markers_HIV) {
            this.markers_HIV = markers_HIV;
            return this;
        }

        public Builder setMarkers_altri_(CliMarkers_altriDraftRoleObjectsDTO markers_altri_) {
            this.markers_altri_ = markers_altri_;
            return this;
        }

        public Builder setNazione_(String nazione_) {
            this.nazione_ = nazione_;
            return this;
        }

        public Builder setQuestionario_PRO_(CliQuestionario_PRODraftRoleObjectsDTO questionario_PRO_) {
            this.questionario_PRO_ = questionario_PRO_;
            return this;
        }

        public Builder setQuestionario_PRO_app(CliQuestionario_PRO_appDraftRoleObjectsDTO questionario_PRO_app) {
            this.questionario_PRO_app = questionario_PRO_app;
            return this;
        }

        public Builder setRegione_(String regione_) {
            this.regione_ = regione_;
            return this;
        }

        public Builder setRicovero(CliRicoveroDraftRoleObjectsDTO ricovero) {
            this.ricovero = ricovero;
            return this;
        }

        public Builder setSVR_(CliSVRDraftRoleObjectsDTO sVR_) {
            this.sVR_ = sVR_;
            return this;
        }

        public Builder setSequenza_genomica(CliSequenza_genomicaDraftRoleRefsDTO sequenza_genomica) {
            this.sequenza_genomica = sequenza_genomica;
            return this;
        }

        public Builder setStudio_questionario_(CliStudio_questionarioDraftRoleRefsDTO studio_questionario_) {
            this.studio_questionario_ = studio_questionario_;
            return this;
        }

        public Builder setTerapia_ARV(CliTerapia_ARVDraftRoleObjectsDTO terapia_ARV) {
            this.terapia_ARV = terapia_ARV;
            return this;
        }

        public Builder setTerapia_altro(CliTerapia_altroDraftRoleObjectsDTO terapia_altro) {
            this.terapia_altro = terapia_altro;
            return this;
        }

        public Builder setTerapia_epatica(CliTerapia_altroDraftRoleObjectsDTO terapia_epatica) {
            this.terapia_epatica = terapia_epatica;
            return this;
        }

        public Builder setTrattamento_antitumorale_(CliTrattamento_antitumoraleDraftRoleObjectsDTO trattamento_antitumorale_) {
            this.trattamento_antitumorale_ = trattamento_antitumorale_;
            return this;
        }

        public Builder setV_dettaglio_(CliV_dettaglioDraftDTO v_dettaglio_) {
            this.v_dettaglio_ = v_dettaglio_;
            return this;
        }

        public Builder setVisita_mpv_(CliVisita_mpvDraftRoleObjectsDTO visita_mpv_) {
            this.visita_mpv_ = visita_mpv_;
            return this;
        }


        public CliPazienteDraftDTO build() {
            CliPazienteDraftDTO result = new CliPazienteDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setIL28B(this.IL28B);
            result.setAltezza(this.altezza);
            result.setAltro_fattore_di_rischio(this.altro_fattore_di_rischio);
            result.setAnno_nascita(this.anno_nascita);
            result.setCodice_arca(this.codice_arca);
            result.setCodice_interno(this.codice_interno);
            result.setComune_di_nascita(this.comune_di_nascita);
            result.setCoorte_respond(this.coorte_respond);
            result.setData_consenso(this.data_consenso);
            result.setData_consenso_pro(this.data_consenso_pro);
            result.setData_fine_terapia_ormonale(this.data_fine_terapia_ormonale);
            result.setData_gilbert(this.data_gilbert);
            result.setData_hla(this.data_hla);
            result.setData_il28(this.data_il28);
            result.setData_inizio_terapia_ormonale(this.data_inizio_terapia_ormonale);
            result.setData_menopausa(this.data_menopausa);
            result.setData_prima_terapia_anti_hcv(this.data_prima_terapia_anti_hcv);
            result.setData_primo_hcvab_pos(this.data_primo_hcvab_pos);
            result.setData_ultimo_HCVAb_pre_arr(this.data_ultimo_HCVAb_pre_arr);
            result.setData_ultimo_HbsAg_pre_arr(this.data_ultimo_HbsAg_pre_arr);
            result.setEsito_ultima_terapia(this.esito_ultima_terapia);
            result.setHbsag_pos(this.hbsag_pos);
            result.setHcvab_pos(this.hcvab_pos);
            result.setHla_b5701(this.hla_b5701);
            result.setHla_b5701_bool(this.hla_b5701_bool);
            result.setId_respond(this.id_respond);
            result.setIfn(this.ifn);
            result.setIn_italia_da_anni(this.in_italia_da_anni);
            result.setNote_terapia(this.note_terapia);
            result.setPassword_pro(this.password_pro);
            result.setPegifn(this.pegifn);
            result.setPregresse_terapie_anti_hcv(this.pregresse_terapie_anti_hcv);
            result.setPride(this.pride);
            result.setPro(this.pro);
            result.setRibavirina(this.ribavirina);
            result.setSessione_pro(this.sessione_pro);
            result.setSesso(this.sesso);
            result.setSex_worker(this.sex_worker);
            result.setTerapia_ormonale(this.terapia_ormonale);
            result.setToken_notifiche_pro(this.token_notifiche_pro);
            result.setTrasferito(this.trasferito);
            result.setUsername_pro(this.username_pro);
            result.setAnamnesi(this.anamnesi);
            result.setC_dettaglio_(this.c_dettaglio_);
            result.setCampione_old(this.campione_old);
            result.setCentro_appartenenza_attuale(this.centro_appartenenza_attuale);
            result.setChecks_(this.checks_);
            result.setCodice_studio_(this.codice_studio_);
            result.setCondizione_lavorativa(this.condizione_lavorativa);
            result.setControllo_clinico(this.controllo_clinico);
            result.setDropout(this.dropout);
            result.setEsame_strumentale_(this.esame_strumentale_);
            result.setEtnia(this.etnia);
            result.setEvento(this.evento);
            result.setEvento_epatico_(this.evento_epatico_);
            result.setFattore_di_rischio(this.fattore_di_rischio);
            result.setGilbert_(this.gilbert_);
            result.setGravidanza_(this.gravidanza_);
            result.setIdentita_genere_(this.identita_genere_);
            result.setL_dettaglio_(this.l_dettaglio_);
            result.setMarkers_HBV(this.markers_HBV);
            result.setMarkers_HCV(this.markers_HCV);
            result.setMarkers_HDV_(this.markers_HDV_);
            result.setMarkers_HIV(this.markers_HIV);
            result.setMarkers_altri_(this.markers_altri_);
            result.setNazione_(this.nazione_);
            result.setQuestionario_PRO_(this.questionario_PRO_);
            result.setQuestionario_PRO_app(this.questionario_PRO_app);
            result.setRegione_(this.regione_);
            result.setRicovero(this.ricovero);
            result.setSVR_(this.sVR_);
            result.setSequenza_genomica(this.sequenza_genomica);
            result.setStudio_questionario_(this.studio_questionario_);
            result.setTerapia_ARV(this.terapia_ARV);
            result.setTerapia_altro(this.terapia_altro);
            result.setTerapia_epatica(this.terapia_epatica);
            result.setTrattamento_antitumorale_(this.trattamento_antitumorale_);
            result.setV_dettaglio_(this.v_dettaglio_);
            result.setVisita_mpv_(this.visita_mpv_);
            return result;
        }

    }
}
