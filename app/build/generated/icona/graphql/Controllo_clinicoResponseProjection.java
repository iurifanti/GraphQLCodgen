package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Controllo_clinico
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Controllo_clinicoResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Controllo_clinicoResponseProjection() {
    }

    public Controllo_clinicoResponseProjection(Controllo_clinicoResponseProjection projection) {
        super(projection);
    }

    public Controllo_clinicoResponseProjection(List<Controllo_clinicoResponseProjection> projections) {
        super(projections);
    }

    public Controllo_clinicoResponseProjection all$() {
        return all$(3);
    }

    public Controllo_clinicoResponseProjection all$(int maxDepth) {
        this._clientId();
        this.ALT();
        this.AST();
        this.HDL();
        this.LDL();
        this.MCV();
        this.PCHE();
        this.PPD();
        this.PT_INR();
        this.PT_percentuale();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.acido_lattico();
        this.albumina();
        this.alfafetoproteina();
        this.altra_metodica();
        this.altro_beve();
        this.azotemia();
        this.beve();
        this.bilirubina_diretta();
        this.bilirubina_totale();
        this.birra();
        this.calcio();
        this.campione();
        this.chemsex();
        this.circonferenza_vita();
        this.cmvigg();
        this.codice_centro();
        this.colesterolo();
        this.cov_igg();
        this.cov_igg_titolo();
        this.cov_igm();
        this.cov_igm_titolo();
        this.cov_rna();
        this.cov_test();
        this.cov_vax();
        this.creatinina();
        this.data();
        this.data_campione();
        this.data_presunta_parto();
        this.data_questionario();
        this.dosi_omesse();
        this.emoglobina();
        this.emoglobina_glicata();
        this.followup_questionario();
        this.fosfatasi_alcalina();
        this.fosforo();
        this.frequenza();
        this.fumatore_attivo();
        this.gamma_gt();
        this.glicemia();
        this.globuli_bianchi();
        this.gravidanza();
        this.havabtotali();
        this.havigm();
        this.hbcab();
        this.hbcigm();
        this.hbeab();
        this.hbeag();
        this.hbsab();
        this.hbsab_totali();
        this.hbsag();
        this.hbsag_totali();
        this.hcvab();
        this.hcvag();
        this.hdvab();
        this.hdvab_igg();
        this.hdvabigm();
        this.hdvabtotali();
        this.interruzioni();
        this.mdw();
        this.metodica_vitamina_D_2();
        this.monociti();
        this.non_trepon();
        this.nr_neutrofili();
        this.omissione();
        this.pa_max();
        this.pa_min();
        this.paziente();
        this.peso();
        this.piastrine();
        this.proteinuria();
        this.questionario_str();
        this.sesso_ok();
        this.superalcolici();
        this.tossicodip_attivo();
        this.toxoigg();
        this.trepon();
        this.trigliceridi();
        this.unita_vitamina_D();
        this.vas();
        this.vas_globale();
        this.vino();
        this.vitamina_D();
        if (projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Controllo_clinicoResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0) + 1);
            this.sierologie_covid_(new Sierologie_covidPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.Sierologie_covidPageResponseProjection.sierologie_covid_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.PazienteResponseProjection.Paziente_controllo_clinico", 0) <= maxDepth) {
            projectionDepthOnFields.put("Controllo_clinicoResponseProjection.PazienteResponseProjection.Paziente_controllo_clinico", projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.PazienteResponseProjection.Paziente_controllo_clinico", 0) + 1);
            this.Paziente_controllo_clinico(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Controllo_clinicoResponseProjection.PazienteResponseProjection.Paziente_controllo_clinico", 0)));
        }
        this.typename();
        return this;
    }

    public Controllo_clinicoResponseProjection _clientId() {
        return _clientId(null);
    }

    public Controllo_clinicoResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection ALT() {
        return ALT(null);
    }

    public Controllo_clinicoResponseProjection ALT(String alias) {
        add$(new GraphQLResponseField("ALT").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection AST() {
        return AST(null);
    }

    public Controllo_clinicoResponseProjection AST(String alias) {
        add$(new GraphQLResponseField("AST").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection HDL() {
        return HDL(null);
    }

    public Controllo_clinicoResponseProjection HDL(String alias) {
        add$(new GraphQLResponseField("HDL").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection LDL() {
        return LDL(null);
    }

    public Controllo_clinicoResponseProjection LDL(String alias) {
        add$(new GraphQLResponseField("LDL").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection MCV() {
        return MCV(null);
    }

    public Controllo_clinicoResponseProjection MCV(String alias) {
        add$(new GraphQLResponseField("MCV").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection PCHE() {
        return PCHE(null);
    }

    public Controllo_clinicoResponseProjection PCHE(String alias) {
        add$(new GraphQLResponseField("PCHE").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection PPD() {
        return PPD(null);
    }

    public Controllo_clinicoResponseProjection PPD(String alias) {
        add$(new GraphQLResponseField("PPD").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection PT_INR() {
        return PT_INR(null);
    }

    public Controllo_clinicoResponseProjection PT_INR(String alias) {
        add$(new GraphQLResponseField("PT_INR").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection PT_percentuale() {
        return PT_percentuale(null);
    }

    public Controllo_clinicoResponseProjection PT_percentuale(String alias) {
        add$(new GraphQLResponseField("PT_percentuale").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _createdby() {
        return _createdby(null);
    }

    public Controllo_clinicoResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _createdon() {
        return _createdon(null);
    }

    public Controllo_clinicoResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _id() {
        return _id(null);
    }

    public Controllo_clinicoResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Controllo_clinicoResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Controllo_clinicoResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Controllo_clinicoResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Controllo_clinicoResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection acido_lattico() {
        return acido_lattico(null);
    }

    public Controllo_clinicoResponseProjection acido_lattico(String alias) {
        add$(new GraphQLResponseField("acido_lattico").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection albumina() {
        return albumina(null);
    }

    public Controllo_clinicoResponseProjection albumina(String alias) {
        add$(new GraphQLResponseField("albumina").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection alfafetoproteina() {
        return alfafetoproteina(null);
    }

    public Controllo_clinicoResponseProjection alfafetoproteina(String alias) {
        add$(new GraphQLResponseField("alfafetoproteina").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection altra_metodica() {
        return altra_metodica(null);
    }

    public Controllo_clinicoResponseProjection altra_metodica(String alias) {
        add$(new GraphQLResponseField("altra_metodica").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection altro_beve() {
        return altro_beve(null);
    }

    public Controllo_clinicoResponseProjection altro_beve(String alias) {
        add$(new GraphQLResponseField("altro_beve").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection azotemia() {
        return azotemia(null);
    }

    public Controllo_clinicoResponseProjection azotemia(String alias) {
        add$(new GraphQLResponseField("azotemia").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection beve() {
        return beve(null);
    }

    public Controllo_clinicoResponseProjection beve(String alias) {
        add$(new GraphQLResponseField("beve").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection bilirubina_diretta() {
        return bilirubina_diretta(null);
    }

    public Controllo_clinicoResponseProjection bilirubina_diretta(String alias) {
        add$(new GraphQLResponseField("bilirubina_diretta").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection bilirubina_totale() {
        return bilirubina_totale(null);
    }

    public Controllo_clinicoResponseProjection bilirubina_totale(String alias) {
        add$(new GraphQLResponseField("bilirubina_totale").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection birra() {
        return birra(null);
    }

    public Controllo_clinicoResponseProjection birra(String alias) {
        add$(new GraphQLResponseField("birra").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection calcio() {
        return calcio(null);
    }

    public Controllo_clinicoResponseProjection calcio(String alias) {
        add$(new GraphQLResponseField("calcio").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection campione() {
        return campione(null);
    }

    public Controllo_clinicoResponseProjection campione(String alias) {
        add$(new GraphQLResponseField("campione").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection chemsex() {
        return chemsex(null);
    }

    public Controllo_clinicoResponseProjection chemsex(String alias) {
        add$(new GraphQLResponseField("chemsex").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection circonferenza_vita() {
        return circonferenza_vita(null);
    }

    public Controllo_clinicoResponseProjection circonferenza_vita(String alias) {
        add$(new GraphQLResponseField("circonferenza_vita").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cmvigg() {
        return cmvigg(null);
    }

    public Controllo_clinicoResponseProjection cmvigg(String alias) {
        add$(new GraphQLResponseField("cmvigg").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public Controllo_clinicoResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection colesterolo() {
        return colesterolo(null);
    }

    public Controllo_clinicoResponseProjection colesterolo(String alias) {
        add$(new GraphQLResponseField("colesterolo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_igg() {
        return cov_igg(null);
    }

    public Controllo_clinicoResponseProjection cov_igg(String alias) {
        add$(new GraphQLResponseField("cov_igg").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_igg_titolo() {
        return cov_igg_titolo(null);
    }

    public Controllo_clinicoResponseProjection cov_igg_titolo(String alias) {
        add$(new GraphQLResponseField("cov_igg_titolo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_igm() {
        return cov_igm(null);
    }

    public Controllo_clinicoResponseProjection cov_igm(String alias) {
        add$(new GraphQLResponseField("cov_igm").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_igm_titolo() {
        return cov_igm_titolo(null);
    }

    public Controllo_clinicoResponseProjection cov_igm_titolo(String alias) {
        add$(new GraphQLResponseField("cov_igm_titolo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_rna() {
        return cov_rna(null);
    }

    public Controllo_clinicoResponseProjection cov_rna(String alias) {
        add$(new GraphQLResponseField("cov_rna").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_test() {
        return cov_test(null);
    }

    public Controllo_clinicoResponseProjection cov_test(String alias) {
        add$(new GraphQLResponseField("cov_test").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection cov_vax() {
        return cov_vax(null);
    }

    public Controllo_clinicoResponseProjection cov_vax(String alias) {
        add$(new GraphQLResponseField("cov_vax").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection creatinina() {
        return creatinina(null);
    }

    public Controllo_clinicoResponseProjection creatinina(String alias) {
        add$(new GraphQLResponseField("creatinina").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection data() {
        return data(null);
    }

    public Controllo_clinicoResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection data_campione() {
        return data_campione(null);
    }

    public Controllo_clinicoResponseProjection data_campione(String alias) {
        add$(new GraphQLResponseField("data_campione").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection data_presunta_parto() {
        return data_presunta_parto(null);
    }

    public Controllo_clinicoResponseProjection data_presunta_parto(String alias) {
        add$(new GraphQLResponseField("data_presunta_parto").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection data_questionario() {
        return data_questionario(null);
    }

    public Controllo_clinicoResponseProjection data_questionario(String alias) {
        add$(new GraphQLResponseField("data_questionario").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection dosi_omesse() {
        return dosi_omesse(null);
    }

    public Controllo_clinicoResponseProjection dosi_omesse(String alias) {
        add$(new GraphQLResponseField("dosi_omesse").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection emoglobina() {
        return emoglobina(null);
    }

    public Controllo_clinicoResponseProjection emoglobina(String alias) {
        add$(new GraphQLResponseField("emoglobina").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection emoglobina_glicata() {
        return emoglobina_glicata(null);
    }

    public Controllo_clinicoResponseProjection emoglobina_glicata(String alias) {
        add$(new GraphQLResponseField("emoglobina_glicata").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection followup_questionario() {
        return followup_questionario(null);
    }

    public Controllo_clinicoResponseProjection followup_questionario(String alias) {
        add$(new GraphQLResponseField("followup_questionario").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection fosfatasi_alcalina() {
        return fosfatasi_alcalina(null);
    }

    public Controllo_clinicoResponseProjection fosfatasi_alcalina(String alias) {
        add$(new GraphQLResponseField("fosfatasi_alcalina").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection fosforo() {
        return fosforo(null);
    }

    public Controllo_clinicoResponseProjection fosforo(String alias) {
        add$(new GraphQLResponseField("fosforo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection frequenza() {
        return frequenza(null);
    }

    public Controllo_clinicoResponseProjection frequenza(String alias) {
        add$(new GraphQLResponseField("frequenza").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection fumatore_attivo() {
        return fumatore_attivo(null);
    }

    public Controllo_clinicoResponseProjection fumatore_attivo(String alias) {
        add$(new GraphQLResponseField("fumatore_attivo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection gamma_gt() {
        return gamma_gt(null);
    }

    public Controllo_clinicoResponseProjection gamma_gt(String alias) {
        add$(new GraphQLResponseField("gamma_gt").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection glicemia() {
        return glicemia(null);
    }

    public Controllo_clinicoResponseProjection glicemia(String alias) {
        add$(new GraphQLResponseField("glicemia").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection globuli_bianchi() {
        return globuli_bianchi(null);
    }

    public Controllo_clinicoResponseProjection globuli_bianchi(String alias) {
        add$(new GraphQLResponseField("globuli_bianchi").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection gravidanza() {
        return gravidanza(null);
    }

    public Controllo_clinicoResponseProjection gravidanza(String alias) {
        add$(new GraphQLResponseField("gravidanza").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection havabtotali() {
        return havabtotali(null);
    }

    public Controllo_clinicoResponseProjection havabtotali(String alias) {
        add$(new GraphQLResponseField("havabtotali").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection havigm() {
        return havigm(null);
    }

    public Controllo_clinicoResponseProjection havigm(String alias) {
        add$(new GraphQLResponseField("havigm").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbcab() {
        return hbcab(null);
    }

    public Controllo_clinicoResponseProjection hbcab(String alias) {
        add$(new GraphQLResponseField("hbcab").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbcigm() {
        return hbcigm(null);
    }

    public Controllo_clinicoResponseProjection hbcigm(String alias) {
        add$(new GraphQLResponseField("hbcigm").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbeab() {
        return hbeab(null);
    }

    public Controllo_clinicoResponseProjection hbeab(String alias) {
        add$(new GraphQLResponseField("hbeab").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbeag() {
        return hbeag(null);
    }

    public Controllo_clinicoResponseProjection hbeag(String alias) {
        add$(new GraphQLResponseField("hbeag").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbsab() {
        return hbsab(null);
    }

    public Controllo_clinicoResponseProjection hbsab(String alias) {
        add$(new GraphQLResponseField("hbsab").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbsab_totali() {
        return hbsab_totali(null);
    }

    public Controllo_clinicoResponseProjection hbsab_totali(String alias) {
        add$(new GraphQLResponseField("hbsab_totali").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbsag() {
        return hbsag(null);
    }

    public Controllo_clinicoResponseProjection hbsag(String alias) {
        add$(new GraphQLResponseField("hbsag").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hbsag_totali() {
        return hbsag_totali(null);
    }

    public Controllo_clinicoResponseProjection hbsag_totali(String alias) {
        add$(new GraphQLResponseField("hbsag_totali").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hcvab() {
        return hcvab(null);
    }

    public Controllo_clinicoResponseProjection hcvab(String alias) {
        add$(new GraphQLResponseField("hcvab").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hcvag() {
        return hcvag(null);
    }

    public Controllo_clinicoResponseProjection hcvag(String alias) {
        add$(new GraphQLResponseField("hcvag").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hdvab() {
        return hdvab(null);
    }

    public Controllo_clinicoResponseProjection hdvab(String alias) {
        add$(new GraphQLResponseField("hdvab").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hdvab_igg() {
        return hdvab_igg(null);
    }

    public Controllo_clinicoResponseProjection hdvab_igg(String alias) {
        add$(new GraphQLResponseField("hdvab_igg").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hdvabigm() {
        return hdvabigm(null);
    }

    public Controllo_clinicoResponseProjection hdvabigm(String alias) {
        add$(new GraphQLResponseField("hdvabigm").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection hdvabtotali() {
        return hdvabtotali(null);
    }

    public Controllo_clinicoResponseProjection hdvabtotali(String alias) {
        add$(new GraphQLResponseField("hdvabtotali").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection interruzioni() {
        return interruzioni(null);
    }

    public Controllo_clinicoResponseProjection interruzioni(String alias) {
        add$(new GraphQLResponseField("interruzioni").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection mdw() {
        return mdw(null);
    }

    public Controllo_clinicoResponseProjection mdw(String alias) {
        add$(new GraphQLResponseField("mdw").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection metodica_vitamina_D_2() {
        return metodica_vitamina_D_2(null);
    }

    public Controllo_clinicoResponseProjection metodica_vitamina_D_2(String alias) {
        add$(new GraphQLResponseField("metodica_vitamina_D_2").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection monociti() {
        return monociti(null);
    }

    public Controllo_clinicoResponseProjection monociti(String alias) {
        add$(new GraphQLResponseField("monociti").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection non_trepon() {
        return non_trepon(null);
    }

    public Controllo_clinicoResponseProjection non_trepon(String alias) {
        add$(new GraphQLResponseField("non_trepon").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection nr_neutrofili() {
        return nr_neutrofili(null);
    }

    public Controllo_clinicoResponseProjection nr_neutrofili(String alias) {
        add$(new GraphQLResponseField("nr_neutrofili").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection omissione() {
        return omissione(null);
    }

    public Controllo_clinicoResponseProjection omissione(String alias) {
        add$(new GraphQLResponseField("omissione").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection pa_max() {
        return pa_max(null);
    }

    public Controllo_clinicoResponseProjection pa_max(String alias) {
        add$(new GraphQLResponseField("pa_max").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection pa_min() {
        return pa_min(null);
    }

    public Controllo_clinicoResponseProjection pa_min(String alias) {
        add$(new GraphQLResponseField("pa_min").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection paziente() {
        return paziente(null);
    }

    public Controllo_clinicoResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection peso() {
        return peso(null);
    }

    public Controllo_clinicoResponseProjection peso(String alias) {
        add$(new GraphQLResponseField("peso").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection piastrine() {
        return piastrine(null);
    }

    public Controllo_clinicoResponseProjection piastrine(String alias) {
        add$(new GraphQLResponseField("piastrine").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection proteinuria() {
        return proteinuria(null);
    }

    public Controllo_clinicoResponseProjection proteinuria(String alias) {
        add$(new GraphQLResponseField("proteinuria").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection questionario_str() {
        return questionario_str(null);
    }

    public Controllo_clinicoResponseProjection questionario_str(String alias) {
        add$(new GraphQLResponseField("questionario_str").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection sesso_ok() {
        return sesso_ok(null);
    }

    public Controllo_clinicoResponseProjection sesso_ok(String alias) {
        add$(new GraphQLResponseField("sesso_ok").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection superalcolici() {
        return superalcolici(null);
    }

    public Controllo_clinicoResponseProjection superalcolici(String alias) {
        add$(new GraphQLResponseField("superalcolici").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection tossicodip_attivo() {
        return tossicodip_attivo(null);
    }

    public Controllo_clinicoResponseProjection tossicodip_attivo(String alias) {
        add$(new GraphQLResponseField("tossicodip_attivo").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection toxoigg() {
        return toxoigg(null);
    }

    public Controllo_clinicoResponseProjection toxoigg(String alias) {
        add$(new GraphQLResponseField("toxoigg").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection trepon() {
        return trepon(null);
    }

    public Controllo_clinicoResponseProjection trepon(String alias) {
        add$(new GraphQLResponseField("trepon").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection trigliceridi() {
        return trigliceridi(null);
    }

    public Controllo_clinicoResponseProjection trigliceridi(String alias) {
        add$(new GraphQLResponseField("trigliceridi").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection unita_vitamina_D() {
        return unita_vitamina_D(null);
    }

    public Controllo_clinicoResponseProjection unita_vitamina_D(String alias) {
        add$(new GraphQLResponseField("unita_vitamina_D").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection vas() {
        return vas(null);
    }

    public Controllo_clinicoResponseProjection vas(String alias) {
        add$(new GraphQLResponseField("vas").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection vas_globale() {
        return vas_globale(null);
    }

    public Controllo_clinicoResponseProjection vas_globale(String alias) {
        add$(new GraphQLResponseField("vas_globale").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection vino() {
        return vino(null);
    }

    public Controllo_clinicoResponseProjection vino(String alias) {
        add$(new GraphQLResponseField("vino").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection vitamina_D() {
        return vitamina_D(null);
    }

    public Controllo_clinicoResponseProjection vitamina_D(String alias) {
        add$(new GraphQLResponseField("vitamina_D").alias(alias));
        return this;
    }

    public Controllo_clinicoResponseProjection sierologie_covid_(Sierologie_covidPageResponseProjection subProjection) {
        return sierologie_covid_((String)null, subProjection);
    }

    public Controllo_clinicoResponseProjection sierologie_covid_(String alias, Sierologie_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sierologie_covid_").alias(alias).projection(subProjection));
        return this;
    }

    public Controllo_clinicoResponseProjection sierologie_covid_(Controllo_clinicoSierologie_covid_ParametrizedInput input, Sierologie_covidPageResponseProjection subProjection) {
        return sierologie_covid_(null, input, subProjection);
    }

    public Controllo_clinicoResponseProjection sierologie_covid_(String alias, Controllo_clinicoSierologie_covid_ParametrizedInput input, Sierologie_covidPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sierologie_covid_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Controllo_clinicoResponseProjection Paziente_controllo_clinico(PazienteResponseProjection subProjection) {
        return Paziente_controllo_clinico(null, subProjection);
    }

    public Controllo_clinicoResponseProjection Paziente_controllo_clinico(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_controllo_clinico").alias(alias).projection(subProjection));
        return this;
    }

    public Controllo_clinicoResponseProjection typename() {
        return typename(null);
    }

    public Controllo_clinicoResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Controllo_clinicoResponseProjection deepCopy$() {
        return new Controllo_clinicoResponseProjection(this);
    }


}
