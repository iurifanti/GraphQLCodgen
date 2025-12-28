package icona.graphql;


/**
 * Resolver for Paziente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public interface PazienteResolver {

    /**
     * The associable objects for the role campione_old.
     */
    CliCampione_oldPageDTO campione_old___associables(CliPazienteDTO paziente, CliCampione_oldPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role campione_old.
     */
    CliCampione_oldPageDTO campione_old(CliPazienteDTO paziente, CliCampione_oldPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role centro_appartenenza_attuale.
     */
    CliCentroPageDTO centro_appartenenza_attuale___associables(CliPazienteDTO paziente, CliCentroPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role checks_.
     */
    CliChecksPageDTO checks____associables(CliPazienteDTO paziente, CliChecksPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role checks_.
     */
    CliChecksPageDTO checks_(CliPazienteDTO paziente, CliChecksPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role codice_studio_.
     */
    CliCodice_studioPageDTO codice_studio_(CliPazienteDTO paziente, CliCodice_studioPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role condizione_lavorativa.
     */
    CliCondizione_lavorativaPageDTO condizione_lavorativa___associables(CliPazienteDTO paziente, CliCondizione_lavorativaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role controllo_clinico.
     */
    CliControllo_clinicoPageDTO controllo_clinico(CliPazienteDTO paziente, CliControllo_clinicoPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role dropout.
     */
    CliDropoutPageDTO dropout(CliPazienteDTO paziente, CliDropoutPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role esame_strumentale_.
     */
    CliEsame_strumentalePageDTO esame_strumentale_(CliPazienteDTO paziente, CliEsame_strumentalePageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role etnia.
     */
    CliEtniaPageDTO etnia___associables(CliPazienteDTO paziente, CliEtniaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role evento.
     */
    CliEventoPageDTO evento(CliPazienteDTO paziente, CliEventoPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role evento_epatico_.
     */
    CliEvento_epaticoPageDTO evento_epatico_(CliPazienteDTO paziente, CliEvento_epaticoPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role fattore_di_rischio.
     */
    CliFattore_di_rischioPageDTO fattore_di_rischio___associables(CliPazienteDTO paziente, CliFattore_di_rischioPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role gilbert_.
     */
    CliGilbertPageDTO gilbert____associables(CliPazienteDTO paziente, CliGilbertPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role gravidanza_.
     */
    CliGravidanzaPageDTO gravidanza_(CliPazienteDTO paziente, CliGravidanzaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role identita_genere_.
     */
    CliIdentita_generePageDTO identita_genere____associables(CliPazienteDTO paziente, CliIdentita_generePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role l_dettaglio_.
     */
    CliL_dettaglioPageDTO l_dettaglio_(CliPazienteDTO paziente, CliL_dettaglioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_HBV.
     */
    CliMarkers_HBVPageDTO markers_HBV(CliPazienteDTO paziente, CliMarkers_HBVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_HCV.
     */
    CliMarkers_HCVPageDTO markers_HCV(CliPazienteDTO paziente, CliMarkers_HCVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_HDV_.
     */
    CliMarkers_HDVPageDTO markers_HDV_(CliPazienteDTO paziente, CliMarkers_HDVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_HIV.
     */
    CliMarkers_HIVPageDTO markers_HIV(CliPazienteDTO paziente, CliMarkers_HIVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role markers_altri_.
     */
    CliMarkers_altriPageDTO markers_altri_(CliPazienteDTO paziente, CliMarkers_altriPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role nazione_.
     */
    CliNazionePageDTO nazione____associables(CliPazienteDTO paziente, CliNazionePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role questionario_PRO_.
     */
    CliQuestionario_PROPageDTO questionario_PRO_(CliPazienteDTO paziente, CliQuestionario_PROPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role questionario_PRO_app.
     */
    CliQuestionario_PRO_appPageDTO questionario_PRO_app(CliPazienteDTO paziente, CliQuestionario_PRO_appPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role regione_.
     */
    CliRegionePageDTO regione____associables(CliPazienteDTO paziente, CliRegionePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role ricovero.
     */
    CliRicoveroPageDTO ricovero(CliPazienteDTO paziente, CliRicoveroPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role sVR_.
     */
    CliSVRPageDTO sVR_(CliPazienteDTO paziente, CliSVRPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role sequenza_genomica.
     */
    CliSequenza_genomicaPageDTO sequenza_genomica___associables(CliPazienteDTO paziente, CliSequenza_genomicaPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role sequenza_genomica.
     */
    CliSequenza_genomicaPageDTO sequenza_genomica(CliPazienteDTO paziente, CliSequenza_genomicaPageOptionsDTO options) throws Exception;

    /**
     * The associable objects for the role studio_questionario_.
     */
    CliStudio_questionarioPageDTO studio_questionario____associables(CliPazienteDTO paziente, CliStudio_questionarioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role studio_questionario_.
     */
    CliStudio_questionarioPageDTO studio_questionario_(CliPazienteDTO paziente, CliStudio_questionarioPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role terapia_ARV.
     */
    CliTerapia_ARVPageDTO terapia_ARV(CliPazienteDTO paziente, CliTerapia_ARVPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role terapia_altro.
     */
    CliTerapia_altroPageDTO terapia_altro(CliPazienteDTO paziente, CliTerapia_altroPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role terapia_epatica.
     */
    CliTerapia_altroPageDTO terapia_epatica(CliPazienteDTO paziente, CliTerapia_altroPageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role trattamento_antitumorale_.
     */
    CliTrattamento_antitumoralePageDTO trattamento_antitumorale_(CliPazienteDTO paziente, CliTrattamento_antitumoralePageOptionsDTO options) throws Exception;

    /**
     * The associated objects for the role visita_mpv_.
     */
    CliVisita_mpvPageDTO visita_mpv_(CliPazienteDTO paziente, CliVisita_mpvPageOptionsDTO options) throws Exception;

}
