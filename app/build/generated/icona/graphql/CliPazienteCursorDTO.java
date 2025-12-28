package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliPazienteCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String IL28B;
    private String _createdon;
    private String _id;
    private Integer altezza;
    private String altro_fattore_di_rischio;
    private Integer anno_nascita;
    private Boolean checks;
    private String codice_arca;
    private String codice_centro;
    private String codice_interno;
    private String codici_studi;
    private String comune_di_nascita;
    private Integer coorte_respond;
    private String data_consenso;
    private String data_consenso_pro;
    private String data_decesso;
    private String data_fine_terapia_ormonale;
    private String data_gilbert;
    private String data_hla;
    private String data_il28;
    private String data_inizio_terapia_ormonale;
    private String data_menopausa;
    private String data_prima_ARV;
    private String data_prima_dose;
    private String data_prima_terapia_anti_hcv;
    private String data_prima_visita;
    private String data_primo_hcvab_pos;
    private String data_ultima_visita;
    private String data_ultimo_HCVAb_pre_arr;
    private String data_ultimo_HbsAg_pre_arr;
    private String data_ultimo_drop;
    private String data_ultimo_marker_hiv;
    private String date_longicona;
    private String esito_ultima_terapia;
    private Integer eta_arruolamento;
    private String etnia_;
    private String farmaci;
    private String fattore_di_rischio_;
    private Boolean hbsag_pos;
    private Boolean hcvab_pos;
    private String hla_b5701;
    private Boolean hla_b5701_bool;
    private Integer id_respond;
    private Boolean ifn;
    private Integer in_italia_da_anni;
    private String nazionalita_;
    private String nazione;
    private String note_terapia;
    private Boolean null_val;
    private String password_pro;
    private Boolean pegifn;
    private Boolean pregresse_terapie_anti_hcv;
    private Boolean pride;
    private Boolean pro;
    private Boolean ribavirina;
    private String sessione_pro;
    private String sesso;
    private Boolean sex_worker;
    private String studi_pro_abilitati;
    private String team;
    private Boolean terapia_ormonale;
    private String token_notifiche_pro;
    private Boolean trasferito;
    private String username_pro;
    private Boolean vax_controllo_clinico;

    public CliPazienteCursorDTO() {
    }


    public String getIL28B() {
        return IL28B;
    }
    public void setIL28B(String IL28B) {
        this.IL28B = IL28B;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
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

    public Boolean getChecks() {
        return checks;
    }
    public void setChecks(Boolean checks) {
        this.checks = checks;
    }

    public String getCodice_arca() {
        return codice_arca;
    }
    public void setCodice_arca(String codice_arca) {
        this.codice_arca = codice_arca;
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

    public String getCodici_studi() {
        return codici_studi;
    }
    public void setCodici_studi(String codici_studi) {
        this.codici_studi = codici_studi;
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

    public String getData_decesso() {
        return data_decesso;
    }
    public void setData_decesso(String data_decesso) {
        this.data_decesso = data_decesso;
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

    public String getData_prima_ARV() {
        return data_prima_ARV;
    }
    public void setData_prima_ARV(String data_prima_ARV) {
        this.data_prima_ARV = data_prima_ARV;
    }

    public String getData_prima_dose() {
        return data_prima_dose;
    }
    public void setData_prima_dose(String data_prima_dose) {
        this.data_prima_dose = data_prima_dose;
    }

    public String getData_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv;
    }
    public void setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
        this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
    }

    public String getData_prima_visita() {
        return data_prima_visita;
    }
    public void setData_prima_visita(String data_prima_visita) {
        this.data_prima_visita = data_prima_visita;
    }

    public String getData_primo_hcvab_pos() {
        return data_primo_hcvab_pos;
    }
    public void setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
        this.data_primo_hcvab_pos = data_primo_hcvab_pos;
    }

    public String getData_ultima_visita() {
        return data_ultima_visita;
    }
    public void setData_ultima_visita(String data_ultima_visita) {
        this.data_ultima_visita = data_ultima_visita;
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

    public String getData_ultimo_drop() {
        return data_ultimo_drop;
    }
    public void setData_ultimo_drop(String data_ultimo_drop) {
        this.data_ultimo_drop = data_ultimo_drop;
    }

    public String getData_ultimo_marker_hiv() {
        return data_ultimo_marker_hiv;
    }
    public void setData_ultimo_marker_hiv(String data_ultimo_marker_hiv) {
        this.data_ultimo_marker_hiv = data_ultimo_marker_hiv;
    }

    public String getDate_longicona() {
        return date_longicona;
    }
    public void setDate_longicona(String date_longicona) {
        this.date_longicona = date_longicona;
    }

    public String getEsito_ultima_terapia() {
        return esito_ultima_terapia;
    }
    public void setEsito_ultima_terapia(String esito_ultima_terapia) {
        this.esito_ultima_terapia = esito_ultima_terapia;
    }

    public Integer getEta_arruolamento() {
        return eta_arruolamento;
    }
    public void setEta_arruolamento(Integer eta_arruolamento) {
        this.eta_arruolamento = eta_arruolamento;
    }

    public String getEtnia_() {
        return etnia_;
    }
    public void setEtnia_(String etnia_) {
        this.etnia_ = etnia_;
    }

    public String getFarmaci() {
        return farmaci;
    }
    public void setFarmaci(String farmaci) {
        this.farmaci = farmaci;
    }

    public String getFattore_di_rischio_() {
        return fattore_di_rischio_;
    }
    public void setFattore_di_rischio_(String fattore_di_rischio_) {
        this.fattore_di_rischio_ = fattore_di_rischio_;
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

    public String getNazionalita_() {
        return nazionalita_;
    }
    public void setNazionalita_(String nazionalita_) {
        this.nazionalita_ = nazionalita_;
    }

    public String getNazione() {
        return nazione;
    }
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getNote_terapia() {
        return note_terapia;
    }
    public void setNote_terapia(String note_terapia) {
        this.note_terapia = note_terapia;
    }

    public Boolean getNull_val() {
        return null_val;
    }
    public void setNull_val(Boolean null_val) {
        this.null_val = null_val;
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

    public String getStudi_pro_abilitati() {
        return studi_pro_abilitati;
    }
    public void setStudi_pro_abilitati(String studi_pro_abilitati) {
        this.studi_pro_abilitati = studi_pro_abilitati;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
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

    public Boolean getVax_controllo_clinico() {
        return vax_controllo_clinico;
    }
    public void setVax_controllo_clinico(Boolean vax_controllo_clinico) {
        this.vax_controllo_clinico = vax_controllo_clinico;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (IL28B != null) {
            joiner.add("IL28B: " + GraphQLRequestSerializer.getEntry(IL28B));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
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
        if (checks != null) {
            joiner.add("checks: " + GraphQLRequestSerializer.getEntry(checks));
        }
        if (codice_arca != null) {
            joiner.add("codice_arca: " + GraphQLRequestSerializer.getEntry(codice_arca));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (codice_interno != null) {
            joiner.add("codice_interno: " + GraphQLRequestSerializer.getEntry(codice_interno));
        }
        if (codici_studi != null) {
            joiner.add("codici_studi: " + GraphQLRequestSerializer.getEntry(codici_studi));
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
        if (data_decesso != null) {
            joiner.add("data_decesso: " + GraphQLRequestSerializer.getEntry(data_decesso));
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
        if (data_prima_ARV != null) {
            joiner.add("data_prima_ARV: " + GraphQLRequestSerializer.getEntry(data_prima_ARV));
        }
        if (data_prima_dose != null) {
            joiner.add("data_prima_dose: " + GraphQLRequestSerializer.getEntry(data_prima_dose));
        }
        if (data_prima_terapia_anti_hcv != null) {
            joiner.add("data_prima_terapia_anti_hcv: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv));
        }
        if (data_prima_visita != null) {
            joiner.add("data_prima_visita: " + GraphQLRequestSerializer.getEntry(data_prima_visita));
        }
        if (data_primo_hcvab_pos != null) {
            joiner.add("data_primo_hcvab_pos: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos));
        }
        if (data_ultima_visita != null) {
            joiner.add("data_ultima_visita: " + GraphQLRequestSerializer.getEntry(data_ultima_visita));
        }
        if (data_ultimo_HCVAb_pre_arr != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr));
        }
        if (data_ultimo_HbsAg_pre_arr != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr));
        }
        if (data_ultimo_drop != null) {
            joiner.add("data_ultimo_drop: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop));
        }
        if (data_ultimo_marker_hiv != null) {
            joiner.add("data_ultimo_marker_hiv: " + GraphQLRequestSerializer.getEntry(data_ultimo_marker_hiv));
        }
        if (date_longicona != null) {
            joiner.add("date_longicona: " + GraphQLRequestSerializer.getEntry(date_longicona));
        }
        if (esito_ultima_terapia != null) {
            joiner.add("esito_ultima_terapia: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia));
        }
        if (eta_arruolamento != null) {
            joiner.add("eta_arruolamento: " + GraphQLRequestSerializer.getEntry(eta_arruolamento));
        }
        if (etnia_ != null) {
            joiner.add("etnia_: " + GraphQLRequestSerializer.getEntry(etnia_));
        }
        if (farmaci != null) {
            joiner.add("farmaci: " + GraphQLRequestSerializer.getEntry(farmaci));
        }
        if (fattore_di_rischio_ != null) {
            joiner.add("fattore_di_rischio_: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio_));
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
        if (nazionalita_ != null) {
            joiner.add("nazionalita_: " + GraphQLRequestSerializer.getEntry(nazionalita_));
        }
        if (nazione != null) {
            joiner.add("nazione: " + GraphQLRequestSerializer.getEntry(nazione));
        }
        if (note_terapia != null) {
            joiner.add("note_terapia: " + GraphQLRequestSerializer.getEntry(note_terapia));
        }
        if (null_val != null) {
            joiner.add("null_val: " + GraphQLRequestSerializer.getEntry(null_val));
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
        if (studi_pro_abilitati != null) {
            joiner.add("studi_pro_abilitati: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati));
        }
        if (team != null) {
            joiner.add("team: " + GraphQLRequestSerializer.getEntry(team));
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
        if (vax_controllo_clinico != null) {
            joiner.add("vax_controllo_clinico: " + GraphQLRequestSerializer.getEntry(vax_controllo_clinico));
        }
        return joiner.toString();
    }

    public static CliPazienteCursorDTO.Builder builder() {
        return new CliPazienteCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String IL28B;
        private String _createdon;
        private String _id;
        private Integer altezza;
        private String altro_fattore_di_rischio;
        private Integer anno_nascita;
        private Boolean checks;
        private String codice_arca;
        private String codice_centro;
        private String codice_interno;
        private String codici_studi;
        private String comune_di_nascita;
        private Integer coorte_respond;
        private String data_consenso;
        private String data_consenso_pro;
        private String data_decesso;
        private String data_fine_terapia_ormonale;
        private String data_gilbert;
        private String data_hla;
        private String data_il28;
        private String data_inizio_terapia_ormonale;
        private String data_menopausa;
        private String data_prima_ARV;
        private String data_prima_dose;
        private String data_prima_terapia_anti_hcv;
        private String data_prima_visita;
        private String data_primo_hcvab_pos;
        private String data_ultima_visita;
        private String data_ultimo_HCVAb_pre_arr;
        private String data_ultimo_HbsAg_pre_arr;
        private String data_ultimo_drop;
        private String data_ultimo_marker_hiv;
        private String date_longicona;
        private String esito_ultima_terapia;
        private Integer eta_arruolamento;
        private String etnia_;
        private String farmaci;
        private String fattore_di_rischio_;
        private Boolean hbsag_pos;
        private Boolean hcvab_pos;
        private String hla_b5701;
        private Boolean hla_b5701_bool;
        private Integer id_respond;
        private Boolean ifn;
        private Integer in_italia_da_anni;
        private String nazionalita_;
        private String nazione;
        private String note_terapia;
        private Boolean null_val;
        private String password_pro;
        private Boolean pegifn;
        private Boolean pregresse_terapie_anti_hcv;
        private Boolean pride;
        private Boolean pro;
        private Boolean ribavirina;
        private String sessione_pro;
        private String sesso;
        private Boolean sex_worker;
        private String studi_pro_abilitati;
        private String team;
        private Boolean terapia_ormonale;
        private String token_notifiche_pro;
        private Boolean trasferito;
        private String username_pro;
        private Boolean vax_controllo_clinico;

        public Builder() {
        }

        public Builder setIL28B(String IL28B) {
            this.IL28B = IL28B;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
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

        public Builder setChecks(Boolean checks) {
            this.checks = checks;
            return this;
        }

        public Builder setCodice_arca(String codice_arca) {
            this.codice_arca = codice_arca;
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

        public Builder setCodici_studi(String codici_studi) {
            this.codici_studi = codici_studi;
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

        public Builder setData_decesso(String data_decesso) {
            this.data_decesso = data_decesso;
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

        public Builder setData_prima_ARV(String data_prima_ARV) {
            this.data_prima_ARV = data_prima_ARV;
            return this;
        }

        public Builder setData_prima_dose(String data_prima_dose) {
            this.data_prima_dose = data_prima_dose;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
            this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
            return this;
        }

        public Builder setData_prima_visita(String data_prima_visita) {
            this.data_prima_visita = data_prima_visita;
            return this;
        }

        public Builder setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
            this.data_primo_hcvab_pos = data_primo_hcvab_pos;
            return this;
        }

        public Builder setData_ultima_visita(String data_ultima_visita) {
            this.data_ultima_visita = data_ultima_visita;
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

        public Builder setData_ultimo_drop(String data_ultimo_drop) {
            this.data_ultimo_drop = data_ultimo_drop;
            return this;
        }

        public Builder setData_ultimo_marker_hiv(String data_ultimo_marker_hiv) {
            this.data_ultimo_marker_hiv = data_ultimo_marker_hiv;
            return this;
        }

        public Builder setDate_longicona(String date_longicona) {
            this.date_longicona = date_longicona;
            return this;
        }

        public Builder setEsito_ultima_terapia(String esito_ultima_terapia) {
            this.esito_ultima_terapia = esito_ultima_terapia;
            return this;
        }

        public Builder setEta_arruolamento(Integer eta_arruolamento) {
            this.eta_arruolamento = eta_arruolamento;
            return this;
        }

        public Builder setEtnia_(String etnia_) {
            this.etnia_ = etnia_;
            return this;
        }

        public Builder setFarmaci(String farmaci) {
            this.farmaci = farmaci;
            return this;
        }

        public Builder setFattore_di_rischio_(String fattore_di_rischio_) {
            this.fattore_di_rischio_ = fattore_di_rischio_;
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

        public Builder setNazionalita_(String nazionalita_) {
            this.nazionalita_ = nazionalita_;
            return this;
        }

        public Builder setNazione(String nazione) {
            this.nazione = nazione;
            return this;
        }

        public Builder setNote_terapia(String note_terapia) {
            this.note_terapia = note_terapia;
            return this;
        }

        public Builder setNull_val(Boolean null_val) {
            this.null_val = null_val;
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

        public Builder setStudi_pro_abilitati(String studi_pro_abilitati) {
            this.studi_pro_abilitati = studi_pro_abilitati;
            return this;
        }

        public Builder setTeam(String team) {
            this.team = team;
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

        public Builder setVax_controllo_clinico(Boolean vax_controllo_clinico) {
            this.vax_controllo_clinico = vax_controllo_clinico;
            return this;
        }


        public CliPazienteCursorDTO build() {
            CliPazienteCursorDTO result = new CliPazienteCursorDTO();
            result.setIL28B(this.IL28B);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setAltro_fattore_di_rischio(this.altro_fattore_di_rischio);
            result.setAnno_nascita(this.anno_nascita);
            result.setChecks(this.checks);
            result.setCodice_arca(this.codice_arca);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_interno(this.codice_interno);
            result.setCodici_studi(this.codici_studi);
            result.setComune_di_nascita(this.comune_di_nascita);
            result.setCoorte_respond(this.coorte_respond);
            result.setData_consenso(this.data_consenso);
            result.setData_consenso_pro(this.data_consenso_pro);
            result.setData_decesso(this.data_decesso);
            result.setData_fine_terapia_ormonale(this.data_fine_terapia_ormonale);
            result.setData_gilbert(this.data_gilbert);
            result.setData_hla(this.data_hla);
            result.setData_il28(this.data_il28);
            result.setData_inizio_terapia_ormonale(this.data_inizio_terapia_ormonale);
            result.setData_menopausa(this.data_menopausa);
            result.setData_prima_ARV(this.data_prima_ARV);
            result.setData_prima_dose(this.data_prima_dose);
            result.setData_prima_terapia_anti_hcv(this.data_prima_terapia_anti_hcv);
            result.setData_prima_visita(this.data_prima_visita);
            result.setData_primo_hcvab_pos(this.data_primo_hcvab_pos);
            result.setData_ultima_visita(this.data_ultima_visita);
            result.setData_ultimo_HCVAb_pre_arr(this.data_ultimo_HCVAb_pre_arr);
            result.setData_ultimo_HbsAg_pre_arr(this.data_ultimo_HbsAg_pre_arr);
            result.setData_ultimo_drop(this.data_ultimo_drop);
            result.setData_ultimo_marker_hiv(this.data_ultimo_marker_hiv);
            result.setDate_longicona(this.date_longicona);
            result.setEsito_ultima_terapia(this.esito_ultima_terapia);
            result.setEta_arruolamento(this.eta_arruolamento);
            result.setEtnia_(this.etnia_);
            result.setFarmaci(this.farmaci);
            result.setFattore_di_rischio_(this.fattore_di_rischio_);
            result.setHbsag_pos(this.hbsag_pos);
            result.setHcvab_pos(this.hcvab_pos);
            result.setHla_b5701(this.hla_b5701);
            result.setHla_b5701_bool(this.hla_b5701_bool);
            result.setId_respond(this.id_respond);
            result.setIfn(this.ifn);
            result.setIn_italia_da_anni(this.in_italia_da_anni);
            result.setNazionalita_(this.nazionalita_);
            result.setNazione(this.nazione);
            result.setNote_terapia(this.note_terapia);
            result.setNull_val(this.null_val);
            result.setPassword_pro(this.password_pro);
            result.setPegifn(this.pegifn);
            result.setPregresse_terapie_anti_hcv(this.pregresse_terapie_anti_hcv);
            result.setPride(this.pride);
            result.setPro(this.pro);
            result.setRibavirina(this.ribavirina);
            result.setSessione_pro(this.sessione_pro);
            result.setSesso(this.sesso);
            result.setSex_worker(this.sex_worker);
            result.setStudi_pro_abilitati(this.studi_pro_abilitati);
            result.setTeam(this.team);
            result.setTerapia_ormonale(this.terapia_ormonale);
            result.setToken_notifiche_pro(this.token_notifiche_pro);
            result.setTrasferito(this.trasferito);
            result.setUsername_pro(this.username_pro);
            result.setVax_controllo_clinico(this.vax_controllo_clinico);
            return result;
        }

    }
}
