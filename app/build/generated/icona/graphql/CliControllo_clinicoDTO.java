package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Controllo_clinico, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliControllo_clinicoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Integer ALT;
    private Integer AST;
    private Integer HDL;
    private Integer LDL;
    private String MCV;
    private String PCHE;
    private Boolean PPD;
    private String PT_INR;
    private String PT_percentuale;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String acido_lattico;
    private String albumina;
    private String alfafetoproteina;
    private String altra_metodica;
    private String altro_beve;
    private Integer azotemia;
    private Boolean beve;
    private String bilirubina_diretta;
    private String bilirubina_totale;
    private Integer birra;
    private String calcio;
    private Boolean campione;
    private Boolean chemsex;
    private Integer circonferenza_vita;
    private Boolean cmvigg;
    private String codice_centro;
    private Integer colesterolo;
    private Boolean cov_igg;
    private String cov_igg_titolo;
    private Boolean cov_igm;
    private String cov_igm_titolo;
    private Boolean cov_rna;
    private String cov_test;
    private Boolean cov_vax;
    private String creatinina;
    private String data;
    private String data_campione;
    private String data_presunta_parto;
    private String data_questionario;
    private Integer dosi_omesse;
    private String emoglobina;
    private String emoglobina_glicata;
    private String followup_questionario;
    private Integer fosfatasi_alcalina;
    private String fosforo;
    private String frequenza;
    private Boolean fumatore_attivo;
    private Integer gamma_gt;
    private Integer glicemia;
    private Integer globuli_bianchi;
    private Boolean gravidanza;
    private Boolean havabtotali;
    private Boolean havigm;
    private Boolean hbcab;
    private Boolean hbcigm;
    private Boolean hbeab;
    private Boolean hbeag;
    private Boolean hbsab;
    private String hbsab_totali;
    private Boolean hbsag;
    private String hbsag_totali;
    private Boolean hcvab;
    private Boolean hcvag;
    private Boolean hdvab;
    private Boolean hdvab_igg;
    private Boolean hdvabigm;
    private String hdvabtotali;
    private Boolean interruzioni;
    private String mdw;
    private String metodica_vitamina_D_2;
    private Integer monociti;
    private Boolean non_trepon;
    private Integer nr_neutrofili;
    private Boolean omissione;
    private Integer pa_max;
    private Integer pa_min;
    private String paziente;
    private String peso;
    private Integer piastrine;
    private String proteinuria;
    private Boolean questionario_str;
    private String sesso_ok;
    private Integer superalcolici;
    private Boolean tossicodip_attivo;
    private Boolean toxoigg;
    private Boolean trepon;
    private Integer trigliceridi;
    private String unita_vitamina_D;
    private String vas;
    private String vas_globale;
    private Integer vino;
    private String vitamina_D;
    private CliPazienteDTO Paziente_controllo_clinico;

    public CliControllo_clinicoDTO() {
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
     * The attribute ALT of Controllo_clinico. It is of type Int.
     */
    public Integer getALT() {
        return ALT;
    }
    /**
     * The attribute ALT of Controllo_clinico. It is of type Int.
     */
    public void setALT(Integer ALT) {
        this.ALT = ALT;
    }

    /**
     * The attribute AST of Controllo_clinico. It is of type Int.
     */
    public Integer getAST() {
        return AST;
    }
    /**
     * The attribute AST of Controllo_clinico. It is of type Int.
     */
    public void setAST(Integer AST) {
        this.AST = AST;
    }

    /**
     * The attribute HDL of Controllo_clinico. It is of type Int.
     */
    public Integer getHDL() {
        return HDL;
    }
    /**
     * The attribute HDL of Controllo_clinico. It is of type Int.
     */
    public void setHDL(Integer HDL) {
        this.HDL = HDL;
    }

    /**
     * The attribute LDL of Controllo_clinico. It is of type Int.
     */
    public Integer getLDL() {
        return LDL;
    }
    /**
     * The attribute LDL of Controllo_clinico. It is of type Int.
     */
    public void setLDL(Integer LDL) {
        this.LDL = LDL;
    }

    /**
     * The attribute MCV of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getMCV() {
        return MCV;
    }
    /**
     * The attribute MCV of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setMCV(String MCV) {
        this.MCV = MCV;
    }

    /**
     * The attribute PCHE of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getPCHE() {
        return PCHE;
    }
    /**
     * The attribute PCHE of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setPCHE(String PCHE) {
        this.PCHE = PCHE;
    }

    /**
     * The attribute PPD of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getPPD() {
        return PPD;
    }
    /**
     * The attribute PPD of Controllo_clinico. It is of type Boolean.
     */
    public void setPPD(Boolean PPD) {
        this.PPD = PPD;
    }

    /**
     * The attribute PT_INR of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getPT_INR() {
        return PT_INR;
    }
    /**
     * The attribute PT_INR of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setPT_INR(String PT_INR) {
        this.PT_INR = PT_INR;
    }

    /**
     * The attribute PT_percentuale of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getPT_percentuale() {
        return PT_percentuale;
    }
    /**
     * The attribute PT_percentuale of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setPT_percentuale(String PT_percentuale) {
        this.PT_percentuale = PT_percentuale;
    }

    /**
     * The attribute _createdby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Controllo_clinico. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Controllo_clinico. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Controllo_clinico. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute acido_lattico of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getAcido_lattico() {
        return acido_lattico;
    }
    /**
     * The attribute acido_lattico of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setAcido_lattico(String acido_lattico) {
        this.acido_lattico = acido_lattico;
    }

    /**
     * The attribute albumina of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getAlbumina() {
        return albumina;
    }
    /**
     * The attribute albumina of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setAlbumina(String albumina) {
        this.albumina = albumina;
    }

    /**
     * The attribute alfafetoproteina of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getAlfafetoproteina() {
        return alfafetoproteina;
    }
    /**
     * The attribute alfafetoproteina of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setAlfafetoproteina(String alfafetoproteina) {
        this.alfafetoproteina = alfafetoproteina;
    }

    /**
     * The attribute altra_metodica of Controllo_clinico. It is of type String. Max length: 255.
     */
    public String getAltra_metodica() {
        return altra_metodica;
    }
    /**
     * The attribute altra_metodica of Controllo_clinico. It is of type String. Max length: 255.
     */
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    /**
     * The attribute altro_beve of Controllo_clinico. It is of type String. Max length: 255.
     */
    public String getAltro_beve() {
        return altro_beve;
    }
    /**
     * The attribute altro_beve of Controllo_clinico. It is of type String. Max length: 255.
     */
    public void setAltro_beve(String altro_beve) {
        this.altro_beve = altro_beve;
    }

    /**
     * The attribute azotemia of Controllo_clinico. It is of type Int.
     */
    public Integer getAzotemia() {
        return azotemia;
    }
    /**
     * The attribute azotemia of Controllo_clinico. It is of type Int.
     */
    public void setAzotemia(Integer azotemia) {
        this.azotemia = azotemia;
    }

    /**
     * The attribute beve of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getBeve() {
        return beve;
    }
    /**
     * The attribute beve of Controllo_clinico. It is of type Boolean.
     */
    public void setBeve(Boolean beve) {
        this.beve = beve;
    }

    /**
     * The attribute bilirubina_diretta of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getBilirubina_diretta() {
        return bilirubina_diretta;
    }
    /**
     * The attribute bilirubina_diretta of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setBilirubina_diretta(String bilirubina_diretta) {
        this.bilirubina_diretta = bilirubina_diretta;
    }

    /**
     * The attribute bilirubina_totale of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getBilirubina_totale() {
        return bilirubina_totale;
    }
    /**
     * The attribute bilirubina_totale of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setBilirubina_totale(String bilirubina_totale) {
        this.bilirubina_totale = bilirubina_totale;
    }

    /**
     * The attribute birra of Controllo_clinico. It is of type Int.
     */
    public Integer getBirra() {
        return birra;
    }
    /**
     * The attribute birra of Controllo_clinico. It is of type Int.
     */
    public void setBirra(Integer birra) {
        this.birra = birra;
    }

    /**
     * The attribute calcio of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getCalcio() {
        return calcio;
    }
    /**
     * The attribute calcio of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    /**
     * The attribute campione of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCampione() {
        return campione;
    }
    /**
     * The attribute campione of Controllo_clinico. It is of type Boolean.
     */
    public void setCampione(Boolean campione) {
        this.campione = campione;
    }

    /**
     * The attribute chemsex of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getChemsex() {
        return chemsex;
    }
    /**
     * The attribute chemsex of Controllo_clinico. It is of type Boolean.
     */
    public void setChemsex(Boolean chemsex) {
        this.chemsex = chemsex;
    }

    /**
     * The attribute circonferenza_vita of Controllo_clinico. It is of type Int.
     */
    public Integer getCirconferenza_vita() {
        return circonferenza_vita;
    }
    /**
     * The attribute circonferenza_vita of Controllo_clinico. It is of type Int.
     */
    public void setCirconferenza_vita(Integer circonferenza_vita) {
        this.circonferenza_vita = circonferenza_vita;
    }

    /**
     * The attribute cmvigg of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCmvigg() {
        return cmvigg;
    }
    /**
     * The attribute cmvigg of Controllo_clinico. It is of type Boolean.
     */
    public void setCmvigg(Boolean cmvigg) {
        this.cmvigg = cmvigg;
    }

    /**
     * The attribute codice_centro of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute colesterolo of Controllo_clinico. It is of type Int.
     */
    public Integer getColesterolo() {
        return colesterolo;
    }
    /**
     * The attribute colesterolo of Controllo_clinico. It is of type Int.
     */
    public void setColesterolo(Integer colesterolo) {
        this.colesterolo = colesterolo;
    }

    /**
     * The attribute cov_igg of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCov_igg() {
        return cov_igg;
    }
    /**
     * The attribute cov_igg of Controllo_clinico. It is of type Boolean.
     */
    public void setCov_igg(Boolean cov_igg) {
        this.cov_igg = cov_igg;
    }

    /**
     * The attribute cov_igg_titolo of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getCov_igg_titolo() {
        return cov_igg_titolo;
    }
    /**
     * The attribute cov_igg_titolo of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setCov_igg_titolo(String cov_igg_titolo) {
        this.cov_igg_titolo = cov_igg_titolo;
    }

    /**
     * The attribute cov_igm of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCov_igm() {
        return cov_igm;
    }
    /**
     * The attribute cov_igm of Controllo_clinico. It is of type Boolean.
     */
    public void setCov_igm(Boolean cov_igm) {
        this.cov_igm = cov_igm;
    }

    /**
     * The attribute cov_igm_titolo of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getCov_igm_titolo() {
        return cov_igm_titolo;
    }
    /**
     * The attribute cov_igm_titolo of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setCov_igm_titolo(String cov_igm_titolo) {
        this.cov_igm_titolo = cov_igm_titolo;
    }

    /**
     * The attribute cov_rna of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCov_rna() {
        return cov_rna;
    }
    /**
     * The attribute cov_rna of Controllo_clinico. It is of type Boolean.
     */
    public void setCov_rna(Boolean cov_rna) {
        this.cov_rna = cov_rna;
    }

    /**
     * The attribute cov_test of Controllo_clinico. It is of type String. Domain: Nasofaringeo OR BAL OR Altro.}Max length: 255.
     */
    public String getCov_test() {
        return cov_test;
    }
    /**
     * The attribute cov_test of Controllo_clinico. It is of type String. Domain: Nasofaringeo OR BAL OR Altro.}Max length: 255.
     */
    public void setCov_test(String cov_test) {
        this.cov_test = cov_test;
    }

    /**
     * The attribute cov_vax of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getCov_vax() {
        return cov_vax;
    }
    /**
     * The attribute cov_vax of Controllo_clinico. It is of type Boolean.
     */
    public void setCov_vax(Boolean cov_vax) {
        this.cov_vax = cov_vax;
    }

    /**
     * The attribute creatinina of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getCreatinina() {
        return creatinina;
    }
    /**
     * The attribute creatinina of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setCreatinina(String creatinina) {
        this.creatinina = creatinina;
    }

    /**
     * The attribute data of Controllo_clinico. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Controllo_clinico. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute data_campione of Controllo_clinico. It is of type Date @dateFormat.
     */
    public String getData_campione() {
        return data_campione;
    }
    /**
     * The attribute data_campione of Controllo_clinico. It is of type Date @dateFormat.
     */
    public void setData_campione(String data_campione) {
        this.data_campione = data_campione;
    }

    /**
     * The attribute data_presunta_parto of Controllo_clinico. It is of type Date @dateFormat.
     */
    public String getData_presunta_parto() {
        return data_presunta_parto;
    }
    /**
     * The attribute data_presunta_parto of Controllo_clinico. It is of type Date @dateFormat.
     */
    public void setData_presunta_parto(String data_presunta_parto) {
        this.data_presunta_parto = data_presunta_parto;
    }

    /**
     * The attribute data_questionario of Controllo_clinico. It is of type Date @dateFormat.
     */
    public String getData_questionario() {
        return data_questionario;
    }
    /**
     * The attribute data_questionario of Controllo_clinico. It is of type Date @dateFormat.
     */
    public void setData_questionario(String data_questionario) {
        this.data_questionario = data_questionario;
    }

    /**
     * The attribute dosi_omesse of Controllo_clinico. It is of type Int.
     */
    public Integer getDosi_omesse() {
        return dosi_omesse;
    }
    /**
     * The attribute dosi_omesse of Controllo_clinico. It is of type Int.
     */
    public void setDosi_omesse(Integer dosi_omesse) {
        this.dosi_omesse = dosi_omesse;
    }

    /**
     * The attribute emoglobina of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getEmoglobina() {
        return emoglobina;
    }
    /**
     * The attribute emoglobina of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setEmoglobina(String emoglobina) {
        this.emoglobina = emoglobina;
    }

    /**
     * The attribute emoglobina_glicata of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getEmoglobina_glicata() {
        return emoglobina_glicata;
    }
    /**
     * The attribute emoglobina_glicata of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setEmoglobina_glicata(String emoglobina_glicata) {
        this.emoglobina_glicata = emoglobina_glicata;
    }

    /**
     * The attribute followup_questionario of Controllo_clinico. It is of type String. Domain: Basale OR 3 mesi OR 6 mesi.}Max length: 255.
     */
    public String getFollowup_questionario() {
        return followup_questionario;
    }
    /**
     * The attribute followup_questionario of Controllo_clinico. It is of type String. Domain: Basale OR 3 mesi OR 6 mesi.}Max length: 255.
     */
    public void setFollowup_questionario(String followup_questionario) {
        this.followup_questionario = followup_questionario;
    }

    /**
     * The attribute fosfatasi_alcalina of Controllo_clinico. It is of type Int.
     */
    public Integer getFosfatasi_alcalina() {
        return fosfatasi_alcalina;
    }
    /**
     * The attribute fosfatasi_alcalina of Controllo_clinico. It is of type Int.
     */
    public void setFosfatasi_alcalina(Integer fosfatasi_alcalina) {
        this.fosfatasi_alcalina = fosfatasi_alcalina;
    }

    /**
     * The attribute fosforo of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getFosforo() {
        return fosforo;
    }
    /**
     * The attribute fosforo of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setFosforo(String fosforo) {
        this.fosforo = fosforo;
    }

    /**
     * The attribute frequenza of Controllo_clinico. It is of type String. Domain: giornalmente OR occasionalmente.}Max length: 255.
     */
    public String getFrequenza() {
        return frequenza;
    }
    /**
     * The attribute frequenza of Controllo_clinico. It is of type String. Domain: giornalmente OR occasionalmente.}Max length: 255.
     */
    public void setFrequenza(String frequenza) {
        this.frequenza = frequenza;
    }

    /**
     * The attribute fumatore_attivo of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getFumatore_attivo() {
        return fumatore_attivo;
    }
    /**
     * The attribute fumatore_attivo of Controllo_clinico. It is of type Boolean.
     */
    public void setFumatore_attivo(Boolean fumatore_attivo) {
        this.fumatore_attivo = fumatore_attivo;
    }

    /**
     * The attribute gamma_gt of Controllo_clinico. It is of type Int.
     */
    public Integer getGamma_gt() {
        return gamma_gt;
    }
    /**
     * The attribute gamma_gt of Controllo_clinico. It is of type Int.
     */
    public void setGamma_gt(Integer gamma_gt) {
        this.gamma_gt = gamma_gt;
    }

    /**
     * The attribute glicemia of Controllo_clinico. It is of type Int.
     */
    public Integer getGlicemia() {
        return glicemia;
    }
    /**
     * The attribute glicemia of Controllo_clinico. It is of type Int.
     */
    public void setGlicemia(Integer glicemia) {
        this.glicemia = glicemia;
    }

    /**
     * The attribute globuli_bianchi of Controllo_clinico. It is of type Int.
     */
    public Integer getGlobuli_bianchi() {
        return globuli_bianchi;
    }
    /**
     * The attribute globuli_bianchi of Controllo_clinico. It is of type Int.
     */
    public void setGlobuli_bianchi(Integer globuli_bianchi) {
        this.globuli_bianchi = globuli_bianchi;
    }

    /**
     * The attribute gravidanza of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getGravidanza() {
        return gravidanza;
    }
    /**
     * The attribute gravidanza of Controllo_clinico. It is of type Boolean.
     */
    public void setGravidanza(Boolean gravidanza) {
        this.gravidanza = gravidanza;
    }

    /**
     * The attribute havabtotali of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHavabtotali() {
        return havabtotali;
    }
    /**
     * The attribute havabtotali of Controllo_clinico. It is of type Boolean.
     */
    public void setHavabtotali(Boolean havabtotali) {
        this.havabtotali = havabtotali;
    }

    /**
     * The attribute havigm of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHavigm() {
        return havigm;
    }
    /**
     * The attribute havigm of Controllo_clinico. It is of type Boolean.
     */
    public void setHavigm(Boolean havigm) {
        this.havigm = havigm;
    }

    /**
     * The attribute hbcab of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbcab() {
        return hbcab;
    }
    /**
     * The attribute hbcab of Controllo_clinico. It is of type Boolean.
     */
    public void setHbcab(Boolean hbcab) {
        this.hbcab = hbcab;
    }

    /**
     * The attribute hbcigm of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbcigm() {
        return hbcigm;
    }
    /**
     * The attribute hbcigm of Controllo_clinico. It is of type Boolean.
     */
    public void setHbcigm(Boolean hbcigm) {
        this.hbcigm = hbcigm;
    }

    /**
     * The attribute hbeab of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbeab() {
        return hbeab;
    }
    /**
     * The attribute hbeab of Controllo_clinico. It is of type Boolean.
     */
    public void setHbeab(Boolean hbeab) {
        this.hbeab = hbeab;
    }

    /**
     * The attribute hbeag of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbeag() {
        return hbeag;
    }
    /**
     * The attribute hbeag of Controllo_clinico. It is of type Boolean.
     */
    public void setHbeag(Boolean hbeag) {
        this.hbeag = hbeag;
    }

    /**
     * The attribute hbsab of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbsab() {
        return hbsab;
    }
    /**
     * The attribute hbsab of Controllo_clinico. It is of type Boolean.
     */
    public void setHbsab(Boolean hbsab) {
        this.hbsab = hbsab;
    }

    /**
     * The attribute hbsab_totali of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getHbsab_totali() {
        return hbsab_totali;
    }
    /**
     * The attribute hbsab_totali of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setHbsab_totali(String hbsab_totali) {
        this.hbsab_totali = hbsab_totali;
    }

    /**
     * The attribute hbsag of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHbsag() {
        return hbsag;
    }
    /**
     * The attribute hbsag of Controllo_clinico. It is of type Boolean.
     */
    public void setHbsag(Boolean hbsag) {
        this.hbsag = hbsag;
    }

    /**
     * The attribute hbsag_totali of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getHbsag_totali() {
        return hbsag_totali;
    }
    /**
     * The attribute hbsag_totali of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setHbsag_totali(String hbsag_totali) {
        this.hbsag_totali = hbsag_totali;
    }

    /**
     * The attribute hcvab of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHcvab() {
        return hcvab;
    }
    /**
     * The attribute hcvab of Controllo_clinico. It is of type Boolean.
     */
    public void setHcvab(Boolean hcvab) {
        this.hcvab = hcvab;
    }

    /**
     * The attribute hcvag of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHcvag() {
        return hcvag;
    }
    /**
     * The attribute hcvag of Controllo_clinico. It is of type Boolean.
     */
    public void setHcvag(Boolean hcvag) {
        this.hcvag = hcvag;
    }

    /**
     * The attribute hdvab of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHdvab() {
        return hdvab;
    }
    /**
     * The attribute hdvab of Controllo_clinico. It is of type Boolean.
     */
    public void setHdvab(Boolean hdvab) {
        this.hdvab = hdvab;
    }

    /**
     * The attribute hdvab_igg of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHdvab_igg() {
        return hdvab_igg;
    }
    /**
     * The attribute hdvab_igg of Controllo_clinico. It is of type Boolean.
     */
    public void setHdvab_igg(Boolean hdvab_igg) {
        this.hdvab_igg = hdvab_igg;
    }

    /**
     * The attribute hdvabigm of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getHdvabigm() {
        return hdvabigm;
    }
    /**
     * The attribute hdvabigm of Controllo_clinico. It is of type Boolean.
     */
    public void setHdvabigm(Boolean hdvabigm) {
        this.hdvabigm = hdvabigm;
    }

    /**
     * The attribute hdvabtotali of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getHdvabtotali() {
        return hdvabtotali;
    }
    /**
     * The attribute hdvabtotali of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setHdvabtotali(String hdvabtotali) {
        this.hdvabtotali = hdvabtotali;
    }

    /**
     * The attribute interruzioni of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getInterruzioni() {
        return interruzioni;
    }
    /**
     * The attribute interruzioni of Controllo_clinico. It is of type Boolean.
     */
    public void setInterruzioni(Boolean interruzioni) {
        this.interruzioni = interruzioni;
    }

    /**
     * The attribute mdw of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getMdw() {
        return mdw;
    }
    /**
     * The attribute mdw of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setMdw(String mdw) {
        this.mdw = mdw;
    }

    /**
     * The attribute metodica_vitamina_D_2 of Controllo_clinico. It is of type String. Domain: CLIA (ChemiLuminescenza) OR RIA (RadioImmunologico) OR ECLIA (ElettroChemioLuminescenza) OR ELISA (Colorimetrico) OR CMIA (ChemiLuminescentMicroParticles: ARCHITET/ IDS-iSYS) OR EIA (Test Immuno Enzimatico) OR HPLC (High Performance Liquid Chromatography) OR LC-Ms/Ms (Cromatografia Liquida con Spettrometria di Massa) OR Non Disponibile OR Altro (specificare).}Max length: 255.
     */
    public String getMetodica_vitamina_D_2() {
        return metodica_vitamina_D_2;
    }
    /**
     * The attribute metodica_vitamina_D_2 of Controllo_clinico. It is of type String. Domain: CLIA (ChemiLuminescenza) OR RIA (RadioImmunologico) OR ECLIA (ElettroChemioLuminescenza) OR ELISA (Colorimetrico) OR CMIA (ChemiLuminescentMicroParticles: ARCHITET/ IDS-iSYS) OR EIA (Test Immuno Enzimatico) OR HPLC (High Performance Liquid Chromatography) OR LC-Ms/Ms (Cromatografia Liquida con Spettrometria di Massa) OR Non Disponibile OR Altro (specificare).}Max length: 255.
     */
    public void setMetodica_vitamina_D_2(String metodica_vitamina_D_2) {
        this.metodica_vitamina_D_2 = metodica_vitamina_D_2;
    }

    /**
     * The attribute monociti of Controllo_clinico. It is of type Int.
     */
    public Integer getMonociti() {
        return monociti;
    }
    /**
     * The attribute monociti of Controllo_clinico. It is of type Int.
     */
    public void setMonociti(Integer monociti) {
        this.monociti = monociti;
    }

    /**
     * The attribute non_trepon of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getNon_trepon() {
        return non_trepon;
    }
    /**
     * The attribute non_trepon of Controllo_clinico. It is of type Boolean.
     */
    public void setNon_trepon(Boolean non_trepon) {
        this.non_trepon = non_trepon;
    }

    /**
     * The attribute nr_neutrofili of Controllo_clinico. It is of type Int.
     */
    public Integer getNr_neutrofili() {
        return nr_neutrofili;
    }
    /**
     * The attribute nr_neutrofili of Controllo_clinico. It is of type Int.
     */
    public void setNr_neutrofili(Integer nr_neutrofili) {
        this.nr_neutrofili = nr_neutrofili;
    }

    /**
     * The attribute omissione of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getOmissione() {
        return omissione;
    }
    /**
     * The attribute omissione of Controllo_clinico. It is of type Boolean.
     */
    public void setOmissione(Boolean omissione) {
        this.omissione = omissione;
    }

    /**
     * The attribute pa_max of Controllo_clinico. It is of type Int.
     */
    public Integer getPa_max() {
        return pa_max;
    }
    /**
     * The attribute pa_max of Controllo_clinico. It is of type Int.
     */
    public void setPa_max(Integer pa_max) {
        this.pa_max = pa_max;
    }

    /**
     * The attribute pa_min of Controllo_clinico. It is of type Int.
     */
    public Integer getPa_min() {
        return pa_min;
    }
    /**
     * The attribute pa_min of Controllo_clinico. It is of type Int.
     */
    public void setPa_min(Integer pa_min) {
        this.pa_min = pa_min;
    }

    /**
     * The attribute paziente of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico codice_interno. Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico codice_interno. Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute peso of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getPeso() {
        return peso;
    }
    /**
     * The attribute peso of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * The attribute piastrine of Controllo_clinico. It is of type Int.
     */
    public Integer getPiastrine() {
        return piastrine;
    }
    /**
     * The attribute piastrine of Controllo_clinico. It is of type Int.
     */
    public void setPiastrine(Integer piastrine) {
        this.piastrine = piastrine;
    }

    /**
     * The attribute proteinuria of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getProteinuria() {
        return proteinuria;
    }
    /**
     * The attribute proteinuria of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setProteinuria(String proteinuria) {
        this.proteinuria = proteinuria;
    }

    /**
     * The attribute questionario_str of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getQuestionario_str() {
        return questionario_str;
    }
    /**
     * The attribute questionario_str of Controllo_clinico. It is of type Boolean.
     */
    public void setQuestionario_str(Boolean questionario_str) {
        this.questionario_str = questionario_str;
    }

    /**
     * The attribute sesso_ok of Controllo_clinico. It is of type String. Expression: 'if(
	!isNull(sesso_i),sesso_i,
	sesso_h
)'.Cannot be null.
     */
    public String getSesso_ok() {
        return sesso_ok;
    }
    /**
     * The attribute sesso_ok of Controllo_clinico. It is of type String. Expression: 'if(
	!isNull(sesso_i),sesso_i,
	sesso_h
)'.Cannot be null.
     */
    public void setSesso_ok(String sesso_ok) {
        this.sesso_ok = sesso_ok;
    }

    /**
     * The attribute superalcolici of Controllo_clinico. It is of type Int.
     */
    public Integer getSuperalcolici() {
        return superalcolici;
    }
    /**
     * The attribute superalcolici of Controllo_clinico. It is of type Int.
     */
    public void setSuperalcolici(Integer superalcolici) {
        this.superalcolici = superalcolici;
    }

    /**
     * The attribute tossicodip_attivo of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getTossicodip_attivo() {
        return tossicodip_attivo;
    }
    /**
     * The attribute tossicodip_attivo of Controllo_clinico. It is of type Boolean.
     */
    public void setTossicodip_attivo(Boolean tossicodip_attivo) {
        this.tossicodip_attivo = tossicodip_attivo;
    }

    /**
     * The attribute toxoigg of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getToxoigg() {
        return toxoigg;
    }
    /**
     * The attribute toxoigg of Controllo_clinico. It is of type Boolean.
     */
    public void setToxoigg(Boolean toxoigg) {
        this.toxoigg = toxoigg;
    }

    /**
     * The attribute trepon of Controllo_clinico. It is of type Boolean.
     */
    public Boolean getTrepon() {
        return trepon;
    }
    /**
     * The attribute trepon of Controllo_clinico. It is of type Boolean.
     */
    public void setTrepon(Boolean trepon) {
        this.trepon = trepon;
    }

    /**
     * The attribute trigliceridi of Controllo_clinico. It is of type Int.
     */
    public Integer getTrigliceridi() {
        return trigliceridi;
    }
    /**
     * The attribute trigliceridi of Controllo_clinico. It is of type Int.
     */
    public void setTrigliceridi(Integer trigliceridi) {
        this.trigliceridi = trigliceridi;
    }

    /**
     * The attribute unita_vitamina_D of Controllo_clinico. It is of type String. Domain: ng/mL OR nmol/L OR pg/mL.}Max length: 255.
     */
    public String getUnita_vitamina_D() {
        return unita_vitamina_D;
    }
    /**
     * The attribute unita_vitamina_D of Controllo_clinico. It is of type String. Domain: ng/mL OR nmol/L OR pg/mL.}Max length: 255.
     */
    public void setUnita_vitamina_D(String unita_vitamina_D) {
        this.unita_vitamina_D = unita_vitamina_D;
    }

    /**
     * The attribute vas of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getVas() {
        return vas;
    }
    /**
     * The attribute vas of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setVas(String vas) {
        this.vas = vas;
    }

    /**
     * The attribute vas_globale of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getVas_globale() {
        return vas_globale;
    }
    /**
     * The attribute vas_globale of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setVas_globale(String vas_globale) {
        this.vas_globale = vas_globale;
    }

    /**
     * The attribute vino of Controllo_clinico. It is of type Int.
     */
    public Integer getVino() {
        return vino;
    }
    /**
     * The attribute vino of Controllo_clinico. It is of type Int.
     */
    public void setVino(Integer vino) {
        this.vino = vino;
    }

    /**
     * The attribute vitamina_D of Controllo_clinico. It is of type Real @realFormat.
     */
    public String getVitamina_D() {
        return vitamina_D;
    }
    /**
     * The attribute vitamina_D of Controllo_clinico. It is of type Real @realFormat.
     */
    public void setVitamina_D(String vitamina_D) {
        this.vitamina_D = vitamina_D;
    }

    /**
     * The associated object for the role Paziente_controllo_clinico.
     */
    public CliPazienteDTO getPaziente_controllo_clinico() {
        return Paziente_controllo_clinico;
    }
    /**
     * The associated object for the role Paziente_controllo_clinico.
     */
    public void setPaziente_controllo_clinico(CliPazienteDTO Paziente_controllo_clinico) {
        this.Paziente_controllo_clinico = Paziente_controllo_clinico;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (ALT != null) {
            joiner.add("ALT: " + GraphQLRequestSerializer.getEntry(ALT));
        }
        if (AST != null) {
            joiner.add("AST: " + GraphQLRequestSerializer.getEntry(AST));
        }
        if (HDL != null) {
            joiner.add("HDL: " + GraphQLRequestSerializer.getEntry(HDL));
        }
        if (LDL != null) {
            joiner.add("LDL: " + GraphQLRequestSerializer.getEntry(LDL));
        }
        if (MCV != null) {
            joiner.add("MCV: " + GraphQLRequestSerializer.getEntry(MCV));
        }
        if (PCHE != null) {
            joiner.add("PCHE: " + GraphQLRequestSerializer.getEntry(PCHE));
        }
        if (PPD != null) {
            joiner.add("PPD: " + GraphQLRequestSerializer.getEntry(PPD));
        }
        if (PT_INR != null) {
            joiner.add("PT_INR: " + GraphQLRequestSerializer.getEntry(PT_INR));
        }
        if (PT_percentuale != null) {
            joiner.add("PT_percentuale: " + GraphQLRequestSerializer.getEntry(PT_percentuale));
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
        if (acido_lattico != null) {
            joiner.add("acido_lattico: " + GraphQLRequestSerializer.getEntry(acido_lattico));
        }
        if (albumina != null) {
            joiner.add("albumina: " + GraphQLRequestSerializer.getEntry(albumina));
        }
        if (alfafetoproteina != null) {
            joiner.add("alfafetoproteina: " + GraphQLRequestSerializer.getEntry(alfafetoproteina));
        }
        if (altra_metodica != null) {
            joiner.add("altra_metodica: " + GraphQLRequestSerializer.getEntry(altra_metodica));
        }
        if (altro_beve != null) {
            joiner.add("altro_beve: " + GraphQLRequestSerializer.getEntry(altro_beve));
        }
        if (azotemia != null) {
            joiner.add("azotemia: " + GraphQLRequestSerializer.getEntry(azotemia));
        }
        if (beve != null) {
            joiner.add("beve: " + GraphQLRequestSerializer.getEntry(beve));
        }
        if (bilirubina_diretta != null) {
            joiner.add("bilirubina_diretta: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta));
        }
        if (bilirubina_totale != null) {
            joiner.add("bilirubina_totale: " + GraphQLRequestSerializer.getEntry(bilirubina_totale));
        }
        if (birra != null) {
            joiner.add("birra: " + GraphQLRequestSerializer.getEntry(birra));
        }
        if (calcio != null) {
            joiner.add("calcio: " + GraphQLRequestSerializer.getEntry(calcio));
        }
        if (campione != null) {
            joiner.add("campione: " + GraphQLRequestSerializer.getEntry(campione));
        }
        if (chemsex != null) {
            joiner.add("chemsex: " + GraphQLRequestSerializer.getEntry(chemsex));
        }
        if (circonferenza_vita != null) {
            joiner.add("circonferenza_vita: " + GraphQLRequestSerializer.getEntry(circonferenza_vita));
        }
        if (cmvigg != null) {
            joiner.add("cmvigg: " + GraphQLRequestSerializer.getEntry(cmvigg));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (colesterolo != null) {
            joiner.add("colesterolo: " + GraphQLRequestSerializer.getEntry(colesterolo));
        }
        if (cov_igg != null) {
            joiner.add("cov_igg: " + GraphQLRequestSerializer.getEntry(cov_igg));
        }
        if (cov_igg_titolo != null) {
            joiner.add("cov_igg_titolo: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo));
        }
        if (cov_igm != null) {
            joiner.add("cov_igm: " + GraphQLRequestSerializer.getEntry(cov_igm));
        }
        if (cov_igm_titolo != null) {
            joiner.add("cov_igm_titolo: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo));
        }
        if (cov_rna != null) {
            joiner.add("cov_rna: " + GraphQLRequestSerializer.getEntry(cov_rna));
        }
        if (cov_test != null) {
            joiner.add("cov_test: " + GraphQLRequestSerializer.getEntry(cov_test));
        }
        if (cov_vax != null) {
            joiner.add("cov_vax: " + GraphQLRequestSerializer.getEntry(cov_vax));
        }
        if (creatinina != null) {
            joiner.add("creatinina: " + GraphQLRequestSerializer.getEntry(creatinina));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (data_campione != null) {
            joiner.add("data_campione: " + GraphQLRequestSerializer.getEntry(data_campione));
        }
        if (data_presunta_parto != null) {
            joiner.add("data_presunta_parto: " + GraphQLRequestSerializer.getEntry(data_presunta_parto));
        }
        if (data_questionario != null) {
            joiner.add("data_questionario: " + GraphQLRequestSerializer.getEntry(data_questionario));
        }
        if (dosi_omesse != null) {
            joiner.add("dosi_omesse: " + GraphQLRequestSerializer.getEntry(dosi_omesse));
        }
        if (emoglobina != null) {
            joiner.add("emoglobina: " + GraphQLRequestSerializer.getEntry(emoglobina));
        }
        if (emoglobina_glicata != null) {
            joiner.add("emoglobina_glicata: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata));
        }
        if (followup_questionario != null) {
            joiner.add("followup_questionario: " + GraphQLRequestSerializer.getEntry(followup_questionario));
        }
        if (fosfatasi_alcalina != null) {
            joiner.add("fosfatasi_alcalina: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina));
        }
        if (fosforo != null) {
            joiner.add("fosforo: " + GraphQLRequestSerializer.getEntry(fosforo));
        }
        if (frequenza != null) {
            joiner.add("frequenza: " + GraphQLRequestSerializer.getEntry(frequenza));
        }
        if (fumatore_attivo != null) {
            joiner.add("fumatore_attivo: " + GraphQLRequestSerializer.getEntry(fumatore_attivo));
        }
        if (gamma_gt != null) {
            joiner.add("gamma_gt: " + GraphQLRequestSerializer.getEntry(gamma_gt));
        }
        if (glicemia != null) {
            joiner.add("glicemia: " + GraphQLRequestSerializer.getEntry(glicemia));
        }
        if (globuli_bianchi != null) {
            joiner.add("globuli_bianchi: " + GraphQLRequestSerializer.getEntry(globuli_bianchi));
        }
        if (gravidanza != null) {
            joiner.add("gravidanza: " + GraphQLRequestSerializer.getEntry(gravidanza));
        }
        if (havabtotali != null) {
            joiner.add("havabtotali: " + GraphQLRequestSerializer.getEntry(havabtotali));
        }
        if (havigm != null) {
            joiner.add("havigm: " + GraphQLRequestSerializer.getEntry(havigm));
        }
        if (hbcab != null) {
            joiner.add("hbcab: " + GraphQLRequestSerializer.getEntry(hbcab));
        }
        if (hbcigm != null) {
            joiner.add("hbcigm: " + GraphQLRequestSerializer.getEntry(hbcigm));
        }
        if (hbeab != null) {
            joiner.add("hbeab: " + GraphQLRequestSerializer.getEntry(hbeab));
        }
        if (hbeag != null) {
            joiner.add("hbeag: " + GraphQLRequestSerializer.getEntry(hbeag));
        }
        if (hbsab != null) {
            joiner.add("hbsab: " + GraphQLRequestSerializer.getEntry(hbsab));
        }
        if (hbsab_totali != null) {
            joiner.add("hbsab_totali: " + GraphQLRequestSerializer.getEntry(hbsab_totali));
        }
        if (hbsag != null) {
            joiner.add("hbsag: " + GraphQLRequestSerializer.getEntry(hbsag));
        }
        if (hbsag_totali != null) {
            joiner.add("hbsag_totali: " + GraphQLRequestSerializer.getEntry(hbsag_totali));
        }
        if (hcvab != null) {
            joiner.add("hcvab: " + GraphQLRequestSerializer.getEntry(hcvab));
        }
        if (hcvag != null) {
            joiner.add("hcvag: " + GraphQLRequestSerializer.getEntry(hcvag));
        }
        if (hdvab != null) {
            joiner.add("hdvab: " + GraphQLRequestSerializer.getEntry(hdvab));
        }
        if (hdvab_igg != null) {
            joiner.add("hdvab_igg: " + GraphQLRequestSerializer.getEntry(hdvab_igg));
        }
        if (hdvabigm != null) {
            joiner.add("hdvabigm: " + GraphQLRequestSerializer.getEntry(hdvabigm));
        }
        if (hdvabtotali != null) {
            joiner.add("hdvabtotali: " + GraphQLRequestSerializer.getEntry(hdvabtotali));
        }
        if (interruzioni != null) {
            joiner.add("interruzioni: " + GraphQLRequestSerializer.getEntry(interruzioni));
        }
        if (mdw != null) {
            joiner.add("mdw: " + GraphQLRequestSerializer.getEntry(mdw));
        }
        if (metodica_vitamina_D_2 != null) {
            joiner.add("metodica_vitamina_D_2: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2));
        }
        if (monociti != null) {
            joiner.add("monociti: " + GraphQLRequestSerializer.getEntry(monociti));
        }
        if (non_trepon != null) {
            joiner.add("non_trepon: " + GraphQLRequestSerializer.getEntry(non_trepon));
        }
        if (nr_neutrofili != null) {
            joiner.add("nr_neutrofili: " + GraphQLRequestSerializer.getEntry(nr_neutrofili));
        }
        if (omissione != null) {
            joiner.add("omissione: " + GraphQLRequestSerializer.getEntry(omissione));
        }
        if (pa_max != null) {
            joiner.add("pa_max: " + GraphQLRequestSerializer.getEntry(pa_max));
        }
        if (pa_min != null) {
            joiner.add("pa_min: " + GraphQLRequestSerializer.getEntry(pa_min));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        if (peso != null) {
            joiner.add("peso: " + GraphQLRequestSerializer.getEntry(peso));
        }
        if (piastrine != null) {
            joiner.add("piastrine: " + GraphQLRequestSerializer.getEntry(piastrine));
        }
        if (proteinuria != null) {
            joiner.add("proteinuria: " + GraphQLRequestSerializer.getEntry(proteinuria));
        }
        if (questionario_str != null) {
            joiner.add("questionario_str: " + GraphQLRequestSerializer.getEntry(questionario_str));
        }
        if (sesso_ok != null) {
            joiner.add("sesso_ok: " + GraphQLRequestSerializer.getEntry(sesso_ok));
        }
        if (superalcolici != null) {
            joiner.add("superalcolici: " + GraphQLRequestSerializer.getEntry(superalcolici));
        }
        if (tossicodip_attivo != null) {
            joiner.add("tossicodip_attivo: " + GraphQLRequestSerializer.getEntry(tossicodip_attivo));
        }
        if (toxoigg != null) {
            joiner.add("toxoigg: " + GraphQLRequestSerializer.getEntry(toxoigg));
        }
        if (trepon != null) {
            joiner.add("trepon: " + GraphQLRequestSerializer.getEntry(trepon));
        }
        if (trigliceridi != null) {
            joiner.add("trigliceridi: " + GraphQLRequestSerializer.getEntry(trigliceridi));
        }
        if (unita_vitamina_D != null) {
            joiner.add("unita_vitamina_D: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D));
        }
        if (vas != null) {
            joiner.add("vas: " + GraphQLRequestSerializer.getEntry(vas));
        }
        if (vas_globale != null) {
            joiner.add("vas_globale: " + GraphQLRequestSerializer.getEntry(vas_globale));
        }
        if (vino != null) {
            joiner.add("vino: " + GraphQLRequestSerializer.getEntry(vino));
        }
        if (vitamina_D != null) {
            joiner.add("vitamina_D: " + GraphQLRequestSerializer.getEntry(vitamina_D));
        }
        if (Paziente_controllo_clinico != null) {
            joiner.add("Paziente_controllo_clinico: " + GraphQLRequestSerializer.getEntry(Paziente_controllo_clinico));
        }
        return joiner.toString();
    }

    public static CliControllo_clinicoDTO.Builder builder() {
        return new CliControllo_clinicoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private Integer ALT;
        private Integer AST;
        private Integer HDL;
        private Integer LDL;
        private String MCV;
        private String PCHE;
        private Boolean PPD;
        private String PT_INR;
        private String PT_percentuale;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private String acido_lattico;
        private String albumina;
        private String alfafetoproteina;
        private String altra_metodica;
        private String altro_beve;
        private Integer azotemia;
        private Boolean beve;
        private String bilirubina_diretta;
        private String bilirubina_totale;
        private Integer birra;
        private String calcio;
        private Boolean campione;
        private Boolean chemsex;
        private Integer circonferenza_vita;
        private Boolean cmvigg;
        private String codice_centro;
        private Integer colesterolo;
        private Boolean cov_igg;
        private String cov_igg_titolo;
        private Boolean cov_igm;
        private String cov_igm_titolo;
        private Boolean cov_rna;
        private String cov_test;
        private Boolean cov_vax;
        private String creatinina;
        private String data;
        private String data_campione;
        private String data_presunta_parto;
        private String data_questionario;
        private Integer dosi_omesse;
        private String emoglobina;
        private String emoglobina_glicata;
        private String followup_questionario;
        private Integer fosfatasi_alcalina;
        private String fosforo;
        private String frequenza;
        private Boolean fumatore_attivo;
        private Integer gamma_gt;
        private Integer glicemia;
        private Integer globuli_bianchi;
        private Boolean gravidanza;
        private Boolean havabtotali;
        private Boolean havigm;
        private Boolean hbcab;
        private Boolean hbcigm;
        private Boolean hbeab;
        private Boolean hbeag;
        private Boolean hbsab;
        private String hbsab_totali;
        private Boolean hbsag;
        private String hbsag_totali;
        private Boolean hcvab;
        private Boolean hcvag;
        private Boolean hdvab;
        private Boolean hdvab_igg;
        private Boolean hdvabigm;
        private String hdvabtotali;
        private Boolean interruzioni;
        private String mdw;
        private String metodica_vitamina_D_2;
        private Integer monociti;
        private Boolean non_trepon;
        private Integer nr_neutrofili;
        private Boolean omissione;
        private Integer pa_max;
        private Integer pa_min;
        private String paziente;
        private String peso;
        private Integer piastrine;
        private String proteinuria;
        private Boolean questionario_str;
        private String sesso_ok;
        private Integer superalcolici;
        private Boolean tossicodip_attivo;
        private Boolean toxoigg;
        private Boolean trepon;
        private Integer trigliceridi;
        private String unita_vitamina_D;
        private String vas;
        private String vas_globale;
        private Integer vino;
        private String vitamina_D;
        private CliPazienteDTO Paziente_controllo_clinico;

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
         * The attribute ALT of Controllo_clinico. It is of type Int.
         */
        public Builder setALT(Integer ALT) {
            this.ALT = ALT;
            return this;
        }

        /**
         * The attribute AST of Controllo_clinico. It is of type Int.
         */
        public Builder setAST(Integer AST) {
            this.AST = AST;
            return this;
        }

        /**
         * The attribute HDL of Controllo_clinico. It is of type Int.
         */
        public Builder setHDL(Integer HDL) {
            this.HDL = HDL;
            return this;
        }

        /**
         * The attribute LDL of Controllo_clinico. It is of type Int.
         */
        public Builder setLDL(Integer LDL) {
            this.LDL = LDL;
            return this;
        }

        /**
         * The attribute MCV of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setMCV(String MCV) {
            this.MCV = MCV;
            return this;
        }

        /**
         * The attribute PCHE of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setPCHE(String PCHE) {
            this.PCHE = PCHE;
            return this;
        }

        /**
         * The attribute PPD of Controllo_clinico. It is of type Boolean.
         */
        public Builder setPPD(Boolean PPD) {
            this.PPD = PPD;
            return this;
        }

        /**
         * The attribute PT_INR of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setPT_INR(String PT_INR) {
            this.PT_INR = PT_INR;
            return this;
        }

        /**
         * The attribute PT_percentuale of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setPT_percentuale(String PT_percentuale) {
            this.PT_percentuale = PT_percentuale;
            return this;
        }

        /**
         * The attribute _createdby of Controllo_clinico. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Controllo_clinico. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Controllo_clinico. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Controllo_clinico. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Controllo_clinico. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute acido_lattico of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setAcido_lattico(String acido_lattico) {
            this.acido_lattico = acido_lattico;
            return this;
        }

        /**
         * The attribute albumina of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setAlbumina(String albumina) {
            this.albumina = albumina;
            return this;
        }

        /**
         * The attribute alfafetoproteina of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setAlfafetoproteina(String alfafetoproteina) {
            this.alfafetoproteina = alfafetoproteina;
            return this;
        }

        /**
         * The attribute altra_metodica of Controllo_clinico. It is of type String. Max length: 255.
         */
        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        /**
         * The attribute altro_beve of Controllo_clinico. It is of type String. Max length: 255.
         */
        public Builder setAltro_beve(String altro_beve) {
            this.altro_beve = altro_beve;
            return this;
        }

        /**
         * The attribute azotemia of Controllo_clinico. It is of type Int.
         */
        public Builder setAzotemia(Integer azotemia) {
            this.azotemia = azotemia;
            return this;
        }

        /**
         * The attribute beve of Controllo_clinico. It is of type Boolean.
         */
        public Builder setBeve(Boolean beve) {
            this.beve = beve;
            return this;
        }

        /**
         * The attribute bilirubina_diretta of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setBilirubina_diretta(String bilirubina_diretta) {
            this.bilirubina_diretta = bilirubina_diretta;
            return this;
        }

        /**
         * The attribute bilirubina_totale of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setBilirubina_totale(String bilirubina_totale) {
            this.bilirubina_totale = bilirubina_totale;
            return this;
        }

        /**
         * The attribute birra of Controllo_clinico. It is of type Int.
         */
        public Builder setBirra(Integer birra) {
            this.birra = birra;
            return this;
        }

        /**
         * The attribute calcio of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setCalcio(String calcio) {
            this.calcio = calcio;
            return this;
        }

        /**
         * The attribute campione of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCampione(Boolean campione) {
            this.campione = campione;
            return this;
        }

        /**
         * The attribute chemsex of Controllo_clinico. It is of type Boolean.
         */
        public Builder setChemsex(Boolean chemsex) {
            this.chemsex = chemsex;
            return this;
        }

        /**
         * The attribute circonferenza_vita of Controllo_clinico. It is of type Int.
         */
        public Builder setCirconferenza_vita(Integer circonferenza_vita) {
            this.circonferenza_vita = circonferenza_vita;
            return this;
        }

        /**
         * The attribute cmvigg of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCmvigg(Boolean cmvigg) {
            this.cmvigg = cmvigg;
            return this;
        }

        /**
         * The attribute codice_centro of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute colesterolo of Controllo_clinico. It is of type Int.
         */
        public Builder setColesterolo(Integer colesterolo) {
            this.colesterolo = colesterolo;
            return this;
        }

        /**
         * The attribute cov_igg of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCov_igg(Boolean cov_igg) {
            this.cov_igg = cov_igg;
            return this;
        }

        /**
         * The attribute cov_igg_titolo of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setCov_igg_titolo(String cov_igg_titolo) {
            this.cov_igg_titolo = cov_igg_titolo;
            return this;
        }

        /**
         * The attribute cov_igm of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCov_igm(Boolean cov_igm) {
            this.cov_igm = cov_igm;
            return this;
        }

        /**
         * The attribute cov_igm_titolo of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setCov_igm_titolo(String cov_igm_titolo) {
            this.cov_igm_titolo = cov_igm_titolo;
            return this;
        }

        /**
         * The attribute cov_rna of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCov_rna(Boolean cov_rna) {
            this.cov_rna = cov_rna;
            return this;
        }

        /**
         * The attribute cov_test of Controllo_clinico. It is of type String. Domain: Nasofaringeo OR BAL OR Altro.}Max length: 255.
         */
        public Builder setCov_test(String cov_test) {
            this.cov_test = cov_test;
            return this;
        }

        /**
         * The attribute cov_vax of Controllo_clinico. It is of type Boolean.
         */
        public Builder setCov_vax(Boolean cov_vax) {
            this.cov_vax = cov_vax;
            return this;
        }

        /**
         * The attribute creatinina of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setCreatinina(String creatinina) {
            this.creatinina = creatinina;
            return this;
        }

        /**
         * The attribute data of Controllo_clinico. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute data_campione of Controllo_clinico. It is of type Date @dateFormat.
         */
        public Builder setData_campione(String data_campione) {
            this.data_campione = data_campione;
            return this;
        }

        /**
         * The attribute data_presunta_parto of Controllo_clinico. It is of type Date @dateFormat.
         */
        public Builder setData_presunta_parto(String data_presunta_parto) {
            this.data_presunta_parto = data_presunta_parto;
            return this;
        }

        /**
         * The attribute data_questionario of Controllo_clinico. It is of type Date @dateFormat.
         */
        public Builder setData_questionario(String data_questionario) {
            this.data_questionario = data_questionario;
            return this;
        }

        /**
         * The attribute dosi_omesse of Controllo_clinico. It is of type Int.
         */
        public Builder setDosi_omesse(Integer dosi_omesse) {
            this.dosi_omesse = dosi_omesse;
            return this;
        }

        /**
         * The attribute emoglobina of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setEmoglobina(String emoglobina) {
            this.emoglobina = emoglobina;
            return this;
        }

        /**
         * The attribute emoglobina_glicata of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setEmoglobina_glicata(String emoglobina_glicata) {
            this.emoglobina_glicata = emoglobina_glicata;
            return this;
        }

        /**
         * The attribute followup_questionario of Controllo_clinico. It is of type String. Domain: Basale OR 3 mesi OR 6 mesi.}Max length: 255.
         */
        public Builder setFollowup_questionario(String followup_questionario) {
            this.followup_questionario = followup_questionario;
            return this;
        }

        /**
         * The attribute fosfatasi_alcalina of Controllo_clinico. It is of type Int.
         */
        public Builder setFosfatasi_alcalina(Integer fosfatasi_alcalina) {
            this.fosfatasi_alcalina = fosfatasi_alcalina;
            return this;
        }

        /**
         * The attribute fosforo of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setFosforo(String fosforo) {
            this.fosforo = fosforo;
            return this;
        }

        /**
         * The attribute frequenza of Controllo_clinico. It is of type String. Domain: giornalmente OR occasionalmente.}Max length: 255.
         */
        public Builder setFrequenza(String frequenza) {
            this.frequenza = frequenza;
            return this;
        }

        /**
         * The attribute fumatore_attivo of Controllo_clinico. It is of type Boolean.
         */
        public Builder setFumatore_attivo(Boolean fumatore_attivo) {
            this.fumatore_attivo = fumatore_attivo;
            return this;
        }

        /**
         * The attribute gamma_gt of Controllo_clinico. It is of type Int.
         */
        public Builder setGamma_gt(Integer gamma_gt) {
            this.gamma_gt = gamma_gt;
            return this;
        }

        /**
         * The attribute glicemia of Controllo_clinico. It is of type Int.
         */
        public Builder setGlicemia(Integer glicemia) {
            this.glicemia = glicemia;
            return this;
        }

        /**
         * The attribute globuli_bianchi of Controllo_clinico. It is of type Int.
         */
        public Builder setGlobuli_bianchi(Integer globuli_bianchi) {
            this.globuli_bianchi = globuli_bianchi;
            return this;
        }

        /**
         * The attribute gravidanza of Controllo_clinico. It is of type Boolean.
         */
        public Builder setGravidanza(Boolean gravidanza) {
            this.gravidanza = gravidanza;
            return this;
        }

        /**
         * The attribute havabtotali of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHavabtotali(Boolean havabtotali) {
            this.havabtotali = havabtotali;
            return this;
        }

        /**
         * The attribute havigm of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHavigm(Boolean havigm) {
            this.havigm = havigm;
            return this;
        }

        /**
         * The attribute hbcab of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbcab(Boolean hbcab) {
            this.hbcab = hbcab;
            return this;
        }

        /**
         * The attribute hbcigm of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbcigm(Boolean hbcigm) {
            this.hbcigm = hbcigm;
            return this;
        }

        /**
         * The attribute hbeab of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbeab(Boolean hbeab) {
            this.hbeab = hbeab;
            return this;
        }

        /**
         * The attribute hbeag of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbeag(Boolean hbeag) {
            this.hbeag = hbeag;
            return this;
        }

        /**
         * The attribute hbsab of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbsab(Boolean hbsab) {
            this.hbsab = hbsab;
            return this;
        }

        /**
         * The attribute hbsab_totali of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setHbsab_totali(String hbsab_totali) {
            this.hbsab_totali = hbsab_totali;
            return this;
        }

        /**
         * The attribute hbsag of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHbsag(Boolean hbsag) {
            this.hbsag = hbsag;
            return this;
        }

        /**
         * The attribute hbsag_totali of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setHbsag_totali(String hbsag_totali) {
            this.hbsag_totali = hbsag_totali;
            return this;
        }

        /**
         * The attribute hcvab of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHcvab(Boolean hcvab) {
            this.hcvab = hcvab;
            return this;
        }

        /**
         * The attribute hcvag of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHcvag(Boolean hcvag) {
            this.hcvag = hcvag;
            return this;
        }

        /**
         * The attribute hdvab of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHdvab(Boolean hdvab) {
            this.hdvab = hdvab;
            return this;
        }

        /**
         * The attribute hdvab_igg of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHdvab_igg(Boolean hdvab_igg) {
            this.hdvab_igg = hdvab_igg;
            return this;
        }

        /**
         * The attribute hdvabigm of Controllo_clinico. It is of type Boolean.
         */
        public Builder setHdvabigm(Boolean hdvabigm) {
            this.hdvabigm = hdvabigm;
            return this;
        }

        /**
         * The attribute hdvabtotali of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setHdvabtotali(String hdvabtotali) {
            this.hdvabtotali = hdvabtotali;
            return this;
        }

        /**
         * The attribute interruzioni of Controllo_clinico. It is of type Boolean.
         */
        public Builder setInterruzioni(Boolean interruzioni) {
            this.interruzioni = interruzioni;
            return this;
        }

        /**
         * The attribute mdw of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setMdw(String mdw) {
            this.mdw = mdw;
            return this;
        }

        /**
         * The attribute metodica_vitamina_D_2 of Controllo_clinico. It is of type String. Domain: CLIA (ChemiLuminescenza) OR RIA (RadioImmunologico) OR ECLIA (ElettroChemioLuminescenza) OR ELISA (Colorimetrico) OR CMIA (ChemiLuminescentMicroParticles: ARCHITET/ IDS-iSYS) OR EIA (Test Immuno Enzimatico) OR HPLC (High Performance Liquid Chromatography) OR LC-Ms/Ms (Cromatografia Liquida con Spettrometria di Massa) OR Non Disponibile OR Altro (specificare).}Max length: 255.
         */
        public Builder setMetodica_vitamina_D_2(String metodica_vitamina_D_2) {
            this.metodica_vitamina_D_2 = metodica_vitamina_D_2;
            return this;
        }

        /**
         * The attribute monociti of Controllo_clinico. It is of type Int.
         */
        public Builder setMonociti(Integer monociti) {
            this.monociti = monociti;
            return this;
        }

        /**
         * The attribute non_trepon of Controllo_clinico. It is of type Boolean.
         */
        public Builder setNon_trepon(Boolean non_trepon) {
            this.non_trepon = non_trepon;
            return this;
        }

        /**
         * The attribute nr_neutrofili of Controllo_clinico. It is of type Int.
         */
        public Builder setNr_neutrofili(Integer nr_neutrofili) {
            this.nr_neutrofili = nr_neutrofili;
            return this;
        }

        /**
         * The attribute omissione of Controllo_clinico. It is of type Boolean.
         */
        public Builder setOmissione(Boolean omissione) {
            this.omissione = omissione;
            return this;
        }

        /**
         * The attribute pa_max of Controllo_clinico. It is of type Int.
         */
        public Builder setPa_max(Integer pa_max) {
            this.pa_max = pa_max;
            return this;
        }

        /**
         * The attribute pa_min of Controllo_clinico. It is of type Int.
         */
        public Builder setPa_min(Integer pa_min) {
            this.pa_min = pa_min;
            return this;
        }

        /**
         * The attribute paziente of Controllo_clinico. It is of type String. Path: Paziente_controllo_clinico codice_interno. Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute peso of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setPeso(String peso) {
            this.peso = peso;
            return this;
        }

        /**
         * The attribute piastrine of Controllo_clinico. It is of type Int.
         */
        public Builder setPiastrine(Integer piastrine) {
            this.piastrine = piastrine;
            return this;
        }

        /**
         * The attribute proteinuria of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setProteinuria(String proteinuria) {
            this.proteinuria = proteinuria;
            return this;
        }

        /**
         * The attribute questionario_str of Controllo_clinico. It is of type Boolean.
         */
        public Builder setQuestionario_str(Boolean questionario_str) {
            this.questionario_str = questionario_str;
            return this;
        }

        /**
         * The attribute sesso_ok of Controllo_clinico. It is of type String. Expression: 'if(
	!isNull(sesso_i),sesso_i,
	sesso_h
)'.Cannot be null.
         */
        public Builder setSesso_ok(String sesso_ok) {
            this.sesso_ok = sesso_ok;
            return this;
        }

        /**
         * The attribute superalcolici of Controllo_clinico. It is of type Int.
         */
        public Builder setSuperalcolici(Integer superalcolici) {
            this.superalcolici = superalcolici;
            return this;
        }

        /**
         * The attribute tossicodip_attivo of Controllo_clinico. It is of type Boolean.
         */
        public Builder setTossicodip_attivo(Boolean tossicodip_attivo) {
            this.tossicodip_attivo = tossicodip_attivo;
            return this;
        }

        /**
         * The attribute toxoigg of Controllo_clinico. It is of type Boolean.
         */
        public Builder setToxoigg(Boolean toxoigg) {
            this.toxoigg = toxoigg;
            return this;
        }

        /**
         * The attribute trepon of Controllo_clinico. It is of type Boolean.
         */
        public Builder setTrepon(Boolean trepon) {
            this.trepon = trepon;
            return this;
        }

        /**
         * The attribute trigliceridi of Controllo_clinico. It is of type Int.
         */
        public Builder setTrigliceridi(Integer trigliceridi) {
            this.trigliceridi = trigliceridi;
            return this;
        }

        /**
         * The attribute unita_vitamina_D of Controllo_clinico. It is of type String. Domain: ng/mL OR nmol/L OR pg/mL.}Max length: 255.
         */
        public Builder setUnita_vitamina_D(String unita_vitamina_D) {
            this.unita_vitamina_D = unita_vitamina_D;
            return this;
        }

        /**
         * The attribute vas of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setVas(String vas) {
            this.vas = vas;
            return this;
        }

        /**
         * The attribute vas_globale of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setVas_globale(String vas_globale) {
            this.vas_globale = vas_globale;
            return this;
        }

        /**
         * The attribute vino of Controllo_clinico. It is of type Int.
         */
        public Builder setVino(Integer vino) {
            this.vino = vino;
            return this;
        }

        /**
         * The attribute vitamina_D of Controllo_clinico. It is of type Real @realFormat.
         */
        public Builder setVitamina_D(String vitamina_D) {
            this.vitamina_D = vitamina_D;
            return this;
        }

        /**
         * The associated object for the role Paziente_controllo_clinico.
         */
        public Builder setPaziente_controllo_clinico(CliPazienteDTO Paziente_controllo_clinico) {
            this.Paziente_controllo_clinico = Paziente_controllo_clinico;
            return this;
        }


        public CliControllo_clinicoDTO build() {
            CliControllo_clinicoDTO result = new CliControllo_clinicoDTO();
            result.set_clientId(this._clientId);
            result.setALT(this.ALT);
            result.setAST(this.AST);
            result.setHDL(this.HDL);
            result.setLDL(this.LDL);
            result.setMCV(this.MCV);
            result.setPCHE(this.PCHE);
            result.setPPD(this.PPD);
            result.setPT_INR(this.PT_INR);
            result.setPT_percentuale(this.PT_percentuale);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAcido_lattico(this.acido_lattico);
            result.setAlbumina(this.albumina);
            result.setAlfafetoproteina(this.alfafetoproteina);
            result.setAltra_metodica(this.altra_metodica);
            result.setAltro_beve(this.altro_beve);
            result.setAzotemia(this.azotemia);
            result.setBeve(this.beve);
            result.setBilirubina_diretta(this.bilirubina_diretta);
            result.setBilirubina_totale(this.bilirubina_totale);
            result.setBirra(this.birra);
            result.setCalcio(this.calcio);
            result.setCampione(this.campione);
            result.setChemsex(this.chemsex);
            result.setCirconferenza_vita(this.circonferenza_vita);
            result.setCmvigg(this.cmvigg);
            result.setCodice_centro(this.codice_centro);
            result.setColesterolo(this.colesterolo);
            result.setCov_igg(this.cov_igg);
            result.setCov_igg_titolo(this.cov_igg_titolo);
            result.setCov_igm(this.cov_igm);
            result.setCov_igm_titolo(this.cov_igm_titolo);
            result.setCov_rna(this.cov_rna);
            result.setCov_test(this.cov_test);
            result.setCov_vax(this.cov_vax);
            result.setCreatinina(this.creatinina);
            result.setData(this.data);
            result.setData_campione(this.data_campione);
            result.setData_presunta_parto(this.data_presunta_parto);
            result.setData_questionario(this.data_questionario);
            result.setDosi_omesse(this.dosi_omesse);
            result.setEmoglobina(this.emoglobina);
            result.setEmoglobina_glicata(this.emoglobina_glicata);
            result.setFollowup_questionario(this.followup_questionario);
            result.setFosfatasi_alcalina(this.fosfatasi_alcalina);
            result.setFosforo(this.fosforo);
            result.setFrequenza(this.frequenza);
            result.setFumatore_attivo(this.fumatore_attivo);
            result.setGamma_gt(this.gamma_gt);
            result.setGlicemia(this.glicemia);
            result.setGlobuli_bianchi(this.globuli_bianchi);
            result.setGravidanza(this.gravidanza);
            result.setHavabtotali(this.havabtotali);
            result.setHavigm(this.havigm);
            result.setHbcab(this.hbcab);
            result.setHbcigm(this.hbcigm);
            result.setHbeab(this.hbeab);
            result.setHbeag(this.hbeag);
            result.setHbsab(this.hbsab);
            result.setHbsab_totali(this.hbsab_totali);
            result.setHbsag(this.hbsag);
            result.setHbsag_totali(this.hbsag_totali);
            result.setHcvab(this.hcvab);
            result.setHcvag(this.hcvag);
            result.setHdvab(this.hdvab);
            result.setHdvab_igg(this.hdvab_igg);
            result.setHdvabigm(this.hdvabigm);
            result.setHdvabtotali(this.hdvabtotali);
            result.setInterruzioni(this.interruzioni);
            result.setMdw(this.mdw);
            result.setMetodica_vitamina_D_2(this.metodica_vitamina_D_2);
            result.setMonociti(this.monociti);
            result.setNon_trepon(this.non_trepon);
            result.setNr_neutrofili(this.nr_neutrofili);
            result.setOmissione(this.omissione);
            result.setPa_max(this.pa_max);
            result.setPa_min(this.pa_min);
            result.setPaziente(this.paziente);
            result.setPeso(this.peso);
            result.setPiastrine(this.piastrine);
            result.setProteinuria(this.proteinuria);
            result.setQuestionario_str(this.questionario_str);
            result.setSesso_ok(this.sesso_ok);
            result.setSuperalcolici(this.superalcolici);
            result.setTossicodip_attivo(this.tossicodip_attivo);
            result.setToxoigg(this.toxoigg);
            result.setTrepon(this.trepon);
            result.setTrigliceridi(this.trigliceridi);
            result.setUnita_vitamina_D(this.unita_vitamina_D);
            result.setVas(this.vas);
            result.setVas_globale(this.vas_globale);
            result.setVino(this.vino);
            result.setVitamina_D(this.vitamina_D);
            result.setPaziente_controllo_clinico(this.Paziente_controllo_clinico);
            return result;
        }

    }
}
