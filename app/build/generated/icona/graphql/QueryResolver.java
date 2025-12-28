package icona.graphql;


/**
 * Use a Query to fetch data.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface QueryResolver {

    /**
     * Retrieve a single object of class Centro_provenienza by ID.
     */
    CliCentro_provenienzaDTO Centro_provenienza___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Centro_provenienza by uniques.
     */
    CliCentro_provenienzaDTO Centro_provenienza___getByCod(int cod, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Centro_provenienza by uniques.
     */
    CliCentro_provenienzaDTO Centro_provenienza___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Centro_provenienza.
     */
    CliCentro_provenienzaPageDTO Centro_provenienza___getPage(CliCentro_provenienzaPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Checks by ID.
     */
    CliChecksDTO Checks___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Checks.
     */
    CliChecksPageDTO Checks___getPage(CliChecksPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Comorbidita_mpv by ID.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Comorbidita_mpv.
     */
    CliComorbidita_mpvPageDTO Comorbidita_mpv___getPage(CliComorbidita_mpvPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class ExcelImporter by ID.
     */
    CliExcelImporterDTO ExcelImporter___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class ExcelImporter.
     */
    CliExcelImporterPageDTO ExcelImporter___getPage(CliExcelImporterPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Feedback by ID.
     */
    CliFeedbackDTO Feedback___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Feedback.
     */
    CliFeedbackPageDTO Feedback___getPage(CliFeedbackPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Gruppo by ID.
     */
    CliGruppoDTO Gruppo___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Gruppo by uniques.
     */
    CliGruppoDTO Gruppo___getByCod(int cod, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Gruppo by uniques.
     */
    CliGruppoDTO Gruppo___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Gruppo.
     */
    CliGruppoPageDTO Gruppo___getPage(CliGruppoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Indicazioni_arruolamento_studi by ID.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Indicazioni_arruolamento_studi.
     */
    CliIndicazioni_arruolamento_studiPageDTO Indicazioni_arruolamento_studi___getPage(CliIndicazioni_arruolamento_studiPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Modalita_somministrazione by ID.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Modalita_somministrazione by uniques.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___getByCod(int cod, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Modalita_somministrazione by uniques.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Modalita_somministrazione.
     */
    CliModalita_somministrazionePageDTO Modalita_somministrazione___getPage(CliModalita_somministrazionePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Paziente by ID.
     */
    CliPazienteDTO Paziente___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Paziente by uniques.
     */
    CliPazienteDTO Paziente___getByCodice_interno(@javax.validation.constraints.NotNull String codice_interno, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Paziente by uniques.
     */
    CliPazienteDTO Paziente___getById_paziente(int id_paziente, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Paziente.
     */
    CliPazientePageDTO Paziente___getPage(CliPazientePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class P_Paziente by ID.
     */
    CliP_PazienteDTO P_Paziente___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class P_Paziente.
     */
    CliP_PazientePageDTO P_Paziente___getPage(CliP_PazientePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Sequenza_genomica by ID.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Sequenza_genomica.
     */
    CliSequenza_genomicaPageDTO Sequenza_genomica___getPage(CliSequenza_genomicaPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Tipo_esame by ID.
     */
    CliTipo_esameDTO Tipo_esame___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Tipo_esame by uniques.
     */
    CliTipo_esameDTO Tipo_esame___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Tipo_esame.
     */
    CliTipo_esamePageDTO Tipo_esame___getPage(CliTipo_esamePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Tipo_visita_mpv by ID.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Tipo_visita_mpv by uniques.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___getByCod(int cod, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Tipo_visita_mpv by uniques.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___getByNome(@javax.validation.constraints.NotNull String nome, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Tipo_visita_mpv.
     */
    CliTipo_visita_mpvPageDTO Tipo_visita_mpv___getPage(CliTipo_visita_mpvPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class _User by ID.
     */
    Cli_UserDTO _User___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class _User.
     */
    Cli_UserPageDTO _User___getPage(Cli_UserPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Anamnesi by ID.
     */
    CliAnamnesiDTO Anamnesi___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Anamnesi.
     */
    CliAnamnesiPageDTO Anamnesi___getPage(CliAnamnesiPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Controllo_clinico by ID.
     */
    CliControllo_clinicoDTO Controllo_clinico___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Controllo_clinico.
     */
    CliControllo_clinicoPageDTO Controllo_clinico___getPage(CliControllo_clinicoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Dropout by ID.
     */
    CliDropoutDTO Dropout___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Dropout.
     */
    CliDropoutPageDTO Dropout___getPage(CliDropoutPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Esame_strumentale by ID.
     */
    CliEsame_strumentaleDTO Esame_strumentale___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Esame_strumentale.
     */
    CliEsame_strumentalePageDTO Esame_strumentale___getPage(CliEsame_strumentalePageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Evento by ID.
     */
    CliEventoDTO Evento___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Evento.
     */
    CliEventoPageDTO Evento___getPage(CliEventoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Evento_epatico by ID.
     */
    CliEvento_epaticoDTO Evento_epatico___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Evento_epatico.
     */
    CliEvento_epaticoPageDTO Evento_epatico___getPage(CliEvento_epaticoPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Gravidanza by ID.
     */
    CliGravidanzaDTO Gravidanza___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Gravidanza.
     */
    CliGravidanzaPageDTO Gravidanza___getPage(CliGravidanzaPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Markers_HBV by ID.
     */
    CliMarkers_HBVDTO Markers_HBV___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Markers_HBV.
     */
    CliMarkers_HBVPageDTO Markers_HBV___getPage(CliMarkers_HBVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Markers_HCV by ID.
     */
    CliMarkers_HCVDTO Markers_HCV___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Markers_HCV.
     */
    CliMarkers_HCVPageDTO Markers_HCV___getPage(CliMarkers_HCVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Markers_HIV by ID.
     */
    CliMarkers_HIVDTO Markers_HIV___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Markers_HIV.
     */
    CliMarkers_HIVPageDTO Markers_HIV___getPage(CliMarkers_HIVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Ricovero by ID.
     */
    CliRicoveroDTO Ricovero___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Ricovero.
     */
    CliRicoveroPageDTO Ricovero___getPage(CliRicoveroPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Terapia_altro by ID.
     */
    CliTerapia_altroDTO Terapia_altro___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Terapia_altro.
     */
    CliTerapia_altroPageDTO Terapia_altro___getPage(CliTerapia_altroPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a single object of class Terapia_ARV by ID.
     */
    CliTerapia_ARVDTO Terapia_ARV___get(@javax.validation.constraints.NotNull String _id, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a collection of object of class Terapia_ARV.
     */
    CliTerapia_ARVPageDTO Terapia_ARV___getPage(CliTerapia_ARVPageOptionsDTO options, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve the object of singleton class Settings_PRO
     */
    CliSettings_PRODTO Settings_PRO___get(CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve the object of singleton class User_message
     */
    CliUser_messageDTO User_message___get(CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Retrieve a preview object of class Centro_provenienza for an updated instance of Centro_provenienza.
     */
    CliCentro_provenienzaDTO Centro_provenienza___previewUpdate(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Checks for an updated instance of Checks.
     */
    CliChecksDTO Checks___previewUpdate(@javax.validation.constraints.NotNull CliChecksDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Comorbidita_mpv for an updated instance of Comorbidita_mpv.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___previewUpdate(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class ExcelImporter for an updated instance of ExcelImporter.
     */
    CliExcelImporterDTO ExcelImporter___previewUpdate(@javax.validation.constraints.NotNull CliExcelImporterDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Feedback for an updated instance of Feedback.
     */
    CliFeedbackDTO Feedback___previewUpdate(@javax.validation.constraints.NotNull CliFeedbackDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Gruppo for an updated instance of Gruppo.
     */
    CliGruppoDTO Gruppo___previewUpdate(@javax.validation.constraints.NotNull CliGruppoDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Indicazioni_arruolamento_studi for an updated instance of Indicazioni_arruolamento_studi.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___previewUpdate(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Modalita_somministrazione for an updated instance of Modalita_somministrazione.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___previewUpdate(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Paziente for an updated instance of Paziente.
     */
    CliPazienteDTO Paziente___previewUpdate(@javax.validation.constraints.NotNull CliPazienteDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class P_Paziente for an updated instance of P_Paziente.
     */
    CliP_PazienteDTO P_Paziente___previewUpdate(@javax.validation.constraints.NotNull CliP_PazienteDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Sequenza_genomica for an updated instance of Sequenza_genomica.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___previewUpdate(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of singleton class Settings_PRO for an updated instance of Settings_PRO.
     */
    CliSettings_PRODTO Settings_PRO___previewUpdate(@javax.validation.constraints.NotNull CliSettings_PRODraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_esame for an updated instance of Tipo_esame.
     */
    CliTipo_esameDTO Tipo_esame___previewUpdate(@javax.validation.constraints.NotNull CliTipo_esameDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_visita_mpv for an updated instance of Tipo_visita_mpv.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___previewUpdate(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of singleton class User_message for an updated instance of User_message.
     */
    CliUser_messageDTO User_message___previewUpdate(@javax.validation.constraints.NotNull CliUser_messageDraftUpdateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class _User for an updated instance of _User.
     */
    Cli_UserDTO _User___previewUpdate(@javax.validation.constraints.NotNull Cli_UserDraftUpdateDTO data) throws Exception;

    /**
     * Validation of an update on object of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateUpdate(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateUpdateBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validateUpdate(@javax.validation.constraints.NotNull CliChecksDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validateUpdateBulk(@javax.validation.constraints.NotNull CliChecksDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliChecksPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateUpdate(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateUpdateBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateUpdate(@javax.validation.constraints.NotNull CliExcelImporterDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateUpdateBulk(@javax.validation.constraints.NotNull CliExcelImporterDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateUpdate(@javax.validation.constraints.NotNull CliFeedbackDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateUpdateBulk(@javax.validation.constraints.NotNull CliFeedbackDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateUpdate(@javax.validation.constraints.NotNull CliGruppoDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateUpdateBulk(@javax.validation.constraints.NotNull CliGruppoDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateUpdate(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateUpdateBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateUpdate(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateUpdateBulk(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateUpdate(@javax.validation.constraints.NotNull CliPazienteDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateUpdateBulk(@javax.validation.constraints.NotNull CliPazienteDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliPazientePageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateUpdate(@javax.validation.constraints.NotNull CliP_PazienteDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateUpdateBulk(@javax.validation.constraints.NotNull CliP_PazienteDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateUpdate(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateUpdateBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of singleton class Settings_PRO.
Returns a ValidationResult.
     */
    CliValidationResultDTO Settings_PRO___validateUpdate(@javax.validation.constraints.NotNull CliSettings_PRODraftUpdateDTO data) throws Exception;

    /**
     * Validation of an update on object of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateUpdate(@javax.validation.constraints.NotNull CliTipo_esameDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateUpdateBulk(@javax.validation.constraints.NotNull CliTipo_esameDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateUpdate(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateUpdateBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options) throws Exception;

    /**
     * Validation of an update on object of singleton class User_message.
Returns a ValidationResult.
     */
    CliValidationResultDTO User_message___validateUpdate(@javax.validation.constraints.NotNull CliUser_messageDraftUpdateDTO data) throws Exception;

    /**
     * Validation of an update on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateUpdate(@javax.validation.constraints.NotNull Cli_UserDraftUpdateDTO data) throws Exception;

    /**
     * Validation of a bulk update on a set of objects of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateUpdateBulk(@javax.validation.constraints.NotNull Cli_UserDraftUpdateBulkDTO data, @javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options) throws Exception;

    /**
     * Validation of a save on object of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validate(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validate(@javax.validation.constraints.NotNull CliChecksDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validate(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validate(@javax.validation.constraints.NotNull CliExcelImporterDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validate(@javax.validation.constraints.NotNull CliFeedbackDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validate(@javax.validation.constraints.NotNull CliGruppoDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validate(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validate(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validate(@javax.validation.constraints.NotNull CliPazienteDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validate(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validate(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validate(@javax.validation.constraints.NotNull CliTipo_esameDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validate(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftDTO data) throws Exception;

    /**
     * Validation of a save on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validate(@javax.validation.constraints.NotNull Cli_UserDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Centro_provenienza for an object of Centro_provenienza not yet instanced.
     */
    CliCentro_provenienzaDTO Centro_provenienza___preview(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Checks for an object of Checks not yet instanced.
     */
    CliChecksDTO Checks___preview(@javax.validation.constraints.NotNull CliChecksDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Comorbidita_mpv for an object of Comorbidita_mpv not yet instanced.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___preview(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class ExcelImporter for an object of ExcelImporter not yet instanced.
     */
    CliExcelImporterDTO ExcelImporter___preview(@javax.validation.constraints.NotNull CliExcelImporterDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
     */
    CliFeedbackDTO Feedback___preview(@javax.validation.constraints.NotNull CliFeedbackDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Gruppo for an object of Gruppo not yet instanced.
     */
    CliGruppoDTO Gruppo___preview(@javax.validation.constraints.NotNull CliGruppoDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Indicazioni_arruolamento_studi for an object of Indicazioni_arruolamento_studi not yet instanced.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___preview(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Modalita_somministrazione for an object of Modalita_somministrazione not yet instanced.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___preview(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
     */
    CliPazienteDTO Paziente___preview(@javax.validation.constraints.NotNull CliPazienteDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class P_Paziente for an object of P_Paziente not yet instanced.
     */
    CliP_PazienteDTO P_Paziente___preview(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Sequenza_genomica for an object of Sequenza_genomica not yet instanced.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___preview(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
     */
    CliTipo_esameDTO Tipo_esame___preview(@javax.validation.constraints.NotNull CliTipo_esameDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_visita_mpv for an object of Tipo_visita_mpv not yet instanced.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___preview(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of class _User for an object of _User not yet instanced.
     */
    Cli_UserDTO _User___preview(@javax.validation.constraints.NotNull Cli_UserDraftDTO data) throws Exception;

    /**
     * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
Note that the passed param should NOT have the _id attribute
     */
    CliGenera_codice_internoDTO Genera_codice_interno___preview(@javax.validation.constraints.NotNull CliGenera_codice_internoDraftDTO data) throws Exception;

    /**
     * Validation of a create on object of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateCreate(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validateCreate(@javax.validation.constraints.NotNull CliChecksDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateCreate(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateCreate(@javax.validation.constraints.NotNull CliExcelImporterDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateCreate(@javax.validation.constraints.NotNull CliFeedbackDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateCreate(@javax.validation.constraints.NotNull CliGruppoDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateCreate(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateCreate(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateCreate(@javax.validation.constraints.NotNull CliPazienteDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateCreate(@javax.validation.constraints.NotNull CliP_PazienteDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateCreate(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateCreate(@javax.validation.constraints.NotNull CliTipo_esameDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateCreate(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftCreateDTO data) throws Exception;

    /**
     * Validation of a create on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateCreate(@javax.validation.constraints.NotNull Cli_UserDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Centro_provenienza for an object of Centro_provenienza not yet instanced.
     */
    CliCentro_provenienzaDTO Centro_provenienza___previewCreate(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Checks for an object of Checks not yet instanced.
     */
    CliChecksDTO Checks___previewCreate(@javax.validation.constraints.NotNull CliChecksDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Comorbidita_mpv for an object of Comorbidita_mpv not yet instanced.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___previewCreate(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class ExcelImporter for an object of ExcelImporter not yet instanced.
     */
    CliExcelImporterDTO ExcelImporter___previewCreate(@javax.validation.constraints.NotNull CliExcelImporterDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Feedback for an object of Feedback not yet instanced.
     */
    CliFeedbackDTO Feedback___previewCreate(@javax.validation.constraints.NotNull CliFeedbackDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of form class Genera_codice_interno for an object of Genera_codice_interno not yet instanced.
     */
    CliGenera_codice_internoDTO Genera_codice_interno___previewCreate(@javax.validation.constraints.NotNull CliGenera_codice_internoDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Gruppo for an object of Gruppo not yet instanced.
     */
    CliGruppoDTO Gruppo___previewCreate(@javax.validation.constraints.NotNull CliGruppoDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Indicazioni_arruolamento_studi for an object of Indicazioni_arruolamento_studi not yet instanced.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___previewCreate(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Modalita_somministrazione for an object of Modalita_somministrazione not yet instanced.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___previewCreate(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Paziente for an object of Paziente not yet instanced.
     */
    CliPazienteDTO Paziente___previewCreate(@javax.validation.constraints.NotNull CliPazienteDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class P_Paziente for an object of P_Paziente not yet instanced.
     */
    CliP_PazienteDTO P_Paziente___previewCreate(@javax.validation.constraints.NotNull CliP_PazienteDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Sequenza_genomica for an object of Sequenza_genomica not yet instanced.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___previewCreate(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_esame for an object of Tipo_esame not yet instanced.
     */
    CliTipo_esameDTO Tipo_esame___previewCreate(@javax.validation.constraints.NotNull CliTipo_esameDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class Tipo_visita_mpv for an object of Tipo_visita_mpv not yet instanced.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___previewCreate(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftCreateDTO data) throws Exception;

    /**
     * Retrieve a preview object of class _User for an object of _User not yet instanced.
     */
    Cli_UserDTO _User___previewCreate(@javax.validation.constraints.NotNull Cli_UserDraftCreateDTO data) throws Exception;

    /**
     * Validation of a delete on object of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Centro_provenienza.
Returns a ValidationResult.
     */
    CliValidationResultDTO Centro_provenienza___validateDeleteBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Checks.
Returns a ValidationResult.
     */
    CliValidationResultDTO Checks___validateDeleteBulk(@javax.validation.constraints.NotNull CliChecksPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Comorbidita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Comorbidita_mpv___validateDeleteBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class ExcelImporter.
Returns a ValidationResult.
     */
    CliValidationResultDTO ExcelImporter___validateDeleteBulk(@javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Feedback.
Returns a ValidationResult.
     */
    CliValidationResultDTO Feedback___validateDeleteBulk(@javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Gruppo.
Returns a ValidationResult.
     */
    CliValidationResultDTO Gruppo___validateDeleteBulk(@javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Indicazioni_arruolamento_studi.
Returns a ValidationResult.
     */
    CliValidationResultDTO Indicazioni_arruolamento_studi___validateDeleteBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Modalita_somministrazione.
Returns a ValidationResult.
     */
    CliValidationResultDTO Modalita_somministrazione___validateDeleteBulk(@javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO Paziente___validateDeleteBulk(@javax.validation.constraints.NotNull CliPazientePageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class P_Paziente.
Returns a ValidationResult.
     */
    CliValidationResultDTO P_Paziente___validateDeleteBulk(@javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Sequenza_genomica.
Returns a ValidationResult.
     */
    CliValidationResultDTO Sequenza_genomica___validateDeleteBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Tipo_esame.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_esame___validateDeleteBulk(@javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class Tipo_visita_mpv.
Returns a ValidationResult.
     */
    CliValidationResultDTO Tipo_visita_mpv___validateDeleteBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options) throws Exception;

    /**
     * Validation of a delete on object of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateDelete(@javax.validation.constraints.NotNull String _id) throws Exception;

    /**
     * Validation of a bulk delete on a set of objects of class _User.
Returns a ValidationResult.
     */
    CliValidationResultDTO _User___validateDeleteBulk(@javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options) throws Exception;

}
