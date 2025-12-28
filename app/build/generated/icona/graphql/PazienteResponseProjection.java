package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class PazienteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PazienteResponseProjection() {
    }

    public PazienteResponseProjection(PazienteResponseProjection projection) {
        super(projection);
    }

    public PazienteResponseProjection(List<PazienteResponseProjection> projections) {
        super(projections);
    }

    public PazienteResponseProjection all$() {
        return all$(3);
    }

    public PazienteResponseProjection all$(int maxDepth) {
        this._clientId();
        this.IL28B();
        this._createdon();
        this._id();
        this.altezza();
        this.altro_fattore_di_rischio();
        this.anno_nascita();
        this.checks();
        this.codice_arca();
        this.codice_centro();
        this.codice_interno();
        this.codici_studi();
        this.comune_di_nascita();
        this.coorte_respond();
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
        this.data_prima_dose();
        this.data_prima_terapia_anti_hcv();
        this.data_prima_visita();
        this.data_primo_hcvab_pos();
        this.data_ultima_visita();
        this.data_ultimo_HCVAb_pre_arr();
        this.data_ultimo_HbsAg_pre_arr();
        this.data_ultimo_drop();
        this.data_ultimo_marker_hiv();
        this.date_longicona();
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
        this.password_pro();
        this.pegifn();
        this.pregresse_terapie_anti_hcv();
        this.pride();
        this.pro();
        this.ribavirina();
        this.sessione_pro();
        this.sesso();
        this.sex_worker();
        this.studi_pro_abilitati();
        this.team();
        this.terapia_ormonale();
        this.token_notifiche_pro();
        this.trasferito();
        this.username_pro();
        this.vax_controllo_clinico();
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.AnamnesiResponseProjection.anamnesi", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.AnamnesiResponseProjection.anamnesi", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.AnamnesiResponseProjection.anamnesi", 0) + 1);
            this.anamnesi(new AnamnesiResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.AnamnesiResponseProjection.anamnesi", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0) + 1);
            this.c_dettaglio_(new C_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.C_dettaglioResponseProjection.c_dettaglio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old___associables", 0) + 1);
            this.campione_old___associables(new Campione_oldPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old", 0) + 1);
            this.campione_old(new Campione_oldPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Campione_oldPageResponseProjection.campione_old", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroPageResponseProjection.centro_appartenenza_attuale___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.CentroPageResponseProjection.centro_appartenenza_attuale___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroPageResponseProjection.centro_appartenenza_attuale___associables", 0) + 1);
            this.centro_appartenenza_attuale___associables(new CentroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroPageResponseProjection.centro_appartenenza_attuale___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroResponseProjection.centro_appartenenza_attuale", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.CentroResponseProjection.centro_appartenenza_attuale", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroResponseProjection.centro_appartenenza_attuale", 0) + 1);
            this.centro_appartenenza_attuale(new CentroResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.CentroResponseProjection.centro_appartenenza_attuale", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.ChecksPageResponseProjection.checks____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks____associables", 0) + 1);
            this.checks____associables(new ChecksPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.ChecksPageResponseProjection.checks_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks_", 0) + 1);
            this.checks_(new ChecksPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.ChecksPageResponseProjection.checks_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Codice_studioPageResponseProjection.codice_studio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Codice_studioPageResponseProjection.codice_studio_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Codice_studioPageResponseProjection.codice_studio_", 0) + 1);
            this.codice_studio_(new Codice_studioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Codice_studioPageResponseProjection.codice_studio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaPageResponseProjection.condizione_lavorativa___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Condizione_lavorativaPageResponseProjection.condizione_lavorativa___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaPageResponseProjection.condizione_lavorativa___associables", 0) + 1);
            this.condizione_lavorativa___associables(new Condizione_lavorativaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaPageResponseProjection.condizione_lavorativa___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaResponseProjection.condizione_lavorativa", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Condizione_lavorativaResponseProjection.condizione_lavorativa", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaResponseProjection.condizione_lavorativa", 0) + 1);
            this.condizione_lavorativa(new Condizione_lavorativaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Condizione_lavorativaResponseProjection.condizione_lavorativa", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Controllo_clinicoPageResponseProjection.controllo_clinico", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Controllo_clinicoPageResponseProjection.controllo_clinico", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Controllo_clinicoPageResponseProjection.controllo_clinico", 0) + 1);
            this.controllo_clinico(new Controllo_clinicoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Controllo_clinicoPageResponseProjection.controllo_clinico", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.DropoutPageResponseProjection.dropout", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.DropoutPageResponseProjection.dropout", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.DropoutPageResponseProjection.dropout", 0) + 1);
            this.dropout(new DropoutPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.DropoutPageResponseProjection.dropout", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Esame_strumentalePageResponseProjection.esame_strumentale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Esame_strumentalePageResponseProjection.esame_strumentale_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Esame_strumentalePageResponseProjection.esame_strumentale_", 0) + 1);
            this.esame_strumentale_(new Esame_strumentalePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Esame_strumentalePageResponseProjection.esame_strumentale_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaPageResponseProjection.etnia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.EtniaPageResponseProjection.etnia___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaPageResponseProjection.etnia___associables", 0) + 1);
            this.etnia___associables(new EtniaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaPageResponseProjection.etnia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaResponseProjection.etnia", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.EtniaResponseProjection.etnia", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaResponseProjection.etnia", 0) + 1);
            this.etnia(new EtniaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EtniaResponseProjection.etnia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EventoPageResponseProjection.evento", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.EventoPageResponseProjection.evento", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EventoPageResponseProjection.evento", 0) + 1);
            this.evento(new EventoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.EventoPageResponseProjection.evento", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Evento_epaticoPageResponseProjection.evento_epatico_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Evento_epaticoPageResponseProjection.evento_epatico_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Evento_epaticoPageResponseProjection.evento_epatico_", 0) + 1);
            this.evento_epatico_(new Evento_epaticoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Evento_epaticoPageResponseProjection.evento_epatico_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioPageResponseProjection.fattore_di_rischio___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Fattore_di_rischioPageResponseProjection.fattore_di_rischio___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioPageResponseProjection.fattore_di_rischio___associables", 0) + 1);
            this.fattore_di_rischio___associables(new Fattore_di_rischioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioPageResponseProjection.fattore_di_rischio___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioResponseProjection.fattore_di_rischio", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Fattore_di_rischioResponseProjection.fattore_di_rischio", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioResponseProjection.fattore_di_rischio", 0) + 1);
            this.fattore_di_rischio(new Fattore_di_rischioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Fattore_di_rischioResponseProjection.fattore_di_rischio", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertPageResponseProjection.gilbert____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.GilbertPageResponseProjection.gilbert____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertPageResponseProjection.gilbert____associables", 0) + 1);
            this.gilbert____associables(new GilbertPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertPageResponseProjection.gilbert____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertResponseProjection.gilbert_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.GilbertResponseProjection.gilbert_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertResponseProjection.gilbert_", 0) + 1);
            this.gilbert_(new GilbertResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GilbertResponseProjection.gilbert_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GravidanzaPageResponseProjection.gravidanza_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.GravidanzaPageResponseProjection.gravidanza_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GravidanzaPageResponseProjection.gravidanza_", 0) + 1);
            this.gravidanza_(new GravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.GravidanzaPageResponseProjection.gravidanza_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0) + 1);
            this.identita_genere____associables(new Identita_generePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_generePageResponseProjection.identita_genere____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0) + 1);
            this.identita_genere_(new Identita_genereResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Identita_genereResponseProjection.identita_genere_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0) + 1);
            this.l_dettaglio_(new L_dettaglioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.L_dettaglioPageResponseProjection.l_dettaglio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HBVPageResponseProjection.markers_HBV", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Markers_HBVPageResponseProjection.markers_HBV", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HBVPageResponseProjection.markers_HBV", 0) + 1);
            this.markers_HBV(new Markers_HBVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HBVPageResponseProjection.markers_HBV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HCVPageResponseProjection.markers_HCV", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Markers_HCVPageResponseProjection.markers_HCV", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HCVPageResponseProjection.markers_HCV", 0) + 1);
            this.markers_HCV(new Markers_HCVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HCVPageResponseProjection.markers_HCV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0) + 1);
            this.markers_HDV_(new Markers_HDVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HDVPageResponseProjection.markers_HDV_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HIVPageResponseProjection.markers_HIV", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Markers_HIVPageResponseProjection.markers_HIV", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HIVPageResponseProjection.markers_HIV", 0) + 1);
            this.markers_HIV(new Markers_HIVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_HIVPageResponseProjection.markers_HIV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_altriPageResponseProjection.markers_altri_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Markers_altriPageResponseProjection.markers_altri_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_altriPageResponseProjection.markers_altri_", 0) + 1);
            this.markers_altri_(new Markers_altriPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Markers_altriPageResponseProjection.markers_altri_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazionePageResponseProjection.nazione____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.NazionePageResponseProjection.nazione____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazionePageResponseProjection.nazione____associables", 0) + 1);
            this.nazione____associables(new NazionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazionePageResponseProjection.nazione____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazioneResponseProjection.nazione_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.NazioneResponseProjection.nazione_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazioneResponseProjection.nazione_", 0) + 1);
            this.nazione_(new NazioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.NazioneResponseProjection.nazione_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PROPageResponseProjection.questionario_PRO_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Questionario_PROPageResponseProjection.questionario_PRO_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PROPageResponseProjection.questionario_PRO_", 0) + 1);
            this.questionario_PRO_(new Questionario_PROPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PROPageResponseProjection.questionario_PRO_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app", 0) + 1);
            this.questionario_PRO_app(new Questionario_PRO_appPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Questionario_PRO_appPageResponseProjection.questionario_PRO_app", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegionePageResponseProjection.regione____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.RegionePageResponseProjection.regione____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegionePageResponseProjection.regione____associables", 0) + 1);
            this.regione____associables(new RegionePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegionePageResponseProjection.regione____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegioneResponseProjection.regione_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.RegioneResponseProjection.regione_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegioneResponseProjection.regione_", 0) + 1);
            this.regione_(new RegioneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RegioneResponseProjection.regione_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RicoveroPageResponseProjection.ricovero", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.RicoveroPageResponseProjection.ricovero", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RicoveroPageResponseProjection.ricovero", 0) + 1);
            this.ricovero(new RicoveroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.RicoveroPageResponseProjection.ricovero", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.SVRPageResponseProjection.sVR_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.SVRPageResponseProjection.sVR_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.SVRPageResponseProjection.sVR_", 0) + 1);
            this.sVR_(new SVRPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.SVRPageResponseProjection.sVR_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica___associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica___associables", 0) + 1);
            this.sequenza_genomica___associables(new Sequenza_genomicaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica", 0) + 1);
            this.sequenza_genomica(new Sequenza_genomicaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Sequenza_genomicaPageResponseProjection.sequenza_genomica", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0) + 1);
            this.studio_questionario____associables(new Studio_questionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0) + 1);
            this.studio_questionario_(new Studio_questionarioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Studio_questionarioPageResponseProjection.studio_questionario_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0) + 1);
            this.terapia_ARV(new Terapia_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_altro", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_altro", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_altro", 0) + 1);
            this.terapia_altro(new Terapia_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_altro", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_epatica", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_epatica", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_epatica", 0) + 1);
            this.terapia_epatica(new Terapia_altroPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Terapia_altroPageResponseProjection.terapia_epatica", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0) + 1);
            this.trattamento_antitumorale_(new Trattamento_antitumoralePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Trattamento_antitumoralePageResponseProjection.trattamento_antitumorale_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0) + 1);
            this.v_dettaglio_(new V_dettaglioResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.V_dettaglioResponseProjection.v_dettaglio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Visita_mpvPageResponseProjection.visita_mpv_", 0) <= maxDepth) {
            projectionDepthOnFields.put("PazienteResponseProjection.Visita_mpvPageResponseProjection.visita_mpv_", projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Visita_mpvPageResponseProjection.visita_mpv_", 0) + 1);
            this.visita_mpv_(new Visita_mpvPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PazienteResponseProjection.Visita_mpvPageResponseProjection.visita_mpv_", 0)));
        }
        this.typename();
        return this;
    }

    public PazienteResponseProjection _clientId() {
        return _clientId(null);
    }

    public PazienteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public PazienteResponseProjection IL28B() {
        return IL28B(null);
    }

    public PazienteResponseProjection IL28B(String alias) {
        add$(new GraphQLResponseField("IL28B").alias(alias));
        return this;
    }

    public PazienteResponseProjection _createdon() {
        return _createdon(null);
    }

    public PazienteResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public PazienteResponseProjection _id() {
        return _id(null);
    }

    public PazienteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public PazienteResponseProjection altezza() {
        return altezza(null);
    }

    public PazienteResponseProjection altezza(String alias) {
        add$(new GraphQLResponseField("altezza").alias(alias));
        return this;
    }

    public PazienteResponseProjection altro_fattore_di_rischio() {
        return altro_fattore_di_rischio(null);
    }

    public PazienteResponseProjection altro_fattore_di_rischio(String alias) {
        add$(new GraphQLResponseField("altro_fattore_di_rischio").alias(alias));
        return this;
    }

    public PazienteResponseProjection anno_nascita() {
        return anno_nascita(null);
    }

    public PazienteResponseProjection anno_nascita(String alias) {
        add$(new GraphQLResponseField("anno_nascita").alias(alias));
        return this;
    }

    public PazienteResponseProjection checks() {
        return checks(null);
    }

    public PazienteResponseProjection checks(String alias) {
        add$(new GraphQLResponseField("checks").alias(alias));
        return this;
    }

    public PazienteResponseProjection codice_arca() {
        return codice_arca(null);
    }

    public PazienteResponseProjection codice_arca(String alias) {
        add$(new GraphQLResponseField("codice_arca").alias(alias));
        return this;
    }

    public PazienteResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public PazienteResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public PazienteResponseProjection codice_interno() {
        return codice_interno(null);
    }

    public PazienteResponseProjection codice_interno(String alias) {
        add$(new GraphQLResponseField("codice_interno").alias(alias));
        return this;
    }

    public PazienteResponseProjection codici_studi() {
        return codici_studi(null);
    }

    public PazienteResponseProjection codici_studi(String alias) {
        add$(new GraphQLResponseField("codici_studi").alias(alias));
        return this;
    }

    public PazienteResponseProjection comune_di_nascita() {
        return comune_di_nascita(null);
    }

    public PazienteResponseProjection comune_di_nascita(String alias) {
        add$(new GraphQLResponseField("comune_di_nascita").alias(alias));
        return this;
    }

    public PazienteResponseProjection coorte_respond() {
        return coorte_respond(null);
    }

    public PazienteResponseProjection coorte_respond(String alias) {
        add$(new GraphQLResponseField("coorte_respond").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_consenso() {
        return data_consenso(null);
    }

    public PazienteResponseProjection data_consenso(String alias) {
        add$(new GraphQLResponseField("data_consenso").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_consenso_pro() {
        return data_consenso_pro(null);
    }

    public PazienteResponseProjection data_consenso_pro(String alias) {
        add$(new GraphQLResponseField("data_consenso_pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_decesso() {
        return data_decesso(null);
    }

    public PazienteResponseProjection data_decesso(String alias) {
        add$(new GraphQLResponseField("data_decesso").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_fine_terapia_ormonale() {
        return data_fine_terapia_ormonale(null);
    }

    public PazienteResponseProjection data_fine_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_fine_terapia_ormonale").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_gilbert() {
        return data_gilbert(null);
    }

    public PazienteResponseProjection data_gilbert(String alias) {
        add$(new GraphQLResponseField("data_gilbert").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_hla() {
        return data_hla(null);
    }

    public PazienteResponseProjection data_hla(String alias) {
        add$(new GraphQLResponseField("data_hla").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_il28() {
        return data_il28(null);
    }

    public PazienteResponseProjection data_il28(String alias) {
        add$(new GraphQLResponseField("data_il28").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_inizio_terapia_ormonale() {
        return data_inizio_terapia_ormonale(null);
    }

    public PazienteResponseProjection data_inizio_terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("data_inizio_terapia_ormonale").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_menopausa() {
        return data_menopausa(null);
    }

    public PazienteResponseProjection data_menopausa(String alias) {
        add$(new GraphQLResponseField("data_menopausa").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_prima_ARV() {
        return data_prima_ARV(null);
    }

    public PazienteResponseProjection data_prima_ARV(String alias) {
        add$(new GraphQLResponseField("data_prima_ARV").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_prima_dose() {
        return data_prima_dose(null);
    }

    public PazienteResponseProjection data_prima_dose(String alias) {
        add$(new GraphQLResponseField("data_prima_dose").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_prima_terapia_anti_hcv() {
        return data_prima_terapia_anti_hcv(null);
    }

    public PazienteResponseProjection data_prima_terapia_anti_hcv(String alias) {
        add$(new GraphQLResponseField("data_prima_terapia_anti_hcv").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_prima_visita() {
        return data_prima_visita(null);
    }

    public PazienteResponseProjection data_prima_visita(String alias) {
        add$(new GraphQLResponseField("data_prima_visita").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_primo_hcvab_pos() {
        return data_primo_hcvab_pos(null);
    }

    public PazienteResponseProjection data_primo_hcvab_pos(String alias) {
        add$(new GraphQLResponseField("data_primo_hcvab_pos").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_ultima_visita() {
        return data_ultima_visita(null);
    }

    public PazienteResponseProjection data_ultima_visita(String alias) {
        add$(new GraphQLResponseField("data_ultima_visita").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_ultimo_HCVAb_pre_arr() {
        return data_ultimo_HCVAb_pre_arr(null);
    }

    public PazienteResponseProjection data_ultimo_HCVAb_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HCVAb_pre_arr").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_ultimo_HbsAg_pre_arr() {
        return data_ultimo_HbsAg_pre_arr(null);
    }

    public PazienteResponseProjection data_ultimo_HbsAg_pre_arr(String alias) {
        add$(new GraphQLResponseField("data_ultimo_HbsAg_pre_arr").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_ultimo_drop() {
        return data_ultimo_drop(null);
    }

    public PazienteResponseProjection data_ultimo_drop(String alias) {
        add$(new GraphQLResponseField("data_ultimo_drop").alias(alias));
        return this;
    }

    public PazienteResponseProjection data_ultimo_marker_hiv() {
        return data_ultimo_marker_hiv(null);
    }

    public PazienteResponseProjection data_ultimo_marker_hiv(String alias) {
        add$(new GraphQLResponseField("data_ultimo_marker_hiv").alias(alias));
        return this;
    }

    public PazienteResponseProjection date_longicona() {
        return date_longicona(null);
    }

    public PazienteResponseProjection date_longicona(String alias) {
        add$(new GraphQLResponseField("date_longicona").alias(alias));
        return this;
    }

    public PazienteResponseProjection esito_ultima_terapia() {
        return esito_ultima_terapia(null);
    }

    public PazienteResponseProjection esito_ultima_terapia(String alias) {
        add$(new GraphQLResponseField("esito_ultima_terapia").alias(alias));
        return this;
    }

    public PazienteResponseProjection eta_arruolamento() {
        return eta_arruolamento(null);
    }

    public PazienteResponseProjection eta_arruolamento(String alias) {
        add$(new GraphQLResponseField("eta_arruolamento").alias(alias));
        return this;
    }

    public PazienteResponseProjection etnia_() {
        return etnia_(null);
    }

    public PazienteResponseProjection etnia_(String alias) {
        add$(new GraphQLResponseField("etnia_").alias(alias));
        return this;
    }

    public PazienteResponseProjection farmaci() {
        return farmaci(null);
    }

    public PazienteResponseProjection farmaci(String alias) {
        add$(new GraphQLResponseField("farmaci").alias(alias));
        return this;
    }

    public PazienteResponseProjection fattore_di_rischio_() {
        return fattore_di_rischio_(null);
    }

    public PazienteResponseProjection fattore_di_rischio_(String alias) {
        add$(new GraphQLResponseField("fattore_di_rischio_").alias(alias));
        return this;
    }

    public PazienteResponseProjection hbsag_pos() {
        return hbsag_pos(null);
    }

    public PazienteResponseProjection hbsag_pos(String alias) {
        add$(new GraphQLResponseField("hbsag_pos").alias(alias));
        return this;
    }

    public PazienteResponseProjection hcvab_pos() {
        return hcvab_pos(null);
    }

    public PazienteResponseProjection hcvab_pos(String alias) {
        add$(new GraphQLResponseField("hcvab_pos").alias(alias));
        return this;
    }

    public PazienteResponseProjection hla_b5701() {
        return hla_b5701(null);
    }

    public PazienteResponseProjection hla_b5701(String alias) {
        add$(new GraphQLResponseField("hla_b5701").alias(alias));
        return this;
    }

    public PazienteResponseProjection hla_b5701_bool() {
        return hla_b5701_bool(null);
    }

    public PazienteResponseProjection hla_b5701_bool(String alias) {
        add$(new GraphQLResponseField("hla_b5701_bool").alias(alias));
        return this;
    }

    public PazienteResponseProjection id_respond() {
        return id_respond(null);
    }

    public PazienteResponseProjection id_respond(String alias) {
        add$(new GraphQLResponseField("id_respond").alias(alias));
        return this;
    }

    public PazienteResponseProjection ifn() {
        return ifn(null);
    }

    public PazienteResponseProjection ifn(String alias) {
        add$(new GraphQLResponseField("ifn").alias(alias));
        return this;
    }

    public PazienteResponseProjection in_italia_da_anni() {
        return in_italia_da_anni(null);
    }

    public PazienteResponseProjection in_italia_da_anni(String alias) {
        add$(new GraphQLResponseField("in_italia_da_anni").alias(alias));
        return this;
    }

    public PazienteResponseProjection nazionalita_() {
        return nazionalita_(null);
    }

    public PazienteResponseProjection nazionalita_(String alias) {
        add$(new GraphQLResponseField("nazionalita_").alias(alias));
        return this;
    }

    public PazienteResponseProjection nazione() {
        return nazione(null);
    }

    public PazienteResponseProjection nazione(String alias) {
        add$(new GraphQLResponseField("nazione").alias(alias));
        return this;
    }

    public PazienteResponseProjection note_terapia() {
        return note_terapia(null);
    }

    public PazienteResponseProjection note_terapia(String alias) {
        add$(new GraphQLResponseField("note_terapia").alias(alias));
        return this;
    }

    public PazienteResponseProjection null_val() {
        return null_val(null);
    }

    public PazienteResponseProjection null_val(String alias) {
        add$(new GraphQLResponseField("null_val").alias(alias));
        return this;
    }

    public PazienteResponseProjection password_pro() {
        return password_pro(null);
    }

    public PazienteResponseProjection password_pro(String alias) {
        add$(new GraphQLResponseField("password_pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection pegifn() {
        return pegifn(null);
    }

    public PazienteResponseProjection pegifn(String alias) {
        add$(new GraphQLResponseField("pegifn").alias(alias));
        return this;
    }

    public PazienteResponseProjection pregresse_terapie_anti_hcv() {
        return pregresse_terapie_anti_hcv(null);
    }

    public PazienteResponseProjection pregresse_terapie_anti_hcv(String alias) {
        add$(new GraphQLResponseField("pregresse_terapie_anti_hcv").alias(alias));
        return this;
    }

    public PazienteResponseProjection pride() {
        return pride(null);
    }

    public PazienteResponseProjection pride(String alias) {
        add$(new GraphQLResponseField("pride").alias(alias));
        return this;
    }

    public PazienteResponseProjection pro() {
        return pro(null);
    }

    public PazienteResponseProjection pro(String alias) {
        add$(new GraphQLResponseField("pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection ribavirina() {
        return ribavirina(null);
    }

    public PazienteResponseProjection ribavirina(String alias) {
        add$(new GraphQLResponseField("ribavirina").alias(alias));
        return this;
    }

    public PazienteResponseProjection sessione_pro() {
        return sessione_pro(null);
    }

    public PazienteResponseProjection sessione_pro(String alias) {
        add$(new GraphQLResponseField("sessione_pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection sesso() {
        return sesso(null);
    }

    public PazienteResponseProjection sesso(String alias) {
        add$(new GraphQLResponseField("sesso").alias(alias));
        return this;
    }

    public PazienteResponseProjection sex_worker() {
        return sex_worker(null);
    }

    public PazienteResponseProjection sex_worker(String alias) {
        add$(new GraphQLResponseField("sex_worker").alias(alias));
        return this;
    }

    public PazienteResponseProjection studi_pro_abilitati() {
        return studi_pro_abilitati(null);
    }

    public PazienteResponseProjection studi_pro_abilitati(String alias) {
        add$(new GraphQLResponseField("studi_pro_abilitati").alias(alias));
        return this;
    }

    public PazienteResponseProjection team() {
        return team(null);
    }

    public PazienteResponseProjection team(String alias) {
        add$(new GraphQLResponseField("team").alias(alias));
        return this;
    }

    public PazienteResponseProjection terapia_ormonale() {
        return terapia_ormonale(null);
    }

    public PazienteResponseProjection terapia_ormonale(String alias) {
        add$(new GraphQLResponseField("terapia_ormonale").alias(alias));
        return this;
    }

    public PazienteResponseProjection token_notifiche_pro() {
        return token_notifiche_pro(null);
    }

    public PazienteResponseProjection token_notifiche_pro(String alias) {
        add$(new GraphQLResponseField("token_notifiche_pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection trasferito() {
        return trasferito(null);
    }

    public PazienteResponseProjection trasferito(String alias) {
        add$(new GraphQLResponseField("trasferito").alias(alias));
        return this;
    }

    public PazienteResponseProjection username_pro() {
        return username_pro(null);
    }

    public PazienteResponseProjection username_pro(String alias) {
        add$(new GraphQLResponseField("username_pro").alias(alias));
        return this;
    }

    public PazienteResponseProjection vax_controllo_clinico() {
        return vax_controllo_clinico(null);
    }

    public PazienteResponseProjection vax_controllo_clinico(String alias) {
        add$(new GraphQLResponseField("vax_controllo_clinico").alias(alias));
        return this;
    }

    public PazienteResponseProjection anamnesi(AnamnesiResponseProjection subProjection) {
        return anamnesi(null, subProjection);
    }

    public PazienteResponseProjection anamnesi(String alias, AnamnesiResponseProjection subProjection) {
        add$(new GraphQLResponseField("anamnesi").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection c_dettaglio_(C_dettaglioResponseProjection subProjection) {
        return c_dettaglio_(null, subProjection);
    }

    public PazienteResponseProjection c_dettaglio_(String alias, C_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("c_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection campione_old___associables(Campione_oldPageResponseProjection subProjection) {
        return campione_old___associables((String)null, subProjection);
    }

    public PazienteResponseProjection campione_old___associables(String alias, Campione_oldPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("campione_old___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection campione_old___associables(PazienteCampione_old___associablesParametrizedInput input, Campione_oldPageResponseProjection subProjection) {
        return campione_old___associables(null, input, subProjection);
    }

    public PazienteResponseProjection campione_old___associables(String alias, PazienteCampione_old___associablesParametrizedInput input, Campione_oldPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("campione_old___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection campione_old(Campione_oldPageResponseProjection subProjection) {
        return campione_old((String)null, subProjection);
    }

    public PazienteResponseProjection campione_old(String alias, Campione_oldPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("campione_old").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection campione_old(PazienteCampione_oldParametrizedInput input, Campione_oldPageResponseProjection subProjection) {
        return campione_old(null, input, subProjection);
    }

    public PazienteResponseProjection campione_old(String alias, PazienteCampione_oldParametrizedInput input, Campione_oldPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("campione_old").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection centro_appartenenza_attuale___associables(CentroPageResponseProjection subProjection) {
        return centro_appartenenza_attuale___associables((String)null, subProjection);
    }

    public PazienteResponseProjection centro_appartenenza_attuale___associables(String alias, CentroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_appartenenza_attuale___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection centro_appartenenza_attuale___associables(PazienteCentro_appartenenza_attuale___associablesParametrizedInput input, CentroPageResponseProjection subProjection) {
        return centro_appartenenza_attuale___associables(null, input, subProjection);
    }

    public PazienteResponseProjection centro_appartenenza_attuale___associables(String alias, PazienteCentro_appartenenza_attuale___associablesParametrizedInput input, CentroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_appartenenza_attuale___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection centro_appartenenza_attuale(CentroResponseProjection subProjection) {
        return centro_appartenenza_attuale(null, subProjection);
    }

    public PazienteResponseProjection centro_appartenenza_attuale(String alias, CentroResponseProjection subProjection) {
        add$(new GraphQLResponseField("centro_appartenenza_attuale").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection checks____associables(ChecksPageResponseProjection subProjection) {
        return checks____associables((String)null, subProjection);
    }

    public PazienteResponseProjection checks____associables(String alias, ChecksPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("checks____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection checks____associables(PazienteChecks____associablesParametrizedInput input, ChecksPageResponseProjection subProjection) {
        return checks____associables(null, input, subProjection);
    }

    public PazienteResponseProjection checks____associables(String alias, PazienteChecks____associablesParametrizedInput input, ChecksPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("checks____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection checks_(ChecksPageResponseProjection subProjection) {
        return checks_((String)null, subProjection);
    }

    public PazienteResponseProjection checks_(String alias, ChecksPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("checks_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection checks_(PazienteChecks_ParametrizedInput input, ChecksPageResponseProjection subProjection) {
        return checks_(null, input, subProjection);
    }

    public PazienteResponseProjection checks_(String alias, PazienteChecks_ParametrizedInput input, ChecksPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("checks_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection codice_studio_(Codice_studioPageResponseProjection subProjection) {
        return codice_studio_((String)null, subProjection);
    }

    public PazienteResponseProjection codice_studio_(String alias, Codice_studioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("codice_studio_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection codice_studio_(PazienteCodice_studio_ParametrizedInput input, Codice_studioPageResponseProjection subProjection) {
        return codice_studio_(null, input, subProjection);
    }

    public PazienteResponseProjection codice_studio_(String alias, PazienteCodice_studio_ParametrizedInput input, Codice_studioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("codice_studio_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection condizione_lavorativa___associables(Condizione_lavorativaPageResponseProjection subProjection) {
        return condizione_lavorativa___associables((String)null, subProjection);
    }

    public PazienteResponseProjection condizione_lavorativa___associables(String alias, Condizione_lavorativaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("condizione_lavorativa___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection condizione_lavorativa___associables(PazienteCondizione_lavorativa___associablesParametrizedInput input, Condizione_lavorativaPageResponseProjection subProjection) {
        return condizione_lavorativa___associables(null, input, subProjection);
    }

    public PazienteResponseProjection condizione_lavorativa___associables(String alias, PazienteCondizione_lavorativa___associablesParametrizedInput input, Condizione_lavorativaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("condizione_lavorativa___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection condizione_lavorativa(Condizione_lavorativaResponseProjection subProjection) {
        return condizione_lavorativa(null, subProjection);
    }

    public PazienteResponseProjection condizione_lavorativa(String alias, Condizione_lavorativaResponseProjection subProjection) {
        add$(new GraphQLResponseField("condizione_lavorativa").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection controllo_clinico(Controllo_clinicoPageResponseProjection subProjection) {
        return controllo_clinico((String)null, subProjection);
    }

    public PazienteResponseProjection controllo_clinico(String alias, Controllo_clinicoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("controllo_clinico").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection controllo_clinico(PazienteControllo_clinicoParametrizedInput input, Controllo_clinicoPageResponseProjection subProjection) {
        return controllo_clinico(null, input, subProjection);
    }

    public PazienteResponseProjection controllo_clinico(String alias, PazienteControllo_clinicoParametrizedInput input, Controllo_clinicoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("controllo_clinico").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection dropout(DropoutPageResponseProjection subProjection) {
        return dropout((String)null, subProjection);
    }

    public PazienteResponseProjection dropout(String alias, DropoutPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dropout").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection dropout(PazienteDropoutParametrizedInput input, DropoutPageResponseProjection subProjection) {
        return dropout(null, input, subProjection);
    }

    public PazienteResponseProjection dropout(String alias, PazienteDropoutParametrizedInput input, DropoutPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dropout").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection esame_strumentale_(Esame_strumentalePageResponseProjection subProjection) {
        return esame_strumentale_((String)null, subProjection);
    }

    public PazienteResponseProjection esame_strumentale_(String alias, Esame_strumentalePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esame_strumentale_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection esame_strumentale_(PazienteEsame_strumentale_ParametrizedInput input, Esame_strumentalePageResponseProjection subProjection) {
        return esame_strumentale_(null, input, subProjection);
    }

    public PazienteResponseProjection esame_strumentale_(String alias, PazienteEsame_strumentale_ParametrizedInput input, Esame_strumentalePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esame_strumentale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection etnia___associables(EtniaPageResponseProjection subProjection) {
        return etnia___associables((String)null, subProjection);
    }

    public PazienteResponseProjection etnia___associables(String alias, EtniaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("etnia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection etnia___associables(PazienteEtnia___associablesParametrizedInput input, EtniaPageResponseProjection subProjection) {
        return etnia___associables(null, input, subProjection);
    }

    public PazienteResponseProjection etnia___associables(String alias, PazienteEtnia___associablesParametrizedInput input, EtniaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("etnia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection etnia(EtniaResponseProjection subProjection) {
        return etnia(null, subProjection);
    }

    public PazienteResponseProjection etnia(String alias, EtniaResponseProjection subProjection) {
        add$(new GraphQLResponseField("etnia").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection evento(EventoPageResponseProjection subProjection) {
        return evento((String)null, subProjection);
    }

    public PazienteResponseProjection evento(String alias, EventoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection evento(PazienteEventoParametrizedInput input, EventoPageResponseProjection subProjection) {
        return evento(null, input, subProjection);
    }

    public PazienteResponseProjection evento(String alias, PazienteEventoParametrizedInput input, EventoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection evento_epatico_(Evento_epaticoPageResponseProjection subProjection) {
        return evento_epatico_((String)null, subProjection);
    }

    public PazienteResponseProjection evento_epatico_(String alias, Evento_epaticoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento_epatico_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection evento_epatico_(PazienteEvento_epatico_ParametrizedInput input, Evento_epaticoPageResponseProjection subProjection) {
        return evento_epatico_(null, input, subProjection);
    }

    public PazienteResponseProjection evento_epatico_(String alias, PazienteEvento_epatico_ParametrizedInput input, Evento_epaticoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("evento_epatico_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection fattore_di_rischio___associables(Fattore_di_rischioPageResponseProjection subProjection) {
        return fattore_di_rischio___associables((String)null, subProjection);
    }

    public PazienteResponseProjection fattore_di_rischio___associables(String alias, Fattore_di_rischioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("fattore_di_rischio___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection fattore_di_rischio___associables(PazienteFattore_di_rischio___associablesParametrizedInput input, Fattore_di_rischioPageResponseProjection subProjection) {
        return fattore_di_rischio___associables(null, input, subProjection);
    }

    public PazienteResponseProjection fattore_di_rischio___associables(String alias, PazienteFattore_di_rischio___associablesParametrizedInput input, Fattore_di_rischioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("fattore_di_rischio___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection fattore_di_rischio(Fattore_di_rischioResponseProjection subProjection) {
        return fattore_di_rischio(null, subProjection);
    }

    public PazienteResponseProjection fattore_di_rischio(String alias, Fattore_di_rischioResponseProjection subProjection) {
        add$(new GraphQLResponseField("fattore_di_rischio").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection gilbert____associables(GilbertPageResponseProjection subProjection) {
        return gilbert____associables((String)null, subProjection);
    }

    public PazienteResponseProjection gilbert____associables(String alias, GilbertPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gilbert____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection gilbert____associables(PazienteGilbert____associablesParametrizedInput input, GilbertPageResponseProjection subProjection) {
        return gilbert____associables(null, input, subProjection);
    }

    public PazienteResponseProjection gilbert____associables(String alias, PazienteGilbert____associablesParametrizedInput input, GilbertPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gilbert____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection gilbert_(GilbertResponseProjection subProjection) {
        return gilbert_(null, subProjection);
    }

    public PazienteResponseProjection gilbert_(String alias, GilbertResponseProjection subProjection) {
        add$(new GraphQLResponseField("gilbert_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection gravidanza_(GravidanzaPageResponseProjection subProjection) {
        return gravidanza_((String)null, subProjection);
    }

    public PazienteResponseProjection gravidanza_(String alias, GravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gravidanza_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection gravidanza_(PazienteGravidanza_ParametrizedInput input, GravidanzaPageResponseProjection subProjection) {
        return gravidanza_(null, input, subProjection);
    }

    public PazienteResponseProjection gravidanza_(String alias, PazienteGravidanza_ParametrizedInput input, GravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("gravidanza_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection identita_genere____associables(Identita_generePageResponseProjection subProjection) {
        return identita_genere____associables((String)null, subProjection);
    }

    public PazienteResponseProjection identita_genere____associables(String alias, Identita_generePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection identita_genere____associables(PazienteIdentita_genere____associablesParametrizedInput input, Identita_generePageResponseProjection subProjection) {
        return identita_genere____associables(null, input, subProjection);
    }

    public PazienteResponseProjection identita_genere____associables(String alias, PazienteIdentita_genere____associablesParametrizedInput input, Identita_generePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection identita_genere_(Identita_genereResponseProjection subProjection) {
        return identita_genere_(null, subProjection);
    }

    public PazienteResponseProjection identita_genere_(String alias, Identita_genereResponseProjection subProjection) {
        add$(new GraphQLResponseField("identita_genere_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection l_dettaglio_(L_dettaglioPageResponseProjection subProjection) {
        return l_dettaglio_((String)null, subProjection);
    }

    public PazienteResponseProjection l_dettaglio_(String alias, L_dettaglioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("l_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection l_dettaglio_(PazienteL_dettaglio_ParametrizedInput input, L_dettaglioPageResponseProjection subProjection) {
        return l_dettaglio_(null, input, subProjection);
    }

    public PazienteResponseProjection l_dettaglio_(String alias, PazienteL_dettaglio_ParametrizedInput input, L_dettaglioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("l_dettaglio_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HBV(Markers_HBVPageResponseProjection subProjection) {
        return markers_HBV((String)null, subProjection);
    }

    public PazienteResponseProjection markers_HBV(String alias, Markers_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HBV").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HBV(PazienteMarkers_HBVParametrizedInput input, Markers_HBVPageResponseProjection subProjection) {
        return markers_HBV(null, input, subProjection);
    }

    public PazienteResponseProjection markers_HBV(String alias, PazienteMarkers_HBVParametrizedInput input, Markers_HBVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HBV").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HCV(Markers_HCVPageResponseProjection subProjection) {
        return markers_HCV((String)null, subProjection);
    }

    public PazienteResponseProjection markers_HCV(String alias, Markers_HCVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HCV").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HCV(PazienteMarkers_HCVParametrizedInput input, Markers_HCVPageResponseProjection subProjection) {
        return markers_HCV(null, input, subProjection);
    }

    public PazienteResponseProjection markers_HCV(String alias, PazienteMarkers_HCVParametrizedInput input, Markers_HCVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HCV").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HDV_(Markers_HDVPageResponseProjection subProjection) {
        return markers_HDV_((String)null, subProjection);
    }

    public PazienteResponseProjection markers_HDV_(String alias, Markers_HDVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HDV_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HDV_(PazienteMarkers_HDV_ParametrizedInput input, Markers_HDVPageResponseProjection subProjection) {
        return markers_HDV_(null, input, subProjection);
    }

    public PazienteResponseProjection markers_HDV_(String alias, PazienteMarkers_HDV_ParametrizedInput input, Markers_HDVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HDV_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HIV(Markers_HIVPageResponseProjection subProjection) {
        return markers_HIV((String)null, subProjection);
    }

    public PazienteResponseProjection markers_HIV(String alias, Markers_HIVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HIV").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_HIV(PazienteMarkers_HIVParametrizedInput input, Markers_HIVPageResponseProjection subProjection) {
        return markers_HIV(null, input, subProjection);
    }

    public PazienteResponseProjection markers_HIV(String alias, PazienteMarkers_HIVParametrizedInput input, Markers_HIVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_HIV").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_altri_(Markers_altriPageResponseProjection subProjection) {
        return markers_altri_((String)null, subProjection);
    }

    public PazienteResponseProjection markers_altri_(String alias, Markers_altriPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_altri_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection markers_altri_(PazienteMarkers_altri_ParametrizedInput input, Markers_altriPageResponseProjection subProjection) {
        return markers_altri_(null, input, subProjection);
    }

    public PazienteResponseProjection markers_altri_(String alias, PazienteMarkers_altri_ParametrizedInput input, Markers_altriPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("markers_altri_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection nazione____associables(NazionePageResponseProjection subProjection) {
        return nazione____associables((String)null, subProjection);
    }

    public PazienteResponseProjection nazione____associables(String alias, NazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("nazione____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection nazione____associables(PazienteNazione____associablesParametrizedInput input, NazionePageResponseProjection subProjection) {
        return nazione____associables(null, input, subProjection);
    }

    public PazienteResponseProjection nazione____associables(String alias, PazienteNazione____associablesParametrizedInput input, NazionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("nazione____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection nazione_(NazioneResponseProjection subProjection) {
        return nazione_(null, subProjection);
    }

    public PazienteResponseProjection nazione_(String alias, NazioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("nazione_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection questionario_PRO_(Questionario_PROPageResponseProjection subProjection) {
        return questionario_PRO_((String)null, subProjection);
    }

    public PazienteResponseProjection questionario_PRO_(String alias, Questionario_PROPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection questionario_PRO_(PazienteQuestionario_PRO_ParametrizedInput input, Questionario_PROPageResponseProjection subProjection) {
        return questionario_PRO_(null, input, subProjection);
    }

    public PazienteResponseProjection questionario_PRO_(String alias, PazienteQuestionario_PRO_ParametrizedInput input, Questionario_PROPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection questionario_PRO_app(Questionario_PRO_appPageResponseProjection subProjection) {
        return questionario_PRO_app((String)null, subProjection);
    }

    public PazienteResponseProjection questionario_PRO_app(String alias, Questionario_PRO_appPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_app").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection questionario_PRO_app(PazienteQuestionario_PRO_appParametrizedInput input, Questionario_PRO_appPageResponseProjection subProjection) {
        return questionario_PRO_app(null, input, subProjection);
    }

    public PazienteResponseProjection questionario_PRO_app(String alias, PazienteQuestionario_PRO_appParametrizedInput input, Questionario_PRO_appPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("questionario_PRO_app").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection regione____associables(RegionePageResponseProjection subProjection) {
        return regione____associables((String)null, subProjection);
    }

    public PazienteResponseProjection regione____associables(String alias, RegionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection regione____associables(PazienteRegione____associablesParametrizedInput input, RegionePageResponseProjection subProjection) {
        return regione____associables(null, input, subProjection);
    }

    public PazienteResponseProjection regione____associables(String alias, PazienteRegione____associablesParametrizedInput input, RegionePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection regione_(RegioneResponseProjection subProjection) {
        return regione_(null, subProjection);
    }

    public PazienteResponseProjection regione_(String alias, RegioneResponseProjection subProjection) {
        add$(new GraphQLResponseField("regione_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection ricovero(RicoveroPageResponseProjection subProjection) {
        return ricovero((String)null, subProjection);
    }

    public PazienteResponseProjection ricovero(String alias, RicoveroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("ricovero").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection ricovero(PazienteRicoveroParametrizedInput input, RicoveroPageResponseProjection subProjection) {
        return ricovero(null, input, subProjection);
    }

    public PazienteResponseProjection ricovero(String alias, PazienteRicoveroParametrizedInput input, RicoveroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("ricovero").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sVR_(SVRPageResponseProjection subProjection) {
        return sVR_((String)null, subProjection);
    }

    public PazienteResponseProjection sVR_(String alias, SVRPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sVR_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sVR_(PazienteSVR_ParametrizedInput input, SVRPageResponseProjection subProjection) {
        return sVR_(null, input, subProjection);
    }

    public PazienteResponseProjection sVR_(String alias, PazienteSVR_ParametrizedInput input, SVRPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sVR_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sequenza_genomica___associables(Sequenza_genomicaPageResponseProjection subProjection) {
        return sequenza_genomica___associables((String)null, subProjection);
    }

    public PazienteResponseProjection sequenza_genomica___associables(String alias, Sequenza_genomicaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sequenza_genomica___associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sequenza_genomica___associables(PazienteSequenza_genomica___associablesParametrizedInput input, Sequenza_genomicaPageResponseProjection subProjection) {
        return sequenza_genomica___associables(null, input, subProjection);
    }

    public PazienteResponseProjection sequenza_genomica___associables(String alias, PazienteSequenza_genomica___associablesParametrizedInput input, Sequenza_genomicaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sequenza_genomica___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sequenza_genomica(Sequenza_genomicaPageResponseProjection subProjection) {
        return sequenza_genomica((String)null, subProjection);
    }

    public PazienteResponseProjection sequenza_genomica(String alias, Sequenza_genomicaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sequenza_genomica").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection sequenza_genomica(PazienteSequenza_genomicaParametrizedInput input, Sequenza_genomicaPageResponseProjection subProjection) {
        return sequenza_genomica(null, input, subProjection);
    }

    public PazienteResponseProjection sequenza_genomica(String alias, PazienteSequenza_genomicaParametrizedInput input, Sequenza_genomicaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sequenza_genomica").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection studio_questionario____associables(Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables((String)null, subProjection);
    }

    public PazienteResponseProjection studio_questionario____associables(String alias, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection studio_questionario____associables(PazienteStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario____associables(null, input, subProjection);
    }

    public PazienteResponseProjection studio_questionario____associables(String alias, PazienteStudio_questionario____associablesParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection studio_questionario_(Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario_((String)null, subProjection);
    }

    public PazienteResponseProjection studio_questionario_(String alias, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection studio_questionario_(PazienteStudio_questionario_ParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        return studio_questionario_(null, input, subProjection);
    }

    public PazienteResponseProjection studio_questionario_(String alias, PazienteStudio_questionario_ParametrizedInput input, Studio_questionarioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("studio_questionario_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_ARV(Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV((String)null, subProjection);
    }

    public PazienteResponseProjection terapia_ARV(String alias, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_ARV(PazienteTerapia_ARVParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV(null, input, subProjection);
    }

    public PazienteResponseProjection terapia_ARV(String alias, PazienteTerapia_ARVParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_altro(Terapia_altroPageResponseProjection subProjection) {
        return terapia_altro((String)null, subProjection);
    }

    public PazienteResponseProjection terapia_altro(String alias, Terapia_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_altro").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_altro(PazienteTerapia_altroParametrizedInput input, Terapia_altroPageResponseProjection subProjection) {
        return terapia_altro(null, input, subProjection);
    }

    public PazienteResponseProjection terapia_altro(String alias, PazienteTerapia_altroParametrizedInput input, Terapia_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_altro").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_epatica(Terapia_altroPageResponseProjection subProjection) {
        return terapia_epatica((String)null, subProjection);
    }

    public PazienteResponseProjection terapia_epatica(String alias, Terapia_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_epatica").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection terapia_epatica(PazienteTerapia_epaticaParametrizedInput input, Terapia_altroPageResponseProjection subProjection) {
        return terapia_epatica(null, input, subProjection);
    }

    public PazienteResponseProjection terapia_epatica(String alias, PazienteTerapia_epaticaParametrizedInput input, Terapia_altroPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_epatica").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection trattamento_antitumorale_(Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_((String)null, subProjection);
    }

    public PazienteResponseProjection trattamento_antitumorale_(String alias, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection trattamento_antitumorale_(PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        return trattamento_antitumorale_(null, input, subProjection);
    }

    public PazienteResponseProjection trattamento_antitumorale_(String alias, PazienteTrattamento_antitumorale_ParametrizedInput input, Trattamento_antitumoralePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("trattamento_antitumorale_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection v_dettaglio_(V_dettaglioResponseProjection subProjection) {
        return v_dettaglio_(null, subProjection);
    }

    public PazienteResponseProjection v_dettaglio_(String alias, V_dettaglioResponseProjection subProjection) {
        add$(new GraphQLResponseField("v_dettaglio_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection visita_mpv_(Visita_mpvPageResponseProjection subProjection) {
        return visita_mpv_((String)null, subProjection);
    }

    public PazienteResponseProjection visita_mpv_(String alias, Visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("visita_mpv_").alias(alias).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection visita_mpv_(PazienteVisita_mpv_ParametrizedInput input, Visita_mpvPageResponseProjection subProjection) {
        return visita_mpv_(null, input, subProjection);
    }

    public PazienteResponseProjection visita_mpv_(String alias, PazienteVisita_mpv_ParametrizedInput input, Visita_mpvPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("visita_mpv_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PazienteResponseProjection typename() {
        return typename(null);
    }

    public PazienteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public PazienteResponseProjection deepCopy$() {
        return new PazienteResponseProjection(this);
    }


}
