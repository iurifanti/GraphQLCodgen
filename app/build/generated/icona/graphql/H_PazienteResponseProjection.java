package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for H_Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class H_PazienteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public H_PazienteResponseProjection() {
    }

    public H_PazienteResponseProjection(H_PazienteResponseProjection projection) {
        super(projection);
    }

    public H_PazienteResponseProjection(List<H_PazienteResponseProjection> projections) {
        super(projections);
    }

    public H_PazienteResponseProjection all$() {
        return all$(3);
    }

    public H_PazienteResponseProjection all$(int maxDepth) {
        this._clientId();
        this.IL28B();
        this.USSL_di_residenza();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altezza();
        this.altro_fattore_di_rischio();
        this.anno_nascita();
        this.checks();
        this.codice_centro();
        this.codice_interno();
        this.codice_nazionale();
        this.cognome();
        this.comune_di_nascita();
        this.data_consenso();
        this.data_consenso_pro();
        this.data_decesso();
        this.data_fine_terapia_ormonale();
        this.data_gilbert();
        this.data_hla();
        this.data_il28();
        this.data_inizio_terapia_ormonale();
        this.data_menopausa();
        this.data_prima_terapia_anti_hcv();
        this.data_prima_visita();
        this.data_primo_hcvab_pos();
        this.data_ultima_visita();
        this.data_ultimo_HCVAb_pre_arr();
        this.data_ultimo_HbsAg_pre_arr();
        this.data_ultimo_drop();
        this.date_longicona();
        this.dtg();
        this.esito_ultima_terapia();
        this.eta_arruolamento();
        this.eta_prima_visita();
        this.etnia_();
        this.fattore_di_rischio_();
        this.fibroscan();
        this.hbsag_pos();
        this.hcvab_pos();
        this.hla_b5701();
        this.hla_b5701_bool();
        this.id_paziente();
        this.ifn();
        this.in_italia_da_anni();
        this.nascita();
        this.nazionalita_();
        this.nazione();
        this.noco();
        this.nome();
        this.note_terapia();
        this.null_val();
        this.password_pro();
        this.pegifn();
        this.pregresse_terapie_anti_hcv();
        this.pro();
        this.ribavirina();
        this.risk_F();
        this.sessione_pro();
        this.sesso();
        this.stribild();
        this.studi_pro_abilitati();
        this.taf();
        this.terapia_ormonale();
        this.token_notifiche_pro();
        this.trasferito();
        this.username_pro();
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) + 1);
            this.c_dettaglio_(new C_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0) + 1);
            this.identita_genere____associables(new Identita_generePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0) + 1);
            this.identita_genere_(new Identita_genereResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0) + 1);
            this.l_dettaglio_(new L_dettaglioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0) + 1);
            this.markers_HDV_(new Markers_HDVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("H_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) + 1);
            this.trattamento_antitumorale_(new Trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("H_PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0)));
        }
        this.typename();
        return this;
    }

    public H_PazienteResponseProjection _clientId() {
        return _clientId(null);
    }

    public H_PazienteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection IL28B() {
        return IL28B(null);
    }

    public H_PazienteResponseProjection IL28B(String alias) {
        add$(new GraphQLResponseField("IL28B").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection USSL_di_residenza() {
        return USSL_di_residenza(null);
    }

    public H_PazienteResponseProjection USSL_di_residenza(String alias) {
        add$(new GraphQLResponseField("USSL_di_residenza").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _createdby() {
        return _createdby(null);
    }

    public H_PazienteResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _createdon() {
        return _createdon(null);
    }

    public H_PazienteResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _id() {
        return _id(null);
    }

    public H_PazienteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public H_PazienteResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public H_PazienteResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public H_PazienteResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public H_PazienteResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection altezza() {
        return altezza(null);
    }

    public H_PazienteResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection altro_fattore_di_rischio() {
        return altro_fattore_di_rischio(null);
    }

    public H_PazienteResponseProjection altro_fattore_di_rischio(String alias) {
        add$(new GraphQLResponseField("altro_fattore_di_rischio").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection anno_nascita() {
        return anno_nascita(null);
    }

    public H_PazienteResponseProjection anno_nascita(String alias) {
        add$(new GraphQLResponseField("anno_nascita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection checks() {
        return checks(null);
    }

    public H_PazienteResponseProjection checks(String alias) {
        add$(new GraphQLResponseField("checks").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public H_PazienteResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection codice_interno() {
        return codice_interno(null);
    }

    public H_PazienteResponseProjection codice_interno(String alias) {
        add$(new GraphQLResponseField("codice_interno").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection codice_nazionale() {
        return codice_nazionale(null);
    }

    public H_PazienteResponseProjection codice_nazionale(String alias) {
        add$(new GraphQLResponseField("codice_nazionale").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection cognome() {
        return cognome(null);
    }

    public H_PazienteResponseProjection cognome(String alias) {
        add$(new GraphQLResponseField("cognome").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection comune_di_nascita() {
        return comune_di_nascita(null);
    }

    public H_PazienteResponseProjection comune_di_nascita(String alias) {
        add$(new GraphQLResponseField("comune_di_nascita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_consenso() {
        return data_consenso(null);
    }

    public H_PazienteResponseProjection data_consenso(String alias) {
        add$(new GraphQLResponseField("data_consenso").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_consenso_pro() {
        return data_consenso_pro(null);
    }

    public H_PazienteResponseProjection data_consenso_pro(String alias) {
        add$(new GraphQLResponseField("data_consenso_pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_decesso() {
        return data_decesso(null);
    }

    public H_PazienteResponseProjection data_decesso(String alias) {
        add$(new GraphQLResponseField("data_decesso").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_fine_terapia_ormonale() {
        return data_fine_terapia_ormonale(null);
    }

    public H_PazienteResponseProjection data_fine_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_fine_terapia_ormonale").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_gilbert() {
        return data_gilbert(null);
    }

    public H_PazienteResponseProjection data_gilbert(String alias) {
        add$(new GraphQLResponseField("data_gilbert").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_hla() {
        return data_hla(null);
    }

    public H_PazienteResponseProjection data_hla(String alias) {
        add$(new GraphQLResponseField("data_hla").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_il28() {
        return data_il28(null);
    }

    public H_PazienteResponseProjection data_il28(String alias) {
        add$(new GraphQLResponseField("data_il28").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_inizio_terapia_ormonale() {
        return data_inizio_terapia_ormonale(null);
    }

    public H_PazienteResponseProjection data_inizio_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_inizio_terapia_ormonale").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_menopausa() {
        return data_menopausa(null);
    }

    public H_PazienteResponseProjection data_menopausa(String alias) {
        add$(new GraphQLResponseField("data_menopausa").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv(null);
    }

    public H_PazienteResponseProjection data_prima_terapia_anti_hcv(String alias) {
        add$(new GraphQLResponseField("data_prima_terapia_anti_hcv").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_prima_visita() {
        return data_prima_visita(null);
    }

    public H_PazienteResponseProjection data_prima_visita(String alias) {
        add$(new GraphQLResponseField("data_prima_visita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_primo_hcvab_pos() {
        return data_primo_hcvab_pos(null);
    }

    public H_PazienteResponseProjection data_primo_hcvab_pos(String alias) {
        add$(new GraphQLResponseField("data_primo_hcvab_pos").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_ultima_visita() {
        return data_ultima_visita(null);
    }

    public H_PazienteResponseProjection data_ultima_visita(String alias) {
        add$(new GraphQLResponseField("data_ultima_visita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_ultimo_HCVAb_pre_arr() {
        return data_ultimo_HCVAb_pre_arr(null);
    }

    public H_PazienteResponseProjection data_ultimo_HCVAb_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HCVAb_pre_arr").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_ultimo_HbsAg_pre_arr() {
        return data_ultimo_HbsAg_pre_arr(null);
    }

    public H_PazienteResponseProjection data_ultimo_HbsAg_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HbsAg_pre_arr").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection data_ultimo_drop() {
        return data_ultimo_drop(null);
    }

    public H_PazienteResponseProjection data_ultimo_drop(String alias) {
        add$(new GraphQLResponseField("data_ultimo_drop").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection date_longicona() {
        return date_longicona(null);
    }

    public H_PazienteResponseProjection date_longicona(String alias) {
        add$(new GraphQLResponseField("date_longicona").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection dtg() {
        return dtg(null);
    }

    public H_PazienteResponseProjection dtg(String alias) {
        add$(new GraphQLResponseField("dtg").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection esito_ultima_terapia() {
        return esito_ultima_terapia(null);
    }

    public H_PazienteResponseProjection esito_ultima_terapia(String alias) {
        add$(new GraphQLResponseField("esito_ultima_terapia").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection eta_arruolamento() {
        return eta_arruolamento(null);
    }

    public H_PazienteResponseProjection eta_arruolamento(String alias) {
        add$(new GraphQLResponseField("eta_arruolamento").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection eta_prima_visita() {
        return eta_prima_visita(null);
    }

    public H_PazienteResponseProjection eta_prima_visita(String alias) {
        add$(new GraphQLResponseField("eta_prima_visita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection etnia_() {
        return etnia_(null);
    }

    public H_PazienteResponseProjection etnia_(String alias) {
        add$(new GraphQLResponseField("etnia_").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection fattore_di_rischio_() {
        return fattore_di_rischio_(null);
    }

    public H_PazienteResponseProjection fattore_di_rischio_(String alias) {
        add$(new GraphQLResponseField("fattore_di_rischio_").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection fibroscan() {
        return fibroscan(null);
    }

    public H_PazienteResponseProjection fibroscan(String alias) {
        add$(new GraphQLResponseField("fibroscan").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection hbsag_pos() {
        return hbsag_pos(null);
    }

    public H_PazienteResponseProjection hbsag_pos(String alias) {
        add$(new GraphQLResponseField("hbsag_pos").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection hcvab_pos() {
        return hcvab_pos(null);
    }

    public H_PazienteResponseProjection hcvab_pos(String alias) {
        add$(new GraphQLResponseField("hcvab_pos").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection hla_b5701() {
        return hla_b5701(null);
    }

    public H_PazienteResponseProjection hla_b5701(String alias) {
        add$(new GraphQLResponseField("hla_b5701").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection hla_b5701_bool() {
        return hla_b5701_bool(null);
    }

    public H_PazienteResponseProjection hla_b5701_bool(String alias) {
        add$(new GraphQLResponseField("hla_b5701_bool").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection id_paziente() {
        return id_paziente(null);
    }

    public H_PazienteResponseProjection id_paziente(String alias) {
        add$(new GraphQLResponseField("id_paziente").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection ifn() {
        return ifn(null);
    }

    public H_PazienteResponseProjection ifn(String alias) {
        add$(new GraphQLResponseField("ifn").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection in_italia_da_anni() {
        return in_italia_da_anni(null);
    }

    public H_PazienteResponseProjection in_italia_da_anni(String alias) {
        add$(new GraphQLResponseField("in_italia_da_anni").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection nascita() {
        return nascita(null);
    }

    public H_PazienteResponseProjection nascita(String alias) {
        add$(new GraphQLResponseField("nascita").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection nazionalita_() {
        return nazionalita_(null);
    }

    public H_PazienteResponseProjection nazionalita_(String alias) {
        add$(new GraphQLResponseField("nazionalita_").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection nazione() {
        return nazione(null);
    }

    public H_PazienteResponseProjection nazione(String alias) {
        add$(new GraphQLResponseField("nazione").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection noco() {
        return noco(null);
    }

    public H_PazienteResponseProjection noco(String alias) {
        add$(new GraphQLResponseField("noco").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection nome() {
        return nome(null);
    }

    public H_PazienteResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection note_terapia() {
        return note_terapia(null);
    }

    public H_PazienteResponseProjection note_terapia(String alias) {
        add$(new GraphQLResponseField("note_terapia").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection null_val() {
        return null_val(null);
    }

    public H_PazienteResponseProjection null_val(String alias) {
        add$(new GraphQLResponseField("null_val").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection password_pro() {
        return password_pro(null);
    }

    public H_PazienteResponseProjection password_pro(String alias) {
        add$(new GraphQLResponseField("password_pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection pegifn() {
        return pegifn(null);
    }

    public H_PazienteResponseProjection pegifn(String alias) {
        add$(new GraphQLResponseField("pegifn").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection pregresse_terapie_anti_hcv() {
        return pregresse_terapie_anti_hcv(null);
    }

    public H_PazienteResponseProjection pregresse_terapie_anti_hcv(String alias) {
        add$(new GraphQLResponseField("pregresse_terapie_anti_hcv").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection pro() {
        return pro(null);
    }

    public H_PazienteResponseProjection pro(String alias) {
        add$(new GraphQLResponseField("pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection ribavirina() {
        return ribavirina(null);
    }

    public H_PazienteResponseProjection ribavirina(String alias) {
        add$(new GraphQLResponseField("ribavirina").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection risk_F() {
        return risk_F(null);
    }

    public H_PazienteResponseProjection risk_F(String alias) {
        add$(new GraphQLResponseField("risk_F").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection sessione_pro() {
        return sessione_pro(null);
    }

    public H_PazienteResponseProjection sessione_pro(String alias) {
        add$(new GraphQLResponseField("sessione_pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection sesso() {
        return sesso(null);
    }

    public H_PazienteResponseProjection sesso(String alias) {
        add$(new GraphQLResponseField("sesso").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection stribild() {
        return stribild(null);
    }

    public H_PazienteResponseProjection stribild(String alias) {
        add$(new GraphQLResponseField("stribild").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection studi_pro_abilitati() {
        return studi_pro_abilitati(null);
    }

    public H_PazienteResponseProjection studi_pro_abilitati(String alias) {
        add$(new GraphQLResponseField("studi_pro_abilitati").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection taf() {
        return taf(null);
    }

    public H_PazienteResponseProjection taf(String alias) {
        add$(new GraphQLResponseField("taf").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection terapia_ormonale() {
        return terapia_ormonale(null);
    }

    public H_PazienteResponseProjection terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("terapia_ormonale").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection token_notifiche_pro() {
        return token_notifiche_pro(null);
    }

    public H_PazienteResponseProjection token_notifiche_pro(String alias) {
        add$(new GraphQLResponseField("token_notifiche_pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection trasferito() {
        return trasferito(null);
    }

    public H_PazienteResponseProjection trasferito(String alias) {
        add$(new GraphQLResponseField("trasferito").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection username_pro() {
        return username_pro(null);
    }

    public H_PazienteResponseProjection username_pro(String alias) {
        add$(new GraphQLResponseField("username_pro").alias(alias));
        return this;
    }

    public H_PazienteResponseProjection c_dettaglio_(C_dettaglioResponseProjection subProjection) {
        return c_dettaglio_(null, subProjection);
    }

    public H_PazienteResponseProjection c_dettaglio_(String alias, C_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("c_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection identita_genere____associables(Identita_generePageResponseProjection subProjection) {
        return identita_genere____associables((String)null, subProjection);
    }

    public H_PazienteResponseProjection identita_genere____associables(String alias, Identita_generePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere____associables").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection identita_genere____associables(H_PazienteIdentita_genere____associablesParametrizedInput input, Identita_generePageResponseProjection subProjection) {
        return identita_genere____associables(null, input, subProjection);
    }

    public H_PazienteResponseProjection identita_genere____associables(String alias, H_PazienteIdentita_genere____associablesParametrizedInput input, Identita_generePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection identita_genere_(Identita_genereResponseProjection subProjection) {
        return identita_genere_(null, subProjection);
    }

    public H_PazienteResponseProjection identita_genere_(String alias, Identita_genereResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere_").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection l_dettaglio_(L_dettaglioPageResponseProjection subProjection) {
        return l_dettaglio_((String)null, subProjection);
    }

    public H_PazienteResponseProjection l_dettaglio_(String alias, L_dettaglioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("l_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection l_dettaglio_(H_PazienteL_dettaglio_ParametrizedInput input, L_dettaglioPageResponseProjection subProjection) {
        return l_dettaglio_(null, input, subProjection);
    }

    public H_PazienteResponseProjection l_dettaglio_(String alias, H_PazienteL_dettaglio_ParametrizedInput input, L_dettaglioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("l_dettaglio_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection markers_HDV_(Markers_HDVPageResponseProjection subProjection) {
        return markers_HDV_((String)null, subProjection);
    }

    public H_PazienteResponseProjection markers_HDV_(String alias, Markers_HDVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HDV_").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection markers_HDV_(H_PazienteMarkers_HDV_ParametrizedInput input, Markers_HDVPageResponseProjection subProjection) {
        return markers_HDV_(null, input, subProjection);
    }

    public H_PazienteResponseProjection markers_HDV_(String alias, H_PazienteMarkers_HDV_ParametrizedInput input, Markers_HDVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HDV_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection trattamento_antitumorale_(Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_((String)null, subProjection);
    }

    public H_PazienteResponseProjection trattamento_antitumorale_(String alias, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection trattamento_antitumorale_(H_PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_(null, input, subProjection);
    }

    public H_PazienteResponseProjection trattamento_antitumorale_(String alias, H_PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public H_PazienteResponseProjection typename() {
        return typename(null);
    }

    public H_PazienteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public H_PazienteResponseProjection deepCopy$() {
        return new H_PazienteResponseProjection(this);
    }


}
