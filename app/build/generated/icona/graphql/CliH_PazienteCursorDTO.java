package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
H_Paziente.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliH_PazienteCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String IL28B;
    private String USSL_di_residenza;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer altezza;
    private String altro_fattore_di_rischio;
    private Integer anno_nascita;
    private Boolean checks;
    private String codice_centro;
    private String codice_interno;
    private String codice_nazionale;
    private String cognome;
    private String comune_di_nascita;
    private String data_consenso;
    private String data_consenso_pro;
    private String data_decesso;
    private String data_fine_terapia_ormonale;
    private String data_gilbert;
    private String data_hla;
    private String data_il28;
    private String data_inizio_terapia_ormonale;
    private String data_menopausa;
    private String data_prima_terapia_anti_hcv;
    private String data_prima_visita;
    private String data_primo_hcvab_pos;
    private String data_ultima_visita;
    private String data_ultimo_HCVAb_pre_arr;
    private String data_ultimo_HbsAg_pre_arr;
    private String data_ultimo_drop;
    private String date_longicona;
    private Boolean dtg;
    private String esito_ultima_terapia;
    private Integer eta_arruolamento;
    private Integer eta_prima_visita;
    private String etnia_;
    private String fattore_di_rischio_;
    private Boolean fibroscan;
    private Boolean hbsag_pos;
    private Boolean hcvab_pos;
    private String hla_b5701;
    private Boolean hla_b5701_bool;
    private Integer id_paziente;
    private Boolean ifn;
    private Integer in_italia_da_anni;
    private String nascita;
    private String nazionalita_;
    private String nazione;
    private Boolean noco;
    private String nome;
    private String note_terapia;
    private Boolean null_val;
    private String password_pro;
    private Boolean pegifn;
    private Boolean pregresse_terapie_anti_hcv;
    private Boolean pro;
    private Boolean ribavirina;
    private Boolean risk_F;
    private String sessione_pro;
    private String sesso;
    private Boolean stribild;
    private String studi_pro_abilitati;
    private Boolean taf;
    private Boolean terapia_ormonale;
    private String token_notifiche_pro;
    private Boolean trasferito;
    private String username_pro;

    public CliH_PazienteCursorDTO() {
    }


    public String getIL28B() {
        return IL28B;
    }
    public void setIL28B(String IL28B) {
        this.IL28B = IL28B;
    }

    public String getUSSL_di_residenza() {
        return USSL_di_residenza;
    }
    public void setUSSL_di_residenza(String USSL_di_residenza) {
        this.USSL_di_residenza = USSL_di_residenza;
    }

    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
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

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
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

    public String getCodice_nazionale() {
        return codice_nazionale;
    }
    public void setCodice_nazionale(String codice_nazionale) {
        this.codice_nazionale = codice_nazionale;
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getComune_di_nascita() {
        return comune_di_nascita;
    }
    public void setComune_di_nascita(String comune_di_nascita) {
        this.comune_di_nascita = comune_di_nascita;
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

    public String getDate_longicona() {
        return date_longicona;
    }
    public void setDate_longicona(String date_longicona) {
        this.date_longicona = date_longicona;
    }

    public Boolean getDtg() {
        return dtg;
    }
    public void setDtg(Boolean dtg) {
        this.dtg = dtg;
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

    public Integer getEta_prima_visita() {
        return eta_prima_visita;
    }
    public void setEta_prima_visita(Integer eta_prima_visita) {
        this.eta_prima_visita = eta_prima_visita;
    }

    public String getEtnia_() {
        return etnia_;
    }
    public void setEtnia_(String etnia_) {
        this.etnia_ = etnia_;
    }

    public String getFattore_di_rischio_() {
        return fattore_di_rischio_;
    }
    public void setFattore_di_rischio_(String fattore_di_rischio_) {
        this.fattore_di_rischio_ = fattore_di_rischio_;
    }

    public Boolean getFibroscan() {
        return fibroscan;
    }
    public void setFibroscan(Boolean fibroscan) {
        this.fibroscan = fibroscan;
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

    public Integer getId_paziente() {
        return id_paziente;
    }
    public void setId_paziente(Integer id_paziente) {
        this.id_paziente = id_paziente;
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

    public String getNascita() {
        return nascita;
    }
    public void setNascita(String nascita) {
        this.nascita = nascita;
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

    public Boolean getNoco() {
        return noco;
    }
    public void setNoco(Boolean noco) {
        this.noco = noco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    public Boolean getRisk_F() {
        return risk_F;
    }
    public void setRisk_F(Boolean risk_F) {
        this.risk_F = risk_F;
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

    public Boolean getStribild() {
        return stribild;
    }
    public void setStribild(Boolean stribild) {
        this.stribild = stribild;
    }

    public String getStudi_pro_abilitati() {
        return studi_pro_abilitati;
    }
    public void setStudi_pro_abilitati(String studi_pro_abilitati) {
        this.studi_pro_abilitati = studi_pro_abilitati;
    }

    public Boolean getTaf() {
        return taf;
    }
    public void setTaf(Boolean taf) {
        this.taf = taf;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (IL28B != null) {
            joiner.add("IL28B: " + GraphQLRequestSerializer.getEntry(IL28B));
        }
        if (USSL_di_residenza != null) {
            joiner.add("USSL_di_residenza: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza));
        }
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
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
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (codice_interno != null) {
            joiner.add("codice_interno: " + GraphQLRequestSerializer.getEntry(codice_interno));
        }
        if (codice_nazionale != null) {
            joiner.add("codice_nazionale: " + GraphQLRequestSerializer.getEntry(codice_nazionale));
        }
        if (cognome != null) {
            joiner.add("cognome: " + GraphQLRequestSerializer.getEntry(cognome));
        }
        if (comune_di_nascita != null) {
            joiner.add("comune_di_nascita: " + GraphQLRequestSerializer.getEntry(comune_di_nascita));
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
        if (date_longicona != null) {
            joiner.add("date_longicona: " + GraphQLRequestSerializer.getEntry(date_longicona));
        }
        if (dtg != null) {
            joiner.add("dtg: " + GraphQLRequestSerializer.getEntry(dtg));
        }
        if (esito_ultima_terapia != null) {
            joiner.add("esito_ultima_terapia: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia));
        }
        if (eta_arruolamento != null) {
            joiner.add("eta_arruolamento: " + GraphQLRequestSerializer.getEntry(eta_arruolamento));
        }
        if (eta_prima_visita != null) {
            joiner.add("eta_prima_visita: " + GraphQLRequestSerializer.getEntry(eta_prima_visita));
        }
        if (etnia_ != null) {
            joiner.add("etnia_: " + GraphQLRequestSerializer.getEntry(etnia_));
        }
        if (fattore_di_rischio_ != null) {
            joiner.add("fattore_di_rischio_: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio_));
        }
        if (fibroscan != null) {
            joiner.add("fibroscan: " + GraphQLRequestSerializer.getEntry(fibroscan));
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
        if (id_paziente != null) {
            joiner.add("id_paziente: " + GraphQLRequestSerializer.getEntry(id_paziente));
        }
        if (ifn != null) {
            joiner.add("ifn: " + GraphQLRequestSerializer.getEntry(ifn));
        }
        if (in_italia_da_anni != null) {
            joiner.add("in_italia_da_anni: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni));
        }
        if (nascita != null) {
            joiner.add("nascita: " + GraphQLRequestSerializer.getEntry(nascita));
        }
        if (nazionalita_ != null) {
            joiner.add("nazionalita_: " + GraphQLRequestSerializer.getEntry(nazionalita_));
        }
        if (nazione != null) {
            joiner.add("nazione: " + GraphQLRequestSerializer.getEntry(nazione));
        }
        if (noco != null) {
            joiner.add("noco: " + GraphQLRequestSerializer.getEntry(noco));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
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
        if (pro != null) {
            joiner.add("pro: " + GraphQLRequestSerializer.getEntry(pro));
        }
        if (ribavirina != null) {
            joiner.add("ribavirina: " + GraphQLRequestSerializer.getEntry(ribavirina));
        }
        if (risk_F != null) {
            joiner.add("risk_F: " + GraphQLRequestSerializer.getEntry(risk_F));
        }
        if (sessione_pro != null) {
            joiner.add("sessione_pro: " + GraphQLRequestSerializer.getEntry(sessione_pro));
        }
        if (sesso != null) {
            joiner.add("sesso: " + GraphQLRequestSerializer.getEntry(sesso));
        }
        if (stribild != null) {
            joiner.add("stribild: " + GraphQLRequestSerializer.getEntry(stribild));
        }
        if (studi_pro_abilitati != null) {
            joiner.add("studi_pro_abilitati: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati));
        }
        if (taf != null) {
            joiner.add("taf: " + GraphQLRequestSerializer.getEntry(taf));
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
        return joiner.toString();
    }

    public static CliH_PazienteCursorDTO.Builder builder() {
        return new CliH_PazienteCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String IL28B;
        private String USSL_di_residenza;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private Integer altezza;
        private String altro_fattore_di_rischio;
        private Integer anno_nascita;
        private Boolean checks;
        private String codice_centro;
        private String codice_interno;
        private String codice_nazionale;
        private String cognome;
        private String comune_di_nascita;
        private String data_consenso;
        private String data_consenso_pro;
        private String data_decesso;
        private String data_fine_terapia_ormonale;
        private String data_gilbert;
        private String data_hla;
        private String data_il28;
        private String data_inizio_terapia_ormonale;
        private String data_menopausa;
        private String data_prima_terapia_anti_hcv;
        private String data_prima_visita;
        private String data_primo_hcvab_pos;
        private String data_ultima_visita;
        private String data_ultimo_HCVAb_pre_arr;
        private String data_ultimo_HbsAg_pre_arr;
        private String data_ultimo_drop;
        private String date_longicona;
        private Boolean dtg;
        private String esito_ultima_terapia;
        private Integer eta_arruolamento;
        private Integer eta_prima_visita;
        private String etnia_;
        private String fattore_di_rischio_;
        private Boolean fibroscan;
        private Boolean hbsag_pos;
        private Boolean hcvab_pos;
        private String hla_b5701;
        private Boolean hla_b5701_bool;
        private Integer id_paziente;
        private Boolean ifn;
        private Integer in_italia_da_anni;
        private String nascita;
        private String nazionalita_;
        private String nazione;
        private Boolean noco;
        private String nome;
        private String note_terapia;
        private Boolean null_val;
        private String password_pro;
        private Boolean pegifn;
        private Boolean pregresse_terapie_anti_hcv;
        private Boolean pro;
        private Boolean ribavirina;
        private Boolean risk_F;
        private String sessione_pro;
        private String sesso;
        private Boolean stribild;
        private String studi_pro_abilitati;
        private Boolean taf;
        private Boolean terapia_ormonale;
        private String token_notifiche_pro;
        private Boolean trasferito;
        private String username_pro;

        public Builder() {
        }

        public Builder setIL28B(String IL28B) {
            this.IL28B = IL28B;
            return this;
        }

        public Builder setUSSL_di_residenza(String USSL_di_residenza) {
            this.USSL_di_residenza = USSL_di_residenza;
            return this;
        }

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
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

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
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

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setCodice_interno(String codice_interno) {
            this.codice_interno = codice_interno;
            return this;
        }

        public Builder setCodice_nazionale(String codice_nazionale) {
            this.codice_nazionale = codice_nazionale;
            return this;
        }

        public Builder setCognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        public Builder setComune_di_nascita(String comune_di_nascita) {
            this.comune_di_nascita = comune_di_nascita;
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

        public Builder setDate_longicona(String date_longicona) {
            this.date_longicona = date_longicona;
            return this;
        }

        public Builder setDtg(Boolean dtg) {
            this.dtg = dtg;
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

        public Builder setEta_prima_visita(Integer eta_prima_visita) {
            this.eta_prima_visita = eta_prima_visita;
            return this;
        }

        public Builder setEtnia_(String etnia_) {
            this.etnia_ = etnia_;
            return this;
        }

        public Builder setFattore_di_rischio_(String fattore_di_rischio_) {
            this.fattore_di_rischio_ = fattore_di_rischio_;
            return this;
        }

        public Builder setFibroscan(Boolean fibroscan) {
            this.fibroscan = fibroscan;
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

        public Builder setId_paziente(Integer id_paziente) {
            this.id_paziente = id_paziente;
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

        public Builder setNascita(String nascita) {
            this.nascita = nascita;
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

        public Builder setNoco(Boolean noco) {
            this.noco = noco;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
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

        public Builder setPro(Boolean pro) {
            this.pro = pro;
            return this;
        }

        public Builder setRibavirina(Boolean ribavirina) {
            this.ribavirina = ribavirina;
            return this;
        }

        public Builder setRisk_F(Boolean risk_F) {
            this.risk_F = risk_F;
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

        public Builder setStribild(Boolean stribild) {
            this.stribild = stribild;
            return this;
        }

        public Builder setStudi_pro_abilitati(String studi_pro_abilitati) {
            this.studi_pro_abilitati = studi_pro_abilitati;
            return this;
        }

        public Builder setTaf(Boolean taf) {
            this.taf = taf;
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


        public CliH_PazienteCursorDTO build() {
            CliH_PazienteCursorDTO result = new CliH_PazienteCursorDTO();
            result.setIL28B(this.IL28B);
            result.setUSSL_di_residenza(this.USSL_di_residenza);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltezza(this.altezza);
            result.setAltro_fattore_di_rischio(this.altro_fattore_di_rischio);
            result.setAnno_nascita(this.anno_nascita);
            result.setChecks(this.checks);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_interno(this.codice_interno);
            result.setCodice_nazionale(this.codice_nazionale);
            result.setCognome(this.cognome);
            result.setComune_di_nascita(this.comune_di_nascita);
            result.setData_consenso(this.data_consenso);
            result.setData_consenso_pro(this.data_consenso_pro);
            result.setData_decesso(this.data_decesso);
            result.setData_fine_terapia_ormonale(this.data_fine_terapia_ormonale);
            result.setData_gilbert(this.data_gilbert);
            result.setData_hla(this.data_hla);
            result.setData_il28(this.data_il28);
            result.setData_inizio_terapia_ormonale(this.data_inizio_terapia_ormonale);
            result.setData_menopausa(this.data_menopausa);
            result.setData_prima_terapia_anti_hcv(this.data_prima_terapia_anti_hcv);
            result.setData_prima_visita(this.data_prima_visita);
            result.setData_primo_hcvab_pos(this.data_primo_hcvab_pos);
            result.setData_ultima_visita(this.data_ultima_visita);
            result.setData_ultimo_HCVAb_pre_arr(this.data_ultimo_HCVAb_pre_arr);
            result.setData_ultimo_HbsAg_pre_arr(this.data_ultimo_HbsAg_pre_arr);
            result.setData_ultimo_drop(this.data_ultimo_drop);
            result.setDate_longicona(this.date_longicona);
            result.setDtg(this.dtg);
            result.setEsito_ultima_terapia(this.esito_ultima_terapia);
            result.setEta_arruolamento(this.eta_arruolamento);
            result.setEta_prima_visita(this.eta_prima_visita);
            result.setEtnia_(this.etnia_);
            result.setFattore_di_rischio_(this.fattore_di_rischio_);
            result.setFibroscan(this.fibroscan);
            result.setHbsag_pos(this.hbsag_pos);
            result.setHcvab_pos(this.hcvab_pos);
            result.setHla_b5701(this.hla_b5701);
            result.setHla_b5701_bool(this.hla_b5701_bool);
            result.setId_paziente(this.id_paziente);
            result.setIfn(this.ifn);
            result.setIn_italia_da_anni(this.in_italia_da_anni);
            result.setNascita(this.nascita);
            result.setNazionalita_(this.nazionalita_);
            result.setNazione(this.nazione);
            result.setNoco(this.noco);
            result.setNome(this.nome);
            result.setNote_terapia(this.note_terapia);
            result.setNull_val(this.null_val);
            result.setPassword_pro(this.password_pro);
            result.setPegifn(this.pegifn);
            result.setPregresse_terapie_anti_hcv(this.pregresse_terapie_anti_hcv);
            result.setPro(this.pro);
            result.setRibavirina(this.ribavirina);
            result.setRisk_F(this.risk_F);
            result.setSessione_pro(this.sessione_pro);
            result.setSesso(this.sesso);
            result.setStribild(this.stribild);
            result.setStudi_pro_abilitati(this.studi_pro_abilitati);
            result.setTaf(this.taf);
            result.setTerapia_ormonale(this.terapia_ormonale);
            result.setToken_notifiche_pro(this.token_notifiche_pro);
            result.setTrasferito(this.trasferito);
            result.setUsername_pro(this.username_pro);
            return result;
        }

    }
}
