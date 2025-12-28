package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for O_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class O_PazienteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public O_PazienteResponseProjection() {
    }

    public O_PazienteResponseProjection(O_PazienteResponseProjection projection) {
        super(projection);
    }

    public O_PazienteResponseProjection(List<O_PazienteResponseProjection> projections) {
        super(projections);
    }

    public O_PazienteResponseProjection all$() {
        return all$(3);
    }

    public O_PazienteResponseProjection all$(int maxDepth) {
        this._clientId();
        this.IL28B();
        this._createdon();
        this._id();
        this.altezza();
        this.altro_fattore_di_rischio();
        this.anno_nascita();
        this.checks();
        this.codice_centro();
        this.codice_interno();
        this.comune_di_nascita();
        this.coorte_DAD();
        this.data_DAD();
        this.data_consenso();
        this.data_consenso_pro();
        this.data_decesso();
        this.data_fine_terapia_ormonale();
        this.data_gilbert();
        this.data_hla();
        this.data_il28();
        this.data_inizio_terapia_ormonale();
        this.data_menopausa();
        this.data_prima_ARV();
        this.data_prima_terapia_anti_hcv();
        this.data_prima_visita();
        this.data_primo_hcvab_pos();
        this.data_ultima_visita();
        this.data_ultimo_HCVAb_pre_arr();
        this.data_ultimo_HbsAg_pre_arr();
        this.data_ultimo_drop();
        this.dtg();
        this.esito_ultima_terapia();
        this.eta_arruolamento();
        this.etnia_();
        this.farmaci();
        this.fattore_di_rischio_();
        this.hbsag_pos();
        this.hcvab_pos();
        this.hla_b5701();
        this.hla_b5701_bool();
        this.id_respond();
        this.ifn();
        this.in_italia_da_anni();
        this.nazionalita_();
        this.nazione();
        this.note_terapia();
        this.null_val();
        this.password_questionario();
        this.pegifn();
        this.pregresse_terapie_anti_hcv();
        this.pro();
        this.ribavirina();
        this.sesso();
        this.sex_worker();
        this.stribild();
        this.taf();
        this.team();
        this.terapia_ormonale();
        this.trasferito();
        if (projectionDepthOnFields.getOrDefault("O_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("O_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", projectionDepthOnFields.getOrDefault("O_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) + 1);
            this.trattamento_antitumorale_(new Trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("O_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0)));
        }
        this.typename();
        return this;
    }

    public O_PazienteResponseProjection _clientId() {
        return _clientId(null);
    }

    public O_PazienteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection IL28B() {
        return IL28B(null);
    }

    public O_PazienteResponseProjection IL28B(String alias) {
        add$(new GraphQLResponseField("IL28B").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection _createdon() {
        return _createdon(null);
    }

    public O_PazienteResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection _id() {
        return _id(null);
    }

    public O_PazienteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection altezza() {
        return altezza(null);
    }

    public O_PazienteResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection altro_fattore_di_rischio() {
        return altro_fattore_di_rischio(null);
    }

    public O_PazienteResponseProjection altro_fattore_di_rischio(String alias) {
        add$(new GraphQLResponseField("altro_fattore_di_rischio").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection anno_nascita() {
        return anno_nascita(null);
    }

    public O_PazienteResponseProjection anno_nascita(String alias) {
        add$(new GraphQLResponseField("anno_nascita").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection checks() {
        return checks(null);
    }

    public O_PazienteResponseProjection checks(String alias) {
        add$(new GraphQLResponseField("checks").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public O_PazienteResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection codice_interno() {
        return codice_interno(null);
    }

    public O_PazienteResponseProjection codice_interno(String alias) {
        add$(new GraphQLResponseField("codice_interno").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection comune_di_nascita() {
        return comune_di_nascita(null);
    }

    public O_PazienteResponseProjection comune_di_nascita(String alias) {
        add$(new GraphQLResponseField("comune_di_nascita").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection coorte_DAD() {
        return coorte_DAD(null);
    }

    public O_PazienteResponseProjection coorte_DAD(String alias) {
        add$(new GraphQLResponseField("coorte_DAD").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_DAD() {
        return data_DAD(null);
    }

    public O_PazienteResponseProjection data_DAD(String alias) {
        add$(new GraphQLResponseField("data_DAD").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_consenso() {
        return data_consenso(null);
    }

    public O_PazienteResponseProjection data_consenso(String alias) {
        add$(new GraphQLResponseField("data_consenso").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_consenso_pro() {
        return data_consenso_pro(null);
    }

    public O_PazienteResponseProjection data_consenso_pro(String alias) {
        add$(new GraphQLResponseField("data_consenso_pro").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_decesso() {
        return data_decesso(null);
    }

    public O_PazienteResponseProjection data_decesso(String alias) {
        add$(new GraphQLResponseField("data_decesso").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_fine_terapia_ormonale() {
        return data_fine_terapia_ormonale(null);
    }

    public O_PazienteResponseProjection data_fine_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_fine_terapia_ormonale").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_gilbert() {
        return data_gilbert(null);
    }

    public O_PazienteResponseProjection data_gilbert(String alias) {
        add$(new GraphQLResponseField("data_gilbert").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_hla() {
        return data_hla(null);
    }

    public O_PazienteResponseProjection data_hla(String alias) {
        add$(new GraphQLResponseField("data_hla").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_il28() {
        return data_il28(null);
    }

    public O_PazienteResponseProjection data_il28(String alias) {
        add$(new GraphQLResponseField("data_il28").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_inizio_terapia_ormonale() {
        return data_inizio_terapia_ormonale(null);
    }

    public O_PazienteResponseProjection data_inizio_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_inizio_terapia_ormonale").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_menopausa() {
        return data_menopausa(null);
    }

    public O_PazienteResponseProjection data_menopausa(String alias) {
        add$(new GraphQLResponseField("data_menopausa").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_prima_ARV() {
        return data_prima_ARV(null);
    }

    public O_PazienteResponseProjection data_prima_ARV(String alias) {
        add$(new GraphQLResponseField("data_prima_ARV").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv(null);
    }

    public O_PazienteResponseProjection data_prima_terapia_anti_hcv(String alias) {
        add$(new GraphQLResponseField("data_prima_terapia_anti_hcv").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_prima_visita() {
        return data_prima_visita(null);
    }

    public O_PazienteResponseProjection data_prima_visita(String alias) {
        add$(new GraphQLResponseField("data_prima_visita").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_primo_hcvab_pos() {
        return data_primo_hcvab_pos(null);
    }

    public O_PazienteResponseProjection data_primo_hcvab_pos(String alias) {
        add$(new GraphQLResponseField("data_primo_hcvab_pos").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_ultima_visita() {
        return data_ultima_visita(null);
    }

    public O_PazienteResponseProjection data_ultima_visita(String alias) {
        add$(new GraphQLResponseField("data_ultima_visita").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_ultimo_HCVAb_pre_arr() {
        return data_ultimo_HCVAb_pre_arr(null);
    }

    public O_PazienteResponseProjection data_ultimo_HCVAb_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HCVAb_pre_arr").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_ultimo_HbsAg_pre_arr() {
        return data_ultimo_HbsAg_pre_arr(null);
    }

    public O_PazienteResponseProjection data_ultimo_HbsAg_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HbsAg_pre_arr").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection data_ultimo_drop() {
        return data_ultimo_drop(null);
    }

    public O_PazienteResponseProjection data_ultimo_drop(String alias) {
        add$(new GraphQLResponseField("data_ultimo_drop").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection dtg() {
        return dtg(null);
    }

    public O_PazienteResponseProjection dtg(String alias) {
        add$(new GraphQLResponseField("dtg").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection esito_ultima_terapia() {
        return esito_ultima_terapia(null);
    }

    public O_PazienteResponseProjection esito_ultima_terapia(String alias) {
        add$(new GraphQLResponseField("esito_ultima_terapia").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection eta_arruolamento() {
        return eta_arruolamento(null);
    }

    public O_PazienteResponseProjection eta_arruolamento(String alias) {
        add$(new GraphQLResponseField("eta_arruolamento").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection etnia_() {
        return etnia_(null);
    }

    public O_PazienteResponseProjection etnia_(String alias) {
        add$(new GraphQLResponseField("etnia_").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection farmaci() {
        return farmaci(null);
    }

    public O_PazienteResponseProjection farmaci(String alias) {
        add$(new GraphQLResponseField("farmaci").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection fattore_di_rischio_() {
        return fattore_di_rischio_(null);
    }

    public O_PazienteResponseProjection fattore_di_rischio_(String alias) {
        add$(new GraphQLResponseField("fattore_di_rischio_").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection hbsag_pos() {
        return hbsag_pos(null);
    }

    public O_PazienteResponseProjection hbsag_pos(String alias) {
        add$(new GraphQLResponseField("hbsag_pos").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection hcvab_pos() {
        return hcvab_pos(null);
    }

    public O_PazienteResponseProjection hcvab_pos(String alias) {
        add$(new GraphQLResponseField("hcvab_pos").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection hla_b5701() {
        return hla_b5701(null);
    }

    public O_PazienteResponseProjection hla_b5701(String alias) {
        add$(new GraphQLResponseField("hla_b5701").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection hla_b5701_bool() {
        return hla_b5701_bool(null);
    }

    public O_PazienteResponseProjection hla_b5701_bool(String alias) {
        add$(new GraphQLResponseField("hla_b5701_bool").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection id_respond() {
        return id_respond(null);
    }

    public O_PazienteResponseProjection id_respond(String alias) {
        add$(new GraphQLResponseField("id_respond").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection ifn() {
        return ifn(null);
    }

    public O_PazienteResponseProjection ifn(String alias) {
        add$(new GraphQLResponseField("ifn").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection in_italia_da_anni() {
        return in_italia_da_anni(null);
    }

    public O_PazienteResponseProjection in_italia_da_anni(String alias) {
        add$(new GraphQLResponseField("in_italia_da_anni").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection nazionalita_() {
        return nazionalita_(null);
    }

    public O_PazienteResponseProjection nazionalita_(String alias) {
        add$(new GraphQLResponseField("nazionalita_").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection nazione() {
        return nazione(null);
    }

    public O_PazienteResponseProjection nazione(String alias) {
        add$(new GraphQLResponseField("nazione").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection note_terapia() {
        return note_terapia(null);
    }

    public O_PazienteResponseProjection note_terapia(String alias) {
        add$(new GraphQLResponseField("note_terapia").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection null_val() {
        return null_val(null);
    }

    public O_PazienteResponseProjection null_val(String alias) {
        add$(new GraphQLResponseField("null_val").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection password_questionario() {
        return password_questionario(null);
    }

    public O_PazienteResponseProjection password_questionario(String alias) {
        add$(new GraphQLResponseField("password_questionario").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection pegifn() {
        return pegifn(null);
    }

    public O_PazienteResponseProjection pegifn(String alias) {
        add$(new GraphQLResponseField("pegifn").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection pregresse_terapie_anti_hcv() {
        return pregresse_terapie_anti_hcv(null);
    }

    public O_PazienteResponseProjection pregresse_terapie_anti_hcv(String alias) {
        add$(new GraphQLResponseField("pregresse_terapie_anti_hcv").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection pro() {
        return pro(null);
    }

    public O_PazienteResponseProjection pro(String alias) {
        add$(new GraphQLResponseField("pro").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection ribavirina() {
        return ribavirina(null);
    }

    public O_PazienteResponseProjection ribavirina(String alias) {
        add$(new GraphQLResponseField("ribavirina").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection sesso() {
        return sesso(null);
    }

    public O_PazienteResponseProjection sesso(String alias) {
        add$(new GraphQLResponseField("sesso").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection sex_worker() {
        return sex_worker(null);
    }

    public O_PazienteResponseProjection sex_worker(String alias) {
        add$(new GraphQLResponseField("sex_worker").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection stribild() {
        return stribild(null);
    }

    public O_PazienteResponseProjection stribild(String alias) {
        add$(new GraphQLResponseField("stribild").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection taf() {
        return taf(null);
    }

    public O_PazienteResponseProjection taf(String alias) {
        add$(new GraphQLResponseField("taf").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection team() {
        return team(null);
    }

    public O_PazienteResponseProjection team(String alias) {
        add$(new GraphQLResponseField("team").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection terapia_ormonale() {
        return terapia_ormonale(null);
    }

    public O_PazienteResponseProjection terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("terapia_ormonale").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection trasferito() {
        return trasferito(null);
    }

    public O_PazienteResponseProjection trasferito(String alias) {
        add$(new GraphQLResponseField("trasferito").alias(alias));
        return this;
    }

    public O_PazienteResponseProjection trattamento_antitumorale_(Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_((String)null, subProjection);
    }

    public O_PazienteResponseProjection trattamento_antitumorale_(String alias, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public O_PazienteResponseProjection trattamento_antitumorale_(O_PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_(null, input, subProjection);
    }

    public O_PazienteResponseProjection trattamento_antitumorale_(String alias, O_PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public O_PazienteResponseProjection typename() {
        return typename(null);
    }

    public O_PazienteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public O_PazienteResponseProjection deepCopy$() {
        return new O_PazienteResponseProjection(this);
    }


}
