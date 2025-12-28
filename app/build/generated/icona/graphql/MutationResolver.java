package icona.graphql;


/**
 * Use a Mutation to create, update and delete data.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:45+0100"
)
public interface MutationResolver {

    /**
     * Create an object of class Centro_provenienza.
Returns the newly created object.
     */
    CliCentro_provenienzaDTO Centro_provenienza___create(@javax.validation.constraints.NotNull CliCentro_provenienzaCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Checks.
Returns the newly created object.
     */
    CliChecksDTO Checks___create(@javax.validation.constraints.NotNull CliChecksCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Comorbidita_mpv.
Returns the newly created object.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___create(@javax.validation.constraints.NotNull CliComorbidita_mpvCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class ExcelImporter.
Returns the newly created object.
     */
    CliExcelImporterDTO ExcelImporter___create(@javax.validation.constraints.NotNull CliExcelImporterCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Feedback.
Returns the newly created object.
     */
    CliFeedbackDTO Feedback___create(@javax.validation.constraints.NotNull CliFeedbackCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Gruppo.
Returns the newly created object.
     */
    CliGruppoDTO Gruppo___create(@javax.validation.constraints.NotNull CliGruppoCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Indicazioni_arruolamento_studi.
Returns the newly created object.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___create(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Modalita_somministrazione.
Returns the newly created object.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___create(@javax.validation.constraints.NotNull CliModalita_somministrazioneCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Paziente.
Returns the newly created object.
     */
    CliPazienteDTO Paziente___create(@javax.validation.constraints.NotNull CliPazienteCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class P_Paziente.
Returns the newly created object.
     */
    CliP_PazienteDTO P_Paziente___create(@javax.validation.constraints.NotNull CliP_PazienteCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Sequenza_genomica.
Returns the newly created object.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___create(@javax.validation.constraints.NotNull CliSequenza_genomicaCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Tipo_esame.
Returns the newly created object.
     */
    CliTipo_esameDTO Tipo_esame___create(@javax.validation.constraints.NotNull CliTipo_esameCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class Tipo_visita_mpv.
Returns the newly created object.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___create(@javax.validation.constraints.NotNull CliTipo_visita_mpvCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create an object of class _User.
Returns the newly created object.
     */
    Cli_UserDTO _User___create(@javax.validation.constraints.NotNull Cli_UserCreateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Centro_provenienza.
Returns the newly created object.
     */
    CliCentro_provenienzaDTO Centro_provenienza___update(@javax.validation.constraints.NotNull CliCentro_provenienzaUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Centro_provenienza.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliCentro_provenienzaBulkResultDTO Centro_provenienza___updateBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaUpdateBulkDTO data, @javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Checks.
Returns the newly created object.
     */
    CliChecksDTO Checks___update(@javax.validation.constraints.NotNull CliChecksUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Checks.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliChecksBulkResultDTO Checks___updateBulk(@javax.validation.constraints.NotNull CliChecksUpdateBulkDTO data, @javax.validation.constraints.NotNull CliChecksPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Comorbidita_mpv.
Returns the newly created object.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___update(@javax.validation.constraints.NotNull CliComorbidita_mpvUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Comorbidita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliComorbidita_mpvBulkResultDTO Comorbidita_mpv___updateBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvUpdateBulkDTO data, @javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class ExcelImporter.
Returns the newly created object.
     */
    CliExcelImporterDTO ExcelImporter___update(@javax.validation.constraints.NotNull CliExcelImporterUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class ExcelImporter.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliExcelImporterBulkResultDTO ExcelImporter___updateBulk(@javax.validation.constraints.NotNull CliExcelImporterUpdateBulkDTO data, @javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Feedback.
Returns the newly created object.
     */
    CliFeedbackDTO Feedback___update(@javax.validation.constraints.NotNull CliFeedbackUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Feedback.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliFeedbackBulkResultDTO Feedback___updateBulk(@javax.validation.constraints.NotNull CliFeedbackUpdateBulkDTO data, @javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Gruppo.
Returns the newly created object.
     */
    CliGruppoDTO Gruppo___update(@javax.validation.constraints.NotNull CliGruppoUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Gruppo.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliGruppoBulkResultDTO Gruppo___updateBulk(@javax.validation.constraints.NotNull CliGruppoUpdateBulkDTO data, @javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Indicazioni_arruolamento_studi.
Returns the newly created object.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___update(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Indicazioni_arruolamento_studi.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliIndicazioni_arruolamento_studiBulkResultDTO Indicazioni_arruolamento_studi___updateBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiUpdateBulkDTO data, @javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Modalita_somministrazione.
Returns the newly created object.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___update(@javax.validation.constraints.NotNull CliModalita_somministrazioneUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Modalita_somministrazione.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliModalita_somministrazioneBulkResultDTO Modalita_somministrazione___updateBulk(@javax.validation.constraints.NotNull CliModalita_somministrazioneUpdateBulkDTO data, @javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Paziente.
Returns the newly created object.
     */
    CliPazienteDTO Paziente___update(@javax.validation.constraints.NotNull CliPazienteUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliPazienteBulkResultDTO Paziente___updateBulk(@javax.validation.constraints.NotNull CliPazienteUpdateBulkDTO data, @javax.validation.constraints.NotNull CliPazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class P_Paziente.
Returns the newly created object.
     */
    CliP_PazienteDTO P_Paziente___update(@javax.validation.constraints.NotNull CliP_PazienteUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class P_Paziente.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliP_PazienteBulkResultDTO P_Paziente___updateBulk(@javax.validation.constraints.NotNull CliP_PazienteUpdateBulkDTO data, @javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Sequenza_genomica.
Returns the newly created object.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___update(@javax.validation.constraints.NotNull CliSequenza_genomicaUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Sequenza_genomica.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliSequenza_genomicaBulkResultDTO Sequenza_genomica___updateBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaUpdateBulkDTO data, @javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of singleton class Settings_PRO.
Returns the newly created object.
     */
    CliSettings_PRODTO Settings_PRO___update(@javax.validation.constraints.NotNull CliSettings_PROUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Tipo_esame.
Returns the newly created object.
     */
    CliTipo_esameDTO Tipo_esame___update(@javax.validation.constraints.NotNull CliTipo_esameUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Tipo_esame.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliTipo_esameBulkResultDTO Tipo_esame___updateBulk(@javax.validation.constraints.NotNull CliTipo_esameUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class Tipo_visita_mpv.
Returns the newly created object.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___update(@javax.validation.constraints.NotNull CliTipo_visita_mpvUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class Tipo_visita_mpv.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    CliTipo_visita_mpvBulkResultDTO Tipo_visita_mpv___updateBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvUpdateBulkDTO data, @javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of singleton class User_message.
Returns the newly created object.
     */
    CliUser_messageDTO User_message___update(@javax.validation.constraints.NotNull CliUser_messageUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Update an object of class _User.
Returns the newly created object.
     */
    Cli_UserDTO _User___update(@javax.validation.constraints.NotNull Cli_UserUpdateDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Bulk update a set of objects of class _User.
Returns an array of updated objects and a number representing the total count of items affected.
     */
    Cli_UserBulkResultDTO _User___updateBulk(@javax.validation.constraints.NotNull Cli_UserUpdateBulkDTO data, @javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Centro_provenienza.
Returns the newly created/updated object.
     */
    CliCentro_provenienzaDTO Centro_provenienza___save(@javax.validation.constraints.NotNull CliCentro_provenienzaDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Checks.
Returns the newly created/updated object.
     */
    CliChecksDTO Checks___save(@javax.validation.constraints.NotNull CliChecksDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Comorbidita_mpv.
Returns the newly created/updated object.
     */
    CliComorbidita_mpvDTO Comorbidita_mpv___save(@javax.validation.constraints.NotNull CliComorbidita_mpvDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class ExcelImporter.
Returns the newly created/updated object.
     */
    CliExcelImporterDTO ExcelImporter___save(@javax.validation.constraints.NotNull CliExcelImporterDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Feedback.
Returns the newly created/updated object.
     */
    CliFeedbackDTO Feedback___save(@javax.validation.constraints.NotNull CliFeedbackDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Gruppo.
Returns the newly created/updated object.
     */
    CliGruppoDTO Gruppo___save(@javax.validation.constraints.NotNull CliGruppoDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Indicazioni_arruolamento_studi.
Returns the newly created/updated object.
     */
    CliIndicazioni_arruolamento_studiDTO Indicazioni_arruolamento_studi___save(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Modalita_somministrazione.
Returns the newly created/updated object.
     */
    CliModalita_somministrazioneDTO Modalita_somministrazione___save(@javax.validation.constraints.NotNull CliModalita_somministrazioneDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Paziente.
Returns the newly created/updated object.
     */
    CliPazienteDTO Paziente___save(@javax.validation.constraints.NotNull CliPazienteDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class P_Paziente.
Returns the newly created/updated object.
     */
    CliP_PazienteDTO P_Paziente___save(@javax.validation.constraints.NotNull CliP_PazienteDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Sequenza_genomica.
Returns the newly created/updated object.
     */
    CliSequenza_genomicaDTO Sequenza_genomica___save(@javax.validation.constraints.NotNull CliSequenza_genomicaDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Tipo_esame.
Returns the newly created/updated object.
     */
    CliTipo_esameDTO Tipo_esame___save(@javax.validation.constraints.NotNull CliTipo_esameDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class Tipo_visita_mpv.
Returns the newly created/updated object.
     */
    CliTipo_visita_mpvDTO Tipo_visita_mpv___save(@javax.validation.constraints.NotNull CliTipo_visita_mpvDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Create or update an object of class _User.
Returns the newly created/updated object.
     */
    Cli_UserDTO _User___save(@javax.validation.constraints.NotNull Cli_UserDraftDTO data, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * Delete an object of class Centro_provenienza.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Centro_provenienza___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Centro_provenienza.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Centro_provenienza___deleteBulk(@javax.validation.constraints.NotNull CliCentro_provenienzaPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Checks.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Checks___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Checks.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Checks___deleteBulk(@javax.validation.constraints.NotNull CliChecksPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Comorbidita_mpv.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Comorbidita_mpv___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Comorbidita_mpv.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Comorbidita_mpv___deleteBulk(@javax.validation.constraints.NotNull CliComorbidita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class ExcelImporter.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO ExcelImporter___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class ExcelImporter.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO ExcelImporter___deleteBulk(@javax.validation.constraints.NotNull CliExcelImporterPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Feedback.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Feedback___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Feedback.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Feedback___deleteBulk(@javax.validation.constraints.NotNull CliFeedbackPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Gruppo.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Gruppo___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Gruppo.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Gruppo___deleteBulk(@javax.validation.constraints.NotNull CliGruppoPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Indicazioni_arruolamento_studi.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Indicazioni_arruolamento_studi___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Indicazioni_arruolamento_studi.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Indicazioni_arruolamento_studi___deleteBulk(@javax.validation.constraints.NotNull CliIndicazioni_arruolamento_studiPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Modalita_somministrazione.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Modalita_somministrazione___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Modalita_somministrazione.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Modalita_somministrazione___deleteBulk(@javax.validation.constraints.NotNull CliModalita_somministrazionePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Paziente.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Paziente___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Paziente.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Paziente___deleteBulk(@javax.validation.constraints.NotNull CliPazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class P_Paziente.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO P_Paziente___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class P_Paziente.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO P_Paziente___deleteBulk(@javax.validation.constraints.NotNull CliP_PazientePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Sequenza_genomica.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Sequenza_genomica___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Sequenza_genomica.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Sequenza_genomica___deleteBulk(@javax.validation.constraints.NotNull CliSequenza_genomicaPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Tipo_esame.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Tipo_esame___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Tipo_esame.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Tipo_esame___deleteBulk(@javax.validation.constraints.NotNull CliTipo_esamePageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class Tipo_visita_mpv.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO Tipo_visita_mpv___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class Tipo_visita_mpv.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO Tipo_visita_mpv___deleteBulk(@javax.validation.constraints.NotNull CliTipo_visita_mpvPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Delete an object of class _User.
Returns true if the object has been deleted successfully.
     */
    CliDeleteResultDTO _User___delete(@javax.validation.constraints.NotNull String _id, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * Bulk delete a set of objects of class _User.
Returns the number of object successfully deleted.
     */
    CliDeleteBulkResultDTO _User___deleteBulk(@javax.validation.constraints.NotNull Cli_UserPageOptionsDTO options, CliForceWarningsDTO forceWarnings) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on an object of class Paziente.
     */
    CliPazienteFormActionHandlerResultDTO Paziente___formAction___importaQuestionariPRO(CliPazienteDraftDTO data, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on a new object of class Paziente.
     */
    CliPazienteFormActionHandlerResultDTO Paziente___create___formAction___importaQuestionariPRO(CliPazienteDraftCreateDTO data, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named importaQuestionariPRO on an existing object of class Paziente.
     */
    CliPazienteFormActionHandlerResultDTO Paziente___update___formAction___importaQuestionariPRO(CliPazienteDraftUpdateDTO data, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on an object of class P_Paziente.
     */
    CliP_PazienteFormActionHandlerResultDTO P_Paziente___formAction___generaCodicePride(CliP_PazienteDraftDTO data, @javax.validation.constraints.NotNull CliGenera_codice_internoDraftDTO formParam, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on a new object of class P_Paziente.
     */
    CliP_PazienteFormActionHandlerResultDTO P_Paziente___create___formAction___generaCodicePride(CliP_PazienteDraftCreateDTO data, @javax.validation.constraints.NotNull CliGenera_codice_internoDraftCreateDTO formParam, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    /**
     * BETA: this service is still in beta. It can change in future releases.
Invoke the form action handler named generaCodicePride on an existing object of class P_Paziente.
     */
    CliP_PazienteFormActionHandlerResultDTO P_Paziente___update___formAction___generaCodicePride(CliP_PazienteDraftUpdateDTO data, @javax.validation.constraints.NotNull CliGenera_codice_internoDraftDTO formParam, String jsonParam, CliForceWarningsDTO forceWarnings, CliInsightTypeDTO insight, Boolean disableCache) throws Exception;

    CliLockStatusResultDTO lock(@javax.validation.constraints.NotNull java.util.List<CliEntityIDDTO> locks, Integer minutes) throws Exception;

    CliLockStatusResultDTO unlock(@javax.validation.constraints.NotNull java.util.List<CliEntityIDDTO> locks) throws Exception;

}
