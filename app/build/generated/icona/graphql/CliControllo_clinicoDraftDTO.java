package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Controllo_clinico.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliControllo_clinicoDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
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
    private String peso;
    private Integer piastrine;
    private String proteinuria;
    private Boolean questionario_str;
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
    private CliSierologie_covidDraftRoleObjectsDTO sierologie_covid_;

    public CliControllo_clinicoDraftDTO() {
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

    public Integer getALT() {
        return ALT;
    }
    public void setALT(Integer ALT) {
        this.ALT = ALT;
    }

    public Integer getAST() {
        return AST;
    }
    public void setAST(Integer AST) {
        this.AST = AST;
    }

    public Integer getHDL() {
        return HDL;
    }
    public void setHDL(Integer HDL) {
        this.HDL = HDL;
    }

    public Integer getLDL() {
        return LDL;
    }
    public void setLDL(Integer LDL) {
        this.LDL = LDL;
    }

    public String getMCV() {
        return MCV;
    }
    public void setMCV(String MCV) {
        this.MCV = MCV;
    }

    public String getPCHE() {
        return PCHE;
    }
    public void setPCHE(String PCHE) {
        this.PCHE = PCHE;
    }

    public Boolean getPPD() {
        return PPD;
    }
    public void setPPD(Boolean PPD) {
        this.PPD = PPD;
    }

    public String getPT_INR() {
        return PT_INR;
    }
    public void setPT_INR(String PT_INR) {
        this.PT_INR = PT_INR;
    }

    public String getPT_percentuale() {
        return PT_percentuale;
    }
    public void setPT_percentuale(String PT_percentuale) {
        this.PT_percentuale = PT_percentuale;
    }

    public String getAcido_lattico() {
        return acido_lattico;
    }
    public void setAcido_lattico(String acido_lattico) {
        this.acido_lattico = acido_lattico;
    }

    public String getAlbumina() {
        return albumina;
    }
    public void setAlbumina(String albumina) {
        this.albumina = albumina;
    }

    public String getAlfafetoproteina() {
        return alfafetoproteina;
    }
    public void setAlfafetoproteina(String alfafetoproteina) {
        this.alfafetoproteina = alfafetoproteina;
    }

    public String getAltra_metodica() {
        return altra_metodica;
    }
    public void setAltra_metodica(String altra_metodica) {
        this.altra_metodica = altra_metodica;
    }

    public String getAltro_beve() {
        return altro_beve;
    }
    public void setAltro_beve(String altro_beve) {
        this.altro_beve = altro_beve;
    }

    public Integer getAzotemia() {
        return azotemia;
    }
    public void setAzotemia(Integer azotemia) {
        this.azotemia = azotemia;
    }

    public Boolean getBeve() {
        return beve;
    }
    public void setBeve(Boolean beve) {
        this.beve = beve;
    }

    public String getBilirubina_diretta() {
        return bilirubina_diretta;
    }
    public void setBilirubina_diretta(String bilirubina_diretta) {
        this.bilirubina_diretta = bilirubina_diretta;
    }

    public String getBilirubina_totale() {
        return bilirubina_totale;
    }
    public void setBilirubina_totale(String bilirubina_totale) {
        this.bilirubina_totale = bilirubina_totale;
    }

    public Integer getBirra() {
        return birra;
    }
    public void setBirra(Integer birra) {
        this.birra = birra;
    }

    public String getCalcio() {
        return calcio;
    }
    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public Boolean getCampione() {
        return campione;
    }
    public void setCampione(Boolean campione) {
        this.campione = campione;
    }

    public Boolean getChemsex() {
        return chemsex;
    }
    public void setChemsex(Boolean chemsex) {
        this.chemsex = chemsex;
    }

    public Integer getCirconferenza_vita() {
        return circonferenza_vita;
    }
    public void setCirconferenza_vita(Integer circonferenza_vita) {
        this.circonferenza_vita = circonferenza_vita;
    }

    public Boolean getCmvigg() {
        return cmvigg;
    }
    public void setCmvigg(Boolean cmvigg) {
        this.cmvigg = cmvigg;
    }

    public Integer getColesterolo() {
        return colesterolo;
    }
    public void setColesterolo(Integer colesterolo) {
        this.colesterolo = colesterolo;
    }

    public Boolean getCov_igg() {
        return cov_igg;
    }
    public void setCov_igg(Boolean cov_igg) {
        this.cov_igg = cov_igg;
    }

    public String getCov_igg_titolo() {
        return cov_igg_titolo;
    }
    public void setCov_igg_titolo(String cov_igg_titolo) {
        this.cov_igg_titolo = cov_igg_titolo;
    }

    public Boolean getCov_igm() {
        return cov_igm;
    }
    public void setCov_igm(Boolean cov_igm) {
        this.cov_igm = cov_igm;
    }

    public String getCov_igm_titolo() {
        return cov_igm_titolo;
    }
    public void setCov_igm_titolo(String cov_igm_titolo) {
        this.cov_igm_titolo = cov_igm_titolo;
    }

    public Boolean getCov_rna() {
        return cov_rna;
    }
    public void setCov_rna(Boolean cov_rna) {
        this.cov_rna = cov_rna;
    }

    public String getCov_test() {
        return cov_test;
    }
    public void setCov_test(String cov_test) {
        this.cov_test = cov_test;
    }

    public Boolean getCov_vax() {
        return cov_vax;
    }
    public void setCov_vax(Boolean cov_vax) {
        this.cov_vax = cov_vax;
    }

    public String getCreatinina() {
        return creatinina;
    }
    public void setCreatinina(String creatinina) {
        this.creatinina = creatinina;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData_campione() {
        return data_campione;
    }
    public void setData_campione(String data_campione) {
        this.data_campione = data_campione;
    }

    public String getData_presunta_parto() {
        return data_presunta_parto;
    }
    public void setData_presunta_parto(String data_presunta_parto) {
        this.data_presunta_parto = data_presunta_parto;
    }

    public String getData_questionario() {
        return data_questionario;
    }
    public void setData_questionario(String data_questionario) {
        this.data_questionario = data_questionario;
    }

    public Integer getDosi_omesse() {
        return dosi_omesse;
    }
    public void setDosi_omesse(Integer dosi_omesse) {
        this.dosi_omesse = dosi_omesse;
    }

    public String getEmoglobina() {
        return emoglobina;
    }
    public void setEmoglobina(String emoglobina) {
        this.emoglobina = emoglobina;
    }

    public String getEmoglobina_glicata() {
        return emoglobina_glicata;
    }
    public void setEmoglobina_glicata(String emoglobina_glicata) {
        this.emoglobina_glicata = emoglobina_glicata;
    }

    public String getFollowup_questionario() {
        return followup_questionario;
    }
    public void setFollowup_questionario(String followup_questionario) {
        this.followup_questionario = followup_questionario;
    }

    public Integer getFosfatasi_alcalina() {
        return fosfatasi_alcalina;
    }
    public void setFosfatasi_alcalina(Integer fosfatasi_alcalina) {
        this.fosfatasi_alcalina = fosfatasi_alcalina;
    }

    public String getFosforo() {
        return fosforo;
    }
    public void setFosforo(String fosforo) {
        this.fosforo = fosforo;
    }

    public String getFrequenza() {
        return frequenza;
    }
    public void setFrequenza(String frequenza) {
        this.frequenza = frequenza;
    }

    public Boolean getFumatore_attivo() {
        return fumatore_attivo;
    }
    public void setFumatore_attivo(Boolean fumatore_attivo) {
        this.fumatore_attivo = fumatore_attivo;
    }

    public Integer getGamma_gt() {
        return gamma_gt;
    }
    public void setGamma_gt(Integer gamma_gt) {
        this.gamma_gt = gamma_gt;
    }

    public Integer getGlicemia() {
        return glicemia;
    }
    public void setGlicemia(Integer glicemia) {
        this.glicemia = glicemia;
    }

    public Integer getGlobuli_bianchi() {
        return globuli_bianchi;
    }
    public void setGlobuli_bianchi(Integer globuli_bianchi) {
        this.globuli_bianchi = globuli_bianchi;
    }

    public Boolean getGravidanza() {
        return gravidanza;
    }
    public void setGravidanza(Boolean gravidanza) {
        this.gravidanza = gravidanza;
    }

    public Boolean getHavabtotali() {
        return havabtotali;
    }
    public void setHavabtotali(Boolean havabtotali) {
        this.havabtotali = havabtotali;
    }

    public Boolean getHavigm() {
        return havigm;
    }
    public void setHavigm(Boolean havigm) {
        this.havigm = havigm;
    }

    public Boolean getHbcab() {
        return hbcab;
    }
    public void setHbcab(Boolean hbcab) {
        this.hbcab = hbcab;
    }

    public Boolean getHbcigm() {
        return hbcigm;
    }
    public void setHbcigm(Boolean hbcigm) {
        this.hbcigm = hbcigm;
    }

    public Boolean getHbeab() {
        return hbeab;
    }
    public void setHbeab(Boolean hbeab) {
        this.hbeab = hbeab;
    }

    public Boolean getHbeag() {
        return hbeag;
    }
    public void setHbeag(Boolean hbeag) {
        this.hbeag = hbeag;
    }

    public Boolean getHbsab() {
        return hbsab;
    }
    public void setHbsab(Boolean hbsab) {
        this.hbsab = hbsab;
    }

    public String getHbsab_totali() {
        return hbsab_totali;
    }
    public void setHbsab_totali(String hbsab_totali) {
        this.hbsab_totali = hbsab_totali;
    }

    public Boolean getHbsag() {
        return hbsag;
    }
    public void setHbsag(Boolean hbsag) {
        this.hbsag = hbsag;
    }

    public String getHbsag_totali() {
        return hbsag_totali;
    }
    public void setHbsag_totali(String hbsag_totali) {
        this.hbsag_totali = hbsag_totali;
    }

    public Boolean getHcvab() {
        return hcvab;
    }
    public void setHcvab(Boolean hcvab) {
        this.hcvab = hcvab;
    }

    public Boolean getHcvag() {
        return hcvag;
    }
    public void setHcvag(Boolean hcvag) {
        this.hcvag = hcvag;
    }

    public Boolean getHdvab() {
        return hdvab;
    }
    public void setHdvab(Boolean hdvab) {
        this.hdvab = hdvab;
    }

    public Boolean getHdvab_igg() {
        return hdvab_igg;
    }
    public void setHdvab_igg(Boolean hdvab_igg) {
        this.hdvab_igg = hdvab_igg;
    }

    public Boolean getHdvabigm() {
        return hdvabigm;
    }
    public void setHdvabigm(Boolean hdvabigm) {
        this.hdvabigm = hdvabigm;
    }

    public String getHdvabtotali() {
        return hdvabtotali;
    }
    public void setHdvabtotali(String hdvabtotali) {
        this.hdvabtotali = hdvabtotali;
    }

    public Boolean getInterruzioni() {
        return interruzioni;
    }
    public void setInterruzioni(Boolean interruzioni) {
        this.interruzioni = interruzioni;
    }

    public String getMdw() {
        return mdw;
    }
    public void setMdw(String mdw) {
        this.mdw = mdw;
    }

    public String getMetodica_vitamina_D_2() {
        return metodica_vitamina_D_2;
    }
    public void setMetodica_vitamina_D_2(String metodica_vitamina_D_2) {
        this.metodica_vitamina_D_2 = metodica_vitamina_D_2;
    }

    public Integer getMonociti() {
        return monociti;
    }
    public void setMonociti(Integer monociti) {
        this.monociti = monociti;
    }

    public Boolean getNon_trepon() {
        return non_trepon;
    }
    public void setNon_trepon(Boolean non_trepon) {
        this.non_trepon = non_trepon;
    }

    public Integer getNr_neutrofili() {
        return nr_neutrofili;
    }
    public void setNr_neutrofili(Integer nr_neutrofili) {
        this.nr_neutrofili = nr_neutrofili;
    }

    public Boolean getOmissione() {
        return omissione;
    }
    public void setOmissione(Boolean omissione) {
        this.omissione = omissione;
    }

    public Integer getPa_max() {
        return pa_max;
    }
    public void setPa_max(Integer pa_max) {
        this.pa_max = pa_max;
    }

    public Integer getPa_min() {
        return pa_min;
    }
    public void setPa_min(Integer pa_min) {
        this.pa_min = pa_min;
    }

    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getPiastrine() {
        return piastrine;
    }
    public void setPiastrine(Integer piastrine) {
        this.piastrine = piastrine;
    }

    public String getProteinuria() {
        return proteinuria;
    }
    public void setProteinuria(String proteinuria) {
        this.proteinuria = proteinuria;
    }

    public Boolean getQuestionario_str() {
        return questionario_str;
    }
    public void setQuestionario_str(Boolean questionario_str) {
        this.questionario_str = questionario_str;
    }

    public Integer getSuperalcolici() {
        return superalcolici;
    }
    public void setSuperalcolici(Integer superalcolici) {
        this.superalcolici = superalcolici;
    }

    public Boolean getTossicodip_attivo() {
        return tossicodip_attivo;
    }
    public void setTossicodip_attivo(Boolean tossicodip_attivo) {
        this.tossicodip_attivo = tossicodip_attivo;
    }

    public Boolean getToxoigg() {
        return toxoigg;
    }
    public void setToxoigg(Boolean toxoigg) {
        this.toxoigg = toxoigg;
    }

    public Boolean getTrepon() {
        return trepon;
    }
    public void setTrepon(Boolean trepon) {
        this.trepon = trepon;
    }

    public Integer getTrigliceridi() {
        return trigliceridi;
    }
    public void setTrigliceridi(Integer trigliceridi) {
        this.trigliceridi = trigliceridi;
    }

    public String getUnita_vitamina_D() {
        return unita_vitamina_D;
    }
    public void setUnita_vitamina_D(String unita_vitamina_D) {
        this.unita_vitamina_D = unita_vitamina_D;
    }

    public String getVas() {
        return vas;
    }
    public void setVas(String vas) {
        this.vas = vas;
    }

    public String getVas_globale() {
        return vas_globale;
    }
    public void setVas_globale(String vas_globale) {
        this.vas_globale = vas_globale;
    }

    public Integer getVino() {
        return vino;
    }
    public void setVino(Integer vino) {
        this.vino = vino;
    }

    public String getVitamina_D() {
        return vitamina_D;
    }
    public void setVitamina_D(String vitamina_D) {
        this.vitamina_D = vitamina_D;
    }

    public CliSierologie_covidDraftRoleObjectsDTO getSierologie_covid_() {
        return sierologie_covid_;
    }
    public void setSierologie_covid_(CliSierologie_covidDraftRoleObjectsDTO sierologie_covid_) {
        this.sierologie_covid_ = sierologie_covid_;
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
        if (sierologie_covid_ != null) {
            joiner.add("sierologie_covid_: " + GraphQLRequestSerializer.getEntry(sierologie_covid_));
        }
        return joiner.toString();
    }

    public static CliControllo_clinicoDraftDTO.Builder builder() {
        return new CliControllo_clinicoDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
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
        private String peso;
        private Integer piastrine;
        private String proteinuria;
        private Boolean questionario_str;
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
        private CliSierologie_covidDraftRoleObjectsDTO sierologie_covid_;

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

        public Builder setALT(Integer ALT) {
            this.ALT = ALT;
            return this;
        }

        public Builder setAST(Integer AST) {
            this.AST = AST;
            return this;
        }

        public Builder setHDL(Integer HDL) {
            this.HDL = HDL;
            return this;
        }

        public Builder setLDL(Integer LDL) {
            this.LDL = LDL;
            return this;
        }

        public Builder setMCV(String MCV) {
            this.MCV = MCV;
            return this;
        }

        public Builder setPCHE(String PCHE) {
            this.PCHE = PCHE;
            return this;
        }

        public Builder setPPD(Boolean PPD) {
            this.PPD = PPD;
            return this;
        }

        public Builder setPT_INR(String PT_INR) {
            this.PT_INR = PT_INR;
            return this;
        }

        public Builder setPT_percentuale(String PT_percentuale) {
            this.PT_percentuale = PT_percentuale;
            return this;
        }

        public Builder setAcido_lattico(String acido_lattico) {
            this.acido_lattico = acido_lattico;
            return this;
        }

        public Builder setAlbumina(String albumina) {
            this.albumina = albumina;
            return this;
        }

        public Builder setAlfafetoproteina(String alfafetoproteina) {
            this.alfafetoproteina = alfafetoproteina;
            return this;
        }

        public Builder setAltra_metodica(String altra_metodica) {
            this.altra_metodica = altra_metodica;
            return this;
        }

        public Builder setAltro_beve(String altro_beve) {
            this.altro_beve = altro_beve;
            return this;
        }

        public Builder setAzotemia(Integer azotemia) {
            this.azotemia = azotemia;
            return this;
        }

        public Builder setBeve(Boolean beve) {
            this.beve = beve;
            return this;
        }

        public Builder setBilirubina_diretta(String bilirubina_diretta) {
            this.bilirubina_diretta = bilirubina_diretta;
            return this;
        }

        public Builder setBilirubina_totale(String bilirubina_totale) {
            this.bilirubina_totale = bilirubina_totale;
            return this;
        }

        public Builder setBirra(Integer birra) {
            this.birra = birra;
            return this;
        }

        public Builder setCalcio(String calcio) {
            this.calcio = calcio;
            return this;
        }

        public Builder setCampione(Boolean campione) {
            this.campione = campione;
            return this;
        }

        public Builder setChemsex(Boolean chemsex) {
            this.chemsex = chemsex;
            return this;
        }

        public Builder setCirconferenza_vita(Integer circonferenza_vita) {
            this.circonferenza_vita = circonferenza_vita;
            return this;
        }

        public Builder setCmvigg(Boolean cmvigg) {
            this.cmvigg = cmvigg;
            return this;
        }

        public Builder setColesterolo(Integer colesterolo) {
            this.colesterolo = colesterolo;
            return this;
        }

        public Builder setCov_igg(Boolean cov_igg) {
            this.cov_igg = cov_igg;
            return this;
        }

        public Builder setCov_igg_titolo(String cov_igg_titolo) {
            this.cov_igg_titolo = cov_igg_titolo;
            return this;
        }

        public Builder setCov_igm(Boolean cov_igm) {
            this.cov_igm = cov_igm;
            return this;
        }

        public Builder setCov_igm_titolo(String cov_igm_titolo) {
            this.cov_igm_titolo = cov_igm_titolo;
            return this;
        }

        public Builder setCov_rna(Boolean cov_rna) {
            this.cov_rna = cov_rna;
            return this;
        }

        public Builder setCov_test(String cov_test) {
            this.cov_test = cov_test;
            return this;
        }

        public Builder setCov_vax(Boolean cov_vax) {
            this.cov_vax = cov_vax;
            return this;
        }

        public Builder setCreatinina(String creatinina) {
            this.creatinina = creatinina;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setData_campione(String data_campione) {
            this.data_campione = data_campione;
            return this;
        }

        public Builder setData_presunta_parto(String data_presunta_parto) {
            this.data_presunta_parto = data_presunta_parto;
            return this;
        }

        public Builder setData_questionario(String data_questionario) {
            this.data_questionario = data_questionario;
            return this;
        }

        public Builder setDosi_omesse(Integer dosi_omesse) {
            this.dosi_omesse = dosi_omesse;
            return this;
        }

        public Builder setEmoglobina(String emoglobina) {
            this.emoglobina = emoglobina;
            return this;
        }

        public Builder setEmoglobina_glicata(String emoglobina_glicata) {
            this.emoglobina_glicata = emoglobina_glicata;
            return this;
        }

        public Builder setFollowup_questionario(String followup_questionario) {
            this.followup_questionario = followup_questionario;
            return this;
        }

        public Builder setFosfatasi_alcalina(Integer fosfatasi_alcalina) {
            this.fosfatasi_alcalina = fosfatasi_alcalina;
            return this;
        }

        public Builder setFosforo(String fosforo) {
            this.fosforo = fosforo;
            return this;
        }

        public Builder setFrequenza(String frequenza) {
            this.frequenza = frequenza;
            return this;
        }

        public Builder setFumatore_attivo(Boolean fumatore_attivo) {
            this.fumatore_attivo = fumatore_attivo;
            return this;
        }

        public Builder setGamma_gt(Integer gamma_gt) {
            this.gamma_gt = gamma_gt;
            return this;
        }

        public Builder setGlicemia(Integer glicemia) {
            this.glicemia = glicemia;
            return this;
        }

        public Builder setGlobuli_bianchi(Integer globuli_bianchi) {
            this.globuli_bianchi = globuli_bianchi;
            return this;
        }

        public Builder setGravidanza(Boolean gravidanza) {
            this.gravidanza = gravidanza;
            return this;
        }

        public Builder setHavabtotali(Boolean havabtotali) {
            this.havabtotali = havabtotali;
            return this;
        }

        public Builder setHavigm(Boolean havigm) {
            this.havigm = havigm;
            return this;
        }

        public Builder setHbcab(Boolean hbcab) {
            this.hbcab = hbcab;
            return this;
        }

        public Builder setHbcigm(Boolean hbcigm) {
            this.hbcigm = hbcigm;
            return this;
        }

        public Builder setHbeab(Boolean hbeab) {
            this.hbeab = hbeab;
            return this;
        }

        public Builder setHbeag(Boolean hbeag) {
            this.hbeag = hbeag;
            return this;
        }

        public Builder setHbsab(Boolean hbsab) {
            this.hbsab = hbsab;
            return this;
        }

        public Builder setHbsab_totali(String hbsab_totali) {
            this.hbsab_totali = hbsab_totali;
            return this;
        }

        public Builder setHbsag(Boolean hbsag) {
            this.hbsag = hbsag;
            return this;
        }

        public Builder setHbsag_totali(String hbsag_totali) {
            this.hbsag_totali = hbsag_totali;
            return this;
        }

        public Builder setHcvab(Boolean hcvab) {
            this.hcvab = hcvab;
            return this;
        }

        public Builder setHcvag(Boolean hcvag) {
            this.hcvag = hcvag;
            return this;
        }

        public Builder setHdvab(Boolean hdvab) {
            this.hdvab = hdvab;
            return this;
        }

        public Builder setHdvab_igg(Boolean hdvab_igg) {
            this.hdvab_igg = hdvab_igg;
            return this;
        }

        public Builder setHdvabigm(Boolean hdvabigm) {
            this.hdvabigm = hdvabigm;
            return this;
        }

        public Builder setHdvabtotali(String hdvabtotali) {
            this.hdvabtotali = hdvabtotali;
            return this;
        }

        public Builder setInterruzioni(Boolean interruzioni) {
            this.interruzioni = interruzioni;
            return this;
        }

        public Builder setMdw(String mdw) {
            this.mdw = mdw;
            return this;
        }

        public Builder setMetodica_vitamina_D_2(String metodica_vitamina_D_2) {
            this.metodica_vitamina_D_2 = metodica_vitamina_D_2;
            return this;
        }

        public Builder setMonociti(Integer monociti) {
            this.monociti = monociti;
            return this;
        }

        public Builder setNon_trepon(Boolean non_trepon) {
            this.non_trepon = non_trepon;
            return this;
        }

        public Builder setNr_neutrofili(Integer nr_neutrofili) {
            this.nr_neutrofili = nr_neutrofili;
            return this;
        }

        public Builder setOmissione(Boolean omissione) {
            this.omissione = omissione;
            return this;
        }

        public Builder setPa_max(Integer pa_max) {
            this.pa_max = pa_max;
            return this;
        }

        public Builder setPa_min(Integer pa_min) {
            this.pa_min = pa_min;
            return this;
        }

        public Builder setPeso(String peso) {
            this.peso = peso;
            return this;
        }

        public Builder setPiastrine(Integer piastrine) {
            this.piastrine = piastrine;
            return this;
        }

        public Builder setProteinuria(String proteinuria) {
            this.proteinuria = proteinuria;
            return this;
        }

        public Builder setQuestionario_str(Boolean questionario_str) {
            this.questionario_str = questionario_str;
            return this;
        }

        public Builder setSuperalcolici(Integer superalcolici) {
            this.superalcolici = superalcolici;
            return this;
        }

        public Builder setTossicodip_attivo(Boolean tossicodip_attivo) {
            this.tossicodip_attivo = tossicodip_attivo;
            return this;
        }

        public Builder setToxoigg(Boolean toxoigg) {
            this.toxoigg = toxoigg;
            return this;
        }

        public Builder setTrepon(Boolean trepon) {
            this.trepon = trepon;
            return this;
        }

        public Builder setTrigliceridi(Integer trigliceridi) {
            this.trigliceridi = trigliceridi;
            return this;
        }

        public Builder setUnita_vitamina_D(String unita_vitamina_D) {
            this.unita_vitamina_D = unita_vitamina_D;
            return this;
        }

        public Builder setVas(String vas) {
            this.vas = vas;
            return this;
        }

        public Builder setVas_globale(String vas_globale) {
            this.vas_globale = vas_globale;
            return this;
        }

        public Builder setVino(Integer vino) {
            this.vino = vino;
            return this;
        }

        public Builder setVitamina_D(String vitamina_D) {
            this.vitamina_D = vitamina_D;
            return this;
        }

        public Builder setSierologie_covid_(CliSierologie_covidDraftRoleObjectsDTO sierologie_covid_) {
            this.sierologie_covid_ = sierologie_covid_;
            return this;
        }


        public CliControllo_clinicoDraftDTO build() {
            CliControllo_clinicoDraftDTO result = new CliControllo_clinicoDraftDTO();
            result.set_id(this._id);
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
            result.setPeso(this.peso);
            result.setPiastrine(this.piastrine);
            result.setProteinuria(this.proteinuria);
            result.setQuestionario_str(this.questionario_str);
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
            result.setSierologie_covid_(this.sierologie_covid_);
            return result;
        }

    }
}
