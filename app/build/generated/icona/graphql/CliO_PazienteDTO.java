package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class O_Paziente, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliO_PazienteDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String IL28B;
    private String _createdon;
    private String _id;
    private Integer altezza;
    private String altro_fattore_di_rischio;
    private Integer anno_nascita;
    private Boolean checks;
    private String codice_centro;
    private String codice_interno;
    private String comune_di_nascita;
    private Integer coorte_DAD;
    private String data_DAD;
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
    private String data_prima_terapia_anti_hcv;
    private String data_prima_visita;
    private String data_primo_hcvab_pos;
    private String data_ultima_visita;
    private String data_ultimo_HCVAb_pre_arr;
    private String data_ultimo_HbsAg_pre_arr;
    private String data_ultimo_drop;
    private Boolean dtg;
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
    private String password_questionario;
    private Boolean pegifn;
    private Boolean pregresse_terapie_anti_hcv;
    private Boolean pro;
    private Boolean ribavirina;
    private String sesso;
    private Boolean sex_worker;
    private Boolean stribild;
    private Boolean taf;
    private String team;
    private Boolean terapia_ormonale;
    private Boolean trasferito;

    public CliO_PazienteDTO() {
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
     * The attribute IL28B of O_Paziente. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 4.
     */
    public String getIL28B() {
        return IL28B;
    }
    /**
     * The attribute IL28B of O_Paziente. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 4.
     */
    public void setIL28B(String IL28B) {
        this.IL28B = IL28B;
    }

    /**
     * The attribute _createdon of O_Paziente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of O_Paziente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of O_Paziente. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of O_Paziente. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altezza of O_Paziente. It is of type Int. Ranges: 0:220.
     */
    public Integer getAltezza() {
        return altezza;
    }
    /**
     * The attribute altezza of O_Paziente. It is of type Int. Ranges: 0:220.
     */
    public void setAltezza(Integer altezza) {
        this.altezza = altezza;
    }

    /**
     * The attribute altro_fattore_di_rischio of O_Paziente. It is of type String. Max length: 255.
     */
    public String getAltro_fattore_di_rischio() {
        return altro_fattore_di_rischio;
    }
    /**
     * The attribute altro_fattore_di_rischio of O_Paziente. It is of type String. Max length: 255.
     */
    public void setAltro_fattore_di_rischio(String altro_fattore_di_rischio) {
        this.altro_fattore_di_rischio = altro_fattore_di_rischio;
    }

    /**
     * The attribute anno_nascita of O_Paziente. It is of type Int. Ranges: 1910:2000.
     */
    public Integer getAnno_nascita() {
        return anno_nascita;
    }
    /**
     * The attribute anno_nascita of O_Paziente. It is of type Int. Ranges: 1910:2000.
     */
    public void setAnno_nascita(Integer anno_nascita) {
        this.anno_nascita = anno_nascita;
    }

    /**
     * The attribute checks of O_Paziente. It is of type Boolean. Expression: 'if(tutti_checks>0,tutti_checks=checks_compilati,null_val)'.
     */
    public Boolean getChecks() {
        return checks;
    }
    /**
     * The attribute checks of O_Paziente. It is of type Boolean. Expression: 'if(tutti_checks>0,tutti_checks=checks_compilati,null_val)'.
     */
    public void setChecks(Boolean checks) {
        this.checks = checks;
    }

    /**
     * The attribute codice_centro of O_Paziente. It is of type String. Path: centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of O_Paziente. It is of type String. Path: centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute codice_interno of O_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public String getCodice_interno() {
        return codice_interno;
    }
    /**
     * The attribute codice_interno of O_Paziente. It is of type String. Max length: 255.Cannot be null.
     */
    public void setCodice_interno(String codice_interno) {
        this.codice_interno = codice_interno;
    }

    /**
     * The attribute comune_di_nascita of O_Paziente. It is of type String. Max length: 255.
     */
    public String getComune_di_nascita() {
        return comune_di_nascita;
    }
    /**
     * The attribute comune_di_nascita of O_Paziente. It is of type String. Max length: 255.
     */
    public void setComune_di_nascita(String comune_di_nascita) {
        this.comune_di_nascita = comune_di_nascita;
    }

    /**
     * The attribute coorte_DAD of O_Paziente. It is of type Int.
     */
    public Integer getCoorte_DAD() {
        return coorte_DAD;
    }
    /**
     * The attribute coorte_DAD of O_Paziente. It is of type Int.
     */
    public void setCoorte_DAD(Integer coorte_DAD) {
        this.coorte_DAD = coorte_DAD;
    }

    /**
     * The attribute data_DAD of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_DAD() {
        return data_DAD;
    }
    /**
     * The attribute data_DAD of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_DAD(String data_DAD) {
        this.data_DAD = data_DAD;
    }

    /**
     * The attribute data_consenso of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_consenso() {
        return data_consenso;
    }
    /**
     * The attribute data_consenso of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_consenso(String data_consenso) {
        this.data_consenso = data_consenso;
    }

    /**
     * The attribute data_consenso_pro of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_consenso_pro() {
        return data_consenso_pro;
    }
    /**
     * The attribute data_consenso_pro of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_consenso_pro(String data_consenso_pro) {
        this.data_consenso_pro = data_consenso_pro;
    }

    /**
     * The attribute data_decesso of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data_decesso.
     */
    public String getData_decesso() {
        return data_decesso;
    }
    /**
     * The attribute data_decesso of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data_decesso.
     */
    public void setData_decesso(String data_decesso) {
        this.data_decesso = data_decesso;
    }

    /**
     * The attribute data_fine_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_fine_terapia_ormonale() {
        return data_fine_terapia_ormonale;
    }
    /**
     * The attribute data_fine_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_fine_terapia_ormonale(String data_fine_terapia_ormonale) {
        this.data_fine_terapia_ormonale = data_fine_terapia_ormonale;
    }

    /**
     * The attribute data_gilbert of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_gilbert() {
        return data_gilbert;
    }
    /**
     * The attribute data_gilbert of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_gilbert(String data_gilbert) {
        this.data_gilbert = data_gilbert;
    }

    /**
     * The attribute data_hla of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_hla() {
        return data_hla;
    }
    /**
     * The attribute data_hla of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_hla(String data_hla) {
        this.data_hla = data_hla;
    }

    /**
     * The attribute data_il28 of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_il28() {
        return data_il28;
    }
    /**
     * The attribute data_il28 of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_il28(String data_il28) {
        this.data_il28 = data_il28;
    }

    /**
     * The attribute data_inizio_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_inizio_terapia_ormonale() {
        return data_inizio_terapia_ormonale;
    }
    /**
     * The attribute data_inizio_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_inizio_terapia_ormonale(String data_inizio_terapia_ormonale) {
        this.data_inizio_terapia_ormonale = data_inizio_terapia_ormonale;
    }

    /**
     * The attribute data_menopausa of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_menopausa() {
        return data_menopausa;
    }
    /**
     * The attribute data_menopausa of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_menopausa(String data_menopausa) {
        this.data_menopausa = data_menopausa;
    }

    /**
     * The attribute data_prima_ARV of O_Paziente. It is of type Date @dateFormat. Path: MIN - Minterapia_ARV data_inizio. Cannot be null.
     */
    public String getData_prima_ARV() {
        return data_prima_ARV;
    }
    /**
     * The attribute data_prima_ARV of O_Paziente. It is of type Date @dateFormat. Path: MIN - Minterapia_ARV data_inizio. Cannot be null.
     */
    public void setData_prima_ARV(String data_prima_ARV) {
        this.data_prima_ARV = data_prima_ARV;
    }

    /**
     * The attribute data_prima_terapia_anti_hcv of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv;
    }
    /**
     * The attribute data_prima_terapia_anti_hcv of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
        this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
    }

    /**
     * The attribute data_prima_visita of O_Paziente. It is of type Date @dateFormat. Path: MIN - Mincontrollo_clinico data. Cannot be null.
     */
    public String getData_prima_visita() {
        return data_prima_visita;
    }
    /**
     * The attribute data_prima_visita of O_Paziente. It is of type Date @dateFormat. Path: MIN - Mincontrollo_clinico data. Cannot be null.
     */
    public void setData_prima_visita(String data_prima_visita) {
        this.data_prima_visita = data_prima_visita;
    }

    /**
     * The attribute data_primo_hcvab_pos of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_primo_hcvab_pos() {
        return data_primo_hcvab_pos;
    }
    /**
     * The attribute data_primo_hcvab_pos of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
        this.data_primo_hcvab_pos = data_primo_hcvab_pos;
    }

    /**
     * The attribute data_ultima_visita of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxcontrollo_clinico data. Cannot be null.
     */
    public String getData_ultima_visita() {
        return data_ultima_visita;
    }
    /**
     * The attribute data_ultima_visita of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxcontrollo_clinico data. Cannot be null.
     */
    public void setData_ultima_visita(String data_ultima_visita) {
        this.data_ultima_visita = data_ultima_visita;
    }

    /**
     * The attribute data_ultimo_HCVAb_pre_arr of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_ultimo_HCVAb_pre_arr() {
        return data_ultimo_HCVAb_pre_arr;
    }
    /**
     * The attribute data_ultimo_HCVAb_pre_arr of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_ultimo_HCVAb_pre_arr(String data_ultimo_HCVAb_pre_arr) {
        this.data_ultimo_HCVAb_pre_arr = data_ultimo_HCVAb_pre_arr;
    }

    /**
     * The attribute data_ultimo_HbsAg_pre_arr of O_Paziente. It is of type Date @dateFormat.
     */
    public String getData_ultimo_HbsAg_pre_arr() {
        return data_ultimo_HbsAg_pre_arr;
    }
    /**
     * The attribute data_ultimo_HbsAg_pre_arr of O_Paziente. It is of type Date @dateFormat.
     */
    public void setData_ultimo_HbsAg_pre_arr(String data_ultimo_HbsAg_pre_arr) {
        this.data_ultimo_HbsAg_pre_arr = data_ultimo_HbsAg_pre_arr;
    }

    /**
     * The attribute data_ultimo_drop of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data. Cannot be null.
     */
    public String getData_ultimo_drop() {
        return data_ultimo_drop;
    }
    /**
     * The attribute data_ultimo_drop of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data. Cannot be null.
     */
    public void setData_ultimo_drop(String data_ultimo_drop) {
        this.data_ultimo_drop = data_ultimo_drop;
    }

    /**
     * The attribute dtg of O_Paziente. It is of type Boolean.
     */
    public Boolean getDtg() {
        return dtg;
    }
    /**
     * The attribute dtg of O_Paziente. It is of type Boolean.
     */
    public void setDtg(Boolean dtg) {
        this.dtg = dtg;
    }

    /**
     * The attribute esito_ultima_terapia of O_Paziente. It is of type String. Domain: Succeso OR Fallimento OR Interruzione per tossicita'.}Max length: 255.
     */
    public String getEsito_ultima_terapia() {
        return esito_ultima_terapia;
    }
    /**
     * The attribute esito_ultima_terapia of O_Paziente. It is of type String. Domain: Succeso OR Fallimento OR Interruzione per tossicita'.}Max length: 255.
     */
    public void setEsito_ultima_terapia(String esito_ultima_terapia) {
        this.esito_ultima_terapia = esito_ultima_terapia;
    }

    /**
     * The attribute eta_arruolamento of O_Paziente. It is of type Int. Expression: 'toInt(getYear(data_prima_visita))-anno_nascita'.
     */
    public Integer getEta_arruolamento() {
        return eta_arruolamento;
    }
    /**
     * The attribute eta_arruolamento of O_Paziente. It is of type Int. Expression: 'toInt(getYear(data_prima_visita))-anno_nascita'.
     */
    public void setEta_arruolamento(Integer eta_arruolamento) {
        this.eta_arruolamento = eta_arruolamento;
    }

    /**
     * The attribute etnia_ of O_Paziente. It is of type String. Path: etnia nome.
     */
    public String getEtnia_() {
        return etnia_;
    }
    /**
     * The attribute etnia_ of O_Paziente. It is of type String. Path: etnia nome.
     */
    public void setEtnia_(String etnia_) {
        this.etnia_ = etnia_;
    }

    /**
     * The attribute farmaci of O_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)terapia_ARV.farmaco_ARV nome. Cannot be null.
     */
    public String getFarmaci() {
        return farmaci;
    }
    /**
     * The attribute farmaci of O_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)terapia_ARV.farmaco_ARV nome. Cannot be null.
     */
    public void setFarmaci(String farmaci) {
        this.farmaci = farmaci;
    }

    /**
     * The attribute fattore_di_rischio_ of O_Paziente. It is of type String. Path: fattore_di_rischio nome.
     */
    public String getFattore_di_rischio_() {
        return fattore_di_rischio_;
    }
    /**
     * The attribute fattore_di_rischio_ of O_Paziente. It is of type String. Path: fattore_di_rischio nome.
     */
    public void setFattore_di_rischio_(String fattore_di_rischio_) {
        this.fattore_di_rischio_ = fattore_di_rischio_;
    }

    /**
     * The attribute hbsag_pos of O_Paziente. It is of type Boolean.
     */
    public Boolean getHbsag_pos() {
        return hbsag_pos;
    }
    /**
     * The attribute hbsag_pos of O_Paziente. It is of type Boolean.
     */
    public void setHbsag_pos(Boolean hbsag_pos) {
        this.hbsag_pos = hbsag_pos;
    }

    /**
     * The attribute hcvab_pos of O_Paziente. It is of type Boolean.
     */
    public Boolean getHcvab_pos() {
        return hcvab_pos;
    }
    /**
     * The attribute hcvab_pos of O_Paziente. It is of type Boolean.
     */
    public void setHcvab_pos(Boolean hcvab_pos) {
        this.hcvab_pos = hcvab_pos;
    }

    /**
     * The attribute hla_b5701 of O_Paziente. It is of type String. Domain: [0-9][0-9]/[0-9][0-9].}Max length: 5.
     */
    public String getHla_b5701() {
        return hla_b5701;
    }
    /**
     * The attribute hla_b5701 of O_Paziente. It is of type String. Domain: [0-9][0-9]/[0-9][0-9].}Max length: 5.
     */
    public void setHla_b5701(String hla_b5701) {
        this.hla_b5701 = hla_b5701;
    }

    /**
     * The attribute hla_b5701_bool of O_Paziente. It is of type Boolean.
     */
    public Boolean getHla_b5701_bool() {
        return hla_b5701_bool;
    }
    /**
     * The attribute hla_b5701_bool of O_Paziente. It is of type Boolean.
     */
    public void setHla_b5701_bool(Boolean hla_b5701_bool) {
        this.hla_b5701_bool = hla_b5701_bool;
    }

    /**
     * The attribute id_respond of O_Paziente. It is of type Int.
     */
    public Integer getId_respond() {
        return id_respond;
    }
    /**
     * The attribute id_respond of O_Paziente. It is of type Int.
     */
    public void setId_respond(Integer id_respond) {
        this.id_respond = id_respond;
    }

    /**
     * The attribute ifn of O_Paziente. It is of type Boolean.
     */
    public Boolean getIfn() {
        return ifn;
    }
    /**
     * The attribute ifn of O_Paziente. It is of type Boolean.
     */
    public void setIfn(Boolean ifn) {
        this.ifn = ifn;
    }

    /**
     * The attribute in_italia_da_anni of O_Paziente. It is of type Int. Ranges: 0:90.
     */
    public Integer getIn_italia_da_anni() {
        return in_italia_da_anni;
    }
    /**
     * The attribute in_italia_da_anni of O_Paziente. It is of type Int. Ranges: 0:90.
     */
    public void setIn_italia_da_anni(Integer in_italia_da_anni) {
        this.in_italia_da_anni = in_italia_da_anni;
    }

    /**
     * The attribute nazionalita_ of O_Paziente. It is of type String. Path: nazionalita nome.
     */
    public String getNazionalita_() {
        return nazionalita_;
    }
    /**
     * The attribute nazionalita_ of O_Paziente. It is of type String. Path: nazionalita nome.
     */
    public void setNazionalita_(String nazionalita_) {
        this.nazionalita_ = nazionalita_;
    }

    /**
     * The attribute nazione of O_Paziente. It is of type String. Path: nazione_ nome.
     */
    public String getNazione() {
        return nazione;
    }
    /**
     * The attribute nazione of O_Paziente. It is of type String. Path: nazione_ nome.
     */
    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    /**
     * The attribute note_terapia of O_Paziente. It is of type Text.
     */
    public String getNote_terapia() {
        return note_terapia;
    }
    /**
     * The attribute note_terapia of O_Paziente. It is of type Text.
     */
    public void setNote_terapia(String note_terapia) {
        this.note_terapia = note_terapia;
    }

    /**
     * The attribute null_val of O_Paziente. It is of type Boolean. Path: AND - Logical ANDchecks_ null_val.
     */
    public Boolean getNull_val() {
        return null_val;
    }
    /**
     * The attribute null_val of O_Paziente. It is of type Boolean. Path: AND - Logical ANDchecks_ null_val.
     */
    public void setNull_val(Boolean null_val) {
        this.null_val = null_val;
    }

    /**
     * The attribute password_questionario of O_Paziente. It is of type String. Max length: 255.
     */
    public String getPassword_questionario() {
        return password_questionario;
    }
    /**
     * The attribute password_questionario of O_Paziente. It is of type String. Max length: 255.
     */
    public void setPassword_questionario(String password_questionario) {
        this.password_questionario = password_questionario;
    }

    /**
     * The attribute pegifn of O_Paziente. It is of type Boolean.
     */
    public Boolean getPegifn() {
        return pegifn;
    }
    /**
     * The attribute pegifn of O_Paziente. It is of type Boolean.
     */
    public void setPegifn(Boolean pegifn) {
        this.pegifn = pegifn;
    }

    /**
     * The attribute pregresse_terapie_anti_hcv of O_Paziente. It is of type Boolean.
     */
    public Boolean getPregresse_terapie_anti_hcv() {
        return pregresse_terapie_anti_hcv;
    }
    /**
     * The attribute pregresse_terapie_anti_hcv of O_Paziente. It is of type Boolean.
     */
    public void setPregresse_terapie_anti_hcv(Boolean pregresse_terapie_anti_hcv) {
        this.pregresse_terapie_anti_hcv = pregresse_terapie_anti_hcv;
    }

    /**
     * The attribute pro of O_Paziente. It is of type Boolean.
     */
    public Boolean getPro() {
        return pro;
    }
    /**
     * The attribute pro of O_Paziente. It is of type Boolean.
     */
    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    /**
     * The attribute ribavirina of O_Paziente. It is of type Boolean.
     */
    public Boolean getRibavirina() {
        return ribavirina;
    }
    /**
     * The attribute ribavirina of O_Paziente. It is of type Boolean.
     */
    public void setRibavirina(Boolean ribavirina) {
        this.ribavirina = ribavirina;
    }

    /**
     * The attribute sesso of O_Paziente. It is of type String. Domain: F OR M.}Max length: 255.Cannot be null.
     */
    public String getSesso() {
        return sesso;
    }
    /**
     * The attribute sesso of O_Paziente. It is of type String. Domain: F OR M.}Max length: 255.Cannot be null.
     */
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    /**
     * The attribute sex_worker of O_Paziente. It is of type Boolean.
     */
    public Boolean getSex_worker() {
        return sex_worker;
    }
    /**
     * The attribute sex_worker of O_Paziente. It is of type Boolean.
     */
    public void setSex_worker(Boolean sex_worker) {
        this.sex_worker = sex_worker;
    }

    /**
     * The attribute stribild of O_Paziente. It is of type Boolean.
     */
    public Boolean getStribild() {
        return stribild;
    }
    /**
     * The attribute stribild of O_Paziente. It is of type Boolean.
     */
    public void setStribild(Boolean stribild) {
        this.stribild = stribild;
    }

    /**
     * The attribute taf of O_Paziente. It is of type Boolean.
     */
    public Boolean getTaf() {
        return taf;
    }
    /**
     * The attribute taf of O_Paziente. It is of type Boolean.
     */
    public void setTaf(Boolean taf) {
        this.taf = taf;
    }

    /**
     * The attribute team of O_Paziente. It is of type String. Expression: '__CurrentUser.team'.
     */
    public String getTeam() {
        return team;
    }
    /**
     * The attribute team of O_Paziente. It is of type String. Expression: '__CurrentUser.team'.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * The attribute terapia_ormonale of O_Paziente. It is of type Boolean.
     */
    public Boolean getTerapia_ormonale() {
        return terapia_ormonale;
    }
    /**
     * The attribute terapia_ormonale of O_Paziente. It is of type Boolean.
     */
    public void setTerapia_ormonale(Boolean terapia_ormonale) {
        this.terapia_ormonale = terapia_ormonale;
    }

    /**
     * The attribute trasferito of O_Paziente. It is of type Boolean.
     */
    public Boolean getTrasferito() {
        return trasferito;
    }
    /**
     * The attribute trasferito of O_Paziente. It is of type Boolean.
     */
    public void setTrasferito(Boolean trasferito) {
        this.trasferito = trasferito;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (codice_interno != null) {
            joiner.add("codice_interno: " + GraphQLRequestSerializer.getEntry(codice_interno));
        }
        if (comune_di_nascita != null) {
            joiner.add("comune_di_nascita: " + GraphQLRequestSerializer.getEntry(comune_di_nascita));
        }
        if (coorte_DAD != null) {
            joiner.add("coorte_DAD: " + GraphQLRequestSerializer.getEntry(coorte_DAD));
        }
        if (data_DAD != null) {
            joiner.add("data_DAD: " + GraphQLRequestSerializer.getEntry(data_DAD));
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
        if (dtg != null) {
            joiner.add("dtg: " + GraphQLRequestSerializer.getEntry(dtg));
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
        if (password_questionario != null) {
            joiner.add("password_questionario: " + GraphQLRequestSerializer.getEntry(password_questionario));
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
        if (sesso != null) {
            joiner.add("sesso: " + GraphQLRequestSerializer.getEntry(sesso));
        }
        if (sex_worker != null) {
            joiner.add("sex_worker: " + GraphQLRequestSerializer.getEntry(sex_worker));
        }
        if (stribild != null) {
            joiner.add("stribild: " + GraphQLRequestSerializer.getEntry(stribild));
        }
        if (taf != null) {
            joiner.add("taf: " + GraphQLRequestSerializer.getEntry(taf));
        }
        if (team != null) {
            joiner.add("team: " + GraphQLRequestSerializer.getEntry(team));
        }
        if (terapia_ormonale != null) {
            joiner.add("terapia_ormonale: " + GraphQLRequestSerializer.getEntry(terapia_ormonale));
        }
        if (trasferito != null) {
            joiner.add("trasferito: " + GraphQLRequestSerializer.getEntry(trasferito));
        }
        return joiner.toString();
    }

    public static CliO_PazienteDTO.Builder builder() {
        return new CliO_PazienteDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String IL28B;
        private String _createdon;
        private String _id;
        private Integer altezza;
        private String altro_fattore_di_rischio;
        private Integer anno_nascita;
        private Boolean checks;
        private String codice_centro;
        private String codice_interno;
        private String comune_di_nascita;
        private Integer coorte_DAD;
        private String data_DAD;
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
        private String data_prima_terapia_anti_hcv;
        private String data_prima_visita;
        private String data_primo_hcvab_pos;
        private String data_ultima_visita;
        private String data_ultimo_HCVAb_pre_arr;
        private String data_ultimo_HbsAg_pre_arr;
        private String data_ultimo_drop;
        private Boolean dtg;
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
        private String password_questionario;
        private Boolean pegifn;
        private Boolean pregresse_terapie_anti_hcv;
        private Boolean pro;
        private Boolean ribavirina;
        private String sesso;
        private Boolean sex_worker;
        private Boolean stribild;
        private Boolean taf;
        private String team;
        private Boolean terapia_ormonale;
        private Boolean trasferito;

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
         * The attribute IL28B of O_Paziente. It is of type String. Domain: C/C OR C/T OR T/T.}Max length: 4.
         */
        public Builder setIL28B(String IL28B) {
            this.IL28B = IL28B;
            return this;
        }

        /**
         * The attribute _createdon of O_Paziente. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of O_Paziente. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altezza of O_Paziente. It is of type Int. Ranges: 0:220.
         */
        public Builder setAltezza(Integer altezza) {
            this.altezza = altezza;
            return this;
        }

        /**
         * The attribute altro_fattore_di_rischio of O_Paziente. It is of type String. Max length: 255.
         */
        public Builder setAltro_fattore_di_rischio(String altro_fattore_di_rischio) {
            this.altro_fattore_di_rischio = altro_fattore_di_rischio;
            return this;
        }

        /**
         * The attribute anno_nascita of O_Paziente. It is of type Int. Ranges: 1910:2000.
         */
        public Builder setAnno_nascita(Integer anno_nascita) {
            this.anno_nascita = anno_nascita;
            return this;
        }

        /**
         * The attribute checks of O_Paziente. It is of type Boolean. Expression: 'if(tutti_checks>0,tutti_checks=checks_compilati,null_val)'.
         */
        public Builder setChecks(Boolean checks) {
            this.checks = checks;
            return this;
        }

        /**
         * The attribute codice_centro of O_Paziente. It is of type String. Path: centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute codice_interno of O_Paziente. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setCodice_interno(String codice_interno) {
            this.codice_interno = codice_interno;
            return this;
        }

        /**
         * The attribute comune_di_nascita of O_Paziente. It is of type String. Max length: 255.
         */
        public Builder setComune_di_nascita(String comune_di_nascita) {
            this.comune_di_nascita = comune_di_nascita;
            return this;
        }

        /**
         * The attribute coorte_DAD of O_Paziente. It is of type Int.
         */
        public Builder setCoorte_DAD(Integer coorte_DAD) {
            this.coorte_DAD = coorte_DAD;
            return this;
        }

        /**
         * The attribute data_DAD of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_DAD(String data_DAD) {
            this.data_DAD = data_DAD;
            return this;
        }

        /**
         * The attribute data_consenso of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_consenso(String data_consenso) {
            this.data_consenso = data_consenso;
            return this;
        }

        /**
         * The attribute data_consenso_pro of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_consenso_pro(String data_consenso_pro) {
            this.data_consenso_pro = data_consenso_pro;
            return this;
        }

        /**
         * The attribute data_decesso of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data_decesso.
         */
        public Builder setData_decesso(String data_decesso) {
            this.data_decesso = data_decesso;
            return this;
        }

        /**
         * The attribute data_fine_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_fine_terapia_ormonale(String data_fine_terapia_ormonale) {
            this.data_fine_terapia_ormonale = data_fine_terapia_ormonale;
            return this;
        }

        /**
         * The attribute data_gilbert of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_gilbert(String data_gilbert) {
            this.data_gilbert = data_gilbert;
            return this;
        }

        /**
         * The attribute data_hla of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_hla(String data_hla) {
            this.data_hla = data_hla;
            return this;
        }

        /**
         * The attribute data_il28 of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_il28(String data_il28) {
            this.data_il28 = data_il28;
            return this;
        }

        /**
         * The attribute data_inizio_terapia_ormonale of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_inizio_terapia_ormonale(String data_inizio_terapia_ormonale) {
            this.data_inizio_terapia_ormonale = data_inizio_terapia_ormonale;
            return this;
        }

        /**
         * The attribute data_menopausa of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_menopausa(String data_menopausa) {
            this.data_menopausa = data_menopausa;
            return this;
        }

        /**
         * The attribute data_prima_ARV of O_Paziente. It is of type Date @dateFormat. Path: MIN - Minterapia_ARV data_inizio. Cannot be null.
         */
        public Builder setData_prima_ARV(String data_prima_ARV) {
            this.data_prima_ARV = data_prima_ARV;
            return this;
        }

        /**
         * The attribute data_prima_terapia_anti_hcv of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_prima_terapia_anti_hcv(String data_prima_terapia_anti_hcv) {
            this.data_prima_terapia_anti_hcv = data_prima_terapia_anti_hcv;
            return this;
        }

        /**
         * The attribute data_prima_visita of O_Paziente. It is of type Date @dateFormat. Path: MIN - Mincontrollo_clinico data. Cannot be null.
         */
        public Builder setData_prima_visita(String data_prima_visita) {
            this.data_prima_visita = data_prima_visita;
            return this;
        }

        /**
         * The attribute data_primo_hcvab_pos of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_primo_hcvab_pos(String data_primo_hcvab_pos) {
            this.data_primo_hcvab_pos = data_primo_hcvab_pos;
            return this;
        }

        /**
         * The attribute data_ultima_visita of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxcontrollo_clinico data. Cannot be null.
         */
        public Builder setData_ultima_visita(String data_ultima_visita) {
            this.data_ultima_visita = data_ultima_visita;
            return this;
        }

        /**
         * The attribute data_ultimo_HCVAb_pre_arr of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_ultimo_HCVAb_pre_arr(String data_ultimo_HCVAb_pre_arr) {
            this.data_ultimo_HCVAb_pre_arr = data_ultimo_HCVAb_pre_arr;
            return this;
        }

        /**
         * The attribute data_ultimo_HbsAg_pre_arr of O_Paziente. It is of type Date @dateFormat.
         */
        public Builder setData_ultimo_HbsAg_pre_arr(String data_ultimo_HbsAg_pre_arr) {
            this.data_ultimo_HbsAg_pre_arr = data_ultimo_HbsAg_pre_arr;
            return this;
        }

        /**
         * The attribute data_ultimo_drop of O_Paziente. It is of type Date @dateFormat. Path: MAX - Maxdropout data. Cannot be null.
         */
        public Builder setData_ultimo_drop(String data_ultimo_drop) {
            this.data_ultimo_drop = data_ultimo_drop;
            return this;
        }

        /**
         * The attribute dtg of O_Paziente. It is of type Boolean.
         */
        public Builder setDtg(Boolean dtg) {
            this.dtg = dtg;
            return this;
        }

        /**
         * The attribute esito_ultima_terapia of O_Paziente. It is of type String. Domain: Succeso OR Fallimento OR Interruzione per tossicita'.}Max length: 255.
         */
        public Builder setEsito_ultima_terapia(String esito_ultima_terapia) {
            this.esito_ultima_terapia = esito_ultima_terapia;
            return this;
        }

        /**
         * The attribute eta_arruolamento of O_Paziente. It is of type Int. Expression: 'toInt(getYear(data_prima_visita))-anno_nascita'.
         */
        public Builder setEta_arruolamento(Integer eta_arruolamento) {
            this.eta_arruolamento = eta_arruolamento;
            return this;
        }

        /**
         * The attribute etnia_ of O_Paziente. It is of type String. Path: etnia nome.
         */
        public Builder setEtnia_(String etnia_) {
            this.etnia_ = etnia_;
            return this;
        }

        /**
         * The attribute farmaci of O_Paziente. It is of type String. Path: CONCAT_CS - Concat (comma separated)terapia_ARV.farmaco_ARV nome. Cannot be null.
         */
        public Builder setFarmaci(String farmaci) {
            this.farmaci = farmaci;
            return this;
        }

        /**
         * The attribute fattore_di_rischio_ of O_Paziente. It is of type String. Path: fattore_di_rischio nome.
         */
        public Builder setFattore_di_rischio_(String fattore_di_rischio_) {
            this.fattore_di_rischio_ = fattore_di_rischio_;
            return this;
        }

        /**
         * The attribute hbsag_pos of O_Paziente. It is of type Boolean.
         */
        public Builder setHbsag_pos(Boolean hbsag_pos) {
            this.hbsag_pos = hbsag_pos;
            return this;
        }

        /**
         * The attribute hcvab_pos of O_Paziente. It is of type Boolean.
         */
        public Builder setHcvab_pos(Boolean hcvab_pos) {
            this.hcvab_pos = hcvab_pos;
            return this;
        }

        /**
         * The attribute hla_b5701 of O_Paziente. It is of type String. Domain: [0-9][0-9]/[0-9][0-9].}Max length: 5.
         */
        public Builder setHla_b5701(String hla_b5701) {
            this.hla_b5701 = hla_b5701;
            return this;
        }

        /**
         * The attribute hla_b5701_bool of O_Paziente. It is of type Boolean.
         */
        public Builder setHla_b5701_bool(Boolean hla_b5701_bool) {
            this.hla_b5701_bool = hla_b5701_bool;
            return this;
        }

        /**
         * The attribute id_respond of O_Paziente. It is of type Int.
         */
        public Builder setId_respond(Integer id_respond) {
            this.id_respond = id_respond;
            return this;
        }

        /**
         * The attribute ifn of O_Paziente. It is of type Boolean.
         */
        public Builder setIfn(Boolean ifn) {
            this.ifn = ifn;
            return this;
        }

        /**
         * The attribute in_italia_da_anni of O_Paziente. It is of type Int. Ranges: 0:90.
         */
        public Builder setIn_italia_da_anni(Integer in_italia_da_anni) {
            this.in_italia_da_anni = in_italia_da_anni;
            return this;
        }

        /**
         * The attribute nazionalita_ of O_Paziente. It is of type String. Path: nazionalita nome.
         */
        public Builder setNazionalita_(String nazionalita_) {
            this.nazionalita_ = nazionalita_;
            return this;
        }

        /**
         * The attribute nazione of O_Paziente. It is of type String. Path: nazione_ nome.
         */
        public Builder setNazione(String nazione) {
            this.nazione = nazione;
            return this;
        }

        /**
         * The attribute note_terapia of O_Paziente. It is of type Text.
         */
        public Builder setNote_terapia(String note_terapia) {
            this.note_terapia = note_terapia;
            return this;
        }

        /**
         * The attribute null_val of O_Paziente. It is of type Boolean. Path: AND - Logical ANDchecks_ null_val.
         */
        public Builder setNull_val(Boolean null_val) {
            this.null_val = null_val;
            return this;
        }

        /**
         * The attribute password_questionario of O_Paziente. It is of type String. Max length: 255.
         */
        public Builder setPassword_questionario(String password_questionario) {
            this.password_questionario = password_questionario;
            return this;
        }

        /**
         * The attribute pegifn of O_Paziente. It is of type Boolean.
         */
        public Builder setPegifn(Boolean pegifn) {
            this.pegifn = pegifn;
            return this;
        }

        /**
         * The attribute pregresse_terapie_anti_hcv of O_Paziente. It is of type Boolean.
         */
        public Builder setPregresse_terapie_anti_hcv(Boolean pregresse_terapie_anti_hcv) {
            this.pregresse_terapie_anti_hcv = pregresse_terapie_anti_hcv;
            return this;
        }

        /**
         * The attribute pro of O_Paziente. It is of type Boolean.
         */
        public Builder setPro(Boolean pro) {
            this.pro = pro;
            return this;
        }

        /**
         * The attribute ribavirina of O_Paziente. It is of type Boolean.
         */
        public Builder setRibavirina(Boolean ribavirina) {
            this.ribavirina = ribavirina;
            return this;
        }

        /**
         * The attribute sesso of O_Paziente. It is of type String. Domain: F OR M.}Max length: 255.Cannot be null.
         */
        public Builder setSesso(String sesso) {
            this.sesso = sesso;
            return this;
        }

        /**
         * The attribute sex_worker of O_Paziente. It is of type Boolean.
         */
        public Builder setSex_worker(Boolean sex_worker) {
            this.sex_worker = sex_worker;
            return this;
        }

        /**
         * The attribute stribild of O_Paziente. It is of type Boolean.
         */
        public Builder setStribild(Boolean stribild) {
            this.stribild = stribild;
            return this;
        }

        /**
         * The attribute taf of O_Paziente. It is of type Boolean.
         */
        public Builder setTaf(Boolean taf) {
            this.taf = taf;
            return this;
        }

        /**
         * The attribute team of O_Paziente. It is of type String. Expression: '__CurrentUser.team'.
         */
        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        /**
         * The attribute terapia_ormonale of O_Paziente. It is of type Boolean.
         */
        public Builder setTerapia_ormonale(Boolean terapia_ormonale) {
            this.terapia_ormonale = terapia_ormonale;
            return this;
        }

        /**
         * The attribute trasferito of O_Paziente. It is of type Boolean.
         */
        public Builder setTrasferito(Boolean trasferito) {
            this.trasferito = trasferito;
            return this;
        }


        public CliO_PazienteDTO build() {
            CliO_PazienteDTO result = new CliO_PazienteDTO();
            result.set_clientId(this._clientId);
            result.setIL28B(this.IL28B);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.setAltezza(this.altezza);
            result.setAltro_fattore_di_rischio(this.altro_fattore_di_rischio);
            result.setAnno_nascita(this.anno_nascita);
            result.setChecks(this.checks);
            result.setCodice_centro(this.codice_centro);
            result.setCodice_interno(this.codice_interno);
            result.setComune_di_nascita(this.comune_di_nascita);
            result.setCoorte_DAD(this.coorte_DAD);
            result.setData_DAD(this.data_DAD);
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
            result.setData_prima_terapia_anti_hcv(this.data_prima_terapia_anti_hcv);
            result.setData_prima_visita(this.data_prima_visita);
            result.setData_primo_hcvab_pos(this.data_primo_hcvab_pos);
            result.setData_ultima_visita(this.data_ultima_visita);
            result.setData_ultimo_HCVAb_pre_arr(this.data_ultimo_HCVAb_pre_arr);
            result.setData_ultimo_HbsAg_pre_arr(this.data_ultimo_HbsAg_pre_arr);
            result.setData_ultimo_drop(this.data_ultimo_drop);
            result.setDtg(this.dtg);
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
            result.setPassword_questionario(this.password_questionario);
            result.setPegifn(this.pegifn);
            result.setPregresse_terapie_anti_hcv(this.pregresse_terapie_anti_hcv);
            result.setPro(this.pro);
            result.setRibavirina(this.ribavirina);
            result.setSesso(this.sesso);
            result.setSex_worker(this.sex_worker);
            result.setStribild(this.stribild);
            result.setTaf(this.taf);
            result.setTeam(this.team);
            result.setTerapia_ormonale(this.terapia_ormonale);
            result.setTrasferito(this.trasferito);
            return result;
        }

    }
}
